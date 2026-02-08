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