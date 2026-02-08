package com.secureguard.mdm.data.repository

import com.secureguard.mdm.data.db.BlockedAppCache
import com.secureguard.mdm.data.db.BlockedAppCacheDao
import com.secureguard.mdm.data.local.PreferencesManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SettingsRepositoryImpl @Inject constructor(
    private val preferencesManager: PreferencesManager,
    private val blockedAppCacheDao: BlockedAppCacheDao
) : SettingsRepository {

    override suspend fun getFeatureState(featureId: String): Boolean = withContext(Dispatchers.IO) {
        preferencesManager.loadBoolean(featureId, false)
    }

    override suspend fun setFeatureState(featureId: String, isActive: Boolean) = withContext(Dispatchers.IO) {
        preferencesManager.saveBoolean(featureId, isActive)
    }

    override suspend fun getPasswordHash(): String? = withContext(Dispatchers.IO) {
        preferencesManager.loadString(PreferencesManager.KEY_PASSWORD_HASH, null)
    }

    override suspend fun setPasswordHash(hash: String) = withContext(Dispatchers.IO) {
        preferencesManager.saveString(PreferencesManager.KEY_PASSWORD_HASH, hash)
    }

    override suspend fun isSetupComplete(): Boolean = withContext(Dispatchers.IO) {
        preferencesManager.loadBoolean(PreferencesManager.KEY_IS_SETUP_COMPLETE, false)
    }

    override suspend fun setSetupComplete(isComplete: Boolean) = withContext(Dispatchers.IO) {
        preferencesManager.saveBoolean(PreferencesManager.KEY_IS_SETUP_COMPLETE, isComplete)
    }

    override suspend fun getOriginalDialerPackage(): String? = withContext(Dispatchers.IO) {
        preferencesManager.loadString(PreferencesManager.KEY_ORIGINAL_DIALER_PACKAGE, null)
    }

    override suspend fun setOriginalDialerPackage(packageName: String?) = withContext(Dispatchers.IO) {
        preferencesManager.saveString(PreferencesManager.KEY_ORIGINAL_DIALER_PACKAGE, packageName)
    }

    override suspend fun isAutoUpdateCheckEnabled(): Boolean = withContext(Dispatchers.IO) {
        preferencesManager.loadBoolean(PreferencesManager.KEY_AUTO_UPDATE_CHECK_ENABLED, true)
    }

    override suspend fun setAutoUpdateCheckEnabled(isEnabled: Boolean) = withContext(Dispatchers.IO) {
        preferencesManager.saveBoolean(PreferencesManager.KEY_AUTO_UPDATE_CHECK_ENABLED, isEnabled)
    }

    override suspend fun isToggleOnStart(): Boolean = withContext(Dispatchers.IO) {
        preferencesManager.loadBoolean(PreferencesManager.KEY_UI_PREF_TOGGLE_ON_START, false)
    }

    override suspend fun setToggleOnStart(isOnStart: Boolean) = withContext(Dispatchers.IO) {
        preferencesManager.saveBoolean(PreferencesManager.KEY_UI_PREF_TOGGLE_ON_START, isOnStart)
    }

    override suspend fun useCheckbox(): Boolean = withContext(Dispatchers.IO) {
        preferencesManager.loadBoolean(PreferencesManager.KEY_UI_PREF_USE_CHECKBOX, false)
    }

    override suspend fun setUseCheckbox(useCheckbox: Boolean) = withContext(Dispatchers.IO) {
        preferencesManager.saveBoolean(PreferencesManager.KEY_UI_PREF_USE_CHECKBOX, useCheckbox)
    }

    override suspend fun isContactEmailVisible(): Boolean = withContext(Dispatchers.IO) {
        preferencesManager.loadBoolean(PreferencesManager.KEY_UI_PREF_SHOW_CONTACT_EMAIL, true)
    }

    override suspend fun setContactEmailVisible(isVisible: Boolean) = withContext(Dispatchers.IO) {
        preferencesManager.saveBoolean(PreferencesManager.KEY_UI_PREF_SHOW_CONTACT_EMAIL, isVisible)
    }

    override suspend fun areAllUpdatesDisabled(): Boolean = withContext(Dispatchers.IO) {
        preferencesManager.loadBoolean(PreferencesManager.KEY_UPDATE_PREF_DISABLE_ALL_UPDATES, false)
    }

    override suspend fun setAllUpdatesDisabled(isDisabled: Boolean) = withContext(Dispatchers.IO) {
        preferencesManager.saveBoolean(PreferencesManager.KEY_UPDATE_PREF_DISABLE_ALL_UPDATES, isDisabled)
    }

    override suspend fun isSettingsLocked(): Boolean = withContext(Dispatchers.IO) {
        preferencesManager.loadBoolean(PreferencesManager.KEY_SETTINGS_LOCKED_PERMANENTLY, false)
    }

    override suspend fun lockSettingsPermanently(allowManualUpdate: Boolean) = withContext(Dispatchers.IO) {
        preferencesManager.saveBoolean(PreferencesManager.KEY_SETTINGS_LOCKED_PERMANENTLY, true)
        preferencesManager.saveBoolean(PreferencesManager.KEY_ALLOW_MANUAL_UPDATE_WHEN_LOCKED, allowManualUpdate)
    }

    override suspend fun allowManualUpdateWhenLocked(): Boolean = withContext(Dispatchers.IO) {
        preferencesManager.loadBoolean(PreferencesManager.KEY_ALLOW_MANUAL_UPDATE_WHEN_LOCKED, false)
    }

    override suspend fun isShowBootToastEnabled(): Boolean = withContext(Dispatchers.IO) {
        preferencesManager.loadBoolean(PreferencesManager.KEY_SHOW_BOOT_TOAST, true) // Default to true
    }

    override suspend fun setShowBootToastEnabled(isEnabled: Boolean) = withContext(Dispatchers.IO) {
        preferencesManager.saveBoolean(PreferencesManager.KEY_SHOW_BOOT_TOAST, isEnabled)
    }


    override suspend fun getCustomFrpIds(): Set<String> = withContext(Dispatchers.IO) {
        preferencesManager.loadStringSet(PreferencesManager.KEY_CUSTOM_FRP_IDS, emptySet())
    }

    override suspend fun setCustomFrpIds(ids: Set<String>) = withContext(Dispatchers.IO) {
        preferencesManager.saveStringSet(PreferencesManager.KEY_CUSTOM_FRP_IDS, ids)
    }

    override suspend fun getBlockedAppPackages(): Set<String> = withContext(Dispatchers.IO) {
        preferencesManager.loadStringSet(PreferencesManager.KEY_BLOCKED_APP_PACKAGES, emptySet())
    }

    override suspend fun setBlockedAppPackages(packageNames: Set<String>) = withContext(Dispatchers.IO) {
        preferencesManager.saveStringSet(PreferencesManager.KEY_BLOCKED_APP_PACKAGES, packageNames)
    }

    override suspend fun getSuspendedAppPackages(): Set<String> = withContext(Dispatchers.IO) {
        preferencesManager.loadStringSet(PreferencesManager.KEY_SUSPENDED_APP_PACKAGES, emptySet())
    }

    override suspend fun setSuspendedAppPackages(packageNames: Set<String>) = withContext(Dispatchers.IO) {
        preferencesManager.saveStringSet(PreferencesManager.KEY_SUSPENDED_APP_PACKAGES, packageNames)
    }

    override suspend fun getBlockedAppsCache(): List<BlockedAppCache> = withContext(Dispatchers.IO) {
        blockedAppCacheDao.getAll()
    }

    override suspend fun addAppToCache(appCache: BlockedAppCache) = withContext(Dispatchers.IO) {
        blockedAppCacheDao.insertOrUpdate(appCache)
    }

    override suspend fun removeAppsFromCache(packageNames: List<String>) = withContext(Dispatchers.IO) {
        if (packageNames.isNotEmpty()) {
            blockedAppCacheDao.deleteByPackageNames(packageNames)
        }
    }

    override suspend fun isKioskModeEnabled(): Boolean = withContext(Dispatchers.IO) {
        preferencesManager.loadBoolean(PreferencesManager.KEY_KIOSK_MODE_ENABLED, false)
    }

    override suspend fun setKioskModeEnabled(isEnabled: Boolean) = withContext(Dispatchers.IO) {
        preferencesManager.saveBoolean(PreferencesManager.KEY_KIOSK_MODE_ENABLED, isEnabled)
    }

    override suspend fun getKioskAppPackages(): Set<String> = withContext(Dispatchers.IO) {
        preferencesManager.loadStringSet(PreferencesManager.KEY_KIOSK_APP_PACKAGES, emptySet())
    }

    override suspend fun setKioskAppPackages(packageNames: Set<String>) = withContext(Dispatchers.IO) {
        preferencesManager.saveStringSet(PreferencesManager.KEY_KIOSK_APP_PACKAGES, packageNames)
    }

    override suspend fun getKioskBlockedLauncherPackage(): String? = withContext(Dispatchers.IO) {
        preferencesManager.loadString(PreferencesManager.KEY_KIOSK_BLOCKED_LAUNCHER_PKG, null)
    }

    override suspend fun setKioskBlockedLauncherPackage(packageName: String?) = withContext(Dispatchers.IO) {
        preferencesManager.saveString(PreferencesManager.KEY_KIOSK_BLOCKED_LAUNCHER_PKG, packageName)
    }

    override suspend fun getKioskTitle(): String = withContext(Dispatchers.IO) {
        preferencesManager.loadString(PreferencesManager.KEY_KIOSK_TITLE_TEXT, "Kiosk Mode") ?: "Kiosk Mode"
    }

    override suspend fun setKioskTitle(title: String) = withContext(Dispatchers.IO) {
        preferencesManager.saveString(PreferencesManager.KEY_KIOSK_TITLE_TEXT, title)
    }

    override suspend fun getKioskBackgroundColor(): Int = withContext(Dispatchers.IO) {
        preferencesManager.loadInt(PreferencesManager.KEY_KIOSK_BACKGROUND_COLOR, 0xFF212121.toInt())
    }

    override suspend fun setKioskBackgroundColor(color: Int) = withContext(Dispatchers.IO) {
        preferencesManager.saveInt(PreferencesManager.KEY_KIOSK_BACKGROUND_COLOR, color)
    }

    // --- הוספה: מימוש הפונקציות לניהול הצבע הראשי של הקיוסק ---
    override suspend fun getKioskPrimaryColor(): Int = withContext(Dispatchers.IO) {
        preferencesManager.loadInt(PreferencesManager.KEY_KIOSK_PRIMARY_COLOR, 0xFF6200EE.toInt()) // ברירת מחדל: כחול של Material
    }

    override suspend fun setKioskPrimaryColor(color: Int) = withContext(Dispatchers.IO) {
        preferencesManager.saveInt(PreferencesManager.KEY_KIOSK_PRIMARY_COLOR, color)
    }
    // -------------------------------------------------------------

    override suspend fun shouldShowKioskSecureUpdate(): Boolean = withContext(Dispatchers.IO) {
        preferencesManager.loadBoolean(PreferencesManager.KEY_KIOSK_SHOW_SECURE_UPDATE, true)
    }

    override suspend fun setShouldShowKioskSecureUpdate(shouldShow: Boolean) = withContext(Dispatchers.IO) {
        preferencesManager.saveBoolean(PreferencesManager.KEY_KIOSK_SHOW_SECURE_UPDATE, shouldShow)
    }

    override suspend fun getKioskActionButtons(): Set<String> = withContext(Dispatchers.IO) {
        // --- התיקון כאן: שינוי ברירת המחדל לרשימה ריקה ---
        preferencesManager.loadStringSet(PreferencesManager.KEY_KIOSK_ACTION_BAR_ITEMS, emptySet())
    }

    override suspend fun setKioskActionButtons(buttons: Set<String>) = withContext(Dispatchers.IO) {
        preferencesManager.saveStringSet(PreferencesManager.KEY_KIOSK_ACTION_BAR_ITEMS, buttons)
    }

    override suspend fun getKioskLayoutJson(): String? = withContext(Dispatchers.IO) {
        preferencesManager.loadString(PreferencesManager.KEY_KIOSK_LAYOUT_JSON, null)
    }

    override suspend fun setKioskLayoutJson(json: String?) = withContext(Dispatchers.IO) {
        preferencesManager.saveString(PreferencesManager.KEY_KIOSK_LAYOUT_JSON, json)
    }

    override suspend fun isKioskSettingsInLockTaskEnabled(): Boolean = withContext(Dispatchers.IO) {
        preferencesManager.loadBoolean(PreferencesManager.KEY_KIOSK_ALLOW_SETTINGS_IN_LOCK_TASK, true) // Default to true
    }

    override suspend fun setKioskSettingsInLockTaskEnabled(isEnabled: Boolean) = withContext(Dispatchers.IO) {
        preferencesManager.saveBoolean(PreferencesManager.KEY_KIOSK_ALLOW_SETTINGS_IN_LOCK_TASK, isEnabled)
    }

    override suspend fun getChosenHomeLauncherPackage(): String? = withContext(Dispatchers.IO) {
        preferencesManager.loadString(PreferencesManager.KEY_CHOSEN_HOME_LAUNCHER_PKG, null)
    }

    override suspend fun setChosenHomeLauncherPackage(packageName: String?) = withContext(Dispatchers.IO) {
        preferencesManager.saveString(PreferencesManager.KEY_CHOSEN_HOME_LAUNCHER_PKG, packageName)
    }

    override suspend fun shouldNotShowHomeChoiceAgain(): Boolean = withContext(Dispatchers.IO) {
        preferencesManager.loadBoolean(PreferencesManager.KEY_DONT_SHOW_HOME_CHOICE_AGAIN, false)
    }

    override suspend fun setDontShowHomeChoiceAgain(dontShow: Boolean) = withContext(Dispatchers.IO) {
        preferencesManager.saveBoolean(PreferencesManager.KEY_DONT_SHOW_HOME_CHOICE_AGAIN, dontShow)
    }

    override suspend fun isKioskAppMonitorEnabled(): Boolean = withContext(Dispatchers.IO) {
        preferencesManager.loadBoolean(PreferencesManager.KEY_KIOSK_APP_MONITOR_ENABLED, false)
    }

    override suspend fun setKioskAppMonitorEnabled(isEnabled: Boolean) = withContext(Dispatchers.IO) {
        preferencesManager.saveBoolean(PreferencesManager.KEY_KIOSK_APP_MONITOR_ENABLED, isEnabled)
    }

    // --- מימוש Flows לעדכון חי ---

    override fun getKioskEnabledFlow(): Flow<Boolean> = preferenceFlow(PreferencesManager.KEY_KIOSK_MODE_ENABLED) {
        preferencesManager.loadBoolean(PreferencesManager.KEY_KIOSK_MODE_ENABLED, false)
    }

    override fun getKioskAppPackagesFlow(): Flow<Set<String>> = preferenceFlow(PreferencesManager.KEY_KIOSK_APP_PACKAGES) {
        preferencesManager.loadStringSet(PreferencesManager.KEY_KIOSK_APP_PACKAGES, emptySet())
    }

    override fun getKioskTitleFlow(): Flow<String> = preferenceFlow(PreferencesManager.KEY_KIOSK_TITLE_TEXT) {
        preferencesManager.loadString(PreferencesManager.KEY_KIOSK_TITLE_TEXT, "Kiosk Mode") ?: "Kiosk Mode"
    }

    override fun getKioskBackgroundColorFlow(): Flow<Int> = preferenceFlow(PreferencesManager.KEY_KIOSK_BACKGROUND_COLOR) {
        preferencesManager.loadInt(PreferencesManager.KEY_KIOSK_BACKGROUND_COLOR, 0xFF212121.toInt())
    }

    override fun getKioskPrimaryColorFlow(): Flow<Int> = preferenceFlow(PreferencesManager.KEY_KIOSK_PRIMARY_COLOR) {
        preferencesManager.loadInt(PreferencesManager.KEY_KIOSK_PRIMARY_COLOR, 0xFF6200EE.toInt())
    }

    private fun <T> preferenceFlow(key: String, getValue: () -> T): Flow<T> = callbackFlow {
        val listener = android.content.SharedPreferences.OnSharedPreferenceChangeListener { _, changedKey ->
            if (key == changedKey) {
                trySend(getValue())
            }
        }
        preferencesManager.prefs.registerOnSharedPreferenceChangeListener(listener)
        trySend(getValue()) // Send initial value
        awaitClose {
            preferencesManager.prefs.unregisterOnSharedPreferenceChangeListener(listener)
        }
    }
}
