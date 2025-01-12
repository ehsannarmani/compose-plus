package ir.ehsannarmani.compose_plus.functions

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Composable
fun <T>rememberFilter(collection: Collection<T>,predicate: (T) -> Boolean) = remember(collection) {
    collection.filter(predicate)
}
@Composable
fun <T,R>rememberMap(collection: Collection<T>,predicate: (T) -> R) = remember(collection) {
    collection.map(predicate)
}
