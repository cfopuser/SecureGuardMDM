package com.secureguard.mdm.utils.update

/**
 * Data class to hold information about an available update.
 * @param versionCode The version code of the available update.
 * @param versionName The version name of the available update.
 * @param changelog The description of changes for the new version.
 * @param downloadUrl The direct URL to download the APK file.
 */
data class UpdateInfo(
    val versionCode: Int,
    val versionName: String, // Can be derived or part of the info file
    val changelog: String,
    val downloadUrl: String
)
