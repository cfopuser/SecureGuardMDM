package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.VpnService
import android.os.Build
import android.util.Log
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature
import com.secureguard.mdm.services.BlockerVpnService

object BlockInternetVpnFeature : ProtectionFeature {

    override val id = "block_internet_vpn"
    override val titleRes = R.string.feature_vpn_title
    override val descriptionRes = R.string.feature_vpn_description
    override val iconRes = R.drawable.ic_cloud_off

    // Always-On VPN is available from API 24 (Android 7.0)
    override val requiredSdkVersion = Build.VERSION_CODES.N

    /**
     * This implementation uses the system's Always-On VPN feature.
     * The system becomes responsible for starting and stopping the VpnService.
     */
    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            try {
                if (enable) {
                    // Set our app as the always-on VPN and enable lockdown mode.
                    dpm.setAlwaysOnVpnPackage(admin, context.packageName, true)
                } else {
                    // Remove our app as the always-on VPN.
                    dpm.setAlwaysOnVpnPackage(admin, null, false)
                    // Also explicitly stop the service in case it's running.
                    val serviceIntent = Intent(context, BlockerVpnService::class.java).apply {
                        action = BlockerVpnService.ACTION_DISCONNECT
                    }
                    context.startService(serviceIntent)
                }
            } catch (e: SecurityException) {
                Log.e("BlockInternetVpnFeature", "Failed to set Always-On VPN policy", e)
            }
        }
    }

    /**
     * Checks if our package is set as the system's always-on VPN.
     */
    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return context.packageName == dpm.getAlwaysOnVpnPackage(admin)
        }
        return false // Feature is not supported on older versions.
    }
}