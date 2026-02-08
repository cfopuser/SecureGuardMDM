package com.secureguard.mdm.utils.update

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageInstaller
import android.util.Log
import android.widget.Toast
import androidx.core.content.FileProvider
import com.secureguard.mdm.R
import com.secureguard.mdm.data.local.PreferencesManager
import com.secureguard.mdm.receivers.InstallReceiver
import com.secureguard.mdm.utils.SecureUpdateHelper
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.net.URL
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.math.max
import android.net.ConnectivityManager
import android.os.Build
import android.annotation.SuppressLint

private const val TAG = "UpdateManager"
private const val UPDATE_FILE_NAME = "update.apk"
private const val INSTALL_SESSION_NAME = "AbloqUpdateSession"

sealed class UpdateResult {
    data class UpdateAvailable(val info: UpdateInfo) : UpdateResult()
    object NoUpdate : UpdateResult()
    data class Failure(val message: String) : UpdateResult()
}

sealed class DownloadResult {
    object Success : DownloadResult()
    data class Failure(val message: String) : DownloadResult()
}

sealed class DownloadProgress {
    data class Downloading(val progress: Int) : DownloadProgress()
    object Installing : DownloadProgress()
    object Completed : DownloadProgress()
    data class Error(val message: String) : DownloadProgress()
}


