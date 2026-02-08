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