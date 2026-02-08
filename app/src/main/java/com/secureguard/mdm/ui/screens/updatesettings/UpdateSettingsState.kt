package com.secureguard.mdm.ui.screens.updatesettings

enum class UpdateChannel {
    STABLE, PREBUILD
}

data class UpdateSettingsUiState(
    val selectedChannel: UpdateChannel = UpdateChannel.STABLE
)

sealed class UpdateSettingsEvent {
    data class OnChannelSelected(val channel: UpdateChannel) : UpdateSettingsEvent()
    object OnSaveClicked : UpdateSettingsEvent()
}

sealed class UpdateSettingsSideEffect {
    object NavigateBack : UpdateSettingsSideEffect()
}
