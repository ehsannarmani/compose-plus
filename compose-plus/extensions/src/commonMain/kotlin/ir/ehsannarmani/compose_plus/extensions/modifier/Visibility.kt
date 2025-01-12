package ir.ehsannarmani.compose_plus.extensions.modifier

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.graphicsLayer
import ir.ehsannarmani.compose_plus.utils.CutDirection
import ir.ehsannarmani.compose_plus.utils.CutShape
import kotlinx.coroutines.delay

fun Modifier.visibleIf(
    condition:Boolean,
    animationSpec:AnimationSpec<Float> = tween(400)
) = composed{
    val alpha by animateFloatAsState(if(condition) 1f else 0f, animationSpec = animationSpec)

    return@composed graphicsLayer {
        this.alpha = alpha
    }
}

fun Modifier.scaleVisibleIf(
    condition: Boolean,
    animationSpec:AnimationSpec<Float> = tween(400)
) = composed {
    val scale by animateFloatAsState(if(condition) 1f else 0f, animationSpec = animationSpec)
    return@composed graphicsLayer {
        this.scaleY = scale
        this.scaleX = scale
    }
}

fun Modifier.cutVisibleIf(
    condition: Boolean,
    direction: CutDirection = CutDirection.Horizontal,
    reverseCut:Boolean = false,
    animationSpec:AnimationSpec<Float> = tween(400)
) = composed {
    val progress by animateFloatAsState(if(condition) 1f else 0f, animationSpec = animationSpec)
    val clipModifier= clip(CutShape(visibleProgress = progress,direction = direction))
    return@composed if(reverseCut){
        when(direction){
            CutDirection.Horizontal -> graphicsLayer {
                rotationZ = 180f
            }.then(clipModifier).graphicsLayer {
                rotationZ = 180f
            }
            CutDirection.Vertical -> rotate(180f).then(clipModifier).rotate(180f)
        }
    }else{
        clipModifier
    }
}

fun Modifier.fadeIn(
    delay:Long = 100,
    animationSpec:AnimationSpec<Float> = tween(400)
) = composed {
    var visible by remember { mutableStateOf(false) }
    LaunchedEffect(Unit){
        delay(delay)
        visible = true
    }
    return@composed visibleIf(visible, animationSpec = animationSpec)
}
fun Modifier.scaleIn(
    delay:Long = 100,
    animationSpec:AnimationSpec<Float> = tween(400)
) = composed {
    var visible by remember { mutableStateOf(false) }
    LaunchedEffect(Unit){
        delay(delay)
        visible = true
    }
    return@composed scaleVisibleIf(visible, animationSpec = animationSpec)
}