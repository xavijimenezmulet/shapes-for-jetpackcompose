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

/**
 *   @author xavierjimenez
 *   @since 18/7/23
 *   @email xavijimenezmulet@macaqueconsulting.com
 */
val OctagonShape: Shape = object : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path()

        val width = size.width
        val height = size.height

        val startX = width / 4
        val endX = width * 3 / 4

        val startY = height / 4
        val endY = height * 3 / 4

        val offsetX = (size.width - width) / 2
        val offsetY = (size.height - height) / 2

        path.moveTo(startX + offsetX, offsetY)
        path.lineTo(endX + offsetX, offsetY)
        path.lineTo(width + offsetX, startY + offsetY)
        path.lineTo(width + offsetX, endY + offsetY)
        path.lineTo(endX + offsetX, height + offsetY)
        path.lineTo(startX + offsetX, height + offsetY)
        path.lineTo(offsetX, endY + offsetY)
        path.lineTo(offsetX, startY + offsetY)
        path.close()

        return Outline.Generic(path)
    }
}

@Preview
@Composable
fun OctagonPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .clip(OctagonShape)
                .background(Color.Yellow)
        )
    }
}