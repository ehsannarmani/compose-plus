package ir.ehsannarmani.compose_plus.functions

import androidx.compose.animation.Animatable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color

@Composable
fun rememberAnimatable(initial:Float = 0f) = remember { androidx.compose.animation.core.Animatable(initial) }
@Composable
fun rememberAnimatable(initial: Color) = remember { Animatable(initial) }