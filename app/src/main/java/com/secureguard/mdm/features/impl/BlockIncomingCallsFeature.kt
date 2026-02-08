package com.secureguard.mdm.features.impl

import android.app.PendingIntent
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageInstaller
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.telecom.TelecomManager
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.secureguard.mdm.R
import com.secureguard.mdm.data.repository.SettingsRepository
import com.secureguard.mdm.features.api.ProtectionFeature
import com.secureguard.mdm.receivers.InstallReceiver
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

object BlockIncomingCallsFeature : ProtectionFeature {
    override val id: String = "block_incoming_calls"
    override val titleRes: Int = R.string.feature_block_incoming_calls_title
    override val descriptionRes: Int = R.string.feature_block_incoming_calls_description
    override val iconRes: Int = R.drawable.ic_incoming_call_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.M // Feature requires API 23+

    private const val NO_PHONE_PACKAGE_NAME = "org.fossify.phone.debug"
    private const val NO_PHONE_ASSET_NAME = "nophone.apk"
    private const val TAG = "IncomingCallsFeature"

    @EntryPoint
    @InstallIn(SingletonComponent::class)
    interface BlockIncomingCallsEntryPoint {
        fun settingsRepository(): SettingsRepository
    }

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        // FIX: Added version guard to prevent crash on API < 23
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            Log.w(TAG, "Cannot apply policy, API level ${Build.VERSION.SDK_INT} is below required ${Build.VERSION_CODES.M}")
            return
        }

        val entryPoint = EntryPointAccessors.fromApplication(context, BlockIncomingCallsEntryPoint::class.java)
        val settingsRepository = entryPoint.settingsRepository()

        if (enable) {
            enableBlocking(context, dpm, admin, settingsRepository)
        } else {
            disableBlocking(context, dpm, admin, settingsRepository)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        // FIX: Add version guard, as PackageManager calls might behave differently on older APIs.
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return false
        return try {
            context.packageManager.getPackageInfo(NO_PHONE_PACKAGE_NAME, 0)
            true
        } catch (e: PackageManager.NameNotFoundException) {
            false
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun enableBlocking(context: Context, dpm: DevicePolicyManager, admin: ComponentName, repo: SettingsRepository) {
        if (isPolicyActive(context, dpm, admin)) {
            Log.d(TAG, "enableBlocking called but NoPhone is already installed. Doing nothing.")
            return
        }

        val telecomManager = context.getSystemService(Context.TELECOM_SERVICE) as TelecomManager
        val originalDialer = telecomManager.defaultDialerPackage
        Log.d(TAG, "Original dialer is: $originalDialer")

        CoroutineScope(Dispatchers.IO).launch {
            if (originalDialer != null && originalDialer != NO_PHONE_PACKAGE_NAME) {
                repo.setOriginalDialerPackage(originalDialer)
                try {
                    withContext(Dispatchers.Main) {
                        Toast.makeText(context, context.getString(R.string.toast_hiding_dialer, originalDialer), Toast.LENGTH_SHORT).show()
                    }
                    dpm.setApplicationHidden(admin, originalDialer, true)
                    Log.d(TAG, "Successfully hid original dialer: $originalDialer")
                    installNoPhoneApp(context)
                } catch (e: Exception) {
                    Log.e(TAG, "Failed to hide original dialer", e)
                }
            } else {
                Log.w(TAG, "No original dialer found or it's already the nophone app. Trying to install nophone anyway.")
                installNoPhoneApp(context)
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun disableBlocking(context: Context, dpm: DevicePolicyManager, admin: ComponentName, repo: SettingsRepository) {
        CoroutineScope(Dispatchers.IO).launch {
            val originalDialer = repo.getOriginalDialerPackage()

            if (originalDialer == null) {
                Log.d(TAG, "disableBlocking called but no original dialer is saved. Doing nothing.")
                return@launch
            }

            withContext(Dispatchers.Main) {
                Toast.makeText(context, R.string.toast_restoring_dialer, Toast.LENGTH_SHORT).show()
            }
            requestUninstall(context)

            try {
                dpm.setApplicationHidden(admin, originalDialer, false)
                Log.d(TAG, "Successfully un-hid original dialer: $originalDialer")
                repo.setOriginalDialerPackage(null)
            } catch (e: Exception) {
                Log.e(TAG, "Failed to un-hide original dialer", e)
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun installNoPhoneApp(context: Context) {
        CoroutineScope(Dispatchers.Main).launch {
            Toast.makeText(context, R.string.toast_installing_nophone, Toast.LENGTH_SHORT).show()
        }
        try {
            val packageInstaller = context.packageManager.packageInstaller
            val params = PackageInstaller.SessionParams(PackageInstaller.SessionParams.MODE_FULL_INSTALL)
            val sessionId = packageInstaller.createSession(params)
            val session = packageInstaller.openSession(sessionId)

            context.assets.open(NO_PHONE_ASSET_NAME).use { assetStream ->
                session.openWrite("nophone_install_session", 0, -1).use { sessionStream ->
                    assetStream.copyTo(sessionStream)
                    session.fsync(sessionStream)
                }
            }
            val intent = Intent(context, InstallReceiver::class.java).apply {
                putExtra("package_name", NO_PHONE_PACKAGE_NAME)
            }

            val pendingIntent = PendingIntent.getBroadcast(
                context, sessionId, intent,
                PendingIntent.FLAG_UPDATE_CURRENT or if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) PendingIntent.FLAG_MUTABLE else 0
            )

            session.commit(pendingIntent.intentSender)
            session.close()
            Log.d(TAG, "NoPhone installation session committed.")

        } catch (e: Exception) {
            Log.e(TAG, "Failed to install NoPhone app from assets.", e)
        }
    }

    private fun requestUninstall(context: Context) {
        val intent = Intent(Intent.ACTION_DELETE, Uri.parse("package:$NO_PHONE_PACKAGE_NAME"))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}