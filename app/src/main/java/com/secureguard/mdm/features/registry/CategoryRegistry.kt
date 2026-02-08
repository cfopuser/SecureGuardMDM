package com.secureguard.mdm.features.registry

import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature
import com.secureguard.mdm.features.impl.*

data class ProtectionCategory(
    val titleResId: Int,
    val features: List<ProtectionFeature>
)

object CategoryRegistry {

    val allCategories: List<ProtectionCategory> = listOf(
        ProtectionCategory(
            titleResId = R.string.category_device_management,
            features = listOf(
                BlockDeveloperOptionsFeature,
                BlockFactoryResetFeature,
                FrpProtectionFeature,
                BlockSafeBootFeature,
                BlockAddUserFeature,
                BlockRemoveUserFeature,
                BlockModifyAccountsFeature,
                BlockPasswordChangeFeature
            )
        ),
        ProtectionCategory(
            titleResId = R.string.category_hardware,
            features = listOf(
                BlockCameraFeature,
                BlockMicrophoneFeature,
                BlockScreenshotFeature,
                BlockUsbFileTransferFeature,
                BlockMountPhysicalMediaFeature,
                BlockLocationSharingFeature
            )
        ),
        ProtectionCategory(
            titleResId = R.string.category_network,
            features = listOf(
                BlockWifiFeature,
                BlockBluetoothFeature,
                BlockBluetoothSharingFeature,
                BlockMobileDataFeature,
                BlockTetheringFeature,
                BlockPrivateDnsFeature,
                BlockConfigMobileNetworksFeature
            )
        ),
        ProtectionCategory(
            titleResId = R.string.category_apps,
            features = listOf(
                BlockPlayStoreFeature,
                BlockInstallAppsFeature,
                BlockUninstallAppsFeature,
                BlockUnknownSourcesFeature,
                BlockAppsControlFeature,
                BlockAutofillFeature,
                BlockContentCaptureFeature
            )
        ),
        ProtectionCategory(
            titleResId = R.string.category_vpn,
            features = listOf(
                NetfreeOnlyModeFeature,
                BlockInternetVpnFeature,
                BlockVpnSettingsFeature
            )
        ),
        ProtectionCategory(
            titleResId = R.string.category_calls_sms,
            features = listOf(
                BlockOutgoingCallsFeature,
                BlockIncomingCallsFeature,
                BlockSmsFeature
            )
        ),
        ProtectionCategory(
            titleResId = R.string.category_ui,
            features = listOf(
                DisableStatusBarFeature,
                DisableKeyguardFeature,
                BlockSetWallpaperFeature,
                BlockSetUserIconFeature,
                BlockAdjustVolumeFeature,
                BlockAmbientDisplayFeature,
                BlockSystemErrorDialogsFeature
            )
        ),
        ProtectionCategory(
            titleResId = R.string.category_advanced,
            features = listOf(
                BlockConfigLocationFeature,
                BlockConfigCredentialsFeature,
                BlockPrintingFeature,
                BlockConfigCellBroadcastsFeature,
                BlockRemoveManagedProfileFeature
            )
        )
    )
}
