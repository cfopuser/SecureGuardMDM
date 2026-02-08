package com.secureguard.mdm.ui.screens.updatesettings

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.secureguard.mdm.data.local.PreferencesManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UpdateSettingsViewModel @Inject constructor(
    private val preferencesManager: PreferencesManager
) : ViewModel() {

    private val _uiState = MutableStateFlow(UpdateSettingsUiState())
    val uiState = _uiState.asStateFlow()

    private val _sideEffect = MutableSharedFlow<UpdateSettingsSideEffect>()
    val sideEffect = _sideEffect.asSharedFlow()

    init {
        loadCurrentChannel()
    }

    private fun loadCurrentChannel() {
        val savedChannel = preferencesManager.loadString(PreferencesManager.KEY_UPDATE_CHANNEL, null)
        val channel = when (savedChannel) {
            "PREBUILD" -> UpdateChannel.PREBUILD
            else -> UpdateChannel.STABLE
        }
        _uiState.update { it.copy(selectedChannel = channel) }
    }

    fun onEvent(event: UpdateSettingsEvent) {
        when (event) {
            is UpdateSettingsEvent.OnChannelSelected -> {
                _uiState.update { it.copy(selectedChannel = event.channel) }
            }
            UpdateSettingsEvent.OnSaveClicked -> saveChannel()
        }
    }

    private fun saveChannel() {
        val channelString = when (_uiState.value.selectedChannel) {
            UpdateChannel.STABLE -> "STABLE"
            UpdateChannel.PREBUILD -> "PREBUILD"
        }
        preferencesManager.saveString(PreferencesManager.KEY_UPDATE_CHANNEL, channelString)
        viewModelScope.launch {
            _sideEffect.emit(UpdateSettingsSideEffect.NavigateBack)
        }
    }

    fun onChannelSelected(channel: UpdateChannel) {
        onEvent(UpdateSettingsEvent.OnChannelSelected(channel))
    }

    fun onSaveClicked() {
        onEvent(UpdateSettingsEvent.OnSaveClicked)
    }
}
