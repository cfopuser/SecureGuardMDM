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