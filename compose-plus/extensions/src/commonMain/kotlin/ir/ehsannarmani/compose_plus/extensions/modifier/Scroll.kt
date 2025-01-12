package ir.ehsannarmani.compose_plus.extensions.modifier

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed

fun Modifier.verticalScroll() = composed {
    return@composed verticalScroll(rememberScrollState())
}
fun Modifier.horizontalScroll() = composed {
    return@composed horizontalScroll(rememberScrollState())
}