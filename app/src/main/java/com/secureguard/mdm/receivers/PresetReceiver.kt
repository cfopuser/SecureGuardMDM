package com.secureguard.mdm.receivers

import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.app.admin.DevicePolicyManager
import android.util.Log
import com.secureguard.mdm.SecureGuardDeviceAdminReceiver
import com.secureguard.mdm.data.model.PresetConfig
import com.secureguard.mdm.data.repository.SettingsRepository
import com.secureguard.mdm.features.registry.FeatureRegistry
import com.secureguard.mdm.kiosk.manager.KioskLockManager
import com.secureguard.mdm.kiosk.ui.KioskActivity
import com.secureguard.mdm.security.PasswordManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import javax.inject.Inject

@AndroidEntryPoint
class PresetReceiver : BroadcastReceiver() {

    @Inject
    lateinit var settingsRepository: SettingsRepository

    @Inject
    lateinit var passwordManager: PasswordManager

    @Inject
    lateinit var kioskLockManager: KioskLockManager

    @Inject
    lateinit var preferencesManager: com.secureguard.mdm.data.local.PreferencesManager

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    override fun onReceive(context: Context, intent: Intent) {
        val pendingResult = goAsync()
        
        scope.launch {
            try {
                handleReceive(context, intent)
            } catch (e: Exception) {
                Log.e(TAG, "Error processing preset", e)
            } finally {
                pendingResult.finish()
            }
        }
    }

    private suspend fun handleReceive(context: Context, intent: Intent) {
        // 1. Security Check: Verify Action
        if (intent.action != ACTION_APPLY_PRESET) {
            Log.w(TAG, "Invalid action: ${intent.action}")
            return
        }

        // 2. State Check: Verify not already setup
        if (settingsRepository.isSetupComplete()) {
            Log.w(TAG, "Device already configured, aborting preset application.")
            return
        }

        // 3. Owner Check: Verify we are Device Owner
        val dpm = context.getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager
        if (!dpm.isDeviceOwnerApp(context.packageName)) {
            Log.e(TAG, "App is not Device Owner, cannot apply preset.")
            return
        }

        val jsonString = intent.getStringExtra(EXTRA_PRESET_JSON)
        if (jsonString.isNullOrBlank()) {
            Log.e(TAG, "No preset JSON found in extra: $EXTRA_PRESET_JSON")
            return
        }

        try {
            val config = Json.decodeFromString<PresetConfig>(jsonString)
            applyConfig(context, dpm, config)
            Log.i(TAG, "Preset applied successfully.")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to parse or apply preset JSON", e)
        }
    }

    private suspend fun applyConfig(context: Context, dpm: DevicePolicyManager, config: PresetConfig) {
        val adminComponent = ComponentName(context, SecureGuardDeviceAdminReceiver::class.java)

        // Apply Password
        config.adminPassword?.let {
            if (it.isNotEmpty()) {
                passwordManager.createAndSavePassword(it)
                Log.d(TAG, "Admin password set.")
            }
        }

        // Apply Features
        config.features.forEach { (featureId, isEnabled) ->
            val feature = FeatureRegistry.allFeatures.find { it.id == featureId }
            if (feature != null) {
                try {
                    feature.applyPolicy(context, dpm, adminComponent, isEnabled)
                    settingsRepository.setFeatureState(featureId, isEnabled)
                    Log.d(TAG, "Feature $featureId set to $isEnabled")
                } catch (e: Exception) {
                    Log.e(TAG, "Failed to apply feature $featureId", e)
                }
            } else {
                Log.w(TAG, "Feature not found: $featureId")
            }
        }

        // Apply Expanded Settings
        config.blockedApps?.let { packages ->
            try {
                settingsRepository.setBlockedAppPackages(packages)
                packages.forEach { packageName ->
                    dpm.setApplicationHidden(adminComponent, packageName, true)
                }
                Log.d(TAG, "Blocked apps applied: $packages")
            } catch (e: Exception) {
                Log.e(TAG, "Failed to apply blocked apps", e)
            }
        }

        config.suspendedApps?.let { packages ->
            try {
                settingsRepository.setSuspendedAppPackages(packages)
                if (packages.isNotEmpty()) {
                    dpm.setPackagesSuspended(adminComponent, packages.toTypedArray(), true)
                }
                Log.d(TAG, "Suspended apps applied: $packages")
            } catch (e: Exception) {
                Log.e(TAG, "Failed to apply suspended apps", e)
            }
        }

        config.customFrpIds?.let { ids ->
            settingsRepository.setCustomFrpIds(ids)
            Log.d(TAG, "FRP IDs applied: $ids")
        }

        config.updateChannel?.let { channel ->
            preferencesManager.saveString(com.secureguard.mdm.data.local.PreferencesManager.KEY_UPDATE_CHANNEL, channel)
            Log.d(TAG, "Update channel set to: $channel")
        }
        
        config.autoUpdateCheckEnabled?.let {
            settingsRepository.setAutoUpdateCheckEnabled(it)
        }

        // Apply Kiosk Settings
        if (config.kioskEnabled) {
            settingsRepository.setKioskModeEnabled(true)
            config.kioskApps?.let { apps ->
                settingsRepository.setKioskAppPackages(apps.toSet())
                Log.d(TAG, "Kiosk apps set: $apps")
            }
            config.kioskTitle?.let { settingsRepository.setKioskTitle(it) }
            config.kioskBackgroundColor?.let { settingsRepository.setKioskBackgroundColor(it) }
            config.kioskPrimaryColor?.let { settingsRepository.setKioskPrimaryColor(it) }
            config.kioskShowUpdate?.let { settingsRepository.setShouldShowKioskSecureUpdate(it) }
            config.kioskActionButtons?.let { settingsRepository.setKioskActionButtons(it) }
            config.kioskLayoutJson?.let { settingsRepository.setKioskLayoutJson(it) }
            config.kioskBlockedLauncherPackage?.let { settingsRepository.setKioskBlockedLauncherPackage(it) }
            config.kioskSettingsInLockTaskEnabled?.let { settingsRepository.setKioskSettingsInLockTaskEnabled(it) }
            config.kioskAppMonitorEnabled?.let { settingsRepository.setKioskAppMonitorEnabled(it) }
            
            // --- Kiosk Mode Activation (Fix) ---
            // 1. Set LockTask packages (allows us to pin screen)
            kioskLockManager.setLockTaskPackages()
            
            // 2. Hide system bars (Home, Back, Recents)
            kioskLockManager.enableKioskModeFeatures()
            
            // 3. Set as Default Launcher (home app)
            // We use 'true' for includeViewAbsorber to match strict kiosk behavior if desired.
            // You might want to make this configurable in PresetConfig later.
            kioskLockManager.setKioskAsDefaultLauncher(includeViewAbsorber = true)

            Log.d(TAG, "Kiosk mode enabled and restrictions applied.")
            
            // 4. Launch Kiosk Activity immediately
            val launchIntent = Intent(context, KioskActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            }
            context.startActivity(launchIntent)
        }

        // Mark Setup Complete
        settingsRepository.setSetupComplete(true)
    }

    companion object {
        private const val TAG = "PresetReceiver"
        private const val ACTION_APPLY_PRESET = "com.secureguard.mdm.ACTION_APPLY_PRESET"
        private const val EXTRA_PRESET_JSON = "extra_preset_json"
    }
}
