package com.secureguard.mdm.kiosk.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.secureguard.mdm.ui.theme.SecureGuardTheme

data class LauncherInfo(val appName: String, val packageName: String)

/**
 * מסך בחירת לאנצ'ר - מוצג כשהקיוסק מוגדר כ-Home אבל מצב קיוסק כבוי
 */
@Composable
fun HomeLauncherSelectionScreen(
    onDismiss: () -> Unit
) {
    val context = LocalContext.current

    // הפעל משימות רקע (Boot) כשאנחנו משמשים כלאנצ'ר זמני
    LaunchedEffect(Unit) {
        com.secureguard.mdm.boot.BootCompletedReceiver.simulateBootCompleted(context)
    }

    SecureGuardTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(32.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = androidx.compose.material.icons.Icons.Default.Home,
                    contentDescription = null,
                    modifier = Modifier.size(80.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
                
                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "אייבלוק מוגדר כמסך הבית",
                    style = MaterialTheme.typography.headlineMedium,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "מכיוון שמצב קיוסק כבוי כרגע, עליך להחליף את אפליקציית הבית בהגדרות המערכת כדי לחזור לשימוש רגיל.",
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                Spacer(modifier = Modifier.height(48.dp))

                Button(
                    onClick = {
                        try {
                            val intent = android.content.Intent(android.provider.Settings.ACTION_HOME_SETTINGS)
                            context.startActivity(intent)
                        } catch (e: Exception) {
                            val intent = android.content.Intent(android.provider.Settings.ACTION_SETTINGS)
                            context.startActivity(intent)
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    contentPadding = PaddingValues(16.dp)
                ) {
                    Text("שינוי הגדרות מסך הבית", style = MaterialTheme.typography.titleMedium)
                }

                Spacer(modifier = Modifier.height(16.dp))

                TextButton(
                    onClick = { onDismiss() }
                ) {
                    Text("המשך לדשבורד של אייבלוק", color = MaterialTheme.colorScheme.primary)
                }
            }
        }
    }
}
