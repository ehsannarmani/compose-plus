package ir.ehsannarmani.compose_plus.functions

import androidx.compose.runtime.Composable

@Composable
actual fun LaunchPermissionRequest(
    permission: String,
    onResult: (Boolean) -> Unit
) {
}

@Composable
actual fun LaunchPermissionRequest(
    permissions: List<String>,
    onResult: (Map<String, Boolean>) -> Unit
) {
}