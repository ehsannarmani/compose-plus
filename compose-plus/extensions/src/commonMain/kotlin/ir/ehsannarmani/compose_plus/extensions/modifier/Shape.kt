package ir.ehsannarmani.compose_plus.extensions.modifier

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

fun Modifier.circleShape():Modifier = clip(CircleShape)

fun Modifier.roundedShape(value:Dp):Modifier = clip(RoundedCornerShape(value))

fun Modifier.roundedTop(start:Dp,end:Dp) = clip(RoundedCornerShape(topStart = start, topEnd = end))
fun Modifier.roundedBottom(start:Dp,end:Dp) = clip(RoundedCornerShape(bottomStart = start, bottomEnd = end))
fun Modifier.roundedStart(top:Dp,bottom:Dp) = clip(RoundedCornerShape(topStart = top, bottomStart = bottom))
fun Modifier.roundedEnd(top:Dp,bottom:Dp) = clip(RoundedCornerShape(topEnd = top, bottomEnd = bottom))

fun Modifier.tinyRounded() = roundedShape(2.dp)
fun Modifier.smallRounded() = roundedShape(4.dp)
fun Modifier.mediumRounded() = roundedShape(8.dp)
fun Modifier.largeRounded() = roundedShape(16.dp)
fun Modifier.extraLargeRounded() = roundedShape(20.dp)
fun Modifier.hugeRounded() = roundedShape(32.dp)