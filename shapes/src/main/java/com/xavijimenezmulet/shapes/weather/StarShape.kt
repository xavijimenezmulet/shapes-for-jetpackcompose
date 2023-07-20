package com.xavijimenezmulet.shapes.weather

import androidx.annotation.IntRange
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

/**
 *   @author xavierjimenez
 *   @since 6/7/23
 *   @email xavijimenezmulet@macaqueconsulting.com
 */

class StarShape(@IntRange(from = 5, to = 15) val starPoints: Int) : Shape {
    private val points = starPoints
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path()
        val starPoints = points
        val innerRadiusFactor = 0.5f

        val centerX = size.width / 2
        val centerY = size.height / 2
        val angleStep = 360f / (starPoints * 2)

        for (i in 0 until starPoints * 2) {
            val currentAngle = i * angleStep + 55f
            val radius = if (i % 2 == 0) {
                size.width / 2
            } else {
                size.width / 2 * innerRadiusFactor
            }

            val x = centerX + radius * kotlin.math.cos(Math.toRadians(currentAngle.toDouble()))
                .toFloat()
            val y = centerY + radius * kotlin.math.sin(Math.toRadians(currentAngle.toDouble()))
                .toFloat()

            if (i == 0) {
                path.moveTo(x, y)
            } else {
                path.lineTo(x, y)
            }
        }

        path.close()

        return Outline.Generic(path)
    }
}

@Preview
@Composable
fun StarPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(StarShape(5))
                .background(Color.Yellow)
        )
    }
}