package ir.ehsannarmani.compose_plus.state

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
inline fun <T>state(value:T) = remember {
    mutableStateOf(value)
}
@Composable
inline fun <T>state(value:T,vararg keys:Any) = remember(*keys) {
    mutableStateOf(value)
}

@Composable
inline fun <T>listState(vararg items:T) = remember {
    mutableStateListOf(*items)
}
@Composable
inline fun <reified T>listState(vararg items:T,keys:List<Any> = emptyList()) = remember(*keys.toTypedArray()) {
    mutableStateListOf(*items)
}
@Composable
inline fun <reified T>listState(items:List<T>) = listState(*items.toTypedArray())
@Composable
inline fun <reified T>listState(items:List<T>,vararg keys: Any) = listState(*items.toTypedArray(),keys)

@Composable
inline fun <K,V>mapState(vararg pairs:Pair<K,V>) = remember {
    mutableStateMapOf(*pairs)
}
@Composable
inline fun <K,V>mapState(vararg pairs:Pair<K,V>,keys: List<Any>) = remember(*keys.toTypedArray()) {
    mutableStateMapOf(*pairs)
}

@Composable
inline fun boolState(initial:Boolean = false) = state(false)
@Composable
inline fun stringState(initial:String) = state("")
@Composable
inline fun intState(initial:Int = 0) = remember { mutableIntStateOf(initial) }
@Composable
inline fun floatState(initial:Float = 0f) = remember { mutableFloatStateOf(initial) }
@Composable
inline fun doubleState(initial: Double = 0.0) = remember { mutableDoubleStateOf(initial) }
@Composable
inline fun longState(initial: Long = 0) = remember { mutableLongStateOf(initial) }
