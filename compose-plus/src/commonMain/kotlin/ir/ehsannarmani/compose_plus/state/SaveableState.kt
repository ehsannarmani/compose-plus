package ir.ehsannarmani.compose_plus.state

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.autoSaver
import androidx.compose.runtime.saveable.rememberSaveable

@Composable
inline fun <T>rememberSaveableState(value:T,saver: Saver<T, out Any> = autoSaver()) = rememberSaveable(stateSaver = saver) {
    mutableStateOf(value)
}
@Composable
inline fun <T>rememberSaveableState(value:T,saver: Saver<T, out Any> = autoSaver(),vararg keys:Any) = rememberSaveable(*keys, stateSaver = saver) {
    mutableStateOf(value)
}

@Composable
inline fun <T>rememberSaveableListState(vararg items:T,saver: Saver<List<T>, out Any> = autoSaver()) = rememberSaveable(saver = saver) {
    mutableStateListOf(*items)
}
@Composable
inline fun <reified T>rememberSaveableListState(vararg items:T,keys:List<Any> = emptyList(),saver: Saver<List<T>, out Any> = autoSaver()) = rememberSaveable(*keys.toTypedArray(),saver = saver) {
    mutableStateListOf(*items)
}

@Composable
inline fun <reified T>rememberSaveableListState(items:List<T>,saver: Saver<List<T>, out Any> = autoSaver()) = rememberListState(*items.toTypedArray(),saver)
@Composable
inline fun <reified T>rememberSaveableListState(items:List<T>,saver: Saver<List<T>, out Any> = autoSaver(),vararg keys: Any) = rememberListState(*items.toTypedArray(),saver,keys)

@Composable
inline fun <K,V>rememberSaveableMapState(vararg pairs:Pair<K,V>,saver: Saver<Map<K,V>, out Any> = autoSaver()) = rememberSaveable(saver = saver) {
    mutableStateMapOf(*pairs)
}
@Composable
inline fun <K,V>rememberSaveableMapState(vararg pairs:Pair<K,V>,keys: List<Any>,saver: Saver<Map<K,V>, out Any> = autoSaver()) = rememberSaveable(*keys.toTypedArray(),saver) {
    mutableStateMapOf(*pairs)
}

@Composable
inline fun rememberSaveableBoolState(initial:Boolean = false,saver: Saver<Boolean, out Any> = autoSaver()) = rememberSaveableState(false,saver)
@Composable
inline fun rememberSaveableStringState(initial:String = "",saver: Saver<String, out Any> = autoSaver()) = rememberSaveableState("",saver)
@Composable
inline fun rememberSaveableIntState(initial:Int = 0,saver: Saver<Int, out Any> = autoSaver()) = rememberSaveable(stateSaver = saver) { mutableIntStateOf(initial) }
@Composable
inline fun rememberSaveableFloatState(initial:Float = 0f,saver: Saver<Float, out Any> = autoSaver()) = rememberSaveable(stateSaver = saver) { mutableFloatStateOf(initial) }
@Composable
inline fun rememberSaveableDoubleState(initial: Double = 0.0,saver: Saver<Double, out Any> = autoSaver()) = rememberSaveable(stateSaver = saver) { mutableDoubleStateOf(initial) }
@Composable
inline fun rememberSaveableLongState(initial: Long = 0,saver: Saver<Long, out Any> = autoSaver()) = rememberSaveable(stateSaver = saver) { mutableLongStateOf(initial) }

