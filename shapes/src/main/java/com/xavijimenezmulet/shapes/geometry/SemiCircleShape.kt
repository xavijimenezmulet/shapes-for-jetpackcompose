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
import androidx.compose.ui.geometry.Rect
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
val SemicircleShape: Shape = object : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path()

        val radius = size.width / 2
        val centerX = size.width / 2
        val centerY = size.height / 2 + radius / 2

        val rectLeft = centerX - radius
        val rectTop = centerY - radius
        val rectRight = centerX + radius
        val rectBottom = centerY + radius

        val rect = Rect(rectLeft, rectTop, rectRight, rectBottom)
        path.arcTo(rect, 180f, 180f, forceMoveTo = false)

        return Outline.Generic(path)
    }
}

@Preview
@Composable
fun SemicirclePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .clip(SemicircleShape)
                .background(Color.Yellow)
        )
    }
}