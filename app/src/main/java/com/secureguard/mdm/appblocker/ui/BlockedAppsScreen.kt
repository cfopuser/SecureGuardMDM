package com.secureguard.mdm.appblocker.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Block
import androidx.compose.material.icons.filled.LockOpen
import androidx.compose.material.icons.filled.PauseCircle
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.drawablepainter.rememberDrawablePainter
import com.secureguard.mdm.appblocker.AppBlockerEvent
import com.secureguard.mdm.appblocker.AppBlockerViewModel
import com.secureguard.mdm.appblocker.AppInfo
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BlockedAppsScreen(
    viewModel: AppBlockerViewModel = hiltViewModel(),
    onNavigateBack: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    var showAddPackageDialog by remember { mutableStateOf(false) }
    var showActionChoiceDialog by remember { mutableStateOf<AppInfo?>(null) }
    val coroutineScope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    LaunchedEffect(Unit) {
        viewModel.loadAllData()
    }

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        topBar = {
            TopAppBar(
                title = { Text("אפליקציות חסומות") },
                navigationIcon = { IconButton(onClick = onNavigateBack) { Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back") } },
                actions = {
                    IconButton(onClick = { showAddPackageDialog = true }) {
                        Icon(Icons.Default.Add, contentDescription = "הוסף חבילה ידנית")
                    }
                }
            )
        },
        floatingActionButton = {
            when {
                uiState.selectionForUnblock.isNotEmpty() -> {
                    FloatingActionButton(onClick = { viewModel.onEvent(AppBlockerEvent.OnUnblockSelectedRequest) }) {
                        Icon(Icons.Default.LockOpen, contentDescription = "שחרר חסימה")
                    }
                }
                uiState.selectionForUnsuspend.isNotEmpty() -> {
                    FloatingActionButton(onClick = { viewModel.onEvent(AppBlockerEvent.OnUnsuspendSelectedRequest) }) {
                        Icon(Icons.Default.PauseCircle, contentDescription = "שחרר השבתה")
                    }
                }
            }
        }
    ) { paddingValues ->
        Column(modifier = Modifier.fillMaxSize().padding(paddingValues)) {
            OutlinedTextField(
                value = uiState.searchQuery,
                onValueChange = { viewModel.onEvent(AppBlockerEvent.OnSearchQueryChanged(it)) },
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
                label = { Text("חיפוש...") },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Search Icon") },
                singleLine = true
            )

            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                val blockedApps = uiState.displayedBlockedApps
                val suspendedApps = uiState.displayedSuspendedApps
                if (uiState.isLoading) {
                    CircularProgressIndicator()
                } else if (blockedApps.isEmpty() && suspendedApps.isEmpty() && uiState.searchQuery.isBlank()) {
                    Text(
                        text = "לא הוגדרו אפליקציות לחסימה.",
                        style = MaterialTheme.typography.bodyLarge,
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                    )
                } else if (blockedApps.isEmpty() && suspendedApps.isEmpty() && uiState.searchQuery.isNotBlank()) {
                    Text(
                        text = "לא נמצאו אפליקציות חסומות התואמות לחיפוש.",
                        style = MaterialTheme.typography.bodyLarge,
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                    )
                }
                else {
                    LazyColumn(modifier = Modifier.fillMaxSize(), contentPadding = PaddingValues(vertical = 8.dp)) {
                        if (blockedApps.isNotEmpty()) {
                            item {
                                Text(
                                    text = "חסומות",
                                    style = MaterialTheme.typography.titleSmall,
                                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                                )
                            }
                            items(items = blockedApps, key = { it.packageName }) { appInfo ->
                                BlockedAppRow(
                                    appInfo = appInfo,
                                    isSelected = uiState.selectionForUnblock.contains(appInfo.packageName),
                                    onToggleSelection = { viewModel.onEvent(AppBlockerEvent.OnToggleUnblockSelection(appInfo.packageName)) },
                                    onActionClick = { showActionChoiceDialog = appInfo }
                                )
                                HorizontalDivider()
                            }
                        }
                        if (suspendedApps.isNotEmpty()) {
                            item {
                                Text(
                                    text = "מושבתות",
                                    style = MaterialTheme.typography.titleSmall,
                                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                                )
                            }
                            items(items = suspendedApps, key = { it.packageName }) { appInfo ->
                                BlockedAppRow(
                                    appInfo = appInfo,
                                    isSelected = uiState.selectionForUnsuspend.contains(appInfo.packageName),
                                    onToggleSelection = { viewModel.onEvent(AppBlockerEvent.OnToggleUnsuspendSelection(appInfo.packageName)) },
                                    onActionClick = { showActionChoiceDialog = appInfo }
                                )
                                HorizontalDivider()
                            }
                        }
                    }
                }
            }
        }
    }

    if (showAddPackageDialog) {
        AddPackageDialogBlockedScreen(
            onDismiss = { showAddPackageDialog = false },
            onConfirm = { packageName ->
                val error = viewModel.addPackageManually(packageName)
                if (error == null) {
                    viewModel.onEvent(AppBlockerEvent.OnSaveRequest)
                    showAddPackageDialog = false
                } else {
                    coroutineScope.launch { snackbarHostState.showSnackbar(error) }
                }
            }
        )
    }

    showActionChoiceDialog?.let { appInfo ->
        AppActionChoiceDialog(
            appInfo = appInfo,
            onDismiss = { showActionChoiceDialog = null },
            onChooseBlock = {
                showActionChoiceDialog = null
                viewModel.onEvent(AppBlockerEvent.OnAppSelectionChanged(appInfo.packageName, true))
                viewModel.onEvent(AppBlockerEvent.OnSaveRequest)
            },
            onChooseSuspend = {
                showActionChoiceDialog = null
                viewModel.onEvent(AppBlockerEvent.OnAppSuspensionChanged(appInfo.packageName, true))
                viewModel.onEvent(AppBlockerEvent.OnSaveRequest)
            }
        )
    }
}

