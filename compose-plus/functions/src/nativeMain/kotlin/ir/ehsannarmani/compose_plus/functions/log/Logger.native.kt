package ir.ehsannarmani.compose_plus.functions.log

import platform.Foundation.NSLog

actual object Logger {
    actual fun debug(tag: String, message: String) {
        NSLog("DEBUG: [$tag] $message")
    }

    actual fun error(tag: String, message: String) {
        NSLog("ERROR: [$tag] $message")
    }

    actual fun info(tag: String, message: String) {
        NSLog("INFO: [$tag] $message")
    }
}