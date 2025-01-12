package ir.ehsannarmani.compose_plus.extensions.modifier

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.DurationBasedAnimationSpec
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.graphicsLayer

fun Modifier.infiniteRotation(
    enabled:Boolean = true,
    animationSpec:DurationBasedAnimationSpec<Float> = tween(1000, easing = LinearEasing)
) = composed {
    val degree = remember { Animatable(0f) }
    LaunchedEffect(enabled){
        if(enabled){
            degree.animateTo(
                targetValue = 360f,
                animationSpec = infiniteRepeatable(
                    animation = animationSpec
                ),
            )
        }else{
            degree.snapTo(0f)
        }
    }
    return@composed graphicsLayer { rotationZ = degree.value }
}