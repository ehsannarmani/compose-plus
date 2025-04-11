package ir.ehsannarmani.compose_plus.extensions

import androidx.compose.foundation.ScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshotFlow

@Composable
fun ScrollState.onScrollProgress(action: (Float) -> Unit) {
    LaunchedEffect(this) {
        snapshotFlow { value }
            .collect { scrollPosition ->
                val progress = if (maxValue > 0 && scrollPosition > 0) {
                    scrollPosition / maxValue.toFloat()
                } else {
                    0f
                }
                action(progress)
            }
    }
}