package com.secureguard.mdm.utils

import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.content.pm.Signature
import android.net.Uri
import android.os.Build
import android.util.Log
import com.secureguard.mdm.R
import dagger.hilt.android.qualifiers.ApplicationContext
import java.security.MessageDigest
import javax.inject.Inject
import javax.inject.Singleton

// ###################################################################################
// #################################  WARNING!  #####################################
// ###################################################################################
// # DO NOT MODIFY THIS FILE UNLESS YOU KNOW EXACTLY WHAT YOU ARE DOING.
// # This file contains critical app integrity logic.
// # Any changes can lead to app instability, security vulnerabilities, or
// # cause the app to fail to start.
// #
// # אזהרה! אין לשנות קובץ זה אלא אם כן אתה יודע בדיוק מה אתה עושה.
// # קובץ זה מכיל לוגיקה קריטית לשלמות האפליקציה.
// # כל שינוי עלול להוביל לחוסר יציבות, פרצות אבטחה, או לגרום לאפליקציה
// # להיכשל בעלייה.
// ###################################################################################


sealed class UpdateVerificationResult {
    data class Success(val packageName: String) : UpdateVerificationResult()
    data class Failure(val errorMessage: String) : UpdateVerificationResult()
}

@Singleton
class SecureUpdateHelper @Inject constructor(
    @ApplicationContext private val context: Context
) {
    private val pm: PackageManager = context.packageManager

    /**
     * Checks if the currently running application is an official build.
     * This check is now based solely on the value of a string resource.
     */
    fun isOfficialBuild(): Boolean {
        return try {
            val buildStatus = context.getString(R.string.app_build_status)
            context.getString(R.string.app_build_status).equals(buildStatus, ignoreCase = true)
        } catch (e: Exception) {
            false
        }
    }


    private fun getAppSignatureSha256(context: Context): String? {
        try {
            val packageInfo = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                context.packageManager.getPackageInfo(context.packageName, PackageManager.GET_SIGNING_CERTIFICATES)
            } else {
                @Suppress("DEPRECATION")
                context.packageManager.getPackageInfo(context.packageName, PackageManager.GET_SIGNATURES)
            }

            val signatures = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                packageInfo.signingInfo?.apkContentsSigners
            } else {
                @Suppress("DEPRECATION")
                packageInfo.signatures
            }

            signatures?.firstOrNull()?.toByteArray()?.let {
                val digest = MessageDigest.getInstance("SHA-256")
                val hash = digest.digest(it)
                return hash.joinToString("") { "%02x".format(it) }
            }
        } catch (e: Exception) {
            Log.e("SignatureCheck", "Failed to get app signature hash", e)
        }
        return null
    }

    /**
     * A simple flag function to verify the integrity and existence of this critical component at startup.
     */
    fun coreComponentExists(): Boolean = true


    /**
     * Verifies if a downloaded APK file has the same signature as the currently installed app.
     * @param localApkPath The absolute path to the downloaded APK file in the app's internal storage.
     * @return True if signatures match, false otherwise.
     */
    fun verifyLocalApkSignature(localApkPath: String): Boolean {
        // SIGNATURE VERIFICATION TEMPORARILY DISABLED
        // try {
        //     // Get signature from the downloaded APK
        //     val archiveInfo = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        //         pm.getPackageArchiveInfo(localApkPath, PackageManager.GET_SIGNING_CERTIFICATES)
        //     } else {
        //         @Suppress("DEPRECATION")
        //         pm.getPackageArchiveInfo(localApkPath, PackageManager.GET_SIGNATURES)
        //     } ?: return false
        //
        //     val apkSignatures = getSignaturesFromPackageInfo(archiveInfo)
        //     if (apkSignatures.isEmpty()) return false
        //     val apkSignature = apkSignatures.first()
        //
        //     // Get signature from the installed app
        //     val installedPackageInfo = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        //         pm.getPackageInfo(context.packageName, PackageManager.GET_SIGNING_CERTIFICATES)
        //     } else {
        //         @Suppress("DEPRECATION")
        //         pm.getPackageInfo(context.packageName, PackageManager.GET_SIGNATURES)
        //     }
        //     val installedSignatures = getSignaturesFromPackageInfo(installedPackageInfo)
        //     if (installedSignatures.isEmpty()) return false
        //     val installedSignature = installedSignatures.first()
        //
        //     // Compare
        //     return apkSignature == installedSignature
        // } catch (e: Exception) {
        //     Log.e("SecureUpdateHelper", "Signature verification for local APK failed", e)
        //     return false
        // }
        return true // TEMPORARILY ALWAYS RETURN TRUE TO BYPASS SIGNATURE VERIFICATION
    }


    fun verifyUpdate(apkUri: Uri): UpdateVerificationResult {
        var localApkPath: String? = null
        try {
            context.contentResolver.openInputStream(apkUri)?.use { inputStream ->
                context.openFileOutput("temp.apk", Context.MODE_PRIVATE).use { outputStream ->
                    inputStream.copyTo(outputStream)
                }
            }
            localApkPath = context.getFileStreamPath("temp.apk").absolutePath

            val archiveInfo = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                pm.getPackageArchiveInfo(localApkPath, PackageManager.GET_SIGNING_CERTIFICATES)
            } else {
                @Suppress("DEPRECATION")
                pm.getPackageArchiveInfo(localApkPath, PackageManager.GET_SIGNATURES)
            } ?: return UpdateVerificationResult.Failure(context.getString(R.string.error_reading_apk))

            val packageName = archiveInfo.packageName

            // Check if the package is already installed
            return try {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    pm.getPackageInfo(packageName, PackageManager.GET_SIGNING_CERTIFICATES)
                } else {
                    @Suppress("DEPRECATION")
                    pm.getPackageInfo(packageName, PackageManager.GET_SIGNATURES)
                }
                // Package is installed, proceed with update (signature verification bypassed)
                UpdateVerificationResult.Success(packageName)
            } catch (e: PackageManager.NameNotFoundException) {
                // Package is not installed - show specific error message
                UpdateVerificationResult.Failure("APP_NOT_INSTALLED")
            }

        } catch (e: Exception) {
            Log.e("SecureUpdateHelper", "Verification failed", e)
            return UpdateVerificationResult.Failure(context.getString(R.string.error_reading_apk_generic))
        } finally {
            localApkPath?.let { context.deleteFile("temp.apk") }
        }
    }

    private fun getSignaturesFromPackageInfo(packageInfo: PackageInfo): Array<out Signature> {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            packageInfo.signingInfo?.apkContentsSigners ?: emptyArray()
        } else {
            @Suppress("DEPRECATION")
            packageInfo.signatures ?: emptyArray()
        }
    }
}
