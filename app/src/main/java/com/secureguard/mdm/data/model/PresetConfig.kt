package com.secureguard.mdm.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PresetConfig(
    val adminPassword: String? = null,
    val features: Map<String, Boolean> = emptyMap(),
    val kioskApps: List<String>? = null,
    val kioskEnabled: Boolean = false
)
