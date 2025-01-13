package ir.ehsannarmani.compose_plus.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CenterAlignedBox(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.()->Unit
) {
    Box(modifier=modifier,contentAlignment = Alignment.Center){
        content()
    }
}

@Composable
fun Center(content: @Composable BoxScope.() -> Unit) {
    CenterAlignedBox(modifier=Modifier.fillMaxSize(), content = content)
}