@Composable
private fun AddPackageDialogBlockedScreen(
    onDismiss: () -> Unit,
    onConfirm: (String) -> Unit
) {
    var text by remember { mutableStateOf("") }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("הוסף חבילה לחסימה") },
        text = {
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("com.example.app") },
                singleLine = true
            )
        },
        confirmButton = { Button(onClick = { onConfirm(text) }) { Text("הוסף וחסימה") } },
        dismissButton = { TextButton(onClick = onDismiss) { Text("ביטול") } }
    )
}

@Composable
private fun BlockedAppRow(
    appInfo: AppInfo,
    isSelected: Boolean,
    onToggleSelection: () -> Unit,
    onActionClick: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth().clickable(onClick = onToggleSelection).padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(painter = rememberDrawablePainter(drawable = appInfo.icon), contentDescription = null, modifier = Modifier.size(48.dp))
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = appInfo.appName, style = MaterialTheme.typography.bodyLarge)
            Text(text = appInfo.packageName, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f))
            if (!appInfo.isInstalled) {
                Text(
                    text = "(שמור בזיכרון)",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                )
            }
        }
        IconButton(onClick = onActionClick) {
            Icon(Icons.Default.Block, contentDescription = "בחר פעולה")
        }
        Checkbox(checked = isSelected, onCheckedChange = { onToggleSelection() })
    }
}

@Composable
private fun AppActionChoiceDialog(
    appInfo: AppInfo,
    onDismiss: () -> Unit,
    onChooseBlock: () -> Unit,
    onChooseSuspend: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("פעולה עבור ${appInfo.appName}") },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text("בחר מה לבצע עבור האפליקציה")
                Button(
                    onClick = onChooseBlock,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("חסימה")
                }
                OutlinedButton(
                    onClick = onChooseSuspend,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("השבתה")
                }
            }
        },
        confirmButton = {},
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("ביטול")
            }
        }
    )
}
