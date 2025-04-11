package ir.ehsannarmani.compose_plus

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ir.ehsannarmani.compose_plus.extensions.modifier.centerAligned
import ir.ehsannarmani.compose_plus.extensions.modifier.contentPadding
import ir.ehsannarmani.compose_plus.extensions.modifier.cutVisibleIf
import ir.ehsannarmani.compose_plus.extensions.modifier.fadeIn
import ir.ehsannarmani.compose_plus.extensions.modifier.ifThen
import ir.ehsannarmani.compose_plus.extensions.modifier.infiniteColorChange
import ir.ehsannarmani.compose_plus.extensions.modifier.infiniteRotation
import ir.ehsannarmani.compose_plus.extensions.modifier.largeRounded
import ir.ehsannarmani.compose_plus.extensions.modifier.scaleIn
import ir.ehsannarmani.compose_plus.extensions.modifier.scaleVisibleIf
import ir.ehsannarmani.compose_plus.extensions.modifier.silentClickable
import ir.ehsannarmani.compose_plus.extensions.modifier.smallRounded
import ir.ehsannarmani.compose_plus.extensions.modifier.visibleIf
import ir.ehsannarmani.compose_plus.functions.state.rememberBoolState
import ir.ehsannarmani.compose_plus.utils.ContentPaddingValues
import ir.ehsannarmani.compose_plus.utils.CutDirection
import ir.ehsannarmani.compose_plus.utils.LocalContentPaddingValues
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    CompositionLocalProvider(LocalContentPaddingValues provides ContentPaddingValues(24.dp)){
        LazyVerticalGrid(
            modifier = Modifier.fillMaxWidth().contentPadding(),
            columns = GridCells.Fixed(2),
        ) {
            item {
                var enabled by rememberBoolState()
                LazyItem {
                    Box(
                        Modifier
                            .size(100.dp)
                            .fadeIn(delay = 500)
                            .centerAligned()
                            .infiniteRotation(enabled = enabled)
                            .ifThen(enabled) {
                                smallRounded()
                            }
                            .ifThen(!enabled) {
                                largeRounded()
                            }
                            .infiniteColorChange(
                                enabled = enabled,
                                colors = listOf(Color.Red, Color.Blue, Color.Green)
                            )
                            .silentClickable { enabled = !enabled }
                    )
                }
            }
            item {
                LazyItem {
                    var visible by rememberBoolState(true)
                    Column(
                        modifier = Modifier.fillMaxSize().fadeIn(delay = 700),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Hello compose plus!",
                            modifier = Modifier.visibleIf(visible)
                        )
                        Spacer(Modifier.height(16.dp))
                        Button(onClick = { visible = !visible }) {
                            Text("Visible / Hide")
                        }
                    }
                }
            }
            item {
                LazyItem {
                    var visible by rememberBoolState(true)
                    Column(
                        modifier = Modifier.fillMaxSize().scaleIn(delay = 900).fadeIn(delay = 1000),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Hello compose plus!",
                            modifier = Modifier.scaleVisibleIf(visible)
                        )
                        Spacer(Modifier.height(16.dp))
                        Button(onClick = { visible = !visible }) {
                            Text("Visible / Hide")
                        }
                    }
                }
            }
            item {
                LazyItem {
                    var visible by rememberBoolState(true)
                    Column(
                        modifier = Modifier.fillMaxSize().scaleIn(delay = 1100),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Hello compose plus!",
                            modifier = Modifier.cutVisibleIf(visible)
                        )
                        Spacer(Modifier.height(16.dp))
                        Button(onClick = { visible = !visible }) {
                            Text("Visible / Hide")
                        }
                    }
                }
            }
            item {
                LazyItem {
                    var visible by rememberBoolState(true)
                    Column(
                        modifier = Modifier.fillMaxSize().fadeIn(delay = 1300),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Hello compose plus!",
                            modifier = Modifier.cutVisibleIf(visible, direction = CutDirection.Vertical)
                        )
                        Spacer(Modifier.height(16.dp))
                        Button(onClick = { visible = !visible }) {
                            Text("Visible / Hide")
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun LazyItem(content: @Composable BoxScope.() -> Unit) {
    Box(Modifier.fillMaxWidth().aspectRatio(2f)) {
        content()
    }
}