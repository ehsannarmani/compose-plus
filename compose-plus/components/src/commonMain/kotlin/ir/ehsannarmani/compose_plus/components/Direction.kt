package ir.ehsannarmani.compose_plus.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection


@Composable
private fun Direction(direction: LayoutDirection,content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalLayoutDirection provides direction){
        content()
    }
}

@Composable
fun Ltr(content: @Composable ()->Unit) = Direction(LayoutDirection.Ltr,content)
@Composable
fun Rtl(content: @Composable ()->Unit) = Direction(LayoutDirection.Rtl,content)