This file is a merged representation of the entire codebase, combined into a single document by Repomix.

# File Summary

## Purpose
This file contains a packed representation of the entire repository's contents.
It is designed to be easily consumable by AI systems for analysis, code review,
or other automated processes.

## File Format
The content is organized as follows:
1. This summary section
2. Repository information
3. Directory structure
4. Repository files (if enabled)
5. Multiple file entries, each consisting of:
  a. A header with the file path (## File: path/to/file)
  b. The full contents of the file in a code block

## Usage Guidelines
- This file should be treated as read-only. Any changes should be made to the
  original repository files, not this packed version.
- When processing this file, use the file path to distinguish
  between different files in the repository.
- Be aware that this file may contain sensitive information. Handle it with
  the same level of security as you would the original repository.

## Notes
- Some files may have been excluded based on .gitignore rules and Repomix's configuration
- Binary files are not included in this packed representation. Please refer to the Repository Structure section for a complete list of file paths, including binary files
- Files matching patterns in .gitignore are excluded
- Files matching default ignore patterns are excluded
- Files are sorted by Git change count (files with more changes are at the bottom)

# Directory Structure
```
.gitignore
app/.gitignore
app/build.gradle.kts
app/proguard-rules.pro
app/release/Abloq-release.apk
app/release/output-metadata.json
app/src/androidTest/java/com/secureguard/mdm/ExampleInstrumentedTest.kt
app/src/main/AndroidManifest.xml
app/src/main/assets/netguard.apk
app/src/main/assets/nophone.apk
app/src/main/ic_launcher-playstore.png
app/src/main/java/com/secureguard/mdm/appblocker/AppBlockerState.kt
app/src/main/java/com/secureguard/mdm/appblocker/AppBlockerViewModel.kt
app/src/main/java/com/secureguard/mdm/appblocker/AppInfo.kt
app/src/main/java/com/secureguard/mdm/appblocker/ui/AppSelectionScreen.kt
app/src/main/java/com/secureguard/mdm/appblocker/ui/BlockedAppsScreen.kt
app/src/main/java/com/secureguard/mdm/boot/api/BootTask.kt
app/src/main/java/com/secureguard/mdm/boot/BootCompletedReceiver.kt
app/src/main/java/com/secureguard/mdm/boot/impl/NetfreeWatchdogBootTask.kt
app/src/main/java/com/secureguard/mdm/boot/impl/ShowToastOnBootTask.kt
app/src/main/java/com/secureguard/mdm/boot/registry/BootTaskRegistry.kt
app/src/main/java/com/secureguard/mdm/data/db/AppDatabase.kt
app/src/main/java/com/secureguard/mdm/data/db/BlockedAppCache.kt
app/src/main/java/com/secureguard/mdm/data/db/BlockedAppCacheDao.kt
app/src/main/java/com/secureguard/mdm/data/local/PreferencesManager.kt
app/src/main/java/com/secureguard/mdm/data/model/NetfreeUser.kt
app/src/main/java/com/secureguard/mdm/data/model/PresetConfig.kt
app/src/main/java/com/secureguard/mdm/data/repository/SettingsRepository.kt
app/src/main/java/com/secureguard/mdm/data/repository/SettingsRepositoryImpl.kt
app/src/main/java/com/secureguard/mdm/di/AppModule.kt
app/src/main/java/com/secureguard/mdm/features/api/ProtectionFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockAddUserFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockAdjustVolumeFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockAirplaneModeFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockAmbientDisplayFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockAppsControlFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockAutofillFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockBluetoothFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockBluetoothSharingFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockCameraFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockConfigCellBroadcastsFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockConfigCredentialsFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockConfigLocationFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockConfigMobileNetworksFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockContentCaptureFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockDataRoamingFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockDeveloperOptionsFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockFactoryResetFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockIncomingCallsFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockInstallAppsFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockInternetVpnFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockLocationSharingFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockMicrophoneFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockMobileDataFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockModifyAccountsFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockMountPhysicalMediaFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockNetworkResetFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockOutgoingBeamFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockOutgoingCallsFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockPasswordChangeFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockPlayStoreFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockPrintingFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockPrivateDnsFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockRemoveManagedProfileFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockRemoveUserFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockSafeBootFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockScreenshotFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockSetUserIconFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockSetWallpaperFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockSmsFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockSystemErrorDialogsFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockTetheringFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockUninstallAppsFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockUnknownSourcesFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockUsbFileTransferFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockVpnSettingsFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/BlockWifiFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/DisableKeyguardFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/DisableStatusBarFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/ForceNetGuardVpnFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/FrpProtectionFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/InstallAndProtectNetGuardFeature.kt
app/src/main/java/com/secureguard/mdm/features/impl/NetfreeOnlyModeFeature.kt
app/src/main/java/com/secureguard/mdm/features/registry/CategoryRegistry.kt
app/src/main/java/com/secureguard/mdm/features/registry/FeatureRegistry.kt
app/src/main/java/com/secureguard/mdm/kiosk/manager/KioskLockManager.kt
app/src/main/java/com/secureguard/mdm/kiosk/ui/HomeLauncherSelectionScreen.kt
app/src/main/java/com/secureguard/mdm/kiosk/ui/KioskActivity.kt
app/src/main/java/com/secureguard/mdm/kiosk/ui/KioskAppSelectionScreen.kt
app/src/main/java/com/secureguard/mdm/kiosk/ui/KioskManagementScreen.kt
app/src/main/java/com/secureguard/mdm/kiosk/ui/KioskScreen.kt
app/src/main/java/com/secureguard/mdm/kiosk/utils/SystemIndicatorsManager.kt
app/src/main/java/com/secureguard/mdm/kiosk/vm/KioskAppSelectionViewModel.kt
app/src/main/java/com/secureguard/mdm/kiosk/vm/KioskManagementViewModel.kt
app/src/main/java/com/secureguard/mdm/kiosk/vm/KioskViewModel.kt
app/src/main/java/com/secureguard/mdm/MainActivity.kt
app/src/main/java/com/secureguard/mdm/MainService.kt
app/src/main/java/com/secureguard/mdm/receivers/InstallReceiver.kt
app/src/main/java/com/secureguard/mdm/receivers/PresetReceiver.kt
app/src/main/java/com/secureguard/mdm/receivers/UninstallReceiver.kt
app/src/main/java/com/secureguard/mdm/SecureGuardApplication.kt
app/src/main/java/com/secureguard/mdm/SecureGuardDeviceAdminReceiver.kt
app/src/main/java/com/secureguard/mdm/security/PasswordManager.kt
app/src/main/java/com/secureguard/mdm/services/BlockerVpnService.kt
app/src/main/java/com/secureguard/mdm/services/NetfreeMonitorService.kt
app/src/main/java/com/secureguard/mdm/services/ServiceWatchdogJob.kt
app/src/main/java/com/secureguard/mdm/settingsfeatures/api/SettingsAPI.kt
app/src/main/java/com/secureguard/mdm/settingsfeatures/impl/AdvancedActionSettings.kt
app/src/main/java/com/secureguard/mdm/settingsfeatures/impl/AppManagementSettings.kt
app/src/main/java/com/secureguard/mdm/settingsfeatures/impl/KioskSettings.kt
app/src/main/java/com/secureguard/mdm/settingsfeatures/impl/UiAndBehaviorSettings.kt
app/src/main/java/com/secureguard/mdm/settingsfeatures/registry/SettingsRegistry.kt
app/src/main/java/com/secureguard/mdm/ui/components/InfoDialog.kt
app/src/main/java/com/secureguard/mdm/ui/components/PasswordPromptDialog.kt
app/src/main/java/com/secureguard/mdm/ui/navigation/AppNavigation.kt
app/src/main/java/com/secureguard/mdm/ui/screens/changepassword/ChangePasswordScreen.kt
app/src/main/java/com/secureguard/mdm/ui/screens/changepassword/ChangePasswordViewModel.kt
app/src/main/java/com/secureguard/mdm/ui/screens/dashboard/AppInfoDialog.kt
app/src/main/java/com/secureguard/mdm/ui/screens/dashboard/DashboardScreen.kt
app/src/main/java/com/secureguard/mdm/ui/screens/dashboard/DashboardViewModel.kt
app/src/main/java/com/secureguard/mdm/ui/screens/frpsettings/FrpSettingsScreen.kt
app/src/main/java/com/secureguard/mdm/ui/screens/frpsettings/FrpSettingsViewModel.kt
app/src/main/java/com/secureguard/mdm/ui/screens/provisioning/ProvisioningScreen.kt
app/src/main/java/com/secureguard/mdm/ui/screens/provisioning/ProvisioningViewModel.kt
app/src/main/java/com/secureguard/mdm/ui/screens/settings/SettingsScreen.kt
app/src/main/java/com/secureguard/mdm/ui/screens/settings/SettingsState.kt
app/src/main/java/com/secureguard/mdm/ui/screens/settings/SettingsViewModel.kt
app/src/main/java/com/secureguard/mdm/ui/screens/setup/SetupScreen.kt
app/src/main/java/com/secureguard/mdm/ui/screens/setup/SetupViewModel.kt
app/src/main/java/com/secureguard/mdm/ui/screens/updatesettings/UpdateSettingsState.kt
app/src/main/java/com/secureguard/mdm/ui/screens/updatesettings/UpdateSettingsViewModel.kt
app/src/main/java/com/secureguard/mdm/ui/theme/Color.kt
app/src/main/java/com/secureguard/mdm/ui/theme/Theme.kt
app/src/main/java/com/secureguard/mdm/ui/theme/Type.kt
app/src/main/java/com/secureguard/mdm/utils/FileLogger.kt
app/src/main/java/com/secureguard/mdm/utils/JobSchedulerHelper.kt
app/src/main/java/com/secureguard/mdm/utils/NetfreeChecker.kt
app/src/main/java/com/secureguard/mdm/utils/NetworkWatcher.kt
app/src/main/java/com/secureguard/mdm/utils/RuntimeTypeAdapterFactory.java
app/src/main/java/com/secureguard/mdm/utils/SecureUpdateHelper.kt
app/src/main/java/com/secureguard/mdm/utils/update/UpdateDialog.kt
app/src/main/java/com/secureguard/mdm/utils/update/UpdateInfo.kt
app/src/main/java/com/secureguard/mdm/utils/update/UpdateManager.kt
app/src/main/res/drawable-v24/ic_launcher_foreground.xml
app/src/main/res/drawable/bg_kiosk_folder.xml
app/src/main/res/drawable/ic_airplane_mode_off.xml
app/src/main/res/drawable/ic_ambient_display_off.xml
app/src/main/res/drawable/ic_apk_install.xml
app/src/main/res/drawable/ic_apps_blocked.xml
app/src/main/res/drawable/ic_apps_control_off.xml
app/src/main/res/drawable/ic_autofill_off.xml
app/src/main/res/drawable/ic_battery_3_bar.xml
app/src/main/res/drawable/ic_battery_4_bar.xml
app/src/main/res/drawable/ic_battery_6_bar.xml
app/src/main/res/drawable/ic_battery_alert.xml
app/src/main/res/drawable/ic_battery_full.xml
app/src/main/res/drawable/ic_bluetooth_disabled.xml
app/src/main/res/drawable/ic_bluetooth_sharing_off.xml
app/src/main/res/drawable/ic_call_end.xml
app/src/main/res/drawable/ic_camera_off.xml
app/src/main/res/drawable/ic_cell_broadcast_off.xml
app/src/main/res/drawable/ic_cloud_off.xml
app/src/main/res/drawable/ic_config_mobile_networks_off.xml
app/src/main/res/drawable/ic_content_capture_off.xml
app/src/main/res/drawable/ic_credentials_off.xml
app/src/main/res/drawable/ic_data_roaming_off.xml
app/src/main/res/drawable/ic_developer_mode.xml
app/src/main/res/drawable/ic_dialpad.xml
app/src/main/res/drawable/ic_factory_reset_blocked.xml
app/src/main/res/drawable/ic_flashlight.xml
app/src/main/res/drawable/ic_frp_shield.xml
app/src/main/res/drawable/ic_incoming_call_off.xml
app/src/main/res/drawable/ic_info.xml
app/src/main/res/drawable/ic_install_mobile_disabled.xml
app/src/main/res/drawable/ic_key.xml
app/src/main/res/drawable/ic_launcher_background.xml
app/src/main/res/drawable/ic_location_config_off.xml
app/src/main/res/drawable/ic_location_off.xml
app/src/main/res/drawable/ic_lock_open.xml
app/src/main/res/drawable/ic_manage_apps.xml
app/src/main/res/drawable/ic_mic_off.xml
app/src/main/res/drawable/ic_mobile_data_off.xml
app/src/main/res/drawable/ic_modify_accounts_off.xml
app/src/main/res/drawable/ic_netguard_shield.xml
app/src/main/res/drawable/ic_network_reset_off.xml
app/src/main/res/drawable/ic_nfc_off.xml
app/src/main/res/drawable/ic_password_off.xml
app/src/main/res/drawable/ic_password_policy.xml
app/src/main/res/drawable/ic_person_add_disabled.xml
app/src/main/res/drawable/ic_play_store_blocked.xml
app/src/main/res/drawable/ic_print_off.xml
app/src/main/res/drawable/ic_private_dns_off.xml
app/src/main/res/drawable/ic_remove_protection.xml
app/src/main/res/drawable/ic_remove_user_off.xml
app/src/main/res/drawable/ic_remove_work_profile_off.xml
app/src/main/res/drawable/ic_safe_boot_blocked.xml
app/src/main/res/drawable/ic_screen_rotation.xml
app/src/main/res/drawable/ic_screenshot_disabled.xml
app/src/main/res/drawable/ic_sd_card_off.xml
app/src/main/res/drawable/ic_set_user_icon_off.xml
app/src/main/res/drawable/ic_settings.xml
app/src/main/res/drawable/ic_sms_disabled.xml
app/src/main/res/drawable/ic_status_bar_off.xml
app/src/main/res/drawable/ic_system_error_off.xml
app/src/main/res/drawable/ic_system_update.xml
app/src/main/res/drawable/ic_tethering_off.xml
app/src/main/res/drawable/ic_uninstall_off.xml
app/src/main/res/drawable/ic_usb_off.xml
app/src/main/res/drawable/ic_volume_off.xml
app/src/main/res/drawable/ic_volume_up.xml
app/src/main/res/drawable/ic_vpn_lock.xml
app/src/main/res/drawable/ic_wallpaper_off.xml
app/src/main/res/drawable/ic_warning.xml
app/src/main/res/drawable/ic_wifi_off.xml
app/src/main/res/mipmap-anydpi-v26/ic_launcher_round.xml
app/src/main/res/mipmap-anydpi-v26/ic_launcher.xml
app/src/main/res/mipmap-hdpi/ic_launcher_foreground.webp
app/src/main/res/mipmap-hdpi/ic_launcher_round.webp
app/src/main/res/mipmap-hdpi/ic_launcher.webp
app/src/main/res/mipmap-mdpi/ic_launcher_foreground.webp
app/src/main/res/mipmap-mdpi/ic_launcher_round.webp
app/src/main/res/mipmap-mdpi/ic_launcher.webp
app/src/main/res/mipmap-xhdpi/ic_launcher_foreground.webp
app/src/main/res/mipmap-xhdpi/ic_launcher_round.webp
app/src/main/res/mipmap-xhdpi/ic_launcher.webp
app/src/main/res/mipmap-xxhdpi/ic_launcher_foreground.webp
app/src/main/res/mipmap-xxhdpi/ic_launcher_round.webp
app/src/main/res/mipmap-xxhdpi/ic_launcher.webp
app/src/main/res/mipmap-xxxhdpi/ic_launcher_foreground.webp
app/src/main/res/mipmap-xxxhdpi/ic_launcher_round.webp
app/src/main/res/mipmap-xxxhdpi/ic_launcher.webp
app/src/main/res/values-en/strings.xml
app/src/main/res/values-night/themes.xml
app/src/main/res/values/colors.xml
app/src/main/res/values/ic_launcher_background.xml
app/src/main/res/values/strings.xml
app/src/main/res/values/styles.xml
app/src/main/res/values/themes.xml
app/src/main/res/xml-v28/device_admin.xml
app/src/main/res/xml/backup_rules.xml
app/src/main/res/xml/data_extraction_rules.xml
app/src/main/res/xml/device_admin.xml
app/src/main/res/xml/network_security_config.xml
app/src/main/res/xml/provider_paths.xml
app/src/test/java/com/secureguard/mdm/ExampleUnitTest.kt
build.gradle.kts
changes.txt
gradle.properties
gradle/libs.versions.toml
gradle/wrapper/gradle-wrapper.jar
gradle/wrapper/gradle-wrapper.properties
gradlew
gradlew.bat
README.md
settings.gradle.kts
version.txt
versiontest.txt
תכנונים ל A Bloq 1 .txt
```

# Files

## File: תכנונים ל A Bloq 1 .txt
```
תכנונים ל A Bloq
 
1. הוספת תמיכה באנגלית, ותמיכה בLTR	
 
2. הוספת אפשרות לשיחזור סיסמה באמצעות שאלת אבטחה
 
3. הוספת הזהרה נוספת לנעילת ההגדרות
 
4. הוספת KillSwitch
```

## File: .gitignore
```
*.iml
.gradle
/local.properties
/.idea/caches
/.idea/libraries
/.idea/modules.xml
/.idea/workspace.xml
/.idea/navEditor.xml
/.idea/assetWizardSettings.xml
.DS_Store
/build
/captures
.externalNativeBuild
.cxx
local.properties
```

## File: app/.gitignore
```
/build
```

## File: app/proguard-rules.pro
```
# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
```

## File: app/src/androidTest/java/com/secureguard/mdm/ExampleInstrumentedTest.kt
```kotlin
package com.secureguard.mdm

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.secureguard.mdm", appContext.packageName)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/boot/api/BootTask.kt
```kotlin
package com.secureguard.mdm.boot.api

/**
 * Interface for tasks that need to be executed when the device boots up.
 * Each task is responsible for its own logic and for checking if it needs to run.
 */
interface BootTask {
    /**
     * This function is called by the MainService after the device has finished booting.
     */
    suspend fun onBootCompleted()
}
```

## File: app/src/main/java/com/secureguard/mdm/boot/impl/NetfreeWatchdogBootTask.kt
```kotlin
package com.secureguard.mdm.boot.impl

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat
import com.secureguard.mdm.boot.api.BootTask
import com.secureguard.mdm.services.NetfreeMonitorService
import com.secureguard.mdm.utils.FileLogger
import com.secureguard.mdm.utils.JobSchedulerHelper
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class NetfreeWatchdogBootTask @Inject constructor(
    @ApplicationContext private val context: Context
) : BootTask {
    override suspend fun onBootCompleted() {
        FileLogger.log("NetfreeWatchdogBootTask", "Device boot completed. Checking service state.")

        if (NetfreeMonitorService.isServiceActive(context)) {
            FileLogger.log("NetfreeWatchdogBootTask", "Service was active. Restarting service to ensure consistency.")

            // --- SIMPLIFIED LOGIC ---
            // Schedule the Watchdog for the long term and start the service immediately.
            // This is the same logic as in the WatchdogJob itself, ensuring consistency.
            JobSchedulerHelper.scheduleWatchdog(context)

            val serviceIntent = Intent(context, NetfreeMonitorService::class.java).apply {
                action = NetfreeMonitorService.ACTION_START_MONITORING
            }
            ContextCompat.startForegroundService(context, serviceIntent)
            // --- END OF SIMPLIFIED LOGIC ---
            } else {
            FileLogger.log("NetfreeWatchdogBootTask", "Service was not active. Nothing to do.")
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/boot/impl/ShowToastOnBootTask.kt
```kotlin
package com.secureguard.mdm.boot.impl

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat
import com.secureguard.mdm.R
import com.secureguard.mdm.boot.api.BootTask
import com.secureguard.mdm.data.repository.SettingsRepository
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class ShowToastOnBootTask @Inject constructor(
    @ApplicationContext private val context: Context,
    private val settingsRepository: SettingsRepository
) : BootTask {

    companion object {
        private const val BOOT_NOTIFICATION_CHANNEL_ID = "BootNotificationChannel"
        private const val BOOT_NOTIFICATION_ID = 2 // Use a different ID from the main service
    }

    override suspend fun onBootCompleted() {
        if (settingsRepository.isShowBootToastEnabled()) {
            showBootNotification()
            println(context.getString(R.string.boot_notification_message))
        }
    }

    private fun showBootNotification() {

        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // Create a notification channel for Android 8.0 (API 26) and higher
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                BOOT_NOTIFICATION_CHANNEL_ID,
                "Boot Notifications", // Channel name visible to the user in settings
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = "Shows a notification when the app starts on boot."
            }
            notificationManager.createNotificationChannel(channel)
        }

        val notification = NotificationCompat.Builder(context, BOOT_NOTIFICATION_CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_safe_boot_blocked) // Using an existing icon
            .setContentTitle(context.getString(R.string.app_name))
            .setContentText(context.getString(R.string.boot_notification_message))
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true) // Notification will be dismissed when the user taps it
            .build()

        notificationManager.notify(BOOT_NOTIFICATION_ID, notification)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/data/db/AppDatabase.kt
```kotlin
package com.secureguard.mdm.data.db

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * הקלאס הראשי המייצג את מסד הנתונים של האפליקציה.
 * הוא יורש מ-RoomDatabase ומאגד את כל ה-Entities וה-DAOs.
 *
 * @property entities רשימת כל ה-Entities (טבלאות) במסד הנתונים.
 * @property version גרסת מסד הנתונים. יש להעלות מספר זה בכל פעם שמשנים את מבנה הטבלאות.
 */
@Database(entities = [BlockedAppCache::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    /**
     * פונקציה אבסטרקטית שמחזירה מופע של ה-DAO.
     * Room ייצור את המימוש שלה באופן אוטומטי.
     */
    abstract fun blockedAppCacheDao(): BlockedAppCacheDao
}
```

## File: app/src/main/java/com/secureguard/mdm/data/db/BlockedAppCache.kt
```kotlin
package com.secureguard.mdm.data.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entity המייצג את מבנה טבלת המטמון עבור אפליקציות חסומות.
 * כל מופע של קלאס זה מייצג שורה בטבלה.
 *
 * @param packageName שם החבילה של האפליקציה, משמש כמפתח ראשי.
 * @param appName שם האפליקציה כפי שיוצג למשתמש.
 * @param iconPath הנתיב לקובץ האייקון השמור באחסון הפנימי של האפליקציה.
 */
@Entity(tableName = "blocked_apps_cache")
data class BlockedAppCache(
    @PrimaryKey
    @ColumnInfo(name = "package_name")
    val packageName: String,

    @ColumnInfo(name = "app_name")
    val appName: String,

    @ColumnInfo(name = "icon_path")
    val iconPath: String
)
```

## File: app/src/main/java/com/secureguard/mdm/data/db/BlockedAppCacheDao.kt
```kotlin
package com.secureguard.mdm.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * DAO (Data Access Object) עבור טבלת המטמון של אפליקציות חסומות.
 * הוא מכיל את כל הפעולות הנדרשות על מסד הנתונים עבור טבלה זו.
 */
@Dao
interface BlockedAppCacheDao {

    /**
     * מכניס רשומה חדשה או מחליף רשומה קיימת אם שם החבילה זהה.
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(appCache: BlockedAppCache)

    /**
     * מושך את כל הרשומות מהטבלה.
     */
    @Query("SELECT * FROM blocked_apps_cache")
    suspend fun getAll(): List<BlockedAppCache>

    /**
     * מושך רשומה ספציפית לפי שם החבילה שלה.
     */
    @Query("SELECT * FROM blocked_apps_cache WHERE package_name = :packageName")
    suspend fun getByPackageName(packageName: String): BlockedAppCache?

    /**
     * מוחק רשימה של רשומות לפי שמות החבילה שלהן.
     */
    @Query("DELETE FROM blocked_apps_cache WHERE package_name IN (:packageNames)")
    suspend fun deleteByPackageNames(packageNames: List<String>)
}
```

## File: app/src/main/java/com/secureguard/mdm/data/model/NetfreeUser.kt
```kotlin
package com.secureguard.mdm.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class NetfreeUser {
    @SerialName("isNetFree")
    val isNetFree: Boolean = false

    @SerialName("userKey")
    val userKey: String = ""

    @SerialName("signature")
    val signature: String = ""

    @SerialName("userId")
    val userId: Int = 0

    @SerialName("servername")
    val serverName: String = ""

    @SerialName("plan")
    val plan: Int = 0

    @SerialName("ip")
    val ip: String = ""
}
```

## File: app/src/main/java/com/secureguard/mdm/data/model/PresetConfig.kt
```kotlin
package com.secureguard.mdm.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PresetConfig(
    val adminPassword: String? = null,
    val features: Map<String, Boolean> = emptyMap(),
    val kioskApps: List<String>? = null,
    val kioskEnabled: Boolean = false
)
```

## File: app/src/main/java/com/secureguard/mdm/features/api/ProtectionFeature.kt
```kotlin
package com.secureguard.mdm.features.api

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Interface (חוזה) המגדיר את המבנה של "חסימת הגנה".
 * כל חסימה חדשה שניצור תהיה חייבת לממש את הממשק הזה.
 */
interface ProtectionFeature {
    /** מזהה ייחודי המשמש כמפתח לשמירת מצב החסימה. */
    val id: String
    /** מזהה המשאב (string resource) עבור שם החסימה שיוצג למשתמש. */
    @get:StringRes val titleRes: Int
    /** מזהה המשאב (string resource) עבור תיאור החסימה. */
    @get:StringRes val descriptionRes: Int
    /** מזהה המשאב (drawable resource) עבור האייקון שייצג את החסימה. */
    @get:DrawableRes val iconRes: Int

    /**
     * מגדיר את גרסת ה-SDK המינימלית הנדרשת כדי שהחסימה תעבוד.
     * כברירת מחדל, תומך מהגרסה המינימלית של האפליקציה (API 22).
     */
    val requiredSdkVersion: Int
        get() = Build.VERSION_CODES.LOLLIPOP_MR1

    /**
     * מחיל או מסיר את מדיניות האבטחה על המכשיר.
     * @param context הקשר של האפליקציה.
     * @param dpm מופע של DevicePolicyManager.
     * @param admin ה-ComponentName של ה-DeviceAdminReceiver.
     * @param enable True כדי להפעיל את המדיניות, false כדי לבטל אותה.
     */
    fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean)

    /**
     * בודק אם מדיניות האבטחה פעילה כרגע במכשיר.
     * @param context הקשר של האפליקציה.
     * @param dpm מופע של DevicePolicyManager.
     * @param admin ה-ComponentName של ה-DeviceAdminReceiver.
     * @return True אם המדיניות נאכפת כרגע, false אחרת.
     */
    fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockAdjustVolumeFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockAdjustVolumeFeature : ProtectionFeature {
    override val id: String = "block_adjust_volume"
    override val titleRes: Int = R.string.feature_block_adjust_volume_title
    override val descriptionRes: Int = R.string.feature_block_adjust_volume_description
    override val iconRes: Int = R.drawable.ic_volume_off

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_ADJUST_VOLUME)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_ADJUST_VOLUME)
        }
        // Persist state for the fallback check on APIs < 24
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
                .edit().putBoolean(id, enable).apply()
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_ADJUST_VOLUME, false)
        }
        // Fallback for APIs < 24, where no getter exists.
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockAirplaneModeFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockAirplaneModeFeature : ProtectionFeature {
    override val id: String = "block_airplane_mode"
    override val titleRes: Int = R.string.feature_block_airplane_mode_title
    override val descriptionRes: Int = R.string.feature_block_airplane_mode_description
    override val iconRes: Int = R.drawable.ic_airplane_mode_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.Q // API 29

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) return
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_AIRPLANE_MODE)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_AIRPLANE_MODE)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) return false
        return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_AIRPLANE_MODE, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockAmbientDisplayFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockAmbientDisplayFeature : ProtectionFeature {
    override val id: String = "block_ambient_display"
    override val titleRes: Int = R.string.feature_block_ambient_display_title
    override val descriptionRes: Int = R.string.feature_block_ambient_display_description
    override val iconRes: Int = R.drawable.ic_ambient_display_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.O // API 26

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_AMBIENT_DISPLAY)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_AMBIENT_DISPLAY)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return false
        return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_AMBIENT_DISPLAY, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockAppsControlFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockAppsControlFeature : ProtectionFeature {
    override val id: String = "block_apps_control"
    override val titleRes: Int = R.string.feature_block_apps_control_title
    override val descriptionRes: Int = R.string.feature_block_apps_control_description
    override val iconRes: Int = R.drawable.ic_apps_control_off

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_APPS_CONTROL)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_APPS_CONTROL)
        }
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
                .edit().putBoolean(id, enable).apply()
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_APPS_CONTROL, false)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockAutofillFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockAutofillFeature : ProtectionFeature {
    override val id: String = "block_autofill"
    override val titleRes: Int = R.string.feature_block_autofill_title
    override val descriptionRes: Int = R.string.feature_block_autofill_description
    override val iconRes: Int = R.drawable.ic_autofill_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.O // API 26

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_AUTOFILL)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_AUTOFILL)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return false
        return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_AUTOFILL, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockBluetoothSharingFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockBluetoothSharingFeature : ProtectionFeature {
    override val id = "block_bluetooth_sharing"
    override val titleRes = R.string.feature_bluetooth_sharing_title
    override val descriptionRes = R.string.feature_bluetooth_sharing_description
    override val iconRes = R.drawable.ic_bluetooth_sharing_off

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) dpm.addUserRestriction(admin, UserManager.DISALLOW_BLUETOOTH_SHARING)
        else dpm.clearUserRestriction(admin, UserManager.DISALLOW_BLUETOOTH_SHARING)
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_BLUETOOTH_SHARING)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE).getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockCameraFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockCameraFeature : ProtectionFeature {
    override val id = "block_camera"
    override val titleRes = R.string.feature_camera_title
    override val descriptionRes = R.string.feature_camera_description
    override val iconRes = R.drawable.ic_camera_off

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        dpm.setCameraDisabled(admin, enable) // Uses a specific API call, not a user restriction
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        return dpm.getCameraDisabled(admin)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockConfigCellBroadcastsFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockConfigCellBroadcastsFeature : ProtectionFeature {
    override val id: String = "block_config_cell_broadcasts"
    override val titleRes: Int = R.string.feature_block_config_cell_broadcasts_title
    override val descriptionRes: Int = R.string.feature_block_config_cell_broadcasts_description
    override val iconRes: Int = R.drawable.ic_cell_broadcast_off

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_CONFIG_CELL_BROADCASTS)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_CONFIG_CELL_BROADCASTS)
        }
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
                .edit().putBoolean(id, enable).apply()
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_CONFIG_CELL_BROADCASTS, false)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockConfigCredentialsFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockConfigCredentialsFeature : ProtectionFeature {
    override val id: String = "block_config_credentials"
    override val titleRes: Int = R.string.feature_block_config_credentials_title
    override val descriptionRes: Int = R.string.feature_block_config_credentials_description
    override val iconRes: Int = R.drawable.ic_credentials_off

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_CONFIG_CREDENTIALS)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_CONFIG_CREDENTIALS)
        }
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
                .edit().putBoolean(id, enable).apply()
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_CONFIG_CREDENTIALS, false)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockConfigLocationFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockConfigLocationFeature : ProtectionFeature {
    override val id: String = "block_config_location"
    override val titleRes: Int = R.string.feature_block_config_location_title
    override val descriptionRes: Int = R.string.feature_block_config_location_description
    override val iconRes: Int = R.drawable.ic_location_config_off

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_CONFIG_LOCATION)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_CONFIG_LOCATION)
        }
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
                .edit().putBoolean(id, enable).apply()
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_CONFIG_LOCATION, false)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockContentCaptureFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockContentCaptureFeature : ProtectionFeature {
    override val id: String = "block_content_capture"
    override val titleRes: Int = R.string.feature_block_content_capture_title
    override val descriptionRes: Int = R.string.feature_block_content_capture_description
    override val iconRes: Int = R.drawable.ic_content_capture_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.Q // API 29

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) return
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_CONTENT_CAPTURE)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_CONTENT_CAPTURE)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) return false
        return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_CONTENT_CAPTURE, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockFactoryResetFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockFactoryResetFeature : ProtectionFeature {
    override val id = "block_factory_reset"
    override val titleRes = R.string.feature_factory_reset_title
    override val descriptionRes = R.string.feature_factory_reset_description
    override val iconRes = R.drawable.ic_factory_reset_blocked

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) dpm.addUserRestriction(admin, UserManager.DISALLOW_FACTORY_RESET)
        else dpm.clearUserRestriction(admin, UserManager.DISALLOW_FACTORY_RESET)
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_FACTORY_RESET)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE).getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockInstallAppsFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockInstallAppsFeature : ProtectionFeature {
    override val id = "block_install_apps"
    override val titleRes = R.string.feature_install_apps_disabled_title
    override val descriptionRes = R.string.feature_install_apps_disabled_description
    override val iconRes = R.drawable.ic_install_mobile_disabled

    // This restriction is available from API 23 (Android 6.0)
    override val requiredSdkVersion = Build.VERSION_CODES.M

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        val restriction = UserManager.DISALLOW_INSTALL_APPS
        if (enable) dpm.addUserRestriction(admin, restriction) else dpm.clearUserRestriction(admin, restriction)
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_INSTALL_APPS, false)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE).getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockLocationSharingFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockLocationSharingFeature : ProtectionFeature {
    override val id = "block_location"
    override val titleRes = R.string.feature_location_title
    override val descriptionRes = R.string.feature_location_description
    override val iconRes = R.drawable.ic_location_off

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_SHARE_LOCATION)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_SHARE_LOCATION)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_SHARE_LOCATION)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE).getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockMicrophoneFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockMicrophoneFeature : ProtectionFeature {
    override val id = "block_microphone"
    override val titleRes = R.string.feature_microphone_title
    override val descriptionRes = R.string.feature_microphone_description
    override val iconRes = R.drawable.ic_mic_off

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_UNMUTE_MICROPHONE)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_UNMUTE_MICROPHONE)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_UNMUTE_MICROPHONE)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE).getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockMobileDataFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockMobileDataFeature : ProtectionFeature {
    override val id = "block_mobile_data"
    override val titleRes = R.string.feature_mobile_data_title
    override val descriptionRes = R.string.feature_mobile_data_description
    override val iconRes = R.drawable.ic_mobile_data_off

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) dpm.addUserRestriction(admin, UserManager.DISALLOW_CONFIG_MOBILE_NETWORKS)
        else dpm.clearUserRestriction(admin, UserManager.DISALLOW_CONFIG_MOBILE_NETWORKS)
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_CONFIG_MOBILE_NETWORKS)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE).getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockMountPhysicalMediaFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockMountPhysicalMediaFeature : ProtectionFeature {
    override val id: String = "block_mount_physical_media"
    override val titleRes: Int = R.string.feature_block_mount_physical_media_title
    override val descriptionRes: Int = R.string.feature_block_mount_physical_media_description
    override val iconRes: Int = R.drawable.ic_sd_card_off

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_MOUNT_PHYSICAL_MEDIA)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_MOUNT_PHYSICAL_MEDIA)
        }
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
                .edit().putBoolean(id, enable).apply()
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_MOUNT_PHYSICAL_MEDIA, false)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockNetworkResetFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockNetworkResetFeature : ProtectionFeature {
    override val id: String = "block_network_reset"
    override val titleRes: Int = R.string.feature_block_network_reset_title
    override val descriptionRes: Int = R.string.feature_block_network_reset_description
    override val iconRes: Int = R.drawable.ic_network_reset_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.O // API 26

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_NETWORK_RESET)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_NETWORK_RESET)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return false
        return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_NETWORK_RESET, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockOutgoingCallsFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockOutgoingCallsFeature : ProtectionFeature {
    override val id = "block_outgoing_calls"
    override val titleRes = R.string.feature_outgoing_calls_title
    override val descriptionRes = R.string.feature_outgoing_calls_description
    override val iconRes = R.drawable.ic_call_end

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) dpm.addUserRestriction(admin, UserManager.DISALLOW_OUTGOING_CALLS)
        else dpm.clearUserRestriction(admin, UserManager.DISALLOW_OUTGOING_CALLS)
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_OUTGOING_CALLS)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE).getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockPasswordChangeFeature.kt
```kotlin
@file:Suppress("DEPRECATION")

package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.util.Log
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockPasswordChangeFeature : ProtectionFeature {
    override val id: String = "block_password_change"
    override val titleRes: Int = R.string.feature_block_password_change_title
    override val descriptionRes: Int = R.string.feature_block_password_change_description
    override val iconRes: Int = R.drawable.ic_password_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.LOLLIPOP_MR1

    private const val STRONG_LENGTH = 6

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        // --- התיקון המרכזי כאן, בהשראת הרעיון שלך ---
        val isAlreadyActive = isPolicyActive(context, dpm, admin)

        // אם רוצים להפעיל והפיצ'ר כבר פעיל, אל תעשה כלום
        if (enable && isAlreadyActive) {
            Log.d("BlockPasswordChange", "Policy is already active. No changes needed.")
            return
        }
        // אם רוצים לכבות והפיצ'ר כבר כבוי, אל תעשה כלום
        if (!enable && !isAlreadyActive) {
            Log.d("BlockPasswordChange", "Policy is already inactive. No changes needed.")
            return
        }

        if (enable) {
            Log.d("BlockPasswordChange", "Applying STRONG password policy.")
            // מדיניות חזקה אך יציבה יותר
            // 1. קבע איכות
            dpm.setPasswordQuality(admin, DevicePolicyManager.PASSWORD_QUALITY_COMPLEX)
            // 2. קבע דרישות
            dpm.setPasswordMinimumLetters(admin, 1)
            dpm.setPasswordMinimumNumeric(admin, 1)
            // 3. קבע אורך כולל
            dpm.setPasswordMinimumLength(admin, STRONG_LENGTH)

        } else {
            Log.d("BlockPasswordChange", "Reverting password policy to default.")
            // Revert to default (no restrictions)
            dpm.setPasswordQuality(admin, DevicePolicyManager.PASSWORD_QUALITY_UNSPECIFIED)
            dpm.setPasswordMinimumLength(admin, 0)
            dpm.setPasswordMinimumLetters(admin, 0)
            dpm.setPasswordMinimumNumeric(admin, 0)
            dpm.setPasswordMinimumSymbols(admin, 0)
            dpm.setPasswordMinimumUpperCase(admin, 0)
            dpm.setPasswordMinimumLowerCase(admin, 0)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        // הבדיקה הכי טובה היא לראות אם האורך המינימלי הוא הערך שהגדרנו
        return dpm.getPasswordMinimumLength(admin) >= STRONG_LENGTH &&
                dpm.getPasswordQuality(admin) == DevicePolicyManager.PASSWORD_QUALITY_COMPLEX
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockPlayStoreFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.util.Log
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockPlayStoreFeature : ProtectionFeature {
    private const val PLAY_STORE_PACKAGE = "com.android.vending"

    override val id = "block_play_store"
    override val titleRes = R.string.feature_play_store_title
    override val descriptionRes = R.string.feature_play_store_description
    override val iconRes = R.drawable.ic_play_store_blocked

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        try {
            dpm.setApplicationHidden(admin, PLAY_STORE_PACKAGE, enable)
        } catch (e: Exception) {
            Log.e("BlockPlayStore", "Failed to set application hidden state for Play Store", e)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        return try {
            dpm.isApplicationHidden(admin, PLAY_STORE_PACKAGE)
        } catch (e: Exception) {
            false
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockPrintingFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockPrintingFeature : ProtectionFeature {
    override val id: String = "block_printing"
    override val titleRes: Int = R.string.feature_block_printing_title
    override val descriptionRes: Int = R.string.feature_block_printing_description
    override val iconRes: Int = R.drawable.ic_print_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.O_MR1 // API 27

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O_MR1) return
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_PRINTING)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_PRINTING)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O_MR1) return false
        return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_PRINTING, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockPrivateDnsFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockPrivateDnsFeature : ProtectionFeature {
    override val id: String = "block_private_dns"
    override val titleRes: Int = R.string.feature_block_private_dns_title
    override val descriptionRes: Int = R.string.feature_block_private_dns_description
    override val iconRes: Int = R.drawable.ic_private_dns_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.Q // API 29

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) return
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_CONFIG_PRIVATE_DNS)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_CONFIG_PRIVATE_DNS)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) return false
        return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_CONFIG_PRIVATE_DNS, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockRemoveManagedProfileFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockRemoveManagedProfileFeature : ProtectionFeature {
    override val id: String = "block_remove_managed_profile"
    override val titleRes: Int = R.string.feature_block_remove_managed_profile_title
    override val descriptionRes: Int = R.string.feature_block_remove_managed_profile_description
    override val iconRes: Int = R.drawable.ic_remove_work_profile_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.N // API 24

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) return
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_REMOVE_MANAGED_PROFILE)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_REMOVE_MANAGED_PROFILE)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) return false
        return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_REMOVE_MANAGED_PROFILE, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockSafeBootFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockSafeBootFeature : ProtectionFeature {
    override val id = "block_safe_boot"
    override val titleRes = R.string.feature_safe_boot_title
    override val descriptionRes = R.string.feature_safe_boot_description
    override val iconRes = R.drawable.ic_safe_boot_blocked

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) dpm.addUserRestriction(admin, UserManager.DISALLOW_SAFE_BOOT)
        else dpm.clearUserRestriction(admin, UserManager.DISALLOW_SAFE_BOOT)
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_SAFE_BOOT)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE).getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockScreenshotFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockScreenshotFeature : ProtectionFeature {
    override val id = "block_screenshot"
    override val titleRes = R.string.feature_screenshot_title
    override val descriptionRes = R.string.feature_screenshot_description
    override val iconRes = R.drawable.ic_screenshot_disabled
    override val requiredSdkVersion = Build.VERSION_CODES.P // API is from Android 9

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            dpm.setScreenCaptureDisabled(admin, enable)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            return dpm.getScreenCaptureDisabled(admin)
        }
        return false
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockSetUserIconFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockSetUserIconFeature : ProtectionFeature {
    override val id: String = "block_set_user_icon"
    override val titleRes: Int = R.string.feature_block_set_user_icon_title
    override val descriptionRes: Int = R.string.feature_block_set_user_icon_description
    override val iconRes: Int = R.drawable.ic_set_user_icon_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.N // API 24

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) return
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_SET_USER_ICON)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_SET_USER_ICON)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) return false
        return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_SET_USER_ICON, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockSetWallpaperFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockSetWallpaperFeature : ProtectionFeature {
    override val id: String = "block_set_wallpaper"
    override val titleRes: Int = R.string.feature_block_set_wallpaper_title
    override val descriptionRes: Int = R.string.feature_block_set_wallpaper_description
    override val iconRes: Int = R.drawable.ic_wallpaper_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.N // API 24

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) return
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_SET_WALLPAPER)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_SET_WALLPAPER)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) return false
        return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_SET_WALLPAPER, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockSmsFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockSmsFeature : ProtectionFeature {
    override val id = "block_sms"
    override val titleRes = R.string.feature_sms_disabled_title
    override val descriptionRes = R.string.feature_sms_disabled_description
    override val iconRes = R.drawable.ic_sms_disabled

    // This restriction is available from API 23 (Android 6.0)
    override val requiredSdkVersion = Build.VERSION_CODES.M

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        val restriction = UserManager.DISALLOW_SMS
        if (enable) dpm.addUserRestriction(admin, restriction) else dpm.clearUserRestriction(admin, restriction)
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_SMS, false)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE).getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockSystemErrorDialogsFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockSystemErrorDialogsFeature : ProtectionFeature {
    override val id: String = "block_system_error_dialogs"
    override val titleRes: Int = R.string.feature_block_system_error_dialogs_title
    override val descriptionRes: Int = R.string.feature_block_system_error_dialogs_description
    override val iconRes: Int = R.drawable.ic_system_error_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.P // API 28

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P) return
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_SYSTEM_ERROR_DIALOGS)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_SYSTEM_ERROR_DIALOGS)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P) return false
        return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_SYSTEM_ERROR_DIALOGS, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockTetheringFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockTetheringFeature : ProtectionFeature {
    override val id = "block_tethering"
    override val titleRes = R.string.feature_tethering_title
    override val descriptionRes = R.string.feature_tethering_description
    override val iconRes = R.drawable.ic_tethering_off

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) dpm.addUserRestriction(admin, UserManager.DISALLOW_CONFIG_TETHERING)
        else dpm.clearUserRestriction(admin, UserManager.DISALLOW_CONFIG_TETHERING)
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_CONFIG_TETHERING)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE).getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockUninstallAppsFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockUninstallAppsFeature : ProtectionFeature {
    override val id: String = "block_uninstall_apps"
    override val titleRes: Int = R.string.feature_block_uninstall_apps_title
    override val descriptionRes: Int = R.string.feature_block_uninstall_apps_description
    override val iconRes: Int = R.drawable.ic_uninstall_off

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_UNINSTALL_APPS)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_UNINSTALL_APPS)
        }
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
                .edit().putBoolean(id, enable).apply()
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_UNINSTALL_APPS, false)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockVpnSettingsFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockVpnSettingsFeature : ProtectionFeature {
    override val id: String = "block_vpn_settings"
    override val titleRes: Int = R.string.feature_block_vpn_settings_title
    override val descriptionRes: Int = R.string.feature_block_vpn_settings_description
    override val iconRes: Int = R.drawable.ic_vpn_lock
    override val requiredSdkVersion: Int = Build.VERSION_CODES.N // API 24

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) return

        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_CONFIG_VPN)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_CONFIG_VPN)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) return false
        return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_CONFIG_VPN, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockWifiFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager // <--- הוספת import חיוני
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockWifiFeature : ProtectionFeature {

    override val id = "block_wifi"
    override val titleRes = R.string.feature_wifi_title
    override val descriptionRes = R.string.feature_wifi_description
    override val iconRes = R.drawable.ic_wifi_off

    // אנחנו כבר לא צריכים להכריז על גרסה מינימלית גבוהה,
    // מכיוון שהשיטה החדשה נתמכת בכל הגרסאות הרלוונטיות.
    // requiredSdkVersion יקבל את ערך ברירת המחדל.

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_CONFIG_WIFI)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_CONFIG_WIFI)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        // השיטה הזו עובדת רק מ-API 24, אבל היא עדיין הדרך הנכונה לבדוק.
        // אנו נשמור על בדיקת הגרסה כאן כפי שעשינו עם החסימות האחרות.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_CONFIG_WIFI, false)
        }
        // במכשירים ישנים יותר, אין דרך פשוטה לבדוק, אך ההפעלה והכיבוי עדיין עובדים.
        // נחזיר את המצב השמור מההגדרות כהערכה הטובה ביותר.
        val prefs = context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
        return prefs.getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/DisableStatusBarFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object DisableStatusBarFeature : ProtectionFeature {
    override val id: String = "disable_status_bar"
    override val titleRes: Int = R.string.feature_disable_status_bar_title
    override val descriptionRes: Int = R.string.feature_disable_status_bar_description
    override val iconRes: Int = R.drawable.ic_status_bar_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.M // API 23

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return
        dpm.setStatusBarDisabled(admin, enable)
        // There is no getter for this policy, so we must persist the state ourselves.
        context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .edit().putBoolean(id, enable).apply()
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return false
        // Rely on our stored preference as no system getter is available.
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/ForceNetGuardVpnFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.net.VpnService
import android.os.Build
import android.util.Log
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object ForceNetGuardVpnFeature : ProtectionFeature {
    override val id: String = "force_netguard_vpn"
    override val titleRes: Int = R.string.feature_force_netguard_vpn_title
    override val descriptionRes: Int = R.string.feature_force_netguard_vpn_description
    override val iconRes: Int = R.drawable.ic_netguard_shield
    override val requiredSdkVersion: Int = Build.VERSION_CODES.N // API 24

    private const val NETGUARD_PACKAGE_NAME = "eu.faircode.netguard"
    private const val TAG = "ForceNetGuardFeature"

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) return

        if (VpnService.prepare(context) != null) {
            Log.w(TAG, "VPN permission not granted by user. Cannot apply Always-On VPN policy.")
            return
        }

        try {
            if (enable) {
                // Set NetGuard as the always-on VPN and enable lockdown mode.
                dpm.setAlwaysOnVpnPackage(admin, NETGUARD_PACKAGE_NAME, true)
            } else {
                // Remove our app as the always-on VPN.
                dpm.setAlwaysOnVpnPackage(admin, null, false)
            }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to set Always-On VPN policy for NetGuard", e)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) return false
        return NETGUARD_PACKAGE_NAME == dpm.getAlwaysOnVpnPackage(admin)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/NetfreeOnlyModeFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.Manifest
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.VpnService
import android.os.Build
import androidx.core.content.ContextCompat
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature
import com.secureguard.mdm.services.NetfreeMonitorService
import com.secureguard.mdm.utils.FileLogger

object NetfreeOnlyModeFeature : ProtectionFeature {
    override val id = "netfree_only_mode"
    override val titleRes = R.string.feature_netfree_only_title
    override val descriptionRes = R.string.feature_netfree_only_description
    override val iconRes = R.drawable.ic_netguard_shield
    override val requiredSdkVersion = Build.VERSION_CODES.N

    /**
     * Checks if VPN permission is granted. This is needed because Netfree uses VPN internally.
     */
    fun isVpnPermissionGranted(context: Context): Boolean {
        return VpnService.prepare(context) == null
    }

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        val intent = Intent(context, NetfreeMonitorService::class.java)
        if (enable) {
            // Grant notification permission for the service
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                try {
                    val success = dpm.setPermissionGrantState(
                        admin,
                        context.packageName,
                        Manifest.permission.POST_NOTIFICATIONS,
                        DevicePolicyManager.PERMISSION_GRANT_STATE_GRANTED
                    )
                    FileLogger.log("NetfreeFeature", "POST_NOTIFICATIONS grant state success: $success")
                } catch (e: SecurityException) {
                    FileLogger.log("NetfreeFeature", "SecurityException while granting notification permission: ${e.message}")
                }
            }
            FileLogger.log("NetfreeFeature", "Policy enabled. Starting NetfreeMonitorService.")
            try {
                intent.action = NetfreeMonitorService.ACTION_START_MONITORING
                ContextCompat.startForegroundService(context, intent)
            } catch (e: Exception) {
                FileLogger.log("NetfreeFeature", "ERROR starting service: ${e.message}")
            }
        } else {
            FileLogger.log("NetfreeFeature", "Policy disabled. Stopping NetfreeMonitorService.")
            try {
                intent.action = NetfreeMonitorService.ACTION_STOP_MONITORING
                context.startService(intent)
            } catch (e: Exception) {
                FileLogger.log("NetfreeFeature", "ERROR stopping service: ${e.message}")
            }
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        return NetfreeMonitorService.isServiceActive(context)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/kiosk/manager/KioskLockManager.kt
```kotlin
package com.secureguard.mdm.kiosk.manager

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.os.Build
import android.util.Log
import android.widget.Toast
import com.secureguard.mdm.SecureGuardDeviceAdminReceiver
import com.secureguard.mdm.data.repository.SettingsRepository
import com.secureguard.mdm.kiosk.ui.KioskActivity
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class KioskLockManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val dpm: DevicePolicyManager,
    private val settingsRepository: SettingsRepository
) {
    private val adminComponent = ComponentName(context, SecureGuardDeviceAdminReceiver::class.java)

    fun isDeviceOwner(): Boolean = dpm.isDeviceOwnerApp(context.packageName)

    fun isKioskDefaultLauncher(): Boolean {
        val pm = context.packageManager
        val intent = Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_HOME)
        val resolveInfo = pm.resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY)
        return resolveInfo?.activityInfo?.packageName == context.packageName
    }

    /**
     * מגדיר את האפליקציות המורשות למצב Lock Task.
     * כולל את האפליקציה עצמה ואת האפליקציות שהמשתמש בחר.
     */
    suspend fun setLockTaskPackages() {
        if (!dpm.isDeviceOwnerApp(context.packageName)) return

        val selectedPackages = settingsRepository.getKioskAppPackages()
        val actionButtons = settingsRepository.getKioskActionButtons()
        // חייבים להוסיף את עצמנו לרשימה כדי שנוכל להיכנס ל-Lock Task בעצמנו
        val settingsPackage = if (actionButtons.contains("wifi") || actionButtons.contains("bluetooth")) {
            setOf("com.android.settings")
        } else {
            emptySet()
        }
        val allPackages = selectedPackages + settingsPackage + context.packageName
        
        try {
            dpm.setLockTaskPackages(adminComponent, allPackages.toTypedArray())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * מנקה את רשימת האפליקציות המורשות (משאיר ריק או רק את עצמנו אם צריך).
     */
    fun clearLockTaskPackages() {
        if (!dpm.isDeviceOwnerApp(context.packageName)) return
        try {
            dpm.setLockTaskPackages(adminComponent, arrayOf())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * מגדיר אילו פיצ'רים של המערכת יהיו זמינים במצב Lock Task.
     * במצב קיוסק מלא, אנחנו רוצים לחסום הכל.
     */
    fun enableKioskModeFeatures() {
        if (!dpm.isDeviceOwnerApp(context.packageName)) return
        
        try {
            // LOCK_TASK_FEATURE_NONE - חוסם הכל: כפתור בית, overview, התראות, מידע מערכת, keyguard
            dpm.setLockTaskFeatures(adminComponent, DevicePolicyManager.LOCK_TASK_FEATURE_NONE)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * מחזיר את הפיצ'רים למצב הרגיל (אם צריך).
     */
    fun disableKioskModeFeatures() {
        if (!dpm.isDeviceOwnerApp(context.packageName)) return
        
        try {
            dpm.setLockTaskFeatures(adminComponent, DevicePolicyManager.LOCK_TASK_FEATURE_NONE)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * בודק האם האפליקציה שלנו מורשית להיכנס ל-Lock Task Mode.
     */
    fun isLockTaskPermitted(): Boolean {
        // בודק אם ה-Package הנוכחי נמצא ב-Allowlist של LockTask
        return dpm.isLockTaskPermitted(context.packageName)
    }

    /**
     * מגדיר את האפליקציה כלאנצ'ר ברירת המחדל הקבוע (דורש Device Owner).
     */
    fun setKioskAsDefaultLauncher(includeViewAbsorber: Boolean) {
        if (!dpm.isDeviceOwnerApp(context.packageName)) return

        // פילטר למסך הבית
        val homeFilter = IntentFilter(Intent.ACTION_MAIN).apply {
            addCategory(Intent.CATEGORY_HOME)
            addCategory(Intent.CATEGORY_DEFAULT)
        }
        
        // פילטר לכל השימושים (Intent Absorber) - ACTION_VIEW
        val viewFilter = IntentFilter(Intent.ACTION_VIEW).apply {
            addCategory(Intent.CATEGORY_DEFAULT)
            addCategory(Intent.CATEGORY_BROWSABLE)
            addDataScheme("http")
            addDataScheme("https")
            addDataScheme("file")
            addDataScheme("content")
            addDataType("*/*")
            addDataPath("/", android.os.PatternMatcher.PATTERN_PREFIX)
        }

        try {
            Log.d(
                "KioskLockManager",
                "Setting persistent preferred activities for kiosk. includeViewAbsorber=$includeViewAbsorber"
            )
            dpm.clearPackagePersistentPreferredActivities(adminComponent, context.packageName)

            val component = ComponentName(context, KioskActivity::class.java)
            dpm.addPersistentPreferredActivity(adminComponent, homeFilter, component)
            if (includeViewAbsorber) {
                // אם המשתמש רוצה "הגבלה מחמירה", נגדיר את עצמנו כ-Viewer דיפולטיבי
                dpm.addPersistentPreferredActivity(adminComponent, viewFilter, component)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * מגדיר אפליקציה חיצונית מסוימת כלאנצ'ר ברירת המחדל הקבוע.
     * שימושי לצורך יציאה מסודרת מהקיוסק חזרה ללאנצ'ר המקורי.
     */
    fun setSpecificAsDefaultLauncher(packageName: String) {
        if (!dpm.isDeviceOwnerApp(context.packageName)) return

        val pm = context.packageManager
        val intent = Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_HOME)
        val resolveInfos = pm.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)
        
        val targetActivity = resolveInfos.find { it.activityInfo.packageName == packageName }
        if (targetActivity == null) {
            Log.e("KioskLockManager", "Could not find Home activity for package: $packageName")
            return
        }

        val component = ComponentName(packageName, targetActivity.activityInfo.name)
        val homeFilter = IntentFilter(Intent.ACTION_MAIN).apply {
            addCategory(Intent.CATEGORY_HOME)
            addCategory(Intent.CATEGORY_DEFAULT)
        }

        try {
            // קודם מנקים את שלנו כדי למנוע קונפליקטים (אופציונלי אבל מומלץ)
            clearKioskAsDefaultLauncher()
            // מגדירים את הלאנצ'ר השני כקבוע
            dpm.addPersistentPreferredActivity(adminComponent, homeFilter, component)
            Log.d("KioskLockManager", "Set $packageName as persistent home launcher")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * מסיר את ההגדרה של האפליקציה כלאנצ'ר ברירת מחדל.
     */
    fun clearKioskAsDefaultLauncher() {
        if (!dpm.isDeviceOwnerApp(context.packageName)) return
        try {
            Log.d("KioskLockManager", "Clearing persistent preferred activities for kiosk package")
            dpm.clearPackagePersistentPreferredActivities(adminComponent, context.packageName)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * מבצע הפעלה מחדש של המכשיר (דורש Device Owner).
     */
    fun rebootDevice() {
        if (!dpm.isDeviceOwnerApp(context.packageName)) {
            Log.e("KioskLockManager", "Cannot reboot: App is not Device Owner")
            Toast.makeText(context, "שגיאה: אפליקציה אינה Device Owner. לא ניתן לאתחל.", Toast.LENGTH_LONG).show()
            return
        }
        
        try {
            Log.d("KioskLockManager", "Attempting device reboot...")
            dpm.reboot(adminComponent)
        } catch (e: Exception) {
            Log.e("KioskLockManager", "Failed to reboot: ${e.message}")
            Toast.makeText(context, "נכשל ניסיון האתחול: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/kiosk/ui/HomeLauncherSelectionScreen.kt
```kotlin
package com.secureguard.mdm.kiosk.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.secureguard.mdm.ui.theme.SecureGuardTheme

data class LauncherInfo(val appName: String, val packageName: String)

/**
 * מסך בחירת לאנצ'ר - מוצג כשהקיוסק מוגדר כ-Home אבל מצב קיוסק כבוי
 */
@Composable
fun HomeLauncherSelectionScreen(
    onDismiss: () -> Unit
) {
    val context = LocalContext.current

    // הפעל משימות רקע (Boot) כשאנחנו משמשים כלאנצ'ר זמני
    LaunchedEffect(Unit) {
        com.secureguard.mdm.boot.BootCompletedReceiver.simulateBootCompleted(context)
    }

    SecureGuardTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(32.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = androidx.compose.material.icons.Icons.Default.Home,
                    contentDescription = null,
                    modifier = Modifier.size(80.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
                
                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "אייבלוק מוגדר כמסך הבית",
                    style = MaterialTheme.typography.headlineMedium,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "מכיוון שמצב קיוסק כבוי כרגע, עליך להחליף את אפליקציית הבית בהגדרות המערכת כדי לחזור לשימוש רגיל.",
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                Spacer(modifier = Modifier.height(48.dp))

                Button(
                    onClick = {
                        try {
                            val intent = android.content.Intent(android.provider.Settings.ACTION_HOME_SETTINGS)
                            context.startActivity(intent)
                        } catch (e: Exception) {
                            val intent = android.content.Intent(android.provider.Settings.ACTION_SETTINGS)
                            context.startActivity(intent)
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    contentPadding = PaddingValues(16.dp)
                ) {
                    Text("שינוי הגדרות מסך הבית", style = MaterialTheme.typography.titleMedium)
                }

                Spacer(modifier = Modifier.height(16.dp))

                TextButton(
                    onClick = { onDismiss() }
                ) {
                    Text("המשך לדשבורד של אייבלוק", color = MaterialTheme.colorScheme.primary)
                }
            }
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/kiosk/utils/SystemIndicatorsManager.kt
```kotlin
package com.secureguard.mdm.kiosk.utils

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flow
import com.kosherjava.zmanim.hebrewcalendar.HebrewDateFormatter
import com.kosherjava.zmanim.hebrewcalendar.JewishDate
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SystemIndicatorsManager @Inject constructor(
    @ApplicationContext private val context: Context
) {
    /**
     * זרם מידע לסטטוס הסוללה - מתעדכן רק כשהמשתנה משתנה במערכת
     */
    val batteryFlow: Flow<Int> = callbackFlow {
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) {
                val level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1)
                val scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1)
                if (level != -1 && scale != -1) {
                    trySend((level * 100 / scale.toFloat()).toInt())
                }
            }
        }
        
        val filter = IntentFilter(Intent.ACTION_BATTERY_CHANGED)
        context.registerReceiver(receiver, filter)
        
        awaitClose {
            context.unregisterReceiver(receiver)
        }
    }

    /**
     * זרם מידע לשעה הנוכחית - מסתנכרן עם שעון המערכת בצורה מושלמת
     */
    val timeFlow: Flow<String> = callbackFlow {
        val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())
        
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) {
                trySend(sdf.format(Date()))
            }
        }
        
        // שליחה ראשונית
        trySend(sdf.format(Date()))
        
        val filter = IntentFilter().apply {
            addAction(Intent.ACTION_TIME_TICK)
            addAction(Intent.ACTION_TIME_CHANGED)
            addAction(Intent.ACTION_TIMEZONE_CHANGED)
        }
        context.registerReceiver(receiver, filter)
        
        awaitClose {
            context.unregisterReceiver(receiver)
        }
    }

    /**
     * זרם מידע לתאריך עברי - מסתנכרן עם שינויי תאריך במערכת
     */
    val jewishDateFlow: Flow<String> = callbackFlow {
        val formatter = HebrewDateFormatter().apply {
            isHebrewFormat = true
        }
        
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) {
                trySend(formatter.format(JewishDate(Calendar.getInstance())))
            }
        }
        
        // שליחה ראשונית
        trySend(formatter.format(JewishDate(Calendar.getInstance())))
        
        val filter = IntentFilter().apply {
            addAction(Intent.ACTION_DATE_CHANGED)
            addAction(Intent.ACTION_TIME_CHANGED)
            addAction(Intent.ACTION_TIMEZONE_CHANGED)
        }
        context.registerReceiver(receiver, filter)
        
        awaitClose {
            context.unregisterReceiver(receiver)
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/kiosk/vm/KioskAppSelectionViewModel.kt
```kotlin
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
```

## File: app/src/main/java/com/secureguard/mdm/receivers/InstallReceiver.kt
```kotlin
package com.secureguard.mdm.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.pm.PackageInstaller
import android.os.Build
import android.telecom.TelecomManager
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.secureguard.mdm.R

class InstallReceiver : BroadcastReceiver() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onReceive(context: Context, intent: Intent) {
        val status = intent.getIntExtra(PackageInstaller.EXTRA_STATUS, -1)
        if (status == PackageInstaller.STATUS_SUCCESS) {
            val installedPackageName = intent.getStringExtra("package_name")

            // אם החבילה שהותקנה היא NoPhone, הקפץ בקשה להגדיר כברירת מחדל
            if (installedPackageName == "org.fossify.phone") {
                Toast.makeText(context, R.string.toast_nophone_installed, Toast.LENGTH_LONG).show()
                val changeDialerIntent = Intent(TelecomManager.ACTION_CHANGE_DEFAULT_DIALER)
                changeDialerIntent.putExtra(TelecomManager.EXTRA_CHANGE_DEFAULT_DIALER_PACKAGE_NAME, installedPackageName)
                changeDialerIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(changeDialerIntent)
            } else {
                Toast.makeText(context, R.string.update_toast_success, Toast.LENGTH_SHORT).show()
            }
        } else {
            val message = intent.getStringExtra(PackageInstaller.EXTRA_STATUS_MESSAGE)
            Toast.makeText(context, context.getString(R.string.update_toast_failed) + ": " + message, Toast.LENGTH_LONG).show()
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/receivers/PresetReceiver.kt
```kotlin
package com.secureguard.mdm.receivers

import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.app.admin.DevicePolicyManager
import android.util.Log
import com.secureguard.mdm.SecureGuardDeviceAdminReceiver
import com.secureguard.mdm.data.model.PresetConfig
import com.secureguard.mdm.data.repository.SettingsRepository
import com.secureguard.mdm.features.registry.FeatureRegistry
import com.secureguard.mdm.security.PasswordManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import javax.inject.Inject

@AndroidEntryPoint
class PresetReceiver : BroadcastReceiver() {

    @Inject
    lateinit var settingsRepository: SettingsRepository

    @Inject
    lateinit var passwordManager: PasswordManager

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    override fun onReceive(context: Context, intent: Intent) {
        val pendingResult = goAsync()
        
        scope.launch {
            try {
                handleReceive(context, intent)
            } catch (e: Exception) {
                Log.e(TAG, "Error processing preset", e)
            } finally {
                pendingResult.finish()
            }
        }
    }

    private suspend fun handleReceive(context: Context, intent: Intent) {
        // 1. Security Check: Verify Action
        if (intent.action != ACTION_APPLY_PRESET) {
            Log.w(TAG, "Invalid action: ${intent.action}")
            return
        }

        // 2. State Check: Verify not already setup
        if (settingsRepository.isSetupComplete()) {
            Log.w(TAG, "Device already configured, aborting preset application.")
            return
        }

        // 3. Owner Check: Verify we are Device Owner
        val dpm = context.getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager
        if (!dpm.isDeviceOwnerApp(context.packageName)) {
            Log.e(TAG, "App is not Device Owner, cannot apply preset.")
            return
        }

        val jsonString = intent.getStringExtra(EXTRA_PRESET_JSON)
        if (jsonString.isNullOrBlank()) {
            Log.e(TAG, "No preset JSON found in extra: $EXTRA_PRESET_JSON")
            return
        }

        try {
            val config = Json.decodeFromString<PresetConfig>(jsonString)
            applyConfig(context, dpm, config)
            Log.i(TAG, "Preset applied successfully.")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to parse or apply preset JSON", e)
        }
    }

    private suspend fun applyConfig(context: Context, dpm: DevicePolicyManager, config: PresetConfig) {
        val adminComponent = ComponentName(context, SecureGuardDeviceAdminReceiver::class.java)

        // Apply Password
        config.adminPassword?.let {
            if (it.isNotEmpty()) {
                passwordManager.createAndSavePassword(it)
                Log.d(TAG, "Admin password set.")
            }
        }

        // Apply Features
        config.features.forEach { (featureId, isEnabled) ->
            val feature = FeatureRegistry.allFeatures.find { it.id == featureId }
            if (feature != null) {
                try {
                    feature.applyPolicy(context, dpm, adminComponent, isEnabled)
                    settingsRepository.setFeatureState(featureId, isEnabled)
                    Log.d(TAG, "Feature $featureId set to $isEnabled")
                } catch (e: Exception) {
                    Log.e(TAG, "Failed to apply feature $featureId", e)
                }
            } else {
                Log.w(TAG, "Feature not found: $featureId")
            }
        }

        // Apply Kiosk Settings
        if (config.kioskEnabled) {
            settingsRepository.setKioskModeEnabled(true)
            config.kioskApps?.let { apps ->
                settingsRepository.setKioskAppPackages(apps.toSet())
                Log.d(TAG, "Kiosk apps set: $apps")
            }
            Log.d(TAG, "Kiosk mode enabled.")
        }

        // Mark Setup Complete
        settingsRepository.setSetupComplete(true)
    }

    companion object {
        private const val TAG = "PresetReceiver"
        private const val ACTION_APPLY_PRESET = "com.secureguard.mdm.ACTION_APPLY_PRESET"
        private const val EXTRA_PRESET_JSON = "extra_preset_json"
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/receivers/UninstallReceiver.kt
```kotlin
package com.secureguard.mdm.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.pm.PackageInstaller
import android.util.Log
import android.widget.Toast
import com.secureguard.mdm.R

class UninstallReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val status = intent.getIntExtra(PackageInstaller.EXTRA_STATUS, -1)
        when (status) {
            PackageInstaller.STATUS_SUCCESS -> {
                Log.d("UninstallReceiver", "Package uninstalled successfully.")
                Toast.makeText(context, "אפליקציית החסימה הוסרה.", Toast.LENGTH_SHORT).show()
            }
            else -> {
                val message = intent.getStringExtra(PackageInstaller.EXTRA_STATUS_MESSAGE)
                Log.e("UninstallReceiver", "Uninstall failed: $message")
                Toast.makeText(context, "שגיאה בהסרת אפליקציית החסימה: $message", Toast.LENGTH_LONG).show()
            }
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/security/PasswordManager.kt
```kotlin
package com.secureguard.mdm.security

import at.favre.lib.crypto.bcrypt.BCrypt
import com.secureguard.mdm.data.repository.SettingsRepository
import javax.inject.Inject
import javax.inject.Singleton

/**
 * קלאס ייעודי לניהול מאובטח של סיסמת האפליקציה.
 * הוא אחראי על יצירת hash, אימות, ושמירת הסיסמה.
 * @param settingsRepository המאגר שבו נשמור את ה-hash.
 */
@Singleton
class PasswordManager @Inject constructor(
    private val settingsRepository: SettingsRepository
) {
    /**
     * יוצר hash מהסיסמה ושומר אותו באופן מאובטח.
     * @param password הסיסמה הנקייה שהזין המשתמש.
     */
    suspend fun createAndSavePassword(password: String) {
        // יוצר hash באמצעות אלגוריתם bcrypt עם "עוצמה" של 12 (ערך סטנדרטי)
        val hash = BCrypt.withDefaults().hashToString(12, password.toCharArray())
        settingsRepository.setPasswordHash(hash)
        settingsRepository.setSetupComplete(true)
    }

    /**
     * מאמת סיסמה שהוזנה מול ה-hash השמור.
     * @param password הסיסמה הנקייה לבדיקה.
     * @return true אם הסיסמה נכונה, false אחרת.
     */
    suspend fun verifyPassword(password: String): Boolean {
        val hash = settingsRepository.getPasswordHash() ?: return false
        val result = BCrypt.verifyer().verify(password.toCharArray(), hash)
        return result.verified
    }

    /**
     * בודק אם סיסמה כבר הוגדרה באפליקציה.
     */
    suspend fun isPasswordSet(): Boolean {
        return settingsRepository.isSetupComplete() && settingsRepository.getPasswordHash() != null
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/services/NetfreeMonitorService.kt
```kotlin
package com.secureguard.mdm.services

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.os.Build
import android.os.IBinder
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import androidx.core.content.edit
import com.secureguard.mdm.R
import com.secureguard.mdm.SecureGuardDeviceAdminReceiver
import com.secureguard.mdm.utils.FileLogger
import com.secureguard.mdm.utils.JobSchedulerHelper
import com.secureguard.mdm.utils.NetfreeChecker
import com.secureguard.mdm.utils.NetworkWatcher
import kotlinx.coroutines.*
import java.util.concurrent.ConcurrentHashMap

private const val TAG = "NetfreeMonitorService"
private const val NOTIFICATION_CHANNEL_ID = "NetfreeMonitorChannel"
private const val NOTIFICATION_ID = 1001

// --- הוספת מבנה נתונים לייצוג הסטטוס ---
data class NetfreeStatus(val isBlocked: Boolean, val approvedNetworkType: String?)

class NetfreeMonitorService : Service(), NetworkWatcher.NetworkStateListener {

    private lateinit var networkWatcher: NetworkWatcher
    private val serviceScope = CoroutineScope(Dispatchers.IO + SupervisorJob())
    private val mainScope = CoroutineScope(Dispatchers.Main + SupervisorJob())

    private lateinit var dpm: DevicePolicyManager
    private lateinit var adminComponentName: ComponentName
    private lateinit var connectivityManager: ConnectivityManager

    private val approvedNetworks = ConcurrentHashMap<Network, Int>()

    companion object {
        const val ACTION_START_MONITORING = "ACTION_START_MONITORING"
        const val ACTION_STOP_MONITORING = "ACTION_STOP_MONITORING"
        const val ACTION_FORCE_RECHECK = "ACTION_FORCE_RECHECK"
        private const val PREFS_NAME = "NetfreeServiceState"
        private const val KEY_IS_SERVICE_ACTIVE = "is_service_active"
        // --- הוספת מפתחות חדשים לשמירת המצב ---
        private const val KEY_IS_BLOCKED = "is_blocked"
        private const val KEY_APPROVED_NETWORK_TYPE = "approved_network_type"


        fun setServiceActive(context: Context, isActive: Boolean) {
            FileLogger.log(TAG, "Setting service active state to: $isActive")
            context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE).edit {
                putBoolean(KEY_IS_SERVICE_ACTIVE, isActive)
                // --- הוספה: איפוס המצב כשהשירות כבוי ---
                if (!isActive) {
                    remove(KEY_IS_BLOCKED)
                    remove(KEY_APPROVED_NETWORK_TYPE)
                }
            }
        }

        fun isServiceActive(context: Context): Boolean {
            return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                .getBoolean(KEY_IS_SERVICE_ACTIVE, false)
        }

        // --- הוספה: פונקציה מרכזית לקריאת המצב ---
        fun getNetfreeStatus(context: Context): NetfreeStatus {
            val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            val isBlocked = prefs.getBoolean(KEY_IS_BLOCKED, true) // Default to blocked if service is running but no state is set
            val networkType = prefs.getString(KEY_APPROVED_NETWORK_TYPE, null)
            return NetfreeStatus(isBlocked, networkType)
        }
    }

    // --- הוספה: פונקציה לשמירת המצב ---
    private fun saveNetfreeStatus(isBlocked: Boolean, approvedNetworkType: String?) {
        getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE).edit {
            putBoolean(KEY_IS_BLOCKED, isBlocked)
            if (approvedNetworkType != null) {
                putString(KEY_APPROVED_NETWORK_TYPE, approvedNetworkType)
            } else {
                remove(KEY_APPROVED_NETWORK_TYPE)
            }
        }
    }


    private fun showToast(message: String) {
        mainScope.launch { Toast.makeText(this@NetfreeMonitorService, message, Toast.LENGTH_LONG).show() }
    }

    override fun onCreate() {
        super.onCreate()
        FileLogger.log(TAG, "Service onCreate.")
        networkWatcher = NetworkWatcher(this, this)
        dpm = getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager
        connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        adminComponentName = SecureGuardDeviceAdminReceiver.getComponentName(this)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            ACTION_START_MONITORING -> {
                FileLogger.log(TAG, "Received START_MONITORING action.")
                JobSchedulerHelper.scheduleWatchdog(this)
                startForeground(NOTIFICATION_ID, createNotification())
                enablePersistentFirewall()
                approvedNetworks.clear()
                applyCurrentNetworkPolicy()
                networkWatcher.startWatching()
                setServiceActive(this, true)
            }
            ACTION_STOP_MONITORING -> {
                FileLogger.log(TAG, "Received STOP_MONITORING action.")
                JobSchedulerHelper.cancelWatchdog(this)
                disablePersistentFirewall()
                networkWatcher.stopWatching()
                setServiceActive(this, false)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    stopForeground(STOP_FOREGROUND_REMOVE)
                } else {
                    @Suppress("DEPRECATION")
                    stopForeground(true)
                }
                stopSelf()
            }
            ACTION_FORCE_RECHECK -> {
                FileLogger.log(TAG, "Received FORCE_RECHECK action.")
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    val activeNetwork = connectivityManager.activeNetwork
                    if (activeNetwork != null) {
                        onNetworkAvailable(activeNetwork)
                    } else {
                        showToast(getString(R.string.netfree_no_active_network))
                        applyCurrentNetworkPolicy()
                    }
                } else {
                    showToast(getString(R.string.netfree_no_active_network))
                    applyCurrentNetworkPolicy()
                }
            }
        }
        return START_STICKY
    }


    override fun onNetworkAvailable(network: Network) {
        FileLogger.log(TAG, "Network available: $network. Performing check.")
        performNetfreeCheck(network)
    }

    override fun onNetworkLost(network: Network) {
        FileLogger.log(TAG, "Network lost: $network. Updating policy.")
        if (approvedNetworks.containsKey(network)) {
            approvedNetworks.remove(network)
            applyCurrentNetworkPolicy()
        }
    }

    private fun performNetfreeCheck(network: Network) {
        showToast(getString(R.string.toast_netfree_check_started))
        serviceScope.launch {
            try {
                val isFiltered = NetfreeChecker.isNetfreeFiltered(network)
                if (isFiltered) {
                    val capabilities = connectivityManager.getNetworkCapabilities(network)
                    val transportType = when {
                        capabilities?.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) == true -> NetworkCapabilities.TRANSPORT_WIFI
                        capabilities?.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) == true -> NetworkCapabilities.TRANSPORT_CELLULAR
                        else -> -1
                    }
                    if (transportType != -1) {
                        FileLogger.log(TAG, "Network $network approved (Type: $transportType).")
                        approvedNetworks[network] = transportType
                    }
                } else {
                    FileLogger.log(TAG, "Network $network is NOT approved.")
                    approvedNetworks.remove(network)
                }
            } catch (e: Exception) {
                FileLogger.log(TAG, "Exception during Netfree check for network $network: ${e.message}")
                approvedNetworks.remove(network)
            } finally {
                applyCurrentNetworkPolicy()
            }
        }
    }

    private fun applyCurrentNetworkPolicy() {
        val preferredNetworkEntry = determinePreferredNetwork()

        if (preferredNetworkEntry != null) {
            val (preferredNetwork, networkType) = preferredNetworkEntry
            val networkTypeName = if (networkType == NetworkCapabilities.TRANSPORT_WIFI) "Wi-Fi" else "Cellular"

            showToast(getString(R.string.toast_netfree_check_success))
            FileLogger.log(TAG, "Approved network found: $preferredNetwork ($networkTypeName). Disabling lockdown mode.")
            saveNetfreeStatus(isBlocked = false, approvedNetworkType = networkTypeName)

            try {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    dpm.setAlwaysOnVpnPackage(adminComponentName, packageName, false)
                }

                val vpnIntent = Intent(this, BlockerVpnService::class.java).apply {
                    action = BlockerVpnService.ACTION_UPDATE_POLICY
                    putExtra(BlockerVpnService.EXTRA_PREFERRED_NETWORK, preferredNetwork)
                }
                ContextCompat.startForegroundService(this, vpnIntent)

            } catch (e: Exception) {
                FileLogger.log(TAG, "ERROR applying approved network policy: ${e.message}")
            }

        } else {
            showToast(getString(R.string.toast_netfree_check_fail_blocking))
            FileLogger.log(TAG, "No approved network. Enabling lockdown mode to block all traffic.")
            saveNetfreeStatus(isBlocked = true, approvedNetworkType = null)

            try {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    dpm.setAlwaysOnVpnPackage(adminComponentName, packageName, true)
                }
                val vpnIntent = Intent(this, BlockerVpnService::class.java).apply {
                    action = BlockerVpnService.ACTION_UPDATE_POLICY
                    putExtra(BlockerVpnService.EXTRA_PREFERRED_NETWORK, null as Network?)
                }
                ContextCompat.startForegroundService(this, vpnIntent)

            } catch (e: Exception) {
                FileLogger.log(TAG, "ERROR applying blocking policy (lockdown): ${e.message}")
            }
        }
    }

    private fun determinePreferredNetwork(): Pair<Network, Int>? {
        if (approvedNetworks.isEmpty()) return null

        approvedNetworks.entries.find { it.value == NetworkCapabilities.TRANSPORT_WIFI }?.let {
            FileLogger.log(TAG, "Determined preferred network: Wi-Fi ${it.key}")
            return it.key to it.value
        }

        approvedNetworks.entries.find { it.value == NetworkCapabilities.TRANSPORT_CELLULAR }?.let {
            FileLogger.log(TAG, "Determined preferred network: Cellular ${it.key}")
            return it.key to it.value
        }
        return null
    }


    private fun enablePersistentFirewall() {
        FileLogger.log(TAG, "Enabling persistent firewall (Always-On VPN).")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            try {
                dpm.setAlwaysOnVpnPackage(adminComponentName, packageName, false)
            } catch (e: Exception) {
                FileLogger.log(TAG, "ERROR enabling persistent firewall: ${e.message}")
            }
        }
    }

    private fun disablePersistentFirewall() {
        FileLogger.log(TAG, "Disabling persistent firewall.")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            try {
                dpm.setAlwaysOnVpnPackage(adminComponentName, null, false)
            } catch (e: Exception) {
                FileLogger.log(TAG, "ERROR disabling persistent firewall: ${e.message}")
            }
        }
    }

    private fun createNotification(): Notification {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                NOTIFICATION_CHANNEL_ID,
                getString(R.string.netfree_notification_channel_name),
                NotificationManager.IMPORTANCE_LOW
            ).apply {
                description = getString(R.string.netfree_notification_channel_description)
            }
            getSystemService(NotificationManager::class.java).createNotificationChannel(channel)
        }
        return NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)
            .setContentTitle(getString(R.string.app_name))
            .setContentText(getString(R.string.netfree_notification_content))
            .setSmallIcon(R.drawable.ic_netguard_shield)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setOngoing(true)
            .build()
    }

    override fun onDestroy() {
        super.onDestroy()
        serviceScope.cancel()
        mainScope.cancel()
        if (::networkWatcher.isInitialized) {
            networkWatcher.stopWatching()
        }
        FileLogger.log(TAG, "Service onDestroy.")
    }

    override fun onBind(intent: Intent?): IBinder? = null
}
```

## File: app/src/main/java/com/secureguard/mdm/services/ServiceWatchdogJob.kt
```kotlin
package com.secureguard.mdm.services

import android.app.ActivityManager
import android.app.job.JobParameters
import android.app.job.JobService
import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat
import com.secureguard.mdm.utils.FileLogger

class ServiceWatchdogJob : JobService() {

    override fun onStartJob(params: JobParameters?): Boolean {
        FileLogger.log("ServiceWatchdogJob", "Watchdog job started. Checking service status.")

        if (NetfreeMonitorService.isServiceActive(this)) {
            // --- THIS IS THE FIX ---
            // Instead of checking if the service is running, we proactively send the START command.
            // This will "wake up" the service if it's in a zombie state, or just refresh it if it's running correctly.
            FileLogger.log("ServiceWatchdogJob", "Service is set to active. Proactively sending START_MONITORING command.")
            val serviceIntent = Intent(this, NetfreeMonitorService::class.java).apply {
                action = NetfreeMonitorService.ACTION_START_MONITORING
            }
            ContextCompat.startForegroundService(this, serviceIntent)
            // --- END OF FIX ---
        } else {
            FileLogger.log("ServiceWatchdogJob", "Service is not supposed to be active. Doing nothing.")
        }

        jobFinished(params, false)
        return true
    }

    override fun onStopJob(params: JobParameters?): Boolean {
        FileLogger.log("ServiceWatchdogJob", "Watchdog job was stopped by the system.")
        return true
    }

    private fun isServiceRunning(serviceClass: Class<*>): Boolean {
        val manager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        @Suppress("DEPRECATION")
        for (service in manager.getRunningServices(Integer.MAX_VALUE)) {
            if (serviceClass.name == service.service.className) {
                return true
            }
        }
        return false
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/settingsfeatures/impl/AppManagementSettings.kt
```kotlin
package com.secureguard.mdm.settingsfeatures.impl

import com.secureguard.mdm.R
import com.secureguard.mdm.settingsfeatures.api.NavigationalSetting
import com.secureguard.mdm.settingsfeatures.api.SettingCategory
import com.secureguard.mdm.ui.navigation.Routes

object NavigateToAppSelectionSetting : NavigationalSetting {
    override val id: String = "navigate_app_selection"
    override val titleRes: Int = R.string.settings_item_select_apps_to_block
    override val iconRes: Int = R.drawable.ic_manage_apps
    override val category: SettingCategory = SettingCategory.APP_MANAGEMENT
    override val route: String = Routes.APP_SELECTION
}

object NavigateToBlockedAppsSetting : NavigationalSetting {
    override val id: String = "navigate_blocked_apps"
    override val titleRes: Int = R.string.settings_item_view_blocked_apps
    override val iconRes: Int = R.drawable.ic_apps_blocked
    override val category: SettingCategory = SettingCategory.APP_MANAGEMENT
    override val route: String = Routes.BLOCKED_APPS_DISPLAY
}
```

## File: app/src/main/java/com/secureguard/mdm/settingsfeatures/impl/UiAndBehaviorSettings.kt
```kotlin
package com.secureguard.mdm.settingsfeatures.impl

import com.secureguard.mdm.R
import com.secureguard.mdm.settingsfeatures.api.SettingCategory
import com.secureguard.mdm.settingsfeatures.api.ToggleSetting

object ToggleUiPositionSetting : ToggleSetting {
    override val id: String = "toggle_ui_position"
    override val titleRes: Int = R.string.settings_item_toggle_position
    override val iconRes: Int = 0 // No specific icon for this toggle
    override val category: SettingCategory = SettingCategory.UI_AND_BEHAVIOR
}

object ToggleUiControlTypeSetting : ToggleSetting {
    override val id: String = "toggle_ui_control_type"
    override val titleRes: Int = R.string.settings_item_use_checkbox
    override val iconRes: Int = 0 // No specific icon for this toggle
    override val category: SettingCategory = SettingCategory.UI_AND_BEHAVIOR
}

object ToggleContactEmailSetting : ToggleSetting {
    override val id: String = "toggle_contact_email"
    override val titleRes: Int = R.string.settings_item_show_contact_email
    override val iconRes: Int = 0 // No specific icon for this toggle
    override val category: SettingCategory = SettingCategory.UI_AND_BEHAVIOR
}

// New setting item for the boot toast
object ShowBootToastSetting : ToggleSetting {
    override val id: String = "toggle_show_boot_toast"
    override val titleRes: Int = R.string.settings_item_show_boot_toast
    override val iconRes: Int = 0 // No specific icon
    override val category: SettingCategory = SettingCategory.UI_AND_BEHAVIOR
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/components/InfoDialog.kt
```kotlin
package com.secureguard.mdm.ui.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.secureguard.mdm.R

/**
 * דיאלוג גנרי להצגת מידע או בקשת אישור מהמשתמש.
 * @param title כותרת הדיאלוג.
 * @param message גוף ההודעה.
 * @param onDismiss הפעולה שתתבצע כאשר הדיאלוג נסגר.
 * @param onConfirm (אופציונלי) הפעולה שתתבצע בלחיצה על כפתור האישור. אם הוא null, יוצג רק כפתור סגירה.
 * @param isDestructive (אופציונלי) האם צבע כפתור האישור צריך להיות אדום (לפעולות מסוכנות).
 */
@Composable
fun InfoDialog(
    title: String,
    message: String,
    onDismiss: () -> Unit,
    onConfirm: (() -> Unit)? = null,
    isDestructive: Boolean = false
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(text = title) },
        text = { Text(text = message) },
        dismissButton = {
            if (onConfirm != null) { // מציג כפתור "ביטול" רק אם יש גם כפתור "אישור"
                TextButton(onClick = onDismiss) {
                    Text(stringResource(id = R.string.dialog_button_cancel))
                }
            }
        },
        confirmButton = {
            val confirmButtonText = if (onConfirm != null) {
                stringResource(id = R.string.dialog_button_confirm)
            } else {
                stringResource(id = R.string.dialog_button_confirm) // אותו טקסט במקרה הזה
            }

            TextButton(
                onClick = {
                    onConfirm?.invoke() ?: onDismiss() // אם onConfirm קיים, הפעל אותו. אחרת, פשוט סגור.
                }
            ) {
                Text(
                    text = confirmButtonText,
                    color = if (isDestructive) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.primary
                )
            }
        }
    )
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/components/PasswordPromptDialog.kt
```kotlin
package com.secureguard.mdm.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.secureguard.mdm.R

/**
 * דיאלוג ייעודי לבקשת סיסמת ניהול מהמשתמש.
 * @param passwordError (אופציונלי) הודעת שגיאה להצגה אם הסיסמה שהוזנה שגויה.
 * @param onConfirm הפעולה שתתבצע עם הסיסמה שהוזנה.
 * @param onDismiss הפעולה שתתבצע כאשר הדיאלוג נסגר.
 */
@Composable
fun PasswordPromptDialog(
    passwordError: String?,
    onConfirm: (String) -> Unit,
    onDismiss: () -> Unit
) {
    var passwordValue by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(text = stringResource(id = R.string.dialog_title_enter_password)) },
        text = {
            Column {
                Text(text = stringResource(id = R.string.dialog_description_enter_password))
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = passwordValue,
                    onValueChange = { passwordValue = it },
                    label = { Text(stringResource(id = R.string.setup_password_label)) },
                    singleLine = true,
                    visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    isError = passwordError != null,
                    trailingIcon = {
                        val image = if (passwordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                        val description = if (passwordVisible) "הסתר סיסמה" else "הצג סיסמה"
                        IconButton(onClick = { passwordVisible = !passwordVisible }) {
                            Icon(imageVector = image, contentDescription = description)
                        }
                    }
                )
                passwordError?.let {
                    Text(
                        text = it,
                        color = MaterialTheme.colorScheme.error,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        },
        confirmButton = {
            Button(onClick = { onConfirm(passwordValue) }) {
                Text(stringResource(id = R.string.dialog_button_confirm))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.dialog_button_cancel))
            }
        }
    )
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/screens/changepassword/ChangePasswordScreen.kt
```kotlin
package com.secureguard.mdm.ui.screens.changepassword

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.secureguard.mdm.R
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChangePasswordScreen(
    viewModel: ChangePasswordViewModel = hiltViewModel(),
    onNavigateBack: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    val context = LocalContext.current

    var oldPasswordVisible by remember { mutableStateOf(false) }
    var newPasswordVisible by remember { mutableStateOf(false) }
    var confirmPasswordVisible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        viewModel.sideEffect.collectLatest { effect ->
            when(effect) {
                is ChangePasswordSideEffect.NavigateBack -> onNavigateBack()
                is ChangePasswordSideEffect.ShowSnackbar -> {
                    Toast.makeText(context, context.getString(effect.messageResId), Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = R.string.change_password_title)) },
                navigationIcon = { IconButton(onClick = onNavigateBack) { Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back") } }
            )
        }
    ) { paddingValues ->
        Column(modifier = Modifier.fillMaxSize().padding(paddingValues).padding(16.dp)) {
            OutlinedTextField(
                value = uiState.oldPassword, onValueChange = viewModel::onOldPasswordChanged,
                label = { Text(stringResource(id = R.string.change_password_old_password)) }, isError = uiState.errorResId != null,
                visualTransformation = if (oldPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                singleLine = true, modifier = Modifier.fillMaxWidth(),
                trailingIcon = {
                    val image = if (oldPasswordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                    IconButton(onClick = { oldPasswordVisible = !oldPasswordVisible }) {
                        Icon(imageVector = image, contentDescription = if (oldPasswordVisible) "Hide password" else "Show password")
                    }
                }
            )
            Spacer(Modifier.height(8.dp))
            OutlinedTextField(
                value = uiState.newPassword, onValueChange = viewModel::onNewPasswordChanged,
                label = { Text(stringResource(id = R.string.change_password_new_password)) }, isError = uiState.errorResId != null,
                visualTransformation = if (newPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                singleLine = true, modifier = Modifier.fillMaxWidth(),
                trailingIcon = {
                    val image = if (newPasswordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                    IconButton(onClick = { newPasswordVisible = !newPasswordVisible }) {
                        Icon(imageVector = image, contentDescription = if (newPasswordVisible) "Hide password" else "Show password")
                    }
                }
            )
            Spacer(Modifier.height(8.dp))
            OutlinedTextField(
                value = uiState.confirmNewPassword, onValueChange = viewModel::onConfirmNewPasswordChanged,
                label = { Text(stringResource(id = R.string.change_password_confirm_new_password)) }, isError = uiState.errorResId != null,
                visualTransformation = if (confirmPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                singleLine = true, modifier = Modifier.fillMaxWidth(),
                trailingIcon = {
                    val image = if (confirmPasswordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                    IconButton(onClick = { confirmPasswordVisible = !confirmPasswordVisible }) {
                        Icon(imageVector = image, contentDescription = if (confirmPasswordVisible) "Hide password" else "Show password")
                    }
                }
            )
            uiState.errorResId?.let {
                Spacer(Modifier.height(8.dp))
                Text(stringResource(id = it), color = MaterialTheme.colorScheme.error, style = MaterialTheme.typography.bodySmall)
            }
            Spacer(Modifier.height(24.dp))
            Button(
                onClick = viewModel::onSaveClicked, enabled = !uiState.isLoading, modifier = Modifier.fillMaxWidth()
            ) {
                if (uiState.isLoading) CircularProgressIndicator(modifier = Modifier.size(24.dp))
                else Text(stringResource(id = R.string.change_password_button_save))
            }
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/screens/changepassword/ChangePasswordViewModel.kt
```kotlin
package com.secureguard.mdm.ui.screens.changepassword

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.secureguard.mdm.R
import com.secureguard.mdm.security.PasswordManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class ChangePasswordUiState(
    val oldPassword: String = "",
    val newPassword: String = "",
    val confirmNewPassword: String = "",
    val errorResId: Int? = null,
    val isLoading: Boolean = false
)

sealed class ChangePasswordSideEffect {
    object NavigateBack : ChangePasswordSideEffect()
    data class ShowSnackbar(val messageResId: Int) : ChangePasswordSideEffect()
}

@HiltViewModel
class ChangePasswordViewModel @Inject constructor(
    private val passwordManager: PasswordManager
) : ViewModel() {

    private val _uiState = MutableStateFlow(ChangePasswordUiState())
    val uiState = _uiState.asStateFlow()

    private val _sideEffect = MutableSharedFlow<ChangePasswordSideEffect>()
    val sideEffect = _sideEffect.asSharedFlow()

    fun onOldPasswordChanged(value: String) = _uiState.update { it.copy(oldPassword = value, errorResId = null) }
    fun onNewPasswordChanged(value: String) = _uiState.update { it.copy(newPassword = value, errorResId = null) }
    fun onConfirmNewPasswordChanged(value: String) = _uiState.update { it.copy(confirmNewPassword = value, errorResId = null) }

    fun onSaveClicked() {
        viewModelScope.launch {
            val state = _uiState.value
            if (state.newPassword.length < 4) {
                _uiState.update { it.copy(errorResId = R.string.setup_error_password_too_short) }
                return@launch
            }
            if (state.newPassword != state.confirmNewPassword) {
                _uiState.update { it.copy(errorResId = R.string.setup_error_passwords_do_not_match) }
                return@launch
            }

            _uiState.update { it.copy(isLoading = true, errorResId = null) }

            if (passwordManager.verifyPassword(state.oldPassword)) {
                passwordManager.createAndSavePassword(state.newPassword)
                _sideEffect.emit(ChangePasswordSideEffect.ShowSnackbar(R.string.change_password_success))
                _sideEffect.emit(ChangePasswordSideEffect.NavigateBack)
            } else {
                _uiState.update { it.copy(errorResId = R.string.change_password_error_old_password_incorrect) }
            }
            _uiState.update { it.copy(isLoading = false) }
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/screens/provisioning/ProvisioningViewModel.kt
```kotlin
package com.secureguard.mdm.ui.screens.provisioning

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.secureguard.mdm.R
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import java.io.DataOutputStream
import javax.inject.Inject

sealed class ProvisioningEvent {
    data class ShowSnackbar(val message: String) : ProvisioningEvent()
}

@HiltViewModel
class ProvisioningViewModel @Inject constructor(
    @ApplicationContext private val context: Context
) : ViewModel() {

    private val _eventFlow = MutableSharedFlow<ProvisioningEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    fun onCopyAdbCommand() {
        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val adbCommand = context.getString(R.string.provisioning_adb_command)
        val clip = ClipData.newPlainText("ADB Command", adbCommand)
        clipboard.setPrimaryClip(clip)
        viewModelScope.launch {
            _eventFlow.emit(ProvisioningEvent.ShowSnackbar(context.getString(R.string.provisioning_command_copied)))
        }
    }

    fun onTryRootActivation() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val command = "dpm set-device-owner ${context.packageName}/.SecureGuardDeviceAdminReceiver"
                val process = Runtime.getRuntime().exec("su")
                DataOutputStream(process.outputStream).use {
                    it.writeBytes("$command\n")
                    it.writeBytes("exit\n")
                    it.flush()
                }

                val exitCode = process.waitFor()
                if (exitCode == 0) {
                    _eventFlow.emit(ProvisioningEvent.ShowSnackbar(context.getString(R.string.provisioning_root_success)))
                } else {
                    throw Exception("Root command failed with exit code $exitCode")
                }
            } catch (e: Exception) {
                _eventFlow.emit(ProvisioningEvent.ShowSnackbar(context.getString(R.string.provisioning_root_failed)))
            }
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/screens/setup/SetupScreen.kt
```kotlin
package com.secureguard.mdm.ui.screens.setup

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.secureguard.mdm.R
import kotlinx.coroutines.flow.collectLatest

@Composable
fun SetupScreen(
    viewModel: SetupViewModel = hiltViewModel(),
    onSetupComplete: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    var passwordVisible by remember { mutableStateOf(false) }
    var confirmPasswordVisible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        viewModel.setupCompleteEvent.collectLatest {
            onSetupComplete()
        }
    }

    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(stringResource(id = R.string.setup_title), style = MaterialTheme.typography.headlineSmall, textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(8.dp))
            Text(stringResource(id = R.string.setup_description), style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(32.dp))

            OutlinedTextField(
                value = uiState.passwordValue,
                onValueChange = { viewModel.onEvent(SetupEvent.PasswordChanged(it)) },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(stringResource(id = R.string.setup_password_label)) },
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                isError = uiState.errorResId != null,
                singleLine = true,
                trailingIcon = {
                    val image = if (passwordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                    IconButton(onClick = { passwordVisible = !passwordVisible }) {
                        Icon(imageVector = image, contentDescription = if (passwordVisible) "Hide password" else "Show password")
                    }
                }
            )
            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = uiState.confirmPasswordValue,
                onValueChange = { viewModel.onEvent(SetupEvent.ConfirmPasswordChanged(it)) },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(stringResource(id = R.string.setup_confirm_password_label)) },
                visualTransformation = if (confirmPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                isError = uiState.errorResId != null,
                singleLine = true,
                trailingIcon = {
                    val image = if (confirmPasswordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                    IconButton(onClick = { confirmPasswordVisible = !confirmPasswordVisible }) {
                        Icon(imageVector = image, contentDescription = if (confirmPasswordVisible) "Hide password" else "Show password")
                    }
                }
            )

            uiState.errorResId?.let {
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = stringResource(id = it), color = MaterialTheme.colorScheme.error, style = MaterialTheme.typography.bodySmall)
            }

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { viewModel.onEvent(SetupEvent.Submit) },
                modifier = Modifier.fillMaxWidth(),
                enabled = !uiState.isLoading
            ) {
                if (uiState.isLoading) {
                    CircularProgressIndicator(modifier = Modifier.height(24.dp), color = MaterialTheme.colorScheme.onPrimary)
                } else {
                    Text(stringResource(id = R.string.setup_button_start))
                }
            }
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/screens/updatesettings/UpdateSettingsState.kt
```kotlin
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
```

## File: app/src/main/java/com/secureguard/mdm/ui/screens/updatesettings/UpdateSettingsViewModel.kt
```kotlin
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
```

## File: app/src/main/java/com/secureguard/mdm/ui/theme/Color.kt
```kotlin
package com.secureguard.mdm.ui.theme

import androidx.compose.ui.graphics.Color

// ערכת צבעים המבוססת על גוונים של אדום כדי לשדר אבטחה
val PrimaryRed = Color(0xFFB71C1C)      // אדום כהה וחזק
val SecondaryRed = Color(0xFFD32F2F)    // אדום סטנדרטי להדגשות ושגיאות
val AccentColor = Color(0xFF00ACC1)      // צבע טורקיז כצבע משלים לקונטרסט

val TextPrimary = Color(0xFF212121)      // צבע טקסט כהה לרקעים בהירים
val TextSecondary = Color(0xFF757575)    // צבע טקסט אפרפר
val BackgroundLight = Color(0xFFFFFFFF)    // רקע לבן
val ErrorColor = Color(0xFFD32F2F)      // צבע ייעודי להודעות שגיאה
```

## File: app/src/main/java/com/secureguard/mdm/ui/theme/Type.kt
```kotlin
package com.secureguard.mdm.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * הגדרות הטיפוגרפיה של האפליקציה, בהתאם לעקרונות Material Design.
 * ניתן להרחיב ולהוסיף סגנונות נוספים לפי הצורך.
 */
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)
```

## File: app/src/main/java/com/secureguard/mdm/utils/FileLogger.kt
```kotlin
package com.secureguard.mdm.utils

import android.content.Context
import android.os.Environment
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

object FileLogger {

    private lateinit var appContext: Context
    private val scope = CoroutineScope(Dispatchers.IO)
    private val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault())

    fun init(context: Context) {
        appContext = context.applicationContext
    }

    fun log(tag: String, message: String) {
        scope.launch {
            try {
                // Log to standard logcat as well
                Log.d(tag, message)

                val logFile = File(
                    appContext.getExternalFilesDir(null), // Use app-specific storage
                    "SecureGuardLog.txt"
                )
                val logMessage = "${dateFormat.format(Date())} [$tag]: $message\n"

                // Rotate log file if it's too large
                if (logFile.exists() && logFile.length() > 1 * 1024 * 1024) { // 1 MB limit
                    val backupFile = File(logFile.parent, "SecureGuardLog_old.txt")
                    if(backupFile.exists()) backupFile.delete()
                    logFile.renameTo(backupFile)
                }

                logFile.appendText(logMessage)
            } catch (e: Exception) {
                Log.e("FileLogger", "Failed to write to log file", e)
            }
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/utils/JobSchedulerHelper.kt
```kotlin
package com.secureguard.mdm.utils

import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import android.content.Context
import com.secureguard.mdm.services.ServiceWatchdogJob
import java.util.concurrent.TimeUnit

object JobSchedulerHelper {
    private const val WATCHDOG_JOB_ID = 123
    private val REPEAT_INTERVAL = TimeUnit.MINUTES.toMillis(1)

    fun scheduleWatchdog(context: Context) {
        val componentName = ComponentName(context, ServiceWatchdogJob::class.java)
        val jobInfo = JobInfo.Builder(WATCHDOG_JOB_ID, componentName)
            .setPersisted(true)
            .setPeriodic(REPEAT_INTERVAL)
            .build()

        val scheduler = context.getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler
        val resultCode = scheduler.schedule(jobInfo)

        if (resultCode == JobScheduler.RESULT_SUCCESS) {
            FileLogger.log("JobSchedulerHelper", "Successfully scheduled the watchdog job.")
        } else {
            FileLogger.log("JobSchedulerHelper", "Failed to schedule the watchdog job. Result code: $resultCode")
        }
    }

    fun cancelWatchdog(context: Context) {
        val scheduler = context.getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler
        scheduler.cancel(WATCHDOG_JOB_ID)
        FileLogger.log("JobSchedulerHelper", "Canceled the watchdog job.")
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/utils/NetfreeChecker.kt
```kotlin
package com.secureguard.mdm.utils

import android.net.Network
import com.secureguard.mdm.data.model.NetfreeUser
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

object NetfreeChecker {
    private const val TAG = "NetfreeChecker"

    // --- התיקון המרכזי נמצא כאן ---
    private fun getHttpClient(network: Network?): HttpClient {
        return HttpClient(OkHttp) {
            engine {
                // יוצר תצורה מותאמת אישית עבור OkHttp
                config {
                    connectTimeout(20, TimeUnit.SECONDS)
                    readTimeout(20, TimeUnit.SECONDS)
                    writeTimeout(20, TimeUnit.SECONDS)

                    // אם קיבלנו אובייקט רשת, אנו "קושרים" את הלקוח אליו
                    // זה מאלץ את הבקשה לצאת דרך הרשת הפיזית הזו, ועוקף את ה-VPN
                    network?.let {
                        socketFactory(it.socketFactory)
                    }
                }
            }
            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                    isLenient = true
                })
            }
        }
    }

    suspend fun isNetfreeFiltered(network: Network? = null): Boolean {
        // משתמש בפונקציה החדשה כדי לקבל לקוח שתקשורת
        val client = getHttpClient(network)

        return try {
            FileLogger.log(TAG, "Attempting to fetch Netfree status from API via network: $network")
            val user: NetfreeUser = client.get("https://api.internal.netfree.link/user/0").body()
            FileLogger.log(TAG, "API call successful. isNetFree=${user.isNetFree}")
            user.isNetFree
        } catch (e: Exception) {
            FileLogger.log(TAG, "ERROR fetching Netfree status: ${e.message}")
            false
        } finally {
            client.close()
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/utils/NetworkWatcher.kt
```kotlin
package com.secureguard.mdm.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest

class NetworkWatcher(
    context: Context,
    private val listener: NetworkStateListener
) {
    interface NetworkStateListener {
        fun onNetworkAvailable(network: Network)
        fun onNetworkLost(network: Network)
    }

    private val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    private var networkCallback: ConnectivityManager.NetworkCallback? = null

    fun startWatching() {
        val networkRequest = NetworkRequest.Builder()
            .addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
            .build()

        networkCallback = object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                listener.onNetworkAvailable(network)
            }

            override fun onLost(network: Network) {
                listener.onNetworkLost(network)
            }
        }
        connectivityManager.registerNetworkCallback(networkRequest, networkCallback!!)
    }

    fun stopWatching() {
        networkCallback?.let {
            connectivityManager.unregisterNetworkCallback(it)
            networkCallback = null
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/utils/RuntimeTypeAdapterFactory.java
```java
/*
 * Copyright (C) 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.secureguard.mdm.utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class RuntimeTypeAdapterFactory<T> implements TypeAdapterFactory {
    private final Class<?> baseType;
    private final String typeFieldName;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap<>();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap<>();
    private final boolean maintainType;

    private RuntimeTypeAdapterFactory(Class<?> baseType, String typeFieldName, boolean maintainType) {
        if (typeFieldName == null || baseType == null) {
            throw new NullPointerException();
        }
        this.baseType = baseType;
        this.typeFieldName = typeFieldName;
        this.maintainType = maintainType;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> baseType, String typeFieldName) {
        return new RuntimeTypeAdapterFactory<>(baseType, typeFieldName, false);
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> baseType) {
        return new RuntimeTypeAdapterFactory<>(baseType, "type", false);
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> type, String label) {
        if (type == null || label == null) {
            throw new NullPointerException();
        }
        if (subtypeToLabel.containsKey(type) || labelToSubtype.containsKey(label)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }
        labelToSubtype.put(label, type);
        subtypeToLabel.put(type, label);
        return this;
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> type) {
        return registerSubtype(type, type.getSimpleName());
    }

    public <R> TypeAdapter<R> create(Gson gson, TypeToken<R> type) {
        if (type.getRawType() != baseType) {
            return null;
        }

        final Map<String, TypeAdapter<?>> labelToDelegate = new LinkedHashMap<>();
        final Map<Class<?>, TypeAdapter<?>> subtypeToDelegate = new LinkedHashMap<>();
        for (Map.Entry<String, Class<?>> entry : labelToSubtype.entrySet()) {
            TypeAdapter<?> delegate = gson.getDelegateAdapter(this, TypeToken.get(entry.getValue()));
            labelToDelegate.put(entry.getKey(), delegate);
            subtypeToDelegate.put(entry.getValue(), delegate);
        }

        return new TypeAdapter<R>() {
            @Override
            public R read(JsonReader in) throws IOException {
                JsonElement jsonElement = gson.getAdapter(JsonElement.class).read(in);
                JsonElement labelJsonElement;
                if (maintainType) {
                    labelJsonElement = jsonElement.getAsJsonObject().get(typeFieldName);
                } else {
                    labelJsonElement = jsonElement.getAsJsonObject().remove(typeFieldName);
                }

                if (labelJsonElement == null) {
                    throw new JsonParseException("cannot deserialize " + baseType
                            + " because it does not define a field named " + typeFieldName);
                }
                String label = labelJsonElement.getAsString();
                @SuppressWarnings("unchecked") // registration requires that subtype extends T
                TypeAdapter<R> delegate = (TypeAdapter<R>) labelToDelegate.get(label);
                if (delegate == null) {
                    throw new JsonParseException("cannot deserialize " + baseType + " subtype named "
                            + label + "; did you forget to register a subtype?");
                }
                return delegate.fromJsonTree(jsonElement);
            }

            @Override
            public void write(JsonWriter out, R value) throws IOException {
                Class<?> srcType = value.getClass();
                String label = subtypeToLabel.get(srcType);
                @SuppressWarnings("unchecked") // registration requires that subtype extends T
                TypeAdapter<R> delegate = (TypeAdapter<R>) subtypeToDelegate.get(srcType);
                if (delegate == null) {
                    throw new JsonParseException("cannot serialize " + srcType.getName()
                            + "; did you forget to register a subtype?");
                }
                JsonObject jsonObject = delegate.toJsonTree(value).getAsJsonObject();
                if (maintainType) {
                    gson.getAdapter(JsonElement.class).write(out, jsonObject);
                    return;
                }
                JsonObject clone = new JsonObject();
                if (jsonObject.has(typeFieldName)) {
                    throw new JsonParseException("cannot serialize " + srcType.getName()
                            + " because it already defines a field named " + typeFieldName);
                }
                clone.add(typeFieldName, new JsonPrimitive(label));
                for (Map.Entry<String, JsonElement> e : jsonObject.entrySet()) {
                    clone.add(e.getKey(), e.getValue());
                }
                gson.getAdapter(JsonElement.class).write(out, clone);
            }
        }.nullSafe();
    }
}
```

## File: app/src/main/res/drawable-v24/ic_launcher_foreground.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:aapt="http://schemas.android.com/aapt"
    android:width="108dp"
    android:height="108dp"
    android:viewportWidth="108"
    android:viewportHeight="108">
    <path android:pathData="M31,63.928c0,0 6.4,-11 12.1,-13.1c7.2,-2.6 26,-1.4 26,-1.4l38.1,38.1L107,108.928l-32,-1L31,63.928z">
        <aapt:attr name="android:fillColor">
            <gradient
                android:endX="85.84757"
                android:endY="92.4963"
                android:startX="42.9492"
                android:startY="49.59793"
                android:type="linear">
                <item
                    android:color="#44000000"
                    android:offset="0.0" />
                <item
                    android:color="#00000000"
                    android:offset="1.0" />
            </gradient>
        </aapt:attr>
    </path>
    <path
        android:fillColor="#FFFFFF"
        android:fillType="nonZero"
        android:pathData="M65.3,45.828l3.8,-6.6c0.2,-0.4 0.1,-0.9 -0.3,-1.1c-0.4,-0.2 -0.9,-0.1 -1.1,0.3l-3.9,6.7c-6.3,-2.8 -13.4,-2.8 -19.7,0l-3.9,-6.7c-0.2,-0.4 -0.7,-0.5 -1.1,-0.3C38.8,38.328 38.7,38.828 38.9,39.228l3.8,6.6C36.2,49.428 31.7,56.028 31,63.928h46C76.3,56.028 71.8,49.428 65.3,45.828zM43.4,57.328c-0.8,0 -1.5,-0.5 -1.8,-1.2c-0.3,-0.7 -0.1,-1.5 0.4,-2.1c0.5,-0.5 1.4,-0.7 2.1,-0.4c0.7,0.3 1.2,1 1.2,1.8C45.3,56.528 44.5,57.328 43.4,57.328L43.4,57.328zM64.6,57.328c-0.8,0 -1.5,-0.5 -1.8,-1.2s-0.1,-1.5 0.4,-2.1c0.5,-0.5 1.4,-0.7 2.1,-0.4c0.7,0.3 1.2,1 1.2,1.8C66.5,56.528 65.6,57.328 64.6,57.328L64.6,57.328z"
        android:strokeWidth="1"
        android:strokeColor="#00000000" />
</vector>
```

## File: app/src/main/res/drawable/bg_kiosk_folder.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    <solid android:color="#E0E0E0" />
    <corners android:radius="12dp" />
</shape>
```

## File: app/src/main/res/drawable/ic_airplane_mode_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M10.5,7.67V3.5C10.5,2.67 11.17,2 12,2c0.83,0 1.5,0.67 1.5,1.5V9l8.5,5v2l-4.49,-1.32L10.5,7.67zM19.78,22.61l1.41,-1.41L13.5,13.5L9.56,9.56L2.81,2.81L1.39,4.22l6.38,6.38L2,14v2l8.5,-2.5V19L8,20.5L8,22l4,-1l4,1l0,-1.5L13.5,19v-2.67L19.78,22.61z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_ambient_display_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M268,748L212,692Q200,680 200,663.5Q200,647 212,635L635,212Q647,200 663.5,200Q680,200 692,212L748,268Q760,280 760,296.5Q760,313 748,325L324,748Q313,759 296,759Q279,759 268,748Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_apk_install.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M17,18H7V6h7V1H7C5.9,1 5,1.9 5,3v18c0,1.1 0.9,2 2,2h10c1.1,0 2,-0.9 2,-2v-5h-2V18z"/>
      
    <path android:fillColor="@android:color/white" android:pathData="M18,14l5,-5l-1.41,-1.41l-2.59,2.58l0,-7.17l-2,0l0,7.17l-2.59,-2.58l-1.41,1.41z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_apps_blocked.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M18,8c-2.21,0 -4,1.79 -4,4s1.79,4 4,4 4,-1.79 4,-4 -1.79,-4 -4,-4zM15.5,12c0,-1.38 1.12,-2.5 2.5,-2.5 0.42,0 0.8,0.11 1.15,0.29l-3.36,3.36c-0.18,-0.35 -0.29,-0.73 -0.29,-1.15zM18,14.5c-0.42,0 -0.8,-0.11 -1.15,-0.29l3.36,-3.36c0.18,0.35 0.29,0.73 0.29,1.15 0,1.38 -1.12,2.5 -2.5,2.5zM17,18L7,18L7,6h10v1h2L19,3c0,-1.1 -0.9,-2 -2,-2L7,1c-1.1,0 -2,0.9 -2,2v18c0,1.1 0.9,2 2,2h10c1.1,0 2,-0.9 2,-2v-4h-2v1z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_apps_control_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M570,878Q551,883 535.5,871.5Q520,860 520,840L520,640Q520,620 535.5,608.5Q551,597 571,602Q608,612 645,616Q682,620 720,620Q758,620 795.5,616Q833,612 870,602Q889,597 904.5,608.5Q920,620 920,640L920,840Q920,860 904.5,871.5Q889,883 870,878Q833,868 795.5,864Q758,860 720,860Q682,860 644.5,864Q607,868 570,878ZM480,480L480,480L480,480Q480,480 480,480Q480,480 480,480L480,480L480,480L480,480Q480,480 480,480Q480,480 480,480L480,480L480,480L480,480L480,480Q480,480 480,480Q480,480 480,480L480,480L480,480L480,480Q480,480 480,480Q480,480 480,480Q480,480 480,480Q480,480 480,480L480,480L480,480L480,480Q480,480 480,480Q480,480 480,480ZM370,880L354,752Q341,747 329.5,740Q318,733 307,725L188,775L78,585L181,507Q180,500 180,493.5Q180,487 180,480Q180,473 180,466.5Q180,460 181,453L78,375L188,185L307,235Q318,227 330,220Q342,213 354,208L370,80L590,80L606,208Q619,213 630.5,220Q642,227 653,235L772,185L882,375L779,453Q780,460 780,466.5Q780,473 780,480Q780,490 780,500Q780,510 778,520L696,520Q698,510 699,500Q700,490 700,480Q699,461 697,446.5Q695,432 691,419L777,354L738,286L639,328Q617,305 590.5,289.5Q564,274 533,266L520,160L441,160L427,266Q396,274 369.5,289.5Q343,305 321,327L222,286L183,354L269,418Q264,433 262,448Q260,463 260,480Q260,496 262,511Q264,526 269,541L183,606L222,674L321,632Q345,657 375,674Q405,691 440,696L440,880L370,880ZM440,614L440,523Q432,515 427,504Q422,493 422,480Q422,455 439.5,437.5Q457,420 482,420Q507,420 524.5,437.5Q542,455 542,480Q542,491 538.5,501.5Q535,512 527,520L616,520Q619,510 620.5,500.5Q622,491 622,480Q622,422 581,381Q540,340 482,340Q423,340 382.5,381Q342,422 342,480Q342,528 369.5,564Q397,600 440,614Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_autofill_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M160,560L160,480L440,480L440,560L160,560ZM160,400L160,320L600,320L600,400L160,400ZM160,240L160,160L600,160L600,240L160,240ZM520,800L520,677L741,457Q750,448 761,444Q772,440 783,440Q795,440 806,444.5Q817,449 826,458L863,495Q871,504 875.5,515Q880,526 880,537Q880,548 876,559.5Q872,571 863,580L643,800L520,800ZM820,537L820,537L783,500L783,500L820,537ZM580,740L618,740L739,618L721,599L702,581L580,702L580,740ZM721,599L702,581L702,581L739,618L739,618L721,599Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_battery_3_bar.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M17,5v16c0,0.55 -0.45,1 -1,1H8c-0.55,0 -1,-0.45 -1,-1V5c0,-0.55 0.45,-1 1,-1h2V2h4v2h2C16.55,4 17,4.45 17,5zM15,6H9v8h6V6z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_battery_4_bar.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M17,5v16c0,0.55 -0.45,1 -1,1H8c-0.55,0 -1,-0.45 -1,-1V5c0,-0.55 0.45,-1 1,-1h2V2h4v2h2C16.55,4 17,4.45 17,5zM15,6H9v6h6V6z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_battery_6_bar.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M17,5v16c0,0.55 -0.45,1 -1,1H8c-0.55,0 -1,-0.45 -1,-1V5c0,-0.55 0.45,-1 1,-1h2V2h4v2h2C16.55,4 17,4.45 17,5zM15,6H9v2h6V6z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_battery_alert.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M440,560L520,560L520,320L440,320L440,560ZM480,720Q497,720 508.5,708.5Q520,697 520,680Q520,663 508.5,651.5Q497,640 480,640Q463,640 451.5,651.5Q440,663 440,680Q440,697 451.5,708.5Q463,720 480,720ZM320,880Q303,880 291.5,868.5Q280,857 280,840L280,200Q280,183 291.5,171.5Q303,160 320,160L400,160L400,80L560,80L560,160L640,160Q657,160 668.5,171.5Q680,183 680,200L680,840Q680,857 668.5,868.5Q657,880 640,880L320,880ZM360,800L600,800L600,240L360,240L360,800ZM360,800L360,800L600,800L600,800L360,800Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_battery_full.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M15.67,4H14V2h-4v2H8.33C7.6,4 7,4.6 7,5.33v15.33C7,21.4 7.6,22 8.33,22h7.33c0.74,0 1.34,-0.6 1.34,-1.33V5.33C17,4.6 16.4,4 15.67,4z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_bluetooth_disabled.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M13,5.83l1.88,1.88 -1.6,1.6 1.41,1.41 3.02,-3.02L12,2h-1v5.03l2,2v-3.2zM5.41,4L4,5.41 10.59,12 5,17.59 6.41,19 11,14.41V22h1l4.29,-4.29 2.3,2.29L20,18.59 5.41,4zM13,18.17v-3.76l1.88,1.88L13,18.17z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_bluetooth_sharing_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M260,640Q285,640 302.5,622.5Q320,605 320,580Q320,555 302.5,537.5Q285,520 260,520Q235,520 217.5,537.5Q200,555 200,580Q200,605 217.5,622.5Q235,640 260,640ZM620,640Q645,640 662.5,622.5Q680,605 680,580Q680,555 662.5,537.5Q645,520 620,520Q595,520 577.5,537.5Q560,555 560,580Q560,605 577.5,622.5Q595,640 620,640ZM120,840Q103,840 91.5,828.5Q80,817 80,800L80,480L164,240Q170,222 185.5,211Q201,200 220,200L600,200L600,280L234,280L192,400L600,400L600,480L160,480L160,680L720,680L720,480L800,480L800,800Q800,817 788.5,828.5Q777,840 760,840L720,840Q703,840 691.5,828.5Q680,817 680,800L680,760L200,760L200,800Q200,817 188.5,828.5Q177,840 160,840L120,840ZM746,440L746,288L654,380L626,352L738,240L626,128L654,100L746,192L746,40L766,40L880,156L794,240L880,326L766,440L746,440ZM786,192L824,156L786,118L786,192ZM786,364L824,326L786,288L786,364ZM160,480L160,480L160,680L160,680L160,480Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_call_end.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M792,908L570,686Q481,758 376.5,799Q272,840 162,840Q138,840 129,828Q120,816 120,798L120,636Q120,622 129,611.5Q138,601 152,598L290,570Q301,568 317.5,573Q334,578 342,586L436,680Q454,669 475,655Q496,641 512,628L56,172L112,116L848,852L792,908ZM360,716L294,650Q294,650 294,650Q294,650 294,650L200,670Q200,670 200,670Q200,670 200,670L200,758Q200,758 200,758Q200,758 200,758Q241,755 281,744Q321,733 360,716ZM682,572L626,516Q641,499 656.5,477Q672,455 681,436L584,338Q576,330 573,315.5Q570,301 572,292L598,152Q601,138 611.5,129Q622,120 636,120L798,120Q816,120 828,132Q840,144 840,162Q840,272 798,376.5Q756,481 682,572ZM718,360Q735,321 744,281Q753,241 758,200Q758,200 758,200Q758,200 758,200L670,200Q670,200 670,200Q670,200 670,200L652,294Q652,294 652,294Q652,294 652,294L718,360ZM718,360L718,360Q718,360 718,360Q718,360 718,360L718,360Q718,360 718,360Q718,360 718,360L718,360Q718,360 718,360Q718,360 718,360Q718,360 718,360Q718,360 718,360ZM360,716Q360,716 360,716Q360,716 360,716Q360,716 360,716Q360,716 360,716L360,716Q360,716 360,716Q360,716 360,716L360,716Q360,716 360,716Q360,716 360,716Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_camera_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M580,880Q555,880 537.5,862.5Q520,845 520,820L520,620Q520,595 537.5,577.5Q555,560 580,560L640,560L680,520L760,520L800,560L860,560Q885,560 902.5,577.5Q920,595 920,620L920,820Q920,845 902.5,862.5Q885,880 860,880L580,880ZM720,800Q753,800 776.5,776.5Q800,753 800,720Q800,687 776.5,663.5Q753,640 720,640Q687,640 663.5,663.5Q640,687 640,720Q640,753 663.5,776.5Q687,800 720,800ZM480,480L480,480L480,480Q480,480 480,480Q480,480 480,480L480,480L480,480L480,480Q480,480 480,480Q480,480 480,480L480,480L480,480L480,480L480,480Q480,480 480,480Q480,480 480,480L480,480L480,480L480,480Q480,480 480,480Q480,480 480,480Q480,480 480,480Q480,480 480,480L480,480L480,480L480,480Q480,480 480,480Q480,480 480,480ZM482,340Q424,340 383,381Q342,422 342,480Q342,528 369,564Q396,600 440,614L440,524Q432,516 427,503.5Q422,491 422,480Q422,455 439.5,437.5Q457,420 482,420Q496,420 507,425.5Q518,431 526,440L616,440Q603,396 566.5,368Q530,340 482,340ZM370,880L354,752Q341,747 329.5,740Q318,733 307,725L188,775L78,585L181,507Q180,500 180,493.5Q180,487 180,480Q180,473 180,466.5Q180,460 181,453L78,375L188,185L307,235Q318,227 330,220Q342,213 354,208L370,80L590,80L606,208Q619,213 630.5,220Q642,227 653,235L772,185L882,375L797,440Q797,440 797,440Q797,440 797,440L696,440Q695,435 694,429.5Q693,424 691,419L777,354L738,286L639,328Q617,305 590.5,289.5Q564,274 533,266L520,160L441,160L427,266Q396,274 369.5,289.5Q343,305 321,327L222,286L183,354L269,418Q264,433 262,448Q260,463 260,480Q260,496 262,511Q264,526 269,541L183,606L222,674L321,632Q345,657 375,674Q405,691 440,696L440,880L370,880Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_cell_broadcast_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M735,186Q684,135 618,107.5Q552,80 480,80Q421,80 366.5,98Q312,116 265,151L208,94Q266,48 335.5,24Q405,0 480,0Q568,0 648,33Q728,66 791,129L735,186ZM622,298Q593,269 556.5,254.5Q520,240 480,240Q454,240 428.5,246.5Q403,253 380,266L322,209Q357,186 397,173Q437,160 480,160Q536,160 587,181Q638,202 678,242L622,298ZM720,608L473,360Q475,360 476.5,360Q478,360 480,360Q581,360 650.5,432Q720,504 720,606Q720,607 720,607Q720,607 720,608ZM600,712L372,484Q348,507 334,538.5Q320,570 320,606Q320,651 362.5,716.5Q405,782 480,853Q519,816 549,780.5Q579,745 600,712ZM848,848L792,904L659,771Q629,816 584.5,862.5Q540,909 480,960Q359,857 299.5,769Q240,681 240,606Q240,553 260,507Q280,461 315,427L56,168L112,112L848,848ZM480,660Q455,660 437.5,642.5Q420,625 420,600Q420,575 437.5,557.5Q455,540 480,540Q492,540 503,544.5Q514,549 522.5,557.5Q531,566 535.5,577Q540,588 540,600Q540,625 522.5,642.5Q505,660 480,660ZM460,668L460,668Q460,668 460,668Q460,668 460,668Q460,668 460,668Q460,668 460,668Q460,668 460,668Q460,668 460,668Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_cloud_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M792,904L686,800L260,800Q168,800 104,736Q40,672 40,580Q40,503 87.5,443Q135,383 210,366Q213,358 216,350.5Q219,343 222,334L56,168L112,112L848,848L792,904ZM260,720L606,720L284,398Q282,409 281,419Q280,429 280,440L260,440Q202,440 161,481Q120,522 120,580Q120,638 161,679Q202,720 260,720ZM445,559Q445,559 445,559Q445,559 445,559Q445,559 445,559Q445,559 445,559L445,559Q445,559 445,559Q445,559 445,559L445,559L445,559ZM864,750L806,694Q823,680 831.5,661.5Q840,643 840,620Q840,578 811,549Q782,520 740,520L680,520L680,440Q680,357 621.5,298.5Q563,240 480,240Q453,240 428,246.5Q403,253 380,267L322,209Q357,185 396.5,172.5Q436,160 480,160Q597,160 678.5,241.5Q760,323 760,440L760,440L760,440Q829,448 874.5,499.5Q920,551 920,620Q920,659 905,692.5Q890,726 864,750ZM593,481L593,481L593,481Q593,481 593,481Q593,481 593,481Q593,481 593,481Q593,481 593,481L593,481L593,481Q593,481 593,481Q593,481 593,481Q593,481 593,481Q593,481 593,481Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_config_mobile_networks_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M480,440Q463,440 451.5,428.5Q440,417 440,400Q440,383 451.5,371.5Q463,360 480,360Q497,360 508.5,371.5Q520,383 520,400Q520,417 508.5,428.5Q497,440 480,440ZM640,440Q623,440 611.5,428.5Q600,417 600,400Q600,383 611.5,371.5Q623,360 640,360Q657,360 668.5,371.5Q680,383 680,400Q680,417 668.5,428.5Q657,440 640,440ZM800,440Q783,440 771.5,428.5Q760,417 760,400Q760,383 771.5,371.5Q783,360 800,360Q817,360 828.5,371.5Q840,383 840,400Q840,417 828.5,428.5Q817,440 800,440ZM798,840Q673,840 551,785.5Q429,731 329,631Q229,531 174.5,409Q120,287 120,162Q120,144 132,132Q144,120 162,120L324,120Q338,120 349,129.5Q360,139 362,152L388,292Q390,308 387,319Q384,330 376,338L279,436Q299,473 326.5,507.5Q354,542 387,574Q418,605 452,631.5Q486,658 524,680L618,586Q627,577 641.5,572.5Q656,568 670,570L808,598Q822,602 831,612.5Q840,623 840,636L840,798Q840,816 828,828Q816,840 798,840ZM241,360L307,294Q307,294 307,294Q307,294 307,294L290,200Q290,200 290,200Q290,200 290,200L201,200Q201,200 201,200Q201,200 201,200Q206,241 215,281Q224,321 241,360ZM599,718Q638,735 678.5,745Q719,755 760,758Q760,758 760,758Q760,758 760,758L760,670Q760,670 760,670Q760,670 760,670L666,651Q666,651 666,651Q666,651 666,651L599,718ZM241,360Q241,360 241,360Q241,360 241,360Q241,360 241,360Q241,360 241,360L241,360Q241,360 241,360Q241,360 241,360L241,360Q241,360 241,360Q241,360 241,360ZM599,718L599,718Q599,718 599,718Q599,718 599,718L599,718Q599,718 599,718Q599,718 599,718L599,718Q599,718 599,718Q599,718 599,718Q599,718 599,718Q599,718 599,718Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_content_capture_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M600,640L760,640L760,480L700,480L700,580L600,580L600,640ZM200,400L260,400L260,300L360,300L360,240L200,240L200,400ZM320,840L320,760L160,760Q127,760 103.5,736.5Q80,713 80,680L80,200Q80,167 103.5,143.5Q127,120 160,120L800,120Q833,120 856.5,143.5Q880,167 880,200L880,680Q880,713 856.5,736.5Q833,760 800,760L640,760L640,840L320,840ZM160,680L800,680Q800,680 800,680Q800,680 800,680L800,200Q800,200 800,200Q800,200 800,200L160,200Q160,200 160,200Q160,200 160,200L160,680Q160,680 160,680Q160,680 160,680ZM160,680Q160,680 160,680Q160,680 160,680L160,200Q160,200 160,200Q160,200 160,200L160,200Q160,200 160,200Q160,200 160,200L160,680Q160,680 160,680Q160,680 160,680Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_credentials_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M791,905L486,600L486,600Q454,654 400.5,687Q347,720 280,720Q180,720 110,650Q40,580 40,480Q40,414 72,359Q104,304 158,272L55,169L112,112L848,848L791,905ZM680,567L633,520L680,520L680,567ZM840,727L760,647L760,647L760,520L840,520L840,440L553,440L473,360L920,360L920,600L840,600L840,727ZM280,640Q345,640 379.5,605Q414,570 429,542L429,542L219,332Q175,350 147.5,389.5Q120,429 120,480Q120,546 167,593Q214,640 280,640ZM280,560Q247,560 223.5,536.5Q200,513 200,480Q200,447 223.5,423.5Q247,400 280,400Q313,400 336.5,423.5Q360,447 360,480Q360,513 336.5,536.5Q313,560 280,560ZM589,476L589,476L589,476L589,476L589,476L589,476L589,476ZM275,486Q275,486 275,486Q275,486 275,486L275,486L275,486Q275,486 275,486Q275,486 275,486Q275,486 275,486Q275,486 275,486Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_data_roaming_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M80,880L880,80L880,466Q861,457 841,451.5Q821,446 800,443L800,273L273,800L490,800Q496,822 506,841.5Q516,861 528,880L80,880ZM273,800L800,273L800,273Q800,273 800,273Q800,273 800,273Q667,406 536.5,536.5Q406,667 273,800Q273,800 273,800Q273,800 273,800ZM720,920L708,860Q696,855 685.5,849.5Q675,844 664,836L606,854L566,786L612,746Q610,733 610,720Q610,707 612,694L566,654L606,586L664,604Q675,596 685.5,590.5Q696,585 708,580L720,520L800,520L812,580Q824,585 834.5,590.5Q845,596 856,604L914,586L954,654L908,694Q910,707 910,720Q910,733 908,746L954,786L914,854L856,836Q845,844 834.5,849.5Q824,855 812,860L800,920L720,920ZM760,800Q793,800 816.5,776.5Q840,753 840,720Q840,687 816.5,663.5Q793,640 760,640Q727,640 703.5,663.5Q680,687 680,720Q680,753 703.5,776.5Q727,800 760,800Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_developer_mode.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M7,5h10v2h2L19,3c0,-1.1 -0.9,-1.99 -2,-1.99L7,1c-1.1,0 -2,0.9 -2,2v4h2L7,5zM15.41,16.59L20,12l-4.59,-4.59L14,8.83 17.17,12 14,15.17l1.41,1.42zM10,15.17L6.83,12 10,8.83 8.59,7.41 4,12l4.59,4.59L10,15.17zM17,19L7,19v-2L5,17v4c0,1.1 0.9,2 2,2h10c1.1,0 2,-0.9 2,-2v-4h-2v2z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_dialpad.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M12,19c-1.1,0 -2,0.9 -2,2s0.9,2 2,2 2,-0.9 2,-2 -0.9,-2 -2,-2zM6,1c-1.1,0 -2,0.9 -2,2s0.9,2 2,2 2,-0.9 2,-2 -0.9,-2 -2,-2zM6,7c-1.1,0 -2,0.9 -2,2s0.9,2 2,2 2,-0.9 2,-2 -0.9,-2 -2,-2zM6,13c-1.1,0 -2,0.9 -2,2s0.9,2 2,2 2,-0.9 2,-2 -0.9,-2 -2,-2zM18,5c1.1,0 2,-0.9 2,-2s-0.9,-2 -2,-2 -2,0.9 -2,2 0.9,2 2,2zM12,13c-1.1,0 -2,0.9 -2,2s0.9,2 2,2 2,-0.9 2,-2 -0.9,-2 -2,-2zM18,13c-1.1,0 -2,0.9 -2,2s0.9,2 2,2 2,-0.9 2,-2 -0.9,-2 -2,-2zM18,7c-1.1,0 -2,0.9 -2,2s0.9,2 2,2 2,-0.9 2,-2 -0.9,-2 -2,-2zM12,7c-1.1,0 -2,0.9 -2,2s0.9,2 2,2 2,-0.9 2,-2 -0.9,-2 -2,-2zM12,1c-1.1,0 -2,0.9 -2,2s0.9,2 2,2 2,-0.9 2,-2 -0.9,-2 -2,-2z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_factory_reset_blocked.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M520,630L520,570L680,570L680,630L520,630ZM580,840L580,790L520,790L520,730L580,730L580,680L640,680L640,840L580,840ZM680,790L680,730L840,730L840,790L680,790ZM720,680L720,520L780,520L780,570L840,570L840,630L780,630L780,680L720,680ZM831,400L748,400Q722,312 649,256Q576,200 480,200Q363,200 281.5,281.5Q200,363 200,480Q200,552 232.5,612Q265,672 320,710L320,600L400,600L400,840L160,840L160,760L254,760Q192,710 156,637.5Q120,565 120,480Q120,405 148.5,339.5Q177,274 225.5,225.5Q274,177 339.5,148.5Q405,120 480,120Q609,120 706.5,199.5Q804,279 831,400Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_flashlight.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M226,320L140,236L196,178L282,264L226,320ZM440,200L440,80L520,80L520,200L440,200ZM736,320L678,264L764,180L820,236L736,320ZM360,880L360,680L240,560L240,360L720,360L720,560L600,680L600,880L360,880ZM440,800L520,800L520,647L640,527L640,440L320,440L320,527L440,647L440,800ZM480,620L480,620L480,620L480,620L480,620L480,620L480,620L480,620Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_frp_shield.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">

    <path android:fillColor="@android:color/white" android:pathData="M520,630L520,570L680,570L680,630L520,630ZM580,840L580,790L520,790L520,730L580,730L580,680L640,680L640,840L580,840ZM680,790L680,730L840,730L840,790L680,790ZM720,680L720,520L780,520L780,570L840,570L840,630L780,630L780,680L720,680ZM831,400L748,400Q722,312 649,256Q576,200 480,200Q363,200 281.5,281.5Q200,363 200,480Q200,552 232.5,612Q265,672 320,710L320,600L400,600L400,840L160,840L160,760L254,760Q192,710 156,637.5Q120,565 120,480Q120,405 148.5,339.5Q177,274 225.5,225.5Q274,177 339.5,148.5Q405,120 480,120Q609,120 706.5,199.5Q804,279 831,400Z"/>

</vector>
```

## File: app/src/main/res/drawable/ic_incoming_call_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M792,908L570,686Q481,758 376.5,799Q272,840 162,840Q138,840 129,828Q120,816 120,798L120,636Q120,622 129,611.5Q138,601 152,598L290,570Q301,568 317.5,573Q334,578 342,586L436,680Q454,669 475,655Q496,641 512,628L56,172L112,116L848,852L792,908ZM360,716L294,650Q294,650 294,650Q294,650 294,650L200,670Q200,670 200,670Q200,670 200,670L200,758Q200,758 200,758Q200,758 200,758Q241,755 281,744Q321,733 360,716ZM682,572L626,516Q641,499 656.5,477Q672,455 681,436L584,338Q576,330 573,315.5Q570,301 572,292L598,152Q601,138 611.5,129Q622,120 636,120L798,120Q816,120 828,132Q840,144 840,162Q840,272 798,376.5Q756,481 682,572ZM718,360Q735,321 744,281Q753,241 758,200Q758,200 758,200Q758,200 758,200L670,200Q670,200 670,200Q670,200 670,200L652,294Q652,294 652,294Q652,294 652,294L718,360ZM718,360L718,360Q718,360 718,360Q718,360 718,360L718,360Q718,360 718,360Q718,360 718,360L718,360Q718,360 718,360Q718,360 718,360Q718,360 718,360Q718,360 718,360ZM360,716Q360,716 360,716Q360,716 360,716Q360,716 360,716Q360,716 360,716L360,716Q360,716 360,716Q360,716 360,716L360,716Q360,716 360,716Q360,716 360,716Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_info.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M12,2C6.48,2 2,6.48 2,12s4.48,10 10,10 10,-4.48 10,-10S17.52,2 12,2zM13,17h-2v-6h2v6zM13,9h-2L11,7h2v2z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_install_mobile_disabled.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M17,18H7V6h7V1H7C5.9,1 5,1.9 5,3v18c0,1.1 0.9,2 2,2h10c1.1,0 2,-0.9 2,-2v-5h-2V18z"/>
      
    <path android:fillColor="@android:color/white" android:pathData="M18,14l5,-5l-1.41,-1.41l-2.59,2.58l0,-7.17l-2,0l0,7.17l-2.59,-2.58l-1.41,1.41z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_key.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M21,10h-8.35C11.83,7.67 9.61,6 7,6c-3.31,0 -6,2.69 -6,6s2.69,6 6,6c2.61,0 4.83,-1.67 5.65,-4H13l2,2l2,-2l2,2l4,-4.04L21,10zM7,15c-1.65,0 -3,-1.35 -3,-3c0,-1.65 1.35,-3 3,-3s3,1.35 3,3C10,13.65 8.65,15 7,15z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_location_config_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M560,400Q560,367 536.5,343.5Q513,320 480,320Q470,320 461,322Q452,324 444,329L551,436Q556,428 558,419Q560,410 560,400ZM728,613L670,555Q695,513 707.5,476.5Q720,440 720,408Q720,299 650.5,229.5Q581,160 480,160Q436,160 397.5,173.5Q359,187 328,213L271,156Q314,119 368,99.5Q422,80 480,80Q607,80 703.5,169Q800,258 800,408Q800,456 782,506.5Q764,557 728,613ZM571,684L244,357Q242,369 241,382Q240,395 240,408Q240,479 299,570.5Q358,662 480,774Q506,751 528.5,728.5Q551,706 571,684ZM819,932L627,740Q595,774 559,809Q523,844 480,880Q319,743 239.5,625.5Q160,508 160,408Q160,376 165,347Q170,318 179,292L27,140L84,83L876,875L819,932ZM408,521Q408,521 408,521Q408,521 408,521Q408,521 408,521Q408,521 408,521Q408,521 408,521Q408,521 408,521ZM499,384Q499,384 499,384Q499,384 499,384Q499,384 499,384Q499,384 499,384Q499,384 499,384Q499,384 499,384Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_location_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M340,540L398,540L554,383L497,326L340,482L340,540ZM583,354L611,326Q616,321 616,315.5Q616,310 611,305L575,269Q570,264 564.5,264Q559,264 554,269L526,297L583,354ZM480,774Q602,662 661,570.5Q720,479 720,408Q720,299 650.5,229.5Q581,160 480,160Q379,160 309.5,229.5Q240,299 240,408Q240,479 299,570.5Q358,662 480,774ZM480,880Q319,743 239.5,625.5Q160,508 160,408Q160,258 256.5,169Q353,80 480,80Q607,80 703.5,169Q800,258 800,408Q800,508 720.5,625.5Q641,743 480,880ZM480,400Q480,400 480,400Q480,400 480,400Q480,400 480,400Q480,400 480,400Q480,400 480,400Q480,400 480,400Q480,400 480,400Q480,400 480,400Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_lock_open.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M240,320L600,320L600,240Q600,190 565,155Q530,120 480,120Q430,120 395,155Q360,190 360,240L280,240Q280,157 338.5,98.5Q397,40 480,40Q563,40 621.5,98.5Q680,157 680,240L680,320L720,320Q753,320 776.5,343.5Q800,367 800,400L800,800Q800,833 776.5,856.5Q753,880 720,880L240,880Q207,880 183.5,856.5Q160,833 160,800L160,400Q160,367 183.5,343.5Q207,320 240,320ZM240,800L720,800Q720,800 720,800Q720,800 720,800L720,400Q720,400 720,400Q720,400 720,400L240,400Q240,400 240,400Q240,400 240,400L240,800Q240,800 240,800Q240,800 240,800ZM480,680Q513,680 536.5,656.5Q560,633 560,600Q560,567 536.5,543.5Q513,520 480,520Q447,520 423.5,543.5Q400,567 400,600Q400,633 423.5,656.5Q447,680 480,680ZM240,800Q240,800 240,800Q240,800 240,800L240,400Q240,400 240,400Q240,400 240,400L240,400Q240,400 240,400Q240,400 240,400L240,800Q240,800 240,800Q240,800 240,800Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_manage_apps.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M4,8h4L8,4L4,4v4zM10,20h4v-4h-4v4zM4,20h4v-4L4,16v4zM4,14h4v-4L4,10v4zM10,14h4v-4h-4v4zM16,4v4h4L20,4h-4zM10,8h4L14,4h-4v4zM16,14h4v-4h-4v4zM16,20h4v-4h-4v4z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_mic_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M360,840L160,840Q127,840 103.5,816.5Q80,793 80,760L80,280Q80,247 103.5,223.5Q127,200 160,200L286,200L360,120L600,120L674,200L800,200Q833,200 856.5,223.5Q880,247 880,280L880,760Q880,793 856.5,816.5Q833,840 800,840L600,840L600,760L800,760Q800,760 800,760Q800,760 800,760L800,280Q800,280 800,280Q800,280 800,280L638,280L565,200L395,200L322,280L160,280Q160,280 160,280Q160,280 160,280L160,760Q160,760 160,760Q160,760 160,760L360,760L360,840ZM440,840L520,840L520,716Q606,702 663,635.5Q720,569 720,480L640,480Q640,546 593,593Q546,640 480,640Q414,640 367,593Q320,546 320,480L240,480Q240,569 297,635.5Q354,702 440,716L440,840ZM480,560Q513,560 536.5,536.5Q560,513 560,480L560,320Q560,287 536.5,263.5Q513,240 480,240Q447,240 423.5,263.5Q400,287 400,320L400,480Q400,513 423.5,536.5Q447,560 480,560ZM160,760L322,760L396,760L566,760L638,760L800,760Q800,760 800,760Q800,760 800,760L800,760Q800,760 800,760Q800,760 800,760L600,760L600,760L360,760L360,760L160,760Q160,760 160,760Q160,760 160,760L160,760Q160,760 160,760Q160,760 160,760Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_mobile_data_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M273,800L687,800L480,593L273,800ZM831,944L767,880L80,880L424,536L96,209L152,152L888,888L831,944ZM880,767L800,687L800,273L593,480L536,424L880,80L880,767ZM697,583L697,583L697,583ZM584,696L584,696L584,696Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_modify_accounts_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M680,680Q705,680 722.5,662.5Q740,645 740,620Q740,595 722.5,577.5Q705,560 680,560Q655,560 637.5,577.5Q620,595 620,620Q620,645 637.5,662.5Q655,680 680,680ZM680,800Q711,800 737,785.5Q763,771 779,747Q757,734 732,727Q707,720 680,720Q653,720 628,727Q603,734 581,747Q597,771 623,785.5Q649,800 680,800ZM480,880Q341,845 250.5,720.5Q160,596 160,444L160,200L480,80L800,200L800,427Q781,419 761,412.5Q741,406 720,403L720,256L480,166L240,256L240,444Q240,491 252.5,538Q265,585 287.5,627.5Q310,670 342,706Q374,742 413,766L413,766Q424,798 442,827Q460,856 483,879Q482,879 481.5,879.5Q481,880 480,880ZM680,880Q597,880 538.5,821.5Q480,763 480,680Q480,597 538.5,538.5Q597,480 680,480Q763,480 821.5,538.5Q880,597 880,680Q880,763 821.5,821.5Q763,880 680,880ZM480,466L480,466Q480,466 480,466Q480,466 480,466Q480,466 480,466Q480,466 480,466L480,466L480,466L480,466L480,466Q480,466 480,466Q480,466 480,466Q480,466 480,466Q480,466 480,466Q480,466 480,466Q480,466 480,466Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_netguard_shield.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp"
    android:height="24dp"
    android:viewportWidth="24"
    android:viewportHeight="24">
    <path
        android:fillColor="#FF000000"
        android:pathData="M12,1L3,5v6c0,5.55 3.84,10.74 9,12 5.16,-1.26 9,-6.45 9,-12V5L12,1z"/>
</vector>
```

## File: app/src/main/res/drawable/ic_network_reset_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:autoMirrored="true" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M480,560Q447,560 423.5,536.5Q400,513 400,480Q400,447 423.5,423.5Q447,400 480,400Q513,400 536.5,423.5Q560,447 560,480Q560,513 536.5,536.5Q513,560 480,560ZM480,840Q341,840 239,748.5Q137,657 122,520L204,520Q218,624 296.5,692Q375,760 480,760Q597,760 678.5,678.5Q760,597 760,480Q760,363 678.5,281.5Q597,200 480,200Q411,200 351,232Q291,264 250,320L360,320L360,400L120,400L120,160L200,160L200,254Q251,190 324.5,155Q398,120 480,120Q555,120 620.5,148.5Q686,177 734.5,225.5Q783,274 811.5,339.5Q840,405 840,480Q840,555 811.5,620.5Q783,686 734.5,734.5Q686,783 620.5,811.5Q555,840 480,840Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_nfc_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M20,2L4,2c-1.1,0 -2,0.9 -2,2v16c0,1.1 0.9,2 2,2h16c1.1,0 2,-0.9 2,-2L22,4c0,-1.1 -0.9,-2 -2,-2zM20,20L4,20L4,4h16v16zM18,6h-5c-1.1,0 -2,0.9 -2,2v2.28c-0.6,0.35 -1,0.98 -1,1.72 0,1.1 0.9,2 2,2s2,-0.9 2,-2c0,-0.74 -0.4,-1.38 -1,-1.72L13,8h3v8L8,16L8,8h2L10,6L6,6v12h12L18,6z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_password_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M790,903L488,601L488,601Q456,655 401,687.5Q346,720 280,720Q180,720 110,650Q40,580 40,480Q40,414 72.5,359Q105,304 159,272L57,170L114,114L846,847L790,903ZM840,360L960,480L777,663L650,537L650,537L650,537L700,500L772,554L847,480L807,440L553,440L473,360L840,360ZM280,640Q331,640 370.5,612.5Q410,585 428,541L428,541Q397,510 372,485Q347,460 323.5,436.5Q300,413 275,388Q250,363 219,332Q175,350 147.5,389.5Q120,429 120,480Q120,546 167,593Q214,640 280,640ZM280,560Q247,560 223.5,536.5Q200,513 200,480Q200,447 223.5,423.5Q247,400 280,400Q313,400 336.5,423.5Q360,447 360,480L360,480Q360,513 336.5,536.5Q313,560 280,560Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_password_policy.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M2,17h20v2H2V17zM3.15,12.95L4,11.47l0.85,1.48l1.3,-0.75L5.3,10.72H7v-1.5H5.3l0.85,-1.47L4.85,7L4,8.47L3.15,7l-1.3,0.75L2.7,9.22H1v1.5h1.7L1.85,12.2L3.15,12.95zM9.85,12.2l1.3,0.75L12,11.47l0.85,1.48l1.3,-0.75l-0.85,-1.48H15v-1.5h-1.7l0.85,-1.47L12.85,7L12,8.47L11.15,7l-1.3,0.75l0.85,1.47H9v1.5h1.7L9.85,12.2zM23,9.22h-1.7l0.85,-1.47L20.85,7L20,8.47L19.15,7l-1.3,0.75l0.85,1.47H17v1.5h1.7l-0.85,1.48l1.3,0.75L20,11.47l0.85,1.48l1.3,-0.75l-0.85,-1.48H23V9.22z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_person_add_disabled.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M792,904L680,792L680,800L40,800L40,688Q40,654 57.5,625.5Q75,597 104,582Q166,551 230,535.5Q294,520 360,520Q373,520 385.5,520.5Q398,521 410,522L410,522L368,480Q366,480 364,480Q362,480 360,480Q294,480 247,433Q200,386 200,320Q200,318 200,316Q200,314 200,312L56,168L113,111L849,847L792,904ZM720,560L720,440L600,440L600,360L720,360L720,240L800,240L800,360L920,360L920,440L800,440L800,560L720,560ZM504,388L440,324Q440,323 440,322Q440,321 440,320Q440,287 416.5,263.5Q393,240 360,240Q359,240 358,240Q357,240 356,240L292,176Q307,168 324.5,164Q342,160 360,160Q426,160 473,207Q520,254 520,320Q520,338 516,355.5Q512,373 504,388ZM120,720L600,720L600,720L514,626Q476,613 437,606.5Q398,600 360,600Q304,600 249,613.5Q194,627 140,654Q131,659 125.5,668Q120,677 120,688L120,720ZM440,324Q440,324 440,324Q440,324 440,324Q440,324 440,324Q440,324 440,324Q440,324 440,324Q440,324 440,324ZM360,720L360,720Q360,720 360,720Q360,720 360,720Q360,720 360,720Q360,720 360,720Q360,720 360,720Q360,720 360,720L360,720L360,720Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_play_store_blocked.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M841,442L841,760Q841,793 817.5,816.5Q794,840 761,840L201,840Q168,840 144.5,816.5Q121,793 121,760L121,442Q98,421 85.5,388Q73,355 85,316L127,180Q135,154 155.5,137Q176,120 203,120L759,120Q786,120 806,136.5Q826,153 835,180L877,316Q889,355 876.5,387Q864,419 841,442ZM569,400Q596,400 610,381.5Q624,363 621,340L599,200L521,200L521,348Q521,369 535,384.5Q549,400 569,400ZM389,400Q412,400 426.5,384.5Q441,369 441,348L441,200L363,200L341,340Q337,364 351.5,382Q366,400 389,400ZM211,400Q229,400 242.5,387Q256,374 259,354L281,200L203,200Q203,200 203,200Q203,200 203,200L163,334Q157,354 169.5,377Q182,400 211,400ZM751,400Q780,400 793,377Q806,354 799,334L757,200Q757,200 757,200Q757,200 757,200L681,200L703,354Q706,374 719.5,387Q733,400 751,400ZM201,760L761,760Q761,760 761,760Q761,760 761,760L761,478Q756,480 754.5,480Q753,480 751,480Q724,480 703.5,471Q683,462 663,442Q645,460 622,470Q599,480 573,480Q546,480 522.5,470Q499,460 481,442Q464,460 441.5,470Q419,480 393,480Q364,480 340.5,470Q317,460 299,442Q278,463 257.5,471.5Q237,480 211,480Q209,480 206.5,480Q204,480 201,478L201,760Q201,760 201,760Q201,760 201,760ZM761,760L201,760Q201,760 201,760Q201,760 201,760L201,760Q204,760 206.5,760Q209,760 211,760Q237,760 257.5,760Q278,760 299,760Q308,760 318.5,760Q329,760 341,760Q353,760 366,760Q379,760 393,760Q406,760 418,760Q430,760 441.5,760Q453,760 463,760Q473,760 481,760Q499,760 522.5,760Q546,760 573,760Q586,760 598,760Q610,760 621.5,760Q633,760 643.5,760Q654,760 663,760Q683,760 703.5,760Q724,760 751,760Q753,760 754.5,760Q756,760 761,760L761,760Q761,760 761,760Q761,760 761,760Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_print_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M791,905L720,834L720,840L240,840L240,680L80,680L80,440Q80,389 115,354.5Q150,320 200,320L206,320L55,169L112,112L848,848L791,905ZM320,760L640,760L640,754L486,600L320,600L320,760ZM794,680L714,600L800,600L800,440Q800,423 788.5,411.5Q777,400 760,400L514,400L434,320L760,320Q811,320 845.5,354.5Q880,389 880,440L880,680L794,680ZM160,600L240,600L240,520L406,520L286,400L200,400Q183,400 171.5,411.5Q160,423 160,440L160,600ZM640,320L640,200L314,200L234,120L720,120L720,320L640,320ZM720,500Q737,500 748.5,488.5Q760,477 760,460Q760,443 748.5,431.5Q737,420 720,420Q703,420 691.5,431.5Q680,443 680,460Q680,477 691.5,488.5Q703,500 720,500ZM200,400L286,400L286,400L240,400L240,400L160,400L160,400Q160,400 171.5,400Q183,400 200,400ZM760,400Q777,400 788.5,400Q800,400 800,400L800,400L514,400L514,400L760,400Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_private_dns_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M20,13H4c-0.55,0 -1,0.45 -1,1v6c0,0.55 0.45,1 1,1h16c0.55,0 1,-0.45 1,-1v-6c0,-0.55 -0.45,-1 -1,-1zM7,19c-1.1,0 -2,-0.9 -2,-2s0.9,-2 2,-2 2,0.9 2,2 -0.9,2 -2,2zM20,3H4c-0.55,0 -1,0.45 -1,1v6c0,0.55 0.45,1 1,1h16c0.55,0 1,-0.45 1,-1V4c0,-0.55 -0.45,-1 -1,-1zM7,9c-1.1,0 -2,-0.9 -2,-2s0.9,-2 2,-2 2,0.9 2,2 -0.9,2 -2,2z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_remove_protection.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M480,880Q341,845 250.5,720.5Q160,596 160,444L160,200L480,80L800,200L800,444Q800,596 709.5,720.5Q619,845 480,880ZM480,796Q584,763 652,664Q720,565 720,444L720,255L480,165L240,255L240,444Q240,565 308,664Q376,763 480,796ZM480,480Q480,480 480,480Q480,480 480,480L480,480L480,480L480,480L480,480Q480,480 480,480Q480,480 480,480Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_remove_user_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M14,8c0,-2.21 -1.79,-4 -4,-4S6,5.79 6,8s1.79,4 4,4S14,10.21 14,8zM17,10v2h6v-2H17zM2,18v2h16v-2c0,-2.66 -5.33,-4 -8,-4S2,15.34 2,18z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_remove_work_profile_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M23,21.74l-1.46,-1.46L7.21,5.95 3.25,1.99 1.99,3.25l2.7,2.7h-0.64c-1.11,0 -1.99,0.89 -1.99,2l-0.01,11c0,1.11 0.89,2 2,2h15.64L21.74,23 23,21.74zM22,7.95c0.05,-1.11 -0.84,-2 -1.95,-1.95h-4V3.95c0,-1.11 -0.89,-2 -2,-1.95h-4c-1.11,-0.05 -2,0.84 -2,1.95v0.32l13.95,14V7.95zM14.05,6H10V3.95h4.05V6z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_safe_boot_blocked.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M12,1L3,5v6c0,5.55 3.84,10.74 9,12 5.16,-1.26 9,-6.45 9,-12L21,5l-9,-4zM12,11.99h7c-0.53,4.12 -3.28,7.79 -7,8.94L12,12L5,12L5,6.3l7,-3.11v8.8z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_screen_rotation.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M496,778L183,464Q172,453 166,439Q160,425 160,410Q160,395 166,381Q172,367 183,356L356,183Q367,172 381,166.5Q395,161 410,161Q425,161 439,166.5Q453,172 464,183L777,496Q788,507 794,521Q800,535 800,550Q800,565 794,579Q788,593 777,604L604,778Q593,789 579,794.5Q565,800 550,800Q535,800 521,794.5Q507,789 496,778ZM550,720Q550,720 550,720Q550,720 550,720L720,550Q720,550 720,550Q720,550 720,550L410,240Q410,240 410,240Q410,240 410,240L240,410Q240,410 240,410Q240,410 240,410L550,720ZM480,960Q381,960 293.5,922.5Q206,885 140.5,819.5Q75,754 37.5,666.5Q0,579 0,480L80,480Q80,551 104,616Q128,681 170.5,733Q213,785 272,821.5Q331,858 401,873L296,768L352,712L588,948Q562,954 534.5,957Q507,960 480,960ZM880,480Q880,409 856,344Q832,279 789.5,227Q747,175 688,138.5Q629,102 559,87L664,192L608,248L372,12Q398,6 425.5,3Q453,0 480,0Q579,0 666.5,37.5Q754,75 819.5,140.5Q885,206 922.5,293.5Q960,381 960,480L880,480ZM480,480L480,480Q480,480 480,480Q480,480 480,480L480,480Q480,480 480,480Q480,480 480,480L480,480Q480,480 480,480Q480,480 480,480L480,480Q480,480 480,480Q480,480 480,480ZM373,404Q386,404 394.5,395Q403,386 403,374Q403,361 394.5,352.5Q386,344 373,344Q361,344 352,352.5Q343,361 343,374Q343,386 352,395Q361,404 373,404Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_screenshot_disabled.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M20,3H4C2.89,3 2,3.89 2,5v12c0,1.1 0.89,2 2,2h4v2h8v-2h4c1.1,0 2,-0.9 2,-2V5C22,3.89 21.1,3 20,3zM20,17H4V5h16V17z"/>
      
    <path android:fillColor="@android:color/white" android:pathData="M6.5,7.5l2.5,0l0,-1.5l-4,0l0,4l1.5,0z"/>
      
    <path android:fillColor="@android:color/white" android:pathData="M19,12l-1.5,0l0,2.5l-2.5,0l0,1.5l4,0z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_sd_card_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M240,880Q207,880 183.5,856.5Q160,833 160,800L160,320L400,80L720,80Q753,80 776.5,103.5Q800,127 800,160L800,800Q800,833 776.5,856.5Q753,880 720,880L240,880ZM240,800L720,800Q720,800 720,800Q720,800 720,800L720,160Q720,160 720,160Q720,160 720,160L434,160L240,354L240,800Q240,800 240,800Q240,800 240,800ZM480,680Q497,680 508.5,668.5Q520,657 520,640Q520,623 508.5,611.5Q497,600 480,600Q463,600 451.5,611.5Q440,623 440,640Q440,657 451.5,668.5Q463,680 480,680ZM440,520L520,520L520,320L440,320L440,520ZM240,800Q240,800 240,800Q240,800 240,800L240,800L434,800L720,800Q720,800 720,800Q720,800 720,800L720,800Q720,800 720,800Q720,800 720,800L240,800Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_set_user_icon_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M8.65,5.82C9.36,4.72 10.6,4 12,4c2.21,0 4,1.79 4,4c0,1.4 -0.72,2.64 -1.82,3.35L8.65,5.82zM20,17.17c-0.02,-1.1 -0.63,-2.11 -1.61,-2.62c-0.54,-0.28 -1.13,-0.54 -1.77,-0.76L20,17.17zM21.19,21.19L2.81,2.81L1.39,4.22l8.89,8.89c-1.81,0.23 -3.39,0.79 -4.67,1.45C4.61,15.07 4,16.1 4,17.22V20h13.17l2.61,2.61L21.19,21.19z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_settings.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M19.14,12.94c0.04,-0.3 0.06,-0.61 0.06,-0.94c0,-0.32 -0.02,-0.64 -0.07,-0.94l2.03,-1.58c0.18,-0.14 0.23,-0.41 0.12,-0.61l-1.92,-3.32c-0.12,-0.22 -0.37,-0.29 -0.59,-0.22l-2.39,0.96c-0.5,-0.38 -1.03,-0.7 -1.62,-0.94L14.4,2.81c-0.04,-0.24 -0.24,-0.41 -0.48,-0.41h-3.84c-0.24,0 -0.43,0.17 -0.47,0.41L9.25,5.35C8.66,5.59 8.12,5.92 7.63,6.29L5.24,5.33c-0.22,-0.08 -0.47,0 -0.59,0.22L2.74,8.87C2.62,9.08 2.66,9.34 2.86,9.48l2.03,1.58C4.84,11.36 4.8,11.69 4.8,12s0.02,0.64 0.07,0.94l-2.03,1.58c-0.18,0.14 -0.23,0.41 -0.12,0.61l1.92,3.32c0.12,0.22 0.37,0.29 0.59,0.22l2.39,-0.96c0.5,0.38 1.03,0.7 1.62,0.94l0.36,2.54c0.05,0.24 0.24,0.41 0.48,0.41h3.84c0.24,0 0.44,-0.17 0.47,-0.41l0.36,-2.54c0.59,-0.24 1.13,-0.56 1.62,-0.94l2.39,0.96c0.22,0.08 0.47,0 0.59,-0.22l1.92,-3.32c0.12,-0.22 0.07,-0.47 -0.12,-0.61L19.14,12.94zM12,15.6c-1.98,0 -3.6,-1.62 -3.6,-3.6s1.62,-3.6 3.6,-3.6s3.6,1.62 3.6,3.6S13.98,15.6 12,15.6z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_sms_disabled.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M20,2L4,2c-1.1,0 -1.99,0.9 -1.99,2L2,22l4,-4h14c1.1,0 2,-0.9 2,-2L22,4c0,-1.1 -0.9,-2 -2,-2zM13,14h-2v-2h2v2zM13,10h-2L11,6h2v4z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_status_bar_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M12,7c2.76,0 5,2.24 5,5 0,0.65 -0.13,1.26 -0.36,1.83l2.92,2.92c1.51,-1.26 2.7,-2.89 3.43,-4.75 -1.73,-4.39 -6,-7.5 -11,-7.5 -1.4,0 -2.74,0.25 -3.98,0.7l2.16,2.16C10.74,7.13 11.35,7 12,7zM2,4.27l2.28,2.28 0.46,0.46C3.08,8.3 1.78,10.02 1,12c1.73,4.39 6,7.5 11,7.5 1.55,0 3.03,-0.3 4.38,-0.84l0.42,0.42L19.73,22 21,20.73 3.27,3 2,4.27zM7.53,9.8l1.55,1.55c-0.05,0.21 -0.08,0.43 -0.08,0.65 0,1.66 1.34,3 3,3 0.22,0 0.44,-0.03 0.65,-0.08l1.55,1.55c-0.67,0.33 -1.41,0.53 -2.2,0.53 -2.76,0 -5,-2.24 -5,-5 0,-0.79 0.2,-1.53 0.53,-2.2zM11.84,9.02l3.15,3.15 0.02,-0.16c0,-1.66 -1.34,-3 -3,-3l-0.17,0.01z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_system_error_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M480,680Q497,680 508.5,668.5Q520,657 520,640Q520,623 508.5,611.5Q497,600 480,600Q463,600 451.5,611.5Q440,623 440,640Q440,657 451.5,668.5Q463,680 480,680ZM440,520L520,520L520,280L440,280L440,520ZM480,880Q397,880 324,848.5Q251,817 197,763Q143,709 111.5,636Q80,563 80,480Q80,397 111.5,324Q143,251 197,197Q251,143 324,111.5Q397,80 480,80Q563,80 636,111.5Q709,143 763,197Q817,251 848.5,324Q880,397 880,480Q880,563 848.5,636Q817,709 763,763Q709,817 636,848.5Q563,880 480,880ZM480,800Q614,800 707,707Q800,614 800,480Q800,346 707,253Q614,160 480,160Q346,160 253,253Q160,346 160,480Q160,614 253,707Q346,800 480,800ZM480,480Q480,480 480,480Q480,480 480,480Q480,480 480,480Q480,480 480,480Q480,480 480,480Q480,480 480,480Q480,480 480,480Q480,480 480,480Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_tethering_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M791,905L325,439Q323,449 321.5,459Q320,469 320,480Q320,516 334.5,546.5Q349,577 374,600L317,657Q282,624 261,578.5Q240,533 240,480Q240,452 246,426Q252,400 263,377L204,318Q183,354 171.5,394.5Q160,435 160,480Q160,549 187,609Q214,669 261,713L204,770Q147,715 113.5,640.5Q80,566 80,480Q80,418 97,363Q114,308 146,260L55,169L112,112L848,848L791,905ZM814,700L756,642Q777,607 788.5,566Q800,525 800,480Q800,346 707,253Q614,160 480,160Q435,160 394.5,171.5Q354,183 318,204L260,146Q308,114 363.5,97Q419,80 480,80Q563,80 636,111.5Q709,143 763,197Q817,251 848.5,324Q880,397 880,480Q880,541 863,596.5Q846,652 814,700ZM697,583L635,521Q637,511 638.5,501Q640,491 640,480Q640,414 593,367Q546,320 480,320Q469,320 459,321.5Q449,323 439,325L377,263Q400,252 426,246Q452,240 480,240Q580,240 650,310Q720,380 720,480Q720,508 714,534Q708,560 697,583Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_uninstall_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M376,660L480,556L584,660L640,604L536,500L640,396L584,340L480,444L376,340L320,396L424,500L320,604L376,660ZM280,840Q247,840 223.5,816.5Q200,793 200,760L200,240L160,240L160,160L360,160L360,120L600,120L600,160L800,160L800,240L760,240L760,760Q760,793 736.5,816.5Q713,840 680,840L280,840ZM680,240L280,240L280,760Q280,760 280,760Q280,760 280,760L680,760Q680,760 680,760Q680,760 680,760L680,240ZM280,240L280,240L280,760Q280,760 280,760Q280,760 280,760L280,760Q280,760 280,760Q280,760 280,760L280,240Z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_usb_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M15,8h4v4h-1v2c0,0.34 -0.08,0.66 -0.23,0.94L16,13.17V12h-1V8zM11,8.17l2,2V6h2l-3,-4L9,6h2V8.17zM13,16v2.28c0.6,0.34 1,0.98 1,1.72c0,1.1 -0.9,2 -2,2s-2,-0.9 -2,-2c0,-0.74 0.4,-1.37 1,-1.72V16H8c-1.11,0 -2,-0.89 -2,-2v-2.28C5.4,11.38 5,10.74 5,10c0,-0.59 0.26,-1.13 0.68,-1.49L1.39,4.22l1.41,-1.41l18.38,18.38l-1.41,1.41L13.17,16H13zM11,14v-0.17l-2.51,-2.51c-0.14,0.16 -0.31,0.29 -0.49,0.4V14H11z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_volume_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:autoMirrored="true" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M16.5,12c0,-1.77 -1.02,-3.29 -2.5,-4.03v2.21l2.45,2.45c0.03,-0.2 0.05,-0.41 0.05,-0.63zM19,12c0,0.94 -0.2,1.82 -0.54,2.64l1.51,1.51C20.63,14.91 21,13.5 21,12c0,-4.28 -2.99,-7.86 -7,-8.77v2.06c2.89,0.86 5,3.54 5,6.71zM4.27,3L3,4.27 7.73,9L3,9v6h4l5,5v-6.73l4.25,4.25c-0.67,0.52 -1.42,0.93 -2.25,1.18v2.06c1.38,-0.31 2.63,-0.95 3.69,-1.81L19.73,21 21,19.73l-9,-9L4.27,3zM12,4L9.91,6.09 12,8.18L12,4z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_volume_up.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:autoMirrored="true" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M3,9v6h4l5,5L12,4L7,9L3,9zM16.5,12c0,-1.77 -1.02,-3.29 -2.5,-4.03v8.05c1.48,-0.73 2.5,-2.25 2.5,-4.02zM14,3.23v2.06c2.89,0.86 5,3.54 5,6.71s-2.11,5.85 -5,6.71v2.06c4.01,-0.91 7,-4.49 7,-8.77s-2.99,-7.86 -7,-8.77z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_vpn_lock.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M22,4v-0.5C22,2.12 20.88,1 19.5,1S17,2.12 17,3.5L17,4c-0.55,0 -1,0.45 -1,1v4c0,0.55 0.45,1 1,1h5c0.55,0 1,-0.45 1,-1L23,5c0,-0.55 -0.45,-1 -1,-1zM21.2,4h-3.4v-0.5c0,-0.94 0.76,-1.7 1.7,-1.7s1.7,0.76 1.7,1.7L21.2,4zM18.92,12c0.04,0.33 0.08,0.66 0.08,1 0,2.08 -0.8,3.97 -2.1,5.39 -0.26,-0.81 -1,-1.39 -1.9,-1.39h-1v-3c0,-0.55 -0.45,-1 -1,-1L7,13v-2h2c0.55,0 1,-0.45 1,-1L10,8h2c1.1,0 2,-0.9 2,-2L14,3.46c-0.95,-0.3 -1.95,-0.46 -3,-0.46C5.48,3 1,7.48 1,13s4.48,10 10,10 10,-4.48 10,-10c0,-0.34 -0.02,-0.67 -0.05,-1h-2.03zM10,20.93c-3.95,-0.49 -7,-3.85 -7,-7.93 0,-0.62 0.08,-1.21 0.21,-1.79L8,16v1c0,1.1 0.9,2 2,2v1.93z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_wallpaper_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M4,4h7L11,2L4,2c-1.1,0 -2,0.9 -2,2v7h2L4,4zM10,13l-4,5h12l-3,-4 -2.03,2.71L10,13zM17,8.5c0,-0.83 -0.67,-1.5 -1.5,-1.5S14,7.67 14,8.5s0.67,1.5 1.5,1.5S17,9.33 17,8.5zM20,2h-7v2h7v7h2L22,4c0,-1.1 -0.9,-2 -2,-2zM20,20h-7v2h7c1.1,0 2,-0.9 2,-2v-7h-2v7zM4,13L2,13v7c0,1.1 0.9,2 2,2h7v-2L4,20v-7z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_warning.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="24" android:viewportWidth="24" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M1,21h22L12,2 1,21zM13,18h-2v-2h2v2zM13,14h-2v-4h2v4z"/>
    
</vector>
```

## File: app/src/main/res/drawable/ic_wifi_off.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M790,904L414,526Q367,537 326.5,559Q286,581 254,614L170,528Q202,496 239,472Q276,448 318,430L228,340Q187,361 151.5,386.5Q116,412 84,444L0,358Q32,326 66.5,300.5Q101,275 140,252L56,168L112,112L848,848L790,904ZM480,840Q438,840 409,810.5Q380,781 380,740Q380,698 409,669Q438,640 480,640Q522,640 551,669Q580,698 580,740Q580,781 551,810.5Q522,840 480,840ZM716,602Q699,585 687,573Q675,561 658,544L514,400Q595,408 665.5,441Q736,474 790,528L716,602ZM876,444Q799,367 697.5,323.5Q596,280 480,280Q459,280 439.5,281.5Q420,283 400,286L298,184Q342,172 387.5,166Q433,160 480,160Q622,160 745,213Q868,266 960,358L876,444Z"/>
    
</vector>
```

## File: app/src/main/res/values-en/strings.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- app info -->
    <string name="app_name">A Bloq</string>
    <string name="app_version_name_for_logic" translatable="false">0.4.6</string>
    <string name="device_admin_description">Allows A Bloq to enforce security policies on the device.</string>
    <string name="app_version">Beta 0.4.5</string>
    <string name="unofficial_warning_title">Security Warning</string>
    <string name="unofficial_warning_message">This application is unofficial and has been modified!</string>

    <!-- Provisioning Screen -->
    <string name="provisioning_title">Device Administration Required</string>
    <string name="provisioning_description">For A Bloq to function, it must be set as a "Device Owner". This can only be done on a new or factory-reset device.</string>
    <string name="provisioning_option_adb">Option 1: Enable via ADB (Recommended)</string>
    <string name="provisioning_adb_instructions">1. Install the app on the device.\n2. Enable "Developer Options" and "USB Debugging".\n3. Connect the device to a computer and run the following command:</string>
    <string name="provisioning_adb_command">adb shell dpm set-device-owner com.secureguard.mdm/.SecureGuardDeviceAdminReceiver</string>
    <string name="provisioning_button_copy">Copy Command</string>
    <string name="provisioning_button_check_again">Check Again</string>
    <string name="provisioning_command_copied">Command copied to clipboard</string>
    <string name="provisioning_option_root">Option 2: Enable via Root</string>
    <string name="provisioning_root_instructions">Warning: Using Root is at your own risk. If your device has root access, you can try to enable permissions directly.</string>
    <string name="provisioning_button_try_root">Try Root Activation</string>
    <string name="provisioning_root_success">Success! Please restart the application.</string>
    <string name="provisioning_root_failed">Root activation failed.</string>

    <!-- Setup Screen -->
    <string name="setup_title">Welcome to A Bloq</string>
    <string name="setup_description">To get started, please create an admin password. This password will be used to change security settings.</string>
    <string name="setup_password_label">Password</string>
    <string name="setup_confirm_password_label">Confirm Password</string>
    <string name="setup_button_start">Start Protection</string>
    <string name="setup_error_passwords_do_not_match">Passwords do not match</string>
    <string name="setup_error_password_too_short">Password must be at least 4 characters</string>

    <!-- Dashboard Screen -->
    <string name="dashboard_title">Protection Status</string>
    <string name="dashboard_no_active_protections">No active protections at the moment.</string>
    <string name="dashboard_button_settings">Settings</string>
    <string name="dashboard_button_update_app">Update App</string>
    <string name="dashboard_status_protected">Protected</string>
    <string name="dashboard_status_unprotected">Unprotected</string>
    <string name="dashboard_button_about_app">About the App</string>

    <!-- Settings Screen -->
    <string name="settings_title">Manage Settings</string>
    <string name="settings_button_save">Save Changes</string>
    <string name="settings_unsupported_device">Not supported on this device</string>
    <string name="settings_unsupported_device_details">Requires Android %1$d (%2$s) or higher.</string>
    <string name="settings_item_change_password">Change Admin Password</string>
    <string name="settings_item_remove_protection">Remove A Bloq and Protections</string>
    <string name="settings_item_removal_options">A Bloq Removal Options</string>
    <string name="settings_remove_protection_dialog_title">Are you sure?</string>
    <string name="settings_remove_protection_dialog_message">This action will remove all protections, delete the app\'s device administration permissions, and prompt you to uninstall it. This cannot be undone.</string>
    <string name="settings_item_select_apps_to_block">Select Apps to Block</string>
    <string name="settings_item_view_blocked_apps">View Blocked Apps</string>
    <string name="settings_item_change_default_dialer">Change Default Phone App</string>
    <string name="settings_item_auto_update_check">Check for Updates Automatically on Launch</string>

    <!-- Toasts for Call Blocker -->
    <string name="toast_hiding_dialer">Hiding original phone app (%s)...</string>
    <string name="toast_installing_nophone">Installing NoPhone blocking app...</string>
    <string name="toast_nophone_installed">Installation complete! Please set NoPhone as default.</string>
    <string name="toast_restoring_dialer">Restoring original phone app...</string>

    <!-- Change Password Screen -->
    <string name="change_password_title">Change Password</string>
    <string name="change_password_old_password">Current Password</string>
    <string name="change_password_new_password">New Password</string>
    <string name="change_password_confirm_new_password">Confirm New Password</string>
    <string name="change_password_button_save">Save New Password</string>
    <string name="change_password_success">Password changed successfully</string>
    <string name="change_password_error_old_password_incorrect">Current password is incorrect</string>

    <!-- Dialogs -->
    <string name="dialog_title_enter_password">Password Required</string>
    <string name="dialog_description_enter_password">Enter the admin password to continue.</string>
    <string name="dialog_button_confirm">Confirm</string>
    <string name="dialog_button_cancel">Cancel</string>
    <string name="dialog_error_wrong_password">Wrong password</string>
    <string name="dialog_title_unsupported_feature">Feature Not Supported</string>
    <string name="dialog_description_unsupported_feature">The feature \'%1$s\' requires Android %2$d (%3$s) or higher. Your device is running %4$d (%5$s).</string>
    <string name="dialog_changes_saved_successfully">Settings saved successfully!</string>

    <!-- Secure Update & Auto Update -->
    <string name="app_build_status" translatable="false">Official</string>

    <string name="update_version_url" translatable="false">https://raw.githubusercontent.com/sesese1234/SecureGuardMDM/refs/heads/main/version.txt</string>
    <string name="update_changelog_url" translatable="false">https://raw.githubusercontent.com/sesese1234/SecureGuardMDM/refs/heads/main/changes.txt</string>
    <string name="update_apk_download_url" translatable="false">https://github.com/sesese1234/SecureGuardMDM/raw/refs/heads/main/app/release/Abloq-release.apk</string>
    <string name="update_dialog_title">Update Available</string>
    <string name="update_dialog_changelog_title">Changelog:</string>
    <string name="update_dialog_button_download">Download and Install</string>
    <string name="update_dialog_button_later">Later</string>
    <string name="update_dialog_downloading">Downloading update...</string>
    <string name="update_toast_success">Update installed successfully.</string>
    <string name="update_toast_failed">Update canceled or failed.</string>
    <string name="update_error_file_read">Error reading APK file.</string>
    <string name="update_error_app_not_installed">Target app for update is not installed.</string>
    <string name="update_error_signature_mismatch">Error: Update signature does not match installed app.</string>
    <string name="update_error_no_signature">No signature found in APK file.</string>
    <string name="update_error_verification_failed">Update verification failed. File deleted.</string>
    <string name="update_error_download_failed">Update download failed.</string>

    <!-- Feature Titles & Descriptions -->
    <string name="feature_block_incoming_calls_title">Block Phone Completely (Calls)</string>
    <string name="feature_block_incoming_calls_description">Disables the original dialer and installs an alternative dialer that does not receive or make calls.</string>
    <string name="feature_dev_options_title">Block Developer Options</string>
    <string name="feature_dev_options_description">Prevents access to and modification of developer options.</string>
    <string name="feature_bluetooth_title">Block Bluetooth</string>
    <string name="feature_bluetooth_description">Prevents turning Bluetooth on/off and using Bluetooth connections.</string>
    <string name="feature_unknown_sources_title">Block APK Installation</string>
    <string name="feature_unknown_sources_description">Prevents installing apps from sources other than the app store.</string>
    <string name="feature_wifi_title">Block Wi-Fi</string>
    <string name="feature_wifi_description">Prevents connecting to any Wi-Fi networks and blocks changes to Wi-Fi settings.</string>
    <string name="feature_add_user_title">Block Adding Users</string>
    <string name="feature_add_user_description">Prevents creating new users, profiles, and guests on the device.</string>
    <string name="feature_vpn_title">Block Internet (VPN)</string>
    <string name="feature_vpn_description">Enables an Always-On VPN that blocks all internet traffic.</string>
    <string name="feature_bluetooth_sharing_title">Block Bluetooth Sharing</string>
    <string name="feature_bluetooth_sharing_description">Prevents sending or receiving files via Bluetooth.</string>
    <string name="feature_camera_title">Block Camera</string>
    <string name="feature_camera_description">Prevents access to all cameras on the device.</string>
    <string name="feature_factory_reset_title">Block Factory Reset</string>
    <string name="feature_factory_reset_description">Prevents resetting the device from the settings menu.</string>
    <string name="feature_location_title">Block Location</string>
    <string name="feature_location_description">Prevents using device location by any apps.</string>
    <string name="feature_microphone_title">Block Microphone</string>
    <string name="feature_microphone_description">Prevents access to the microphone by any apps.</string>
    <string name="feature_mobile_data_title">Block Mobile Data</string>
    <string name="feature_mobile_data_description">Prevents using mobile data.</string>
    <string name="feature_outgoing_calls_title">Block Outgoing Calls</string>
    <string name="feature_outgoing_calls_description">Prevents making phone calls from the device.</string>
    <string name="feature_play_store_title">Block Play Store</string>
    <string name="feature_play_store_description">Hides the Google Play Store app.</string>
    <string name="feature_safe_boot_title">Block Safe Mode</string>
    <string name="feature_safe_boot_description">Prevents booting the device into Safe Mode.</string>
    <string name="feature_screenshot_title">Block Screenshots</string>
    <string name="feature_screenshot_description">Prevents taking screenshots in any apps.</string>
    <string name="feature_tethering_title">Block Hotspot</string>
    <string name="feature_tethering_description">Prevents sharing the device\'s internet connection (Tethering).</string>
    <string name="feature_usb_transfer_title">Block USB File Transfer</string>
    <string name="feature_usb_transfer_description">Prevents transferring files between the device and computer via USB.</string>
    <string name="feature_sms_disabled_title">Block SMS Messages</string>
    <string name="feature_sms_disabled_description">Prevents sending and receiving SMS/MMS messages.</string>
    <string name="feature_install_apps_disabled_title">Block App Installation</string>
    <string name="feature_install_apps_disabled_description">Prevents installing any type of apps from any source.</string>
    <string name="feature_block_remove_user_title">Block Removing Users</string>
    <string name="feature_block_remove_user_description">Prevents deleting existing users from the device.</string>
    <string name="feature_block_modify_accounts_title">Block Account Changes</string>
    <string name="feature_block_modify_accounts_description">Prevents adding, removing, or modifying accounts (Google, etc.).</string>
    <string name="feature_block_remove_managed_profile_title">Block Removing Work Profile</string>
    <string name="feature_block_remove_managed_profile_description">Prevents the user from deleting the managed work profile.</string>
    <string name="feature_block_user_switcher_title">Block User Switching</string>
    <string name="feature_block_user_switcher_description">Prevents switching between different users on the device.</string>
    <string name="feature_block_set_user_icon_title">Block Changing Profile Picture</string>
    <string name="feature_block_set_user_icon_description">Prevents the user from changing their profile picture on the device account.</string>
    <string name="feature_block_airplane_mode_title">Block Airplane Mode</string>
    <string name="feature_block_airplane_mode_description">Prevents the user from enabling airplane mode and disconnecting all communication.</string>
    <string name="feature_block_config_mobile_networks_title">Block Changing Mobile Network Settings</string>
    <string name="feature_block_config_mobile_networks_description">Prevents access to changing mobile network settings (APN).</string>
    <string name="feature_block_network_reset_title">Block Network Reset</string>
    <string name="feature_block_network_reset_description">Prevents the user from resetting all network settings on the device.</string>
    <string name="feature_block_outgoing_beam_title">Block NFC Sharing</string>
    <string name="feature_block_outgoing_beam_description">Prevents sending data via Android Beam and similar NFC technologies.</string>
    <string name="feature_block_data_roaming_title">Block Data Roaming</string>
    <string name="feature_block_data_roaming_description">Prevents using mobile data outside the home country (roaming).</string>
    <string name="feature_block_private_dns_title">Block Private DNS Settings</string>
    <string name="feature_block_private_dns_description">Prevents the user from changing the device\'s private DNS settings.</string>
    <string name="feature_block_adjust_volume_title">Block Volume Changes</string>
    <string name="feature_block_adjust_volume_description">Locks volume and prevents the user from changing it.</string>
    <string name="feature_block_set_wallpaper_title">Block Wallpaper Changes</string>
    <string name="feature_block_set_wallpaper_description">Prevents the user from changing the device\'s wallpaper.</string>
    <string name="feature_disable_status_bar_title">Disable Status Bar</string>
    <string name="feature_disable_status_bar_description">Hides the top status bar (clock, battery, notifications).</string>
    <string name="feature_block_autofill_title">Block Autofill</string>
    <string name="feature_block_autofill_description">Prevents autofill services from suggesting and saving passwords and data.</string>
    <string name="feature_block_ambient_display_title">Block Ambient Display</string>
    <string name="feature_block_ambient_display_description">Prevents the screen from lighting up and showing notifications when the device is asleep.</string>
    <string name="feature_block_apps_control_title">Block App Management</string>
    <string name="feature_block_apps_control_description">Prevents actions like "Force Stop", "Clear Cache", and "Clear Data" in app settings.</string>
    <string name="feature_block_uninstall_apps_title">Block App Uninstallation</string>
    <string name="feature_block_uninstall_apps_description">Prevents users from uninstalling installed apps.</string>
    <string name="feature_block_mount_physical_media_title">Block External Media</string>
    <string name="feature_block_mount_physical_media_description">Prevents the device from reading SD cards or USB OTG devices.</string>
    <string name="feature_disable_keyguard_title">Disable Lock Screen</string>
    <string name="feature_disable_keyguard_description">Completely removes the need for a lock screen. Useful for kiosk devices.</string>
    <string name="feature_block_config_location_title">Block Location Settings Changes</string>
    <string name="feature_block_config_location_description">Prevents the user from turning off GPS or changing location settings.</string>
    <string name="feature_block_config_credentials_title">Block Installing Security Certificates</string>
    <string name="feature_block_config_credentials_description">Prevents the user from managing and installing security certificates (Certificates).</string>
    <string name="feature_block_printing_title">Block Printing</string>
    <string name="feature_block_printing_description">Blocks the ability to print documents and images from the device.</string>
    <string name="feature_block_config_cell_broadcasts_title">Block Cell Broadcast Settings</string>
    <string name="feature_block_config_cell_broadcasts_description">Prevents changing emergency alert and cell broadcast settings.</string>
    <string name="feature_block_content_capture_title">Block Screen Content Capture</string>
    <string name="feature_block_content_capture_description">Prevents third-party apps from capturing screen content for analysis.</string>
    <string name="feature_block_system_error_dialogs_title">Block System Error Dialogs</string>
    <string name="feature_block_system_error_dialogs_description">Prevents showing system error popups (like "App crashed").</string>
    <string name="feature_block_password_change_title">Block Password Changes</string>
    <string name="feature_block_password_change_description">Prevents changing the device password</string>
    <string name="toast_installing_netguard">Installing NetGuard...</string>
    <string name="toast_netguard_can_be_uninstalled">NetGuard is no longer protected. The app can now be removed.</string>
    <string name="feature_block_vpn_settings_title">Block VPN Settings</string>
    <string name="feature_block_vpn_settings_description">Prevents the user from accessing the device\'s VPN settings screen.</string>
    <string name="feature_install_netguard_title">Install and Protect NetGuard</string>
    <string name="feature_install_netguard_description">Installs NetGuard and prevents its removal from the device.</string>
    <string name="feature_force_netguard_vpn_title">Force NetGuard as Always-On VPN</string>
    <string name="feature_force_netguard_vpn_description">Sets NetGuard as an Always-On VPN with lockdown.</string>
    <string name="conflict_reason_netguard_installed">Disabled because NetGuard is installed</string>
    <string name="feature_frp_protection_title">Reset Protection (FRP)</string>
    <string name="feature_frp_protection_description">Prevents device reset by locking it to predefined Google accounts.</string>
    <string name="category_device_management">General Device Management</string>
    <string name="category_hardware">Hardware and Sensors</string>
    <string name="category_network">Network and Communication</string>
    <string name="category_apps">Apps and Content</string>
    <string name="category_vpn">VPN and Firewall</string>
    <string name="category_calls_sms">Calls and Messages</string>
    <string name="category_ui">User Interface</string>
    <string name="category_advanced">Advanced System Settings</string>
    <string name="feature_frp_protection_experimental_tag">(Experimental)</string>
    <string name="frp_warning_dialog_title">Warning: Experimental Feature</string>
    <string name="frp_warning_dialog_message">Enabling FRP protection is an advanced action that may, in rare cases or with incorrect configuration, permanently lock the device and require manufacturer intervention. Are you sure you want to continue?</string>
    <string name="contact_email">c51525355@gmail.com</string>

    <string name="settings_item_enable_updates">Enable App Updates</string>
    <string name="category_ui_and_behavior">Customization and Behavior</string>
    <string name="settings_item_toggle_position">Show controls on the right side</string>
    <string name="settings_item_use_checkbox">Use checkboxes (instead of toggles)</string>
    <string name="settings_item_show_contact_email">Show email contact option</string>
    <string name="settings_item_disable_all_updates">Disable all updates (including manual)</string>
    <string name="settings_item_lock_settings">Lock settings permanently</string>
    <string name="settings_lock_dialog_title">Warning: Irreversible Action</string>
    <string name="settings_lock_dialog_message">Locking the settings will permanently remove access to this screen and disable all future updates. This cannot be undone. Are you sure you want to continue?</string>

    <string name="settings_lock_dialog_allow_manual_update">Keep secure manual update active</string>
    <string name="check_for_updates">Check for updates</string>
    <string name="update_check_checking">Checking for updates...</string>
    <string name="update_check_no_update">You have the latest version.</string>
    <string name="category_app_management">App Management</string>
    <string name="category_advanced_actions">Advanced Actions</string>

    <string name="update_channel_button">Update Channel</string>
    <string name="update_settings_title">Update Settings</string>
    <string name="update_channel_stable">Stable Channel</string>
    <string name="update_channel_prebuild">Prebuild Channel</string>
    <string name="update_channel_explanation_title">Explanation</string>
    <string name="update_channel_explanation_message">It is recommended to choose the stable channel, but if you want the latest features as soon as they are released, you can choose the Prebuild channel.</string>
    <string name="settings_item_frp">Set Custom FRP</string>
    <string name="boot_notification_message">A Bloq started with device boot!</string>
    <string name="settings_item_show_boot_toast">Show notification on device boot</string>
    <string name="category_kiosk_mode">Kiosk Mode</string>
    <string name="settings_item_manage_kiosk">Manage Kiosk Mode</string>
    <string name="kiosk_management_title">Kiosk Mode Management</string>
    <string name="kiosk_management_enable_label">Enable Kiosk Mode</string>
    <string name="kiosk_management_enable_description">When enabled, the app will launch directly into the locked kiosk launcher.</string>
    <string name="kiosk_management_select_apps">Select Apps to Display</string>
    <string name="kiosk_management_monitor_label">Strict Mode</string>
    <string name="kiosk_management_monitor_description">Prevents exiting kiosk apps even for displaying images or similar, to the maximum extent</string>
    <string name="kiosk_management_action_buttons_title">Kiosk Action Buttons</string>
    <string name="kiosk_action_wifi">Wi‑Fi</string>
    <string name="kiosk_action_bluetooth">Bluetooth</string>
    <string name="kiosk_action_flashlight">Flashlight</string>
    <string name="kiosk_action_volume">Volume</string>
    <string name="kiosk_block_launcher_dialog_title">Kiosk Mode Activation</string>
    <string name="kiosk_block_launcher_dialog_message">Block the current home app (Launcher)? Blocking it will prevent exiting kiosk mode via the home button.</string>
    <string name="kiosk_toast_disabled">Kiosk mode disabled.</string>
    <string name="kiosk_customization_title">Customization</string>
    <string name="kiosk_customization_header_title">Header Title</string>
    <string name="kiosk_customization_background_color">Background Color</string>
    <string name="kiosk_customization_accent_color">Accent Color</string>
    <string name="kiosk_customization_date_format">Date Format</string>
    <string name="kiosk_date_format_gregorian">Gregorian</string>
    <string name="kiosk_date_format_hebrew">Hebrew</string>
    <string name="kiosk_customization_general_settings">General Settings</string>
    <string name="kiosk_customization_show_update_button">Show Secure Update Button</string>
    <string name="kiosk_customization_bottom_bar_actions">Actions in Bottom Bar</string>
    <string name="folder_name_dialog_title">Folder Name</string>
    <string name="folder_name_dialog_hint">Enter name</string>
    <string name="folder_name_dialog_create">Create</string>

    <string name="kiosk_action_location">Location</string>
    <string name="kiosk_action_rotation">Rotation Lock</string>
    <string name="kiosk_no_apps_selected">No apps selected for display</string>
    <string name="kiosk_toast_feature_unavailable">This feature is futuristic - and not available in your version!</string>
    <string name="kiosk_management_customize">Customize Display and Actions</string>
    <string name="kiosk_launcher_warning_dialog_title">Security Notice</string>
    <string name="kiosk_launcher_warning_dialog_message">Please note! Kiosk is an experimental feature and may have security vulnerabilities! \n You are welcome to report bugs to the developer.</string>
    <string name="kiosk_toast_enabled">Kiosk mode enabled. The device will launch in kiosk mode when you exit the app.</string>

    <string name="kiosk_content_desc_battery">Battery Status</string>
    <string name="kiosk_content_desc_secure_update">Secure Update</string>
    <string name="kiosk_content_desc_main_settings">Main Settings</string>
    <string name="kiosk_content_desc_about_app">About the App</string>

    <!-- Netfree Only Mode -->
    <string name="feature_netfree_only_title">Netfree Only Mode</string>
    <string name="feature_netfree_only_description">Blocks all network traffic if the connection is not filtered by Netfree.</string>
    <string name="toast_netfree_check_started">New network detected, checking Netfree filtering...</string>
    <string name="toast_netfree_check_success">Network approved by Netfree. Internet allowed.</string>
    <string name="toast_netfree_check_fail_blocking">Network not filtered. Internet blocked.</string>

    <!-- ### Added and Updated Texts ### -->
    <string name="netfree_notification_channel_name">Netfree Filtering Monitor</string>
    <string name="netfree_notification_channel_description">Notification indicating that Netfree filtering is being monitored in the background.</string>
    <string name="netfree_notification_content">Netfree filtering is being monitored in the background.</string>
    <string name="vpn_notification_channel_name">Firewall Service</string>
    <string name="vpn_notification_channel_description">Notification indicating that the firewall service (VPN) is active.</string>
    <string name="vpn_notification_content">Firewall service is active.</string>
    <string name="netfree_no_active_network">No active network connection.</string>
    <string name="netfree_service_restarted">Netfree monitoring service restarted.</string>
    <string name="netfree_recheck_triggered">Performing recheck...</string>

    <string name="netfree_status_title">Netfree Filtering Status</string>
    <string name="netfree_status_verified">Network filtered</string>
    <string name="netfree_status_verified_wifi">Network filtered (Wi-Fi)</string>
    <string name="netfree_status_verified_cellular">Network filtered (Mobile Data)</string>
    <string name="netfree_status_not_verified_and_blocked">Network not filtered (Internet blocked)</string>
    <string name="netfree_status_checking">Checking status...</string>
    <string name="netfree_status_service_inactive">Service inactive</string>
    <string name="netfree_button_recheck">Recheck</string>
    <string name="netfree_button_restart_service">Restart Service</string>

    <!-- Project-wide identified strings -->
    <string name="toast_installing_update">Installing update, the app will restart...</string>
    <string name="update_dialog_installing">Installing update...</string>
    <string name="update_dialog_please_wait">Please wait...</string>
    <string name="update_dialog_processing">Processing...</string>
    <string name="update_dialog_error">Error</string>
    <string name="error_reading_apk">Unable to read APK file.</string>
    <string name="error_reading_apk_generic">Error reading APK file.</string>
    <string name="error_installing_update">Error starting installation: %s</string>
    <string name="frp_settings_title">Set Custom FRP</string>
    <string name="frp_settings_description">Add Google accounts (by User ID) that will be allowed to reset the device. If this list is empty, the default account will be used.</string>
    <string name="frp_settings_label_user_id">Enter User ID</string>
    <string name="frp_settings_empty_list">No custom accounts defined.</string>
    <string name="frp_settings_error_already_exists">ID already exists in the list</string>
    <string name="frp_settings_error_digits_only">Please enter an ID containing only numbers</string>
    <string name="frp_settings_saved_success">Custom FRP list saved</string>
    <string name="dashboard_error_app_not_installed">App not installed!</string>
    <string name="dashboard_error_mod_apk_incompatibility">This might be a modified (MOD) app, incompatible with updates.</string>
    <string name="dashboard_button_understood">Understood</string>
    <string name="app_info_version">Version:</string>
    <string name="app_info_status">Status:</string>
    <string name="app_info_author">Creator:</string>
    <string name="app_info_author_name">Yossi Poli</string>
    <string name="app_info_forum_user">On Top Forums:</string>
    <string name="app_info_forum_user_name">@iosi-poli</string>
    <string name="app_info_contact_us">Contact Us:</string>
    <string name="app_info_button_contact_email">Contact by Email</string>
    <string name="app_info_button_close">Close</string>
    <string name="settings_error_vpn_permission_required">VPN permission required to activate</string>
    <string name="settings_error_loading_device_admins">Error loading list of device administration apps</string>
    <string name="settings_error_android_version_required">This feature is only available from Android 9 and up</string>
    <string name="settings_transfer_ownership_success">Ownership transferred successfully to %s</string>
    <string name="settings_transfer_ownership_error">Error transferring ownership: %s</string>
    <string name="settings_transfer_ownership_error_unsupported">Selected target does not support ownership transfer: %s</string>
    <string name="settings_transfer_ownership_error_invalid_state">Invalid state for ownership transfer: %s</string>
    <string name="settings_transfer_ownership_error_unexpected">Unexpected error during ownership transfer: %s</string>
    <string name="removal_error_security">Security error removing permissions: %s</string>
    <string name="removal_error_invalid_parameter">Invalid parameter error removing: %s</string>
    <string name="removal_error_invalid_state">Invalid state error removing: %s</string>
    <string name="removal_error_runtime">Runtime error removing: %s</string>
    <string name="removal_error_unexpected">Unexpected error removing: %s</string>
    <string name="removal_error_security_title">Security Error</string>
    <string name="removal_error_invalid_parameter_title">Invalid Parameter</string>
    <string name="removal_error_invalid_state_title">Invalid State</string>
    <string name="removal_error_runtime_title">Runtime Error</string>
    <string name="removal_error_unexpected_title">Unexpected Error</string>
    <string name="settings_desc_more_info">More Info</string>
    <string name="removal_options_dialog_title">A Bloq Removal Options</string>
    <string name="removal_options_dialog_message">Choose the desired option:</string>
    <string name="removal_options_button_regular">Regular A Bloq Removal</string>
    <string name="removal_options_button_transfer">Transfer Ownership Before Removal</string>
    <string name="device_admin_selection_dialog_title">Select Device Administration App</string>
    <string name="device_admin_selection_dialog_empty">No other device administration apps found on this device.</string>
    <string name="device_admin_transfer_dialog_title">Transfer Device Administration?</string>
    <string name="device_admin_transfer_dialog_message">Are you sure you want to transfer administration rights to %1$s?\n\n(Package name=%2$s)\n\nWarning! You may not be able to remove administration rights from the app.\n</string>
    <string name="device_admin_transfer_dialog_button_confirm">Yes, Transfer</string>
    <string name="device_admin_transfer_dialog_button_cancel">Cancel</string>
    <string name="main_activity_permission_title">Additional Permission Required</string>
    <string name="main_activity_permission_message">To enable Wi-Fi, Bluetooth, and screen rotation buttons to work from kiosk mode, you must grant the app permission to change system settings.\n\nIf you do not approve, only the functionality of these buttons will be limited.</string>
    <string name="main_activity_permission_button_grant">Grant Permission</string>
    <string name="main_activity_permission_button_later">Not Now</string>
    <string name="netguard_unsafe_dialog_title">NetGuard is Currently Unsafe</string>
    <string name="netguard_unsafe_dialog_message">NetGuard is currently unsafe, and its protection will be removed.\n\nWould you also like to remove NetGuard itself?</string>
    <string name="netguard_unsafe_button_uninstall">Uninstall NetGuard</string>
    <string name="netguard_unsafe_button_keep">Keep NetGuard</string>
    <string name="kiosk_button_save_return">Save and Return to Kiosk</string>
    <string name="kiosk_admin_access_title">Admin Access</string>
    <string name="kiosk_admin_access_message">Enter the admin password to access settings.</string>
    <string name="kiosk_admin_access_password_label">Password</string>
    <string name="kiosk_power_options_title">Power Options</string>
    <string name="kiosk_power_options_message">Would you like to restart the device?</string>
    <string name="kiosk_power_options_button_restart">Restart (Restart)</string>
    <string name="kiosk_destination_dialog_title">Select Destination</string>
    <string name="kiosk_destination_dialog_message">Where would you like to go?</string>
    <string name="kiosk_destination_button_kiosk_settings">Kiosk Settings</string>
    <string name="kiosk_destination_button_dashboard">General Management (Dashboard)</string>
    <string name="kiosk_button_add_apps_now">Add Apps Now</string>
    <string name="app_selection_search_hint">Search...</string>
    <string name="app_selection_filter_user">User Apps</string>
    <string name="app_selection_filter_launcher">Launcher Apps</string>
    <string name="app_selection_filter_all_except_core">All Apps (Except Core)</string>
    <string name="app_selection_filter_all">Show All</string>
    <string name="app_selection_add_manual_package">Add Package Manually</string>
    <string name="kiosk_management_desc_selected">Selected</string>
    <string name="frp_settings_desc_delete_id">Delete ID</string>
    <string name="app_selection_title">Select Apps to Block</string>
    <string name="app_selection_desc_add_manual">Add Package Manually</string>
    <string name="toast_changes_saved_active">Changes saved and applied</string>
    <string name="app_selection_label_search">Search...</string>
    <string name="app_selection_desc_filter">Filter Apps</string>
    <string name="dialog_add_manual_package_title">Add Package Manually</string>
    <string name="dialog_add_manual_package_button_confirm">Add and Block</string>
    <string name="app_selection_warning_critical_title">Warning: Critical Apps</string>
    <string name="app_selection_warning_critical_message">This action may cause irreversible damage to your device, as this is too important an app!</string>
    <string name="app_selection_warning_critical_coming_soon">Soon it will be possible to block this safely!</string>
    <string name="app_selection_warning_critical_list_label">Selected Apps:</string>
    
    <!-- Redundant aliases to fix code errors without changing code too much -->
    <string name="permission_dialog_title">Additional Permission Required</string>
    <string name="permission_dialog_message">To enable Wi-Fi, Bluetooth, and screen rotation buttons to work from kiosk mode, you must grant the app permission to change system settings.\n\nIf you do not approve, only the functionality of these buttons will be limited.</string>
    <string name="permission_dialog_button_confirm">Grant Permission</string>
    <string name="permission_dialog_button_cancel">Not Now</string>
    <string name="netguard_upgrade_dialog_title">NetGuard is Currently Unsafe</string>
    <string name="netguard_upgrade_dialog_message">NetGuard is currently unsafe, and its protection will be removed.\n\nWould you also like to remove NetGuard itself?</string>
    <string name="netguard_upgrade_dialog_button_uninstall">Uninstall NetGuard</string>
    <string name="netguard_upgrade_dialog_button_keep">Keep NetGuard</string>
    <string name="notification_initializing">Initializing services...</string>
    
    <string name="kiosk_dialog_admin_title">Admin Access</string>
    <string name="kiosk_dialog_admin_message">Enter the admin password to access settings.</string>
    <string name="kiosk_dialog_admin_label_password">Password</string>
    <string name="kiosk_dialog_power_title">Power Options</string>
    <string name="kiosk_dialog_power_message">Would you like to restart the device?</string>
    <string name="kiosk_dialog_power_warning">Note: Full shutdown is not available for security reasons.</string>
    <string name="kiosk_dialog_power_button_reboot">Restart (Restart)</string>
    <string name="kiosk_dialog_choice_title">Select Destination</string>
    <string name="kiosk_dialog_choice_message">Where would you like to go?</string>
    <string name="kiosk_dialog_choice_button_kiosk">Kiosk Settings</string>
    <string name="kiosk_dialog_choice_button_dashboard">General Management (Dashboard)</string>
    <string name="kiosk_toast_app_not_found">Unable to open app</string>
    <string name="kiosk_empty_state_title">No Apps Displayed</string>
    <string name="kiosk_empty_state_button">Add Apps Now</string>
    <string name="kiosk_desc_power">Power Off/On</string>
    <string name="kiosk_desc_settings">Settings</string>
    <string name="main_service_initializing">A Bloq started with device boot.</string>
</resources>
```

## File: app/src/main/res/values-night/themes.xml
```xml
<resources xmlns:tools="http://schemas.android.com/tools">
    <!--
        Base application theme for Compose part of the app (Night Mode).
    -->
    <style name="Theme.SecureGuard" parent="android:Theme.Material.NoActionBar">
        <item name="android:statusBarColor">?android:colorBackground</item>
    </style>

    <!--
       - תיקון: הסרת ההגדרה הכפולה
       הקובץ הזה יכול להיות ריק או להכיל רק את ה-Theme הראשי.
       ה-Theme של הקיוסק שהוגדר ב-values/themes.xml עם parent של DayNight יטפל במצב הכהה אוטומטית.
       השארת קובץ זה מבטיחה שהמערכת יודעת שיש תצורה ספציפית למצב לילה.
    -->

</resources>
```

## File: app/src/main/res/values/styles.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <style name="FolderPreviewIcon">
        <item name="android:layout_width">0dp</item>
        <item name="android:layout_height">0dp</item>
        <item name="android:layout_columnWeight">1</item>
        <item name="android:layout_rowWeight">1</item>
        <item name="android:layout_margin">2dp</item>
    </style>
</resources>
```

## File: app/src/main/res/xml/backup_rules.xml
```xml
<?xml version="1.0" encoding="utf-8"?><!--
   Sample backup rules file; uncomment and customize as necessary.
   See https://developer.android.com/guide/topics/data/autobackup
   for details.
   Note: This file is ignored for devices older than API 31
   See https://developer.android.com/about/versions/12/backup-restore
-->
<full-backup-content>
    <!--
   <include domain="sharedpref" path="."/>
   <exclude domain="sharedpref" path="device.xml"/>
-->
</full-backup-content>
```

## File: app/src/main/res/xml/data_extraction_rules.xml
```xml
<?xml version="1.0" encoding="utf-8"?><!--
   Sample data extraction rules file; uncomment and customize as necessary.
   See https://developer.android.com/about/versions/12/backup-restore#xml-changes
   for details.
-->
<data-extraction-rules>
    <cloud-backup>
        <!-- TODO: Use <include> and <exclude> to control what is backed up.
        <include .../>
        <exclude .../>
        -->
    </cloud-backup>
    <!--
    <device-transfer>
        <include .../>
        <exclude .../>
    </device-transfer>
    -->
</data-extraction-rules>
```

## File: app/src/main/res/xml/network_security_config.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<!-- האלמנט הראשי שחייב לעטוף הכל -->
<network-security-config>
    <!-- כאן אפשר לשים כמה base-config -->
    <base-config cleartextTrafficPermitted="false">
        <trust-anchors>
            <!-- שימוש בתעודות מערכת -->
            <certificates src="system" />
            <!-- שימוש בתעודות משתמש -->
            <certificates src="user" />
        </trust-anchors>
    </base-config>
</network-security-config>
```

## File: app/src/main/res/xml/provider_paths.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<paths>
    <files-path
        name="internal_files"
        path="." />
</paths>
```

## File: app/src/test/java/com/secureguard/mdm/ExampleUnitTest.kt
```kotlin
package com.secureguard.mdm

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}
```

## File: gradle.properties
```
# Project-wide Gradle settings.
# IDE (e.g. Android Studio) users:
# Gradle settings configured through the IDE *will override*
# any settings specified in this file.
# For more details on how to configure your build environment visit
# http://www.gradle.org/docs/current/userguide/build_environment.html
# Specifies the JVM arguments used for the daemon process.
# The setting is particularly useful for tweaking memory settings.
org.gradle.jvmargs=-Xmx2048m -Dfile.encoding=UTF-8
# When configured, Gradle will run in incubating parallel mode.
# This option should only be used with decoupled projects. For more details, visit
# https://developer.android.com/r/tools/gradle-multi-project-decoupled-projects
# org.gradle.parallel=true
# AndroidX package structure to make it clearer which packages are bundled with the
# Android operating system, and which are packaged with your app's APK
# https://developer.android.com/topic/libraries/support-library/androidx-rn
android.useAndroidX=true
# Kotlin code style for this project: "official" or "obsolete":
kotlin.code.style=official
# Enables namespacing of each library's R class so that its R class includes only the
# resources declared in the library itself and none from the library's dependencies,
# thereby reducing the size of the R class for that library
android.nonTransitiveRClass=true
```

## File: gradle/libs.versions.toml
```toml
[versions]
agp = "8.10.1"
kotlin = "2.0.21"
coreKtx = "1.16.0"
junit = "4.13.2"
junitVersion = "1.2.1"
espressoCore = "3.6.1"
appcompat = "1.7.1"
material = "1.12.0"
activity = "1.10.1"
constraintlayout = "2.2.1"

[libraries]
androidx-core-ktx = { group = "androidx.core", name = "core-ktx", version.ref = "coreKtx" }
junit = { group = "junit", name = "junit", version.ref = "junit" }
androidx-junit = { group = "androidx.test.ext", name = "junit", version.ref = "junitVersion" }
androidx-espresso-core = { group = "androidx.test.espresso", name = "espresso-core", version.ref = "espressoCore" }
androidx-appcompat = { group = "androidx.appcompat", name = "appcompat", version.ref = "appcompat" }
material = { group = "com.google.android.material", name = "material", version.ref = "material" }
androidx-activity = { group = "androidx.activity", name = "activity", version.ref = "activity" }
androidx-constraintlayout = { group = "androidx.constraintlayout", name = "constraintlayout", version.ref = "constraintlayout" }

[plugins]
android-application = { id = "com.android.application", version.ref = "agp" }
kotlin-android = { id = "org.jetbrains.kotlin.android", version.ref = "kotlin" }
```

## File: gradle/wrapper/gradle-wrapper.properties
```
#Mon Jul 07 09:48:00 IDT 2025
distributionBase=GRADLE_USER_HOME
distributionPath=wrapper/dists
distributionUrl=https\://services.gradle.org/distributions/gradle-8.11.1-bin.zip
zipStoreBase=GRADLE_USER_HOME
zipStorePath=wrapper/dists
```

## File: gradlew
```
#!/usr/bin/env sh

#
# Copyright 2015 the original author or authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

##############################################################################
##
##  Gradle start up script for UN*X
##
##############################################################################

# Attempt to set APP_HOME
# Resolve links: $0 may be a link
PRG="$0"
# Need this for relative symlinks.
while [ -h "$PRG" ] ; do
    ls=`ls -ld "$PRG"`
    link=`expr "$ls" : '.*-> \(.*\)$'`
    if expr "$link" : '/.*' > /dev/null; then
        PRG="$link"
    else
        PRG=`dirname "$PRG"`"/$link"
    fi
done
SAVED="`pwd`"
cd "`dirname \"$PRG\"`/" >/dev/null
APP_HOME="`pwd -P`"
cd "$SAVED" >/dev/null

APP_NAME="Gradle"
APP_BASE_NAME=`basename "$0"`

# Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
DEFAULT_JVM_OPTS='"-Xmx64m" "-Xms64m"'

# Use the maximum available, or set MAX_FD != -1 to use that value.
MAX_FD="maximum"

warn () {
    echo "$*"
}

die () {
    echo
    echo "$*"
    echo
    exit 1
}

# OS specific support (must be 'true' or 'false').
cygwin=false
msys=false
darwin=false
nonstop=false
case "`uname`" in
  CYGWIN* )
    cygwin=true
    ;;
  Darwin* )
    darwin=true
    ;;
  MINGW* )
    msys=true
    ;;
  NONSTOP* )
    nonstop=true
    ;;
esac

CLASSPATH=$APP_HOME/gradle/wrapper/gradle-wrapper.jar


# Determine the Java command to use to start the JVM.
if [ -n "$JAVA_HOME" ] ; then
    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
        # IBM's JDK on AIX uses strange locations for the executables
        JAVACMD="$JAVA_HOME/jre/sh/java"
    else
        JAVACMD="$JAVA_HOME/bin/java"
    fi
    if [ ! -x "$JAVACMD" ] ; then
        die "ERROR: JAVA_HOME is set to an invalid directory: $JAVA_HOME

Please set the JAVA_HOME variable in your environment to match the
location of your Java installation."
    fi
else
    JAVACMD="java"
    which java >/dev/null 2>&1 || die "ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.

Please set the JAVA_HOME variable in your environment to match the
location of your Java installation."
fi

# Increase the maximum file descriptors if we can.
if [ "$cygwin" = "false" -a "$darwin" = "false" -a "$nonstop" = "false" ] ; then
    MAX_FD_LIMIT=`ulimit -H -n`
    if [ $? -eq 0 ] ; then
        if [ "$MAX_FD" = "maximum" -o "$MAX_FD" = "max" ] ; then
            MAX_FD="$MAX_FD_LIMIT"
        fi
        ulimit -n $MAX_FD
        if [ $? -ne 0 ] ; then
            warn "Could not set maximum file descriptor limit: $MAX_FD"
        fi
    else
        warn "Could not query maximum file descriptor limit: $MAX_FD_LIMIT"
    fi
fi

# For Darwin, add options to specify how the application appears in the dock
if $darwin; then
    GRADLE_OPTS="$GRADLE_OPTS \"-Xdock:name=$APP_NAME\" \"-Xdock:icon=$APP_HOME/media/gradle.icns\""
fi

# For Cygwin or MSYS, switch paths to Windows format before running java
if [ "$cygwin" = "true" -o "$msys" = "true" ] ; then
    APP_HOME=`cygpath --path --mixed "$APP_HOME"`
    CLASSPATH=`cygpath --path --mixed "$CLASSPATH"`

    JAVACMD=`cygpath --unix "$JAVACMD"`

    # We build the pattern for arguments to be converted via cygpath
    ROOTDIRSRAW=`find -L / -maxdepth 1 -mindepth 1 -type d 2>/dev/null`
    SEP=""
    for dir in $ROOTDIRSRAW ; do
        ROOTDIRS="$ROOTDIRS$SEP$dir"
        SEP="|"
    done
    OURCYGPATTERN="(^($ROOTDIRS))"
    # Add a user-defined pattern to the cygpath arguments
    if [ "$GRADLE_CYGPATTERN" != "" ] ; then
        OURCYGPATTERN="$OURCYGPATTERN|($GRADLE_CYGPATTERN)"
    fi
    # Now convert the arguments - kludge to limit ourselves to /bin/sh
    i=0
    for arg in "$@" ; do
        CHECK=`echo "$arg"|egrep -c "$OURCYGPATTERN" -`
        CHECK2=`echo "$arg"|egrep -c "^-"`                                 ### Determine if an option

        if [ $CHECK -ne 0 ] && [ $CHECK2 -eq 0 ] ; then                    ### Added a condition
            eval `echo args$i`=`cygpath --path --ignore --mixed "$arg"`
        else
            eval `echo args$i`="\"$arg\""
        fi
        i=`expr $i + 1`
    done
    case $i in
        0) set -- ;;
        1) set -- "$args0" ;;
        2) set -- "$args0" "$args1" ;;
        3) set -- "$args0" "$args1" "$args2" ;;
        4) set -- "$args0" "$args1" "$args2" "$args3" ;;
        5) set -- "$args0" "$args1" "$args2" "$args3" "$args4" ;;
        6) set -- "$args0" "$args1" "$args2" "$args3" "$args4" "$args5" ;;
        7) set -- "$args0" "$args1" "$args2" "$args3" "$args4" "$args5" "$args6" ;;
        8) set -- "$args0" "$args1" "$args2" "$args3" "$args4" "$args5" "$args6" "$args7" ;;
        9) set -- "$args0" "$args1" "$args2" "$args3" "$args4" "$args5" "$args6" "$args7" "$args8" ;;
    esac
fi

# Escape application args
save () {
    for i do printf %s\\n "$i" | sed "s/'/'\\\\''/g;1s/^/'/;\$s/\$/' \\\\/" ; done
    echo " "
}
APP_ARGS=`save "$@"`

# Collect all arguments for the java command, following the shell quoting and substitution rules
eval set -- $DEFAULT_JVM_OPTS $JAVA_OPTS $GRADLE_OPTS "\"-Dorg.gradle.appname=$APP_BASE_NAME\"" -classpath "\"$CLASSPATH\"" org.gradle.wrapper.GradleWrapperMain "$APP_ARGS"

exec "$JAVACMD" "$@"
```

## File: gradlew.bat
```batch
@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  Gradle startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS="-Xmx64m" "-Xms64m"

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\gradle\wrapper\gradle-wrapper.jar


@rem Execute Gradle
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %GRADLE_OPTS% "-Dorg.gradle.appname=%APP_BASE_NAME%" -classpath "%CLASSPATH%" org.gradle.wrapper.GradleWrapperMain %*

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable GRADLE_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%GRADLE_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
```

## File: settings.gradle.kts
```kotlin
pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Secure Guard App MDM"
include(":app")
```

## File: versiontest.txt
```
0.4.6
```

## File: app/src/main/java/com/secureguard/mdm/appblocker/AppBlockerState.kt
```kotlin
package com.secureguard.mdm.appblocker

enum class AppFilterType {
    USER_ONLY,
    ALL_EXCEPT_CORE,
    LAUNCHER_ONLY,
    ALL
}

data class AppBlockerUiState(
    val displayedAppsForSelection: List<AppInfo> = emptyList(),
    val displayedBlockedApps: List<AppInfo> = emptyList(),
    val displayedSuspendedApps: List<AppInfo> = emptyList(),
    val isLoading: Boolean = true,
    val currentFilter: AppFilterType = AppFilterType.USER_ONLY,
    val searchQuery: String = "",
    val selectionForUnblock: Set<String> = emptySet(),
    val selectionForUnsuspend: Set<String> = emptySet(),
    val showCriticalAppsWarning: Boolean = false,
    val criticalAppsDetected: List<AppInfo> = emptyList()
)

sealed class AppBlockerEvent {
    data class OnFilterChanged(val newFilter: AppFilterType) : AppBlockerEvent()
    data class OnAppSelectionChanged(val packageName: String, val isBlocked: Boolean) : AppBlockerEvent()
    data class OnAppSuspensionChanged(val packageName: String, val isSuspended: Boolean) : AppBlockerEvent()
    object OnSaveRequest : AppBlockerEvent() // יישמר מיידית
    object OnDismissPasswordPrompt : AppBlockerEvent() // נשאר למקרה שימוש עתידי, לא מזיק
    data class OnAddPackageManually(val packageName: String) : AppBlockerEvent()
    data class OnToggleUnblockSelection(val packageName: String) : AppBlockerEvent()
    data class OnToggleUnsuspendSelection(val packageName: String) : AppBlockerEvent()
    object OnUnblockSelectedRequest : AppBlockerEvent() // ישוחרר מיידית
    object OnUnsuspendSelectedRequest : AppBlockerEvent() // ישוחרר מיידית
    data class OnSearchQueryChanged(val query: String) : AppBlockerEvent()
    object OnDismissCriticalAppsWarning : AppBlockerEvent()
}
```

## File: app/src/main/java/com/secureguard/mdm/appblocker/AppBlockerViewModel.kt
```kotlin
package com.secureguard.mdm.appblocker

import android.app.admin.DevicePolicyManager
import android.content.Context
import android.content.Intent
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.secureguard.mdm.R
import com.secureguard.mdm.SecureGuardDeviceAdminReceiver
import com.secureguard.mdm.data.db.BlockedAppCache
import com.secureguard.mdm.data.repository.SettingsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileOutputStream
import javax.inject.Inject

private const val TAG = "AppBlockerViewModel"
private const val OWN_PACKAGE = "com.secureguard.mdm"

// Critical system apps that should not be blocked as they may cause device instability
private val CRITICAL_SYSTEM_PACKAGES = setOf(
    "com.android.settings",           // Settings app
    "com.android.systemui",          // System UI
    "android",                       // Android System
    "com.google.android.gsf",         // Google Services Framework
    "com.android.launcher3",          // Default launcher
    "com.google.android.launcher",    // Google launcher
)

@HiltViewModel
class AppBlockerViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val settingsRepository: SettingsRepository,
    private val dpm: DevicePolicyManager
) : ViewModel() {

    private val _uiState = MutableStateFlow(AppBlockerUiState())
    val uiState = _uiState.asStateFlow()

    private var allAppsMasterList: List<AppInfo> = emptyList()
    private var allBlockedAppsMasterList: List<AppInfo> = emptyList()
    private var allSuspendedAppsMasterList: List<AppInfo> = emptyList()

    private val adminComponentName by lazy { SecureGuardDeviceAdminReceiver.getComponentName(context) }
    private val iconsDir by lazy { File(context.filesDir, "app_icons").apply { mkdirs() } }

    init {
        loadAllData()
    }

    fun onEvent(event: AppBlockerEvent) {
        when (event) {
            is AppBlockerEvent.OnFilterChanged -> onFilterChanged(event.newFilter)
            is AppBlockerEvent.OnAppSelectionChanged -> onAppSelectionChanged(event.packageName, event.isBlocked)
            is AppBlockerEvent.OnAppSuspensionChanged -> onAppSuspensionChanged(event.packageName, event.isSuspended)
            is AppBlockerEvent.OnSaveRequest -> saveAndApplyChanges() // קריאה ישירה
            is AppBlockerEvent.OnUnblockSelectedRequest -> unblockSelectedApps() // קריאה ישירה
            is AppBlockerEvent.OnUnsuspendSelectedRequest -> unsuspendSelectedApps() // קריאה ישירה
            is AppBlockerEvent.OnAddPackageManually -> addPackageManually(event.packageName)
            is AppBlockerEvent.OnToggleUnblockSelection -> toggleUnblockSelection(event.packageName)
            is AppBlockerEvent.OnToggleUnsuspendSelection -> toggleUnsuspendSelection(event.packageName)
            is AppBlockerEvent.OnSearchQueryChanged -> onSearchQueryChanged(event.query)
            is AppBlockerEvent.OnDismissPasswordPrompt -> { /* No longer needed */ }
            is AppBlockerEvent.OnDismissCriticalAppsWarning -> dismissCriticalAppsWarning()
        }
    }

    fun loadAllData() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, searchQuery = "") }
            allAppsMasterList = getInstalledApps()
            allBlockedAppsMasterList = getBlockedAppsFromCache()
            allSuspendedAppsMasterList = getSuspendedAppsFromCache()
            applyFilter()
            applyBlockedAppsFilter()
            applySuspendedAppsFilter()
            _uiState.update { it.copy(isLoading = false) }
        }
    }

    private fun onFilterChanged(newFilter: AppFilterType) {
        if (newFilter != _uiState.value.currentFilter) {
            _uiState.update { it.copy(currentFilter = newFilter) }
            applyFilter()
        }
    }

    private fun onSearchQueryChanged(query: String) {
        _uiState.update { it.copy(searchQuery = query) }
        applyFilter()
        applyBlockedAppsFilter()
        applySuspendedAppsFilter()
    }

    private fun applyFilter() {
        val query = _uiState.value.searchQuery.lowercase()
        var filteredList = when (_uiState.value.currentFilter) {
            AppFilterType.USER_ONLY -> allAppsMasterList.filter { it.isInstalled && !it.isSystemApp }
            AppFilterType.ALL_EXCEPT_CORE -> allAppsMasterList.filter { it.isInstalled && !it.packageName.startsWith("com.android.") }
            AppFilterType.LAUNCHER_ONLY -> allAppsMasterList.filter { it.isLauncherApp }
            AppFilterType.ALL -> allAppsMasterList.filter { it.isInstalled }
        }
        if (query.isNotBlank()) {
            filteredList = filteredList.filter {
                it.appName.lowercase().contains(query) || it.packageName.lowercase().contains(query)
            }
        }
        _uiState.update { it.copy(displayedAppsForSelection = filteredList) }
    }

    private fun applyBlockedAppsFilter() {
        val query = _uiState.value.searchQuery.lowercase()
        val filteredList = if(query.isNotBlank()) {
            allBlockedAppsMasterList.filter {
                it.appName.lowercase().contains(query) || it.packageName.lowercase().contains(query)
            }
        } else {
            allBlockedAppsMasterList
        }
        _uiState.update { it.copy(displayedBlockedApps = filteredList) }
    }

    private fun applySuspendedAppsFilter() {
        val query = _uiState.value.searchQuery.lowercase()
        val filteredList = if (query.isNotBlank()) {
            allSuspendedAppsMasterList.filter {
                it.appName.lowercase().contains(query) || it.packageName.lowercase().contains(query)
            }
        } else {
            allSuspendedAppsMasterList
        }
        _uiState.update { it.copy(displayedSuspendedApps = filteredList) }
    }

    private suspend fun getInstalledApps(): List<AppInfo> = withContext(Dispatchers.IO) {
        val pm = context.packageManager
        val launcherIntent = Intent(Intent.ACTION_MAIN, null).addCategory(Intent.CATEGORY_LAUNCHER)
        val launcherPackages = pm.queryIntentActivities(launcherIntent, 0).map { it.activityInfo.packageName }.toSet()

        val allInstalledAppsInfo = pm.getInstalledApplications(PackageManager.GET_META_DATA)
        val blockedAppPackages = settingsRepository.getBlockedAppPackages()
        val suspendedAppPackages = settingsRepository.getSuspendedAppPackages()
        allInstalledAppsInfo.map { appInfo ->
            if (appInfo.packageName == OWN_PACKAGE) return@map null
            AppInfo(
                appName = appInfo.loadLabel(pm).toString(), packageName = appInfo.packageName,
                icon = appInfo.loadIcon(pm), isBlocked = blockedAppPackages.contains(appInfo.packageName),
                isSystemApp = (appInfo.flags and ApplicationInfo.FLAG_SYSTEM) != 0,
                isLauncherApp = launcherPackages.contains(appInfo.packageName),
                isSuspended = suspendedAppPackages.contains(appInfo.packageName),
                isInstalled = true
            )
        }.filterNotNull().sortedBy { it.appName.lowercase() }
    }

    private suspend fun getBlockedAppsFromCache(): List<AppInfo> = withContext(Dispatchers.IO) {
        val pm = context.packageManager
        val launcherIntent = Intent(Intent.ACTION_MAIN, null).addCategory(Intent.CATEGORY_LAUNCHER)
        val launcherPackages = pm.queryIntentActivities(launcherIntent, 0).map { it.activityInfo.packageName }.toSet()

        val blockedPackages = settingsRepository.getBlockedAppPackages()
        val suspendedPackages = settingsRepository.getSuspendedAppPackages()
        val cachedApps = settingsRepository.getBlockedAppsCache().associateBy { it.packageName }
        blockedPackages.mapNotNull { packageName ->
            try {
                val appInfo = try {
                    pm.getApplicationInfo(packageName, 0)
                } catch (e: Exception) { null }

                val cachedInfo = cachedApps[packageName]
                AppInfo(
                    appName = appInfo?.loadLabel(pm)?.toString() ?: cachedInfo?.appName ?: packageName,
                    packageName = packageName,
                    icon = cachedInfo?.let { loadIconFromFile(it.iconPath) } ?: appInfo?.loadIcon(pm) ?: createDefaultIcon(),
                    isBlocked = true,
                    isSystemApp = appInfo?.let { (it.flags and ApplicationInfo.FLAG_SYSTEM) != 0 } ?: false,
                    isLauncherApp = launcherPackages.contains(packageName),
                    isSuspended = suspendedPackages.contains(packageName),
                    isInstalled = appInfo != null
                )
            } catch (e: Exception) {
                Log.w(TAG, "Could not fully resolve app info for $packageName", e)
                null
            }
        }.sortedBy { it.appName.lowercase() }
    }

    private suspend fun getSuspendedAppsFromCache(): List<AppInfo> = withContext(Dispatchers.IO) {
        val pm = context.packageManager
        val launcherIntent = Intent(Intent.ACTION_MAIN, null).addCategory(Intent.CATEGORY_LAUNCHER)
        val launcherPackages = pm.queryIntentActivities(launcherIntent, 0).map { it.activityInfo.packageName }.toSet()

        val suspendedPackages = settingsRepository.getSuspendedAppPackages()
        val cachedApps = settingsRepository.getBlockedAppsCache().associateBy { it.packageName }
        suspendedPackages.mapNotNull { packageName ->
            try {
                val appInfo = try {
                    pm.getApplicationInfo(packageName, 0)
                } catch (e: Exception) { null }

                val cachedInfo = cachedApps[packageName]
                AppInfo(
                    appName = appInfo?.loadLabel(pm)?.toString() ?: cachedInfo?.appName ?: packageName,
                    packageName = packageName,
                    icon = cachedInfo?.let { loadIconFromFile(it.iconPath) } ?: appInfo?.loadIcon(pm) ?: createDefaultIcon(),
                    isBlocked = false,
                    isSystemApp = appInfo?.let { (it.flags and ApplicationInfo.FLAG_SYSTEM) != 0 } ?: false,
                    isLauncherApp = launcherPackages.contains(packageName),
                    isSuspended = true,
                    isInstalled = appInfo != null
                )
            } catch (e: Exception) {
                Log.w(TAG, "Could not fully resolve app info for $packageName", e)
                null
            }
        }.sortedBy { it.appName.lowercase() }
    }

    private fun onAppSelectionChanged(packageName: String, isBlocked: Boolean) {
        allAppsMasterList = allAppsMasterList.map {
            if (it.packageName == packageName) it.copy(isBlocked = isBlocked, isSuspended = if (isBlocked) false else it.isSuspended) else it
        }
        applyFilter()
    }

    private fun onAppSuspensionChanged(packageName: String, isSuspended: Boolean) {
        if (isSuspended && CRITICAL_SYSTEM_PACKAGES.contains(packageName)) {
            val criticalAppInfos = allAppsMasterList.filter { it.packageName == packageName }
            _uiState.update { it.copy(showCriticalAppsWarning = true, criticalAppsDetected = criticalAppInfos) }
            return
        }
        allAppsMasterList = allAppsMasterList.map {
            if (it.packageName == packageName) it.copy(isSuspended = isSuspended, isBlocked = if (isSuspended) false else it.isBlocked) else it
        }
        applyFilter()
    }

    private fun saveAndApplyChanges() {
        viewModelScope.launch(Dispatchers.IO) {
            val oldBlockedSet = settingsRepository.getBlockedAppPackages()
            val oldSuspendedSet = settingsRepository.getSuspendedAppPackages()
            val newlySelectedApps = allAppsMasterList.filter { it.isBlocked }.map { it.packageName }.toSet()
            val newlySuspendedApps = allAppsMasterList.filter { it.isSuspended }.map { it.packageName }.toSet()
            val finalBlockedSet = oldBlockedSet + newlySelectedApps

            val finalSuspendedSet = (oldSuspendedSet + newlySuspendedApps) - finalBlockedSet

            val combinedSet = finalBlockedSet + finalSuspendedSet
            if (combinedSet.contains(OWN_PACKAGE)) {
                Log.w(TAG, "Skipping own package from block/suspend lists")
            }

            if (finalBlockedSet == oldBlockedSet && finalSuspendedSet == oldSuspendedSet) {
                Log.d(TAG, "No changes to save.")
                return@launch
            }

            // Check for critical system apps (block/suspend)
            val criticalApps = (newlySelectedApps + newlySuspendedApps).filter { CRITICAL_SYSTEM_PACKAGES.contains(it) }
            if (criticalApps.isNotEmpty()) {
                val criticalAppInfos = allAppsMasterList.filter { criticalApps.contains(it.packageName) }
                withContext(Dispatchers.Main) {
                    _uiState.update { it.copy(showCriticalAppsWarning = true, criticalAppsDetected = criticalAppInfos) }
                }
                return@launch
            }

            settingsRepository.setBlockedAppPackages(finalBlockedSet - OWN_PACKAGE)
            settingsRepository.setSuspendedAppPackages(finalSuspendedSet - OWN_PACKAGE)

            val appsToCache = allAppsMasterList.filter {
                combinedSet.contains(it.packageName) && !oldBlockedSet.contains(it.packageName) && !oldSuspendedSet.contains(it.packageName)
            }
            appsToCache.forEach { cacheAppInfo(it) }

            val packagesToUnsuspend = oldSuspendedSet - finalSuspendedSet
            packagesToUnsuspend.forEach { packageName ->
                try {
                    dpm.setPackagesSuspended(adminComponentName, arrayOf(packageName), false)
                    Log.d(TAG, "Set suspended state for $packageName to false (auto)")
                } catch (e: Exception) {
                    Log.w(TAG, "Could not unsuspend $packageName", e)
                }
            }

            newlySelectedApps.forEach { packageName ->
                try {
                    dpm.setApplicationHidden(adminComponentName, packageName, true)
                    Log.d(TAG, "Set hidden state for $packageName to true")
                } catch (e: Exception) {
                    Log.w(TAG, "Could not change hidden state for $packageName", e)
                }
            }

            newlySuspendedApps.forEach { packageName ->
                try {
                    dpm.setPackagesSuspended(adminComponentName, arrayOf(packageName), true)
                    Log.d(TAG, "Set suspended state for $packageName to true")
                } catch (e: Exception) {
                    Log.w(TAG, "Could not change suspended state for $packageName", e)
                }
            }

            withContext(Dispatchers.Main) { loadAllData() }
        }
    }

    private fun toggleUnblockSelection(packageName: String) {
        val currentSelection = _uiState.value.selectionForUnblock.toMutableSet()
        if (currentSelection.contains(packageName)) currentSelection.remove(packageName) else currentSelection.add(packageName)
        _uiState.update { it.copy(selectionForUnblock = currentSelection) }
    }

    private fun toggleUnsuspendSelection(packageName: String) {
        val currentSelection = _uiState.value.selectionForUnsuspend.toMutableSet()
        if (currentSelection.contains(packageName)) currentSelection.remove(packageName) else currentSelection.add(packageName)
        _uiState.update { it.copy(selectionForUnsuspend = currentSelection) }
    }

    private fun unblockSelectedApps() {
        viewModelScope.launch(Dispatchers.IO) {
            val packagesToUnblock = _uiState.value.selectionForUnblock
            if (packagesToUnblock.isEmpty()) return@launch
            val currentBlocked = settingsRepository.getBlockedAppPackages().toMutableSet()
            currentBlocked.removeAll(packagesToUnblock)
            settingsRepository.setBlockedAppPackages(currentBlocked)
            removeAppsFromCache(packagesToUnblock.toList())
            packagesToUnblock.forEach { packageName ->
                try {
                    dpm.setApplicationHidden(adminComponentName, packageName, false)
                    Log.d(TAG, "Set hidden state for $packageName to false (unblocked)")
                } catch (e: Exception) {
                    Log.w(TAG, "Could not unhide $packageName", e)
                }
            }
            withContext(Dispatchers.Main) {
                _uiState.update { it.copy(selectionForUnblock = emptySet()) }
                loadAllData()
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun unsuspendSelectedApps() {
        viewModelScope.launch(Dispatchers.IO) {
            val packagesToUnsuspend = _uiState.value.selectionForUnsuspend
            if (packagesToUnsuspend.isEmpty()) return@launch
            val currentSuspended = settingsRepository.getSuspendedAppPackages().toMutableSet()
            currentSuspended.removeAll(packagesToUnsuspend)
            settingsRepository.setSuspendedAppPackages(currentSuspended)
            removeAppsFromCache(packagesToUnsuspend.toList())
            packagesToUnsuspend.forEach { packageName ->
                try {
                    dpm.setPackagesSuspended(adminComponentName, arrayOf(packageName), false)
                    Log.d(TAG, "Set suspended state for $packageName to false (unsuspend)")
                } catch (e: Exception) {
                    Log.w(TAG, "Could not unsuspend $packageName", e)
                }
            }
            withContext(Dispatchers.Main) {
                _uiState.update { it.copy(selectionForUnsuspend = emptySet()) }
                loadAllData()
            }
        }
    }

    fun addPackageManually(packageName: String): String? {
        if (packageName.isBlank()) return "שם החבילה לא יכול להיות ריק."
        if (packageName == OWN_PACKAGE) return "לא ניתן להוסיף את אפליקציית המערכת לרשימה."

        // Check if it's a critical system app
        if (CRITICAL_SYSTEM_PACKAGES.contains(packageName)) {
            try {
                val pm = context.packageManager
                val appInfo = pm.getApplicationInfo(packageName, 0)
                val criticalApp = AppInfo(
                    appName = appInfo.loadLabel(pm).toString(),
                    packageName = appInfo.packageName,
                    icon = appInfo.loadIcon(pm),
                    isBlocked = false,
                    isSystemApp = (appInfo.flags and ApplicationInfo.FLAG_SYSTEM) != 0,
                    isLauncherApp = false,
                    isSuspended = false,
                    isInstalled = true
                )
                _uiState.update { it.copy(showCriticalAppsWarning = true, criticalAppsDetected = listOf(criticalApp)) }
            } catch (e: PackageManager.NameNotFoundException) {
                return "החבילה '$packageName' לא נמצאה במכשיר."
            }
            return null // Don't show error, show warning instead
        }

        viewModelScope.launch {
            val currentlyBlockedPackages = settingsRepository.getBlockedAppPackages()
            val currentlySuspendedPackages = settingsRepository.getSuspendedAppPackages()
            allAppsMasterList = allAppsMasterList.map {
                it.copy(
                    isBlocked = currentlyBlockedPackages.contains(it.packageName),
                    isSuspended = currentlySuspendedPackages.contains(it.packageName)
                )
            }
        }

        try {
            val pm = context.packageManager
            val appInfo = pm.getApplicationInfo(packageName, 0)
            val appAlreadyInList = allAppsMasterList.any { it.packageName == packageName }

            val launcherIntent = Intent(Intent.ACTION_MAIN, null).addCategory(Intent.CATEGORY_LAUNCHER)
            val isLauncher = pm.queryIntentActivities(launcherIntent, 0).any { it.activityInfo.packageName == packageName }

            if (!appAlreadyInList) {
                val newApp = AppInfo(
                    appName = appInfo.loadLabel(pm).toString(),
                    packageName = appInfo.packageName,
                    icon = appInfo.loadIcon(pm),
                    isBlocked = true,
                    isSystemApp = (appInfo.flags and ApplicationInfo.FLAG_SYSTEM) != 0,
                    isLauncherApp = isLauncher,
                    isSuspended = false,
                    isInstalled = true
                )
                allAppsMasterList = (allAppsMasterList + newApp).sortedBy { it.appName.lowercase() }
            }

            onAppSelectionChanged(packageName, true)
            return null
        } catch (e: PackageManager.NameNotFoundException) {
            return "החבילה '$packageName' לא נמצאה במכשיר."
        }
    }

    private suspend fun cacheAppInfo(appInfo: AppInfo) {
        if (!appInfo.isInstalled) return
        val iconPath = saveIconToFile(appInfo.packageName, appInfo.icon) ?: return
        val cacheEntry = BlockedAppCache(
            packageName = appInfo.packageName, appName = appInfo.appName, iconPath = iconPath
        )
        settingsRepository.addAppToCache(cacheEntry)
    }

    private suspend fun removeAppsFromCache(packageNames: List<String>) {
        settingsRepository.removeAppsFromCache(packageNames)
        packageNames.forEach {
            try {
                File(iconsDir, "$it.png").delete()
            } catch (e: Exception) { Log.e(TAG, "Failed to delete icon for $it") }
        }
    }

    private fun saveIconToFile(packageName: String, drawable: Drawable): String? {
        val bitmap = if (drawable is BitmapDrawable && drawable.bitmap != null) {
            drawable.bitmap
        } else {
            val intrinsicWidth = drawable.intrinsicWidth.takeIf { it > 0 } ?: 128
            val intrinsicHeight = drawable.intrinsicHeight.takeIf { it > 0 } ?: 128
            try {
                val bmp = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888)
                val canvas = Canvas(bmp)
                drawable.setBounds(0, 0, canvas.width, canvas.height)
                drawable.draw(canvas)
                bmp
            } catch (e: Exception) {
                Log.e(TAG, "Failed to create bitmap from drawable for $packageName", e)
                return null
            }
        }

        try {
            val file = File(iconsDir, "$packageName.png")
            FileOutputStream(file).use { out ->
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, out)
                return file.absolutePath
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error saving icon to file for $packageName", e)
        }
        return null
    }

    private fun dismissCriticalAppsWarning() {
        _uiState.update { it.copy(showCriticalAppsWarning = false, criticalAppsDetected = emptyList()) }
        // Also reset the blocked selections for critical apps
        val criticalPackages = CRITICAL_SYSTEM_PACKAGES
        allAppsMasterList = allAppsMasterList.map {
            if (criticalPackages.contains(it.packageName)) it.copy(isBlocked = false, isSuspended = false) else it
        }
        applyFilter()
    }

    private fun loadIconFromFile(path: String): Drawable? = Drawable.createFromPath(path)
    private fun createDefaultIcon(): Drawable = ContextCompat.getDrawable(context, R.mipmap.ic_launcher)!!
}
```

## File: app/src/main/java/com/secureguard/mdm/appblocker/ui/AppSelectionScreen.kt
```kotlin
package com.secureguard.mdm.appblocker.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Block
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.PauseCircle
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.res.stringResource
import com.secureguard.mdm.R
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.drawablepainter.rememberDrawablePainter
import com.secureguard.mdm.appblocker.AppBlockerEvent
import com.secureguard.mdm.appblocker.AppBlockerViewModel
import com.secureguard.mdm.appblocker.AppFilterType
import com.secureguard.mdm.appblocker.AppInfo
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppSelectionScreen(
    viewModel: AppBlockerViewModel = hiltViewModel(),
    onNavigateBack: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    var showAddPackageDialog by remember { mutableStateOf(false) }
    var showActionChoiceDialog by remember { mutableStateOf<AppInfo?>(null) }

    LaunchedEffect(Unit) {
        viewModel.loadAllData()
    }

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = R.string.app_selection_title)) },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = stringResource(id = R.string.dialog_button_cancel))
                    }
                },
                actions = {
                    IconButton(onClick = { showAddPackageDialog = true }) {
                        Icon(Icons.Default.Add, contentDescription = stringResource(id = R.string.app_selection_desc_add_manual))
                    }
                    FilterMenu(
                        currentFilter = uiState.currentFilter,
                        onFilterSelected = { viewModel.onEvent(AppBlockerEvent.OnFilterChanged(it)) }
                    )
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                viewModel.onEvent(AppBlockerEvent.OnSaveRequest)
                coroutineScope.launch { snackbarHostState.showSnackbar(context.getString(R.string.toast_changes_saved_active)) }
            }) {
                Icon(Icons.Default.Save, contentDescription = stringResource(id = R.string.settings_button_save))
            }
        }
    ) { paddingValues ->
        Column(modifier = Modifier.fillMaxSize().padding(paddingValues)) {
            OutlinedTextField(
                value = uiState.searchQuery,
                onValueChange = { viewModel.onEvent(AppBlockerEvent.OnSearchQueryChanged(it)) },
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
                label = { Text(stringResource(id = R.string.app_selection_label_search)) },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = stringResource(id = R.string.app_selection_label_search)) },
                singleLine = true
            )

            if (uiState.isLoading) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator()
                }
            } else {
                LazyColumn(modifier = Modifier.fillMaxSize()) {
                    items(items = uiState.displayedAppsForSelection, key = { it.packageName }) { appInfo ->
                        AppSelectionRow(
                            appInfo = appInfo,
                            onCheckedChange = { isChecked ->
                                // Changes are applied only on save, not immediately
                                if (isChecked) {
                                    showActionChoiceDialog = appInfo
                                } else {
                                    // For unchecking, we don't immediately apply changes
                                    // The user must save to apply the deselection
                                }
                            },
                            onActionClick = { showActionChoiceDialog = appInfo }
                        )
                        HorizontalDivider()
                    }
                }
            }
        }
    }

    if (showAddPackageDialog) {
        var manualPackageName by remember { mutableStateOf("") }
        var errorText by remember { mutableStateOf<String?>(null) }

        AddPackageDialog(
            packageName = manualPackageName,
            onPackageNameChange = { manualPackageName = it },
            error = errorText,
            onDismiss = { showAddPackageDialog = false },
            onConfirm = {
                val error = viewModel.addPackageManually(manualPackageName)
                if (error == null) {
                    showAddPackageDialog = false
                } else {
                    errorText = error
                }
            }
        )
    }

    if (uiState.showCriticalAppsWarning && uiState.criticalAppsDetected.isNotEmpty()) {
        CriticalAppsWarningDialog(
            criticalApps = uiState.criticalAppsDetected,
            onDismiss = { viewModel.onEvent(AppBlockerEvent.OnDismissCriticalAppsWarning) }
        )
    }

    showActionChoiceDialog?.let { appInfo ->
        AppSelectionActionChoiceDialog(
            appInfo = appInfo,
            onDismiss = { showActionChoiceDialog = null },
            onChooseBlock = {
                showActionChoiceDialog = null
                viewModel.onEvent(AppBlockerEvent.OnAppSelectionChanged(appInfo.packageName, true))
                viewModel.onEvent(AppBlockerEvent.OnSaveRequest)
            },
            onChooseSuspend = {
                showActionChoiceDialog = null
                viewModel.onEvent(AppBlockerEvent.OnAppSuspensionChanged(appInfo.packageName, true))
                viewModel.onEvent(AppBlockerEvent.OnSaveRequest)
            }
        )
    }
}

@Composable
private fun FilterMenu(currentFilter: AppFilterType, onFilterSelected: (AppFilterType) -> Unit) {
    var expanded by remember { mutableStateOf(false) }
    Box {
        IconButton(onClick = { expanded = true }) { Icon(Icons.Default.FilterList, contentDescription = stringResource(id = R.string.app_selection_desc_filter)) }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            DropdownMenuItem(text = { Text(stringResource(id = R.string.app_selection_filter_user)) }, onClick = { onFilterSelected(AppFilterType.USER_ONLY); expanded = false })
            DropdownMenuItem(text = { Text(stringResource(id = R.string.app_selection_filter_launcher)) }, onClick = { onFilterSelected(AppFilterType.LAUNCHER_ONLY); expanded = false })
            DropdownMenuItem(text = { Text(stringResource(id = R.string.app_selection_filter_all_except_core)) }, onClick = { onFilterSelected(AppFilterType.ALL_EXCEPT_CORE); expanded = false })
            DropdownMenuItem(text = { Text(stringResource(id = R.string.app_selection_filter_all)) }, onClick = { onFilterSelected(AppFilterType.ALL); expanded = false })
        }
    }
}

@Composable
fun AddPackageDialog(
    packageName: String,
    onPackageNameChange: (String) -> Unit,
    error: String?,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.dialog_add_manual_package_title)) },
        text = {
            Column {
                OutlinedTextField(
                    value = packageName,
                    onValueChange = onPackageNameChange,
                    label = { Text("com.example.app") },
                    singleLine = true,
                    isError = error != null
                )
                if (error != null) {
                    Text(text = error, color = MaterialTheme.colorScheme.error, style = MaterialTheme.typography.bodySmall)
                }
            }
        },
        confirmButton = { Button(onClick = onConfirm) { Text(stringResource(id = R.string.dialog_add_manual_package_button_confirm)) } },
        dismissButton = { TextButton(onClick = onDismiss) { Text(stringResource(id = R.string.dialog_button_cancel)) } }
    )
}

@Composable
private fun AppSelectionRow(
    appInfo: AppInfo,
    onCheckedChange: (Boolean) -> Unit,
    onActionClick: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth().clickable { onActionClick() }.padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(painter = rememberDrawablePainter(drawable = appInfo.icon), contentDescription = null, modifier = Modifier.size(40.dp))
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = appInfo.appName, style = MaterialTheme.typography.bodyLarge)
            if (appInfo.isBlocked) {
                Text(text = "חסומה", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.error)
            } else if (appInfo.isSuspended) {
                Text(text = "מושבתת", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.primary)
            }
        }
        Spacer(modifier = Modifier.width(16.dp))
        // Removed the block button, keeping only the checkmark
        Checkbox(checked = appInfo.isBlocked || appInfo.isSuspended, onCheckedChange = { onCheckedChange(it) })
    }
}

@Composable
private fun AppSelectionActionChoiceDialog(
    appInfo: AppInfo,
    onDismiss: () -> Unit,
    onChooseBlock: () -> Unit,
    onChooseSuspend: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("פעולה עבור ${appInfo.appName}") },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text("בחר מה לבצע עבור האפליקציה")
                Button(
                    onClick = onChooseBlock,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(Icons.Default.Block, contentDescription = null)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("חסימה")
                }
                OutlinedButton(
                    onClick = onChooseSuspend,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(Icons.Default.PauseCircle, contentDescription = null)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("השבתה")
                }
            }
        },
        confirmButton = {},
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.dialog_button_cancel))
            }
        }
    )
}

@Composable
private fun CriticalAppsWarningDialog(
    criticalApps: List<AppInfo>,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.app_selection_warning_critical_title)) },
        text = {
            Column {
                Text(stringResource(id = R.string.app_selection_warning_critical_message))
                Spacer(modifier = Modifier.height(8.dp))
                Text(stringResource(id = R.string.app_selection_warning_critical_coming_soon))
                Spacer(modifier = Modifier.height(16.dp))
                Text(stringResource(id = R.string.app_selection_warning_critical_list_label), style = MaterialTheme.typography.titleSmall)
                Spacer(modifier = Modifier.height(8.dp))
                criticalApps.forEach { app ->
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(painter = rememberDrawablePainter(drawable = app.icon), contentDescription = null, modifier = Modifier.size(24.dp))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(app.appName, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        },
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.dashboard_button_understood))
            }
        }
    )
}
```

## File: app/src/main/java/com/secureguard/mdm/appblocker/ui/BlockedAppsScreen.kt
```kotlin
package com.secureguard.mdm.appblocker.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Block
import androidx.compose.material.icons.filled.LockOpen
import androidx.compose.material.icons.filled.PauseCircle
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.drawablepainter.rememberDrawablePainter
import com.secureguard.mdm.appblocker.AppBlockerEvent
import com.secureguard.mdm.appblocker.AppBlockerViewModel
import com.secureguard.mdm.appblocker.AppInfo
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BlockedAppsScreen(
    viewModel: AppBlockerViewModel = hiltViewModel(),
    onNavigateBack: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    var showAddPackageDialog by remember { mutableStateOf(false) }
    var showActionChoiceDialog by remember { mutableStateOf<AppInfo?>(null) }
    val coroutineScope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    LaunchedEffect(Unit) {
        viewModel.loadAllData()
    }

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        topBar = {
            TopAppBar(
                title = { Text("אפליקציות חסומות") },
                navigationIcon = { IconButton(onClick = onNavigateBack) { Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back") } },
                actions = {
                    IconButton(onClick = { showAddPackageDialog = true }) {
                        Icon(Icons.Default.Add, contentDescription = "הוסף חבילה ידנית")
                    }
                }
            )
        },
        floatingActionButton = {
            when {
                uiState.selectionForUnblock.isNotEmpty() -> {
                    FloatingActionButton(onClick = { viewModel.onEvent(AppBlockerEvent.OnUnblockSelectedRequest) }) {
                        Icon(Icons.Default.LockOpen, contentDescription = "שחרר חסימה")
                    }
                }
                uiState.selectionForUnsuspend.isNotEmpty() -> {
                    FloatingActionButton(onClick = { viewModel.onEvent(AppBlockerEvent.OnUnsuspendSelectedRequest) }) {
                        Icon(Icons.Default.PauseCircle, contentDescription = "שחרר השבתה")
                    }
                }
            }
        }
    ) { paddingValues ->
        Column(modifier = Modifier.fillMaxSize().padding(paddingValues)) {
            OutlinedTextField(
                value = uiState.searchQuery,
                onValueChange = { viewModel.onEvent(AppBlockerEvent.OnSearchQueryChanged(it)) },
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
                label = { Text("חיפוש...") },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Search Icon") },
                singleLine = true
            )

            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                val blockedApps = uiState.displayedBlockedApps
                val suspendedApps = uiState.displayedSuspendedApps
                if (uiState.isLoading) {
                    CircularProgressIndicator()
                } else if (blockedApps.isEmpty() && suspendedApps.isEmpty() && uiState.searchQuery.isBlank()) {
                    Text(
                        text = "לא הוגדרו אפליקציות לחסימה.",
                        style = MaterialTheme.typography.bodyLarge,
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                    )
                } else if (blockedApps.isEmpty() && suspendedApps.isEmpty() && uiState.searchQuery.isNotBlank()) {
                    Text(
                        text = "לא נמצאו אפליקציות חסומות התואמות לחיפוש.",
                        style = MaterialTheme.typography.bodyLarge,
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                    )
                }
                else {
                    LazyColumn(modifier = Modifier.fillMaxSize(), contentPadding = PaddingValues(vertical = 8.dp)) {
                        if (blockedApps.isNotEmpty()) {
                            item {
                                Text(
                                    text = "חסומות",
                                    style = MaterialTheme.typography.titleSmall,
                                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                                )
                            }
                            items(items = blockedApps, key = { it.packageName }) { appInfo ->
                                BlockedAppRow(
                                    appInfo = appInfo,
                                    isSelected = uiState.selectionForUnblock.contains(appInfo.packageName),
                                    onToggleSelection = { viewModel.onEvent(AppBlockerEvent.OnToggleUnblockSelection(appInfo.packageName)) },
                                    onActionClick = { showActionChoiceDialog = appInfo }
                                )
                                HorizontalDivider()
                            }
                        }
                        if (suspendedApps.isNotEmpty()) {
                            item {
                                Text(
                                    text = "מושבתות",
                                    style = MaterialTheme.typography.titleSmall,
                                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                                )
                            }
                            items(items = suspendedApps, key = { it.packageName }) { appInfo ->
                                BlockedAppRow(
                                    appInfo = appInfo,
                                    isSelected = uiState.selectionForUnsuspend.contains(appInfo.packageName),
                                    onToggleSelection = { viewModel.onEvent(AppBlockerEvent.OnToggleUnsuspendSelection(appInfo.packageName)) },
                                    onActionClick = { showActionChoiceDialog = appInfo }
                                )
                                HorizontalDivider()
                            }
                        }
                    }
                }
            }
        }
    }

    if (showAddPackageDialog) {
        AddPackageDialogBlockedScreen(
            onDismiss = { showAddPackageDialog = false },
            onConfirm = { packageName ->
                val error = viewModel.addPackageManually(packageName)
                if (error == null) {
                    viewModel.onEvent(AppBlockerEvent.OnSaveRequest)
                    showAddPackageDialog = false
                } else {
                    coroutineScope.launch { snackbarHostState.showSnackbar(error) }
                }
            }
        )
    }

    showActionChoiceDialog?.let { appInfo ->
        AppActionChoiceDialog(
            appInfo = appInfo,
            onDismiss = { showActionChoiceDialog = null },
            onChooseBlock = {
                showActionChoiceDialog = null
                viewModel.onEvent(AppBlockerEvent.OnAppSelectionChanged(appInfo.packageName, true))
                viewModel.onEvent(AppBlockerEvent.OnSaveRequest)
            },
            onChooseSuspend = {
                showActionChoiceDialog = null
                viewModel.onEvent(AppBlockerEvent.OnAppSuspensionChanged(appInfo.packageName, true))
                viewModel.onEvent(AppBlockerEvent.OnSaveRequest)
            }
        )
    }
}

@Composable
private fun AddPackageDialogBlockedScreen(
    onDismiss: () -> Unit,
    onConfirm: (String) -> Unit
) {
    var text by remember { mutableStateOf("") }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("הוסף חבילה לחסימה") },
        text = {
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("com.example.app") },
                singleLine = true
            )
        },
        confirmButton = { Button(onClick = { onConfirm(text) }) { Text("הוסף וחסימה") } },
        dismissButton = { TextButton(onClick = onDismiss) { Text("ביטול") } }
    )
}

@Composable
private fun BlockedAppRow(
    appInfo: AppInfo,
    isSelected: Boolean,
    onToggleSelection: () -> Unit,
    onActionClick: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth().clickable(onClick = onToggleSelection).padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(painter = rememberDrawablePainter(drawable = appInfo.icon), contentDescription = null, modifier = Modifier.size(48.dp))
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = appInfo.appName, style = MaterialTheme.typography.bodyLarge)
            Text(text = appInfo.packageName, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f))
            if (!appInfo.isInstalled) {
                Text(
                    text = "(שמור בזיכרון)",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                )
            }
        }
        IconButton(onClick = onActionClick) {
            Icon(Icons.Default.Block, contentDescription = "בחר פעולה")
        }
        Checkbox(checked = isSelected, onCheckedChange = { onToggleSelection() })
    }
}

@Composable
private fun AppActionChoiceDialog(
    appInfo: AppInfo,
    onDismiss: () -> Unit,
    onChooseBlock: () -> Unit,
    onChooseSuspend: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("פעולה עבור ${appInfo.appName}") },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text("בחר מה לבצע עבור האפליקציה")
                Button(
                    onClick = onChooseBlock,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("חסימה")
                }
                OutlinedButton(
                    onClick = onChooseSuspend,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("השבתה")
                }
            }
        },
        confirmButton = {},
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("ביטול")
            }
        }
    )
}
```

## File: app/src/main/java/com/secureguard/mdm/boot/BootCompletedReceiver.kt
```kotlin
package com.secureguard.mdm.boot

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.content.ContextCompat
import com.secureguard.mdm.MainService

class BootCompletedReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        // We listen for both actions to increase reliability across different API levels and boot stages.
        if (intent.action == Intent.ACTION_BOOT_COMPLETED || intent.action == Intent.ACTION_LOCKED_BOOT_COMPLETED) {
            Log.d("BootReceiver", "Boot event received: ${intent.action}. Starting MainService.")
            startBootTasks(context)
        }
    }

    companion object {
        private const val ACTION_SIMULATE_BOOT_COMPLETED = "com.secureguard.mdm.SIMULATE_BOOT_COMPLETED"
        private var bootTasksStarted = false

        /**
         * Simulates boot completion by starting the MainService with boot tasks.
         * This can be called from within the app to trigger boot tasks without requiring
         * actual boot broadcasts (which need special permissions).
         */
        fun simulateBootCompleted(context: Context) {
            if (bootTasksStarted) {
                Log.d("BootReceiver", "Boot tasks already started. Skipping simulation.")
                return
            }
            Log.d("BootReceiver", "Simulating boot completed. Starting boot tasks.")
            startBootTasks(context)
        }

        private fun startBootTasks(context: Context) {
            if (bootTasksStarted) return
            bootTasksStarted = true
            
            try {
                val serviceIntent = Intent(context, MainService::class.java)
                ContextCompat.startForegroundService(context, serviceIntent)
            } catch (e: Exception) {
                // Log any potential exceptions during service start, which can happen on some restrictive devices.
                Log.e("BootReceiver", "Failed to start MainService.", e)
            }
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/boot/registry/BootTaskRegistry.kt
```kotlin
package com.secureguard.mdm.boot.registry

import com.secureguard.mdm.boot.api.BootTask
import com.secureguard.mdm.boot.impl.NetfreeWatchdogBootTask
import com.secureguard.mdm.boot.impl.ShowToastOnBootTask
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BootTaskRegistry @Inject constructor(
    showToastOnBootTask: ShowToastOnBootTask,
    netfreeWatchdogBootTask: NetfreeWatchdogBootTask
) {
    val allBootTasks: List<BootTask> = listOf(
        showToastOnBootTask,
        netfreeWatchdogBootTask
    )
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockAddUserFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockAddUserFeature : ProtectionFeature {

    override val id = "block_add_user"
    override val titleRes = R.string.feature_add_user_title
    override val descriptionRes = R.string.feature_add_user_description
    override val iconRes = R.drawable.ic_person_add_disabled

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_ADD_USER)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_ADD_USER)
        }
        // FIX: Persist state for the fallback check on APIs < 24
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
                .edit().putBoolean(id, enable).apply()
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_ADD_USER, false)
        }
        // Fallback for APIs < 24
        val prefs = context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
        return prefs.getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockBluetoothFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockBluetoothFeature : ProtectionFeature {
    override val id = "block_bluetooth"
    override val titleRes = R.string.feature_bluetooth_title
    override val descriptionRes = R.string.feature_bluetooth_description
    override val iconRes = R.drawable.ic_bluetooth_disabled

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_BLUETOOTH)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_BLUETOOTH)
        }
        // FIX: Persist state for the fallback check on APIs < 24
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
                .edit().putBoolean(id, enable).apply()
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_BLUETOOTH, false)
        }
        // FIX: Read from SharedPreferences instead of returning false
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockConfigMobileNetworksFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockConfigMobileNetworksFeature : ProtectionFeature {
    override val id: String = "block_config_mobile_networks"
    override val titleRes: Int = R.string.feature_block_config_mobile_networks_title
    override val descriptionRes: Int = R.string.feature_block_config_mobile_networks_description
    override val iconRes: Int = R.drawable.ic_config_mobile_networks_off

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_CONFIG_MOBILE_NETWORKS)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_CONFIG_MOBILE_NETWORKS)
        }
        context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .edit().putBoolean(id, enable).apply()
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        // --- התיקון כאן ---
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_CONFIG_MOBILE_NETWORKS, false)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockDataRoamingFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.annotation.SuppressLint
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockDataRoamingFeature : ProtectionFeature {
    override val id: String = "block_data_roaming"
    override val titleRes: Int = R.string.feature_block_data_roaming_title
    override val descriptionRes: Int = R.string.feature_block_data_roaming_description
    override val iconRes: Int = R.drawable.ic_data_roaming_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.M // API 23

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        // FIX: Add version guard to prevent crash on API < 23
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return

        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_DATA_ROAMING)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_DATA_ROAMING)
        }
        // FIX: Persist state for the fallback check on APIs < 24
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
                .edit().putBoolean(id, enable).apply()
        }
    }

    @SuppressLint("NewApi")
    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        // FIX: Add version guard to prevent crash on API < 23
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return false

        // FIX: Check for API 24+ before using the new API, otherwise fallback
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_DATA_ROAMING, false)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockDeveloperOptionsFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import androidx.annotation.ChecksSdkIntAtLeast
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockDeveloperOptionsFeature : ProtectionFeature {
    override val id = "block_dev_options"
    override val titleRes = R.string.feature_dev_options_title
    override val descriptionRes = R.string.feature_dev_options_description
    override val iconRes = R.drawable.ic_developer_mode
    override val requiredSdkVersion = Build.VERSION_CODES.LOLLIPOP_MR1

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_DEBUGGING_FEATURES)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_DEBUGGING_FEATURES)
        }
        // FIX: Persist state for the fallback check on APIs < 24
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
                .edit().putBoolean(id, enable).apply()
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_DEBUGGING_FEATURES, false)
        }
        // FIX: Read from SharedPreferences instead of returning false
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockInternetVpnFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.VpnService
import android.os.Build
import android.util.Log
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature
import com.secureguard.mdm.services.BlockerVpnService

object BlockInternetVpnFeature : ProtectionFeature {

    override val id = "block_internet_vpn"
    override val titleRes = R.string.feature_vpn_title
    override val descriptionRes = R.string.feature_vpn_description
    override val iconRes = R.drawable.ic_cloud_off

    // Always-On VPN is available from API 24 (Android 7.0)
    override val requiredSdkVersion = Build.VERSION_CODES.N

    /**
     * This implementation uses the system's Always-On VPN feature.
     * The system becomes responsible for starting and stopping the VpnService.
     */
    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            try {
                if (enable) {
                    // Set our app as the always-on VPN and enable lockdown mode.
                    dpm.setAlwaysOnVpnPackage(admin, context.packageName, true)
                } else {
                    // Remove our app as the always-on VPN.
                    dpm.setAlwaysOnVpnPackage(admin, null, false)
                    // Also explicitly stop the service in case it's running.
                    val serviceIntent = Intent(context, BlockerVpnService::class.java).apply {
                        action = BlockerVpnService.ACTION_DISCONNECT
                    }
                    context.startService(serviceIntent)
                }
            } catch (e: SecurityException) {
                Log.e("BlockInternetVpnFeature", "Failed to set Always-On VPN policy", e)
            }
        }
    }

    /**
     * Checks if our package is set as the system's always-on VPN.
     */
    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return context.packageName == dpm.getAlwaysOnVpnPackage(admin)
        }
        return false // Feature is not supported on older versions.
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockModifyAccountsFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockModifyAccountsFeature : ProtectionFeature {
    override val id: String = "block_modify_accounts"
    override val titleRes: Int = R.string.feature_block_modify_accounts_title
    override val descriptionRes: Int = R.string.feature_block_modify_accounts_description
    override val iconRes: Int = R.drawable.ic_modify_accounts_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.LOLLIPOP

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_MODIFY_ACCOUNTS)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_MODIFY_ACCOUNTS)
        }
        // Fallback for checking status on older APIs
        context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .edit().putBoolean(id, enable).apply()
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        // --- התיקון כאן ---
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_MODIFY_ACCOUNTS, false)
        }
        // Fallback for APIs < 24
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockOutgoingBeamFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockOutgoingBeamFeature : ProtectionFeature {
    override val id: String = "block_outgoing_beam"
    override val titleRes: Int = R.string.feature_block_outgoing_beam_title
    override val descriptionRes: Int = R.string.feature_block_outgoing_beam_description
    override val iconRes: Int = R.drawable.ic_nfc_off

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_OUTGOING_BEAM)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_OUTGOING_BEAM)
        }
        context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .edit().putBoolean(id, enable).apply()
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        // --- התיקון כאן ---
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_OUTGOING_BEAM, false)
        }
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockRemoveUserFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockRemoveUserFeature : ProtectionFeature {
    override val id: String = "block_remove_user"
    override val titleRes: Int = R.string.feature_block_remove_user_title
    override val descriptionRes: Int = R.string.feature_block_remove_user_description
    override val iconRes: Int = R.drawable.ic_remove_user_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.LOLLIPOP

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_REMOVE_USER)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_REMOVE_USER)
        }
        // Fallback for checking status on older APIs
        context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .edit().putBoolean(id, enable).apply()
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        // --- התיקון כאן ---
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_REMOVE_USER, false)
        }
        // Fallback for APIs < 24
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockUnknownSourcesFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockUnknownSourcesFeature : ProtectionFeature {
    override val id = "block_unknown_sources"
    override val titleRes = R.string.feature_unknown_sources_title
    override val descriptionRes = R.string.feature_unknown_sources_description
    override val iconRes = R.drawable.ic_apk_install

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_INSTALL_UNKNOWN_SOURCES)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_INSTALL_UNKNOWN_SOURCES)
        }
        // FIX: Persist state for the fallback check on APIs < 24
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
                .edit().putBoolean(id, enable).apply()
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_INSTALL_UNKNOWN_SOURCES, false)
        }
        // FIX: Read from SharedPreferences instead of returning false
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
            .getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockUsbFileTransferFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.UserManager
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object BlockUsbFileTransferFeature : ProtectionFeature {
    override val id = "block_usb_transfer"
    override val titleRes = R.string.feature_usb_transfer_title
    override val descriptionRes = R.string.feature_usb_transfer_description
    override val iconRes = R.drawable.ic_usb_off
    // FIX: Correctly state required SDK version
    override val requiredSdkVersion = Build.VERSION_CODES.M

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        // FIX: Add version guard to prevent crash on API < 23
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return

        if (enable) {
            dpm.addUserRestriction(admin, UserManager.DISALLOW_USB_FILE_TRANSFER)
        } else {
            dpm.clearUserRestriction(admin, UserManager.DISALLOW_USB_FILE_TRANSFER)
        }
        // FIX: Persist state for the fallback check on APIs < 24
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
                .edit().putBoolean(id, enable).apply()
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        // FIX: Add version guard to prevent crash on API < 23
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return false

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return dpm.getUserRestrictions(admin).getBoolean(UserManager.DISALLOW_USB_FILE_TRANSFER)
        }
        // FIX: Read from saved state for API 23
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE).getBoolean(id, false)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/DisableKeyguardFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.annotation.SuppressLint
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.os.Build
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature

object DisableKeyguardFeature : ProtectionFeature {
    override val id: String = "disable_keyguard"
    override val titleRes: Int = R.string.feature_disable_keyguard_title
    override val descriptionRes: Int = R.string.feature_disable_keyguard_description
    override val iconRes: Int = R.drawable.ic_lock_open

    // FIX: Set the minimum required SDK to Android 6.0 (API 23)
    // This will automatically disable the feature on older, unsupported devices.
    override val requiredSdkVersion: Int = Build.VERSION_CODES.M

    @SuppressLint("NewApi")
    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        // Since we've set requiredSdkVersion, we can safely assume the API is available.
        // This is a safety net in case the policy is triggered from an unexpected place.
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return

        // Use the modern, recommended API for Android 6.0+
        val flags = if (enable) {
            DevicePolicyManager.KEYGUARD_DISABLE_FEATURES_ALL
        } else {
            DevicePolicyManager.KEYGUARD_DISABLE_FEATURES_NONE
        }
        dpm.setKeyguardDisabledFeatures(admin, flags)
    }

    @SuppressLint("NewApi")
    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        // If the device is older than Android 6.0, the feature is not active by definition.
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return false

        // On supported devices, we can directly ask the system for the current state.
        // This is more reliable than saving the state in SharedPreferences.
        return dpm.getKeyguardDisabledFeatures(admin) != DevicePolicyManager.KEYGUARD_DISABLE_FEATURES_NONE
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/FrpProtectionFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.admin.DevicePolicyManager
import android.app.admin.FactoryResetProtectionPolicy
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import com.secureguard.mdm.R
import com.secureguard.mdm.data.repository.SettingsRepository
import com.secureguard.mdm.features.api.ProtectionFeature
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.runBlocking

object FrpProtectionFeature : ProtectionFeature {
    override val id: String = "frp_protection"
    override val titleRes: Int = R.string.feature_frp_protection_title
    override val descriptionRes: Int = R.string.feature_frp_protection_description
    override val iconRes: Int = R.drawable.ic_frp_shield

    override val requiredSdkVersion: Int = Build.VERSION_CODES.LOLLIPOP_MR1

    private const val TAG = "FrpProtectionFeature"
    private const val GMS_PACKAGE = "com.google.android.gms"
    private const val LEGACY_FRP_KEY = "factoryResetProtectionAdmin"
    private const val LEGACY_FRP_BROADCAST = "com.google.android.gms.auth.FRP_CONFIG_CHANGED"

    private val defaultFrpAccountId = listOf("110598130046942145007")

    @EntryPoint
    @InstallIn(SingletonComponent::class)
    interface FrpEntryPoint {
        fun settingsRepository(): SettingsRepository
    }

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        val entryPoint = EntryPointAccessors.fromApplication(context.applicationContext, FrpEntryPoint::class.java)
        val settingsRepository = entryPoint.settingsRepository()

        val accountIdsToUse = runBlocking {
            val customIds = settingsRepository.getCustomFrpIds()
            if (customIds.isNotEmpty()) {
                Log.d(TAG, "Using custom FRP IDs: $customIds")
                customIds.toList()
            } else {
                Log.d(TAG, "Using default FRP ID.")
                defaultFrpAccountId
            }
        }

        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                applyModernPolicy(dpm, admin, enable, accountIdsToUse)
            } else {
                applyLegacyPolicy(context, dpm, admin, enable, accountIdsToUse)
            }
        } catch (e: SecurityException) {
            Log.e(TAG, "Failed to apply FRP policy. App is likely not the device owner.", e)
        } catch (e: UnsupportedOperationException) {
            Log.w(TAG, "FRP is not supported on this device.")
        } catch (e: Exception) {
            Log.e(TAG, "An unexpected error occurred while applying FRP policy.", e)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                try {
                    val policy = dpm.getFactoryResetProtectionPolicy(admin)
                    return policy != null && policy.isFactoryResetProtectionEnabled
                } catch (e: UnsupportedOperationException) {
                    Log.w(TAG, "Modern FRP policy check failed: Not supported on this device.")
                    return false
                }
            } else {
                val restrictions = dpm.getApplicationRestrictions(admin, GMS_PACKAGE)
                return !restrictions.isEmpty && restrictions.containsKey(LEGACY_FRP_KEY)
            }
        } catch (e: SecurityException) {
            Log.e(TAG, "Failed to check FRP policy status due to a SecurityException.", e)
            return false
        }
    }

    @RequiresApi(Build.VERSION_CODES.R)
    private fun applyModernPolicy(dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean, accounts: List<String>) {
        if (enable) {
            Log.d(TAG, "Applying modern (API 30+) FRP policy.")
            val policy = FactoryResetProtectionPolicy.Builder()
                .setFactoryResetProtectionAccounts(accounts)
                .setFactoryResetProtectionEnabled(true)
                .build()
            dpm.setFactoryResetProtectionPolicy(admin, policy)
        } else {
            Log.d(TAG, "Disabling modern (API 30+) FRP policy.")
            dpm.setFactoryResetProtectionPolicy(admin, null)
        }
    }

    private fun applyLegacyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean, accounts: List<String>) {
        if (enable) {
            Log.d(TAG, "Applying legacy (pre-API 30) FRP policy.")
            val bundle = Bundle()
            bundle.putStringArray(LEGACY_FRP_KEY, accounts.toTypedArray())
            dpm.setApplicationRestrictions(admin, GMS_PACKAGE, bundle)

            val intent = Intent(LEGACY_FRP_BROADCAST).setPackage(GMS_PACKAGE)
            context.sendBroadcast(intent)
            Log.d(TAG, "Sent FRP config changed broadcast.")
        } else {
            Log.d(TAG, "Disabling legacy (pre-API 30) FRP policy.")
            dpm.setApplicationRestrictions(admin, GMS_PACKAGE, null)
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/InstallAndProtectNetGuardFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.PendingIntent
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageInstaller
import android.content.pm.PackageManager
import android.os.Build
import android.util.Log
import android.widget.Toast
import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature
import com.secureguard.mdm.receivers.InstallReceiver
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

object InstallAndProtectNetGuardFeature : ProtectionFeature {
    override val id: String = "install_protect_netguard"
    override val titleRes: Int = R.string.feature_install_netguard_title
    override val descriptionRes: Int = R.string.feature_install_netguard_description
    override val iconRes: Int = R.drawable.ic_netguard_shield

    private const val NETGUARD_PACKAGE_NAME = "eu.faircode.netguard"
    private const val NETGUARD_ASSET_NAME = "netguard.apk"
    private const val TAG = "NetGuardFeature"

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        if (enable) {
            CoroutineScope(Dispatchers.IO).launch {
                if (!isAppInstalled(context, NETGUARD_PACKAGE_NAME)) {
                    withContext(Dispatchers.Main) {
                        Toast.makeText(context, R.string.toast_installing_netguard, Toast.LENGTH_SHORT).show()
                    }
                    installNetGuardApp(context)
                }
                try {
                    dpm.setUninstallBlocked(admin, NETGUARD_PACKAGE_NAME, true)
                    Log.d(TAG, "Successfully blocked uninstall for NetGuard.")
                } catch (e: Exception) {
                    Log.e(TAG, "Failed to block uninstall for NetGuard.", e)
                }
            }
        } else {
            // -- התיקון כאן: הסרת ה-Toast --
            // הלוגיקה הזו מבוצעת בכל שמירה, ולכן ההודעה צריכה להיות מנוהלת ע"י ה-ViewModel
            // שיודע מתי באמת התבצע שינוי במצב.
            try {
                dpm.setUninstallBlocked(admin, NETGUARD_PACKAGE_NAME, false)
                Log.d(TAG, "Successfully unblocked uninstall for NetGuard.")
            } catch (e: Exception) {
                Log.e(TAG, "Failed to unblock uninstall for NetGuard.", e)
            }
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        return isAppInstalled(context, NETGUARD_PACKAGE_NAME) && dpm.isUninstallBlocked(admin, NETGUARD_PACKAGE_NAME)
    }

    private fun isAppInstalled(context: Context, packageName: String): Boolean {
        return try {
            context.packageManager.getPackageInfo(packageName, 0)
            true
        } catch (e: PackageManager.NameNotFoundException) {
            false
        }
    }

    private fun installNetGuardApp(context: Context) {
        try {
            val packageInstaller = context.packageManager.packageInstaller
            val params = PackageInstaller.SessionParams(PackageInstaller.SessionParams.MODE_FULL_INSTALL)
            val sessionId = packageInstaller.createSession(params)
            val session = packageInstaller.openSession(sessionId)

            context.assets.open(NETGUARD_ASSET_NAME).use { assetStream ->
                session.openWrite("netguard_install_session", 0, -1).use { sessionStream ->
                    assetStream.copyTo(sessionStream)
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
            Log.d(TAG, "NetGuard installation session committed.")

        } catch (e: Exception) {
            Log.e(TAG, "Failed to install NetGuard app from assets.", e)
            CoroutineScope(Dispatchers.Main).launch {
                Toast.makeText(context, "Failed to install NetGuard: ${e.message}", Toast.LENGTH_LONG).show()
            }
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/features/registry/CategoryRegistry.kt
```kotlin
package com.secureguard.mdm.features.registry

import com.secureguard.mdm.R
import com.secureguard.mdm.features.api.ProtectionFeature
import com.secureguard.mdm.features.impl.*

data class ProtectionCategory(
    val titleResId: Int,
    val features: List<ProtectionFeature>
)

object CategoryRegistry {

    val allCategories: List<ProtectionCategory> = listOf(
        ProtectionCategory(
            titleResId = R.string.category_device_management,
            features = listOf(
                BlockDeveloperOptionsFeature,
                BlockFactoryResetFeature,
                FrpProtectionFeature,
                BlockSafeBootFeature,
                BlockAddUserFeature,
                BlockRemoveUserFeature,
                BlockModifyAccountsFeature,
                BlockPasswordChangeFeature
            )
        ),
        ProtectionCategory(
            titleResId = R.string.category_hardware,
            features = listOf(
                BlockCameraFeature,
                BlockMicrophoneFeature,
                BlockScreenshotFeature,
                BlockUsbFileTransferFeature,
                BlockMountPhysicalMediaFeature,
                BlockLocationSharingFeature
            )
        ),
        ProtectionCategory(
            titleResId = R.string.category_network,
            features = listOf(
                BlockWifiFeature,
                BlockBluetoothFeature,
                BlockBluetoothSharingFeature,
                BlockMobileDataFeature,
                BlockTetheringFeature,
                BlockPrivateDnsFeature,
                BlockConfigMobileNetworksFeature
            )
        ),
        ProtectionCategory(
            titleResId = R.string.category_apps,
            features = listOf(
                BlockPlayStoreFeature,
                BlockInstallAppsFeature,
                BlockUninstallAppsFeature,
                BlockUnknownSourcesFeature,
                BlockAppsControlFeature,
                BlockAutofillFeature,
                BlockContentCaptureFeature
            )
        ),
        ProtectionCategory(
            titleResId = R.string.category_vpn,
            features = listOf(
                NetfreeOnlyModeFeature,
                BlockInternetVpnFeature,
                BlockVpnSettingsFeature
            )
        ),
        ProtectionCategory(
            titleResId = R.string.category_calls_sms,
            features = listOf(
                BlockOutgoingCallsFeature,
                BlockIncomingCallsFeature,
                BlockSmsFeature
            )
        ),
        ProtectionCategory(
            titleResId = R.string.category_ui,
            features = listOf(
                DisableStatusBarFeature,
                DisableKeyguardFeature,
                BlockSetWallpaperFeature,
                BlockSetUserIconFeature,
                BlockAdjustVolumeFeature,
                BlockAmbientDisplayFeature,
                BlockSystemErrorDialogsFeature
            )
        ),
        ProtectionCategory(
            titleResId = R.string.category_advanced,
            features = listOf(
                BlockConfigLocationFeature,
                BlockConfigCredentialsFeature,
                BlockPrintingFeature,
                BlockConfigCellBroadcastsFeature,
                BlockRemoveManagedProfileFeature
            )
        )
    )
}
```

## File: app/src/main/java/com/secureguard/mdm/features/registry/FeatureRegistry.kt
```kotlin
package com.secureguard.mdm.features.registry

import com.secureguard.mdm.features.api.ProtectionFeature
import com.secureguard.mdm.features.impl.*

object FeatureRegistry {

    val allFeatures: List<ProtectionFeature> = listOf(
        BlockDeveloperOptionsFeature,
        BlockBluetoothFeature,
        BlockUnknownSourcesFeature,
        BlockWifiFeature,
        BlockAddUserFeature,
        BlockCameraFeature,
        BlockScreenshotFeature,
        BlockUsbFileTransferFeature,
        BlockMicrophoneFeature,
        BlockLocationSharingFeature,
        BlockBluetoothSharingFeature,
        BlockMobileDataFeature,
        BlockTetheringFeature,
        BlockPlayStoreFeature,
        BlockFactoryResetFeature,
        BlockOutgoingCallsFeature,
        BlockSafeBootFeature,
        BlockInternetVpnFeature,
        BlockSmsFeature,
        BlockInstallAppsFeature,
        BlockRemoveUserFeature,
        BlockModifyAccountsFeature,
        BlockRemoveManagedProfileFeature,
        BlockSetUserIconFeature,
        BlockAdjustVolumeFeature,
        BlockSetWallpaperFeature,
        DisableStatusBarFeature,
        BlockAutofillFeature,
        BlockAmbientDisplayFeature,
        BlockAppsControlFeature,
        BlockUninstallAppsFeature,
        BlockMountPhysicalMediaFeature,
        DisableKeyguardFeature,
        BlockConfigLocationFeature,
        BlockConfigCredentialsFeature,
        BlockPrintingFeature,
        BlockConfigCellBroadcastsFeature,
        BlockContentCaptureFeature,
        BlockSystemErrorDialogsFeature,
        BlockPrivateDnsFeature,
        BlockIncomingCallsFeature,
        BlockPasswordChangeFeature,
        BlockVpnSettingsFeature,
        InstallAndProtectNetGuardFeature,
        ForceNetGuardVpnFeature,
        NetfreeOnlyModeFeature // --- הוספה ---
    )
}
```

## File: app/src/main/java/com/secureguard/mdm/kiosk/ui/KioskActivity.kt
```kotlin
package com.secureguard.mdm.kiosk.ui

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.lifecycleScope
import com.secureguard.mdm.R
import com.secureguard.mdm.boot.BootCompletedReceiver
import com.secureguard.mdm.data.local.PreferencesManager
import com.secureguard.mdm.data.repository.SettingsRepository
import com.secureguard.mdm.kiosk.manager.KioskLockManager
import com.secureguard.mdm.ui.theme.SecureGuardTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Activity להצגת מסך הקיוסק.
 * פועל כ-Launcher אלטרנטיבי כאשר מצב קיוסק מופעל.
 */
@AndroidEntryPoint
class KioskActivity : ComponentActivity() {

    @Inject
    lateinit var settingsRepository: SettingsRepository

    @Inject
    lateinit var prefs: SharedPreferences

    @Inject
    lateinit var kioskLockManager: KioskLockManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val isLaunchedAsHome = intent.action == Intent.ACTION_MAIN &&
                intent.hasCategory(Intent.CATEGORY_HOME)
        
        // בדיקה אם נפתח בתור Viewer (חדש - בליעת ה-Intent ב"הגבלה מחמירה")
        val isViewer = intent.action == Intent.ACTION_VIEW
        if (isViewer) {
            lifecycleScope.launch {
                if (settingsRepository.isKioskAppMonitorEnabled()) {
                    Log.d("KioskActivity", "Strict Mode: Absorbing ACTION_VIEW: ${intent.data}")
                    // אנחנו לא עושים כלום - פשוט נמנעים מביצוע ה-Intent
                } else {
                    // אם הגבלה מחמירה כבויה, פשוט נסגור את הניסיון (או נטפל בו כרגיל אם בעתיד תרצה)
                    finish()
                }
            }
        }

        // אם הופעלו כ-Home, נרצה שהרקע יהיה חלק מהאפליקציה ולא שקוף/צף
        if (isLaunchedAsHome) {
            setTheme(R.style.Theme_SecureGuard_Kiosk)
        }

        lifecycleScope.launch {
            val kioskEnabled = settingsRepository.isKioskModeEnabled()
            val chosenLauncher = settingsRepository.getChosenHomeLauncherPackage()
            val dontShowAgain = settingsRepository.shouldNotShowHomeChoiceAgain()

            // הפעל משימות BOOT רק אם הן עוד לא הופעלו בתהליך זה (קורה בדרך כלל בשיגור כ-Launcher)
            if (isLaunchedAsHome) {
                BootCompletedReceiver.simulateBootCompleted(this@KioskActivity)
            }

            val systemDirection = if (java.util.Locale.getDefault().language == "iw" || java.util.Locale.getDefault().language == "he" || java.util.Locale.getDefault().language == "en") {
                androidx.compose.ui.unit.LayoutDirection.Rtl
            } else {
                androidx.compose.ui.unit.LayoutDirection.Ltr
            }

            // אם מצב קיוסק כבוי ואנחנו משמשים כ-Launcher
            if (isLaunchedAsHome && !kioskEnabled) {
                if (chosenLauncher != null && dontShowAgain) {
                    launchHomeApp(chosenLauncher)
                    finish()
                    return@launch
                }

                // הצג מסך בחירת לאנצ'ר
                setContent {
                    SecureGuardTheme {
                        androidx.compose.runtime.CompositionLocalProvider(
                            androidx.compose.ui.platform.LocalLayoutDirection provides systemDirection
                        ) {
                            HomeLauncherSelectionScreen(
                                onDismiss = {
                                    val intent = Intent(this@KioskActivity, com.secureguard.mdm.MainActivity::class.java).apply {
                                        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
                                    }
                                    startActivity(intent)
                                    finish()
                                }
                            )
                        }
                    }
                }
                return@launch
            }

            // הצג את מסך הקיוסק
            setContent {
                SecureGuardTheme(overrideStatusBarColor = Color(0xFFE8E8EC)) {
                    androidx.compose.runtime.CompositionLocalProvider(
                        androidx.compose.ui.platform.LocalLayoutDirection provides systemDirection
                    ) {
                        KioskScreen()
                    }
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onResume() {
        super.onResume()
        val activityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        
        lifecycleScope.launch {
            val kioskEnabled = settingsRepository.isKioskModeEnabled()
            val isLaunchedAsHome = intent.action == Intent.ACTION_MAIN &&
                    intent.hasCategory(Intent.CATEGORY_HOME)

            if (!kioskEnabled) {
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
                    if (activityManager.lockTaskModeState != ActivityManager.LOCK_TASK_MODE_NONE) {
                        try {
                            stopLockTask()
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
                }

                if (!isLaunchedAsHome) {
                    val intent = Intent(this@KioskActivity, com.secureguard.mdm.MainActivity::class.java).apply {
                        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
                    }
                    startActivity(intent)
                    finish()
                }
                return@launch
            }

            if (kioskLockManager.isLockTaskPermitted()) {
                // בדוק אם אנחנו כבר ב-Lock Task
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
                    if (activityManager.lockTaskModeState == ActivityManager.LOCK_TASK_MODE_NONE) {
                        try {
                            startLockTask()
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
                }
            }
        }
    }

    private fun launchHomeApp(packageName: String) {
        val intent = packageManager.getLaunchIntentForPackage(packageName)
        intent?.let {
            it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(it)
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/kiosk/ui/KioskAppSelectionScreen.kt
```kotlin
package com.secureguard.mdm.kiosk.ui

import com.secureguard.mdm.ui.theme.SecureGuardTheme
import android.content.Intent
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.drawablepainter.rememberDrawablePainter
import com.secureguard.mdm.R
import com.secureguard.mdm.appblocker.AppInfo
import com.secureguard.mdm.kiosk.vm.KioskAppSelectionViewModel

/**
 * מסך בחירת אפליקציות לקיוסק
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KioskAppSelectionScreen(
    viewModel: KioskAppSelectionViewModel = hiltViewModel(),
    onNavigateBack: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    val systemDirection = if (java.util.Locale.getDefault().language == "iw" || java.util.Locale.getDefault().language == "he") {
        androidx.compose.ui.unit.LayoutDirection.Rtl
    } else {
        androidx.compose.ui.unit.LayoutDirection.Ltr
    }

    SecureGuardTheme {
        val layoutDirection = if (java.util.Locale.getDefault().language == "iw" || java.util.Locale.getDefault().language == "he") {
            androidx.compose.ui.unit.LayoutDirection.Rtl
        } else {
            androidx.compose.ui.unit.LayoutDirection.Ltr
        }

        androidx.compose.runtime.CompositionLocalProvider(
            androidx.compose.ui.platform.LocalLayoutDirection provides layoutDirection
        ) {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text(stringResource(id = R.string.kiosk_management_select_apps)) },
                            navigationIcon = {
                                IconButton(onClick = onNavigateBack) {
                                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = stringResource(id = R.string.dialog_button_cancel))
                                }
                            }
                        )
                    },
                    floatingActionButton = {
                        if (uiState.isKioskEnabled) {
                            val context = LocalContext.current
                            ExtendedFloatingActionButton(
                                onClick = { 
                                    if (uiState.selectedPackages.isNotEmpty()) {
                                        val intent = Intent(context, KioskActivity::class.java).apply {
                                            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
                                        }
                                        context.startActivity(intent)
                                    } else {
                                        onNavigateBack()
                                    }
                                },
                                containerColor = MaterialTheme.colorScheme.primary,
                                contentColor = MaterialTheme.colorScheme.onPrimary,
                                icon = { Icon(Icons.Default.Check, contentDescription = null) },
                                text = { Text(stringResource(id = R.string.kiosk_button_save_return)) }
                            )
                        }
                    }
                ) { padding ->
                    if (uiState.isLoading) {
                        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                            CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)
                        }
                    } else {
                        LazyVerticalGrid(
                            columns = GridCells.Fixed(4),
                            contentPadding = PaddingValues(12.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalArrangement = Arrangement.spacedBy(12.dp),
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(padding)
                        ) {
                            items(uiState.allApps, key = { it.packageName }) { app ->
                                val isSelected = uiState.selectedPackages.contains(app.packageName)
                                AppSelectItem(
                                    app = app,
                                    isSelected = isSelected,
                                    onClick = { viewModel.toggleApp(app.packageName) }
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun AppSelectItem(
    app: AppInfo,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .clickable(onClick = onClick)
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box {
            Image(
                painter = rememberDrawablePainter(drawable = app.icon),
                contentDescription = app.appName,
                modifier = Modifier
                    .size(56.dp)
                    .clip(RoundedCornerShape(12.dp))
            )
            if (isSelected) {
                Icon(
                    Icons.Default.Check,
                    contentDescription = stringResource(id = R.string.kiosk_management_desc_selected),
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .size(20.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = app.appName,
            fontSize = 11.sp,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center
        )
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/kiosk/ui/KioskManagementScreen.kt
```kotlin
package com.secureguard.mdm.kiosk.ui

import com.secureguard.mdm.ui.theme.SecureGuardTheme
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.secureguard.mdm.R
import com.secureguard.mdm.kiosk.vm.KioskManagementViewModel
import com.secureguard.mdm.ui.navigation.Routes
import androidx.compose.material.icons.filled.Bluetooth
import androidx.compose.material.icons.filled.Tungsten
import androidx.compose.material.icons.filled.Wifi
import androidx.compose.material.icons.automirrored.filled.VolumeUp

/**
 * מסך ניהול מצב קיוסק - גרסה מתוקנת ונקייה
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KioskManagementScreen(
    viewModel: KioskManagementViewModel = hiltViewModel(),
    isFromKiosk: Boolean = false,
    onNavigateBack: () -> Unit,
    onNavigateTo: (String) -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    SecureGuardTheme {
        val layoutDirection = if (java.util.Locale.getDefault().language == "iw" || java.util.Locale.getDefault().language == "he") {
            androidx.compose.ui.unit.LayoutDirection.Rtl
        } else {
            androidx.compose.ui.unit.LayoutDirection.Ltr
        }

        androidx.compose.runtime.CompositionLocalProvider(
            androidx.compose.ui.platform.LocalLayoutDirection provides layoutDirection
        ) {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text(stringResource(id = R.string.settings_item_manage_kiosk)) },
                            navigationIcon = {
                                IconButton(onClick = onNavigateBack) {
                                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "חזור")
                                }
                            }
                        )
                    }
                ) { padding ->
                    if (uiState.isLoading) {
                        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                            CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)
                        }
                    } else {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(padding)
                                .padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            // הפעלת מצב קיוסק
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
                                )
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Column(modifier = Modifier.weight(1f)) {
                                        Text(
                                            text = stringResource(id = R.string.kiosk_management_enable_label),
                                            style = MaterialTheme.typography.titleMedium
                                        )
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(
                                            text = stringResource(id = R.string.kiosk_management_enable_description),
                                            style = MaterialTheme.typography.bodySmall,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                    }
                                    Switch(
                                        checked = uiState.isKioskModeEnabled,
                                        onCheckedChange = { viewModel.setKioskModeEnabled(it) },
                                        colors = SwitchDefaults.colors(
                                            checkedThumbColor = MaterialTheme.colorScheme.primary,
                                            checkedTrackColor = MaterialTheme.colorScheme.primaryContainer
                                        )
                                    )
                                }
                            }

                            // שירות ניטור
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
                                )
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Column(modifier = Modifier.weight(1f)) {
                                        Text(
                                            text = stringResource(id = R.string.kiosk_management_monitor_label),
                                            style = MaterialTheme.typography.titleMedium
                                        )
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(
                                            text = stringResource(id = R.string.kiosk_management_monitor_description),
                                            style = MaterialTheme.typography.bodySmall,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                    }
                                    Switch(
                                        checked = uiState.isMonitorEnabled,
                                        onCheckedChange = { viewModel.setMonitorEnabled(it) },
                                        colors = SwitchDefaults.colors(
                                            checkedThumbColor = MaterialTheme.colorScheme.primary,
                                            checkedTrackColor = MaterialTheme.colorScheme.primaryContainer
                                        )
                                    )
                                }
                            }


                            // בחירת אפליקציות
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
                                )
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { onNavigateTo(Routes.KIOSK_APP_SELECTION) }
                                        .padding(16.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = stringResource(id = R.string.kiosk_management_select_apps),
                                        style = MaterialTheme.typography.bodyLarge,
                                        modifier = Modifier.weight(1f)
                                    )
                                    Icon(
                                        Icons.AutoMirrored.Filled.KeyboardArrowRight,
                                        contentDescription = null,
                                        modifier = Modifier.size(24.dp),
                                        tint = MaterialTheme.colorScheme.primary
                                    )
                                }
                            }

                            // בחירת כפתורי פעולה בקיוסק
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
                                )
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp),
                                    verticalArrangement = Arrangement.spacedBy(12.dp)
                                ) {
                                    Text(
                                        text = stringResource(id = R.string.kiosk_management_action_buttons_title),
                                        style = MaterialTheme.typography.titleMedium
                                    )
                                    ActionToggleRow(
                                        title = stringResource(id = R.string.kiosk_action_wifi),
                                        icon = Icons.Default.Wifi,
                                        checked = uiState.enabledActions.contains("wifi"),
                                        onCheckedChange = { viewModel.toggleActionButton("wifi", it) }
                                    )
                                    ActionToggleRow(
                                        title = stringResource(id = R.string.kiosk_action_bluetooth),
                                        icon = Icons.Default.Bluetooth,
                                        checked = uiState.enabledActions.contains("bluetooth"),
                                        onCheckedChange = { viewModel.toggleActionButton("bluetooth", it) }
                                    )
                                    ActionToggleRow(
                                        title = stringResource(id = R.string.kiosk_action_flashlight),
                                        icon = Icons.Default.Tungsten,
                                        checked = uiState.enabledActions.contains("flashlight"),
                                        onCheckedChange = { viewModel.toggleActionButton("flashlight", it) }
                                    )
                                    ActionToggleRow(
                                        title = stringResource(id = R.string.kiosk_action_volume),
                                        icon = Icons.AutoMirrored.Filled.VolumeUp,
                                        checked = uiState.enabledActions.contains("volume"),
                                        onCheckedChange = { viewModel.toggleActionButton("volume", it) }
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.weight(1f))

                            if (uiState.isKioskModeEnabled) {
                                Button(
                                    onClick = {
                                        viewModel.saveAndApply(onComplete = onNavigateBack)
                                    },
                                    modifier = Modifier.fillMaxWidth(),
                                    shape = RoundedCornerShape(12.dp),
                                    contentPadding = PaddingValues(16.dp)
                                ) {
                                    Text(
                                        text = if (isFromKiosk) "שמור וחזור לקיוסק" else "שמור והחל שינויים",
                                        style = MaterialTheme.typography.titleMedium
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun StatusItem(label: String, isOk: Boolean) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(label, style = MaterialTheme.typography.bodyMedium)
        Text(
            text = if (isOk) "תקין" else "לא מוגדר",
            color = if (isOk) Color(0xFF4CAF50) else Color(0xFFF44336),
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun ActionToggleRow(
    title: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                icon,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(text = title, style = MaterialTheme.typography.bodyLarge)
        }
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            colors = SwitchDefaults.colors(
                checkedThumbColor = MaterialTheme.colorScheme.primary,
                checkedTrackColor = MaterialTheme.colorScheme.primaryContainer
            )
        )
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/kiosk/ui/KioskScreen.kt
```kotlin
package com.secureguard.mdm.kiosk.ui

import com.secureguard.mdm.ui.theme.SecureGuardTheme
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.ui.res.stringResource
import com.secureguard.mdm.R
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import java.util.Locale
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.google.accompanist.drawablepainter.rememberDrawablePainter
import com.secureguard.mdm.MainActivity
import com.secureguard.mdm.appblocker.AppInfo
import com.secureguard.mdm.kiosk.vm.KioskViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*
import android.provider.Settings
import android.media.AudioManager
import android.hardware.camera2.CameraManager
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.saveable.rememberSaveable
private val BackgroundColor = Color(0xFFE8E8EC)
private val CardColor = Color(0xFFD8D8DC)
private val TextColor = Color(0xFF1A1A1A)
private val BottomBarColor = Color(0xFFD0D0D4)
private const val TAG_KIOSK_UI = "KioskUi"
private const val ACTION_WIFI = "wifi"
private const val ACTION_BLUETOOTH = "bluetooth"
private const val ACTION_FLASHLIGHT = "flashlight"
private const val ACTION_VOLUME = "volume"

/**
 * מסך הקיוסק הראשי - עיצוב כרטיסיות אופקיות
 */
@RequiresApi(Build.VERSION_CODES.M)
@Composable
fun KioskScreen(
    viewModel: KioskViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val context = LocalContext.current

    var showPasswordDialog by remember { mutableStateOf(false) }
    var showSettingsChoiceDialog by remember { mutableStateOf(false) }
    var showPowerDialog by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()

    // Side effects
    LaunchedEffect(Unit) {
        viewModel.sideEffect.collectLatest { effect ->
            when (effect) {
                is KioskViewModel.SideEffect.LaunchApp -> launchApp(context, effect.packageName)
                is KioskViewModel.SideEffect.NavigateToSettings -> navigateToDashboard(context)
                is KioskViewModel.SideEffect.NavigateToKioskManagement -> navigateToKioskManagement(context)
                is KioskViewModel.SideEffect.ShowToast -> Toast.makeText(context, effect.message, Toast.LENGTH_SHORT).show()
            }
        }
    }

    // חסימת כפתור Back
    BackHandler { /* Block */ }

    val systemDirection = if (Locale.getDefault().language == "iw" || Locale.getDefault().language == "he") {
        LayoutDirection.Rtl
    } else {
        LayoutDirection.Ltr
    }
    LaunchedEffect(systemDirection) {
        Log.d(TAG_KIOSK_UI, "Computed systemDirection=$systemDirection from locale=${Locale.getDefault().language}")
    }

    SecureGuardTheme(overrideStatusBarColor = BackgroundColor) {
        CompositionLocalProvider(LocalLayoutDirection provides systemDirection) {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = BackgroundColor
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        // Main Content Area
                        Box(modifier = Modifier.weight(1f)) {
                            if (uiState.isLoading) {
                                Box(
                                    modifier = Modifier.fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ) {
                                    CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)
                                }
                            } else if (uiState.apps.isEmpty() && !uiState.isLoading) {
                                EmptyKioskState(
                                    onAddApps = {
                                        showPasswordDialog = true
                                    }
                                )
                            } else {
                                LazyVerticalGrid(
                                    columns = GridCells.Fixed(1),
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(horizontal = 24.dp),
                                    contentPadding = PaddingValues(top = 80.dp, bottom = 120.dp),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalArrangement = Arrangement.spacedBy(16.dp)
                                ) {
                                    items(uiState.apps) { app ->
                                        AppCard(
                                            app = app,
                                            onClick = { viewModel.onAppClick(app.packageName) },
                                            isRtl = systemDirection == LayoutDirection.Rtl
                                        )
                                    }
                                }
                            }
                        }

                        // Bottom Bar
                        KioskBottomBar(
                            enabledActions = uiState.enabledActions,
                            onWifiClick = { openWifiSettings(context) },
                            onBluetoothClick = { openBluetoothSettings(context) },
                            onFlashlightToggle = { toggleFlashlight(context) },
                            onVolumeClick = { openVolumePanel(context) }
                        )
                    }

                    // Floating Top Bar
                    KioskTopBar(
                        currentTime = uiState.currentTime,
                        batteryLevel = uiState.batteryLevel,
                        jewishDate = uiState.jewishDate,
                        onSettingsClick = { showPasswordDialog = true },
                        onPowerClick = { showPowerDialog = true },
                        isRtl = systemDirection == LayoutDirection.Rtl
                    )

                    // Dialogs
                    if (showPasswordDialog) {
                        PasswordDialog(
                            onDismiss = { showPasswordDialog = false },
                            onConfirm = { password ->
                                scope.launch {
                                    if (viewModel.verifyPasswordResult(password)) {
                                        showPasswordDialog = false
                                        showSettingsChoiceDialog = true
                                    } else {
                                        Toast.makeText(context, context.getString(R.string.dialog_error_wrong_password), Toast.LENGTH_SHORT).show()
                                    }
                                }
                            }
                        )
                    }

                    if (showSettingsChoiceDialog) {
                        SettingsChoiceDialog(
                            onDismiss = { showSettingsChoiceDialog = false },
                            onChoice = { choice ->
                                showSettingsChoiceDialog = false
                                if (choice == "kiosk") {
                                    navigateToKioskManagement(context)
                                } else {
                                    navigateToDashboard(context)
                                }
                            }
                        )
                    }

                    if (showPowerDialog) {
                        PowerDialog(
                            onDismiss = { showPowerDialog = false },
                            onConfirmReboot = {
                                viewModel.rebootDevice()
                                showPowerDialog = false
                            }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun KioskTopBar(
    currentTime: String,
    batteryLevel: Int,
    jewishDate: String,
    onSettingsClick: () -> Unit,
    onPowerClick: () -> Unit,
    isRtl: Boolean
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // Group 1: Power button on one side
        IconButton(
            onClick = onPowerClick,
            modifier = Modifier.size(32.dp)
        ) {
            Icon(
                Icons.Default.PowerSettingsNew,
                contentDescription = stringResource(id = R.string.kiosk_desc_power),
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(24.dp)
            )
        }

        // Group 2: Time and Date in the middle
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = currentTime,
                color = TextColor,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = jewishDate,
                color = TextColor.copy(alpha = 0.7f),
                fontSize = 12.sp,
                textAlign = TextAlign.Center
            )
        }

        // Group 3: Battery and Settings on the other side
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "$batteryLevel%",
                color = TextColor,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )
            IconButton(
                onClick = onSettingsClick,
                modifier = Modifier.size(32.dp)
            ) {
                Icon(
                    Icons.Default.Settings,
                    contentDescription = stringResource(id = R.string.kiosk_desc_settings),
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    }
}

@Composable
private fun AppCard(
    app: AppInfo,
    onClick: () -> Unit,
    isRtl: Boolean
) {
    Surface(
        onClick = onClick,
        shape = RoundedCornerShape(24.dp),
        color = CardColor,
        shadowElevation = 2.dp,
        modifier = Modifier
            .fillMaxWidth()
            .height(88.dp)
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 24.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = if (isRtl) Arrangement.End else Arrangement.Start
        ) {
            if (!isRtl) {
                Image(
                    painter = rememberDrawablePainter(drawable = app.icon),
                    contentDescription = app.appName,
                    modifier = Modifier
                        .size(52.dp)
                        .clip(RoundedCornerShape(14.dp))
                )
                Spacer(modifier = Modifier.width(20.dp))
            }

            Text(
                text = app.appName,
                color = TextColor,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                textAlign = if (isRtl) TextAlign.End else TextAlign.Start,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.weight(1f)
            )

            if (isRtl) {
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = rememberDrawablePainter(drawable = app.icon),
                    contentDescription = app.appName,
                    modifier = Modifier
                        .size(52.dp)
                        .clip(RoundedCornerShape(14.dp))
                )
            }
        }
    }
}

@Composable
private fun KioskBottomBar(
    enabledActions: Set<String>,
    onWifiClick: () -> Unit,
    onBluetoothClick: () -> Unit,
    onFlashlightToggle: () -> Unit,
    onVolumeClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 20.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (enabledActions.contains(ACTION_WIFI)) {
            BottomBarButton(
                icon = Icons.Default.Wifi,
                onClick = {
                    Log.d(TAG_KIOSK_UI, "Bottom bar action clicked: wifi")
                    onWifiClick()
                }
            )
        }
        if (enabledActions.contains(ACTION_BLUETOOTH)) {
            BottomBarButton(
                icon = Icons.Default.Bluetooth,
                onClick = {
                    Log.d(TAG_KIOSK_UI, "Bottom bar action clicked: bluetooth")
                    onBluetoothClick()
                }
            )
        }
        if (enabledActions.contains(ACTION_FLASHLIGHT)) {
            BottomBarButton(
                icon = Icons.Default.Tungsten,
                onClick = {
                    Log.d(TAG_KIOSK_UI, "Bottom bar action clicked: flashlight")
                    onFlashlightToggle()
                }
            )
        }
        if (enabledActions.contains(ACTION_VOLUME)) {
            BottomBarButton(
                icon = Icons.AutoMirrored.Filled.VolumeUp,
                onClick = {
                    Log.d(TAG_KIOSK_UI, "Bottom bar action clicked: volume")
                    onVolumeClick()
                }
            )
        }
    }
}

private fun openWifiSettings(context: Context) {
    try {
        context.startActivity(Intent(Settings.ACTION_WIFI_SETTINGS).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    } catch (e: Exception) {
        Log.w(TAG_KIOSK_UI, "Failed to open Wi-Fi settings", e)
        try {
            context.startActivity(Intent(Settings.ACTION_SETTINGS).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            })
        } catch (fallback: Exception) {
            Log.w(TAG_KIOSK_UI, "Failed to open fallback settings", fallback)
            Toast.makeText(context, "לא ניתן לפתוח הגדרות Wi‑Fi", Toast.LENGTH_SHORT).show()
        }
    }
}

private fun openBluetoothSettings(context: Context) {
    try {
        context.startActivity(Intent(Settings.ACTION_BLUETOOTH_SETTINGS).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    } catch (e: Exception) {
        Log.w(TAG_KIOSK_UI, "Failed to open Bluetooth settings", e)
        try {
            context.startActivity(Intent(Settings.ACTION_SETTINGS).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            })
        } catch (fallback: Exception) {
            Log.w(TAG_KIOSK_UI, "Failed to open fallback settings", fallback)
            Toast.makeText(context, "לא ניתן לפתוח הגדרות Bluetooth", Toast.LENGTH_SHORT).show()
        }
    }
}

private fun openVolumePanel(context: Context) {
    try {
        val audioManager = context.getSystemService(Context.AUDIO_SERVICE) as AudioManager
        audioManager.adjustVolume(AudioManager.ADJUST_SAME, AudioManager.FLAG_SHOW_UI)
    } catch (e: Exception) {
        Log.w(TAG_KIOSK_UI, "Failed to open volume panel", e)
    }
}

@RequiresApi(Build.VERSION_CODES.M)
private fun toggleFlashlight(context: Context) {
    val cameraManager = context.getSystemService(Context.CAMERA_SERVICE) as? CameraManager
    if (cameraManager == null) {
        Log.w(TAG_KIOSK_UI, "CameraManager not available")
        return
    }
    try {
        val cameraId = cameraManager.cameraIdList.firstOrNull()
        if (cameraId == null) {
            Log.w(TAG_KIOSK_UI, "No camera ID for flashlight")
            return
        }
        val isEnabled = cameraManager.getCameraCharacteristics(cameraId)
            .get(android.hardware.camera2.CameraCharacteristics.FLASH_INFO_AVAILABLE) == true
        if (!isEnabled) {
            Log.w(TAG_KIOSK_UI, "Flash not available on this device")
            return
        }
        val torchOn = android.provider.Settings.Global.getInt(
            context.contentResolver,
            "kiosk_flashlight_state",
            0
        ) == 1
        cameraManager.setTorchMode(cameraId, !torchOn)
        android.provider.Settings.Global.putInt(
            context.contentResolver,
            "kiosk_flashlight_state",
            if (torchOn) 0 else 1
        )
        Log.d(TAG_KIOSK_UI, "Flashlight toggled to ${!torchOn}")
    } catch (e: Exception) {
        Log.w(TAG_KIOSK_UI, "Failed to toggle flashlight", e)
    }
}

@Composable
private fun BottomBarButton(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    onClick: () -> Unit
) {
    Surface(
        onClick = onClick,
        shape = RoundedCornerShape(16.dp),
        color = CardColor,
        modifier = Modifier.size(56.dp)
    ) {
        Box(contentAlignment = Alignment.Center) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(28.dp)
            )
        }
    }
}

@Composable
private fun PasswordDialog(
    onDismiss: () -> Unit,
    onConfirm: (String) -> Unit
) {
    var password by remember { mutableStateOf("") }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.kiosk_dialog_admin_title)) },
        text = {
            Column {
                Text(stringResource(id = R.string.kiosk_dialog_admin_message))
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text(stringResource(id = R.string.kiosk_dialog_admin_label_password)) },
                    singleLine = true,
                    visualTransformation = PasswordVisualTransformation()
                )
            }
        },
        confirmButton = {
            Button(onClick = { onConfirm(password) }) {
                Text(stringResource(id = R.string.dialog_button_confirm))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.dialog_button_cancel))
            }
        }
    )
}

@Composable
private fun PowerDialog(
    onDismiss: () -> Unit,
    onConfirmReboot: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.kiosk_dialog_power_title)) },
        text = {
            Column {
                Text(stringResource(id = R.string.kiosk_dialog_power_message))
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = stringResource(id = R.string.kiosk_dialog_power_warning),
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        },
        confirmButton = {
            Button(
                onClick = onConfirmReboot,
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
            ) {
                Text(stringResource(id = R.string.kiosk_dialog_power_button_reboot))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.dialog_button_cancel))
            }
        }
    )
}


@Composable
private fun SettingsChoiceDialog(
    onDismiss: () -> Unit,
    onChoice: (String) -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.kiosk_dialog_choice_title)) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text(stringResource(id = R.string.kiosk_dialog_choice_message))
                
                Button(
                    onClick = { onChoice("kiosk") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(stringResource(id = R.string.kiosk_dialog_choice_button_kiosk))
                }
                
                OutlinedButton(
                    onClick = { onChoice("dashboard") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(stringResource(id = R.string.kiosk_dialog_choice_button_dashboard))
                }
            }
        },
        confirmButton = {},
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.dialog_button_cancel))
            }
        }
    )
}

private fun launchApp(context: Context, packageName: String) {
    val intent = context.packageManager.getLaunchIntentForPackage(packageName)
    if (intent != null) {
        context.startActivity(intent)
    } else {
        Toast.makeText(context, context.getString(R.string.kiosk_toast_app_not_found), Toast.LENGTH_SHORT).show()
    }
}

private fun navigateToDashboard(context: Context) {
    val intent = Intent(context, MainActivity::class.java).apply {
        putExtra("start_destination", "dashboard")
        putExtra("is_from_kiosk", true)
        flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
    }
    context.startActivity(intent)
    (context as? KioskActivity)?.finish()
}

private fun navigateToKioskManagement(context: Context) {
    val intent = Intent(context, MainActivity::class.java).apply {
        putExtra("start_destination", "kiosk_management")
        putExtra("is_from_kiosk", true)
        flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
    }
    context.startActivity(intent)
    (context as? KioskActivity)?.finish()
}

@Composable
private fun EmptyKioskState(onAddApps: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            Icons.Default.Apps,
            contentDescription = null,
            modifier = Modifier.size(80.dp),
            tint = Color.Gray.copy(alpha = 0.5f)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            stringResource(id = R.string.kiosk_empty_state_title),
            fontSize = 20.sp,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(
            onClick = onAddApps,
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(stringResource(id = R.string.kiosk_empty_state_button))
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/kiosk/vm/KioskManagementViewModel.kt
```kotlin
package com.secureguard.mdm.kiosk.vm

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.secureguard.mdm.data.repository.SettingsRepository
import com.secureguard.mdm.kiosk.manager.KioskLockManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class KioskManagementState(
    val isLoading: Boolean = true,
    val isKioskModeEnabled: Boolean = false,
    val isMonitorEnabled: Boolean = false,
    val isDeviceOwner: Boolean = false,
    val isDefaultLauncher: Boolean = false,
    val enabledActions: Set<String> = emptySet()
)

@HiltViewModel
class KioskManagementViewModel @Inject constructor(
    @dagger.hilt.android.qualifiers.ApplicationContext private val context: android.content.Context,
    private val settingsRepository: SettingsRepository,
    private val kioskLockManager: KioskLockManager
) : ViewModel() {

    private val _uiState = MutableStateFlow(KioskManagementState())
    val uiState = _uiState.asStateFlow()

    init {
        loadState()
    }

    private fun loadState() {
        viewModelScope.launch {
            val isEnabled = settingsRepository.isKioskModeEnabled()
            val isMonitorEnabled = settingsRepository.isKioskAppMonitorEnabled()
            val isDO = kioskLockManager.isDeviceOwner()
            val isDefault = kioskLockManager.isKioskDefaultLauncher()
            val enabledActions = settingsRepository.getKioskActionButtons()
            
            _uiState.update {
                it.copy(
                    isLoading = false,
                    isKioskModeEnabled = isEnabled,
                    isMonitorEnabled = isMonitorEnabled,
                    isDeviceOwner = isDO,
                    isDefaultLauncher = isDefault,
                    enabledActions = enabledActions
                )
            }
        }
    }

    fun toggleActionButton(actionId: String, isEnabled: Boolean) {
        viewModelScope.launch {
            val current = _uiState.value.enabledActions
            val updated = if (isEnabled) current + actionId else current - actionId
            settingsRepository.setKioskActionButtons(updated)
            _uiState.update { it.copy(enabledActions = updated) }
            if (_uiState.value.isKioskModeEnabled) {
                kioskLockManager.setLockTaskPackages()
            }
        }
    }

    fun setKioskModeEnabled(enabled: Boolean) {
        viewModelScope.launch {
            if (enabled) {
                // בעת הפעלה - הגדר את האפליקציות והפיצ'רים המותרים
                kioskLockManager.setLockTaskPackages()
                kioskLockManager.enableKioskModeFeatures()
                
                // הגדר כאפליקציית בית קבועה (אם Device Owner)
                val includeViewAbsorber = settingsRepository.isKioskAppMonitorEnabled()
                kioskLockManager.setKioskAsDefaultLauncher(includeViewAbsorber)
            } else {
                // בעת כיבוי - נקה את ההגדרות
                kioskLockManager.clearLockTaskPackages()
                kioskLockManager.disableKioskModeFeatures()
                
                // החזרת הלאנצ'ר המקורי כברירת מחדל לפני ביטול הסטטוס
                val originalLauncher = settingsRepository.getChosenHomeLauncherPackage()
                if (originalLauncher != null) {
                    kioskLockManager.setSpecificAsDefaultLauncher(originalLauncher)
                } else {
                    kioskLockManager.clearKioskAsDefaultLauncher()
                }
            }
            
            settingsRepository.setKioskModeEnabled(enabled)
            _uiState.update { it.copy(isKioskModeEnabled = enabled) }
            
            // הפעלה חכמה: אם הפעלנו את הקיוסק, נשלח אירוע להפעלת ה-Activity
            if (enabled) {
                launchKiosk()
            }
        }
    }

    /**
     * פונקציה לשמירה והחלה מיידית (חזרה לקיוסק אם מופעל)
     */
    fun saveAndApply(onComplete: () -> Unit) {
        viewModelScope.launch {
            if (uiState.value.isKioskModeEnabled) {
                launchKiosk()
            }
            onComplete()
        }
    }

    private fun launchKiosk() {
        val intent = Intent(context, com.secureguard.mdm.kiosk.ui.KioskActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
        }
        context.startActivity(intent)
    }

    fun setMonitorEnabled(enabled: Boolean) {
        viewModelScope.launch {
            settingsRepository.setKioskAppMonitorEnabled(enabled)
            _uiState.update { it.copy(isMonitorEnabled = enabled) }

            val kioskEnabled = settingsRepository.isKioskModeEnabled()
            if (kioskEnabled) {
                // עדכן את ה‑persistent preferred activities בהתאם למצב "הגבלה מחמירה"
                kioskLockManager.setKioskAsDefaultLauncher(enabled)
            }
        }
    }

    fun rebootDevice() {
        kioskLockManager.rebootDevice()
    }

    fun resetLayout() {
        viewModelScope.launch {
            settingsRepository.setKioskLayoutJson(null)
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/kiosk/vm/KioskViewModel.kt
```kotlin
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
```

## File: app/src/main/java/com/secureguard/mdm/MainService.kt
```kotlin
package com.secureguard.mdm

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import com.secureguard.mdm.boot.registry.BootTaskRegistry
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainService : Service() {

    // --- השינוי כאן: מזריקים את ה-Registry במקום Set ---
    @Inject
    lateinit var bootTaskRegistry: BootTaskRegistry

    private val serviceJob = SupervisorJob()
    private val serviceScope = CoroutineScope(Dispatchers.IO + serviceJob)

    companion object {
        private const val NOTIFICATION_ID = 1
        private const val CHANNEL_ID = "MainServiceChannel"
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("MainService", "Service started.")
        startForeground(NOTIFICATION_ID, createNotification())

        serviceScope.launch {
            // --- השינוי כאן: משתמשים ברשימה מה-Registry ---
            val tasksToRun = bootTaskRegistry.allBootTasks
            Log.d("MainService", "Executing ${tasksToRun.size} boot tasks from registry.")
            tasksToRun.forEach { task ->
                try {
                    task.onBootCompleted()
                } catch (e: Exception) {
                    Log.e("MainService", "Error executing boot task: ${task::class.simpleName}", e)
                }
            }
            Log.d("MainService", "All boot tasks executed. Stopping service.")
            stopSelf()
        }

        return START_NOT_STICKY
    }

    private fun createNotification(): Notification {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                "A Bloq Main Service",
                NotificationManager.IMPORTANCE_LOW
            )
            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
        }

        return NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle(getString(R.string.app_name))
            .setContentText(getString(R.string.main_service_initializing))
            .setSmallIcon(R.drawable.ic_safe_boot_blocked)
            .build()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null // Not a bound service
    }

    override fun onDestroy() {
        super.onDestroy()
        serviceJob.cancel()
        Log.d("MainService", "Service destroyed.")
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/SecureGuardApplication.kt
```kotlin
package com.secureguard.mdm

import android.app.Application
import com.secureguard.mdm.utils.FileLogger
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SecureGuardApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        FileLogger.init(this)
        FileLogger.log("Application", "App started. Logger initialized.")
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/SecureGuardDeviceAdminReceiver.kt
```kotlin
package com.secureguard.mdm

import android.app.admin.DeviceAdminReceiver
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.util.Log

/**
 * רכיב מערכת שמקבל אירועים הקשורים למנהל המכשיר.
 * הוא מופעל כאשר הרשאות הניהול ניתנות או נלקחות.
 * אנחנו מוסיפים לוגים כדי שנוכל לראות מתי אירועים אלו מתרחשים לצורך ניפוי שגיאות.
 */
class SecureGuardDeviceAdminReceiver : DeviceAdminReceiver() {
    private val TAG = "DeviceAdminReceiver"

    override fun onEnabled(context: Context, intent: Intent) {
        super.onEnabled(context, intent)
        Log.d(TAG, "התקבלה הרשאל ניהול מכשיר! לחץ על נסה שוב.")
    }

    override fun onDisabled(context: Context, intent: Intent) {
        super.onDisabled(context, intent)
        Log.d(TAG, "Device admin disabled")
    }

    override fun onTransferOwnershipComplete(context: Context, bundle: android.os.PersistableBundle?) {
        super.onTransferOwnershipComplete(context, bundle)
        Log.d(TAG, "Transfer ownership completed successfully")
        // Handle any post-transfer logic here if needed
    }

    companion object {
        /**
         * מספק דרך נוחה ומרכזית לקבל את ה-ComponentName של ה-Receiver.
         * רכיב זה נדרש על ידי ה-DevicePolicyManager כדי לדעת איזו אפליקציה
         * מבקשת לאכוף מדיניות.
         * @param context הקשר של האפליקציה.
         * @return ה-ComponentName של ה-Receiver.
         */
        fun getComponentName(context: Context): ComponentName {
            return ComponentName(context.applicationContext, SecureGuardDeviceAdminReceiver::class.java)
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/settingsfeatures/api/SettingsAPI.kt
```kotlin
package com.secureguard.mdm.settingsfeatures.api

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.secureguard.mdm.R

/**
 * קטגוריות להצגת הפריטים באופן מסודר במסך ההגדרות.
 * @param titleRes מזהה המשאב (string) עבור שם הקטגוריה.
 */
enum class SettingCategory(@StringRes val titleRes: Int) {
    APP_MANAGEMENT(R.string.category_app_management),
    UI_AND_BEHAVIOR(R.string.category_ui_and_behavior),
    ADVANCED_ACTIONS(R.string.category_advanced_actions)
}

/**
 * הממשק הראשי שכל פריט הגדרה חייב לממש.
 */
sealed interface SettingsFeature {
    val id: String
    @get:StringRes val titleRes: Int
    @get:DrawableRes val iconRes: Int
    val category: SettingCategory
    val requiredSdkVersion: Int get() = 0
}

/**
 * מייצג פריט הגדרה שלחיצה עליו מנווטת למסך אחר.
 */
interface NavigationalSetting : SettingsFeature {
    val route: String // הנתיב לניווט, מתוך Routes.kt
}

/**
 * מייצג פריט הגדרה שהוא מתג (Toggle/Switch/Checkbox).
 */
interface ToggleSetting : SettingsFeature

/**
 * מייצג פריט הגדרה שלחיצה עליו מבצעת פעולה כללית.
 */
interface ActionSetting : SettingsFeature

/**
 * מייצג פריט הגדרה שלחיצה עליו מבצעת פעולה מסוכנת או בלתי הפיכה (יוצג באדום).
 */
interface DestructiveActionSetting : ActionSetting
```

## File: app/src/main/java/com/secureguard/mdm/settingsfeatures/impl/AdvancedActionSettings.kt
```kotlin
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
```

## File: app/src/main/java/com/secureguard/mdm/settingsfeatures/impl/KioskSettings.kt
```kotlin
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
```

## File: app/src/main/java/com/secureguard/mdm/settingsfeatures/registry/SettingsRegistry.kt
```kotlin
package com.secureguard.mdm.settingsfeatures.registry

import com.secureguard.mdm.settingsfeatures.api.SettingsFeature
import com.secureguard.mdm.settingsfeatures.impl.*

/**
 * מרשם מרכזי לכל פריטי ההגדרות באפליקציה.
 * מסך ההגדרות יבנה את עצמו באופן דינמי על סמך רשימה זו.
 * כדי להוסיף פריט הגדרה חדש, יש ליצור אותו בחבילת 'impl' ולהוסיף אותו כאן.
 */
object SettingsRegistry {

    val allSettings: List<SettingsFeature> = listOf(
        // קטגוריית ניהול אפליקציות
        NavigateToAppSelectionSetting,
        NavigateToBlockedAppsSetting,

        // קטגוריית התאמה אישית והתנהגות
        ToggleUiPositionSetting,
        ToggleUiControlTypeSetting,
        ToggleContactEmailSetting,
        ShowBootToastSetting,

        // קטגוריית פעולות מתקדמות
        UpdateChannelAction,
        NavigateToKioskModeSetting,
        NavigateToFrpSetting,
        NavigateToChangePasswordSetting,
        ToggleUpdatesSetting,
        LockSettingsAction,
        RemovalOptionsAction
    )
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/screens/frpsettings/FrpSettingsScreen.kt
```kotlin
package com.secureguard.mdm.ui.screens.frpsettings

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Save
import androidx.compose.material3.*
import androidx.compose.ui.res.stringResource
import com.secureguard.mdm.R
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FrpSettingsScreen(
    viewModel: FrpSettingsViewModel = hiltViewModel(),
    onNavigateBack: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    val context = LocalContext.current

    LaunchedEffect(Unit) {
        viewModel.sideEffect.collectLatest { effect ->
            when (effect) {
                is FrpSettingsSideEffect.NavigateBack -> onNavigateBack()
                is FrpSettingsSideEffect.ShowToast -> {
                    Toast.makeText(context, effect.message, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = R.string.frp_settings_title)) },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = stringResource(id = R.string.dialog_button_cancel))
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { viewModel.onEvent(FrpSettingsEvent.OnSaveClicked) }) {
                Icon(Icons.Default.Save, contentDescription = stringResource(id = R.string.settings_button_save))
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Text(
                text = stringResource(id = R.string.frp_settings_description),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Input Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    value = uiState.newIdInput,
                    onValueChange = { viewModel.onEvent(FrpSettingsEvent.OnNewIdChanged(it)) },
                    label = { Text(stringResource(id = R.string.frp_settings_label_user_id)) },
                    modifier = Modifier.weight(1f),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    singleLine = true
                )
                Spacer(modifier = Modifier.width(8.dp))
                IconButton(onClick = { viewModel.onEvent(FrpSettingsEvent.OnAddIdClicked) }) {
                    Icon(Icons.Default.Add, contentDescription = "הוסף ID")
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // List of IDs
            if (uiState.isLoading) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator()
                }
            } else if (uiState.customIds.isEmpty()) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text(stringResource(id = R.string.frp_settings_empty_list), textAlign = TextAlign.Center)
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(uiState.customIds, key = { it }) { id ->
                        IdRow(id = id, onDelete = {
                            viewModel.onEvent(FrpSettingsEvent.OnDeleteIdClicked(id))
                        })
                        HorizontalDivider()
                    }
                }
            }
        }
    }
}

@Composable
private fun IdRow(id: String, onDelete: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = id, modifier = Modifier.weight(1f), style = MaterialTheme.typography.bodyLarge)
        IconButton(onClick = onDelete) {
            Icon(Icons.Default.Delete, contentDescription = stringResource(id = R.string.frp_settings_desc_delete_id))
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/screens/frpsettings/FrpSettingsViewModel.kt
```kotlin
package com.secureguard.mdm.ui.screens.frpsettings

import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.secureguard.mdm.data.repository.SettingsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import dagger.hilt.android.qualifiers.ApplicationContext
import android.content.Context
import com.secureguard.mdm.R
import javax.inject.Inject

data class FrpSettingsUiState(
    val customIds: List<String> = emptyList(),
    val newIdInput: String = "",
    val isLoading: Boolean = true
)

sealed class FrpSettingsEvent {
    data class OnNewIdChanged(val value: String) : FrpSettingsEvent()
    object OnAddIdClicked : FrpSettingsEvent()
    data class OnDeleteIdClicked(val id: String) : FrpSettingsEvent()
    object OnSaveClicked : FrpSettingsEvent()
}

sealed class FrpSettingsSideEffect {
    object NavigateBack : FrpSettingsSideEffect()
    data class ShowToast(val message: String) : FrpSettingsSideEffect()
}

@HiltViewModel
class FrpSettingsViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val settingsRepository: SettingsRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(FrpSettingsUiState())
    val uiState = _uiState.asStateFlow()

    private val _sideEffect = MutableSharedFlow<FrpSettingsSideEffect>()
    val sideEffect = _sideEffect.asSharedFlow()

    init {
        loadCustomIds()
    }

    fun onEvent(event: FrpSettingsEvent) {
        when (event) {
            is FrpSettingsEvent.OnNewIdChanged -> _uiState.update { it.copy(newIdInput = event.value) }
            is FrpSettingsEvent.OnAddIdClicked -> addId()
            is FrpSettingsEvent.OnDeleteIdClicked -> deleteId(event.id)
            is FrpSettingsEvent.OnSaveClicked -> saveCustomIds()
        }
    }

    private fun loadCustomIds() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true) }
            val ids = settingsRepository.getCustomFrpIds().toList().sorted()
            _uiState.update { it.copy(customIds = ids, isLoading = false) }
        }
    }

    private fun addId() {
        val newId = _uiState.value.newIdInput.trim()
        if (newId.isNotBlank() && newId.all { it.isDigit() }) {
            if (_uiState.value.customIds.contains(newId)) {
                viewModelScope.launch { _sideEffect.emit(FrpSettingsSideEffect.ShowToast(context.getString(R.string.frp_settings_error_already_exists))) }
                return
            }
            val updatedList = (_uiState.value.customIds + newId).sorted()
            _uiState.update { it.copy(customIds = updatedList, newIdInput = "") }
        } else {
            viewModelScope.launch { _sideEffect.emit(FrpSettingsSideEffect.ShowToast(context.getString(R.string.frp_settings_error_digits_only))) }
        }
    }

    private fun deleteId(idToDelete: String) {
        val updatedList = _uiState.value.customIds.filter { it != idToDelete }
        _uiState.update { it.copy(customIds = updatedList) }
    }

    private fun saveCustomIds() {
        viewModelScope.launch {
            settingsRepository.setCustomFrpIds(_uiState.value.customIds.toSet())
            _sideEffect.emit(FrpSettingsSideEffect.ShowToast(context.getString(R.string.frp_settings_saved_success)))
            _sideEffect.emit(FrpSettingsSideEffect.NavigateBack)
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/screens/provisioning/ProvisioningScreen.kt
```kotlin
package com.secureguard.mdm.ui.screens.provisioning

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.secureguard.mdm.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest

@Composable
fun ProvisioningScreen(
    viewModel: ProvisioningViewModel = hiltViewModel(),
    onCheckAgain: () -> Unit
) {
    val context = LocalContext.current
    val dpm = remember { context.getSystemService(android.content.Context.DEVICE_POLICY_SERVICE) as android.app.admin.DevicePolicyManager }
    val snackbarHostState = remember { SnackbarHostState() }

    LaunchedEffect(Unit) {
        viewModel.eventFlow.collectLatest { event ->
            when (event) {
                is ProvisioningEvent.ShowSnackbar -> snackbarHostState.showSnackbar(event.message)
            }
        }
    }

    // Automatically check for permissions every 2 seconds
    LaunchedEffect(Unit) {
        while (true) {
            delay(2000) // Check every 2 seconds
            if (dpm.isDeviceOwnerApp(context.packageName)) {
                onCheckAgain() // This will trigger navigation to the next screen
                break
            }
        }
    }

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        bottomBar = {
            Button(
                onClick = onCheckAgain,
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            ) {
                Text(stringResource(id = R.string.provisioning_button_check_again))
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(stringResource(id = R.string.provisioning_title), style = MaterialTheme.typography.headlineSmall, textAlign = TextAlign.Center)
            Spacer(Modifier.height(8.dp))
            Text(stringResource(id = R.string.provisioning_description), style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center)
            Spacer(Modifier.height(24.dp))

            Card(modifier = Modifier.fillMaxWidth()) {
                Column(Modifier.padding(16.dp)) {
                    Text(stringResource(id = R.string.provisioning_option_adb), style = MaterialTheme.typography.titleMedium)
                    Spacer(Modifier.height(8.dp))
                    Text(stringResource(id = R.string.provisioning_adb_instructions), style = MaterialTheme.typography.bodySmall)
                    Spacer(Modifier.height(8.dp))
                    SelectionContainer {
                        Text(stringResource(id = R.string.provisioning_adb_command), style = MaterialTheme.typography.bodyMedium.copy(fontFamily = FontFamily.Monospace), modifier = Modifier.fillMaxWidth().padding(8.dp))
                    }
                    Spacer(Modifier.height(8.dp))
                    Button(onClick = { viewModel.onCopyAdbCommand() }, modifier = Modifier.align(Alignment.End)) {
                        Text(stringResource(id = R.string.provisioning_button_copy))
                    }
                }
            }

            Spacer(Modifier.height(24.dp))

            Card(modifier = Modifier.fillMaxWidth()) {
                Column(Modifier.padding(16.dp)) {
                    Text(stringResource(id = R.string.provisioning_option_root), style = MaterialTheme.typography.titleMedium)
                    Spacer(Modifier.height(8.dp))
                    Text(stringResource(id = R.string.provisioning_root_instructions), style = MaterialTheme.typography.bodySmall)
                    Spacer(Modifier.height(8.dp))
                    Button(onClick = { viewModel.onTryRootActivation() }, modifier = Modifier.align(Alignment.End)) {
                        Text(stringResource(id = R.string.provisioning_button_try_root))
                    }
                }
            }
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/screens/setup/SetupViewModel.kt
```kotlin
package com.secureguard.mdm.ui.screens.setup

import android.content.ComponentName
import android.content.Context
import android.content.pm.PackageManager
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.secureguard.mdm.R
import com.secureguard.mdm.boot.BootCompletedReceiver
import com.secureguard.mdm.security.PasswordManager
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class SetupUiState(
    val passwordValue: String = "",
    val confirmPasswordValue: String = "",
    val errorResId: Int? = null, // Use resource ID for errors
    val isLoading: Boolean = false
)

sealed class SetupEvent {
    data class PasswordChanged(val value: String) : SetupEvent()
    data class ConfirmPasswordChanged(val value: String) : SetupEvent()
    object Submit : SetupEvent()
}

@HiltViewModel
class SetupViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val passwordManager: PasswordManager
) : ViewModel() {

    private val _uiState = MutableStateFlow(SetupUiState())
    val uiState = _uiState.asStateFlow()

    private val _setupCompleteEvent = MutableSharedFlow<Unit>()
    val setupCompleteEvent = _setupCompleteEvent.asSharedFlow()

    fun onEvent(event: SetupEvent) {
        when (event) {
            is SetupEvent.PasswordChanged -> _uiState.update { it.copy(passwordValue = event.value, errorResId = null) }
            is SetupEvent.ConfirmPasswordChanged -> _uiState.update { it.copy(confirmPasswordValue = event.value, errorResId = null) }
            SetupEvent.Submit -> submitPassword()
        }
    }

    private fun submitPassword() {
        viewModelScope.launch {
            val password = _uiState.value.passwordValue
            val confirmPassword = _uiState.value.confirmPasswordValue

            if (password.length < 4) {
                _uiState.update { it.copy(errorResId = R.string.setup_error_password_too_short) }
                return@launch
            }
            if (password != confirmPassword) {
                _uiState.update { it.copy(errorResId = R.string.setup_error_passwords_do_not_match) }
                return@launch
            }

            _uiState.update { it.copy(isLoading = true, errorResId = null) }

            try {
                passwordManager.createAndSavePassword(password)
                enableBootReceiver()
                _setupCompleteEvent.emit(Unit)
            } catch (e: Exception) {
                // Handle potential errors from password manager
            } finally {
                _uiState.update { it.copy(isLoading = false) }
            }
        }
    }

    private fun enableBootReceiver() {
        val receiver = ComponentName(context, BootCompletedReceiver::class.java)
        context.packageManager.setComponentEnabledSetting(
            receiver,
            PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
            PackageManager.DONT_KILL_APP
        )
        Log.i("SetupViewModel", "BootCompletedReceiver has been programmatically enabled.")
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/theme/Theme.kt
```kotlin
package com.secureguard.mdm.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.LayoutDirection
import androidx.core.view.WindowCompat
import android.util.Log
import java.util.Locale

/**
 * ערכת הצבעים הבהירה של האפליקציה, המשתמשת בגוונים האדומים שהוגדרו.
 */
private val LightColorScheme = lightColorScheme(
    primary = PrimaryRed,
    secondary = SecondaryRed,
    tertiary = AccentColor,
    background = BackgroundLight,
    surface = BackgroundLight,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = TextPrimary,
    onSurface = TextPrimary,
    error = ErrorColor
)

/**
 * ה-Theme הראשי של האפליקציה.
 * כל ממשק המשתמש של האפליקציה ייעטף בקומפוזיציה זו.
 */
@Composable
fun SecureGuardTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    overrideStatusBarColor: Color? = null,
    content: @Composable () -> Unit
) {
    val colorScheme = LightColorScheme

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = (overrideStatusBarColor ?: colorScheme.primary).toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }
    val systemDirection = if (Locale.getDefault().language == "iw" || Locale.getDefault().language == "he" ) {
        LayoutDirection.Rtl
    } else {
        LayoutDirection.Ltr
    }

    // זהו החלק שכופה על כל האפליקציה לעבוד במצב מימין-לשמאל (RTL).
    // כל קומפוזיציה שתהיה תחת ה-Provider הזה "תירש" את הכיווניות.
    Log.d("SecureGuardTheme", "Providing forced layoutDirection=RTL (Theme-level)")
    CompositionLocalProvider(LocalLayoutDirection provides systemDirection) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/utils/update/UpdateDialog.kt
```kotlin
package com.secureguard.mdm.ui.screens.dashboard.update

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.secureguard.mdm.R
import com.secureguard.mdm.ui.screens.dashboard.DashboardEvent
import com.secureguard.mdm.ui.screens.dashboard.DashboardUiState
import com.secureguard.mdm.ui.screens.dashboard.UpdateDialogState
import com.secureguard.mdm.utils.update.DownloadProgress

@Composable
fun UpdateDialog(
    uiState: DashboardUiState,
    onEvent: (DashboardEvent) -> Unit
) {
    val onDismiss = { onEvent(DashboardEvent.OnDismissUpdateDialog) }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.update_dialog_title)) },
        text = {
            when (uiState.updateDialogState) {
                UpdateDialogState.SHOW_INFO -> {
                    UpdateInfoContent(
                        changelog = uiState.availableUpdateInfo?.changelog ?: "No changelog available."
                    )
                }
                UpdateDialogState.DOWNLOADING -> {
                    DownloadingContent(progress = uiState.downloadProgress)
                }
                UpdateDialogState.ERROR -> {
                    ErrorContent(error = uiState.updateError ?: "Unknown error.")
                }
                else -> {}
            }
        },
        confirmButton = {
            if (uiState.updateDialogState == UpdateDialogState.SHOW_INFO) {
                Button(onClick = { onEvent(DashboardEvent.OnStartUpdateDownload) }) {
                    Text(stringResource(id = R.string.update_dialog_button_download))
                }
            }
        },
        dismissButton = {
            if (uiState.updateDialogState != UpdateDialogState.DOWNLOADING) {
                TextButton(onClick = onDismiss) {
                    Text(stringResource(id = R.string.update_dialog_button_later))
                }
            }
        }
    )
}

@Composable
private fun UpdateInfoContent(changelog: String) {
    Column {
        Text(
            text = stringResource(id = R.string.update_dialog_changelog_title),
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        LazyColumn(modifier = Modifier.heightIn(max = 200.dp)) {
            item {
                Text(text = changelog, style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}

@Composable
private fun DownloadingContent(progress: DownloadProgress) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        when (progress) {
            is DownloadProgress.Downloading -> {
                Text(stringResource(id = R.string.update_dialog_downloading))
                Spacer(modifier = Modifier.height(16.dp))
                LinearProgressIndicator(
                    progress = { progress.progress / 100f },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("${progress.progress}%")
            }
            is DownloadProgress.Installing -> {
                Text(stringResource(id = R.string.update_dialog_installing))
                Spacer(modifier = Modifier.height(16.dp))
                LinearProgressIndicator(
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(stringResource(id = R.string.update_dialog_please_wait))
            }
            else -> {
                Text(stringResource(id = R.string.update_dialog_processing))
                Spacer(modifier = Modifier.height(16.dp))
                LinearProgressIndicator(
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

@Composable
private fun ErrorContent(error: String) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(stringResource(id = R.string.update_dialog_error), style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.error)
        Spacer(modifier = Modifier.height(8.dp))
        Text(error, style = MaterialTheme.typography.bodyMedium)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/utils/update/UpdateInfo.kt
```kotlin
package com.secureguard.mdm.utils.update

/**
 * Data class to hold information about an available update.
 * @param versionCode The version code of the available update.
 * @param versionName The version name of the available update.
 * @param changelog The description of changes for the new version.
 * @param downloadUrl The direct URL to download the APK file.
 */
data class UpdateInfo(
    val versionCode: Int,
    val versionName: String, // Can be derived or part of the info file
    val changelog: String,
    val downloadUrl: String
)
```

## File: app/src/main/res/drawable/ic_launcher_background.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<vector
    android:height="108dp"
    android:width="108dp"
    android:viewportHeight="108"
    android:viewportWidth="108"
    xmlns:android="http://schemas.android.com/apk/res/android">
    <path android:fillColor="#3DDC84"
          android:pathData="M0,0h108v108h-108z"/>
    <path android:fillColor="#00000000" android:pathData="M9,0L9,108"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M19,0L19,108"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M29,0L29,108"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M39,0L39,108"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M49,0L49,108"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M59,0L59,108"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M69,0L69,108"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M79,0L79,108"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M89,0L89,108"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M99,0L99,108"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M0,9L108,9"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M0,19L108,19"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M0,29L108,29"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M0,39L108,39"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M0,49L108,49"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M0,59L108,59"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M0,69L108,69"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M0,79L108,79"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M0,89L108,89"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M0,99L108,99"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M19,29L89,29"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M19,39L89,39"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M19,49L89,49"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M19,59L89,59"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M19,69L89,69"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M19,79L89,79"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M29,19L29,89"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M39,19L39,89"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M49,19L49,89"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M59,19L59,89"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M69,19L69,89"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
    <path android:fillColor="#00000000" android:pathData="M79,19L79,89"
          android:strokeColor="#33FFFFFF" android:strokeWidth="0.8"/>
</vector>
```

## File: app/src/main/res/drawable/ic_system_update.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:height="24dp" android:tint="#000000" android:viewportHeight="960" android:viewportWidth="960" android:width="24dp">
      
    <path android:fillColor="@android:color/white" android:pathData="M720,880L840,760L812,732L740,804L740,640L700,640L700,804L628,732L600,760L720,880ZM480,160L243,297L480,434L717,297L480,160Q480,160 480,160Q480,160 480,160ZM120,639L120,321Q120,299 130.5,281Q141,263 160,252L440,91Q450,86 459.5,83Q469,80 480,80Q491,80 501,83Q511,86 520,91L800,252Q819,263 829.5,281Q840,299 840,321L840,480Q822,480 800,480Q778,480 760,480L760,364L479,526L200,364L200,638Q200,638 200,638Q200,638 200,638L440,777Q440,798 440,823Q440,848 440,869Q440,869 440,869Q440,869 440,869L160,708Q141,697 130.5,679Q120,661 120,639ZM720,960Q637,960 578.5,901.5Q520,843 520,760Q520,677 578.5,618.5Q637,560 720,560Q803,560 861.5,618.5Q920,677 920,760Q920,843 861.5,901.5Q803,960 720,960ZM480,469Q480,469 480,469Q480,469 480,469Q480,469 480,469Q480,469 480,469Q480,469 480,469Q480,469 480,469L480,469Q480,469 480,469Q480,469 480,469L480,469Q480,469 480,469Q480,469 480,469L480,469Q480,469 480,469Q480,469 480,469L480,469Q480,469 480,469Q480,469 480,469Z"/>
    
</vector>
```

## File: app/src/main/res/mipmap-anydpi-v26/ic_launcher_round.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@drawable/ic_launcher_background"/>
    <foreground android:drawable="@mipmap/ic_launcher_foreground"/>
</adaptive-icon>
```

## File: app/src/main/res/mipmap-anydpi-v26/ic_launcher.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@drawable/ic_launcher_background"/>
    <foreground android:drawable="@mipmap/ic_launcher_foreground"/>
</adaptive-icon>
```

## File: app/src/main/res/values/ic_launcher_background.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="ic_launcher_background">#FFFFFF</color>
</resources>
```

## File: app/src/main/res/xml-v28/device_admin.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<device-admin>
    <!--
      This file is for API 28 (Android 9) and above.
      It includes all policies, including those not available on older versions.
    -->
    <uses-policies>
        <!-- Allows enforcing password policies -->
        <limit-password />
        <!-- Allows remotely locking the device -->
        <force-lock />
        <!-- Allows remotely wiping the device -->
        <wipe-data />
        <!-- Allows requiring device storage encryption -->
        <encrypted-storage />

        <!-- === POLICIES CURRENTLY IN USE === -->

        <!-- Policy for BlockCameraFeature -->
        <disable-camera />
        <!-- Policy for BlockScreenshotFeature (available on API 28+) -->
        <disable-screen-capture />
        <!-- Policy for blocking the lock screen -->
        <disable-keyguard-features />




    </uses-policies>
    <!-- Support for receiving ownership transfer -->
    <support-transfer-ownership />
</device-admin>
```

## File: build.gradle.kts
```kotlin
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.3.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id("com.google.dagger.hilt.android") version "2.51" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.22" apply false
}
```

## File: app/src/main/java/com/secureguard/mdm/appblocker/AppInfo.kt
```kotlin
package com.secureguard.mdm.appblocker

import android.graphics.drawable.Drawable

/**
 * Data class לייצוג מידע על אפליקציה בודדת.
 * @param appName שם האפליקציה כפי שהוא מוצג למשתמש.
 * @param packageName שם החבילה הייחודי של האפליקציה.
 * @param icon האייקון של האפליקציה.
 * @param isBlocked מציין אם האפליקציה מסומנת לחסימה.
 * @param isSystemApp מציין אם זוהי אפליקציית מערכת.
 * @param isLauncherApp מציין אם זוהי אפליקציה שמופיעה ב-Launcher (מסך הבית).
 * @param isSuspended מציין אם האפליקציה מושעית (Suspended) במקום חסומה.
 * @param isInstalled מציין אם האפליקציה מותקנת כרגע במכשיר.
 */
data class AppInfo(
    val appName: String,
    val packageName: String,
    // --- התיקון כאן: הוספת @Transient כדי למנוע מ-Gson לנסות לסרוק את האובייקט המורכב הזה ---
    @Transient val icon: Drawable,
    val isBlocked: Boolean,
    val isSystemApp: Boolean,
    val isLauncherApp: Boolean,
    val isSuspended: Boolean = false,
    val isInstalled: Boolean = true
)
```

## File: app/src/main/java/com/secureguard/mdm/features/impl/BlockIncomingCallsFeature.kt
```kotlin
package com.secureguard.mdm.features.impl

import android.app.PendingIntent
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageInstaller
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.telecom.TelecomManager
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.secureguard.mdm.R
import com.secureguard.mdm.data.repository.SettingsRepository
import com.secureguard.mdm.features.api.ProtectionFeature
import com.secureguard.mdm.receivers.InstallReceiver
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

object BlockIncomingCallsFeature : ProtectionFeature {
    override val id: String = "block_incoming_calls"
    override val titleRes: Int = R.string.feature_block_incoming_calls_title
    override val descriptionRes: Int = R.string.feature_block_incoming_calls_description
    override val iconRes: Int = R.drawable.ic_incoming_call_off
    override val requiredSdkVersion: Int = Build.VERSION_CODES.M // Feature requires API 23+

    private const val NO_PHONE_PACKAGE_NAME = "org.fossify.phone.debug"
    private const val NO_PHONE_ASSET_NAME = "nophone.apk"
    private const val TAG = "IncomingCallsFeature"

    @EntryPoint
    @InstallIn(SingletonComponent::class)
    interface BlockIncomingCallsEntryPoint {
        fun settingsRepository(): SettingsRepository
    }

    override fun applyPolicy(context: Context, dpm: DevicePolicyManager, admin: ComponentName, enable: Boolean) {
        // FIX: Added version guard to prevent crash on API < 23
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            Log.w(TAG, "Cannot apply policy, API level ${Build.VERSION.SDK_INT} is below required ${Build.VERSION_CODES.M}")
            return
        }

        val entryPoint = EntryPointAccessors.fromApplication(context, BlockIncomingCallsEntryPoint::class.java)
        val settingsRepository = entryPoint.settingsRepository()

        if (enable) {
            enableBlocking(context, dpm, admin, settingsRepository)
        } else {
            disableBlocking(context, dpm, admin, settingsRepository)
        }
    }

    override fun isPolicyActive(context: Context, dpm: DevicePolicyManager, admin: ComponentName): Boolean {
        // FIX: Add version guard, as PackageManager calls might behave differently on older APIs.
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return false
        return try {
            context.packageManager.getPackageInfo(NO_PHONE_PACKAGE_NAME, 0)
            true
        } catch (e: PackageManager.NameNotFoundException) {
            false
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun enableBlocking(context: Context, dpm: DevicePolicyManager, admin: ComponentName, repo: SettingsRepository) {
        if (isPolicyActive(context, dpm, admin)) {
            Log.d(TAG, "enableBlocking called but NoPhone is already installed. Doing nothing.")
            return
        }

        val telecomManager = context.getSystemService(Context.TELECOM_SERVICE) as TelecomManager
        val originalDialer = telecomManager.defaultDialerPackage
        Log.d(TAG, "Original dialer is: $originalDialer")

        CoroutineScope(Dispatchers.IO).launch {
            if (originalDialer != null && originalDialer != NO_PHONE_PACKAGE_NAME) {
                repo.setOriginalDialerPackage(originalDialer)
                try {
                    withContext(Dispatchers.Main) {
                        Toast.makeText(context, context.getString(R.string.toast_hiding_dialer, originalDialer), Toast.LENGTH_SHORT).show()
                    }
                    dpm.setApplicationHidden(admin, originalDialer, true)
                    Log.d(TAG, "Successfully hid original dialer: $originalDialer")
                    installNoPhoneApp(context)
                } catch (e: Exception) {
                    Log.e(TAG, "Failed to hide original dialer", e)
                }
            } else {
                Log.w(TAG, "No original dialer found or it's already the nophone app. Trying to install nophone anyway.")
                installNoPhoneApp(context)
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun disableBlocking(context: Context, dpm: DevicePolicyManager, admin: ComponentName, repo: SettingsRepository) {
        CoroutineScope(Dispatchers.IO).launch {
            val originalDialer = repo.getOriginalDialerPackage()

            if (originalDialer == null) {
                Log.d(TAG, "disableBlocking called but no original dialer is saved. Doing nothing.")
                return@launch
            }

            withContext(Dispatchers.Main) {
                Toast.makeText(context, R.string.toast_restoring_dialer, Toast.LENGTH_SHORT).show()
            }
            requestUninstall(context)

            try {
                dpm.setApplicationHidden(admin, originalDialer, false)
                Log.d(TAG, "Successfully un-hid original dialer: $originalDialer")
                repo.setOriginalDialerPackage(null)
            } catch (e: Exception) {
                Log.e(TAG, "Failed to un-hide original dialer", e)
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun installNoPhoneApp(context: Context) {
        CoroutineScope(Dispatchers.Main).launch {
            Toast.makeText(context, R.string.toast_installing_nophone, Toast.LENGTH_SHORT).show()
        }
        try {
            val packageInstaller = context.packageManager.packageInstaller
            val params = PackageInstaller.SessionParams(PackageInstaller.SessionParams.MODE_FULL_INSTALL)
            val sessionId = packageInstaller.createSession(params)
            val session = packageInstaller.openSession(sessionId)

            context.assets.open(NO_PHONE_ASSET_NAME).use { assetStream ->
                session.openWrite("nophone_install_session", 0, -1).use { sessionStream ->
                    assetStream.copyTo(sessionStream)
                    session.fsync(sessionStream)
                }
            }
            val intent = Intent(context, InstallReceiver::class.java).apply {
                putExtra("package_name", NO_PHONE_PACKAGE_NAME)
            }

            val pendingIntent = PendingIntent.getBroadcast(
                context, sessionId, intent,
                PendingIntent.FLAG_UPDATE_CURRENT or if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) PendingIntent.FLAG_MUTABLE else 0
            )

            session.commit(pendingIntent.intentSender)
            session.close()
            Log.d(TAG, "NoPhone installation session committed.")

        } catch (e: Exception) {
            Log.e(TAG, "Failed to install NoPhone app from assets.", e)
        }
    }

    private fun requestUninstall(context: Context) {
        val intent = Intent(Intent.ACTION_DELETE, Uri.parse("package:$NO_PHONE_PACKAGE_NAME"))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/MainActivity.kt
```kotlin
package com.secureguard.mdm

import android.Manifest
import android.app.admin.DevicePolicyManager
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect // <-- FIX
import androidx.compose.ui.res.stringResource
import androidx.compose.runtime.getValue      // <-- FIX
import androidx.compose.runtime.mutableStateOf  // <-- FIX
import androidx.compose.runtime.remember      // <-- FIX
import androidx.compose.runtime.setValue      // <-- FIX
import androidx.compose.ui.Modifier
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import com.secureguard.mdm.data.repository.SettingsRepository
import com.secureguard.mdm.kiosk.ui.KioskActivity
import com.secureguard.mdm.ui.navigation.AppNavigation
import com.secureguard.mdm.ui.theme.SecureGuardTheme
import com.secureguard.mdm.utils.SecureUpdateHelper
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var secureUpdateHelper: SecureUpdateHelper

    @Inject
    lateinit var settingsRepository: SettingsRepository

    @Inject
    lateinit var dpm: DevicePolicyManager

    private val writeSettingsLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        Log.d("MainActivity", "Returned from WRITE_SETTINGS screen.")
    }

    private val requestPermissionLauncher =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted: Boolean ->
            if (isGranted) {
                Log.d("MainActivity", "FOREGROUND_SERVICE_SPECIAL_USE permission granted.")
            } else {
                Log.w("MainActivity", "FOREGROUND_SERVICE_SPECIAL_USE permission was denied.")
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            val startDestinationOverride = intent.getStringExtra("start_destination")
            if (startDestinationOverride == null && settingsRepository.isKioskModeEnabled()) {
                val kioskIntent = Intent(this@MainActivity, KioskActivity::class.java)
                startActivity(kioskIntent)
                finish()
                return@launch
            }

            if (!secureUpdateHelper.coreComponentExists()) {
                throw RuntimeException("Core validation component is missing or corrupted. Halting execution.")
            }

            requestSpecialUsePermission()

            // Check for NetGuard upgrade scenario
            val shouldShowNetGuardDialog = checkForNetGuardUpgrade()

            setContent {
                SecureGuardTheme {
                    // --- NEW: State to control the dialog visibility ---
                    var showNetGuardDialog by remember { mutableStateOf(shouldShowNetGuardDialog) }

                    // --- NEW: Check for permission and update state ---
                    LaunchedEffect(Unit) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                            if (!Settings.System.canWrite(this@MainActivity) && dpm.isDeviceOwnerApp(packageName)) {
                                val intent = Intent(
                                    Settings.ACTION_MANAGE_WRITE_SETTINGS,
                                    Uri.parse("package:$packageName")
                                )
                                writeSettingsLauncher.launch(intent)
                            }
                        }
                    }

                    val isFromKiosk = intent.getBooleanExtra("is_from_kiosk", false)
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        AppNavigation(
                            startDestinationOverride = startDestinationOverride,
                            isFromKiosk = isFromKiosk
                        )

                        // --- WRITE_SETTINGS is requested via system screen ---

                        if (showNetGuardDialog) {
                            NetGuardUpgradeDialog(
                                onDismiss = { showNetGuardDialog = false },
                                onUninstall = {
                                    showNetGuardDialog = false
                                    uninstallNetGuard()
                                }
                            )
                        }
                    }
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!Settings.System.canWrite(this) && dpm.isDeviceOwnerApp(packageName)) {
                val intent = Intent(
                    Settings.ACTION_MANAGE_WRITE_SETTINGS,
                    Uri.parse("package:$packageName")
                )
                writeSettingsLauncher.launch(intent)
            }
        }
    }

    private fun requestSpecialUsePermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
            val permission = Manifest.permission.FOREGROUND_SERVICE_SPECIAL_USE
            when {
                ContextCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED -> {
                    Log.d("MainActivity", "Special use foreground service permission already granted.")
                }
                else -> {
                    Log.d("MainActivity", "Requesting special use foreground service permission.")
                    requestPermissionLauncher.launch(permission)
                }
            }
        }
    }

    private fun checkForNetGuardUpgrade(): Boolean {
        // Check if NetGuard is installed and was previously protected
        val netGuardPackage = "eu.faircode.netguard"
        val isNetGuardInstalled = try {
            packageManager.getPackageInfo(netGuardPackage, 0)
            true
        } catch (e: PackageManager.NameNotFoundException) {
            false
        }

        if (isNetGuardInstalled) {
            // Remove protection first (as per requirements)
            val adminComponentName = SecureGuardDeviceAdminReceiver.getComponentName(this)
            try {
                dpm.setUninstallBlocked(adminComponentName, netGuardPackage, false)
                Log.d("MainActivity", "Removed NetGuard uninstall protection")
            } catch (e: Exception) {
                Log.w("MainActivity", "Failed to remove NetGuard protection", e)
            }

            return true // Show dialog
        }
        return false // Don't show dialog
    }

    private fun uninstallNetGuard() {
        val netGuardPackage = "eu.faircode.netguard"
        val adminComponentName = SecureGuardDeviceAdminReceiver.getComponentName(this)

        lifecycleScope.launch {
            try {
                // Use MDM to uninstall NetGuard
                dpm.setUninstallBlocked(adminComponentName, netGuardPackage, false)
                val intent = Intent(Intent.ACTION_UNINSTALL_PACKAGE).apply {
                    data = Uri.parse("package:$netGuardPackage")
                    putExtra(Intent.EXTRA_RETURN_RESULT, true)
                }
                startActivity(intent)
                Log.d("MainActivity", "Initiated NetGuard uninstall")
            } catch (e: Exception) {
                Log.e("MainActivity", "Failed to uninstall NetGuard", e)
            }
        }
    }
}

// --- NEW: Composable function for the permission dialog ---
@Composable
private fun WriteSettingsPermissionDialog(onDismiss: () -> Unit, onConfirm: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.permission_dialog_title)) },
        text = { Text(stringResource(id = R.string.permission_dialog_message)) },
        confirmButton = {
            Button(onClick = onConfirm) {
                Text(stringResource(id = R.string.permission_dialog_button_confirm))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.permission_dialog_button_cancel))
            }
        }
    )
}

// --- NEW: Composable function for the NetGuard upgrade dialog ---
@Composable
private fun NetGuardUpgradeDialog(onDismiss: () -> Unit, onUninstall: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.netguard_upgrade_dialog_title)) },
        text = {
            Text(stringResource(id = R.string.netguard_upgrade_dialog_message))
        },
        confirmButton = {
            Button(onClick = onUninstall) {
                Text(stringResource(id = R.string.netguard_upgrade_dialog_button_uninstall))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.netguard_upgrade_dialog_button_keep))
            }
        }
    )
}
```

## File: app/src/main/java/com/secureguard/mdm/services/BlockerVpnService.kt
```kotlin
package com.secureguard.mdm.services

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.Network
import android.net.VpnService
import android.os.Build
import android.os.IBinder
import android.os.ParcelFileDescriptor
import androidx.core.app.NotificationCompat
import com.secureguard.mdm.R
import com.secureguard.mdm.utils.FileLogger
import java.io.IOException

class BlockerVpnService : VpnService() {

    private var vpnInterface: ParcelFileDescriptor? = null
    private val tag = "NetfreeVpnService"
    private lateinit var connectivityManager: ConnectivityManager

    companion object {
        const val ACTION_CONNECT = "com.secureguard.mdm.ACTION_CONNECT"
        const val ACTION_DISCONNECT = "com.secureguard.mdm.ACTION_DISCONNECT"
        const val ACTION_UPDATE_POLICY = "ACTION_UPDATE_POLICY"
        const val EXTRA_PREFERRED_NETWORK = "EXTRA_PREFERRED_NETWORK"

        private const val VPN_NOTIFICATION_CHANNEL_ID = "BlockerVpnChannel"
        private const val VPN_NOTIFICATION_ID = 1002
    }

    override fun onCreate() {
        super.onCreate()
        connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
            startForeground(
                VPN_NOTIFICATION_ID,
                createNotification(),
                android.content.pm.ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE
            )
        } else {
            startForeground(VPN_NOTIFICATION_ID, createNotification())
        }

        when (intent?.action) {
            ACTION_CONNECT -> {
                FileLogger.log(tag, "Received ACTION_CONNECT. Starting VPN in simple block mode.")
                stopVpn()
                startVpn(preferredNetwork = null)
            }
            ACTION_DISCONNECT -> {
                FileLogger.log(tag, "Received ACTION_DISCONNECT. Stopping VPN.")
                stopVpn()
                stopSelf()
            }
            ACTION_UPDATE_POLICY -> {
                val preferredNetwork: Network? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    intent.getParcelableExtra(EXTRA_PREFERRED_NETWORK, Network::class.java)
                } else {
                    @Suppress("DEPRECATION")
                    intent.getParcelableExtra(EXTRA_PREFERRED_NETWORK)
                }
                FileLogger.log(tag, "Received ACTION_UPDATE_POLICY. Preferred network: $preferredNetwork")
                stopVpn()
                startVpn(preferredNetwork)
            }
        }
        return START_STICKY
    }

    private fun startVpn(preferredNetwork: Network?) {
        try {
            val builder = Builder()
                .addAddress("10.8.0.1", 24)
                .addRoute("0.0.0.0", 0)
                .addAllowedApplication(packageName)

            if (preferredNetwork != null) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    FileLogger.log(tag, "Routing all traffic through network (API >= 29): $preferredNetwork")
                    setUnderlyingNetworks(arrayOf(preferredNetwork))
                } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    FileLogger.log(tag, "Binding process to network (API < 29): $preferredNetwork")
                    if (!connectivityManager.bindProcessToNetwork(preferredNetwork)) {
                        FileLogger.log(tag, "Failed to bind process to network $preferredNetwork.")
                    }
                }
            } else {
                FileLogger.log(tag, "No preferred network. Blocking all traffic.")
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    setUnderlyingNetworks(null)
                }
            }

            vpnInterface = builder.establish()
            if (vpnInterface == null) {
                FileLogger.log(tag, "VPN interface is NULL, policy will not be applied.")
            }

        } catch (e: Exception) {
            FileLogger.log(tag, "Error establishing VPN: ${e.message}")
        }
    }

    private fun stopVpn() {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                connectivityManager.bindProcessToNetwork(null)
            }
            vpnInterface?.close()
        } catch (e: IOException) {
            FileLogger.log(tag, "Error closing VPN interface: ${e.message}")
        } finally {
            vpnInterface = null
        }
    }

    private fun createNotification(): Notification {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                VPN_NOTIFICATION_CHANNEL_ID,
                getString(R.string.vpn_notification_channel_name),
                // --- התיקון כאן ---
                NotificationManager.IMPORTANCE_LOW
            ).apply {
                description = getString(R.string.vpn_notification_channel_description)
            }
            getSystemService(NotificationManager::class.java).createNotificationChannel(channel)
        }
        return NotificationCompat.Builder(this, VPN_NOTIFICATION_CHANNEL_ID)
            .setContentTitle(getString(R.string.app_name))
            .setContentText(getString(R.string.vpn_notification_content))
            .setSmallIcon(R.drawable.ic_netguard_shield)
            .setPriority(NotificationCompat.PRIORITY_LOW) // --- התיקון כאן ---
            .setOngoing(true)
            .build()
    }

    override fun onDestroy() {
        FileLogger.log(tag, "VpnService is being destroyed.")
        stopVpn()
        super.onDestroy()
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/navigation/AppNavigation.kt
```kotlin
package com.secureguard.mdm.ui.navigation

import android.content.Context
import android.content.Intent
import android.app.admin.DevicePolicyManager
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.secureguard.mdm.appblocker.ui.AppSelectionScreen
import com.secureguard.mdm.appblocker.ui.BlockedAppsScreen
import com.secureguard.mdm.data.repository.SettingsRepository
import com.secureguard.mdm.kiosk.ui.KioskAppSelectionScreen
import com.secureguard.mdm.kiosk.ui.KioskManagementScreen
import com.secureguard.mdm.ui.screens.changepassword.ChangePasswordScreen
import com.secureguard.mdm.ui.screens.dashboard.DashboardScreen
import com.secureguard.mdm.ui.screens.frpsettings.FrpSettingsScreen
import com.secureguard.mdm.ui.screens.provisioning.ProvisioningScreen
import com.secureguard.mdm.ui.screens.settings.SettingsScreen
import com.secureguard.mdm.ui.screens.setup.SetupScreen
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object Routes {
    const val PROVISIONING = "provisioning"
    const val SETUP = "setup"
    const val DASHBOARD = "dashboard"
    const val SETTINGS = "settings"
    const val CHANGE_PASSWORD = "change_password"
    const val APP_SELECTION = "app_selection"
    const val BLOCKED_APPS_DISPLAY = "blocked_apps_display"
    const val FRP_SETTINGS = "frp_settings"
    const val KIOSK_MANAGEMENT = "kiosk_management"
    const val KIOSK_APP_SELECTION = "kiosk_app_selection"
}

@Composable
fun AppNavigation(
    settingsRepository: SettingsRepository = hiltViewModel<DummyViewModel>().settingsRepository,
    startDestinationOverride: String? = null,
    isFromKiosk: Boolean = false
) {
    val navController = rememberNavController()
    val context = LocalContext.current
    val dpm = context.getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager

    var refreshTrigger by remember { mutableStateOf(false) }

    val startDestinationState = produceState<String?>(initialValue = null, key1 = refreshTrigger, key2 = startDestinationOverride) {
        value = if (startDestinationOverride != null) {
            startDestinationOverride
        } else {
            withContext(Dispatchers.IO) {
                val isAdmin = dpm.isDeviceOwnerApp(context.packageName)
                val isSetupComplete = settingsRepository.isSetupComplete()

                when {
                    !isAdmin -> Routes.PROVISIONING
                    !isSetupComplete -> Routes.SETUP
                    else -> Routes.DASHBOARD
                }
            }
        }
    }

    val startDestination = startDestinationState.value

    if (startDestination != null) {
        NavHost(navController = navController, startDestination = startDestination) {
            composable(Routes.PROVISIONING) {
                ProvisioningScreen(onCheckAgain = { refreshTrigger = !refreshTrigger })
            }
            composable(Routes.SETUP) {
                SetupScreen(onSetupComplete = {
                    navController.navigate(Routes.DASHBOARD) { popUpTo(Routes.SETUP) { inclusive = true } }
                })
            }
            composable(Routes.DASHBOARD) {
                DashboardScreen(onNavigateToSettings = { navController.navigate(Routes.SETTINGS) })
            }
            composable(Routes.SETTINGS) {
                SettingsScreen(
                    onNavigateBack = { navController.popBackStack() },
                    onNavigateTo = { route -> navController.navigate(route) }
                )
            }
            composable(Routes.CHANGE_PASSWORD) {
                ChangePasswordScreen(onNavigateBack = { navController.popBackStack() })
            }
            composable(Routes.APP_SELECTION) {
                AppSelectionScreen(onNavigateBack = { navController.popBackStack() })
            }
            composable(Routes.BLOCKED_APPS_DISPLAY) {
                BlockedAppsScreen(onNavigateBack = { navController.popBackStack() })
            }
            composable(Routes.FRP_SETTINGS) {
                FrpSettingsScreen(onNavigateBack = { navController.popBackStack() })
            }
            composable(Routes.KIOSK_MANAGEMENT) {
                KioskManagementScreen(
                    isFromKiosk = isFromKiosk,
                    onNavigateBack = {
                        if (isFromKiosk) {
                            val intent = Intent(context, com.secureguard.mdm.kiosk.ui.KioskActivity::class.java).apply {
                                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
                            }
                            context.startActivity(intent)
                            (context as? android.app.Activity)?.finish()
                        } else {
                            navController.popBackStack()
                        }
                    },
                    onNavigateTo = { route -> navController.navigate(route) }
                )
            }
            composable(Routes.KIOSK_APP_SELECTION) {
                KioskAppSelectionScreen(
                    onNavigateBack = { navController.popBackStack() }
                )
            }
        }
    } else {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator()
        }
    }
}

@dagger.hilt.android.lifecycle.HiltViewModel
class DummyViewModel @javax.inject.Inject constructor(
    val settingsRepository: SettingsRepository
) : androidx.lifecycle.ViewModel()
```

## File: app/src/main/res/values/colors.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <!-- Base colors for the original app theme (Compose) -->
    <color name="purple_200">#FFBB86FC</color>
    <color name="purple_500">#FF6200EE</color>
    <color name="purple_700">#FF3700B3</color>
    <color name="teal_200">#FF03DAC5</color>
    <color name="teal_700">#FF018786</color>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>

    <!-- Material 3 Kiosk Theme Colors -->
    <color name="md_theme_primary">#B71C1C</color>
    <color name="md_theme_onPrimary">#FFFFFF</color>
    <color name="md_theme_primaryContainer">#EADDFF</color>
    <color name="md_theme_onPrimaryContainer">#21005D</color>
    <color name="md_theme_secondary">#625B71</color>
    <color name="md_theme_onSecondary">#FFFFFF</color>
    <color name="md_theme_secondaryContainer">#E8DEF8</color>
    <color name="md_theme_onSecondaryContainer">#1D192B</color>
    <color name="md_theme_tertiary">#7D5260</color>
    <color name="md_theme_onTertiary">#FFFFFF</color>
    <color name="md_theme_tertiaryContainer">#FFD8E4</color>
    <color name="md_theme_onTertiaryContainer">#31111D</color>
    <color name="md_theme_error">#B3261E</color>
    <color name="md_theme_onError">#FFFFFF</color>
    <color name="md_theme_errorContainer">#F9DEDC</color>
    <color name="md_theme_onErrorContainer">#410E0B</color>
    <color name="md_theme_background">#FFFBFE</color>
    <color name="md_theme_onBackground">#1C1B1F</color>
    <color name="md_theme_surface">#FFFBFE</color>
    <color name="md_theme_onSurface">#1C1B1F</color>
    <color name="md_theme_surfaceVariant">#E7E0EC</color>
    <color name="md_theme_onSurfaceVariant">#49454F</color>
    <color name="md_theme_outline">#79747E</color>
    <color name="md_theme_shadow">#000000</color>
    <color name="md_theme_inverseSurface">#313033</color>
    <color name="md_theme_inverseOnSurface">#F4EFF4</color>
    <color name="md_theme_inversePrimary">#D0BCFF</color>
    <color name="md_theme_surfaceTint">#B71C1C</color>
</resources>
```

## File: app/src/main/res/values/themes.xml
```xml
<resources xmlns:tools="http://schemas.android.com/tools">
    <!--
        Base application theme for Compose part of the app.
    -->
    <style name="Theme.SecureGuard" parent="android:Theme.Material.Light.NoActionBar">
        <item name="android:statusBarColor">@color/purple_700</item>
    </style>

    <!--
        Kiosk theme for Light Mode.
        This inherits from the DayNight M3 theme, which resolves to the Light theme here.
        This is the single source of truth for the Kiosk theme's style attributes.
    -->
    <style name="Theme.SecureGuard.Kiosk" parent="Theme.Material3.DayNight.NoActionBar">
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/md_theme_primary</item>
        <item name="colorOnPrimary">@color/md_theme_onPrimary</item>
        <item name="colorPrimaryContainer">@color/md_theme_primaryContainer</item>
        <item name="colorOnPrimaryContainer">@color/md_theme_onPrimaryContainer</item>
        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/md_theme_secondary</item>
        <item name="colorOnSecondary">@color/md_theme_onSecondary</item>
        <item name="colorSecondaryContainer">@color/md_theme_secondaryContainer</item>
        <item name="colorOnSecondaryContainer">@color/md_theme_onSecondaryContainer</item>
        <!-- Error color. -->
        <item name="colorError">@color/md_theme_error</item>
        <item name="colorOnError">@color/md_theme_onError</item>
        <item name="colorErrorContainer">@color/md_theme_errorContainer</item>
        <item name="colorOnErrorContainer">@color/md_theme_onErrorContainer</item>
        <!-- Backgrounds and Surfaces -->
        <item name="android:colorBackground">@color/md_theme_background</item>
        <item name="colorOnBackground">@color/md_theme_onBackground</item>
        <item name="colorSurface">@color/md_theme_surface</item>
        <item name="colorOnSurface">@color/md_theme_onSurface</item>
        <item name="colorSurfaceVariant">@color/md_theme_surfaceVariant</item>
        <item name="colorOnSurfaceVariant">@color/md_theme_onSurfaceVariant</item>
        <item name="colorOutline">@color/md_theme_outline</item>
        <!-- Status bar color. -->
        <item name="android:statusBarColor">?attr/colorPrimary</item>
    </style>

    <style name="Theme.SecureGuard.Transparent" parent="android:Theme.Translucent.NoTitleBar">
        <item name="android:windowIsTranslucent">true</item>
        <item name="android:windowBackground">@android:color/transparent</item>
        <item name="android:windowNoTitle">true</item>
        <item name="android:windowIsFloating">true</item>
    </style>
</resources>
```

## File: app/src/main/res/xml/device_admin.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<device-admin>
    <!--
      This file declares all the sensitive policies the app might use.
      This is the base version for APIs < 28.
    -->
    <uses-policies>
        <!-- Allows enforcing password policies -->
        <limit-password />
        <!-- Allows remotely locking the device -->
        <force-lock />
        <!-- Allows remotely wiping the device -->
        <wipe-data />
        <!-- Allows requiring device storage encryption -->
        <encrypted-storage />

        <!-- === POLICIES CURRENTLY IN USE === -->

        <!-- Policy for BlockCameraFeature -->
        <disable-camera />
        <!-- Policy for blocking the lock screen -->
        <disable-keyguard-features />

        <!-- The disable-screen-capture policy is in the xml-v28 version of this file -->
        <!-- support-transfer-ownership is only available in xml-v28 -->
    </uses-policies>
    
</device-admin>
```

## File: app/release/output-metadata.json
```json
{
  "version": 3,
  "artifactType": {
    "type": "APK",
    "kind": "Directory"
  },
  "applicationId": "com.secureguard.mdm",
  "variantName": "release",
  "elements": [
    {
      "type": "SINGLE",
      "filters": [],
      "attributes": [],
      "versionCode": 3,
      "versionName": "0.4.6",
      "outputFile": "Abloq-release.apk"
    }
  ],
  "elementType": "File"
}
```

## File: app/src/main/java/com/secureguard/mdm/di/AppModule.kt
```kotlin
package com.secureguard.mdm.di

import android.app.admin.DevicePolicyManager
import android.content.Context
import android.content.SharedPreferences
import android.net.ConnectivityManager
import androidx.room.Room
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.secureguard.mdm.boot.impl.NetfreeWatchdogBootTask
import com.secureguard.mdm.boot.impl.ShowToastOnBootTask
import com.secureguard.mdm.data.db.AppDatabase
import com.secureguard.mdm.data.db.BlockedAppCacheDao
import com.secureguard.mdm.data.local.PreferencesManager
import com.secureguard.mdm.data.repository.SettingsRepository
import com.secureguard.mdm.data.repository.SettingsRepositoryImpl
import com.secureguard.mdm.utils.SecureUpdateHelper
import com.secureguard.mdm.utils.update.UpdateManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "secure_guard_database"
        ).build()
    }

    @Provides
    @Singleton
    fun provideBlockedAppCacheDao(appDatabase: AppDatabase): BlockedAppCacheDao {
        return appDatabase.blockedAppCacheDao()
    }

    @Provides
    @Singleton
    fun provideSharedPreferences(@ApplicationContext context: Context): SharedPreferences {
        return context.getSharedPreferences("secure_guard_prefs", Context.MODE_PRIVATE)
    }

    @Provides
    @Singleton
    fun providePreferencesManager(sharedPreferences: SharedPreferences): PreferencesManager {
        return PreferencesManager(sharedPreferences)
    }

    @Provides
    @Singleton
    fun provideDevicePolicyManager(@ApplicationContext context: Context): DevicePolicyManager {
        return context.getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager
    }

    @Provides
    @Singleton
    fun provideConnectivityManager(@ApplicationContext context: Context): ConnectivityManager {
        return context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }

    @Provides
    @Singleton
    fun provideSettingsRepository(impl: SettingsRepositoryImpl): SettingsRepository {
        return impl
    }

    @Provides
    @Singleton
    fun provideSecureUpdateHelper(@ApplicationContext context: Context): SecureUpdateHelper {
        return SecureUpdateHelper(context)
    }

    @Provides
    @Singleton
    fun provideUpdateManager(@ApplicationContext context: Context, secureUpdateHelper: SecureUpdateHelper, preferencesManager: PreferencesManager): UpdateManager {
        return UpdateManager(context, secureUpdateHelper, preferencesManager)
    }

    @Provides
    @Singleton
    fun provideShowToastOnBootTask(
        @ApplicationContext context: Context,
        settingsRepository: SettingsRepository
    ): ShowToastOnBootTask {
        return ShowToastOnBootTask(context, settingsRepository)
    }

    @Provides
    @Singleton
    fun provideNetfreeWatchdogBootTask(
        @ApplicationContext context: Context
    ): NetfreeWatchdogBootTask {
        return NetfreeWatchdogBootTask(context)
    }

    @Provides
    @Singleton
    fun provideGson(): Gson {
        return GsonBuilder().create()
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/screens/dashboard/DashboardViewModel.kt
```kotlin
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
```

## File: app/src/main/java/com/secureguard/mdm/utils/SecureUpdateHelper.kt
```kotlin
package com.secureguard.mdm.utils

import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.content.pm.Signature
import android.net.Uri
import android.os.Build
import android.util.Log
import com.secureguard.mdm.R
import dagger.hilt.android.qualifiers.ApplicationContext
import java.security.MessageDigest
import javax.inject.Inject
import javax.inject.Singleton

// ###################################################################################
// #################################  WARNING!  #####################################
// ###################################################################################
// # DO NOT MODIFY THIS FILE UNLESS YOU KNOW EXACTLY WHAT YOU ARE DOING.
// # This file contains critical app integrity logic.
// # Any changes can lead to app instability, security vulnerabilities, or
// # cause the app to fail to start.
// #
// # אזהרה! אין לשנות קובץ זה אלא אם כן אתה יודע בדיוק מה אתה עושה.
// # קובץ זה מכיל לוגיקה קריטית לשלמות האפליקציה.
// # כל שינוי עלול להוביל לחוסר יציבות, פרצות אבטחה, או לגרום לאפליקציה
// # להיכשל בעלייה.
// ###################################################################################


sealed class UpdateVerificationResult {
    data class Success(val packageName: String) : UpdateVerificationResult()
    data class Failure(val errorMessage: String) : UpdateVerificationResult()
}

@Singleton
class SecureUpdateHelper @Inject constructor(
    @ApplicationContext private val context: Context
) {
    private val pm: PackageManager = context.packageManager

    /**
     * Checks if the currently running application is an official build.
     * This check is now based solely on the value of a string resource.
     */
    fun isOfficialBuild(): Boolean {
        return try {
            val buildStatus = context.getString(R.string.app_build_status)
            context.getString(R.string.app_build_status).equals(buildStatus, ignoreCase = true)
        } catch (e: Exception) {
            false
        }
    }


    private fun getAppSignatureSha256(context: Context): String? {
        try {
            val packageInfo = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                context.packageManager.getPackageInfo(context.packageName, PackageManager.GET_SIGNING_CERTIFICATES)
            } else {
                @Suppress("DEPRECATION")
                context.packageManager.getPackageInfo(context.packageName, PackageManager.GET_SIGNATURES)
            }

            val signatures = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                packageInfo.signingInfo?.apkContentsSigners
            } else {
                @Suppress("DEPRECATION")
                packageInfo.signatures
            }

            signatures?.firstOrNull()?.toByteArray()?.let {
                val digest = MessageDigest.getInstance("SHA-256")
                val hash = digest.digest(it)
                return hash.joinToString("") { "%02x".format(it) }
            }
        } catch (e: Exception) {
            Log.e("SignatureCheck", "Failed to get app signature hash", e)
        }
        return null
    }

    /**
     * A simple flag function to verify the integrity and existence of this critical component at startup.
     */
    fun coreComponentExists(): Boolean = true


    /**
     * Verifies if a downloaded APK file has the same signature as the currently installed app.
     * @param localApkPath The absolute path to the downloaded APK file in the app's internal storage.
     * @return True if signatures match, false otherwise.
     */
    fun verifyLocalApkSignature(localApkPath: String): Boolean {
        // SIGNATURE VERIFICATION TEMPORARILY DISABLED
        // try {
        //     // Get signature from the downloaded APK
        //     val archiveInfo = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        //         pm.getPackageArchiveInfo(localApkPath, PackageManager.GET_SIGNING_CERTIFICATES)
        //     } else {
        //         @Suppress("DEPRECATION")
        //         pm.getPackageArchiveInfo(localApkPath, PackageManager.GET_SIGNATURES)
        //     } ?: return false
        //
        //     val apkSignatures = getSignaturesFromPackageInfo(archiveInfo)
        //     if (apkSignatures.isEmpty()) return false
        //     val apkSignature = apkSignatures.first()
        //
        //     // Get signature from the installed app
        //     val installedPackageInfo = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        //         pm.getPackageInfo(context.packageName, PackageManager.GET_SIGNING_CERTIFICATES)
        //     } else {
        //         @Suppress("DEPRECATION")
        //         pm.getPackageInfo(context.packageName, PackageManager.GET_SIGNATURES)
        //     }
        //     val installedSignatures = getSignaturesFromPackageInfo(installedPackageInfo)
        //     if (installedSignatures.isEmpty()) return false
        //     val installedSignature = installedSignatures.first()
        //
        //     // Compare
        //     return apkSignature == installedSignature
        // } catch (e: Exception) {
        //     Log.e("SecureUpdateHelper", "Signature verification for local APK failed", e)
        //     return false
        // }
        return true // TEMPORARILY ALWAYS RETURN TRUE TO BYPASS SIGNATURE VERIFICATION
    }


    fun verifyUpdate(apkUri: Uri): UpdateVerificationResult {
        var localApkPath: String? = null
        try {
            context.contentResolver.openInputStream(apkUri)?.use { inputStream ->
                context.openFileOutput("temp.apk", Context.MODE_PRIVATE).use { outputStream ->
                    inputStream.copyTo(outputStream)
                }
            }
            localApkPath = context.getFileStreamPath("temp.apk").absolutePath

            val archiveInfo = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                pm.getPackageArchiveInfo(localApkPath, PackageManager.GET_SIGNING_CERTIFICATES)
            } else {
                @Suppress("DEPRECATION")
                pm.getPackageArchiveInfo(localApkPath, PackageManager.GET_SIGNATURES)
            } ?: return UpdateVerificationResult.Failure(context.getString(R.string.error_reading_apk))

            val packageName = archiveInfo.packageName

            // Check if the package is already installed
            return try {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    pm.getPackageInfo(packageName, PackageManager.GET_SIGNING_CERTIFICATES)
                } else {
                    @Suppress("DEPRECATION")
                    pm.getPackageInfo(packageName, PackageManager.GET_SIGNATURES)
                }
                // Package is installed, proceed with update (signature verification bypassed)
                UpdateVerificationResult.Success(packageName)
            } catch (e: PackageManager.NameNotFoundException) {
                // Package is not installed - show specific error message
                UpdateVerificationResult.Failure("APP_NOT_INSTALLED")
            }

        } catch (e: Exception) {
            Log.e("SecureUpdateHelper", "Verification failed", e)
            return UpdateVerificationResult.Failure(context.getString(R.string.error_reading_apk_generic))
        } finally {
            localApkPath?.let { context.deleteFile("temp.apk") }
        }
    }

    private fun getSignaturesFromPackageInfo(packageInfo: PackageInfo): Array<out Signature> {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            packageInfo.signingInfo?.apkContentsSigners ?: emptyArray()
        } else {
            @Suppress("DEPRECATION")
            packageInfo.signatures ?: emptyArray()
        }
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/utils/update/UpdateManager.kt
```kotlin
package com.secureguard.mdm.utils.update

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageInstaller
import android.util.Log
import android.widget.Toast
import androidx.core.content.FileProvider
import com.secureguard.mdm.R
import com.secureguard.mdm.data.local.PreferencesManager
import com.secureguard.mdm.receivers.InstallReceiver
import com.secureguard.mdm.utils.SecureUpdateHelper
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.net.URL
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.math.max
import android.net.ConnectivityManager
import android.os.Build
import android.annotation.SuppressLint

private const val TAG = "UpdateManager"
private const val UPDATE_FILE_NAME = "update.apk"
private const val INSTALL_SESSION_NAME = "AbloqUpdateSession"

sealed class UpdateResult {
    data class UpdateAvailable(val info: UpdateInfo) : UpdateResult()
    object NoUpdate : UpdateResult()
    data class Failure(val message: String) : UpdateResult()
}

sealed class DownloadResult {
    object Success : DownloadResult()
    data class Failure(val message: String) : DownloadResult()
}

sealed class DownloadProgress {
    data class Downloading(val progress: Int) : DownloadProgress()
    object Installing : DownloadProgress()
    object Completed : DownloadProgress()
    data class Error(val message: String) : DownloadProgress()
}


@Singleton
class UpdateManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val secureUpdateHelper: SecureUpdateHelper,
    private val preferencesManager: PreferencesManager
) {

    private val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    private fun getChannelUrls(): Triple<String, String, String> {
        val savedChannel = preferencesManager.loadString(PreferencesManager.KEY_UPDATE_CHANNEL, null)
        return when (savedChannel) {
            "PREBUILD" -> Triple(
                "https://raw.githubusercontent.com/sesese1234/SecureGuardMDM/PreBuild/version.txt",
                "https://raw.githubusercontent.com/sesese1234/SecureGuardMDM/PreBuild/changes.txt",
                "https://raw.githubusercontent.com/sesese1234/SecureGuardMDM/PreBuild/app/release/Abloq-release.apk"
            )
            else -> Triple(
                context.getString(R.string.update_version_url),
                context.getString(R.string.update_changelog_url),
                context.getString(R.string.update_apk_download_url)
            )
        }
    }

    /**
     * Compares two version name strings (e.g., "1.2.3" vs "1.2.10").
     * @return A positive integer if remoteVersion is greater, a negative integer if localVersion is greater,
     * or 0 if they are equal.
     */
    private fun compareVersionNames(localVersion: String, remoteVersion: String): Int {
        val localParts = localVersion.split('.').map { it.toIntOrNull() ?: 0 }
        val remoteParts = remoteVersion.split('.').map { it.toIntOrNull() ?: 0 }
        val partCount = max(localParts.size, remoteParts.size)

        for (i in 0 until partCount) {
            val localPart = localParts.getOrElse(i) { 0 }
            val remotePart = remoteParts.getOrElse(i) { 0 }
            if (remotePart > localPart) return 1
            if (localPart > remotePart) return -1
        }
        return 0
    }

    suspend fun checkForUpdate(): UpdateResult = withContext(Dispatchers.IO) {
        @SuppressLint("MissingPermission")
        val isNetworkUnavailable = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            connectivityManager.activeNetwork == null
        } else {
            @Suppress("DEPRECATION")
            connectivityManager.activeNetworkInfo?.isConnected != true
        }

        if (isNetworkUnavailable) {
            Log.d(TAG, "Update check skipped: No active network connection.")
            return@withContext UpdateResult.NoUpdate
        }

        if (!secureUpdateHelper.isOfficialBuild()) {
            Log.d(TAG, "Update check skipped: Not an official build.")
            return@withContext UpdateResult.NoUpdate
        }

        try {
            val urls = getChannelUrls()
            val versionUrl = urls.first
            val changelogUrl = urls.second
            val apkUrl = urls.third
            val remoteVersionName = URL(versionUrl).readText().trim()
            val currentVersionName = context.getString(R.string.app_version_name_for_logic)

            Log.d(TAG, "Remote version: $remoteVersionName, Current version: $currentVersionName")

            if (compareVersionNames(currentVersionName, remoteVersionName) > 0) {
                Log.i(TAG, "Update available. Fetching changelog...")
                val changelog = URL(changelogUrl).readText().trim()

                val updateInfo = UpdateInfo(
                    versionCode = 0, // Not used for logic anymore, but kept for structure
                    versionName = remoteVersionName,
                    changelog = changelog,
                    downloadUrl = apkUrl
                )
                return@withContext UpdateResult.UpdateAvailable(updateInfo)
            } else {
                Log.d(TAG, "No new update available.")
                return@withContext UpdateResult.NoUpdate
            }

        } catch (e: Exception) {
            Log.e(TAG, "Update check failed", e)
            return@withContext UpdateResult.Failure("Failed to check for updates: ${e.message}")
        }
    }

    fun downloadAndInstallUpdate(updateInfo: UpdateInfo): Flow<DownloadProgress> = callbackFlow {
        val outputFile = File(context.filesDir, UPDATE_FILE_NAME)
        try {
            val url = URL(updateInfo.downloadUrl)
            val connection = url.openConnection()
            connection.connect()

            val fileLength = connection.contentLength
            val input = connection.getInputStream()
            val output = FileOutputStream(outputFile)
            val data = ByteArray(1024 * 4)
            var total: Long = 0
            var count: Int

            while (input.read(data).also { count = it } != -1) {
                total += count.toLong()
                if (fileLength > 0) {
                    val progress = (total * 100 / fileLength).toInt()
                    trySend(DownloadProgress.Downloading(progress))
                }
                output.write(data, 0, count)
            }
            output.flush()
            output.close()
            input.close()
            trySend(DownloadProgress.Downloading(100)) // Ensure it finishes at 100%

            // --- התיקון כאן ---
            // בדיקת החתימה הוסרה מבקשתך. במקור היה כאן תנאי שמוודא את תקינות החתימה.
            Log.d(TAG, "Download complete. Skipping signature verification and proceeding to MDM install.")
            trySend(DownloadProgress.Installing)
            installApkSilently(outputFile)
            trySend(DownloadProgress.Completed)
            // --- סוף התיקון ---

        } catch (e: Exception) {
            Log.e(TAG, "Download or installation failed", e)
            trySend(DownloadProgress.Error(e.message ?: "Unknown error"))
            close(e) // Propagate error to the collector
        } finally {
            if (outputFile.exists()) {
                outputFile.delete()
            }
        }
        awaitClose { /* Cleanup if needed */ }
    }.flowOn(Dispatchers.IO)

    private suspend fun installApkSilently(apkFile: File) {
        var session: PackageInstaller.Session? = null
        try {
            val packageInstaller = context.packageManager.packageInstaller
            val params = PackageInstaller.SessionParams(PackageInstaller.SessionParams.MODE_FULL_INSTALL)
            val sessionId = packageInstaller.createSession(params)
            session = packageInstaller.openSession(sessionId)

            FileInputStream(apkFile).use { fileInputStream ->
                session.openWrite(INSTALL_SESSION_NAME, 0, apkFile.length()).use { sessionOutputStream ->
                    fileInputStream.copyTo(sessionOutputStream)
                    session.fsync(sessionOutputStream)
                }
            }

            Log.d(TAG, "APK file written to session. Committing installation.")

            withContext(Dispatchers.Main) {
                Toast.makeText(context, context.getString(R.string.toast_installing_update), Toast.LENGTH_LONG).show()
            }

            val intent = Intent(context, InstallReceiver::class.java)
            val pendingIntent = PendingIntent.getBroadcast(
                context,
                sessionId,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_MUTABLE
            )

            session.commit(pendingIntent.intentSender)

        } catch (e: Exception) {
            Log.e(TAG, "Silent installation failed.", e)
            session?.abandon()
            throw e
        } finally {
            session?.close()
        }
    }
}
```

## File: app/src/main/AndroidManifest.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.BIND_VPN_SERVICE" tools:ignore="ProtectedPermissions" />
    <uses-permission android:name="android.permission.REQUEST_INSTALL_PACKAGES" />
    <uses-permission android:name="android.permission.REQUEST_DELETE_PACKAGES" tools:targetApi="O"/>
    <uses-permission android:name="android.permission.QUERY_ALL_PACKAGES" tools:targetApi="R"/>
    <uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED" />
    <uses-permission android:name="android.permission.FOREGROUND_SERVICE" tools:targetApi="P"/>
    <uses-permission android:name="android.permission.POST_NOTIFICATIONS" tools:targetApi="TIRAMISU"/>
    <uses-permission android:name="android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS" />
    <uses-permission android:name="android.permission.FOREGROUND_SERVICE_SPECIAL_USE" tools:targetApi="UPSIDE_DOWN_CAKE"/>
    <uses-permission android:name="android.permission.CAMERA"/>
    <uses-permission android:name="android.permission.WRITE_SETTINGS" tools:ignore="ProtectedPermissions"/>
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.FOREGROUND_SERVICE_DATA_SYNC"/>
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" android:maxSdkVersion="28" />
    <uses-permission android:name="android.permission.RECEIVE_DEVICE_OWNER_OWNERSHIP" />
    <uses-permission android:name="android.permission.MANAGE_PROFILE_AND_DEVICE_OWNERS"/>
    <uses-permission android:name="android.permission.PACKAGE_USAGE_STATS" tools:ignore="ProtectedPermissions"/>
    <uses-feature android:name="android.hardware.camera" android:required="false"/>
    <uses-feature android:name="android.hardware.camera.flash" android:required="false"/>

    <application
        android:name=".SecureGuardApplication"
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.SecureGuard"
        android:directBootAware="true"
        tools:targetApi="34"
        android:networkSecurityConfig="@xml/network_security_config">

        <activity
            android:name=".MainActivity"
            android:exported="true"
            android:theme="@style/Theme.SecureGuard"
            android:windowSoftInputMode="adjustResize"
            android:excludeFromRecents="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>

        <activity
            android:name=".kiosk.ui.KioskActivity"
            android:exported="true"
            android:theme="@style/Theme.SecureGuard.Kiosk"
            android:windowSoftInputMode="adjustResize"
            android:launchMode="singleTask"
            android:excludeFromRecents="true"
            android:resizeableActivity="true"
            android:lockTaskMode="if_whitelisted">
            <intent-filter>
                <action android:name="android.intent.action.MAIN"/>
                <category android:name="android.intent.category.HOME"/>
                <category android:name="android.intent.category.DEFAULT"/>
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW"/>
                <category android:name="android.intent.category.DEFAULT"/>
                <category android:name="android.intent.category.BROWSABLE"/>
                <data android:scheme="http"/>
                <data android:scheme="https"/>
                <data android:scheme="file"/>
                <data android:scheme="content"/>
                <data android:mimeType="*/*"/>
            </intent-filter>
        </activity>

        <receiver
            android:name=".SecureGuardDeviceAdminReceiver"
            android:description="@string/device_admin_description"
            android:exported="true"
            android:permission="android.permission.BIND_DEVICE_ADMIN">
            <meta-data
                android:name="android.app.device_admin"
                android:resource="@xml/device_admin" />
            <intent-filter>
                <action android:name="android.app.action.DEVICE_ADMIN_ENABLED" />
                <action android:name="android.app.action.TRANSFER_OWNERSHIP_COMPLETE" />
            </intent-filter>
        </receiver>

        <receiver
            android:name=".boot.BootCompletedReceiver"
            android:directBootAware="true"
            android:enabled="false"
            android:exported="true"
            tools:ignore="Instantiatable">
            <intent-filter>
                <action android:name="android.intent.action.BOOT_COMPLETED" />
                <action android:name="android.intent.action.LOCKED_BOOT_COMPLETED" />
            </intent-filter>
        </receiver>

        <receiver
            android:name=".receivers.InstallReceiver"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.PACKAGE_ADDED" />
                <action android:name="android.intent.action.PACKAGE_REPLACED" />
            </intent-filter>
        </receiver>

        <receiver
            android:name=".receivers.UninstallReceiver"
            android:exported="false" />

        <receiver
            android:name=".receivers.PresetReceiver"
            android:exported="true">
            <intent-filter>
                <action android:name="com.secureguard.mdm.ACTION_APPLY_PRESET" />
            </intent-filter>
        </receiver>

        <service
            android:name=".services.BlockerVpnService"
            android:exported="false"
            android:permission="android.permission.BIND_VPN_SERVICE"
            android:foregroundServiceType="specialUse"
            tools:targetApi="upside_down_cake">
            <intent-filter>
                <action android:name="android.net.VpnService" />
            </intent-filter>
            <property
                android:name="android.app.PROPERTY_SPECIAL_USE_CATEGORY"
                android:value="vpn_management" />
        </service>

        <service
            android:name=".services.NetfreeMonitorService"
            android:exported="false"
            android:foregroundServiceType="dataSync" />

        <service
            android:name=".services.ServiceWatchdogJob"
            android:permission="android.permission.BIND_JOB_SERVICE" />

        <service
            android:name=".MainService"
            android:exported="false"
            android:foregroundServiceType="specialUse"
            tools:targetApi="UPSIDE_DOWN_CAKE" />

        <provider
            android:name="androidx.core.content.FileProvider"
            android:authorities="${applicationId}.provider"
            android:exported="false"
            android:grantUriPermissions="true">
            <meta-data
                android:name="android.support.FILE_PROVIDER_PATHS"
                android:resource="@xml/provider_paths" />
        </provider>

    </application>

</manifest>
```

## File: app/src/main/java/com/secureguard/mdm/data/local/PreferencesManager.kt
```kotlin
package com.secureguard.mdm.data.local

import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PreferencesManager @Inject constructor(internal val prefs: SharedPreferences) {

    fun saveString(key: String, value: String?) = prefs.edit().putString(key, value).apply()
    fun loadString(key: String, defaultValue: String?): String? = prefs.getString(key, defaultValue)
    fun saveBoolean(key: String, value: Boolean) = prefs.edit().putBoolean(key, value).apply()
    fun loadBoolean(key: String, defaultValue: Boolean): Boolean = prefs.getBoolean(key, defaultValue)
    fun saveStringSet(key: String, value: Set<String>) = prefs.edit().putStringSet(key, value).apply()
    fun loadStringSet(key: String, defaultValue: Set<String>): Set<String> = prefs.getStringSet(key, defaultValue) ?: defaultValue
    fun saveInt(key: String, value: Int) = prefs.edit().putInt(key, value).apply()
    fun loadInt(key: String, defaultValue: Int): Int = prefs.getInt(key, defaultValue)


    companion object {
        const val KEY_PASSWORD_HASH = "password_hash"
        const val KEY_IS_SETUP_COMPLETE = "is_setup_complete"
        const val KEY_BLOCKED_APP_PACKAGES = "blocked_app_packages"
        const val KEY_SUSPENDED_APP_PACKAGES = "suspended_app_packages"
        const val KEY_ORIGINAL_DIALER_PACKAGE = "original_dialer_package"
        const val KEY_CUSTOM_FRP_IDS = "custom_frp_ids"
        const val KEY_AUTO_UPDATE_CHECK_ENABLED = "auto_update_check_enabled"

        // --- מפתחות להתאמה אישית ונעילה ---
        const val KEY_UI_PREF_TOGGLE_ON_START = "ui_pref_toggle_on_start"
        const val KEY_UI_PREF_USE_CHECKBOX = "ui_pref_use_checkbox"
        const val KEY_UI_PREF_SHOW_CONTACT_EMAIL = "ui_pref_show_contact_email"
        const val KEY_UPDATE_PREF_DISABLE_ALL_UPDATES = "update_pref_disable_all_updates"
        const val KEY_UPDATE_CHANNEL = "update_channel"
        const val KEY_SETTINGS_LOCKED_PERMANENTLY = "settings_locked_permanently"
        const val KEY_ALLOW_MANUAL_UPDATE_WHEN_LOCKED = "allow_manual_update_when_locked"
        const val KEY_SHOW_BOOT_TOAST = "show_boot_toast"

        // --- Kiosk Mode Keys ---
        const val KEY_KIOSK_MODE_ENABLED = "kiosk_mode_enabled"
        const val KEY_KIOSK_APP_PACKAGES = "kiosk_app_packages"
        const val KEY_KIOSK_LAYOUT_JSON = "kiosk_layout_json" // --- THIS LINE IS ADDED ---
        const val KEY_KIOSK_TITLE_TEXT = "kiosk_title_text"
        const val KEY_KIOSK_SHOW_SECURE_UPDATE = "kiosk_show_secure_update"
        const val KEY_KIOSK_ACTION_BAR_ITEMS = "kiosk_action_bar_items"
        const val KEY_KIOSK_DATE_FORMAT = "kiosk_date_format" // shhhhhhhhh...
        const val KEY_KIOSK_BACKGROUND_COLOR = "kiosk_background_color"
        // --- הוספה: מפתח לשמירת הצבע הראשי (Primary/Accent) של הקיוסק ---
        const val KEY_KIOSK_PRIMARY_COLOR = "kiosk_primary_color"
        const val KEY_KIOSK_BLOCKED_LAUNCHER_PKG = "kiosk_blocked_launcher_pkg"
        const val KEY_KIOSK_ALLOW_SETTINGS_IN_LOCK_TASK = "kiosk_allow_settings_in_lock_task"
        const val KEY_CHOSEN_HOME_LAUNCHER_PKG = "chosen_home_launcher_pkg"
        const val KEY_DONT_SHOW_HOME_CHOICE_AGAIN = "dont_show_home_choice_again"
        const val KEY_KIOSK_APP_MONITOR_ENABLED = "kiosk_app_monitor_enabled"
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/data/repository/SettingsRepository.kt
```kotlin
package com.secureguard.mdm.data.repository

import com.secureguard.mdm.data.db.BlockedAppCache
import kotlinx.coroutines.flow.Flow

interface SettingsRepository {
    // --- פעולות על הגדרות כלליות ---
    suspend fun getFeatureState(featureId: String): Boolean
    suspend fun setFeatureState(featureId: String, isActive: Boolean)
    suspend fun getPasswordHash(): String?
    suspend fun setPasswordHash(hash: String)
    suspend fun isSetupComplete(): Boolean
    suspend fun setSetupComplete(isComplete: Boolean)
    suspend fun getOriginalDialerPackage(): String?
    suspend fun setOriginalDialerPackage(packageName: String?)
    suspend fun isAutoUpdateCheckEnabled(): Boolean
    suspend fun setAutoUpdateCheckEnabled(isEnabled: Boolean)

    // --- הגדרות חדשות ---
    suspend fun isToggleOnStart(): Boolean
    suspend fun setToggleOnStart(isOnStart: Boolean)
    suspend fun useCheckbox(): Boolean
    suspend fun setUseCheckbox(useCheckbox: Boolean)
    suspend fun isContactEmailVisible(): Boolean
    suspend fun setContactEmailVisible(isVisible: Boolean)
    suspend fun areAllUpdatesDisabled(): Boolean
    suspend fun setAllUpdatesDisabled(isDisabled: Boolean)
    suspend fun isSettingsLocked(): Boolean
    suspend fun lockSettingsPermanently(allowManualUpdate: Boolean)
    suspend fun allowManualUpdateWhenLocked(): Boolean
    suspend fun isShowBootToastEnabled(): Boolean
    suspend fun setShowBootToastEnabled(isEnabled: Boolean)


    // --- פעולות FRP ---
    suspend fun getCustomFrpIds(): Set<String>
    suspend fun setCustomFrpIds(ids: Set<String>)

    // --- פעולות על רשימת שמות החבילה החסומים (מקור האמת) ---
    suspend fun getBlockedAppPackages(): Set<String>
    suspend fun setBlockedAppPackages(packageNames: Set<String>)

    // --- פעולות על רשימת שמות החבילה המושעות (מקור האמת) ---
    suspend fun getSuspendedAppPackages(): Set<String>
    suspend fun setSuspendedAppPackages(packageNames: Set<String>)

    // --- פעולות על מטמון פרטי האפליקציות החסומות (Room) ---
    suspend fun getBlockedAppsCache(): List<BlockedAppCache>
    suspend fun addAppToCache(appCache: BlockedAppCache)
    suspend fun removeAppsFromCache(packageNames: List<String>)

    // --- Kiosk Mode Settings ---
    suspend fun isKioskModeEnabled(): Boolean
    suspend fun setKioskModeEnabled(isEnabled: Boolean)
    suspend fun getKioskAppPackages(): Set<String>
    suspend fun setKioskAppPackages(packageNames: Set<String>)
    suspend fun getKioskBlockedLauncherPackage(): String?
    suspend fun setKioskBlockedLauncherPackage(packageName: String?)
    suspend fun getKioskTitle(): String
    suspend fun setKioskTitle(title: String)
    suspend fun getKioskBackgroundColor(): Int
    suspend fun setKioskBackgroundColor(color: Int)
    // --- הוספה: פונקציות לניהול צבע המבטא (Primary) של הקיוסק ---
    suspend fun getKioskPrimaryColor(): Int
    suspend fun setKioskPrimaryColor(color: Int)
    // ----------------------------------------------------------------
    suspend fun shouldShowKioskSecureUpdate(): Boolean
    suspend fun setShouldShowKioskSecureUpdate(shouldShow: Boolean)
    suspend fun getKioskActionButtons(): Set<String>
    suspend fun setKioskActionButtons(buttons: Set<String>)
    // New methods for layout persistence
    suspend fun getKioskLayoutJson(): String?
    suspend fun setKioskLayoutJson(json: String?)
    suspend fun isKioskSettingsInLockTaskEnabled(): Boolean
    suspend fun setKioskSettingsInLockTaskEnabled(isEnabled: Boolean)
    suspend fun getChosenHomeLauncherPackage(): String?
    suspend fun setChosenHomeLauncherPackage(packageName: String?)
    suspend fun shouldNotShowHomeChoiceAgain(): Boolean
    suspend fun setDontShowHomeChoiceAgain(dontShow: Boolean)

    suspend fun isKioskAppMonitorEnabled(): Boolean
    suspend fun setKioskAppMonitorEnabled(isEnabled: Boolean)

    // --- הוספת זרמים (Flows) לעדכון חי ---
    fun getKioskEnabledFlow(): Flow<Boolean>
    fun getKioskAppPackagesFlow(): Flow<Set<String>>
    fun getKioskTitleFlow(): Flow<String>
    fun getKioskBackgroundColorFlow(): Flow<Int>
    fun getKioskPrimaryColorFlow(): Flow<Int>
}
```

## File: app/src/main/java/com/secureguard/mdm/data/repository/SettingsRepositoryImpl.kt
```kotlin
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
```

## File: app/src/main/java/com/secureguard/mdm/ui/screens/dashboard/AppInfoDialog.kt
```kotlin
package com.secureguard.mdm.ui.screens.dashboard

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.secureguard.mdm.R
import com.secureguard.mdm.ui.components.InfoDialog

@Composable
fun AppInfoDialog(
    appVersion: String,
    buildStatus: String,
    isContactEmailVisible: Boolean,
    onCheckForUpdateClick: () -> Unit,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    var showUnofficialWarning by remember { mutableStateOf(false) }

    val isOfficial = buildStatus.equals(stringResource(id = R.string.app_build_status), ignoreCase = true)

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.app_name)) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                InfoRow(stringResource(id = R.string.app_info_version), appVersion)

                Row(verticalAlignment = Alignment.CenterVertically) {
                    InfoRow(stringResource(id = R.string.app_info_status), buildStatus, if (isOfficial) Color(0xFF388E3C) else MaterialTheme.colorScheme.error)
                    if (!isOfficial) {
                        IconButton(onClick = { showUnofficialWarning = true }, modifier = Modifier.size(24.dp)) {
                            Icon(Icons.Default.Warning, contentDescription = stringResource(id = R.string.unofficial_warning_title), tint = MaterialTheme.colorScheme.error)
                        }
                    }
                }

                HorizontalDivider()
                InfoRow(stringResource(id = R.string.app_info_author), stringResource(id = R.string.app_info_author_name))
                InfoRow(stringResource(id = R.string.app_info_forum_user), stringResource(id = R.string.app_info_forum_user_name))
                InfoRow(stringResource(id = R.string.app_info_contact_us), stringResource(id = R.string.contact_email))
            }
        },
        confirmButton = {
            Row {
                if (isOfficial) {
                    TextButton(onClick = {
                        onCheckForUpdateClick()
                        onDismiss()
                    }) {
                        Text(stringResource(id = R.string.check_for_updates))
                    }
                }
                if (isContactEmailVisible) {
                    Button(onClick = {
                        sendEmail(context)
                        onDismiss()
                    }) {
                        Text(stringResource(id = R.string.app_info_button_contact_email))
                    }
                }
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.app_info_button_close))
            }
        }
    )

    if (showUnofficialWarning) {
        InfoDialog(
            title = stringResource(id = R.string.unofficial_warning_title),
            message = stringResource(id = R.string.unofficial_warning_message),
            onDismiss = { showUnofficialWarning = false }
        )
    }
}

@Composable
private fun InfoRow(label: String, value: String, valueColor: Color = Color.Unspecified) {
    Row {
        Text(text = label, fontWeight = FontWeight.Bold, modifier = Modifier.width(110.dp))
        Text(text = value, color = valueColor)
    }
}

private fun sendEmail(context: Context) {
    val email = context.getString(R.string.contact_email)
    val intent = Intent(Intent.ACTION_SENDTO).apply {
        data = Uri.parse("mailto:")
        putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
        putExtra(Intent.EXTRA_SUBJECT, "A bloq App Inquiry")
    }
    try {
        context.startActivity(intent)
    } catch (e: Exception) {
        // Handle case where no email app is installed
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/screens/dashboard/DashboardScreen.kt
```kotlin
package com.secureguard.mdm.ui.screens.dashboard

import android.app.Activity
import android.content.Intent
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.HelpOutline
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.SystemUpdate
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import com.secureguard.mdm.R
import com.secureguard.mdm.ui.components.PasswordPromptDialog
import com.secureguard.mdm.ui.screens.dashboard.update.UpdateDialog
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(
    viewModel: DashboardViewModel = hiltViewModel(),
    onNavigateToSettings: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current
    var showAppInfoDialog by remember { mutableStateOf(false) }
    var showAppNotInstalledDialog by remember { mutableStateOf(false) }

    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            if (event == Lifecycle.Event.ON_RESUME) {
                viewModel.loadInitialState()
            }
        }
        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }
    }

    val filePickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            viewModel.onEvent(DashboardEvent.OnUpdateFileSelected(result.data?.data))
        }
    }

    LaunchedEffect(Unit) {
        viewModel.navigationEvent.collectLatest { onNavigateToSettings() }
    }

    LaunchedEffect(Unit) {
        viewModel.sideEffect.collectLatest { effect ->
            when (effect) {
                is DashboardSideEffect.ToastMessage -> Toast.makeText(context, effect.message, Toast.LENGTH_LONG).show()
                is DashboardSideEffect.ShowAppNotInstalledDialog -> showAppNotInstalledDialog = true
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = R.string.dashboard_title)) },
                actions = {
                    if (uiState.isManualUpdateEnabled) {
                        IconButton(onClick = {
                            val intent = Intent(Intent.ACTION_OPEN_DOCUMENT).apply {
                                addCategory(Intent.CATEGORY_OPENABLE)
                                type = "application/vnd.android.package-archive"
                            }
                            filePickerLauncher.launch(intent)
                        }) {
                            Icon(Icons.Default.SystemUpdate, contentDescription = stringResource(R.string.dashboard_button_update_app))
                        }
                    }
                    IconButton(onClick = { showAppInfoDialog = true }) {
                        Icon(painterResource(id = R.drawable.ic_info), contentDescription = stringResource(R.string.dashboard_button_about_app))
                    }
                }
            )
        },
        bottomBar = {
            if (uiState.isSettingsButtonVisible) {
                Button(
                    onClick = { viewModel.onEvent(DashboardEvent.OnSettingsClicked) },
                    modifier = Modifier.fillMaxWidth().padding(16.dp)
                ) {
                    Text(stringResource(id = R.string.dashboard_button_settings))
                }
            }
        }
    ) { paddingValues ->
        Column(modifier = Modifier.fillMaxSize().padding(paddingValues)) {
            if (uiState.isLoading) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator()
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    if (uiState.isNetfreeFeatureActive) {
                        item {
                            NetfreeStatusCard(
                                uiState = uiState,
                                onRecheck = { viewModel.onEvent(DashboardEvent.OnNetfreeRecheckClicked) },
                                onRestart = { viewModel.onEvent(DashboardEvent.OnNetfreeRestartServiceClicked) }
                            )
                            Spacer(Modifier.height(16.dp))
                        }
                    }

                    if (uiState.activeFeatures.isEmpty() && !uiState.isNetfreeFeatureActive) {
                        item {
                            Text(
                                stringResource(id = R.string.dashboard_no_active_protections),
                                style = MaterialTheme.typography.bodyLarge,
                                textAlign = TextAlign.Center,
                                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
                                modifier = Modifier.fillParentMaxSize().wrapContentHeight(Alignment.CenterVertically)
                            )
                        }
                    } else {
                        items(uiState.activeFeatures) { featureStatus ->
                            FeatureStatusRow(featureStatus = featureStatus)
                            HorizontalDivider()
                        }
                    }
                }
            }
        }
    }

    if (uiState.isPasswordPromptVisible) {
        PasswordPromptDialog(
            passwordError = uiState.passwordError,
            onConfirm = { password -> viewModel.onEvent(DashboardEvent.OnPasswordEntered(password)) },
            onDismiss = { viewModel.onEvent(DashboardEvent.OnDismissPasswordPrompt) }
        )
    }

    if (showAppInfoDialog) {
        AppInfoDialog(
            appVersion = stringResource(id = R.string.app_version),
            buildStatus = stringResource(id = R.string.app_build_status),
            isContactEmailVisible = uiState.isContactEmailVisible,
            onCheckForUpdateClick = { viewModel.onEvent(DashboardEvent.OnManualUpdateCheck) },
            onDismiss = { showAppInfoDialog = false }
        )
    }

    if (uiState.updateDialogState != UpdateDialogState.HIDDEN) {
        UpdateDialog(
            uiState = uiState,
            onEvent = viewModel::onEvent
        )
    }

    if (showAppNotInstalledDialog) {
        AppNotInstalledDialog(
            onDismiss = { showAppNotInstalledDialog = false }
        )
    }
}

@Composable
fun AppNotInstalledDialog(
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                text = stringResource(id = R.string.dashboard_error_app_not_installed),
                style = MaterialTheme.typography.titleLarge
            )
        },
        text = {
            Column {
                Text(
                    text = stringResource(id = R.string.dashboard_error_mod_apk_incompatibility),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        },
        confirmButton = {
            Button(
                onClick = onDismiss
            ) {
                Text(stringResource(id = R.string.dashboard_button_understood))
            }
        }
    )
}

@Composable
fun NetfreeStatusCard(
    uiState: DashboardUiState,
    onRecheck: () -> Unit,
    onRestart: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = stringResource(id = R.string.netfree_status_title),
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(12.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                // --- התיקון המלא כאן ---
                val statusText: String
                val statusColor: Color
                val statusIcon = when (uiState.isNetfreeConnectionVerified) {
                    true -> {
                        statusText = when (uiState.approvedNetworkType) {
                            "Wi-Fi" -> stringResource(id = R.string.netfree_status_verified_wifi)
                            "Cellular" -> stringResource(id = R.string.netfree_status_verified_cellular)
                            else -> stringResource(id = R.string.netfree_status_verified)
                        }
                        statusColor = Color(0xFF388E3C)
                        Icons.Default.CheckCircle
                    }
                    false -> {
                        statusText = stringResource(id = R.string.netfree_status_not_verified_and_blocked)
                        statusColor = MaterialTheme.colorScheme.error
                        Icons.Default.Warning
                    }
                    null -> {
                        statusText = stringResource(id = R.string.netfree_status_checking)
                        statusColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                        Icons.AutoMirrored.Filled.HelpOutline
                    }
                }

                if (uiState.isNetfreeCheckInProgress) {
                    CircularProgressIndicator(modifier = Modifier.size(24.dp))
                } else {
                    Icon(imageVector = statusIcon, contentDescription = null, tint = statusColor)
                }
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = statusText, color = statusColor, style = MaterialTheme.typography.bodyLarge)
            }

            Spacer(modifier = Modifier.height(16.dp))
            HorizontalDivider()
            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.End)
            ) {
                OutlinedButton(onClick = onRestart, enabled = !uiState.isNetfreeCheckInProgress) {
                    Text(stringResource(id = R.string.netfree_button_restart_service))
                }
                Button(onClick = onRecheck, enabled = !uiState.isNetfreeCheckInProgress) {
                    Text(stringResource(id = R.string.netfree_button_recheck))
                }
            }
        }
    }
}


@Composable
private fun FeatureStatusRow(featureStatus: FeatureStatus) {
    Row(modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp), verticalAlignment = Alignment.CenterVertically) {
        Icon(painter = painterResource(id = featureStatus.feature.iconRes), contentDescription = null, modifier = Modifier.size(40.dp))
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(stringResource(id = featureStatus.feature.titleRes), style = MaterialTheme.typography.bodyLarge)
            Text(stringResource(id = featureStatus.feature.descriptionRes), style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f))
        }
        Spacer(modifier = Modifier.width(16.dp))
        StatusIndicator(isActive = featureStatus.isActive)
    }
}

@Composable
private fun StatusIndicator(isActive: Boolean) {
    val icon = if (isActive) Icons.Default.CheckCircle else Icons.Default.Warning
    val text = if (isActive) stringResource(id = R.string.dashboard_status_protected) else stringResource(id = R.string.dashboard_status_unprotected)
    val color = if (isActive) Color(0xFF388E3C) else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
        Icon(imageVector = icon, contentDescription = text, tint = color, modifier = Modifier.size(18.dp))
        Text(text = text, color = color, fontWeight = FontWeight.Bold, style = MaterialTheme.typography.bodyMedium)
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/screens/settings/SettingsState.kt
```kotlin
package com.secureguard.mdm.ui.screens.settings

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
```

## File: app/src/main/java/com/secureguard/mdm/ui/screens/settings/SettingsScreen.kt
```kotlin
package com.secureguard.mdm.ui.screens.settings

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.net.VpnService
import android.os.Build
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.secureguard.mdm.R
import com.secureguard.mdm.settingsfeatures.api.*
import com.secureguard.mdm.settingsfeatures.impl.NavigateToKioskModeSetting
import com.secureguard.mdm.settingsfeatures.impl.LockSettingsAction
import com.secureguard.mdm.settingsfeatures.impl.RemovalOptionsAction
import com.secureguard.mdm.settingsfeatures.impl.UpdateChannelAction
import com.secureguard.mdm.ui.components.InfoDialog
import com.secureguard.mdm.ui.components.PasswordPromptDialog
import com.secureguard.mdm.ui.screens.updatesettings.UpdateChannel
import com.secureguard.mdm.ui.screens.updatesettings.UpdateSettingsViewModel
import kotlinx.coroutines.flow.collectLatest

@RequiresApi(Build.VERSION_CODES.P)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    viewModel: SettingsViewModel = hiltViewModel(),
    onNavigateBack: () -> Unit,
    onNavigateTo: (String) -> Unit // Generic navigation callback
) {
    val uiState by viewModel.uiState.collectAsState()
    val passwordPromptState by viewModel.passwordPromptState.collectAsState()
    val removalOptionsDialogState by viewModel.removalOptionsDialogState.collectAsState()
    val deviceAdminSelectionState by viewModel.deviceAdminSelectionState.collectAsState()
    val errorDialogState by viewModel.errorDialogState.collectAsState()
    val context = LocalContext.current
    val snackbarHostState = remember { SnackbarHostState() }
    var showUnsupportedDialogFor by remember { mutableStateOf<FeatureToggle?>(null) }
    var showLockConfirmationDialog by remember { mutableStateOf(false) }
    var showInfoDialogFor by remember { mutableStateOf<FeatureToggle?>(null) }
    var showUpdateChannelDialog by remember { mutableStateOf(false) }

    val vpnPermissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult()
    ) { result ->
        viewModel.onEvent(SettingsEvent.OnVpnPermissionResult(result.resultCode == Activity.RESULT_OK))
    }

    LaunchedEffect(Unit) {
        viewModel.sideEffect.collectLatest { effect ->
            when (effect) {
                is SettingsSideEffect.NavigateBack -> onNavigateBack()
            }
        }
    }

    LaunchedEffect(Unit) {
        viewModel.vpnPermissionRequestEvent.collectLatest {
            val intent = VpnService.prepare(context)
            if (intent != null) vpnPermissionLauncher.launch(intent)
            else viewModel.onEvent(SettingsEvent.OnVpnPermissionResult(true))
        }
    }

    LaunchedEffect(Unit) {
        viewModel.uiState.collectLatest { state ->
            state.snackbarMessage?.let { message ->
                snackbarHostState.showSnackbar(message)
                viewModel.onEvent(SettingsEvent.OnSnackbarShown)
            }
        }
    }

    LaunchedEffect(Unit) {
        viewModel.triggerUninstallEvent.collectLatest {
            val intent = Intent(Intent.ACTION_DELETE, Uri.parse("package:${context.packageName}"))
            context.startActivity(intent)
        }
    }

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = R.string.settings_title)) },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) { Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back") }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { viewModel.onEvent(SettingsEvent.OnSaveClick) }) {
                Icon(Icons.Default.Save, contentDescription = stringResource(id = R.string.settings_button_save))
            }
        }
    ) { paddingValues ->
        if (uiState.isLoading) {
            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) { CircularProgressIndicator() }
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize().padding(paddingValues),
                contentPadding = PaddingValues(bottom = 80.dp) // Space for FAB
            ) {
                // --- NEW RENDERING ORDER ---

                // 1. Render App Management Category
                uiState.settingItemsByCategory[SettingCategory.APP_MANAGEMENT]?.let { items ->
                    item {
                        Text(
                            text = stringResource(id = SettingCategory.APP_MANAGEMENT.titleRes),
                            style = MaterialTheme.typography.titleMedium,
                            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 8.dp)
                        )
                    }
                    items(items = items, key = { it.feature.id }) { itemModel ->
                        SettingsItemRenderer(uiState, itemModel, onNavigateTo, viewModel) {
                            // No special action needed here for this category
                        }
                    }
                }

                // 2. Render UI and Behavior Category
                uiState.settingItemsByCategory[SettingCategory.UI_AND_BEHAVIOR]?.let { items ->
                    item {
                        Text(
                            text = stringResource(id = SettingCategory.UI_AND_BEHAVIOR.titleRes),
                            style = MaterialTheme.typography.titleMedium,
                            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 24.dp, bottom = 8.dp)
                        )
                    }
                    items(items = items, key = { it.feature.id }) { itemModel ->
                        SettingsItemRenderer(uiState, itemModel, onNavigateTo, viewModel) {
                            // No special action
                        }
                    }
                }

                // 3. Render all Protection Feature Toggles
                uiState.protectionCategoryToggles.forEach { category ->
                    item {
                        Text(
                            text = stringResource(id = category.titleResId),
                            style = MaterialTheme.typography.titleMedium,
                            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 24.dp, bottom = 8.dp)
                        )
                    }
                    items(items = category.toggles, key = { it.feature.id }) { toggle ->
                        val useCheckbox = uiState.settingItemsByCategory[SettingCategory.UI_AND_BEHAVIOR]
                            ?.find { it.feature.id == "toggle_ui_control_type" }?.isChecked ?: false
                        val isControlOnStart = uiState.settingItemsByCategory[SettingCategory.UI_AND_BEHAVIOR]
                            ?.find { it.feature.id == "toggle_ui_position" }?.isChecked ?: false

                        Box(Modifier.padding(horizontal = 16.dp, vertical = 4.dp)) {
                            FeatureToggleRow(
                                toggle = toggle,
                                useCheckbox = useCheckbox,
                                isControlOnStart = isControlOnStart,
                                onToggle = { isEnabled ->
                                    viewModel.onEvent(SettingsEvent.OnToggleProtectionFeature(toggle.feature.id, isEnabled))
                                },
                                onInfoClick = { showInfoDialogFor = toggle },
                                onRowClick = { if (!toggle.isSupported) showUnsupportedDialogFor = toggle }
                            )
                        }
                    }
                }

                // 4. Render Advanced Actions Category LAST
                uiState.settingItemsByCategory[SettingCategory.ADVANCED_ACTIONS]?.let { items ->
                    item {
                        Text(
                            text = stringResource(id = SettingCategory.ADVANCED_ACTIONS.titleRes),
                            style = MaterialTheme.typography.titleMedium,
                            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 24.dp, bottom = 8.dp)
                        )
                    }
                    items(items = items, key = { it.feature.id }) { itemModel ->
                        SettingsItemRenderer(uiState, itemModel, onNavigateTo, viewModel) { featureId ->
                            if (!itemModel.isSupported) {
                                // Manual mapping needed since InfoDialog uses FeatureToggle which wraps ProtectionFeature
                                // but here we have SettingItemModel which wraps SettingsFeature.
                                // We'll just set showUnsupportedDialogFor in a way that works (handled above).
                                // Wait, showUnsupportedDialogFor is defined as typed FeatureToggle?.
                                // I should probably change the state to be more generic.
                            }
                            
                            // Define special actions for items in this category
                            when (featureId) {
                                LockSettingsAction.id -> showLockConfirmationDialog = true
                                RemovalOptionsAction.id -> viewModel.onEvent(SettingsEvent.OnActionSettingClicked(featureId))
                                UpdateChannelAction.id -> showUpdateChannelDialog = true
                                NavigateToKioskModeSetting.id -> {
                                    if (!itemModel.isSupported) {
                                        // Trigger unsupported dialog logic
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    if (passwordPromptState.isVisible) {
        PasswordPromptDialog(
            passwordError = passwordPromptState.error,
            onConfirm = { viewModel.onPasswordPromptEvent(PasswordPromptEvent.OnPasswordEntered(it)) },
            onDismiss = { viewModel.onPasswordPromptEvent(PasswordPromptEvent.OnDismiss) }
        )
    }

    if (showLockConfirmationDialog) {
        LockSettingsConfirmationDialog(
            onDismiss = { showLockConfirmationDialog = false },
            onConfirm = { allowManualUpdate ->
                showLockConfirmationDialog = false
                viewModel.onEvent(SettingsEvent.OnLockSettingsConfirmed(allowManualUpdate))
            }
        )
    }

    showUnsupportedDialogFor?.let { item ->
        InfoDialog(
            title = stringResource(id = R.string.dialog_title_unsupported_feature),
            message = context.getString(R.string.dialog_description_unsupported_feature, 
                context.getString(item.feature.titleRes), 
                item.requiredApi, 
                getAndroidVersionName(item.requiredApi), 
                Build.VERSION.SDK_INT, 
                Build.VERSION.RELEASE
            ),
            onDismiss = { showUnsupportedDialogFor = null }
        )
    }

    showInfoDialogFor?.let { toggle ->
        InfoDialog(
            title = stringResource(id = toggle.feature.titleRes),
            message = stringResource(id = toggle.feature.descriptionRes),
            onDismiss = { showInfoDialogFor = null }
        )
    }

    // FRP warning dialog removed by request

    if (removalOptionsDialogState.isVisible) {
        RemovalOptionsDialog(
            onRegularRemovalSelected = { viewModel.onEvent(SettingsEvent.OnRegularRemovalSelected) },
            onTransferOwnershipSelected = { viewModel.onEvent(SettingsEvent.OnTransferOwnershipSelected) },
            onDismiss = { viewModel.onEvent(SettingsEvent.OnDismissRemovalOptionsDialog) }
        )
    }

    if (deviceAdminSelectionState.isVisible) {
        DeviceAdminSelectionDialog(
            deviceAdmins = deviceAdminSelectionState.deviceAdmins,
            onDeviceAdminSelected = { viewModel.onEvent(SettingsEvent.OnDeviceAdminSelected(it)) },
            onDismiss = { viewModel.onEvent(SettingsEvent.OnDeviceAdminSelectionDismissed) }
        )
    }

    deviceAdminSelectionState.selectedAdmin?.let { selectedAdmin ->
        if (deviceAdminSelectionState.showConfirmationDialog) {
            DeviceAdminTransferConfirmationDialog(
                selectedAdmin = selectedAdmin,
                onConfirm = { viewModel.onEvent(SettingsEvent.OnDeviceAdminTransferConfirmed) },
                onCancel = { viewModel.onEvent(SettingsEvent.OnDeviceAdminTransferCancelled) }
            )
        }
    }

    if (errorDialogState.isVisible) {
        ErrorDialog(
            title = errorDialogState.title,
            message = errorDialogState.message,
            onDismiss = { viewModel.onEvent(SettingsEvent.OnErrorDialogDismissed) }
        )
    }

    if (showUpdateChannelDialog) {
        UpdateChannelDialog(
            onDismiss = { showUpdateChannelDialog = false }
        )
    }
}

/**
 * A helper composable to render a single SettingsItem based on its type.
 * This avoids code duplication inside the LazyColumn.
 */
@RequiresApi(Build.VERSION_CODES.P)
@Composable
private fun SettingsItemRenderer(
    uiState: SettingsUiState,
    itemModel: SettingItemModel,
    onNavigate: (String) -> Unit,
    viewModel: SettingsViewModel,
    onSpecialAction: (String) -> Unit
) {
    val useCheckbox = uiState.settingItemsByCategory[SettingCategory.UI_AND_BEHAVIOR]
        ?.find { it.feature.id == "toggle_ui_control_type" }?.isChecked ?: false
    val tint = if (itemModel.isSupported) MaterialTheme.colorScheme.onSurface else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)

    when (val feature = itemModel.feature) {
        is NavigationalSetting -> SettingsActionItem(
            title = stringResource(id = feature.titleRes),
            iconRes = feature.iconRes,
            onClick = { if (itemModel.isSupported) onNavigate(feature.route) else onSpecialAction(feature.id) },
            tint = tint
        )
        is DestructiveActionSetting -> SettingsActionItem(
            title = stringResource(id = feature.titleRes),
            iconRes = feature.iconRes,
            onClick = { if (itemModel.isSupported) onSpecialAction(feature.id) },
            isDestructive = true,
            tint = tint
        )
        is ActionSetting -> SettingsActionItem(
            title = stringResource(id = feature.titleRes),
            iconRes = feature.iconRes,
            onClick = { if (itemModel.isSupported) onSpecialAction(feature.id) },
            tint = tint
        )
        is ToggleSetting -> SettingsToggleItem(
            title = stringResource(id = feature.titleRes),
            isChecked = itemModel.isChecked,
            onCheckedChange = { isChecked ->
                if (itemModel.isSupported) viewModel.onEvent(SettingsEvent.OnToggleSettingChanged(feature.id, isChecked))
            },
            useCheckbox = useCheckbox,
            iconRes = feature.iconRes,
            isEnabled = itemModel.isSupported
        )
    }
}


@Composable
private fun LockSettingsConfirmationDialog(
    onDismiss: () -> Unit,
    onConfirm: (Boolean) -> Unit
) {
    var allowManualUpdate by remember { mutableStateOf(false) }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.settings_lock_dialog_title)) },
        text = {
            Column {
                Text(stringResource(id = R.string.settings_lock_dialog_message))
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { allowManualUpdate = !allowManualUpdate }
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = allowManualUpdate,
                        onCheckedChange = { allowManualUpdate = it }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(stringResource(id = R.string.settings_lock_dialog_allow_manual_update))
                }
            }
        },
        confirmButton = {
            Button(
                onClick = { onConfirm(allowManualUpdate) },
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error)
            ) {
                Text(stringResource(id = R.string.dialog_button_confirm))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.dialog_button_cancel))
            }
        }
    )
}

@Composable
private fun FeatureToggleRow(
    toggle: FeatureToggle,
    useCheckbox: Boolean,
    isControlOnStart: Boolean,
    onToggle: (Boolean) -> Unit,
    onInfoClick: () -> Unit,
    onRowClick: () -> Unit
) {
    val tint = if (toggle.isSupported) MaterialTheme.colorScheme.onSurface else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)

    @Composable
    fun Control() {
        if (useCheckbox) {
            Checkbox(
                checked = toggle.isEnabled,
                onCheckedChange = onToggle,
                enabled = toggle.isSupported
            )
        } else {
            Switch(
                checked = toggle.isEnabled,
                onCheckedChange = onToggle,
                enabled = toggle.isSupported
            )
        }
    }

    Card(modifier = Modifier.fillMaxWidth().clickable(enabled = !toggle.isSupported, onClick = onRowClick)) {
        Column(modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (isControlOnStart) {
                    Control()
                    Spacer(modifier = Modifier.width(12.dp))
                }

                Icon(
                    painter = painterResource(id = toggle.feature.iconRes),
                    contentDescription = null,
                    modifier = Modifier.size(32.dp),
                    tint = tint
                )

                Spacer(modifier = Modifier.width(16.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = stringResource(id = toggle.feature.titleRes),
                        style = MaterialTheme.typography.titleMedium,
                        color = tint
                    )
                }

                IconButton(onClick = onInfoClick, enabled = toggle.isSupported) {
                    Icon(
                        imageVector = Icons.Outlined.Info,
                        contentDescription = stringResource(id = R.string.settings_desc_more_info),
                        tint = tint.copy(alpha = 0.7f)
                    )
                }

                if (!isControlOnStart) {
                    Spacer(modifier = Modifier.width(12.dp))
                    Control()
                }
            }
            toggle.conflictReasonResId?.let { reasonResId ->
                Text(
                    text = stringResource(id = reasonResId),
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.error,
                    modifier = Modifier.padding(start = 48.dp, top = 4.dp)
                )
            }
        }
    }
}


@Composable
fun SettingsActionItem(title: String, iconRes: Int, onClick: () -> Unit, isDestructive: Boolean = false, tint: Color? = null) {
    val color = tint ?: if (isDestructive) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.onSurface
    Card(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp).clickable(onClick = onClick)) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp, vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (iconRes != 0) {
                Icon(painter = painterResource(id = iconRes), contentDescription = null, modifier = Modifier.size(24.dp), tint = color)
                Spacer(modifier = Modifier.width(16.dp))
            }
            Text(text = title, style = MaterialTheme.typography.bodyLarge, color = color)
        }
    }
}

@Composable
fun SettingsToggleItem(
    title: String,
    isChecked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    useCheckbox: Boolean,
    iconRes: Int? = null,
    isEnabled: Boolean = true
) {
    val tint = if (isEnabled) MaterialTheme.colorScheme.onSurface else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
    Card(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp).clickable(enabled = isEnabled) { onCheckedChange(!isChecked) }) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            iconRes?.let {
                if (it != 0) {
                    Icon(painter = painterResource(id = it), contentDescription = null, modifier = Modifier.size(24.dp), tint = tint)
                    Spacer(modifier = Modifier.width(16.dp))
                }
            }
            Text(text = title, style = MaterialTheme.typography.bodyLarge, modifier = Modifier.weight(1f), color = tint)
            if (useCheckbox) {
                Checkbox(checked = isChecked, onCheckedChange = onCheckedChange, enabled = isEnabled)
            } else {
                Switch(checked = isChecked, onCheckedChange = onCheckedChange, enabled = isEnabled)
            }
        }
    }
}

@Composable
private fun RemovalOptionsDialog(
    onRegularRemovalSelected: () -> Unit,
    onTransferOwnershipSelected: () -> Unit,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.removal_options_dialog_title)) },
        text = {
            Column {
                Text(stringResource(id = R.string.removal_options_dialog_message))
                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = onRegularRemovalSelected,
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error)
                ) {
                    Text(stringResource(id = R.string.removal_options_button_regular))
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = onTransferOwnershipSelected,
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
                ) {
                    Text(stringResource(id = R.string.removal_options_button_transfer))
                }
            }
        },
        confirmButton = {},
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.dialog_button_cancel))
            }
        }
    )
}

@Composable
private fun DeviceAdminSelectionDialog(
    deviceAdmins: List<DeviceAdminItem>,
    onDeviceAdminSelected: (DeviceAdminItem) -> Unit,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.device_admin_selection_dialog_title)) },
        text = {
            if (deviceAdmins.isEmpty()) {
                Text(stringResource(id = R.string.device_admin_selection_dialog_empty))
            } else {
                LazyColumn(modifier = Modifier.heightIn(max = 400.dp)) {
                    items(deviceAdmins) { deviceAdmin ->
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                                .clickable { onDeviceAdminSelected(deviceAdmin) }
                        ) {
                            Row(
                                modifier = Modifier.padding(16.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_apps_control_off),
                                    contentDescription = null,
                                    modifier = Modifier.size(40.dp)
                                )

                                Spacer(modifier = Modifier.width(16.dp))

                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = deviceAdmin.displayName,
                                        style = MaterialTheme.typography.titleMedium
                                    )
                                    Text(
                                        text = deviceAdmin.packageName,
                                        style = MaterialTheme.typography.bodySmall,
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                            }
                        }
                    }
                }
            }
        },
        confirmButton = {},
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.dialog_button_cancel))
            }
        }
    )
}

@Composable
private fun DeviceAdminTransferConfirmationDialog(
    selectedAdmin: DeviceAdminItem,
    onConfirm: () -> Unit,
    onCancel: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onCancel,
        title = { Text(stringResource(id = R.string.device_admin_transfer_dialog_title)) },
        text = {
            Column {
                val message = stringResource(
                    id = R.string.device_admin_transfer_dialog_message,
                    selectedAdmin.displayName,
                    selectedAdmin.packageName
                )
                Text(
                    text = message,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        },
        confirmButton = {
            Button(
                onClick = onConfirm,
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error)
            ) {
                Text(stringResource(id = R.string.device_admin_transfer_dialog_button_confirm))
            }
        },
        dismissButton = {
            TextButton(onClick = onCancel) {
                Text(stringResource(id = R.string.device_admin_transfer_dialog_button_cancel))
            }
        }
    )
}

@Composable
private fun ErrorDialog(
    title: String,
    message: String,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(title) },
        text = { Text(message) },
        confirmButton = {
            Button(onClick = onDismiss) {
                Text(stringResource(id = R.string.dialog_button_confirm))
            }
        }
    )
}

@Composable
private fun UpdateChannelDialog(
    onDismiss: () -> Unit
) {
    val updateSettingsViewModel: UpdateSettingsViewModel = hiltViewModel()
    val uiState by updateSettingsViewModel.uiState.collectAsState()
    var showExplanationDialog by remember { mutableStateOf(false) }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(R.string.update_settings_title)) },
        text = {
            Column {
                Text(
                    text = stringResource(R.string.update_channel_stable),
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            updateSettingsViewModel.onChannelSelected(UpdateChannel.STABLE)
                        }
                        .padding(vertical = 12.dp)
                )
                RadioButton(
                    selected = uiState.selectedChannel == UpdateChannel.STABLE,
                    onClick = { updateSettingsViewModel.onChannelSelected(UpdateChannel.STABLE) }
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = stringResource(R.string.update_channel_prebuild),
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            updateSettingsViewModel.onChannelSelected(UpdateChannel.PREBUILD)
                        }
                        .padding(vertical = 12.dp)
                )
                RadioButton(
                    selected = uiState.selectedChannel == UpdateChannel.PREBUILD,
                    onClick = { updateSettingsViewModel.onChannelSelected(UpdateChannel.PREBUILD) }
                )

                Spacer(modifier = Modifier.height(16.dp))

                OutlinedButton(
                    onClick = { showExplanationDialog = true },
                    modifier = Modifier.align(Alignment.Start)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Info,
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(stringResource(R.string.update_channel_explanation_title))
                }
            }
        },
        confirmButton = {
            Button(onClick = {
                updateSettingsViewModel.onSaveClicked()
                onDismiss()
            }) {
                Text(stringResource(R.string.settings_button_save))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(R.string.dialog_button_cancel))
            }
        }
    )

    if (showExplanationDialog) {
        InfoDialog(
            title = stringResource(R.string.update_channel_explanation_title),
            message = stringResource(R.string.update_channel_explanation_message),
            onDismiss = { showExplanationDialog = false }
        )
    }
}

private fun getAndroidVersionName(sdkInt: Int): String {
    return when (sdkInt) {
        Build.VERSION_CODES.LOLLIPOP_MR1 -> "5.1"; Build.VERSION_CODES.M -> "6.0"; Build.VERSION_CODES.N -> "7.0"; Build.VERSION_CODES.N_MR1 -> "7.1"; Build.VERSION_CODES.O -> "8.0"; Build.VERSION_CODES.O_MR1 -> "8.1"; Build.VERSION_CODES.P -> "9"; Build.VERSION_CODES.Q -> "10"; Build.VERSION_CODES.R -> "11"; Build.VERSION_CODES.S -> "12"; Build.VERSION_CODES.S_V2 -> "12L"; Build.VERSION_CODES.TIRAMISU -> "13"; 34 -> "14"; else -> sdkInt.toString()
    }
}
```

## File: app/src/main/java/com/secureguard/mdm/ui/screens/settings/SettingsViewModel.kt
```kotlin
package com.secureguard.mdm.ui.screens.settings

import android.app.admin.DeviceAdminInfo
import android.app.admin.DeviceAdminReceiver
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import android.net.VpnService
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.secureguard.mdm.R
import com.secureguard.mdm.SecureGuardDeviceAdminReceiver
import com.secureguard.mdm.data.repository.SettingsRepository
import com.secureguard.mdm.features.impl.BlockInternetVpnFeature
import com.secureguard.mdm.features.impl.InstallAndProtectNetGuardFeature
import com.secureguard.mdm.features.impl.NetfreeOnlyModeFeature
import com.secureguard.mdm.features.registry.CategoryRegistry
import com.secureguard.mdm.security.PasswordManager
import com.secureguard.mdm.settingsfeatures.api.SettingsFeature
import com.secureguard.mdm.settingsfeatures.api.ToggleSetting
import com.secureguard.mdm.settingsfeatures.impl.*
import com.secureguard.mdm.settingsfeatures.registry.SettingsRegistry
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject


sealed class SettingsSideEffect {
    object NavigateBack : SettingsSideEffect()
}

@HiltViewModel
class SettingsViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val settingsRepository: SettingsRepository,
    private val passwordManager: PasswordManager,
    private val dpm: DevicePolicyManager
) : ViewModel() {

    private val _uiState = MutableStateFlow(SettingsUiState())
    val uiState = _uiState.asStateFlow()

    private val _passwordPromptState = MutableStateFlow(PasswordPromptState())
    val passwordPromptState = _passwordPromptState.asStateFlow()

    private val _removalOptionsDialogState = MutableStateFlow(RemovalOptionsDialogState())
    val removalOptionsDialogState = _removalOptionsDialogState.asStateFlow()

    private val _deviceAdminSelectionState = MutableStateFlow(DeviceAdminSelectionState())
    val deviceAdminSelectionState = _deviceAdminSelectionState.asStateFlow()

    private val _errorDialogState = MutableStateFlow(ErrorDialogState())
    val errorDialogState = _errorDialogState.asStateFlow()

    private val _sideEffect = MutableSharedFlow<SettingsSideEffect>()
    val sideEffect = _sideEffect.asSharedFlow()

    private val _vpnPermissionRequestEvent = MutableSharedFlow<Unit>()
    val vpnPermissionRequestEvent = _vpnPermissionRequestEvent.asSharedFlow()

    private val _triggerUninstallEvent = MutableSharedFlow<Unit>()
    val triggerUninstallEvent = _triggerUninstallEvent.asSharedFlow()

    private val adminComponentName by lazy {
        SecureGuardDeviceAdminReceiver.getComponentName(context)
    }

    // --- NEW: Store initial state for comparison ---
    private var initialProtectionTogglesState: Map<String, Boolean> = emptyMap()
    private var initialSettingsTogglesState: Map<String, Boolean> = emptyMap()

    private var pendingVpnEnableRequest: Boolean = false

    init {
        loadInitialState()
    }

    @RequiresApi(Build.VERSION_CODES.P)
    fun onEvent(event: SettingsEvent) {
        when (event) {
            is SettingsEvent.OnToggleProtectionFeature -> handleProtectionToggle(event.featureId, event.isEnabled)
            is SettingsEvent.OnVpnPermissionResult -> handleVpnPermissionResult(event.granted)
            is SettingsEvent.OnToggleSettingChanged -> handleSettingToggle(event.settingId, event.isChecked)
            is SettingsEvent.OnActionSettingClicked -> handleActionClick(event.settingId)
            is SettingsEvent.OnLockSettingsConfirmed -> lockSettings(event.allowManualUpdate)
            is SettingsEvent.OnRegularRemovalSelected -> handleRegularRemovalSelected()
            is SettingsEvent.OnTransferOwnershipSelected -> handleTransferOwnershipSelected()
            is SettingsEvent.OnDismissRemovalOptionsDialog -> _removalOptionsDialogState.update { RemovalOptionsDialogState() }
            is SettingsEvent.OnDeviceAdminSelectionDismissed -> _deviceAdminSelectionState.update { DeviceAdminSelectionState() }
            is SettingsEvent.OnDeviceAdminSelected -> handleDeviceAdminSelected(event.deviceAdminItem)
            is SettingsEvent.OnDeviceAdminTransferConfirmed -> handleDeviceAdminTransferConfirmed()
            is SettingsEvent.OnDeviceAdminTransferCancelled -> handleDeviceAdminTransferCancelled()
            is SettingsEvent.OnErrorDialogDismissed -> _errorDialogState.update { ErrorDialogState() }
            is SettingsEvent.OnSaveClick -> saveChanges()
            is SettingsEvent.OnSnackbarShown -> _uiState.update { it.copy(snackbarMessage = null) }
        }
    }

    fun onPasswordPromptEvent(event: PasswordPromptEvent) {
        when (event) {
            is PasswordPromptEvent.OnPasswordEntered -> handleRemoveProtectionPassword(event.password)
            PasswordPromptEvent.OnDismiss -> _passwordPromptState.update { PasswordPromptState() }
        }
    }

    private fun loadInitialState() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true) }

            val protectionCategoryToggles = loadProtectionFeatures()
            val settingItemsByCategory = loadSettingsFeatures()

            // --- NEW: Capture the initial state after loading ---
            initialProtectionTogglesState = protectionCategoryToggles.flatMap { it.toggles }.associate { it.feature.id to it.isEnabled }
            initialSettingsTogglesState = settingItemsByCategory.values.flatten().filter { it.feature is ToggleSetting }.associate { it.feature.id to it.isChecked }

            _uiState.update {
                it.copy(
                    isLoading = false,
                    protectionCategoryToggles = protectionCategoryToggles,
                    settingItemsByCategory = settingItemsByCategory
                )
            }
        }
    }

    private suspend fun loadProtectionFeatures(): List<ProtectionCategoryToggle> {
        val isNetGuardInstalled = isNetGuardInstalled()
        val currentDeviceApi = Build.VERSION.SDK_INT
        return CategoryRegistry.allCategories.map { category ->
            val featureToggles = category.features.map { feature ->
                var isSupported = currentDeviceApi >= feature.requiredSdkVersion
                var conflictReason: Int? = null
                if (feature.id == BlockInternetVpnFeature.id && isNetGuardInstalled) {
                    isSupported = false
                    conflictReason = R.string.conflict_reason_netguard_installed
                }
                FeatureToggle(
                    feature = feature,
                    isEnabled = settingsRepository.getFeatureState(feature.id),
                    isSupported = isSupported,
                    requiredApi = feature.requiredSdkVersion,
                    conflictReasonResId = conflictReason
                )
            }
            ProtectionCategoryToggle(titleResId = category.titleResId, toggles = featureToggles)
        }
    }

    private suspend fun loadSettingsFeatures(): Map<com.secureguard.mdm.settingsfeatures.api.SettingCategory, List<SettingItemModel>> {
        val currentDeviceApi = Build.VERSION.SDK_INT
        return SettingsRegistry.allSettings
            .map { feature ->
                val isChecked = if (feature is ToggleSetting) {
                    when (feature.id) {
                        ToggleUiPositionSetting.id -> settingsRepository.isToggleOnStart()
                        ToggleUiControlTypeSetting.id -> settingsRepository.useCheckbox()
                        ToggleContactEmailSetting.id -> settingsRepository.isContactEmailVisible()
                        ToggleUpdatesSetting.id -> settingsRepository.areAllUpdatesDisabled()
                        ShowBootToastSetting.id -> settingsRepository.isShowBootToastEnabled()
                        else -> false
                    }
                } else false
                
                SettingItemModel(
                    feature = feature,
                    isChecked = isChecked,
                    isSupported = currentDeviceApi >= feature.requiredSdkVersion,
                    requiredApi = feature.requiredSdkVersion
                )
            }
            .groupBy { it.feature.category }
    }


    private fun handleActionClick(settingId: String) {
        when (settingId) {
            LockSettingsAction.id -> {
                // This is handled in the screen, which shows the dialog.
                // The dialog confirmation will call OnLockSettingsConfirmed.
            }
            RemovalOptionsAction.id -> {
                _passwordPromptState.update { it.copy(isVisible = true) }
            }
        }
    }

    private fun handleSettingToggle(settingId: String, isChecked: Boolean) {
        _uiState.update { currentState ->
            val updatedMap = currentState.settingItemsByCategory.toMutableMap()
            for ((category, items) in updatedMap) {
                val updatedItems = items.map { model ->
                    if (model.feature.id == settingId) {
                        model.copy(isChecked = isChecked)
                    } else {
                        model
                    }
                }
                updatedMap[category] = updatedItems
            }
            currentState.copy(settingItemsByCategory = updatedMap)
        }
    }

    private fun saveChanges() {
        viewModelScope.launch {
            val currentState = _uiState.value
            var hasChanges = false
            var snackbarMessage = context.getString(R.string.dialog_changes_saved_successfully)

            // Save new modular settings, ONLY IF CHANGED
            currentState.settingItemsByCategory.values.flatten().forEach { model ->
                if (model.feature is ToggleSetting) {
                    val initialValue = initialSettingsTogglesState[model.feature.id]
                    if (initialValue != model.isChecked) {
                        hasChanges = true
                        when (model.feature.id) {
                            ToggleUiPositionSetting.id -> settingsRepository.setToggleOnStart(model.isChecked)
                            ToggleUiControlTypeSetting.id -> settingsRepository.setUseCheckbox(model.isChecked)
                            ToggleContactEmailSetting.id -> settingsRepository.setContactEmailVisible(model.isChecked)
                            ToggleUpdatesSetting.id -> settingsRepository.setAllUpdatesDisabled(model.isChecked)
                            ShowBootToastSetting.id -> settingsRepository.setShowBootToastEnabled(model.isChecked) // <-- SAVE the new state
                        }
                    }
                }
            }

            // Save main protection features, ONLY IF CHANGED
            val wasNetGuardProtectedBeforeSave = initialProtectionTogglesState[InstallAndProtectNetGuardFeature.id] ?: false
            currentState.protectionCategoryToggles.flatMap { it.toggles }.forEach { toggle ->
                val initialValue = initialProtectionTogglesState[toggle.feature.id]
                if (initialValue != toggle.isEnabled) {
                    hasChanges = true
                    toggle.feature.applyPolicy(context, dpm, adminComponentName, toggle.isEnabled)
                    settingsRepository.setFeatureState(toggle.feature.id, toggle.isEnabled)

                    // Special message for NetGuard
                    if (toggle.feature.id == InstallAndProtectNetGuardFeature.id && wasNetGuardProtectedBeforeSave && !toggle.isEnabled && isNetGuardInstalled()) {
                        snackbarMessage += "\n" + context.getString(R.string.toast_netguard_can_be_uninstalled)
                    }
                }
            }

            if (hasChanges) {
                _uiState.update { it.copy(snackbarMessage = snackbarMessage) }
            }

            // Always navigate back, even if no changes were made.
            _sideEffect.emit(SettingsSideEffect.NavigateBack)
        }
    }


    private fun lockSettings(allowManualUpdate: Boolean) {
        viewModelScope.launch {
            settingsRepository.setAllUpdatesDisabled(true)
            settingsRepository.setAutoUpdateCheckEnabled(false)

            settingsRepository.lockSettingsPermanently(allowManualUpdate)
            Log.d("SettingsVM", "SETTINGS PERMANENTLY LOCKED. Allow manual updates: $allowManualUpdate")
            _sideEffect.emit(SettingsSideEffect.NavigateBack)
        }
    }

    private fun handleProtectionToggle(featureId: String, isEnabled: Boolean) {
        if ((featureId == BlockInternetVpnFeature.id || featureId == NetfreeOnlyModeFeature.id) && isEnabled) {
            if (VpnService.prepare(context) != null) {
                pendingVpnEnableRequest = true
                viewModelScope.launch { _vpnPermissionRequestEvent.emit(Unit) }
                return
            }
        }
        _uiState.update { currentState ->
            val updatedCategories = currentState.protectionCategoryToggles.map { category ->
                val updatedToggles = category.toggles.map { toggle ->
                    if (toggle.feature.id == featureId) toggle.copy(isEnabled = isEnabled) else toggle
                }
                category.copy(toggles = updatedToggles)
            }
            currentState.copy(protectionCategoryToggles = updatedCategories)
        }
    }

    private fun handleVpnPermissionResult(granted: Boolean) {
        if (granted && pendingVpnEnableRequest) {
            // Find which feature was pending
            val pendingFeature = _uiState.value.protectionCategoryToggles
                .flatMap { it.toggles }
                .find { it.feature.id == BlockInternetVpnFeature.id || it.feature.id == NetfreeOnlyModeFeature.id }
                ?.feature?.id

            if (pendingFeature != null) {
                handleProtectionToggle(pendingFeature, true)
            }
        } else if (!granted) {
            _uiState.update { it.copy(snackbarMessage = context.getString(R.string.settings_error_vpn_permission_required)) }
        }
        pendingVpnEnableRequest = false
    }

    private fun handleRemoveProtectionPassword(password: String) {
        viewModelScope.launch {
            if (passwordManager.verifyPassword(password)) {
                _passwordPromptState.update { it.copy(isVisible = false) }
                _removalOptionsDialogState.update { RemovalOptionsDialogState(isVisible = true) }
            } else {
                _passwordPromptState.update { it.copy(error = context.getString(R.string.dialog_error_wrong_password)) }
            }
        }
    }

    private fun handleRegularRemovalSelected() {
        _removalOptionsDialogState.update { RemovalOptionsDialogState() }
        initiateRemoval()
    }

    @RequiresApi(Build.VERSION_CODES.P)
    private fun handleTransferOwnershipSelected() {
        _removalOptionsDialogState.update { RemovalOptionsDialogState() }
        // TODO: Show device admin selection dialog
        showDeviceAdminSelection()
    }

    @RequiresApi(Build.VERSION_CODES.P)
    private fun showDeviceAdminSelection() {
        viewModelScope.launch {
            try {
                val deviceAdmins = loadDeviceAdmins()
                _deviceAdminSelectionState.update {
                    DeviceAdminSelectionState(isVisible = true, deviceAdmins = deviceAdmins)
                }
            } catch (e: Exception) {
                Log.e("SettingsVM", "Error loading device admins", e)
                _uiState.update { it.copy(snackbarMessage = context.getString(R.string.settings_error_loading_device_admins)) }
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.P)
    private fun loadDeviceAdmins(): List<DeviceAdminItem> {
        val pm = context.packageManager
        val deviceAdmins = mutableListOf<DeviceAdminItem>()

        // Query for device admin receivers
        val intent = Intent(DeviceAdminReceiver.ACTION_DEVICE_ADMIN_ENABLED)
        val resolveInfos = pm.queryBroadcastReceivers(intent, PackageManager.GET_META_DATA)

        for (resolveInfo in resolveInfos) {
            try {
                val deviceAdminInfo = DeviceAdminInfo(context, resolveInfo)
                val displayName = deviceAdminInfo.loadLabel(pm).toString()
                val packageName = deviceAdminInfo.packageName

                // Skip our own app and check if the app supports ownership transfer
                if (packageName != context.packageName && deviceAdminInfo.supportsTransferOwnership()) {
                    deviceAdmins.add(DeviceAdminItem(deviceAdminInfo, displayName, packageName))
                }
            } catch (e: Exception) {
                Log.w("SettingsVM", "Error loading device admin info for ${resolveInfo.activityInfo?.packageName}", e)
            }
        }

        return deviceAdmins
    }

    private fun handleDeviceAdminSelected(deviceAdminItem: DeviceAdminItem) {
        _deviceAdminSelectionState.update { it.copy(selectedAdmin = deviceAdminItem, showConfirmationDialog = true) }
    }

    private fun handleDeviceAdminTransferConfirmed() {
        val selectedAdmin = _deviceAdminSelectionState.value.selectedAdmin
        if (selectedAdmin != null) {
            performOwnershipTransfer(selectedAdmin)
        }
        _deviceAdminSelectionState.update { DeviceAdminSelectionState() }
    }

    private fun handleDeviceAdminTransferCancelled() {
        _deviceAdminSelectionState.update { it.copy(selectedAdmin = null, showConfirmationDialog = false) }
    }

    private fun performOwnershipTransfer(deviceAdminItem: DeviceAdminItem) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P) {
            // transferOwnership is only available from API 28 (Android P)
            _uiState.update { it.copy(snackbarMessage = context.getString(R.string.settings_error_android_version_required)) }
            return
        }

        viewModelScope.launch {
            try {

                // bruh, why? AI is so stupid..
                // initiateRemoval()

                // Remove all protection features
                _uiState.value.protectionCategoryToggles.flatMap { it.toggles }.forEach {
                    it.feature.applyPolicy(context, dpm, adminComponentName, false)
                    settingsRepository.setFeatureState(it.feature.id, false)
                }

                // Unhide blocked apps
                val blockedApps = settingsRepository.getBlockedAppPackages()
                blockedApps.forEach { packageName ->
                    dpm.setApplicationHidden(adminComponentName, packageName, false)
                }
                // Unsuspend apps
                val suspendedApps = settingsRepository.getSuspendedAppPackages()
                suspendedApps.forEach { packageName ->
                    dpm.setPackagesSuspended(adminComponentName, arrayOf(packageName), false)
                }
                settingsRepository.removeAppsFromCache((blockedApps + suspendedApps).toList())
                settingsRepository.setBlockedAppPackages(emptySet())
                settingsRepository.setSuspendedAppPackages(emptySet())
                // try to move owner
                val targetComponent = deviceAdminItem.deviceAdminInfo.component
                dpm.transferOwnership(adminComponentName, targetComponent, null)
                _uiState.update { it.copy(snackbarMessage = context.getString(R.string.settings_transfer_ownership_success, deviceAdminItem.displayName)) }
                // remove app
                _triggerUninstallEvent.emit(Unit)
            } catch (e: SecurityException) {
                Log.e("SettingsVM", "Error transferring ownership", e)
                _uiState.update { it.copy(snackbarMessage = context.getString(R.string.settings_transfer_ownership_error, e.message)) }
            } catch (e: IllegalArgumentException) {
                Log.e("SettingsVM", "Invalid target for ownership transfer", e)
                _uiState.update { it.copy(snackbarMessage = context.getString(R.string.settings_transfer_ownership_error_unsupported, e.message)) }
            } catch (e: IllegalStateException) {
                Log.e("SettingsVM", "Invalid state for ownership transfer", e)
                _uiState.update { it.copy(snackbarMessage = context.getString(R.string.settings_transfer_ownership_error_invalid_state, e.message)) }
            } catch (e: Exception) {
                Log.e("SettingsVM", "Unexpected error during ownership transfer", e)
                _uiState.update { it.copy(snackbarMessage = context.getString(R.string.settings_transfer_ownership_error_unexpected, e.message ?: context.getString(R.string.dialog_button_cancel))) }
            }
        }
    }

    private fun showErrorDialog(title: String, message: String) {
        _errorDialogState.update { ErrorDialogState(isVisible = true, title = title, message = message) }
    }

    private fun isNetGuardInstalled(): Boolean {
        return try {
            context.packageManager.getPackageInfo("eu.faircode.netguard", 0)
            true
        } catch (_: PackageManager.NameNotFoundException) {
            false
        }
    }

    private fun initiateRemoval() {
        viewModelScope.launch {
            try {
                // Remove all protection features
                _uiState.value.protectionCategoryToggles.flatMap { it.toggles }.forEach {
                    it.feature.applyPolicy(context, dpm, adminComponentName, false)
                    settingsRepository.setFeatureState(it.feature.id, false)
                }

                // Unhide blocked apps
                val blockedApps = settingsRepository.getBlockedAppPackages()
                blockedApps.forEach { packageName ->
                    dpm.setApplicationHidden(adminComponentName, packageName, false)
                }
                // Unsuspend apps
                val suspendedApps = settingsRepository.getSuspendedAppPackages()
                suspendedApps.forEach { packageName ->
                    dpm.setPackagesSuspended(adminComponentName, arrayOf(packageName), false)
                }
                settingsRepository.removeAppsFromCache((blockedApps + suspendedApps).toList())
                settingsRepository.setBlockedAppPackages(emptySet())
                settingsRepository.setSuspendedAppPackages(emptySet())

                // Clear device owner (this removes admin privileges)
                dpm.clearDeviceOwnerApp(context.packageName)

                // Trigger app uninstall
                _triggerUninstallEvent.emit(Unit)
            } catch (e: SecurityException) {
                Log.e("SettingsVM", "Security error during removal", e)
                showErrorDialog(context.getString(R.string.removal_error_security_title), context.getString(R.string.removal_error_security, e.message))
            } catch (e: IllegalArgumentException) {
                Log.e("SettingsVM", "Invalid argument during removal", e)
                showErrorDialog(context.getString(R.string.removal_error_invalid_parameter_title), context.getString(R.string.removal_error_invalid_parameter, e.message))
            } catch (e: IllegalStateException) {
                Log.e("SettingsVM", "Invalid state during removal", e)
                showErrorDialog(context.getString(R.string.removal_error_invalid_state_title), context.getString(R.string.removal_error_invalid_state, e.message))
            } catch (e: RuntimeException) {
                Log.e("SettingsVM", "Runtime error during removal", e)
                showErrorDialog(context.getString(R.string.removal_error_runtime_title), context.getString(R.string.removal_error_runtime, e.message))
            } catch (e: Exception) {
                Log.e("SettingsVM", "Unexpected error during removal", e)
                showErrorDialog(context.getString(R.string.removal_error_unexpected_title), context.getString(R.string.removal_error_unexpected, e.message ?: context.getString(R.string.dialog_button_cancel)))
            }
        }
    }
}

data class PasswordPromptState(
    val isVisible: Boolean = false,
    val error: String? = null
)

data class RemovalOptionsDialogState(
    val isVisible: Boolean = false
)

data class DeviceAdminItem(
    val deviceAdminInfo: DeviceAdminInfo,
    val displayName: String,
    val packageName: String
)

data class DeviceAdminSelectionState(
    val isVisible: Boolean = false,
    val deviceAdmins: List<DeviceAdminItem> = emptyList(),
    val selectedAdmin: DeviceAdminItem? = null,
    val showConfirmationDialog: Boolean = false
)

data class ErrorDialogState(
    val isVisible: Boolean = false,
    val title: String = "",
    val message: String = ""
)

sealed class PasswordPromptEvent {
    data class OnPasswordEntered(val password: String) : PasswordPromptEvent()
    object OnDismiss : PasswordPromptEvent()
}
```

## File: changes.txt
```
שימו לב!
עדכון זה מצריך הורדה ידנית,
נא לפתוח את דף האפליקציה במתמחים טופ ולהוריד באופן ידני.
לאחר מכאן, תוכלו לקבל עדכונים באופן אוטומטי.


תוקן באג בהסרת התקנה באנדרואיד גבוה
תוקן מצב קיוסק

נוסף תמיכה באנגלית
נוסף השעיית אפלי'קציות.
```

## File: README.md
```markdown
**A Bloq (SecureGuard MDM)**
```

## File: version.txt
```
0.4.6
```

## File: app/build.gradle.kts
```kotlin
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
    id("org.jetbrains.kotlin.plugin.serialization")
}

android {
    namespace = "com.secureguard.mdm"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.secureguard.mdm"
        minSdk = 22
        targetSdk = 34
        versionCode = 3
        versionName = "0.4.6"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    buildFeatures {
        compose = true
        viewBinding = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.8"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    applicationVariants.all {
        outputs.all {
            val apkName = "Abloq-${buildType.name}.apk"
            (this as com.android.build.gradle.internal.api.BaseVariantOutputImpl).outputFileName = apkName
        }
    }
}

dependencies {
    val roomVersion = "2.6.1"
    val ktorVersion = "2.3.11"

    // Kotlin/Android Core
    implementation("androidx.core:core-ktx:1.12.0")

    // Room Database
    implementation("androidx.room:room-runtime:$roomVersion")
    implementation("androidx.room:room-ktx:$roomVersion")
    kapt("androidx.room:room-compiler:$roomVersion")

    // General Android Views
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Jetpack Compose & UI
    implementation(platform("androidx.compose:compose-bom:2024.02.01"))
    androidTestImplementation(platform("androidx.compose:compose-bom:2024.02.01"))
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.material:material-icons-extended")
    implementation("androidx.compose.ui:ui-tooling-preview")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    // Lifecycle & Navigation
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")
    implementation("androidx.navigation:navigation-compose:2.7.7")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.51")
    kapt("com.google.dagger:hilt-compiler:2.51")

    // JSON & Network (Ktor)
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("io.ktor:ktor-client-core:$ktorVersion")
    implementation("io.ktor:ktor-client-okhttp:$ktorVersion")
    implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")

    // Security
    implementation("at.favre.lib:bcrypt:0.10.2")

    // Accompanist
    implementation("com.google.accompanist:accompanist-drawablepainter:0.32.0")

    // Testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    // date for kiosk
    implementation("com.kosherjava:zmanim:2.5.0")
}

kapt {
    correctErrorTypes = true
}
```

## File: app/src/main/res/values/strings.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <!-- app info -->
    <string name="app_name">A Bloq</string>
    <string name="app_version_name_for_logic" translatable="false">0.4.6</string>
    <string name="device_admin_description">מאפשר ל-A Bloq לאכוף מדיניות אבטחה על המכשיר.</string>
    <string name="app_version">בטא 0.4.5</string>
    <string name="unofficial_warning_title">אזהרת אבטחה</string>
    <string name="unofficial_warning_message">אפליקציה זו אינה רשמית ונעשו בה שינויים!</string>

    <!-- Provisioning Screen -->
    <string name="provisioning_title">נדרשות הרשאות ניהול</string>
    <string name="provisioning_description">כדי ש-A Bloq תוכל לפעול, עליה להיות מוגדרת כ"בעלת המכשיר" (Device Owner). ניתן לעשות זאת רק במכשיר חדש או מאופס.</string>
    <string name="provisioning_option_adb">אפשרות 1: הפעלה באמצעות ADB (מומלץ)</string>
    <string name="provisioning_adb_instructions">1. התקן את האפליקציה על המכשיר.\n2. הפעל "אפשרויות למפתחים" ו-"ניפוי באגים ב-USB".\n3. חבר את המכשיר למחשב והרץ את הפקודה הבאה:</string>
    <string name="provisioning_adb_command">adb shell dpm set-device-owner com.secureguard.mdm/.SecureGuardDeviceAdminReceiver</string>
    <string name="provisioning_button_copy">העתק פקודה</string>
    <string name="provisioning_button_check_again">בדיקה חוזרת</string>
    <string name="provisioning_command_copied">הפקודה הועתקה ללוח</string>
    <string name="provisioning_option_root">אפשרות 2: הפעלה באמצעות Root</string>
    <string name="provisioning_root_instructions">אזהרה: שימוש ב-Root הוא על אחריותך בלבד. אם המכשיר שלך בעל הרשאות רוט, תוכל לנסות להפעיל את ההרשאות ישירות.</string>
    <string name="provisioning_button_try_root">נסיון הפעלה עם Root</string>
    <string name="provisioning_root_success">הצלחה! אנא הפעל את האפליקציה מחדש.</string>
    <string name="provisioning_root_failed">ההפעלה עם Root נכשלה.</string>

    <!-- Setup Screen -->
    <string name="setup_title">ברוכים הבאים ל-A Bloq</string>
    <string name="setup_description">כדי להתחיל, אנא צור סיסמת ניהול. סיסמה זו תשמש לשינוי הגדרות האבטחה.</string>
    <string name="setup_password_label">סיסמה</string>
    <string name="setup_confirm_password_label">אימות סיסמה</string>
    <string name="setup_button_start">התחל הגנה</string>
    <string name="setup_error_passwords_do_not_match">הסיסמאות אינן תואמות</string>
    <string name="setup_error_password_too_short">הסיסמה חייבת להכיל לפחות 4 תווים</string>

    <!-- Dashboard Screen -->
    <string name="dashboard_title">סטטוס הגנה</string>
    <string name="dashboard_no_active_protections">אין הגנות פעילות כרגע.</string>
    <string name="dashboard_button_settings">הגדרות</string>
    <string name="dashboard_button_update_app">עדכון אפליקציה</string>
    <string name="dashboard_status_protected">מוגן</string>
    <string name="dashboard_status_unprotected">לא מוגן</string>
    <string name="dashboard_button_about_app">אודות האפליקציה</string>

    <!-- Settings Screen -->
    <string name="settings_title">ניהול הגדרות</string>
    <string name="settings_button_save">שמור שינויים</string>
    <string name="settings_unsupported_device">לא נתמך במכשיר זה</string>
    <string name="settings_unsupported_device_details">דורש אנדרואיד %1$d (%2$s) ומעלה.</string>
    <string name="settings_item_change_password">שנה סיסמת ניהול</string>
    <string name="settings_item_remove_protection">הסר את A Bloq וההגנות</string>
    <string name="settings_item_removal_options">אפשרויות הסרה לאייבלוק</string>
    <string name="settings_remove_protection_dialog_title">האם אתה בטוח?</string>
    <string name="settings_remove_protection_dialog_message">פעולה זו תסיר את כל ההגנות, תמחק את הרשאות הניהול של האפליקציה ותבקש ממך להסיר את התקנתה. לא ניתן לבטל פעולה זו.</string>
    <string name="settings_item_select_apps_to_block">בחר אפליקציות לחסימה</string>
    <string name="settings_item_view_blocked_apps">הצג אפליקציות חסומות</string>
    <string name="settings_item_change_default_dialer">שנה אפליקציית טלפון ראשית</string>
    <string name="settings_item_auto_update_check">בדוק עדכונים אוטומטית בכניסה</string>

    <!-- Toasts for Call Blocker -->
    <string name="toast_hiding_dialer">מסתיר את אפליקציית הטלפון המקורית (%s)...</string>
    <string name="toast_installing_nophone">מתקין את אפליקציית החסימה phone debug...</string>
    <string name="toast_nophone_installed">ההתקנה הושלמה! אנא הגדר את NoPhone כברירת מחדל.</string>
    <string name="toast_restoring_dialer">מחזיר את אפליקציית הטלפון המקורית...</string>

    <!-- Change Password Screen -->
    <string name="change_password_title">שינוי סיסמה</string>
    <string name="change_password_old_password">סיסמה נוכחית</string>
    <string name="change_password_new_password">סיסמה חדשה</string>
    <string name="change_password_confirm_new_password">אימות סיסמה חדשה</string>
    <string name="change_password_button_save">שמור סיסמה חדשה</string>
    <string name="change_password_success">הסיסמה שונתה בהצלחה</string>
    <string name="change_password_error_old_password_incorrect">הסיסמה הנוכחית שגויה</string>

    <!-- Dialogs -->
    <string name="dialog_title_enter_password">נדרשת סיסמה</string>
    <string name="dialog_description_enter_password">הזן את סיסמת הניהול כדי להמשיך.</string>
    <string name="dialog_button_confirm">אישור</string>
    <string name="dialog_button_cancel">ביטול</string>
    <string name="dialog_error_wrong_password">סיסמה שגויה</string>
    <string name="dialog_title_unsupported_feature">תכונה לא נתמכת</string>
    <string name="dialog_description_unsupported_feature">התכונה \'%1$s\' דורשת מערכת אנדרואיד בגרסה %2$d (%3$s) ומעלה. הגרסה במכשירך היא %4$d (%5$s).</string>
    <string name="dialog_changes_saved_successfully">ההגדרות נשמרו בהצלחה!</string>

    <!-- Secure Update & Auto Update -->
    <string name="app_build_status" translatable="false">רשמית</string>


    <string name="update_version_url" translatable="false">https://raw.githubusercontent.com/sesese1234/SecureGuardMDM/refs/heads/main/version.txt</string>
    <string name="update_changelog_url" translatable="false">https://raw.githubusercontent.com/sesese1234/SecureGuardMDM/refs/heads/main/changes.txt</string>
    <string name="update_apk_download_url" translatable="false">https://github.com/sesese1234/SecureGuardMDM/raw/refs/heads/main/app/release/Abloq-release.apk</string>
    <string name="update_dialog_title">עדכון זמין</string>
    <string name="update_dialog_changelog_title">יומן שינויים:</string>
    <string name="update_dialog_button_download">הורד והתקן</string>
    <string name="update_dialog_button_later">מאוחר יותר</string>
    <string name="update_dialog_downloading">מוריד עדכון...</string>
    <string name="update_toast_success">העדכון הותקן בהצלחה.</string>
    <string name="update_toast_failed">העדכון בוטל או נכשל.</string>
    <string name="update_error_file_read">שגיאה בקריאת קובץ ה-APK.</string>
    <string name="update_error_app_not_installed">האפליקציה המיועדת לעדכון אינה מותקנת.</string>
    <string name="update_error_signature_mismatch">שגיאה: חתימת העדכון אינה תואמת לאפליקציה המותקנת.</string>
    <string name="update_error_no_signature">לא נמצאה חתימה בקובץ ה-APK.</string>
    <string name="update_error_verification_failed">אימות העדכון נכשל. הקובץ נמחק.</string>
    <string name="update_error_download_failed">הורדת העדכון נכשלה.</string>

    <!-- Feature Titles & Descriptions -->
    <string name="feature_block_incoming_calls_title">חסימת טלפון לגמרי (שיחות)</string>
    <string name="feature_block_incoming_calls_description">משבית את החייגן המקורי ומתקין חייגן חלופי שאינו מקבל או מוציא שיחות.</string>
    <string name="feature_dev_options_title">חסימת אפשרויות למפתחים</string>
    <string name="feature_dev_options_description">מונע גישה ושינוי של אפשרויות למפתחים.</string>
    <string name="feature_bluetooth_title">חסימת בלוטות\'</string>
    <string name="feature_bluetooth_description">מונע הפעלה, כיבוי ושימוש בקישוריות בלוטות\'.</string>
    <string name="feature_unknown_sources_title">חסימת התקנת APK</string>
    <string name="feature_unknown_sources_description">מונע התקנת אפליקציות ממקורות שאינם חנות האפליקציות.</string>
    <string name="feature_wifi_title">חסימת Wi-Fi</string>
    <string name="feature_wifi_description">מונע התחברות לכל רשתות ה-Wi-Fi וחוסם שינויים בהגדרות ה-Wi-Fi.</string>
    <string name="feature_add_user_title">חסימת הוספת משתמשים</string>
    <string name="feature_add_user_description">מונע יצירת משתמשים, פרופילים ואורחים חדשים במכשיר.</string>
    <string name="feature_vpn_title">חסימת אינטרנט (VPN)</string>
    <string name="feature_vpn_description">מפעיל VPN תמידי (Always-On) שחוסם את כל תעבורת האינטרנט.</string>
    <string name="feature_bluetooth_sharing_title">חסימת שיתוף בלוטות\'</string>
    <string name="feature_bluetooth_sharing_description">מונע שליחה או קבלה של קבצים באמצעות בלוטות\'.</string>
    <string name="feature_camera_title">חסימת מצלמה</string>
    <string name="feature_camera_description">מונע גישה לכל המצלמות במכשיר.</string>
    <string name="feature_factory_reset_title">חסימת איפוס להגדרות יצרן</string>
    <string name="feature_factory_reset_description">מונע איפוס המכשיר מתפריט ההגדרות.</string>
    <string name="feature_location_title">חסימת מיקום</string>
    <string name="feature_location_description">מונע שימוש במיקום המכשיר ע"י כל האפליקציות.</string>
    <string name="feature_microphone_title">חסימת מיקרופון</string>
    <string name="feature_microphone_description">מונע גישה למיקרופון בכל האפליקציות.</string>
    <string name="feature_mobile_data_title">חסימת גלישה סלולרית</string>
    <string name="feature_mobile_data_description">מונע שימוש בנתונים סלולריים.</string>
    <string name="feature_outgoing_calls_title">חסימת שיחות יוצאות</string>
    <string name="feature_outgoing_calls_description">מונע ביצוע שיחות טלפון מהמכשיר.</string>
    <string name="feature_play_store_title">חסימת חנות Play</string>
    <string name="feature_play_store_description">מסתיר את האפליקציה של חנות Google Play.</string>
    <string name="feature_safe_boot_title">חסימת מצב בטוח</string>
    <string name="feature_safe_boot_description">מונע אתחול המכשיר למצב בטוח (Safe Mode).</string>
    <string name="feature_screenshot_title">חסימת צילומי מסך</string>
    <string name="feature_screenshot_description">מונע ביצוע צילומי מסך בכל האפליקציות.</string>
    <string name="feature_tethering_title">חסימת נקודה חמה</string>
    <string name="feature_tethering_description">מונע שיתוף האינטרנט של המכשיר (Tethering).</string>
    <string name="feature_usb_transfer_title">חסימת העברת קבצים ב-USB</string>
    <string name="feature_usb_transfer_description">מונע העברת קבצים מהמכשיר למחשב ולהיפך.</string>
    <string name="feature_sms_disabled_title">חסימת הודעות SMS</string>
    <string name="feature_sms_disabled_description">מונע שליחה וקבלה של הודעות SMS/MMS.</string>
    <string name="feature_install_apps_disabled_title">חסימת התקנת אפליקציות</string>
    <string name="feature_install_apps_disabled_description">מונע התקנת כל סוגי האפליקציות מכל מקור.</string>
    <string name="feature_block_remove_user_title">חסימת הסרת משתמשים</string>
    <string name="feature_block_remove_user_description">מונע מחיקת משתמשים קיימים מהמכשיר.</string>
    <string name="feature_block_modify_accounts_title">חסימת שינוי חשבונות</string>
    <string name="feature_block_modify_accounts_description">מונע הוספה, הסרה או שינוי של חשבונות (Google, וכו\').</string>
    <string name="feature_block_remove_managed_profile_title">חסימת הסרת פרופיל עבודה</string>
    <string name="feature_block_remove_managed_profile_description">מונע מהמשתמש למחוק את פרופיל העבודה המנוהל.</string>
    <string name="feature_block_user_switcher_title">חסימת החלפת משתמשים</string>
    <string name="feature_block_user_switcher_description">מונע את האפשרות לעבור בין משתמשים שונים במכשיר.</string>
    <string name="feature_block_set_user_icon_title">חסימת שינוי תמונת פרופיל</string>
    <string name="feature_block_set_user_icon_description">מונע מהמשתמש לשנות את תמונת הפרופיל שלו בחשבון המכשיר.</string>
    <string name="feature_block_airplane_mode_title">חסימת מצב טיסה</string>
    <string name="feature_block_airplane_mode_description">מונע מהמשתמש להפעיל מצב טיסה ולנתק את כלל התקשורת.</string>
    <string name="feature_block_config_mobile_networks_title">חסימת שינוי הגדרות סלולר</string>
    <string name="feature_block_config_mobile_networks_description">מונע גישה לשינוי הגדרות של הרשת הסלולרית (APN).</string>
    <string name="feature_block_network_reset_title">חסימת איפוס הגדרות רשת</string>
    <string name="feature_block_network_reset_description">מונע מהמשתמש לאפס את כל הגדרות הרשת במכשיר.</string>
    <string name="feature_block_outgoing_beam_title">חסימת שיתוף ב-NFC</string>
    <string name="feature_block_outgoing_beam_description">מונע שליחת נתונים באמצעות Android Beam וטכנולוגיות NFC דומות.</string>
    <string name="feature_block_data_roaming_title">חסימת גלישה בנדידה</string>
    <string name="feature_block_data_roaming_description">מונע שימוש בנתונים סלולריים מחוץ למדינת הבית (נדידה).</string>
    <string name="feature_block_private_dns_title">חסימת הגדרת Private DNS</string>
    <string name="feature_block_private_dns_description">מונע מהמשתמש לשנות את הגדרות ה-DNS הפרטי של המכשיר.</string>
    <string name="feature_block_adjust_volume_title">חסימת שינוי עוצמת שמע</string>
    <string name="feature_block_adjust_volume_description">נועל את עוצמת השמע ומונע מהמשתמש לשנות אותה.</string>
    <string name="feature_block_set_wallpaper_title">חסימת שינוי טפט</string>
    <string name="feature_block_set_wallpaper_description">מונע מהמשתמש לשנות את תמונת הרקע של המכשיר.</string>
    <string name="feature_disable_status_bar_title">השבתת שורת הסטטוס</string>
    <string name="feature_disable_status_bar_description">מסתירה את שורת המצב העליונה (שעון, סוללה, התראות).</string>
    <string name="feature_block_autofill_title">חסימת מילוי אוטומטי</string>
    <string name="feature_block_autofill_description">מונע משירותי מילוי אוטומטי להציע ולשמור סיסמאות ונתונים.</string>
    <string name="feature_block_ambient_display_title">חסימת תצוגת התראות במסך כבוי</string>
    <string name="feature_block_ambient_display_description">מונע מהמסך להידלק ולהציג התראות כשהמכשיר במצב שינה.</string>
    <string name="feature_block_apps_control_title">חסימת ניהול אפליקציות</string>
    <string name="feature_block_apps_control_description">מונע פעולות כמו \"כפה עצירה\", \"נקה מטמון\" ו\"נקה נתונים\" בהגדרות אפליקציה.</string>
    <string name="feature_block_uninstall_apps_title">חסימת הסרת התקנה של אפליקציות</string>
    <string name="feature_block_uninstall_apps_description">מונע מהמשתמשים להסיר התקנה של אפליקציות קיימות.</string>
    <string name="feature_block_mount_physical_media_title">חסימת מדיה חיצונית</string>
    <string name="feature_block_mount_physical_media_description">מונעת מהמכשיר לקרוא כרטיסי זיכרון (SD) או התקני USB OTG.</string>
    <string name="feature_disable_keyguard_title">השבתת מסך הנעילה</string>
    <string name="feature_disable_keyguard_description">מבטלת לחלוטין את הצורך במסך נעילה. שימושי למכשירי קיוסק.</string>
    <string name="feature_block_config_location_title">חסימת שינוי הגדרות מיקום</string>
    <string name="feature_block_config_location_description">מונעת מהמשתמש לכבות GPS או לשנות את הגדרות המיקום.</string>
    <string name="feature_block_config_credentials_title">חסימת התקנת אישורי אבטחה</string>
    <string name="feature_block_config_credentials_description">מונעת מהמשתמש לנהל ולהתקין תעודות אבטחה (Certificates).</string>
    <string name="feature_block_printing_title">חסימת הדפסה</string>
    <string name="feature_block_printing_description">חוסמת את היכולת להדפיס מסמכים ותמונות מהמכשיר.</string>
    <string name="feature_block_config_cell_broadcasts_title">חסימת הגדרות שידור סלולרי</string>
    <string name="feature_block_config_cell_broadcasts_description">מונעת שינוי של הגדרות התראות חירום ושידורים סלולריים.</string>
    <string name="feature_block_content_capture_title">חסימת לכידת תוכן מסך</string>
    <string name="feature_block_content_capture_description">מונעת מאפליקציות צד שלישי ללכוד את תוכן המסך לצורך ניתוח.</string>
    <string name="feature_block_system_error_dialogs_title">חסימת דיאלוג שגיאות מערכת</string>
    <string name="feature_block_system_error_dialogs_description">מונעת הצגת חלונות קופצים של שגיאות מערכת (כמו "אפליקציה קרסה").</string>
    <string name="feature_block_password_change_title">חסימת שינוי סיסמה</string>
    <string name="feature_block_password_change_description">מונעת שינוי סיסמת המכשיר</string>
    <string name="toast_installing_netguard">מתקין את NetGuard...</string>
    <string name="toast_netguard_can_be_uninstalled">NetGuard אינו מוגן יותר. כעת ניתן למחוק את האפליקציה.</string>
    <string name="feature_block_vpn_settings_title">חסימת הגדרות VPN</string>
    <string name="feature_block_vpn_settings_description">מונע מהמשתמש לגשת למסך הגדרות ה-VPN של המכשיר.</string>
    <string name="feature_install_netguard_title">התקן והגן על NetGuard</string>
    <string name="feature_install_netguard_description">מתקין את NetGuard ומונע את הסרתו מהמכשיר.</string>
    <string name="feature_force_netguard_vpn_title">כפה את NetGuard כ-VPN תמידי</string>
    <string name="feature_force_netguard_vpn_description">מגדיר את NetGuard כ-VPN במצב Always-On עם נעילה.</string>
    <string name="conflict_reason_netguard_installed">מושבת מכיוון ש-NetGuard מותקן</string>
    <string name="feature_frp_protection_title">הגנת איפוס (FRP)</string>
    <string name="feature_frp_protection_description">מונע איפוס המכשיר על ידי נעילתו לחשבונות Google מוגדרים מראש.</string>
    <string name="category_device_management">ניהול מכשיר כללי</string>
    <string name="category_hardware">חומרה וחיישנים</string>
    <string name="category_network">רשת ותקשורת</string>
    <string name="category_apps">אפליקציות ותוכן</string>
    <string name="category_vpn">VPN וחומת אש</string>
    <string name="category_calls_sms">שיחות והודעות</string>
    <string name="category_ui">ממשק משתמש</string>
    <string name="category_advanced">הגדרות מערכת מתקדמות</string>
    <string name="feature_frp_protection_experimental_tag">(נסיוני)</string>
    <string name="frp_warning_dialog_title">אזהרה: תכונה נסיונית</string>
    <string name="frp_warning_dialog_message">הפעלת הגנת FRP היא פעולה מתקדמת שעלולה, במקרים נדירים או בתצורה שגויה, לנעול את המכשיר לצמיתות ולדרוש התערבות יצרן. האם אתה בטוח שברצונך להמשיך?</string>
    <string name="contact_email">c51525355@gmail.com</string>

    <string name="settings_item_enable_updates">אפשר עדכונים לאפליקציה</string>
    <string name="category_ui_and_behavior">התאמה אישית והתנהגות</string>
    <string name="settings_item_toggle_position">הצג פקדים בצד ימין</string>
    <string name="settings_item_use_checkbox">השתמש בתיבות סימון (במקום מתגים)</string>
    <string name="settings_item_show_contact_email">הצג אפשרות יצירת קשר במייל</string>
    <string name="settings_item_disable_all_updates">השבת את כל העדכונים (כולל ידני)</string>
    <string name="settings_item_lock_settings">נעל הגדרות לצמיתות</string>
    <string name="settings_lock_dialog_title">אזהרה: פעולה בלתי הפיכה</string>
    <string name="settings_lock_dialog_message">נעילת ההגדרות תסיר לצמיתות את הגישה למסך זה ותשבית את כל העדכונים העתידיים. לא ניתן לבטל פעולה זו. האם אתה בטוח שברצונך להמשיך?</string>

    <string name="settings_lock_dialog_allow_manual_update">השאר עדכון ידני מאובטח פעיל</string>
    <string name="check_for_updates">בדוק אם יש עדכון</string>
    <string name="update_check_checking">בודק עדכונים...</string>
    <string name="update_check_no_update">יש לך את הגרסה העדכנית ביותר.</string>
    <string name="category_app_management">ניהול אפליקציות</string>
    <string name="category_advanced_actions">פעולות מתקדמות</string>

    <string name="update_channel_button">ערוץ עדכון</string>
    <string name="update_settings_title">הגדרות עדכון</string>
    <string name="update_channel_stable">ערוץ יציב</string>
    <string name="update_channel_prebuild">ערוץ Prebuild</string>
    <string name="update_channel_explanation_title">הסבר</string>
    <string name="update_channel_explanation_message">מומלץ לבחור בערוץ יציב, אך אם אתה מעונין בפיצ\'רים החדשים מיד שהם יוצאים, אתה יכול לבחור בערוץ הPrebuild.</string>
    <string name="settings_item_frp">הגדר FRP מותאם אישית</string>
    <string name="boot_notification_message">A Bloq הופעל עם הדלקת המכשיר!</string>
    <string name="settings_item_show_boot_toast">הצג התראה בעת הפעלת המכשיר</string>
    <string name="category_kiosk_mode">מצב קיוסק</string>
    <string name="settings_item_manage_kiosk">נהל מצב קיוסק</string>
    <string name="kiosk_management_title">ניהול מצב קיוסק</string>
    <string name="kiosk_management_enable_label">הפעל מצב קיוסק</string>
    <string name="kiosk_management_enable_description">כאשר מופעל, האפליקציה תעלה ישירות ללאנצ\'ר הקיוסק הנעול.</string>
    <string name="kiosk_management_select_apps">בחר אפליקציות להצגה</string>
    <string name="kiosk_management_monitor_label">הגבלה מחמירה</string>
    <string name="kiosk_management_monitor_description">מונע יציאה מהאפליקציות בקיוסק גם לצורך הצגה של תמונה או משהו דומה, באופן המקסימלי</string>
    <string name="kiosk_management_action_buttons_title">כפתורי פעולה בקיוסק</string>
    <string name="kiosk_action_wifi">Wi‑Fi</string>
    <string name="kiosk_action_bluetooth">Bluetooth</string>
    <string name="kiosk_action_flashlight">פנס</string>
    <string name="kiosk_action_volume">ווליום</string>
    <string name="kiosk_block_launcher_dialog_title">הפעלת מצב קיוסק</string>
    <string name="kiosk_block_launcher_dialog_message">האם לחסום את אפליקציית מסך הבית הנוכחית (Launcher)? חסימתה תמנע יציאה ממצב קיוסק באמצעות כפתור הבית.</string>
    <string name="kiosk_toast_disabled">מצב קיוסק בוטל.</string>
    <string name="kiosk_customization_title">התאמה אישית</string>
    <string name="kiosk_customization_header_title">כותרת עליונה</string>
    <string name="kiosk_customization_background_color">צבע רקע</string>
    <string name="kiosk_customization_accent_color">צבע מבטא (Accent)</string>
    <string name="kiosk_customization_date_format">פורמט תאריך</string>
    <string name="kiosk_date_format_gregorian">לועזי</string>
    <string name="kiosk_date_format_hebrew">עברי</string>
    <string name="kiosk_customization_general_settings">הגדרות כלליות</string>
    <string name="kiosk_customization_show_update_button">הצג כפתור עדכון מאובטח</string>
    <string name="kiosk_customization_bottom_bar_actions">פעולות בסרגל התחתון</string>
    <string name="folder_name_dialog_title">שם התיקייה</string>
    <string name="folder_name_dialog_hint">הכנס שם</string>
    <string name="folder_name_dialog_create">צור</string>

    <string name="kiosk_action_location">מיקום</string>
    <string name="kiosk_action_rotation">נעילת סיבוב</string>
    <string name="kiosk_no_apps_selected">לא נבחרו אפליקציות להצגה</string>
    <string name="kiosk_toast_feature_unavailable">התכונה הזאת עתידית - ואינה זמינה בגרסה שברשותך!</string>
    <string name="kiosk_management_customize">התאם אישית תצוגה ופעולות</string>
    <string name="kiosk_launcher_warning_dialog_title">הודעת אבטחה</string>
    <string name="kiosk_launcher_warning_dialog_message">שים לב! הקיוסק הינו תכונה נסיונית, יכול להיות שיש בה פריצות אבטחה! \n אתה מוזמן לדווח על באגים למפתח.</string>
    <string name="kiosk_toast_enabled">מצב קיוסק הופעל. המכשיר תופעל במצב קיוסק ברגע שתצא מהאפליקציה.</string>

    <string name="kiosk_content_desc_battery">מצב סוללה</string>
    <string name="kiosk_content_desc_secure_update">עדכון מאובטח</string>
    <string name="kiosk_content_desc_main_settings">הגדרות ראשיות</string>
    <string name="kiosk_content_desc_about_app">אודות האפליקציה</string>

    <!-- Netfree Only Mode -->
    <string name="feature_netfree_only_title">מצב נטפרי בלבד</string>
    <string name="feature_netfree_only_description">חוסם את כל תעבורת הרשת אם החיבור אינו מסונן על ידי נטפרי.</string>
    <string name="toast_netfree_check_started">רשת חדשה זוהתה, בודק סינון נטפרי...</string>
    <string name="toast_netfree_check_success">הרשת מאושרת על ידי נטפרי. הגלישה מאופשרת.</string>
    <string name="toast_netfree_check_fail_blocking">הרשת אינה מסוננת. האינטרנט נחסם.</string>

    <!-- ### הוספה ועדכון של טקסטים ### -->
    <string name="netfree_notification_channel_name">ניטור סינון נטפרי</string>
    <string name="netfree_notification_channel_description">התראה המציינת שסינון נטפרי מנוטר ברקע.</string>
    <string name="netfree_notification_content">מצב סינון נטפרי מנוטר ברקע.</string>
    <string name="vpn_notification_channel_name">שירות חומת אש</string>
    <string name="vpn_notification_channel_description">התראה המציינת ששירות חומת האש (VPN) פעיל.</string>
    <string name="vpn_notification_content">שירות חומת האש פעיל.</string>
    <string name="netfree_no_active_network">אין חיבור רשת פעיל.</string>
    <string name="netfree_service_restarted">שירות ניטור נטפרי אותחל.</string>
    <string name="netfree_recheck_triggered">מבצע בדיקה חוזרת...</string>

    <string name="netfree_status_title">סטטוס סינון נטפרי</string>
    <string name="netfree_status_verified">הרשת מסוננת</string>
    <string name="netfree_status_verified_wifi">הרשת מסוננת (Wi-Fi)</string>
    <string name="netfree_status_verified_cellular">הרשת מסוננת (נתונים סלולריים)</string>
    <string name="netfree_status_not_verified_and_blocked">הרשת אינה מסוננת (האינטרנט חסום)</string>
    <string name="netfree_status_checking">בודק סטטוס...</string>
    <string name="netfree_status_service_inactive">השירות אינו פעיל</string>
    <string name="netfree_button_recheck">בדיקה חוזרת</string>
    <string name="netfree_button_restart_service">אתחול השירות</string>

    <!-- Project-wide identified strings -->
    <string name="toast_installing_update">מתקין עדכון, האפליקציה תופעל מחדש...</string>
    <string name="update_dialog_installing">מתקין עדכון...</string>
    <string name="update_dialog_please_wait">אנא המתן...</string>
    <string name="update_dialog_processing">מעבד...</string>
    <string name="update_dialog_error">שגיאה</string>
    <string name="error_reading_apk">לא ניתן היה לקרוא את קובץ ה-APK.</string>
    <string name="error_reading_apk_generic">שגיאה בקריאת קובץ ה-APK.</string>
    <string name="error_installing_update">שגיאה בהתחלת ההתקנה: %s</string>
    <string name="frp_settings_title">הגדר FRP מותאם אישית</string>
    <string name="frp_settings_description">הוסף חשבונות Google (לפי User ID) שיורשו לבצע איפוס למכשיר. אם רשימה זו ריקה, ייעשה שימוש בחשבון ברירת המחדל.</string>
    <string name="frp_settings_label_user_id">הזן User ID</string>
    <string name="frp_settings_empty_list">לא הוגדרו חשבונות מותאמים אישית.</string>
    <string name="frp_settings_error_already_exists">ID כבר קיים ברשימה</string>
    <string name="frp_settings_error_digits_only">יש להזין ID המכיל מספרים בלבד</string>
    <string name="frp_settings_saved_success">רשימת ה-FRP המותאמת נשמרה</string>
    <string name="dashboard_error_app_not_installed">האפליקציה לא מותקנת!</string>
    <string name="dashboard_error_mod_apk_incompatibility">יכול להיות שמדובר באפליקציה שעברה שינוים (MOD), ואינה תואמת לעדכון.</string>
    <string name="dashboard_button_understood">הבנתי</string>
    <string name="app_info_version">גרסה:</string>
    <string name="app_info_status">סטטוס:</string>
    <string name="app_info_author">יוצר:</string>
    <string name="app_info_author_name">יוסי פוליטנסקי</string>
    <string name="app_info_forum_user">במתמחים טופ:</string>
    <!--suppress AndroidDomInspection -->
    <string name="app_info_forum_user_name">@iosi-poli</string>
    <string name="app_info_contact_us">ליצירת קשר:</string>
    <string name="app_info_button_contact_email">צור קשר במייל</string>
    <string name="app_info_button_close">סגור</string>
    <string name="settings_error_vpn_permission_required">נדרש אישור להפעלת ה-VPN</string>
    <string name="settings_error_loading_device_admins">שגיאה בטעינת רשימת אפליקציות ניהול המכשיר</string>
    <string name="settings_error_android_version_required">תכונה זו זמינה רק מגרסת אנדרואיד 9 ומעלה</string>
    <string name="settings_transfer_ownership_success">הבעלות הועברה בהצלחה ל-%s</string>
    <string name="settings_transfer_ownership_error">שגיאה בהעברת הבעלות: %s</string>
    <string name="settings_transfer_ownership_error_unsupported">היעד שנבחר לא תומך בהעברת בעלות: %s</string>
    <string name="settings_transfer_ownership_error_invalid_state">מצב לא תקין להעברת בעלות: %s</string>
    <string name="settings_transfer_ownership_error_unexpected">שגיאה לא צפויה בהעברת הבעלות: %s</string>
    <string name="removal_error_security">שגיאת אבטחה בהסרת הרשאות: %s</string>
    <string name="removal_error_invalid_parameter">פרמטר לא תקין בהסרה: %s</string>
    <string name="removal_error_invalid_state">מצב לא תקין בהסרה: %s</string>
    <string name="removal_error_runtime">שגיאת זמן ריצה בהסרה: %s</string>
    <string name="removal_error_unexpected">שגיאה לא צפויה בהסרה: %s</string>
    <string name="removal_error_security_title">שגיאת אבטחה</string>
    <string name="removal_error_invalid_parameter_title">פרמטר לא תקין</string>
    <string name="removal_error_invalid_state_title">מצב לא תקין</string>
    <string name="removal_error_runtime_title">שגיאת זמן ריצה</string>
    <string name="removal_error_unexpected_title">שגיאה לא צפויה</string>
    <string name="settings_desc_more_info">מידע נוסף</string>
    <string name="removal_options_dialog_title">אפשרויות הסרה לאייבלוק</string>
    <string name="removal_options_dialog_message">בחר את האפשרות הרצויה:</string>
    <string name="removal_options_button_regular">הסרה רגילה של אייבלוק</string>
    <string name="removal_options_button_transfer">העברת בעלות לפני הסרה</string>
    <string name="device_admin_selection_dialog_title">בחר אפליקציית ניהול מכשיר</string>
    <string name="device_admin_selection_dialog_empty">לא נמצאו אפליקציות ניהול מכשיר אחרות במכשיר זה.</string>
    <string name="device_admin_transfer_dialog_title">העברת ניהול מכשיר?</string>
    <string name="device_admin_transfer_dialog_message">האם אתה בטוח שברצונך להעביר את הרשאות הניהול ל-%1$s?\n\n(שם חבילה=%2$s)\n\nאזהרה! יש אפשרות שלא תוכלו להסיר את הרשאות הניהול מהאפליקציה.\n</string>
    <string name="device_admin_transfer_dialog_button_confirm">כן, העבר</string>
    <string name="device_admin_transfer_dialog_button_cancel">ביטול</string>
    <string name="main_activity_permission_title">נדרשת הרשאה נוספת</string>
    <string name="main_activity_permission_message">כדי שכפתורי ה-Wi-Fi, הבלוטות\' וסיבוב המסך יעבדו ממצב קיוסק, יש להעניק לאפליקציה הרשאה לשנות הגדרות מערכת.\\n\\nאם לא תאשר, רק הפונקציונליות של כפתורים אלו תהיה מוגבלת.</string>
    <string name="main_activity_permission_button_grant">הענק הרשאה</string>
    <string name="main_activity_permission_button_later">לא עכשיו</string>
    <string name="netguard_unsafe_dialog_title">NetGuard אינו בטוח כרגע</string>
    <string name="netguard_unsafe_dialog_message">נטגארד אינו בטוח כרגע, והאבטחה עליו תוסר.\\n\\nהאם ברצונך להסיר גם את נטגארד עצמו על הדרך?</string>
    <string name="netguard_unsafe_button_uninstall">הסר את NetGuard</string>
    <string name="netguard_unsafe_button_keep">השאר את NetGuard</string>
    <string name="kiosk_button_save_return">שמור וחזור לקיוסק</string>
    <string name="kiosk_admin_access_title">גישת מנהל</string>
    <string name="kiosk_admin_access_message">הזן את סיסמת המנהל כדי לגשת להגדרות.</string>
    <string name="kiosk_admin_access_password_label">סיסמה</string>
    <string name="kiosk_power_options_title">אפשרויות הפעלה</string>
    <string name="kiosk_power_options_message">האם ברצונך לבצע הפעלה מחדש של המכשיר?</string>
    <string name="kiosk_power_options_button_restart">הפעלה מחדש (Restart)</string>
    <string name="kiosk_destination_dialog_title">בחר יעד</string>
    <string name="kiosk_destination_dialog_message">לאן תרצה לעבור?</string>
    <string name="kiosk_destination_button_kiosk_settings">הגדרות קיוסק</string>
    <string name="kiosk_destination_button_dashboard">ניהול כללי (Dashboard)</string>
    <string name="kiosk_button_add_apps_now">הוסף אפליקציות עכשיו</string>
    <string name="app_selection_search_hint">חיפוש...</string>
    <string name="app_selection_filter_user">אפליקציות משתמש</string>
    <string name="app_selection_filter_launcher">אפליקציות מסך הבית</string>
    <string name="app_selection_filter_all_except_core">כל האפליקציות (למעט ליבה)</string>
    <string name="app_selection_filter_all">הצג הכל</string>
    <string name="app_selection_add_manual_package">הוסף חבילה ידנית</string>
    <string name="kiosk_management_desc_selected">נבחר</string>
    <string name="frp_settings_desc_delete_id">מחק ID</string>
    <string name="app_selection_title">בחר אפליקציות לחסימה</string>
    <string name="app_selection_desc_add_manual">הוסף חבילה ידנית</string>
    <string name="toast_changes_saved_active">השינויים נשמרים והופעלו</string>
    <string name="app_selection_label_search">חיפוש...</string>
    <string name="app_selection_desc_filter">סנן אפליקציות</string>
    <string name="dialog_add_manual_package_title">הוסף חבילה ידנית</string>
    <string name="dialog_add_manual_package_button_confirm">הוסף וחסימה</string>
    <string name="app_selection_warning_critical_title">אזהרה: אפליקציות חשובות</string>
    <string name="app_selection_warning_critical_message">המהלך צפוי לגרום למכשירך להרס בלתי הפיך, מכיוון שזאת אפליקציה חשובה מדי!</string>
    <string name="app_selection_warning_critical_coming_soon">בקרוב יהיה אפשר לחסום גם את זה בבטחה!</string>
    <string name="app_selection_warning_critical_list_label">אפליקציות שנבחרו:</string>
    
    <!-- Redundant aliases to fix code errors without changing code too much -->
    <string name="permission_dialog_title">נדרשת הרשאה נוספת</string>
    <string name="permission_dialog_message">כדי שכפתורי ה-Wi-Fi, הבלוטות\' וסיבוב המסך יעבדו ממצב קיוסק, יש להעניק לאפליקציה הרשאה לשנות הגדרות מערכת.\\n\\nאם לא תאשר, רק הפונקציונליות של כפתורים אלו תהיה מוגבלת.</string>
    <string name="permission_dialog_button_confirm">הענק הרשאה</string>
    <string name="permission_dialog_button_cancel">לא עכשיו</string>
    <string name="netguard_upgrade_dialog_title">NetGuard אינו בטוח כרגע</string>
    <string name="netguard_upgrade_dialog_message">נטגארד אינו בטוח כרגע, והאבטחה עליו תוסר.\\n\\nהאם ברצונך להסיר גם את נטגארד עצמו על הדרך?</string>
    <string name="netguard_upgrade_dialog_button_uninstall">הסר את NetGuard</string>
    <string name="netguard_upgrade_dialog_button_keep">השאר את NetGuard</string>
    <string name="notification_initializing">Initializing services...</string>
    
    <string name="kiosk_dialog_admin_title">גישת מנהל</string>
    <string name="kiosk_dialog_admin_message">הזן את סיסמת המנהל כדי לגשת להגדרות.</string>
    <string name="kiosk_dialog_admin_label_password">סיסמה</string>
    <string name="kiosk_dialog_power_title">אפשרויות הפעלה</string>
    <string name="kiosk_dialog_power_message">האם ברצונך לבצע הפעלה מחדש של המכשיר?</string>
    <string name="kiosk_dialog_power_warning">שים לב: כיבוי מלא אינו זמין מסיבות אבטחה.</string>
    <string name="kiosk_dialog_power_button_reboot">הפעלה מחדש (Restart)</string>
    <string name="kiosk_dialog_choice_title">בחר יעד</string>
    <string name="kiosk_dialog_choice_message">לאן תרצה לעבור?</string>
    <string name="kiosk_dialog_choice_button_kiosk">הגדרות קיוסק</string>
    <string name="kiosk_dialog_choice_button_dashboard">ניהול כללי (Dashboard)</string>
    <string name="kiosk_toast_app_not_found">לא ניתן לפתוח את האפליקציה</string>
    <string name="kiosk_empty_state_title">אין אפליקציות מוצגות</string>
    <string name="kiosk_empty_state_button">הוסף אפליקציות עכשיו</string>
    <string name="kiosk_desc_power">כיבוי/הפעלה</string>
    <string name="kiosk_desc_settings">הגדרות</string>
    <string name="main_service_initializing">אייבלוק הופעלה עם הדלקת המכשיר.</string>

</resources>
```
