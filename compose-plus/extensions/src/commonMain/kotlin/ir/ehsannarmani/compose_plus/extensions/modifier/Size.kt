package ir.ehsannarmani.compose_plus.extensions.modifier

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier

fun Modifier.squared() = aspectRatio(1f)

fun Modifier.intrinsicMaxWidth() = width(IntrinsicSize.Max)
fun Modifier.intrinsicMinWidth() = width(IntrinsicSize.Min)

fun Modifier.intrinsicMaxHeight() = height(IntrinsicSize.Max)
fun Modifier.intrinsicMinHeight() = height(IntrinsicSize.Min)

fun Modifier.intrinsicMaxSize() = intrinsicMaxWidth().intrinsicMaxHeight()
fun Modifier.intrinsicMinSize() = intrinsicMinWidth().intrinsicMinHeight()