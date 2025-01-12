package ir.ehsannarmani.compose_plus.functions.state

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
fun <T>rememberState(value:T) = remember {
    mutableStateOf(value)
}
@Composable
fun <T>rememberState(value:T,vararg keys:Any) = remember(*keys) {
    mutableStateOf(value)
}

@Composable
fun <T>rememberListState(vararg items:T) = remember {
    mutableStateListOf(*items)
}
@Composable
fun <T>rememberListState(vararg items:T,keys:List<Any> = emptyList()) = remember(*keys.toTypedArray()) {
    mutableStateListOf(*items)
}
@Composable
inline fun <reified T>rememberListState(items:List<T>) = rememberListState(*items.toTypedArray())
@Composable
inline fun <reified T>rememberListState(items:List<T>,vararg keys: Any) = rememberListState(*items.toTypedArray(),keys)

@Composable
fun <K,V>rememberMapState(vararg pairs:Pair<K,V>) = remember {
    mutableStateMapOf(*pairs)
}
@Composable
fun <K,V>rememberMapState(vararg pairs:Pair<K,V>,keys: List<Any>) = remember(*keys.toTypedArray()) {
    mutableStateMapOf(*pairs)
}

@Composable
fun rememberBoolState(initial:Boolean = false) = rememberState(false)
@Composable
fun rememberStringState(initial:String = "") = rememberState("")
@Composable
fun rememberIntState(initial:Int = 0) = remember { mutableIntStateOf(initial) }
@Composable
fun rememberFloatState(initial:Float = 0f) = remember { mutableFloatStateOf(initial) }
@Composable
fun rememberDoubleState(initial: Double = 0.0) = remember { mutableDoubleStateOf(initial) }
@Composable
fun rememberLongState(initial: Long = 0) = remember { mutableLongStateOf(initial) }
