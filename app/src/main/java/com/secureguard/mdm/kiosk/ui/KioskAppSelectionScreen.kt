package com.secureguard.mdm.kiosk.ui

import com.secureguard.mdm.ui.theme.SecureGuardTheme
import android.content.Intent
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.drawablepainter.rememberDrawablePainter
import com.secureguard.mdm.R
import com.secureguard.mdm.appblocker.AppInfo
import com.secureguard.mdm.kiosk.vm.KioskAppSelectionViewModel

/**
 * מסך בחירת אפליקציות לקיוסק
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KioskAppSelectionScreen(
    viewModel: KioskAppSelectionViewModel = hiltViewModel(),
    onNavigateBack: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    val systemDirection = if (java.util.Locale.getDefault().language == "iw" || java.util.Locale.getDefault().language == "he") {
        androidx.compose.ui.unit.LayoutDirection.Rtl
    } else {
        androidx.compose.ui.unit.LayoutDirection.Ltr
    }

    SecureGuardTheme {
        val layoutDirection = if (java.util.Locale.getDefault().language == "iw" || java.util.Locale.getDefault().language == "he") {
            androidx.compose.ui.unit.LayoutDirection.Rtl
        } else {
            androidx.compose.ui.unit.LayoutDirection.Ltr
        }

        androidx.compose.runtime.CompositionLocalProvider(
            androidx.compose.ui.platform.LocalLayoutDirection provides layoutDirection
        ) {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text(stringResource(id = R.string.kiosk_management_select_apps)) },
                            navigationIcon = {
                                IconButton(onClick = onNavigateBack) {
                                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = stringResource(id = R.string.dialog_button_cancel))
                                }
                            }
                        )
                    },
                    floatingActionButton = {
                        if (uiState.isKioskEnabled) {
                            val context = LocalContext.current
                            ExtendedFloatingActionButton(
                                onClick = { 
                                    if (uiState.selectedPackages.isNotEmpty()) {
                                        val intent = Intent(context, KioskActivity::class.java).apply {
                                            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
                                        }
                                        context.startActivity(intent)
                                    } else {
                                        onNavigateBack()
                                    }
                                },
                                containerColor = MaterialTheme.colorScheme.primary,
                                contentColor = MaterialTheme.colorScheme.onPrimary,
                                icon = { Icon(Icons.Default.Check, contentDescription = null) },
                                text = { Text(stringResource(id = R.string.kiosk_button_save_return)) }
                            )
                        }
                    }
                ) { padding ->
                    if (uiState.isLoading) {
                        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                            CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)
                        }
                    } else {
                        LazyVerticalGrid(
                            columns = GridCells.Fixed(4),
                            contentPadding = PaddingValues(12.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalArrangement = Arrangement.spacedBy(12.dp),
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(padding)
                        ) {
                            items(uiState.allApps, key = { it.packageName }) { app ->
                                val isSelected = uiState.selectedPackages.contains(app.packageName)
                                AppSelectItem(
                                    app = app,
                                    isSelected = isSelected,
                                    onClick = { viewModel.toggleApp(app.packageName) }
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun AppSelectItem(
    app: AppInfo,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .clickable(onClick = onClick)
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box {
            Image(
                painter = rememberDrawablePainter(drawable = app.icon),
                contentDescription = app.appName,
                modifier = Modifier
                    .size(56.dp)
                    .clip(RoundedCornerShape(12.dp))
            )
            if (isSelected) {
                Icon(
                    Icons.Default.Check,
                    contentDescription = stringResource(id = R.string.kiosk_management_desc_selected),
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .size(20.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = app.appName,
            fontSize = 11.sp,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center
        )
    }
}
