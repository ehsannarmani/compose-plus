package ir.ehsannarmani.compose_plus.extensions

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp


@Composable
fun Dp.horizontalSpace(){
    Spacer(Modifier.width(this))
}
@Composable
fun Dp.verticalSpace(){
    Spacer(Modifier.height(this))
}

context(RowScope)
@Composable
fun Dp.space() = horizontalSpace()

context(ColumnScope)
@Composable
fun Dp.space() = verticalSpace()
