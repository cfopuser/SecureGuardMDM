package com.secureguard.mdm.ui.screens.dashboard

import android.app.PendingIntent
import android.app.admin.DevicePolicyManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageInstaller
import android.net.ConnectivityManager
import android.net.Uri
import android.os.Build
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.secureguard.mdm.R
import com.secureguard.mdm.SecureGuardDeviceAdminReceiver
import com.secureguard.mdm.data.repository.SettingsRepository
import com.secureguard.mdm.features.api.ProtectionFeature
import com.secureguard.mdm.features.impl.NetfreeOnlyModeFeature
import com.secureguard.mdm.features.registry.FeatureRegistry
import com.secureguard.mdm.receivers.InstallReceiver
import com.secureguard.mdm.security.PasswordManager
import com.secureguard.mdm.services.NetfreeMonitorService
import com.secureguard.mdm.utils.SecureUpdateHelper
import com.secureguard.mdm.utils.UpdateVerificationResult
import com.secureguard.mdm.utils.update.DownloadProgress
import com.secureguard.mdm.utils.update.UpdateInfo
import com.secureguard.mdm.utils.update.UpdateManager
import com.secureguard.mdm.utils.update.UpdateResult
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

enum class UpdateDialogState {
    HIDDEN,
    SHOW_INFO,
    DOWNLOADING,
    ERROR
}

data class FeatureStatus(val feature: ProtectionFeature, val isActive: Boolean)
data class DashboardUiState(
    val activeFeatures: List<FeatureStatus> = emptyList(),
    val isLoading: Boolean = true,
    val isPasswordPromptVisible: Boolean = false,
    val passwordError: String? = null,
    val updateDialogState: UpdateDialogState = UpdateDialogState.HIDDEN,
    val availableUpdateInfo: UpdateInfo? = null,
    val downloadProgress: DownloadProgress = DownloadProgress.Downloading(0),
    val updateError: String? = null,
    val isSettingsButtonVisible: Boolean = true,
    val isContactEmailVisible: Boolean = true,
    val isManualUpdateEnabled: Boolean = true,
    val isNetfreeFeatureActive: Boolean = false,
    val isNetfreeConnectionVerified: Boolean? = null, // null = in progress/unknown
    val approvedNetworkType: String? = null,
    val isNetfreeCheckInProgress: Boolean = false
)


sealed class DashboardEvent {
    data object OnSettingsClicked : DashboardEvent()
    data class OnPasswordEntered(val password: String) : DashboardEvent()
    data object OnDismissPasswordPrompt : DashboardEvent()
    data class OnUpdateFileSelected(val uri: Uri?) : DashboardEvent()
    data object OnManualUpdateCheck : DashboardEvent()
    data object OnStartUpdateDownload : DashboardEvent()
    data object OnDismissUpdateDialog : DashboardEvent()
    data object OnNetfreeRecheckClicked : DashboardEvent()
    data object OnNetfreeRestartServiceClicked : DashboardEvent()
}


sealed class DashboardSideEffect {
    data class ToastMessage(val message: String) : DashboardSideEffect()
    object ShowAppNotInstalledDialog : DashboardSideEffect()
}

