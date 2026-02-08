package com.secureguard.mdm.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest

class NetworkWatcher(
    context: Context,
    private val listener: NetworkStateListener
) {
    interface NetworkStateListener {
        fun onNetworkAvailable(network: Network)
        fun onNetworkLost(network: Network)
    }

    private val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    private var networkCallback: ConnectivityManager.NetworkCallback? = null

    fun startWatching() {
        val networkRequest = NetworkRequest.Builder()
            .addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
            .build()

        networkCallback = object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                listener.onNetworkAvailable(network)
            }

            override fun onLost(network: Network) {
                listener.onNetworkLost(network)
            }
        }
        connectivityManager.registerNetworkCallback(networkRequest, networkCallback!!)
    }

    fun stopWatching() {
        networkCallback?.let {
            connectivityManager.unregisterNetworkCallback(it)
            networkCallback = null
        }
    }
}