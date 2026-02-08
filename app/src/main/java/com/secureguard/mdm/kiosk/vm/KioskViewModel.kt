package com.secureguard.mdm.kiosk.vm

import android.content.Context
import android.content.pm.PackageManager
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.secureguard.mdm.appblocker.AppInfo
import com.secureguard.mdm.data.repository.SettingsRepository
import com.secureguard.mdm.kiosk.manager.KioskLockManager
import com.secureguard.mdm.security.PasswordManager
import com.secureguard.mdm.kiosk.utils.SystemIndicatorsManager
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * ViewModel פשוט ונקי למסך הקיוסק
 */
@HiltViewModel
class KioskViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val settingsRepository: SettingsRepository,
    private val passwordManager: PasswordManager,
    private val kioskLockManager: KioskLockManager,
    private val systemIndicatorsManager: SystemIndicatorsManager
) : ViewModel() {

    data class UiState(
        val isLoading: Boolean = true,
        val apps: List<AppInfo> = emptyList(),
        val title: String = "",
        val backgroundColor: Color = Color(0xFFE8E8EC),
        val primaryColor: Color = Color(0xFF6200EE),
        val enabledActions: Set<String> = emptySet(),
        val batteryLevel: Int = 0,
        val currentTime: String = "00:00",
        val jewishDate: String = ""
    )

    sealed class SideEffect {
        data class LaunchApp(val packageName: String) : SideEffect()
        object NavigateToSettings : SideEffect()
        object NavigateToKioskManagement : SideEffect()
        data class ShowToast(val message: String) : SideEffect()
    }

    private val _uiState = MutableStateFlow(UiState())
    val uiState = _uiState.asStateFlow()

    private val _sideEffect = MutableSharedFlow<SideEffect>()
    val sideEffect = _sideEffect.asSharedFlow()

    init {
        loadKioskData()
        viewModelScope.launch {
            systemIndicatorsManager.batteryFlow.collect { level ->
                _uiState.update { it.copy(batteryLevel = level) }
            }
        }

        viewModelScope.launch {
            systemIndicatorsManager.timeFlow.collect { time ->
                _uiState.update { it.copy(currentTime = time) }
            }
        }

        viewModelScope.launch {
            systemIndicatorsManager.jewishDateFlow.collect { date ->
                _uiState.update { it.copy(jewishDate = date) }
            }
        }
    }

    private fun loadKioskData() {
        viewModelScope.launch {
            combine(
                settingsRepository.getKioskTitleFlow(),
                settingsRepository.getKioskBackgroundColorFlow(),
                settingsRepository.getKioskPrimaryColorFlow(),
                settingsRepository.getKioskAppPackagesFlow()
            ) { title, bgColor, primaryColor, appPackages ->
                val apps = resolveApps(appPackages)
                val enabledActions = settingsRepository.getKioskActionButtons()
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        title = title,
                        backgroundColor = Color(bgColor),
                        primaryColor = Color(primaryColor),
                        apps = apps,
                        enabledActions = enabledActions
                    )
                }
            }.collect()
        }
    }

    private suspend fun resolveApps(packageNames: Set<String>): List<AppInfo> = withContext(Dispatchers.IO) {
        val pm = context.packageManager
        packageNames.mapNotNull { pkg ->
            try {
                val appInfo = pm.getApplicationInfo(pkg, 0)
                AppInfo(
                    appName = appInfo.loadLabel(pm).toString(),
                    packageName = appInfo.packageName,
                    icon = appInfo.loadIcon(pm),
                    isBlocked = false,
                    isSystemApp = false,
                    isLauncherApp = true,
                    isSuspended = false,
                    isInstalled = true
                )
            } catch (e: PackageManager.NameNotFoundException) {
                null
            }
        }.sortedBy { it.appName.lowercase() }
    }

    fun onAppClick(packageName: String) {
        viewModelScope.launch {
            _sideEffect.emit(SideEffect.LaunchApp(packageName))
        }
    }

    suspend fun verifyPasswordResult(password: String): Boolean {
        return passwordManager.verifyPassword(password)
    }

    fun verifyPassword(password: String) {
        viewModelScope.launch {
            if (passwordManager.verifyPassword(password)) {
                _sideEffect.emit(SideEffect.NavigateToSettings)
            } else {
                _sideEffect.emit(SideEffect.ShowToast("סיסמה שגויה"))
            }
        }
    }

    fun rebootDevice() {
        kioskLockManager.rebootDevice()
    }
}
