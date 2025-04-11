package ir.ehsannarmani.compose_plus.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.Dp

@Composable
fun CenterHorizontallyColumn(
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = verticalArrangement,
        content = content
    )
}

@Composable
fun StartAlignedColumn(
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = verticalArrangement,
        content = content
    )
}

@Composable
fun EndAlignedColumn(
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        horizontalAlignment = Alignment.End,
        verticalArrangement = verticalArrangement,
        content = content
    )
}

@Composable
fun CenterHorizontallyWithSpaceColumn(
    space: Dp,
    content: @Composable ColumnScope.() -> Unit
) {
    CenterHorizontallyColumn(
        verticalArrangement = Arrangement.spacedBy(space),
        content = content
    )
}

@Composable
fun StartAlignedWithSpaceColumn(
    space: Dp,
    content: @Composable ColumnScope.() -> Unit
) {
    StartAlignedColumn(
        verticalArrangement = Arrangement.spacedBy(space),
        content = content
    )
}

@Composable
fun EndAlignedWithSpaceColumn(
    space: Dp,
    content: @Composable ColumnScope.() -> Unit
) {
    EndAlignedColumn(
        verticalArrangement = Arrangement.spacedBy(space),
        content = content
    )
}

@Composable
fun CenterHorizontallySpaceBetweenColumn(content: @Composable ColumnScope.() -> Unit) {
    CenterHorizontallyColumn(
        verticalArrangement = Arrangement.SpaceBetween,
        content = content
    )
}

@Composable
fun StartAlignedSpaceBetweenColumn(content: @Composable ColumnScope.() -> Unit) {
    StartAlignedColumn(
        verticalArrangement = Arrangement.SpaceBetween,
        content = content
    )
}

@Composable
fun EndAlignedSpaceBetweenColumn(content: @Composable ColumnScope.() -> Unit) {
    EndAlignedColumn(
        verticalArrangement = Arrangement.SpaceBetween,
        content = content
    )
}

@Composable
fun CenterHorizontallySpaceAroundColumn(content: @Composable ColumnScope.() -> Unit) {
    CenterHorizontallyColumn(
        verticalArrangement = Arrangement.SpaceAround,
        content = content
    )
}

@Composable
fun StartAlignedSpaceAroundColumn(content: @Composable ColumnScope.() -> Unit) {
    StartAlignedColumn(
        verticalArrangement = Arrangement.SpaceAround,
        content = content
    )
}

@Composable
fun EndAlignedSpaceAroundColumn(content: @Composable ColumnScope.() -> Unit) {
    EndAlignedColumn(
        verticalArrangement = Arrangement.SpaceAround,
        content = content
    )
}

@Composable
fun CenterHorizontallySpaceEvenlyColumn(content: @Composable ColumnScope.() -> Unit) {
    CenterHorizontallyColumn(
        verticalArrangement = Arrangement.SpaceEvenly,
        content = content
    )
}

@Composable
fun StartAlignedSpaceEvenlyColumn(content: @Composable ColumnScope.() -> Unit) {
    StartAlignedColumn(
        verticalArrangement = Arrangement.SpaceEvenly,
        content = content
    )
}

@Composable
fun EndAlignedSpaceEvenlyColumn(content: @Composable ColumnScope.() -> Unit) {
    EndAlignedColumn(
        verticalArrangement = Arrangement.SpaceEvenly,
        content = content
    )
}