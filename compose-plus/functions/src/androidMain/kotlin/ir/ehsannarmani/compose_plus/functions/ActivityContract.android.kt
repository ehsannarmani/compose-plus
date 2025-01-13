package ir.ehsannarmani.compose_plus.functions

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect

@Composable
actual fun LaunchPermissionRequest(permission:String,onResult:(Boolean)->Unit) {
    val launcher = rememberLauncherForActivityResult(contract = ActivityResultContracts.RequestPermission(),onResult = onResult)
    LaunchedEffect(Unit) {
        launcher.launch(permission)
    }
}

@Composable
actual fun LaunchPermissionRequest(
    permissions: List<String>,
    onResult: (Map<String, Boolean>) -> Unit
) {
    val launcher = rememberLauncherForActivityResult(contract = ActivityResultContracts.RequestMultiplePermissions(),onResult = onResult)
    LaunchedEffect(Unit) {
        launcher.launch(permissions.toTypedArray())
    }
}