package ir.ehsannarmani.compose_plus.extensions.modifier

import androidx.compose.ui.Modifier

fun Modifier.ifThen(condition:Boolean,other:Modifier) = if(condition) then(other) else this

fun Modifier.ifThen(condition:Boolean,block:Modifier.()->Modifier) = if(condition) block(this) else this

fun Modifier.ifThen(condition: Boolean,`if`:Modifier.()->Modifier,ifNot:Modifier.()->Modifier) =
    ifThen(condition,`if`).ifThen(!condition,ifNot)