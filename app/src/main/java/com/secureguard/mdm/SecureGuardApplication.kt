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