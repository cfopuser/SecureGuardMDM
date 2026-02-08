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
