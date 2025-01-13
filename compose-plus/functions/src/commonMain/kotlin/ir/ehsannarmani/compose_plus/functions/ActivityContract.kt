package ir.ehsannarmani.compose_plus.functions

import androidx.compose.runtime.Composable

@Composable
expect fun LaunchPermissionRequest(permission:String,onResult:(Boolean)->Unit)

@Composable
expect fun LaunchPermissionRequest(permissions:List<String>,onResult:(Map<String,Boolean>)->Unit)

