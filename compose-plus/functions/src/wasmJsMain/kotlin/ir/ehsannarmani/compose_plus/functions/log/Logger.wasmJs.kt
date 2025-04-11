package ir.ehsannarmani.compose_plus.functions.log

import ir.ehsannarmani.compose_plus.functions.console

actual object Logger {
    actual fun debug(tag: String, message: String) {
        console.log("DEBUG:", "[$tag]", message)
    }

    actual fun error(tag: String, message: String) {
        console.error("ERROR:", "[$tag]", message)
    }

    actual fun info(tag: String, message: String) {
        console.info("INFO:", "[$tag]", message)
    }
}