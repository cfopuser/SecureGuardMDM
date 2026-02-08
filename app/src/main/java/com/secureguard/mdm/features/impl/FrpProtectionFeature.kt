package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.app.admin.FactoryResetProtectionPolicy
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import com.secureguard.mdm.R
import com.secureguard.mdm.data.repository.SettingsRepository
import com.secureguard.mdm.features.api.ProtectionFeature
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.runBlocking

object FrpProtectionFeature : ProtectionFeature {
    override val id: String = "frp_protection"
    override val titleRes: Int = R.string.feature_frp_protection_title
    override val descriptionRes: Int = R.string.feature_frp_protection_description
    override val iconRes: Int = R.drawable.ic_frp_shield

    override val requiredSdkVersion: Int = Build.VERSION_CODES.LOLLIPOP_MR1

    private const val TAG = "FrpProtectionFeature"
    private const val GMS_PACKAGE = "com.google.android.gms"
    private const val LEGACY_FRP_KEY = "factoryResetProtectionAdmin"
    private const val LEGACY_FRP_BROADCAST = "com.google.android.gms.auth.FRP_CONFIG_CHANGED"

    private val defaultFrpAccountId = listOf("110598130046942145007")

    @EntryPoint
    @InstallIn(SingletonComponent::class)
    interface FrpEntryPoint {
        fun settingsRepository(): SettingsRepository
    }

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        val entryPoint = EntryPointAccessors.fromApplication(context.applicationContext, FrpEntryPoint::class.java)
        val settingsRepository = entryPoint.settingsRepository()

        val accountIdsToUse = runBlocking {
            val customIds = settingsRepository.getCustomFrpIds()
            if (customIds.isNotEmpty()) {
                Log.d(TAG, "Using custom FRP IDs: $customIds")
                customIds.toList()
            } else {
                Log.d(TAG, "Using default FRP ID.")
                defaultFrpAccountId
            }
        }

        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                applyModernPolicy(dpm, admin, enable, accountIdsToUse)
            } else {
                applyLegacyPolicy(context, dpm, admin, enable, accountIdsToUse)
            }
        } catch (e: SecurityException) {
            Log.e(TAG, "Failed to apply FRP policy. App is likely not the device owner.", e)
        } catch (e: UnsupportedOperationException) {
            Log.w(TAG, "FRP is not supported on this device.")
        } catch (e: Exception) {
            Log.e(TAG, "An unexpected error occurred while applying FRP policy.", e)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                try {
                    val policy = dpm.getFactoryResetProtectionPolicy(admin)
                    return policy != null && policy.isFactoryResetProtectionEnabled
                } catch (e: UnsupportedOperationException) {
                    Log.w(TAG, "Modern FRP policy check failed: Not supported on this device.")
                    return false
                }
            } else {
                val restrictions = dpm.getApplicationRestrictions(admin, GMS_PACKAGE)
                return !restrictions.isEmpty && restrictions.containsKey(LEGACY_FRP_KEY)
            }
        } catch (e: SecurityException) {
            Log.e(TAG, "Failed to check FRP policy status due to a SecurityException.", e)
            return false
        }
    }

    @RequiresApi(Build.VERSION_CODES.R)
    private fun applyModernPolicy(dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean, accounts: List<String>) {
        if (enable) {
            Log.d(TAG, "Applying modern (API 30+) FRP policy.")
            val policy = FactoryResetProtectionPolicy.Builder()
                .setFactoryResetProtectionAccounts(accounts)
                .setFactoryResetProtectionEnabled(true)
                .build()
            dpm.setFactoryResetProtectionPolicy(admin, policy)
        } else {
            Log.d(TAG, "Disabling modern (API 30+) FRP policy.")
            dpm.setFactoryResetProtectionPolicy(admin, null)
        }
    }

    private fun applyLegacyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean, accounts: List<String>) {
        if (enable) {
            Log.d(TAG, "Applying legacy (pre-API 30) FRP policy.")
            val bundle = Bundle()
            bundle.putStringArray(LEGACY_FRP_KEY, accounts.toTypedArray())
            dpm.setApplicationRestrictions(admin, GMS_PACKAGE, bundle)

            val intent = Intent(LEGACY_FRP_BROADCAST).setPackage(GMS_PACKAGE)
            context.sendBroadcast(intent)
            Log.d(TAG, "Sent FRP config changed broadcast.")
        } else {
            Log.d(TAG, "Disabling legacy (pre-API 30) FRP policy.")
            dpm.setApplicationRestrictions(admin, GMS_PACKAGE, null)
        }
    }
}