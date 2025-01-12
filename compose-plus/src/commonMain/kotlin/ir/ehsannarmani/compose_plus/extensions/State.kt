package ir.ehsannarmani.compose_plus.extensions

import androidx.compose.runtime.Composable
import ir.ehsannarmani.compose_plus.state.rememberIntState

@Composable
fun Int.rememberState() = rememberIntState(this)

@Composable
fun <T>T.rememberState() = ir.ehsannarmani.compose_plus.state.rememberState(this)

val Int.asRememberedState @Composable
get() = rememberIntState(this)