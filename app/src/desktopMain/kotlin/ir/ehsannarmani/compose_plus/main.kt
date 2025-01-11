package ir.ehsannarmani.compose_plus

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "ComposePlus",
    ) {
        App()
    }
}