package ir.ehsannarmani.compose_plus.functions.log

import java.util.logging.Level
import java.util.logging.Logger as NativeLogger
import java.util.logging.ConsoleHandler

actual object Logger {
    private val logger: NativeLogger = NativeLogger.getLogger(Logger::class.simpleName).apply {
        level = Level.ALL

        handlers.forEach { removeHandler(it) }
        val handler = ConsoleHandler().apply {
            level = Level.ALL
        }
        addHandler(handler)
    }

    actual fun debug(tag: String, message: String) {
        logger.fine("DEBUG: [$tag] $message")
    }

    actual fun error(tag: String, message: String) {
        logger.severe("ERROR: [$tag] $message")
    }

    actual fun info(tag: String, message: String) {
        logger.info("INFO: [$tag] $message")
    }
}