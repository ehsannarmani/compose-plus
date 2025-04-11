package ir.ehsannarmani.compose_plus.extensions

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.ContentTransform
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.animateIntOffsetAsState
import androidx.compose.animation.core.animateIntSizeAsState
import androidx.compose.animation.core.animateOffsetAsState
import androidx.compose.animation.core.animateRectAsState
import androidx.compose.animation.core.animateSizeAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.togetherWith
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize


@Composable
fun Color.animate(spec: AnimationSpec<Color> = tween(400)) = animateColorAsState(targetValue = this, animationSpec = spec)

@Composable
fun Dp.animate(spec: AnimationSpec<Dp> = tween(400)) = animateDpAsState(targetValue = this, animationSpec = spec)

@Composable
fun Int.animate(spec: AnimationSpec<Int> = tween(400)) = animateIntAsState(targetValue = this, animationSpec = spec)

@Composable
fun Float.animate(spec: AnimationSpec<Float> = tween(400)) = animateFloatAsState(targetValue = this, animationSpec = spec)

@Composable
fun IntOffset.animate(spec: AnimationSpec<IntOffset> = tween(400)) = animateIntOffsetAsState(targetValue = this, animationSpec = spec)

@Composable
fun Offset.animate(spec: AnimationSpec<Offset> = tween(400)) = animateOffsetAsState(targetValue = this, animationSpec = spec)

@Composable
fun Size.animate(spec: AnimationSpec<Size> = tween(400)) = animateSizeAsState(targetValue = this, animationSpec = spec)

@Composable
fun IntSize.animate(spec: AnimationSpec<IntSize> = tween(400)) = animateIntSizeAsState(targetValue = this, animationSpec = spec)

@Composable
fun Rect.animate(spec: AnimationSpec<Rect> = tween(400)) = animateRectAsState(targetValue = this, animationSpec = spec)

@Composable
fun <T>T.animateContent(
    modifier:Modifier = Modifier,
    label:String = "AnimatedContent",
    transitionSpec: AnimatedContentTransitionScope<T>.() -> ContentTransform = {
        (fadeIn(animationSpec = tween(220, delayMillis = 90)) +
                scaleIn(initialScale = 0.92f, animationSpec = tween(220, delayMillis = 90)))
            .togetherWith(fadeOut(animationSpec = tween(90)))
    },
    contentKey: (targetState: T) -> Any? = { it },
    content: @Composable AnimatedContentScope.(T)->Unit
){
    AnimatedContent(
        modifier=modifier,
        label = label,
        targetState = this,
        contentKey = contentKey,
        transitionSpec = transitionSpec
    ){ state->
        content(state)
    }
}