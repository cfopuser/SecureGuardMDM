package com.secureguard.mdm.services

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.os.Build
import android.os.IBinder
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import androidx.core.content.edit
import com.secureguard.mdm.R
import com.secureguard.mdm.SecureGuardDeviceAdminReceiver
import com.secureguard.mdm.utils.FileLogger
import com.secureguard.mdm.utils.JobSchedulerHelper
import com.secureguard.mdm.utils.NetfreeChecker
import com.secureguard.mdm.utils.NetworkWatcher
import kotlinx.coroutines.*
import java.util.concurrent.ConcurrentHashMap

private const val TAG = "NetfreeMonitorService"
private const val NOTIFICATION_CHANNEL_ID = "NetfreeMonitorChannel"
private const val NOTIFICATION_ID = 1001

// --- הוספת מבנה נתונים לייצוג הסטטוס ---
data class NetfreeStatus(val isBlocked: Boolean, val approvedNetworkType: String?)

class NetfreeMonitorService : Service(), NetworkWatcher.NetworkStateListener {

    private lateinit var networkWatcher: NetworkWatcher
    private val serviceScope = CoroutineScope(Dispatchers.IO + SupervisorJob())
    private val mainScope = CoroutineScope(Dispatchers.Main + SupervisorJob())

    private lateinit var dpm: DevicePolicyManager
    private lateinit var adminComponentName: ComponentName
    private lateinit var connectivityManager: ConnectivityManager

    private val approvedNetworks = ConcurrentHashMap<Network, Int>()

    companion object {
        const val ACTION_START_MONITORING = "ACTION_START_MONITORING"
        const val ACTION_STOP_MONITORING = "ACTION_STOP_MONITORING"
        const val ACTION_FORCE_RECHECK = "ACTION_FORCE_RECHECK"
        private const val PREFS_NAME = "NetfreeServiceState"
        private const val KEY_IS_SERVICE_ACTIVE = "is_service_active"
        // --- הוספת מפתחות חדשים לשמירת המצב ---
        private const val KEY_IS_BLOCKED = "is_blocked"
        private const val KEY_APPROVED_NETWORK_TYPE = "approved_network_type"


        fun setServiceActive(context: Context, isActive: Boolean) {
            FileLogger.log(TAG, "Setting service active state to: $isActive")
            context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE).edit {
                putBoolean(KEY_IS_SERVICE_ACTIVE, isActive)
                // --- הוספה: איפוס המצב כשהשירות כבוי ---
                if (!isActive) {
                    remove(KEY_IS_BLOCKED)
                    remove(KEY_APPROVED_NETWORK_TYPE)
                }
            }
        }

        fun isServiceActive(context: Context): Boolean {
            return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                .getBoolean(KEY_IS_SERVICE_ACTIVE, false)
        }

