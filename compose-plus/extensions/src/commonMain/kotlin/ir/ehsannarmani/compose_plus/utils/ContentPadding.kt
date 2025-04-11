package ir.ehsannarmani.compose_plus.utils

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class ContentPaddingValues(
    val start: Dp = 0.dp,
    val top: Dp = 0.dp,
    val end: Dp = 0.dp,
    val bottom: Dp = 0.dp
) {
    constructor(all: Dp) : this(
        start = all,
        top = all,
        end = all,
        bottom = all
    )

    constructor(horizontal: Dp = 0.dp, vertical: Dp = 0.dp) : this(
        start = horizontal,
        top = vertical,
        end = horizontal,
        bottom = vertical
    )
}

val LocalContentPaddingValues = compositionLocalOf { ContentPaddingValues() }