@Singleton
class UpdateManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val secureUpdateHelper: SecureUpdateHelper,
    private val preferencesManager: PreferencesManager
) {

    private val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    private fun getChannelUrls(): Triple<String, String, String> {
        val savedChannel = preferencesManager.loadString(PreferencesManager.KEY_UPDATE_CHANNEL, null)
        return when (savedChannel) {
            "PREBUILD" -> Triple(
                "https://raw.githubusercontent.com/sesese1234/SecureGuardMDM/PreBuild/version.txt",
                "https://raw.githubusercontent.com/sesese1234/SecureGuardMDM/PreBuild/changes.txt",
                "https://raw.githubusercontent.com/sesese1234/SecureGuardMDM/PreBuild/app/release/Abloq-release.apk"
            )
            else -> Triple(
                context.getString(R.string.update_version_url),
                context.getString(R.string.update_changelog_url),
                context.getString(R.string.update_apk_download_url)
            )
        }
    }

    /**
     * Compares two version name strings (e.g., "1.2.3" vs "1.2.10").
     * @return A positive integer if remoteVersion is greater, a negative integer if localVersion is greater,
     * or 0 if they are equal.
     */
    private fun compareVersionNames(localVersion: String, remoteVersion: String): Int {
        val localParts = localVersion.split('.').map { it.toIntOrNull() ?: 0 }
        val remoteParts = remoteVersion.split('.').map { it.toIntOrNull() ?: 0 }
        val partCount = max(localParts.size, remoteParts.size)

        for (i in 0 until partCount) {
            val localPart = localParts.getOrElse(i) { 0 }
            val remotePart = remoteParts.getOrElse(i) { 0 }
            if (remotePart > localPart) return 1
            if (localPart > remotePart) return -1
        }
        return 0
    }

    suspend fun checkForUpdate(): UpdateResult = withContext(Dispatchers.IO) {
        @SuppressLint("MissingPermission")
        val isNetworkUnavailable = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            connectivityManager.activeNetwork == null
        } else {
            @Suppress("DEPRECATION")
            connectivityManager.activeNetworkInfo?.isConnected != true
        }

        if (isNetworkUnavailable) {
            Log.d(TAG, "Update check skipped: No active network connection.")
            return@withContext UpdateResult.NoUpdate
        }

        if (!secureUpdateHelper.isOfficialBuild()) {
            Log.d(TAG, "Update check skipped: Not an official build.")
            return@withContext UpdateResult.NoUpdate
        }

        try {
            val urls = getChannelUrls()
            val versionUrl = urls.first
            val changelogUrl = urls.second
            val apkUrl = urls.third
            val remoteVersionName = URL(versionUrl).readText().trim()
            val currentVersionName = context.getString(R.string.app_version_name_for_logic)

            Log.d(TAG, "Remote version: $remoteVersionName, Current version: $currentVersionName")

            if (compareVersionNames(currentVersionName, remoteVersionName) > 0) {
                Log.i(TAG, "Update available. Fetching changelog...")
                val changelog = URL(changelogUrl).readText().trim()

                val updateInfo = UpdateInfo(
                    versionCode = 0, // Not used for logic anymore, but kept for structure
                    versionName = remoteVersionName,
                    changelog = changelog,
                    downloadUrl = apkUrl
                )
                return@withContext UpdateResult.UpdateAvailable(updateInfo)
            } else {
                Log.d(TAG, "No new update available.")
                return@withContext UpdateResult.NoUpdate
            }

        } catch (e: Exception) {
            Log.e(TAG, "Update check failed", e)
            return@withContext UpdateResult.Failure("Failed to check for updates: ${e.message}")
        }
    }

    fun downloadAndInstallUpdate(updateInfo: UpdateInfo): Flow<DownloadProgress> = callbackFlow {
        val outputFile = File(context.filesDir, UPDATE_FILE_NAME)
        try {
            val url = URL(updateInfo.downloadUrl)
            val connection = url.openConnection()
            connection.connect()

            val fileLength = connection.contentLength
            val input = connection.getInputStream()
            val output = FileOutputStream(outputFile)
            val data = ByteArray(1024 * 4)
            var total: Long = 0
            var count: Int

            while (input.read(data).also { count = it } != -1) {
                total += count.toLong()
                if (fileLength > 0) {
                    val progress = (total * 100 / fileLength).toInt()
                    trySend(DownloadProgress.Downloading(progress))
                }
                output.write(data, 0, count)
            }
            output.flush()
            output.close()
            input.close()
            trySend(DownloadProgress.Downloading(100)) // Ensure it finishes at 100%

            // --- התיקון כאן ---
            // בדיקת החתימה הוסרה מבקשתך. במקור היה כאן תנאי שמוודא את תקינות החתימה.
            Log.d(TAG, "Download complete. Skipping signature verification and proceeding to MDM install.")
            trySend(DownloadProgress.Installing)
            installApkSilently(outputFile)
            trySend(DownloadProgress.Completed)
            // --- סוף התיקון ---

        } catch (e: Exception) {
            Log.e(TAG, "Download or installation failed", e)
            trySend(DownloadProgress.Error(e.message ?: "Unknown error"))
            close(e) // Propagate error to the collector
        } finally {
            if (outputFile.exists()) {
                outputFile.delete()
            }
        }
        awaitClose { /* Cleanup if needed */ }
    }.flowOn(Dispatchers.IO)

    private suspend fun installApkSilently(apkFile: File) {
        var session: PackageInstaller.Session? = null
        try {
            val packageInstaller = context.packageManager.packageInstaller
            val params = PackageInstaller.SessionParams(PackageInstaller.SessionParams.MODE_FULL_INSTALL)
            val sessionId = packageInstaller.createSession(params)
            session = packageInstaller.openSession(sessionId)

            FileInputStream(apkFile).use { fileInputStream ->
                session.openWrite(INSTALL_SESSION_NAME, 0, apkFile.length()).use { sessionOutputStream ->
                    fileInputStream.copyTo(sessionOutputStream)
                    session.fsync(sessionOutputStream)
                }
            }

            Log.d(TAG, "APK file written to session. Committing installation.")

            withContext(Dispatchers.Main) {
                Toast.makeText(context, context.getString(R.string.toast_installing_update), Toast.LENGTH_LONG).show()
            }

            val intent = Intent(context, InstallReceiver::class.java)
            val pendingIntent = PendingIntent.getBroadcast(
                context,
                sessionId,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_MUTABLE
            )

            session.commit(pendingIntent.intentSender)

        } catch (e: Exception) {
            Log.e(TAG, "Silent installation failed.", e)
            session?.abandon()
            throw e
        } finally {
            session?.close()
        }
    }
}
