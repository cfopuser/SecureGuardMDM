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