package com.secureguard.mdm.settingsfeatures.impl

import com.secureguard.mdm.R
import com.secureguard.mdm.settingsfeatures.api.*
import com.secureguard.mdm.ui.navigation.Routes

object UpdateChannelAction : ActionSetting {
    override val id: String = "action_update_channel"
    override val titleRes: Int = R.string.update_channel_button
    override val iconRes: Int = R.drawable.ic_system_update
    override val category: SettingCategory = SettingCategory.ADVANCED_ACTIONS
}

object NavigateToFrpSetting : NavigationalSetting {
    override val id: String = "navigate_frp_settings"
    override val titleRes: Int = R.string.settings_item_frp
    override val iconRes: Int = R.drawable.ic_frp_shield
    override val category: SettingCategory = SettingCategory.ADVANCED_ACTIONS
    override val route: String = Routes.FRP_SETTINGS
}

object NavigateToChangePasswordSetting : NavigationalSetting {
    override val id: String = "navigate_change_password"
    override val titleRes: Int = R.string.settings_item_change_password
    override val iconRes: Int = R.drawable.ic_key
    override val category: SettingCategory = SettingCategory.ADVANCED_ACTIONS
    override val route: String = Routes.CHANGE_PASSWORD
}

object ToggleUpdatesSetting : ToggleSetting {
    override val id: String = "toggle_all_updates"
    override val titleRes: Int = R.string.settings_item_disable_all_updates
    override val iconRes: Int = 0 // No specific icon for this toggle
    override val category: SettingCategory = SettingCategory.ADVANCED_ACTIONS
}

object LockSettingsAction : DestructiveActionSetting {
    override val id: String = "action_lock_settings"
    override val titleRes: Int = R.string.settings_item_lock_settings
    override val iconRes: Int = R.drawable.ic_remove_protection
    override val category: SettingCategory = SettingCategory.ADVANCED_ACTIONS
}

object RemovalOptionsAction : DestructiveActionSetting {
    override val id: String = "action_removal_options"
    override val titleRes: Int = R.string.settings_item_removal_options
    override val iconRes: Int = R.drawable.ic_uninstall_off
    override val category: SettingCategory = SettingCategory.ADVANCED_ACTIONS
}
