package com.secureguard.mdm.ui.screens.dashboard

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.secureguard.mdm.R
import com.secureguard.mdm.ui.components.InfoDialog

@Composable
fun AppInfoDialog(
    appVersion: String,
    buildStatus: String,
    isContactEmailVisible: Boolean,
    onCheckForUpdateClick: () -> Unit,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    var showUnofficialWarning by remember { mutableStateOf(false) }

    val isOfficial = buildStatus.equals(stringResource(id = R.string.app_build_status), ignoreCase = true)

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.app_name)) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                InfoRow(stringResource(id = R.string.app_info_version), appVersion)

                Row(verticalAlignment = Alignment.CenterVertically) {
                    InfoRow(stringResource(id = R.string.app_info_status), buildStatus, if (isOfficial) Color(0xFF388E3C) else MaterialTheme.colorScheme.error)
                    if (!isOfficial) {
                        IconButton(onClick = { showUnofficialWarning = true }, modifier = Modifier.size(24.dp)) {
                            Icon(Icons.Default.Warning, contentDescription = stringResource(id = R.string.unofficial_warning_title), tint = MaterialTheme.colorScheme.error)
                        }
                    }
                }

                HorizontalDivider()
                InfoRow(stringResource(id = R.string.app_info_author), stringResource(id = R.string.app_info_author_name))
                InfoRow(stringResource(id = R.string.app_info_forum_user), stringResource(id = R.string.app_info_forum_user_name))
                InfoRow(stringResource(id = R.string.app_info_contact_us), stringResource(id = R.string.contact_email))
            }
        },
        confirmButton = {
            Row {
                if (isOfficial) {
                    TextButton(onClick = {
                        onCheckForUpdateClick()
                        onDismiss()
                    }) {
                        Text(stringResource(id = R.string.check_for_updates))
                    }
                }
                if (isContactEmailVisible) {
                    Button(onClick = {
                        sendEmail(context)
                        onDismiss()
                    }) {
                        Text(stringResource(id = R.string.app_info_button_contact_email))
                    }
                }
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.app_info_button_close))
            }
        }
    )

    if (showUnofficialWarning) {
        InfoDialog(
            title = stringResource(id = R.string.unofficial_warning_title),
            message = stringResource(id = R.string.unofficial_warning_message),
            onDismiss = { showUnofficialWarning = false }
        )
    }
}

@Composable
private fun InfoRow(label: String, value: String, valueColor: Color = Color.Unspecified) {
    Row {
        Text(text = label, fontWeight = FontWeight.Bold, modifier = Modifier.width(110.dp))
        Text(text = value, color = valueColor)
    }
}

private fun sendEmail(context: Context) {
    val email = context.getString(R.string.contact_email)
    val intent = Intent(Intent.ACTION_SENDTO).apply {
        data = Uri.parse("mailto:")
        putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
        putExtra(Intent.EXTRA_SUBJECT, "A bloq App Inquiry")
    }
    try {
        context.startActivity(intent)
    } catch (e: Exception) {
        // Handle case where no email app is installed
    }
}