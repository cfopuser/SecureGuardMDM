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
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.PauseCircle
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.res.stringResource
import com.secureguard.mdm.R
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.drawablepainter.rememberDrawablePainter
import com.secureguard.mdm.appblocker.AppBlockerEvent
import com.secureguard.mdm.appblocker.AppBlockerViewModel
import com.secureguard.mdm.appblocker.AppFilterType
import com.secureguard.mdm.appblocker.AppInfo
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppSelectionScreen(
    viewModel: AppBlockerViewModel = hiltViewModel(),
    onNavigateBack: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    var showAddPackageDialog by remember { mutableStateOf(false) }
    var showActionChoiceDialog by remember { mutableStateOf<AppInfo?>(null) }

    LaunchedEffect(Unit) {
        viewModel.loadAllData()
    }

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = R.string.app_selection_title)) },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = stringResource(id = R.string.dialog_button_cancel))
                    }
                },
                actions = {
                    IconButton(onClick = { showAddPackageDialog = true }) {
                        Icon(Icons.Default.Add, contentDescription = stringResource(id = R.string.app_selection_desc_add_manual))
                    }
                    FilterMenu(
                        currentFilter = uiState.currentFilter,
                        onFilterSelected = { viewModel.onEvent(AppBlockerEvent.OnFilterChanged(it)) }
                    )
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                viewModel.onEvent(AppBlockerEvent.OnSaveRequest)
                coroutineScope.launch { snackbarHostState.showSnackbar(context.getString(R.string.toast_changes_saved_active)) }
            }) {
                Icon(Icons.Default.Save, contentDescription = stringResource(id = R.string.settings_button_save))
            }
        }
    ) { paddingValues ->
        Column(modifier = Modifier.fillMaxSize().padding(paddingValues)) {
            OutlinedTextField(
                value = uiState.searchQuery,
                onValueChange = { viewModel.onEvent(AppBlockerEvent.OnSearchQueryChanged(it)) },
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
                label = { Text(stringResource(id = R.string.app_selection_label_search)) },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = stringResource(id = R.string.app_selection_label_search)) },
                singleLine = true
            )

            if (uiState.isLoading) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator()
                }
            } else {
                LazyColumn(modifier = Modifier.fillMaxSize()) {
                    items(items = uiState.displayedAppsForSelection, key = { it.packageName }) { appInfo ->
                        AppSelectionRow(
                            appInfo = appInfo,
                            onCheckedChange = { isChecked ->
                                // Changes are applied only on save, not immediately
                                if (isChecked) {
                                    showActionChoiceDialog = appInfo
                                } else {
                                    // For unchecking, we don't immediately apply changes
                                    // The user must save to apply the deselection
                                }
                            },
                            onActionClick = { showActionChoiceDialog = appInfo }
                        )
                        HorizontalDivider()
                    }
                }
            }
        }
    }

    if (showAddPackageDialog) {
        var manualPackageName by remember { mutableStateOf("") }
        var errorText by remember { mutableStateOf<String?>(null) }

        AddPackageDialog(
            packageName = manualPackageName,
            onPackageNameChange = { manualPackageName = it },
            error = errorText,
            onDismiss = { showAddPackageDialog = false },
            onConfirm = {
                val error = viewModel.addPackageManually(manualPackageName)
                if (error == null) {
                    showAddPackageDialog = false
                } else {
                    errorText = error
                }
            }
        )
    }

    if (uiState.showCriticalAppsWarning && uiState.criticalAppsDetected.isNotEmpty()) {
        CriticalAppsWarningDialog(
            criticalApps = uiState.criticalAppsDetected,
            onDismiss = { viewModel.onEvent(AppBlockerEvent.OnDismissCriticalAppsWarning) }
        )
    }

    showActionChoiceDialog?.let { appInfo ->
        AppSelectionActionChoiceDialog(
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
private fun FilterMenu(currentFilter: AppFilterType, onFilterSelected: (AppFilterType) -> Unit) {
    var expanded by remember { mutableStateOf(false) }
    Box {
        IconButton(onClick = { expanded = true }) { Icon(Icons.Default.FilterList, contentDescription = stringResource(id = R.string.app_selection_desc_filter)) }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            DropdownMenuItem(text = { Text(stringResource(id = R.string.app_selection_filter_user)) }, onClick = { onFilterSelected(AppFilterType.USER_ONLY); expanded = false })
            DropdownMenuItem(text = { Text(stringResource(id = R.string.app_selection_filter_launcher)) }, onClick = { onFilterSelected(AppFilterType.LAUNCHER_ONLY); expanded = false })
            DropdownMenuItem(text = { Text(stringResource(id = R.string.app_selection_filter_all_except_core)) }, onClick = { onFilterSelected(AppFilterType.ALL_EXCEPT_CORE); expanded = false })
            DropdownMenuItem(text = { Text(stringResource(id = R.string.app_selection_filter_all)) }, onClick = { onFilterSelected(AppFilterType.ALL); expanded = false })
        }
    }
}

@Composable
fun AddPackageDialog(
    packageName: String,
    onPackageNameChange: (String) -> Unit,
    error: String?,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.dialog_add_manual_package_title)) },
        text = {
            Column {
                OutlinedTextField(
                    value = packageName,
                    onValueChange = onPackageNameChange,
                    label = { Text("com.example.app") },
                    singleLine = true,
                    isError = error != null
                )
                if (error != null) {
                    Text(text = error, color = MaterialTheme.colorScheme.error, style = MaterialTheme.typography.bodySmall)
                }
            }
        },
        confirmButton = { Button(onClick = onConfirm) { Text(stringResource(id = R.string.dialog_add_manual_package_button_confirm)) } },
        dismissButton = { TextButton(onClick = onDismiss) { Text(stringResource(id = R.string.dialog_button_cancel)) } }
    )
}

