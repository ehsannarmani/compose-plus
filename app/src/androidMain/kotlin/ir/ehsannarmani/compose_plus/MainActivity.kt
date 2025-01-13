package ir.ehsannarmani.compose_plus

import android.Manifest
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ir.ehsannarmani.compose_plus.functions.LaunchPermissionRequest

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LaunchPermissionRequest(permission = Manifest.permission.POST_NOTIFICATIONS) {

            }
            App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}