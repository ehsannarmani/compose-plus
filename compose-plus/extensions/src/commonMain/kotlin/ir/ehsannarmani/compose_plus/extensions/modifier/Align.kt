package ir.ehsannarmani.compose_plus.extensions.modifier

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


context(BoxScope)
fun Modifier.centerAligned() = align(Alignment.Center)

context(BoxScope)
fun Modifier.topStartAligned() = align(Alignment.TopStart)
context(BoxScope)
fun Modifier.topCenterAligned() = align(Alignment.TopCenter)
context(BoxScope)
fun Modifier.topEndAligned() = align(Alignment.TopEnd)

context(BoxScope)
fun Modifier.bottomStartAligned() = align(Alignment.BottomStart)
context(BoxScope)
fun Modifier.bottomCenterAligned() = align(Alignment.BottomCenter)
context(BoxScope)
fun Modifier.bottomEndAligned() = align(Alignment.BottomEnd)

context(ColumnScope)
fun Modifier.centerAligned() = align(Alignment.CenterHorizontally)
context(ColumnScope)
fun Modifier.endAligned() = align(Alignment.End)
context(ColumnScope)
fun Modifier.startAligned() = align(Alignment.Start)

context(RowScope)
fun Modifier.centerAligned() = align(Alignment.CenterVertically)
context(RowScope)
fun Modifier.topAligned() = align(Alignment.Top)
context(RowScope)
fun Modifier.bottomAligned() = align(Alignment.Bottom)
