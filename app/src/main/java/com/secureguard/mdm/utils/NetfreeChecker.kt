package com.secureguard.mdm.utils

import android.net.Network
import com.secureguard.mdm.data.model.NetfreeUser
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

object NetfreeChecker {
    private const val TAG = "NetfreeChecker"

    // --- התיקון המרכזי נמצא כאן ---
    private fun getHttpClient(network: Network?): HttpClient {
        return HttpClient(OkHttp) {
            engine {
                // יוצר תצורה מותאמת אישית עבור OkHttp
                config {
                    connectTimeout(20, TimeUnit.SECONDS)
                    readTimeout(20, TimeUnit.SECONDS)
                    writeTimeout(20, TimeUnit.SECONDS)

                    // אם קיבלנו אובייקט רשת, אנו "קושרים" את הלקוח אליו
                    // זה מאלץ את הבקשה לצאת דרך הרשת הפיזית הזו, ועוקף את ה-VPN
                    network?.let {
                        socketFactory(it.socketFactory)
                    }
                }
            }
            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                    isLenient = true
                })
            }
        }
    }

    suspend fun isNetfreeFiltered(network: Network? = null): Boolean {
        // משתמש בפונקציה החדשה כדי לקבל לקוח שתקשורת
        val client = getHttpClient(network)

        return try {
            FileLogger.log(TAG, "Attempting to fetch Netfree status from API via network: $network")
            val user: NetfreeUser = client.get("https://api.internal.netfree.link/user/0").body()
            FileLogger.log(TAG, "API call successful. isNetFree=${user.isNetFree}")
            user.isNetFree
        } catch (e: Exception) {
            FileLogger.log(TAG, "ERROR fetching Netfree status: ${e.message}")
            false
        } finally {
            client.close()
        }
    }
}