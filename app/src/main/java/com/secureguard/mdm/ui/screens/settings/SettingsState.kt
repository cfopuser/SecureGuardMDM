package com.secureguard.mdm.ui.screens.settings

import android.net.Uri
import com.secureguard.mdm.features.api.ProtectionFeature
import com.secureguard.mdm.settingsfeatures.api.SettingCategory
import com.secureguard.mdm.settingsfeatures.api.SettingsFeature

// Data class to hold a category of protection features (the main toggles)
data class ProtectionCategoryToggle(
    val titleResId: Int,
    val toggles: List<FeatureToggle>
)

// Data class to hold the UI state for a single protection feature toggle
data class FeatureToggle(
    val feature: ProtectionFeature,
    val isEnabled: Boolean,
    val isSupported: Boolean = true,
    val requiredApi: Int = 0,
    val conflictReasonResId: Int? = null
)

// Data class to hold a settings feature and its current state (e.g., isChecked for toggles)
data class SettingItemModel(
    val feature: SettingsFeature,
    val isChecked: Boolean = false,
    val isSupported: Boolean = true,
    val requiredApi: Int = 0
)

data class SettingsUiState(
    // State for the main protection features
    val protectionCategoryToggles: List<ProtectionCategoryToggle> = emptyList(),

    // State for the new modular settings items, grouped by category
    val settingItemsByCategory: Map<SettingCategory, List<SettingItemModel>> = emptyMap(),

    val isLoading: Boolean = true,
    val snackbarMessage: String? = null,
    val isAutoUpdateEnabled: Boolean = true // Kept for the main save logic
)

sealed class SettingsEvent {
    // Events for main protection features
    data class OnToggleProtectionFeature(val featureId: String, val isEnabled: Boolean) : SettingsEvent()
    data class OnVpnPermissionResult(val granted: Boolean) : SettingsEvent()

    // Generic events for the new settings system
    data class OnToggleSettingChanged(val settingId: String, val isChecked: Boolean) : SettingsEvent()
    data class OnActionSettingClicked(val settingId: String) : SettingsEvent()
    data class OnLockSettingsConfirmed(val allowManualUpdate: Boolean) : SettingsEvent()
    data class OnExportFileSelected(val uri: Uri) : SettingsEvent()

    // Removal options dialog events
    object OnRegularRemovalSelected : SettingsEvent()
    object OnTransferOwnershipSelected : SettingsEvent()
    object OnDismissRemovalOptionsDialog : SettingsEvent()

    // Device admin selection events
    object OnDeviceAdminSelectionDismissed : SettingsEvent()
    data class OnDeviceAdminSelected(val deviceAdminItem: DeviceAdminItem) : SettingsEvent()
    object OnDeviceAdminTransferConfirmed : SettingsEvent()
    object OnDeviceAdminTransferCancelled : SettingsEvent()

    // Error dialog events
    object OnErrorDialogDismissed : SettingsEvent()

    // General events
    object OnSaveClick : SettingsEvent()
    object OnSnackbarShown : SettingsEvent()
}
