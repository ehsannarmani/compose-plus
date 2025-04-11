package ir.ehsannarmani.compose_plus.functions.log

import android.util.Log

actual object Logger {
    actual fun debug(tag: String, message: String) {
        Log.d(tag, message)
    }

    actual fun error(tag: String, message: String) {
        Log.e(tag, message)
    }

    actual fun info(tag: String, message: String) {
        Log.i(tag, message)
    }
}