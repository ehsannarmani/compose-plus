package ir.ehsannarmani.compose_plus.functions

import androidx.compose.animation.Animatable
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color

@Composable
fun rememberAnimatable(initial: Float = 0f) =
    remember { androidx.compose.animation.core.Animatable(initial) }

@Composable
fun rememberAnimatable(initial: Color) = remember { Animatable(initial) }

@Composable
fun animateFloat(
    condition: Boolean,
    first: Float = 1f,
    second: Float = 0f,
    animationSpec: AnimationSpec<Float> = tween(400),
): State<Float> {
    return animateFloatAsState(if (condition) first else second, animationSpec = animationSpec)
}

@Composable
fun animateColor(
    condition: Boolean,
    first: Color = Color.Transparent,
    second: Color = Color.Transparent,
    animationSpec: AnimationSpec<Color> = tween(400),
): State<Color> {
    return animateColorAsState(if (condition) first else second, animationSpec = animationSpec)
}