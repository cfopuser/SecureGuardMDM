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