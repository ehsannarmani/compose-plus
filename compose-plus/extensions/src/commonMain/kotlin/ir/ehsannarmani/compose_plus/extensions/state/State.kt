package ir.ehsannarmani.compose_plus.extensions.state

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun Int.rememberState() = remember {
    mutableIntStateOf(this)
}

@Composable
fun <T>T.rememberState() = remember {
    mutableStateOf(this)
}

val Int.asRememberedState @Composable
get() = this.rememberState()