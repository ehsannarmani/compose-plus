package ir.ehsannarmani.compose_plus.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import kotlinx.coroutines.delay

@Composable
fun Animated(
    delay: Long = 1,
    transition: EnterTransition = fadeIn(tween(400)),
    fillPlace: Boolean = true,
    content: @Composable () -> Unit,
) {
    val visible = rememberSaveable {
        mutableStateOf(false)
    }
    LaunchedEffect(Unit) {
        delay(delay)
        visible.value = true
    }
    Box {
        AnimatedVisibility(visible = visible.value, enter = transition) {
            content()
        }
        if (fillPlace && !visible.value) {
            Box(modifier = Modifier.alpha(0f)) {
                content()
            }
        }
    }
}