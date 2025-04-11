package ir.ehsannarmani.compose_plus.functions.log

expect object Logger {
    fun debug(tag: String, message: String)
    fun error(tag: String, message: String)
    fun info(tag: String, message: String)
}