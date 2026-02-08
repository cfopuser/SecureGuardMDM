package com.secureguard.mdm.settingsfeatures.impl

import com.secureguard.mdm.R
import com.secureguard.mdm.settingsfeatures.api.NavigationalSetting
import com.secureguard.mdm.settingsfeatures.api.SettingCategory
import com.secureguard.mdm.ui.navigation.Routes

object NavigateToKioskModeSetting : NavigationalSetting {
    override val id: String = "navigate_kiosk_management"
    override val titleRes: Int = R.string.settings_item_manage_kiosk
    override val iconRes: Int = R.drawable.ic_apps_blocked // Placeholder icon
    override val category: SettingCategory = SettingCategory.ADVANCED_ACTIONS // Or a new category
    override val route: String = Routes.KIOSK_MANAGEMENT
    override val requiredSdkVersion: Int = android.os.Build.VERSION_CODES.P
}