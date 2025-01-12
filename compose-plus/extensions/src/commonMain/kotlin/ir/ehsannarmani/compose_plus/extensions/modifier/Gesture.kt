package ir.ehsannarmani.compose_plus.extensions.modifier

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed

fun Modifier.silentClickable(onClick:()->Unit) = composed {
    return@composed clickable(
        onClick = onClick,
        indication = null,
        interactionSource = remember {
            MutableInteractionSource()
        }
    )
}