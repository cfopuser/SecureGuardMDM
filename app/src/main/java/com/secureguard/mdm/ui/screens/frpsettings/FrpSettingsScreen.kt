package com.secureguard.mdm.ui.screens.frpsettings

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Save
import androidx.compose.material3.*
import androidx.compose.ui.res.stringResource
import com.secureguard.mdm.R
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FrpSettingsScreen(
    viewModel: FrpSettingsViewModel = hiltViewModel(),
    onNavigateBack: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    val context = LocalContext.current

    LaunchedEffect(Unit) {
        viewModel.sideEffect.collectLatest { effect ->
            when (effect) {
                is FrpSettingsSideEffect.NavigateBack -> onNavigateBack()
                is FrpSettingsSideEffect.ShowToast -> {
                    Toast.makeText(context, effect.message, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = R.string.frp_settings_title)) },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = stringResource(id = R.string.dialog_button_cancel))
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { viewModel.onEvent(FrpSettingsEvent.OnSaveClicked) }) {
                Icon(Icons.Default.Save, contentDescription = stringResource(id = R.string.settings_button_save))
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Text(
                text = stringResource(id = R.string.frp_settings_description),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Input Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    value = uiState.newIdInput,
                    onValueChange = { viewModel.onEvent(FrpSettingsEvent.OnNewIdChanged(it)) },
                    label = { Text(stringResource(id = R.string.frp_settings_label_user_id)) },
                    modifier = Modifier.weight(1f),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    singleLine = true
                )
                Spacer(modifier = Modifier.width(8.dp))
                IconButton(onClick = { viewModel.onEvent(FrpSettingsEvent.OnAddIdClicked) }) {
                    Icon(Icons.Default.Add, contentDescription = "הוסף ID")
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // List of IDs
            if (uiState.isLoading) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator()
                }
            } else if (uiState.customIds.isEmpty()) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text(stringResource(id = R.string.frp_settings_empty_list), textAlign = TextAlign.Center)
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(uiState.customIds, key = { it }) { id ->
                        IdRow(id = id, onDelete = {
                            viewModel.onEvent(FrpSettingsEvent.OnDeleteIdClicked(id))
                        })
                        HorizontalDivider()
                    }
                }
            }
        }
    }
}

@Composable
private fun IdRow(id: String, onDelete: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = id, modifier = Modifier.weight(1f), style = MaterialTheme.typography.bodyLarge)
        IconButton(onClick = onDelete) {
            Icon(Icons.Default.Delete, contentDescription = stringResource(id = R.string.frp_settings_desc_delete_id))
        }
    }
}