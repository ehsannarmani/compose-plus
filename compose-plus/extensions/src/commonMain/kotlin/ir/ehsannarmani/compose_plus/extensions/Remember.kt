package ir.ehsannarmani.compose_plus.extensions

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Composable
fun <T> Collection<T>.rememberedFilter(predicate: (T) -> Boolean) = remember(this){
    filter (predicate)
}

@Composable
fun <T,R> Collection<T>.rememberedMap(predicate: (T) -> R) = remember(this){
    map (predicate)
}
