package ir.ehsannarmani.compose_plus.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.Dp

@Composable
fun CenterVerticallyRow(
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    content: @Composable RowScope.() -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = horizontalArrangement,
        content = content
    )
}

@Composable
fun TopAlignedRow(
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    content: @Composable RowScope.() -> Unit
) {
    Row(
        verticalAlignment = Alignment.Top,
        horizontalArrangement = horizontalArrangement,
        content = content
    )
}

@Composable
fun BottomAlignedRow(
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    content: @Composable RowScope.() -> Unit
) {
    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = horizontalArrangement,
        content = content
    )
}

@Composable
fun CenterVerticallyWithSpaceRow(
    space: Dp,
    content: @Composable RowScope.() -> Unit
) {
    CenterVerticallyRow(
        horizontalArrangement = Arrangement.spacedBy(space),
        content = content
    )
}

@Composable
fun TopAlignedWithSpaceRow(
    space: Dp,
    content: @Composable RowScope.() -> Unit
) {
    TopAlignedRow(
        horizontalArrangement = Arrangement.spacedBy(space),
        content = content
    )
}

@Composable
fun BottomAlignedWithSpaceRow(
    space: Dp,
    content: @Composable RowScope.() -> Unit
) {
    BottomAlignedRow(
        horizontalArrangement = Arrangement.spacedBy(space),
        content = content
    )
}

@Composable
fun CenterVerticallySpaceBetweenRow(content: @Composable RowScope.() -> Unit) {
    CenterVerticallyRow(
        horizontalArrangement = Arrangement.SpaceBetween,
        content = content
    )
}

@Composable
fun TopAlignedSpaceBetweenRow(content: @Composable RowScope.() -> Unit) {
    TopAlignedRow(
        horizontalArrangement = Arrangement.SpaceBetween,
        content = content
    )
}

@Composable
fun BottomAlignedSpaceBetweenRow(content: @Composable RowScope.() -> Unit) {
    BottomAlignedRow(
        horizontalArrangement = Arrangement.SpaceBetween,
        content = content
    )
}

@Composable
fun CenterVerticallySpaceAroundRow(content: @Composable RowScope.() -> Unit) {
    CenterVerticallyRow(
        horizontalArrangement = Arrangement.SpaceAround,
        content = content
    )
}

@Composable
fun TopAlignedSpaceAroundRow(content: @Composable RowScope.() -> Unit) {
    TopAlignedRow(
        horizontalArrangement = Arrangement.SpaceAround,
        content = content
    )
}

@Composable
fun BottomAlignedSpaceAroundRow(content: @Composable RowScope.() -> Unit) {
    BottomAlignedRow(
        horizontalArrangement = Arrangement.SpaceAround,
        content = content
    )
}

@Composable
fun CenterVerticallySpaceEvenlyRow(content: @Composable RowScope.() -> Unit) {
    CenterVerticallyRow(
        horizontalArrangement = Arrangement.SpaceEvenly,
        content = content
    )
}

@Composable
fun TopAlignedSpaceEvenlyRow(content: @Composable RowScope.() -> Unit) {
    TopAlignedRow(
        horizontalArrangement = Arrangement.SpaceEvenly,
        content = content
    )
}

@Composable
fun BottomAlignedSpaceEvenlyRow(content: @Composable RowScope.() -> Unit) {
    BottomAlignedRow(
        horizontalArrangement = Arrangement.SpaceEvenly,
        content = content
    )
}