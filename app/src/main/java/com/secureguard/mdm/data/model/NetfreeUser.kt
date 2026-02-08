package com.secureguard.mdm.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class NetfreeUser {
    @SerialName("isNetFree")
    val isNetFree: Boolean = false

    @SerialName("userKey")
    val userKey: String = ""

    @SerialName("signature")
    val signature: String = ""

    @SerialName("userId")
    val userId: Int = 0

    @SerialName("servername")
    val serverName: String = ""

    @SerialName("plan")
    val plan: Int = 0

    @SerialName("ip")
    val ip: String = ""
}