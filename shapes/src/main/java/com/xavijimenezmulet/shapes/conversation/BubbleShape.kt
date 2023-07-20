package com.xavijimenezmulet.shapes.conversation

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

val BubbleShape: Shape = object : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Generic(Path().apply {
            val width = size.width
            val height = size.height

            moveTo(height * 0.1f, width * 0.2f)
            lineTo(height * 0.1f, width * 0.8f)
            lineTo(height * 0.4f, width * 0.8f)
            lineTo(height * 0.5f, width)
            lineTo(height * 0.6f, width * 0.8f)
            lineTo(height * 0.9f, width * 0.8f)
            lineTo(height * 0.9f, width * 0.2f)
            close()
        })
    }
}

@Preview
@Composable
fun HalfMoonPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .clip(BubbleShape)
                .background(Color.Yellow)
        )
    }
}