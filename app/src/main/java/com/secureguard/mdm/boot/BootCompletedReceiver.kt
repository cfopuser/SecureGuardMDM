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
