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
