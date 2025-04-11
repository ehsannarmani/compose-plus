package ir.ehsannarmani.compose_plus.functions

external object console {
    fun log(vararg message: String)
    fun info(vararg message: String)
    fun error(vararg message: String)
}