package com.xavijimenezmulet.shapes

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

object AppBarShape: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path().apply {
            reset()
            moveTo(0f, 0f)
            lineTo(0f, size.height)
            cubicTo(
                x1 = size.height * 2,
                y1 = size.height * 1.13f,
                x2 = size.width * 0.25f,
                y2 = size.height * 0.25f,
                x3 = (size.width / 2) + (size.width / 3),
                y3 = 0f
            )
            close()
        }

        return Outline.Generic(
            path = path
        )
    }
}