package com.secureguard.mdm.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PresetConfig(
    val adminPassword: String? = null,
    val features: Map<String, Boolean> = emptyMap(),
    val kioskApps: List<String>? = null,
    val kioskEnabled: Boolean = false,
    val kioskTitle: String? = null,
    val kioskBackgroundColor: Int? = null,
    val kioskPrimaryColor: Int? = null,
    val kioskShowUpdate: Boolean? = null,
    val kioskActionButtons: Set<String>? = null,
    val kioskLayoutJson: String? = null,
    // New fields
    val blockedApps: Set<String>? = null,
    val suspendedApps: Set<String>? = null,
    val customFrpIds: Set<String>? = null,
    val updateChannel: String? = null,
    val kioskBlockedLauncherPackage: String? = null,
    val kioskSettingsInLockTaskEnabled: Boolean? = null,
    val kioskAppMonitorEnabled: Boolean? = null,
    val autoUpdateCheckEnabled: Boolean? = null
)
