package com.secureguard.mdm.features.impl

import android.Manifest
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.VpnService
import android.os.Build
import androidx.core.content.ContextCompat
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature
import com.secureguard.mdm.services.NetfreeMonitorService
import com.secureguard.mdm.utils.FileLogger

object NetfreeOnlyModeFeature : ProtectionFeature {
    override val id = "netfree_only_mode"
    override val titleRes = R.string.feature_netfree_only_title
    override val descriptionRes = R.string.feature_netfree_only_description
    override val iconRes = R.drawable.ic_netguard_shield
    override val requiredSdkVersion = Build.VERSION_CODES.N

    /**
     * Checks if VPN permission is granted. This is needed because Netfree uses VPN internally.
     */
    fun isVpnPermissionGranted(context: Context): Boolean {
        return VpnService.prepare(context) == null
    }

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        val intent = Intent(context, NetfreeMonitorService::class.java)
        if (enable) {
            // Grant notification permission for the service
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                try {
                    val success = dpm.setPermissionGrantState(
                        admin,
                        context.packageName,
                        Manifest.permission.POST_NOTIFICATIONS,
                        DevicePolicyManager.PERMISSION_GRANT_STATE_GRANTED
                    )
                    FileLogger.log("NetfreeFeature", "POST_NOTIFICATIONS grant state success: $success")
                } catch (e: SecurityException) {
                    FileLogger.log("NetfreeFeature", "SecurityException while granting notification permission: ${e.message}")
                }
            }
            FileLogger.log("NetfreeFeature", "Policy enabled. Starting NetfreeMonitorService.")
            try {
                intent.action = NetfreeMonitorService.ACTION_START_MONITORING
                ContextCompat.startForegroundService(context, intent)
            } catch (e: Exception) {
                FileLogger.log("NetfreeFeature", "ERROR starting service: ${e.message}")
            }
        } else {
            FileLogger.log("NetfreeFeature", "Policy disabled. Stopping NetfreeMonitorService.")
            try {
                intent.action = NetfreeMonitorService.ACTION_STOP_MONITORING
                context.startService(intent)
            } catch (e: Exception) {
                FileLogger.log("NetfreeFeature", "ERROR stopping service: ${e.message}")
            }
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        return NetfreeMonitorService.isServiceActive(context)
    }
}
