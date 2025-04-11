package ir.ehsannarmani.compose_plus.extensions.modifier

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ir.ehsannarmani.compose_plus.utils.ContentPaddingValues
import ir.ehsannarmani.compose_plus.utils.LocalContentPaddingValues

@Composable
fun Modifier.endContentPadding(contentPaddingValues: ContentPaddingValues = LocalContentPaddingValues.current) =
    padding(end = contentPaddingValues.end)

@Composable
fun Modifier.startContentPadding(contentPaddingValues: ContentPaddingValues = LocalContentPaddingValues.current) =
    padding(start = contentPaddingValues.start)

@Composable
fun Modifier.topContentPadding(contentPaddingValues: ContentPaddingValues = LocalContentPaddingValues.current) =
    padding(top = contentPaddingValues.top)

@Composable
fun Modifier.bottomContentPadding(contentPaddingValues: ContentPaddingValues = LocalContentPaddingValues.current) =
    padding(bottom = contentPaddingValues.bottom)

@Composable
fun Modifier.horizontalContentPadding(contentPaddingValues: ContentPaddingValues = LocalContentPaddingValues.current) =
    padding(start = contentPaddingValues.start, end = contentPaddingValues.end)

@Composable
fun Modifier.verticalContentPadding(contentPaddingValues: ContentPaddingValues = LocalContentPaddingValues.current) =
    padding(top = contentPaddingValues.top, bottom = contentPaddingValues.bottom)

@Composable
fun Modifier.contentPadding(contentPaddingValues: ContentPaddingValues = LocalContentPaddingValues.current) =
    padding(
        top = contentPaddingValues.top,
        bottom = contentPaddingValues.bottom,
        start = contentPaddingValues.start,
        end = contentPaddingValues.end
    )