@Composable
private fun AppSelectionRow(
    appInfo: AppInfo,
    onCheckedChange: (Boolean) -> Unit,
    onActionClick: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth().clickable { onActionClick() }.padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(painter = rememberDrawablePainter(drawable = appInfo.icon), contentDescription = null, modifier = Modifier.size(40.dp))
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = appInfo.appName, style = MaterialTheme.typography.bodyLarge)
            if (appInfo.isBlocked) {
                Text(text = "חסומה", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.error)
            } else if (appInfo.isSuspended) {
                Text(text = "מושבתת", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.primary)
            }
        }
        Spacer(modifier = Modifier.width(16.dp))
        // Removed the block button, keeping only the checkmark
        Checkbox(checked = appInfo.isBlocked || appInfo.isSuspended, onCheckedChange = { onCheckedChange(it) })
    }
}

@Composable
private fun AppSelectionActionChoiceDialog(
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
                    Icon(Icons.Default.Block, contentDescription = null)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("חסימה")
                }
                OutlinedButton(
                    onClick = onChooseSuspend,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(Icons.Default.PauseCircle, contentDescription = null)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("השבתה")
                }
            }
        },
        confirmButton = {},
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.dialog_button_cancel))
            }
        }
    )
}

@Composable
private fun CriticalAppsWarningDialog(
    criticalApps: List<AppInfo>,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(id = R.string.app_selection_warning_critical_title)) },
        text = {
            Column {
                Text(stringResource(id = R.string.app_selection_warning_critical_message))
                Spacer(modifier = Modifier.height(8.dp))
                Text(stringResource(id = R.string.app_selection_warning_critical_coming_soon))
                Spacer(modifier = Modifier.height(16.dp))
                Text(stringResource(id = R.string.app_selection_warning_critical_list_label), style = MaterialTheme.typography.titleSmall)
                Spacer(modifier = Modifier.height(8.dp))
                criticalApps.forEach { app ->
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(painter = rememberDrawablePainter(drawable = app.icon), contentDescription = null, modifier = Modifier.size(24.dp))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(app.appName, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        },
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(id = R.string.dashboard_button_understood))
            }
        }
    )
}
