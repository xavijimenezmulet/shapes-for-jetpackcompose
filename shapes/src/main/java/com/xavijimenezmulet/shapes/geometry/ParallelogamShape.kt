package com.xavijimenezmulet.shapes.geometry

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
import java.lang.Math.tan

/**
 *   @author xavierjimenez
 *   @since 6/7/23
 *   @email xavijimenezmulet@macaqueconsulting.com
 */

class ParallelogramShape(private val angle: Float) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Generic(

            Path().apply {
                val radian = (90 - angle) * Math.PI / 180
                val xOnOpposite = (size.height * tan(radian)).toFloat()
                moveTo(0f, size.height)
                lineTo(x = xOnOpposite, y = 0f)
                lineTo(x = size.width, y = 0f)
                lineTo(x = size.width - xOnOpposite, y = size.height)
                lineTo(x = xOnOpposite, y = size.height)
            }
        )
    }
}

@Preview
@Composable
fun ParallelogramPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(ParallelogramShape(70f))
                .background(Color.Yellow)
        )
    }
}