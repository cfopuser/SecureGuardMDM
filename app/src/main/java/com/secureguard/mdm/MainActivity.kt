package com.secureguard.mdm

import android.Manifest
import android.app.admin.DevicePolicyManager
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect // <-- FIX
import androidx.compose.ui.res.stringResource
import androidx.compose.runtime.getValue      // <-- FIX
import androidx.compose.runtime.mutableStateOf  // <-- FIX
import androidx.compose.runtime.remember      // <-- FIX
import androidx.compose.runtime.setValue      // <-- FIX
import androidx.compose.ui.Modifier
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import com.secureguard.mdm.data.repository.SettingsRepository
import com.secureguard.mdm.kiosk.ui.KioskActivity
import com.secureguard.mdm.ui.navigation.AppNavigation
import com.secureguard.mdm.ui.theme.SecureGuardTheme
import com.secureguard.mdm.utils.SecureUpdateHelper
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var secureUpdateHelper: SecureUpdateHelper

    @Inject
    lateinit var settingsRepository: SettingsRepository

    @Inject
    lateinit var dpm: DevicePolicyManager

    private val writeSettingsLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        Log.d("MainActivity", "Returned from WRITE_SETTINGS screen.")
    }

    private val requestPermissionLauncher =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted: Boolean ->
            if (isGranted) {
                Log.d("MainActivity", "FOREGROUND_SERVICE_SPECIAL_USE permission granted.")
            } else {
                Log.w("MainActivity", "FOREGROUND_SERVICE_SPECIAL_USE permission was denied.")
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            val startDestinationOverride = intent.getStringExtra("start_destination")
            if (startDestinationOverride == null && settingsRepository.isKioskModeEnabled()) {
                val kioskIntent = Intent(this@MainActivity, KioskActivity::class.java)
                startActivity(kioskIntent)
                finish()
                return@launch
            }

            if (!secureUpdateHelper.coreComponentExists()) {
                throw RuntimeException("Core validation component is missing or corrupted. Halting execution.")
            }

            requestSpecialUsePermission()

            // Check for NetGuard upgrade scenario
            val shouldShowNetGuardDialog = checkForNetGuardUpgrade()

            setContent {
                SecureGuardTheme {
                    // --- NEW: State to control the dialog visibility ---
                    var showNetGuardDialog by remember { mutableStateOf(shouldShowNetGuardDialog) }

                    // --- NEW: Check for permission and update state ---
                    LaunchedEffect(Unit) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                            if (!Settings.System.canWrite(this@MainActivity) && dpm.isDeviceOwnerApp(packageName)) {
                                val intent = Intent(
                                    Settings.ACTION_MANAGE_WRITE_SETTINGS,
                                    Uri.parse("package:$packageName")
                                )
                                writeSettingsLauncher.launch(intent)
                            }
                        }
                    }

                    val isFromKiosk = intent.getBooleanExtra("is_from_kiosk", false)
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        AppNavigation(
                            startDestinationOverride = startDestinationOverride,
                            isFromKiosk = isFromKiosk
                        )

                        // --- WRITE_SETTINGS is requested via system screen ---

                        if (showNetGuardDialog) {
                            NetGuardUpgradeDialog(
                                onDismiss = { showNetGuardDialog = false },
                                onUninstall = {
                                    showNetGuardDialog = false
                                    uninstallNetGuard()
                                }
                            )
                        }
                    }
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!Settings.System.canWrite(this) && dpm.isDeviceOwnerApp(packageName)) {
                val intent = Intent(
                    Settings.ACTION_MANAGE_WRITE_SETTINGS,
                    Uri.parse("package:$packageName")
                )
                writeSettingsLauncher.launch(intent)
            }
        }
    }

    private fun requestSpecialUsePermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
            val permission = Manifest.permission.FOREGROUND_SERVICE_SPECIAL_USE
            when {
                ContextCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED -> {
                    Log.d("MainActivity", "Special use foreground service permission already granted.")
                }
                else -> {
                    Log.d("MainActivity", "Requesting special use foreground service permission.")
                    requestPermissionLauncher.launch(permission)
                }
            }
        }
    }

    private fun checkForNetGuardUpgrade(): Boolean {
        // Check if NetGuard is installed and was previously protected
        val netGuardPackage = "eu.faircode.netguard"
        val isNetGuardInstalled = try {
            packageManager.getPackageInfo(netGuardPackage, 0)
            true
        } catch (e: PackageManager.NameNotFoundException) {
            false
        }

        if (isNetGuardInstalled) {
            // Remove protection first (as per requirements)
            val adminComponentName = SecureGuardDeviceAdminReceiver.getComponentName(this)
            try {
                dpm.setUninstallBlocked(adminComponentName, netGuardPackage, false)
                Log.d("MainActivity", "Removed NetGuard uninstall protection")
            } catch (e: Exception) {
                Log.w("MainActivity", "Failed to remove NetGuard protection", e)
            }

            return true // Show dialog
        }
        return false // Don't show dialog
    }

    private fun uninstallNetGuard() {
        val netGuardPackage = "eu.faircode.netguard"
        val adminComponentName = SecureGuardDeviceAdminReceiver.getComponentName(this)

        lifecycleScope.launch {
            try {
                // Use MDM to uninstall NetGuard
                dpm.setUninstallBlocked(adminComponentName, netGuardPackage, false)
                val intent = Intent(Intent.ACTION_UNINSTALL_PACKAGE).apply {
                    data = Uri.parse("package:$netGuardPackage")
                    putExtra(Intent.EXTRA_RETURN_RESULT, true)
                }
                startActivity(intent)
                Log.d("MainActivity", "Initiated NetGuard uninstall")
            } catch (e: Exception) {
                Log.e("MainActivity", "Failed to uninstall NetGuard", e)
            }
        }
    }
}

// --- NEW: Composable function for the permission dialog ---
@Composable
private fun WriteSettingsPermissionDialog(onDismiss: () -> Unit, onConfirm: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.permission_dialog_title)) },
        text = { Text(stringResource(id = R.string.permission_dialog_message)) },
        confirmButton = {
            Button(onClick = onConfirm) {
                Text(stringResource(id = R.string.permission_dialog_button_confirm))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.permission_dialog_button_cancel))
            }
        }
    )
}

// --- NEW: Composable function for the NetGuard upgrade dialog ---
@Composable
private fun NetGuardUpgradeDialog(onDismiss: () -> Unit, onUninstall: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.netguard_upgrade_dialog_title)) },
        text = {
            Text(stringResource(id = R.string.netguard_upgrade_dialog_message))
        },
        confirmButton = {
            Button(onClick = onUninstall) {
                Text(stringResource(id = R.string.netguard_upgrade_dialog_button_uninstall))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.netguard_upgrade_dialog_button_keep))
            }
        }
    )
}