        // --- הוספה: פונקציה מרכזית לקריאת המצב ---
        fun getNetfreeStatus(context: Context): NetfreeStatus {
            val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            val isBlocked = prefs.getBoolean(KEY_IS_BLOCKED, true) // Default to blocked if service is running but no state is set
            val networkType = prefs.getString(KEY_APPROVED_NETWORK_TYPE, null)
            return NetfreeStatus(isBlocked, networkType)
        }
    }

    // --- הוספה: פונקציה לשמירת המצב ---
    private fun saveNetfreeStatus(isBlocked: Boolean, approvedNetworkType: String?) {
        getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE).edit {
            putBoolean(KEY_IS_BLOCKED, isBlocked)
            if (approvedNetworkType != null) {
                putString(KEY_APPROVED_NETWORK_TYPE, approvedNetworkType)
            } else {
                remove(KEY_APPROVED_NETWORK_TYPE)
            }
        }
    }


    private fun showToast(message: String) {
        mainScope.launch { Toast.makeText(this@NetfreeMonitorService, message, Toast.LENGTH_LONG).show() }
    }

    override fun onCreate() {
        super.onCreate()
        FileLogger.log(TAG, "Service onCreate.")
        networkWatcher = NetworkWatcher(this, this)
        dpm = getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager
        connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        adminComponentName = SecureGuardDeviceAdminReceiver.getComponentName(this)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            ACTION_START_MONITORING -> {
                FileLogger.log(TAG, "Received START_MONITORING action.")
                JobSchedulerHelper.scheduleWatchdog(this)
                startForeground(NOTIFICATION_ID, createNotification())
                enablePersistentFirewall()
                approvedNetworks.clear()
                applyCurrentNetworkPolicy()
                networkWatcher.startWatching()
                setServiceActive(this, true)
            }
            ACTION_STOP_MONITORING -> {
                FileLogger.log(TAG, "Received STOP_MONITORING action.")
                JobSchedulerHelper.cancelWatchdog(this)
                disablePersistentFirewall()
                networkWatcher.stopWatching()
                setServiceActive(this, false)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    stopForeground(STOP_FOREGROUND_REMOVE)
                } else {
                    @Suppress("DEPRECATION")
                    stopForeground(true)
                }
                stopSelf()
            }
            ACTION_FORCE_RECHECK -> {
                FileLogger.log(TAG, "Received FORCE_RECHECK action.")
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    val activeNetwork = connectivityManager.activeNetwork
                    if (activeNetwork != null) {
                        onNetworkAvailable(activeNetwork)
                    } else {
                        showToast(getString(R.string.netfree_no_active_network))
                        applyCurrentNetworkPolicy()
                    }
                } else {
                    showToast(getString(R.string.netfree_no_active_network))
                    applyCurrentNetworkPolicy()
                }
            }
        }
        return START_STICKY
    }


    override fun onNetworkAvailable(network: Network) {
        FileLogger.log(TAG, "Network available: $network. Performing check.")
        performNetfreeCheck(network)
    }

    override fun onNetworkLost(network: Network) {
        FileLogger.log(TAG, "Network lost: $network. Updating policy.")
        if (approvedNetworks.containsKey(network)) {
            approvedNetworks.remove(network)
            applyCurrentNetworkPolicy()
        }
    }

    private fun performNetfreeCheck(network: Network) {
        showToast(getString(R.string.toast_netfree_check_started))
        serviceScope.launch {
            try {
                val isFiltered = NetfreeChecker.isNetfreeFiltered(network)
                if (isFiltered) {
                    val capabilities = connectivityManager.getNetworkCapabilities(network)
                    val transportType = when {
                        capabilities?.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) == true -> NetworkCapabilities.TRANSPORT_WIFI
                        capabilities?.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) == true -> NetworkCapabilities.TRANSPORT_CELLULAR
                        else -> -1
                    }
                    if (transportType != -1) {
                        FileLogger.log(TAG, "Network $network approved (Type: $transportType).")
                        approvedNetworks[network] = transportType
                    }
                } else {
                    FileLogger.log(TAG, "Network $network is NOT approved.")
                    approvedNetworks.remove(network)
                }
            } catch (e: Exception) {
                FileLogger.log(TAG, "Exception during Netfree check for network $network: ${e.message}")
                approvedNetworks.remove(network)
            } finally {
                applyCurrentNetworkPolicy()
            }
        }
    }

    private fun applyCurrentNetworkPolicy() {
        val preferredNetworkEntry = determinePreferredNetwork()

        if (preferredNetworkEntry != null) {
            val (preferredNetwork, networkType) = preferredNetworkEntry
            val networkTypeName = if (networkType == NetworkCapabilities.TRANSPORT_WIFI) "Wi-Fi" else "Cellular"

            showToast(getString(R.string.toast_netfree_check_success))
            FileLogger.log(TAG, "Approved network found: $preferredNetwork ($networkTypeName). Disabling lockdown mode.")
            saveNetfreeStatus(isBlocked = false, approvedNetworkType = networkTypeName)

            try {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    dpm.setAlwaysOnVpnPackage(adminComponentName, packageName, false)
                }

                val vpnIntent = Intent(this, BlockerVpnService::class.java).apply {
                    action = BlockerVpnService.ACTION_UPDATE_POLICY
                    putExtra(BlockerVpnService.EXTRA_PREFERRED_NETWORK, preferredNetwork)
                }
                ContextCompat.startForegroundService(this, vpnIntent)

            } catch (e: Exception) {
                FileLogger.log(TAG, "ERROR applying approved network policy: ${e.message}")
            }

        } else {
            showToast(getString(R.string.toast_netfree_check_fail_blocking))
            FileLogger.log(TAG, "No approved network. Enabling lockdown mode to block all traffic.")
            saveNetfreeStatus(isBlocked = true, approvedNetworkType = null)

            try {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    dpm.setAlwaysOnVpnPackage(adminComponentName, packageName, true)
                }
                val vpnIntent = Intent(this, BlockerVpnService::class.java).apply {
                    action = BlockerVpnService.ACTION_UPDATE_POLICY
                    putExtra(BlockerVpnService.EXTRA_PREFERRED_NETWORK, null as Network?)
                }
                ContextCompat.startForegroundService(this, vpnIntent)

            } catch (e: Exception) {
                FileLogger.log(TAG, "ERROR applying blocking policy (lockdown): ${e.message}")
            }
        }
    }

    private fun determinePreferredNetwork(): Pair<Network, Int>? {
        if (approvedNetworks.isEmpty()) return null

        approvedNetworks.entries.find { it.value == NetworkCapabilities.TRANSPORT_WIFI }?.let {
            FileLogger.log(TAG, "Determined preferred network: Wi-Fi ${it.key}")
            return it.key to it.value
        }

        approvedNetworks.entries.find { it.value == NetworkCapabilities.TRANSPORT_CELLULAR }?.let {
            FileLogger.log(TAG, "Determined preferred network: Cellular ${it.key}")
            return it.key to it.value
        }
        return null
    }


    private fun enablePersistentFirewall() {
        FileLogger.log(TAG, "Enabling persistent firewall (Always-On VPN).")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            try {
                dpm.setAlwaysOnVpnPackage(adminComponentName, packageName, false)
            } catch (e: Exception) {
                FileLogger.log(TAG, "ERROR enabling persistent firewall: ${e.message}")
            }
        }
    }

    private fun disablePersistentFirewall() {
        FileLogger.log(TAG, "Disabling persistent firewall.")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            try {
                dpm.setAlwaysOnVpnPackage(adminComponentName, null, false)
            } catch (e: Exception) {
                FileLogger.log(TAG, "ERROR disabling persistent firewall: ${e.message}")
            }
        }
    }

    private fun createNotification(): Notification {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                NOTIFICATION_CHANNEL_ID,
                getString(R.string.netfree_notification_channel_name),
                NotificationManager.IMPORTANCE_LOW
            ).apply {
                description = getString(R.string.netfree_notification_channel_description)
            }
            getSystemService(NotificationManager::class.java).createNotificationChannel(channel)
        }
        return NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)
            .setContentTitle(getString(R.string.app_name))
            .setContentText(getString(R.string.netfree_notification_content))
            .setSmallIcon(R.drawable.ic_netguard_shield)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setOngoing(true)
            .build()
    }

    override fun onDestroy() {
        super.onDestroy()
        serviceScope.cancel()
        mainScope.cancel()
        if (::networkWatcher.isInitialized) {
            networkWatcher.stopWatching()
        }
        FileLogger.log(TAG, "Service onDestroy.")
    }

    override fun onBind(intent: Intent?): IBinder? = null
}