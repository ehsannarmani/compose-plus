package ir.ehsannarmani.compose_plus.extensions

import androidx.compose.animation.Animatable
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.animateIntOffsetAsState
import androidx.compose.animation.core.animateIntSizeAsState
import androidx.compose.animation.core.animateOffsetAsState
import androidx.compose.animation.core.animateSizeAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.geometry.Offset
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
fun rememberAnimatable(initial:Float = 0f) = remember { androidx.compose.animation.core.Animatable(initial) }
@Composable
fun rememberAnimatable(initial:Color) = remember { Animatable(initial) }