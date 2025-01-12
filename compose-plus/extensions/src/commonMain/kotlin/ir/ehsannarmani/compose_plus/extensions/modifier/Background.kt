package ir.ehsannarmani.compose_plus.extensions.modifier

import androidx.compose.animation.Animatable
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color

fun Modifier.infiniteColorChange(
    enabled:Boolean = true,
    animationSpec:AnimationSpec<Color> = tween(1000, easing = LinearEasing),
    colors:Pair<Color,Color>
) = infiniteColorChange(
    enabled = enabled,
    animationSpec = animationSpec,
    colors = colors.toList()
)

fun Modifier.infiniteColorChange(
    enabled:Boolean = true,
    animationSpec:AnimationSpec<Color> = tween(1000,easing = LinearEasing),
    start:Int = 0,
    colors:List<Color>
) = composed {
    val color = remember(colors,start) { Animatable(colors[start]) }
    LaunchedEffect(enabled,color.isRunning){
        if(enabled){
            if(!color.isRunning){
                val colorIndex = colors.indexOf(color.value)
                var newIndex = colorIndex+1
                if(newIndex > colors.lastIndex) newIndex = 0
                color.animateTo(targetValue = colors[newIndex], animationSpec = animationSpec)
            }
        }else{
            color.animateTo(targetValue = colors[start],animationSpec,)
        }
    }
    return@composed background(color.value)
}