package com.secureguard.mdm.ui.screens.dashboard.update

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.secureguard.mdm.R
import com.secureguard.mdm.ui.screens.dashboard.DashboardEvent
import com.secureguard.mdm.ui.screens.dashboard.DashboardUiState
import com.secureguard.mdm.ui.screens.dashboard.UpdateDialogState
import com.secureguard.mdm.utils.update.DownloadProgress

@Composable
fun UpdateDialog(
    uiState: DashboardUiState,
    onEvent: (DashboardEvent) -> Unit
) {
    val onDismiss = { onEvent(DashboardEvent.OnDismissUpdateDialog) }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.update_dialog_title)) },
        text = {
            when (uiState.updateDialogState) {
                UpdateDialogState.SHOW_INFO -> {
                    UpdateInfoContent(
                        changelog = uiState.availableUpdateInfo?.changelog ?: "No changelog available."
                    )
                }
                UpdateDialogState.DOWNLOADING -> {
                    DownloadingContent(progress = uiState.downloadProgress)
                }
                UpdateDialogState.ERROR -> {
                    ErrorContent(error = uiState.updateError ?: "Unknown error.")
                }
                else -> {}
            }
        },
        confirmButton = {
            if (uiState.updateDialogState == UpdateDialogState.SHOW_INFO) {
                Button(onClick = { onEvent(DashboardEvent.OnStartUpdateDownload) }) {
                    Text(stringResource(id = R.string.update_dialog_button_download))
                }
            }
        },
        dismissButton = {
            if (uiState.updateDialogState != UpdateDialogState.DOWNLOADING) {
                TextButton(onClick = onDismiss) {
                    Text(stringResource(id = R.string.update_dialog_button_later))
                }
            }
        }
    )
}

@Composable
private fun UpdateInfoContent(changelog: String) {
    Column {
        Text(
            text = stringResource(id = R.string.update_dialog_changelog_title),
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        LazyColumn(modifier = Modifier.heightIn(max = 200.dp)) {
            item {
                Text(text = changelog, style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}

@Composable
private fun DownloadingContent(progress: DownloadProgress) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        when (progress) {
            is DownloadProgress.Downloading -> {
                Text(stringResource(id = R.string.update_dialog_downloading))
                Spacer(modifier = Modifier.height(16.dp))
                LinearProgressIndicator(
                    progress = { progress.progress / 100f },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("${progress.progress}%")
            }
            is DownloadProgress.Installing -> {
                Text(stringResource(id = R.string.update_dialog_installing))
                Spacer(modifier = Modifier.height(16.dp))
                LinearProgressIndicator(
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(stringResource(id = R.string.update_dialog_please_wait))
            }
            else -> {
                Text(stringResource(id = R.string.update_dialog_processing))
                Spacer(modifier = Modifier.height(16.dp))
                LinearProgressIndicator(
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

@Composable
private fun ErrorContent(error: String) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(stringResource(id = R.string.update_dialog_error), style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.error)
        Spacer(modifier = Modifier.height(8.dp))
        Text(error, style = MaterialTheme.typography.bodyMedium)
    }
}