@HiltViewModel
class DashboardViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val passwordManager: PasswordManager,
    private val secureUpdateHelper: SecureUpdateHelper,
    private val dpm: DevicePolicyManager,
    private val updateManager: UpdateManager,
    private val settingsRepository: SettingsRepository,
) : ViewModel() {

    private val _uiState = MutableStateFlow(DashboardUiState())
    val uiState = _uiState.asStateFlow()

    private val _navigationEvent = MutableSharedFlow<Unit>()
    val navigationEvent = _navigationEvent.asSharedFlow()

    private val _sideEffect = MutableSharedFlow<DashboardSideEffect>()
    val sideEffect = _sideEffect.asSharedFlow()

    init {
        loadInitialState()
    }

    fun loadInitialState() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true) }

            val settingsLocked = settingsRepository.isSettingsLocked()
            val allUpdatesDisabled = settingsRepository.areAllUpdatesDisabled()
            val allowManualWhenLocked = settingsRepository.allowManualUpdateWhenLocked()
            val contactEmailVisible = settingsRepository.isContactEmailVisible()

            _uiState.update {
                it.copy(
                    isSettingsButtonVisible = !settingsLocked,
                    isManualUpdateEnabled = !allUpdatesDisabled || (settingsLocked && allowManualWhenLocked),
                    isContactEmailVisible = contactEmailVisible
                )
            }

            loadFeatureStatuses()

            if (!allUpdatesDisabled) {
                checkForUpdates(isAutoCheck = true)
            }
        }
    }

    // --- התיקון כאן: עדכון המשתנים הנכונים ---
    private fun checkNetfreeStatus() {
        viewModelScope.launch {
            _uiState.update { it.copy(isNetfreeCheckInProgress = true, isNetfreeConnectionVerified = null) }
            val status = NetfreeMonitorService.getNetfreeStatus(context)
            if (!NetfreeMonitorService.isServiceActive(context)) {
                _uiState.update {
                    it.copy(
                        isNetfreeConnectionVerified = false,
                        approvedNetworkType = null,
                        isNetfreeCheckInProgress = false
                    )
                }
            } else {
                _uiState.update {
                    it.copy(
                        isNetfreeConnectionVerified = !status.isBlocked,
                        approvedNetworkType = status.approvedNetworkType,
                        isNetfreeCheckInProgress = false
                    )
                }
            }
        }
    }

    private fun recheckNetfreeConnection() {
        viewModelScope.launch {
            _uiState.update { it.copy(isNetfreeCheckInProgress = true) }
            _sideEffect.emit(DashboardSideEffect.ToastMessage(context.getString(R.string.netfree_recheck_triggered)))
            val intent = Intent(context, NetfreeMonitorService::class.java).apply {
                action = NetfreeMonitorService.ACTION_FORCE_RECHECK
            }
            context.startService(intent)
            kotlinx.coroutines.delay(2000)
            checkNetfreeStatus()
        }
    }

    private fun restartNetfreeService() {
        viewModelScope.launch {
            val intent = Intent(context, NetfreeMonitorService::class.java).apply {
                action = NetfreeMonitorService.ACTION_STOP_MONITORING
            }
            context.startService(intent)
            kotlinx.coroutines.delay(500)
            val startIntent = Intent(context, NetfreeMonitorService::class.java).apply {
                action = NetfreeMonitorService.ACTION_START_MONITORING
            }
            context.startService(startIntent)
            _sideEffect.emit(DashboardSideEffect.ToastMessage(context.getString(R.string.netfree_service_restarted)))
            kotlinx.coroutines.delay(1000)
            checkNetfreeStatus()
        }
    }


    private fun checkForUpdates(isAutoCheck: Boolean) {
        viewModelScope.launch {
            if (!isAutoCheck || settingsRepository.isAutoUpdateCheckEnabled()) {
                if (!isAutoCheck) {
                    _sideEffect.emit(DashboardSideEffect.ToastMessage(context.getString(R.string.update_check_checking)))
                }
                when (val result = updateManager.checkForUpdate()) {
                    is UpdateResult.UpdateAvailable -> {
                        _uiState.update { it.copy(availableUpdateInfo = result.info, updateDialogState = UpdateDialogState.SHOW_INFO) }
                    }
                    is UpdateResult.Failure -> {
                        Log.e("DashboardVM", "Update check failed: ${result.message}")
                        if (!isAutoCheck) _sideEffect.emit(DashboardSideEffect.ToastMessage(result.message))
                    }
                    is UpdateResult.NoUpdate -> {
                        if (!isAutoCheck) _sideEffect.emit(DashboardSideEffect.ToastMessage(context.getString(R.string.update_check_no_update)))
                    }
                }
            }
        }
    }

    fun onEvent(event: DashboardEvent) {
        when (event) {
            DashboardEvent.OnSettingsClicked -> {
                if (!_uiState.value.isSettingsButtonVisible) return
                _uiState.update { it.copy(isPasswordPromptVisible = true, passwordError = null) }
            }
            DashboardEvent.OnDismissPasswordPrompt -> _uiState.update { it.copy(isPasswordPromptVisible = false) }
            is DashboardEvent.OnPasswordEntered -> verifyPasswordAndNavigate(event.password)
            is DashboardEvent.OnUpdateFileSelected -> {
                if (!_uiState.value.isManualUpdateEnabled) return
                event.uri?.let { handleSecureUpdate(it) }
            }
            DashboardEvent.OnStartUpdateDownload -> startUpdateDownload()
            DashboardEvent.OnDismissUpdateDialog -> _uiState.update { it.copy(updateDialogState = UpdateDialogState.HIDDEN) }
            DashboardEvent.OnManualUpdateCheck -> checkForUpdates(isAutoCheck = false)
            DashboardEvent.OnNetfreeRecheckClicked -> recheckNetfreeConnection()
            DashboardEvent.OnNetfreeRestartServiceClicked -> restartNetfreeService()
        }
    }

    private fun startUpdateDownload() {
        val updateInfo = _uiState.value.availableUpdateInfo ?: return
        _uiState.update { it.copy(updateDialogState = UpdateDialogState.DOWNLOADING, downloadProgress = DownloadProgress.Downloading(0)) }

        viewModelScope.launch {
            updateManager.downloadAndInstallUpdate(updateInfo)
                .catch { error ->
                    _uiState.update {
                        it.copy(
                            updateDialogState = UpdateDialogState.ERROR,
                            updateError = error.message ?: "Unknown download error"
                        )
                    }
                }
                .collect { progress ->
                    when (progress) {
                        is DownloadProgress.Completed -> {
                            // Installation completed, close dialog
                            _uiState.update { it.copy(updateDialogState = UpdateDialogState.HIDDEN) }
                        }
                        is DownloadProgress.Error -> {
                            _uiState.update {
                                it.copy(
                                    updateDialogState = UpdateDialogState.ERROR,
                                    updateError = progress.message
                                )
                            }
                        }
                        else -> {
                            _uiState.update { it.copy(downloadProgress = progress) }
                        }
                    }
                }
        }
    }

    private fun handleSecureUpdate(uri: Uri) {
        viewModelScope.launch {
            when (val result = secureUpdateHelper.verifyUpdate(uri)) {
                is UpdateVerificationResult.Success -> installPackage(uri)
                is UpdateVerificationResult.Failure -> {
                    if (result.errorMessage == "APP_NOT_INSTALLED") {
                        _sideEffect.emit(DashboardSideEffect.ShowAppNotInstalledDialog)
                    } else {
                        _sideEffect.emit(DashboardSideEffect.ToastMessage(result.errorMessage))
                    }
                }
            }
        }
    }

    private fun installPackage(apkUri: Uri) {
        viewModelScope.launch {
            try {
                val packageInstaller = context.packageManager.packageInstaller
                val params = PackageInstaller.SessionParams(PackageInstaller.SessionParams.MODE_FULL_INSTALL)
                val sessionId = packageInstaller.createSession(params)
                val session = packageInstaller.openSession(sessionId)
                context.contentResolver.openInputStream(apkUri)?.use { apkStream ->
                    session.openWrite("AbloqUpdate", 0, -1).use { sessionStream ->
                        apkStream.copyTo(sessionStream)
                        session.fsync(sessionStream)
                    }
                }
                val intent = Intent(context, InstallReceiver::class.java)
                val pendingIntent = PendingIntent.getBroadcast(
                    context, sessionId, intent,
                    PendingIntent.FLAG_UPDATE_CURRENT or if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) PendingIntent.FLAG_MUTABLE else 0
                )
                session.commit(pendingIntent.intentSender)
                session.close()
            } catch (e: Exception) {
                _sideEffect.emit(DashboardSideEffect.ToastMessage(context.getString(R.string.error_installing_update, e.localizedMessage)))
            }
        }
    }

    private fun verifyPasswordAndNavigate(password: String) {
        viewModelScope.launch {
            if (passwordManager.verifyPassword(password)) {
                _uiState.update { it.copy(isPasswordPromptVisible = false) }
                _navigationEvent.emit(Unit)
            } else {
                _uiState.update { it.copy(passwordError = context.getString(R.string.dialog_error_wrong_password)) }
            }
        }
    }

    private fun loadFeatureStatuses() {
        viewModelScope.launch {
            val adminComponent = SecureGuardDeviceAdminReceiver.getComponentName(context)
            val allStatuses = FeatureRegistry.allFeatures.map { feature ->
                val isActive = feature.isPolicyActive(context, dpm, adminComponent)
                FeatureStatus(feature, isActive)
            }
            val activeFeatures = allStatuses.filter { it.isActive }

            val isNetfreeActive = activeFeatures.any { it.feature.id == NetfreeOnlyModeFeature.id }

            _uiState.update { it.copy(activeFeatures = activeFeatures, isLoading = false, isNetfreeFeatureActive = isNetfreeActive) }

            if (isNetfreeActive) {
                checkNetfreeStatus()
            }
        }
    }
}
