package ir.ehsannarmani.compose_plus.components

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalSpacer(value:Dp) {
    Spacer(Modifier.width(value))
}

@Composable
fun VerticalSpacer(value:Dp) {
    Spacer(Modifier.height(value))
}

context(ColumnScope)
@Composable
fun Spacer(value: Dp) = VerticalSpacer(value)

context(RowScope)
@Composable
fun Spacer(value: Dp) = HorizontalSpacer(value)

context(ColumnScope)
@Composable
fun TinySpacer() = Spacer(2.dp)

context(ColumnScope)
@Composable
fun SmallSpacer() = Spacer(4.dp)

context(ColumnScope)
@Composable
fun MediumSpacer() = Spacer(8.dp)

context(ColumnScope)
@Composable
fun LargeSpacer() = Spacer(16.dp)

context(ColumnScope)
@Composable
fun HugeSpacer() = Spacer(32.dp)

context(RowScope)
@Composable
fun TinySpacer() = Spacer(2.dp)

context(RowScope)
@Composable
fun SmallSpacer() = Spacer(4.dp)

context(RowScope)
@Composable
fun MediumSpacer() = Spacer(8.dp)

context(RowScope)
@Composable
fun LargeSpacer() = Spacer(16.dp)

context(RowScope)
@Composable
fun HugeSpacer() = Spacer(32.dp)
