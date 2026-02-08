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
