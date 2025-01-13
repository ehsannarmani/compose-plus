package ir.ehsannarmani.compose_plus.extensions

import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshotFlow
import kotlinx.coroutines.flow.distinctUntilChanged

@Composable
fun ScrollableState.onScrollFinished(block:()->Unit){
    LaunchedEffect(this){
        snapshotFlow { canScrollForward }
            .distinctUntilChanged()
            .collect{
                if(!it) block()
            }
    }
}