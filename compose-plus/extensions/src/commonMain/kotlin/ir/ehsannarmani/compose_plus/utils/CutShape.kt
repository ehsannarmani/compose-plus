package ir.ehsannarmani.compose_plus.utils

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

enum class CutDirection {Horizontal,Vertical}
internal class CutShape(
    private val visibleProgress:Float = 1f,
    private val direction:CutDirection
): Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path().apply {
            moveTo(0f, 0f)
            when(direction){
                CutDirection.Horizontal -> {
                    lineTo(size.width * visibleProgress, 0f)
                    lineTo(size.width * visibleProgress, size.height )
                    lineTo(0f, size.height)
                }
                CutDirection.Vertical -> {
                    lineTo(size.width, 0f)
                    lineTo(size.width, size.height * visibleProgress)
                    lineTo(0f, size.height * visibleProgress)
                }
            }
            close()
        }
        return Outline.Generic(path)
    }
}