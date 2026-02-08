package com.secureguard.mdm.kiosk.vm

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.secureguard.mdm.appblocker.AppInfo
import com.secureguard.mdm.data.repository.SettingsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

data class KioskAppSelectionState(
    val isLoading: Boolean = true,
    val isKioskEnabled: Boolean = false,
    val allApps: List<AppInfo> = emptyList(),
    val selectedPackages: Set<String> = emptySet()
)

@HiltViewModel
class KioskAppSelectionViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val settingsRepository: SettingsRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(KioskAppSelectionState())
    val uiState = _uiState.asStateFlow()

    init {
        loadApps()
    }

    private fun loadApps() {
        viewModelScope.launch {
            val isEnabled = settingsRepository.isKioskModeEnabled()
            val selectedPkgs = settingsRepository.getKioskAppPackages()
            val apps = getAllLauncherApps()
            _uiState.update {
                it.copy(
                    isLoading = false,
                    isKioskEnabled = isEnabled,
                    allApps = apps,
                    selectedPackages = selectedPkgs
                )
            }
        }
    }

    private suspend fun getAllLauncherApps(): List<AppInfo> = withContext(Dispatchers.IO) {
        val pm = context.packageManager
        val intent = Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_LAUNCHER)
        
        pm.queryIntentActivities(intent, PackageManager.MATCH_ALL)
            .mapNotNull { resolveInfo ->
                val appInfo = resolveInfo.activityInfo?.applicationInfo ?: return@mapNotNull null
                if (appInfo.packageName == context.packageName) return@mapNotNull null
                
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
            }
            .distinctBy { it.packageName }
            .sortedBy { it.appName.lowercase() }
    }

    fun toggleApp(packageName: String) {
        viewModelScope.launch {
            val currentSelected = _uiState.value.selectedPackages
            val newSelected = if (currentSelected.contains(packageName)) {
                currentSelected - packageName
            } else {
                currentSelected + packageName
            }
            
            settingsRepository.setKioskAppPackages(newSelected)
            _uiState.update { it.copy(selectedPackages = newSelected) }
        }
    }
}
