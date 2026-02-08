package com.secureguard.mdm.features.registry

import com.secureguard.mdm.features.api.ProtectionFeature
import com.secureguard.mdm.features.impl.*

object FeatureRegistry {

    val allFeatures: List<ProtectionFeature> = listOf(
        BlockDeveloperOptionsFeature,
        BlockBluetoothFeature,
        BlockUnknownSourcesFeature,
        BlockWifiFeature,
        BlockAddUserFeature,
        BlockCameraFeature,
        BlockScreenshotFeature,
        BlockUsbFileTransferFeature,
        BlockMicrophoneFeature,
        BlockLocationSharingFeature,
        BlockBluetoothSharingFeature,
        BlockMobileDataFeature,
        BlockTetheringFeature,
        BlockPlayStoreFeature,
        BlockFactoryResetFeature,
        BlockOutgoingCallsFeature,
        BlockSafeBootFeature,
        BlockInternetVpnFeature,
        BlockSmsFeature,
        BlockInstallAppsFeature,
        BlockRemoveUserFeature,
        BlockModifyAccountsFeature,
        BlockRemoveManagedProfileFeature,
        BlockSetUserIconFeature,
        BlockAdjustVolumeFeature,
        BlockSetWallpaperFeature,
        DisableStatusBarFeature,
        BlockAutofillFeature,
        BlockAmbientDisplayFeature,
        BlockAppsControlFeature,
        BlockUninstallAppsFeature,
        BlockMountPhysicalMediaFeature,
        DisableKeyguardFeature,
        BlockConfigLocationFeature,
        BlockConfigCredentialsFeature,
        BlockPrintingFeature,
        BlockConfigCellBroadcastsFeature,
        BlockContentCaptureFeature,
        BlockSystemErrorDialogsFeature,
        BlockPrivateDnsFeature,
        BlockIncomingCallsFeature,
        BlockPasswordChangeFeature,
        BlockVpnSettingsFeature,
        InstallAndProtectNetGuardFeature,
        ForceNetGuardVpnFeature,
        NetfreeOnlyModeFeature // --- הוספה ---
    )
}