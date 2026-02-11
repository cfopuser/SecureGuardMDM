package com.secureguard.mdm.settingsfeatures.impl

import com.secureguard.mdm.R
import com.secureguard.mdm.settingsfeatures.api.ActionSetting
import com.secureguard.mdm.settingsfeatures.api.SettingCategory

object ExportSettingsAction : ActionSetting {
    override val id = "action_export_settings"
    override val titleRes = R.string.settings_item_export_settings
    override val iconRes = android.R.drawable.ic_menu_save // Using a system icon for now, can be replaced
    override val category = SettingCategory.ADVANCED_ACTIONS
    override val requiredSdkVersion = 0 // Available on all versions
}
