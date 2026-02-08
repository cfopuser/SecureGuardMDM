package com.secureguard.mdm.ui.screens.provisioning

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.secureguard.mdm.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest

@Composable
fun ProvisioningScreen(
    viewModel: ProvisioningViewModel = hiltViewModel(),
    onCheckAgain: () -> Unit
) {
    val context = LocalContext.current
    val dpm = remember { context.getSystemService(android.content.Context.DEVICE_POLICY_SERVICE) as android.app.admin.DevicePolicyManager }
    val snackbarHostState = remember { SnackbarHostState() }

    LaunchedEffect(Unit) {
        viewModel.eventFlow.collectLatest { event ->
            when (event) {
                is ProvisioningEvent.ShowSnackbar -> snackbarHostState.showSnackbar(event.message)
            }
        }
    }

    // Automatically check for permissions every 2 seconds
    LaunchedEffect(Unit) {
        while (true) {
            delay(2000) // Check every 2 seconds
            if (dpm.isDeviceOwnerApp(context.packageName)) {
                onCheckAgain() // This will trigger navigation to the next screen
                break
            }
        }
    }

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        bottomBar = {
            Button(
                onClick = onCheckAgain,
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            ) {
                Text(stringResource(id = R.string.provisioning_button_check_again))
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(stringResource(id = R.string.provisioning_title), style = MaterialTheme.typography.headlineSmall, textAlign = TextAlign.Center)
            Spacer(Modifier.height(8.dp))
            Text(stringResource(id = R.string.provisioning_description), style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center)
            Spacer(Modifier.height(24.dp))

            Card(modifier = Modifier.fillMaxWidth()) {
                Column(Modifier.padding(16.dp)) {
                    Text(stringResource(id = R.string.provisioning_option_adb), style = MaterialTheme.typography.titleMedium)
                    Spacer(Modifier.height(8.dp))
                    Text(stringResource(id = R.string.provisioning_adb_instructions), style = MaterialTheme.typography.bodySmall)
                    Spacer(Modifier.height(8.dp))
                    SelectionContainer {
                        Text(stringResource(id = R.string.provisioning_adb_command), style = MaterialTheme.typography.bodyMedium.copy(fontFamily = FontFamily.Monospace), modifier = Modifier.fillMaxWidth().padding(8.dp))
                    }
                    Spacer(Modifier.height(8.dp))
                    Button(onClick = { viewModel.onCopyAdbCommand() }, modifier = Modifier.align(Alignment.End)) {
                        Text(stringResource(id = R.string.provisioning_button_copy))
                    }
                }
            }

            Spacer(Modifier.height(24.dp))

            Card(modifier = Modifier.fillMaxWidth()) {
                Column(Modifier.padding(16.dp)) {
                    Text(stringResource(id = R.string.provisioning_option_root), style = MaterialTheme.typography.titleMedium)
                    Spacer(Modifier.height(8.dp))
                    Text(stringResource(id = R.string.provisioning_root_instructions), style = MaterialTheme.typography.bodySmall)
                    Spacer(Modifier.height(8.dp))
                    Button(onClick = { viewModel.onTryRootActivation() }, modifier = Modifier.align(Alignment.End)) {
                        Text(stringResource(id = R.string.provisioning_button_try_root))
                    }
                }
            }
        }
    }
}
