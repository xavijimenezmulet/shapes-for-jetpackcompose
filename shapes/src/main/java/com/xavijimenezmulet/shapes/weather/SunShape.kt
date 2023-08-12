package com.xavijimenezmulet.shapes.weather

import android.graphics.Matrix
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
import androidx.compose.ui.graphics.asAndroidPath
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

/**
 *   @author xavierjimenez
 *   @since 12/8/23
 *   @email xavijimenezmulet@macaqueconsulting.com
 */

val SunShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 448f
        val baseHeight = 448f

        val path = Path().apply {
            moveTo(240f, 400f)
            lineTo(240f, 432f)
            cubicTo(240f, 440.832f, 232.832f, 448f, 224f, 448f)
            cubicTo(215.168f, 448f, 208f, 440.832f, 208f, 432f)
            lineTo(208f, 400f)
            cubicTo(208f, 391.168f, 215.168f, 384f, 224f, 384f)
            cubicTo(232.832f, 384f, 240f, 391.168f, 240f, 400f)
            close()

            moveTo(448f, 224f)
            cubicTo(448f, 232.832f, 440.832f, 240f, 432f, 240f)
            lineTo(400f, 240f)
            cubicTo(391.168f, 240f, 384f, 232.832f, 384f, 224f)
            cubicTo(384f, 215.168f, 391.168f, 208f, 400f, 208f)
            lineTo(432f, 208f)
            cubicTo(440.832f, 208f, 448f, 215.168f, 448f, 224f)
            close()

            moveTo(64f, 224f)
            cubicTo(64f, 232.832f, 56.832f, 240f, 48f, 240f)
            lineTo(16f, 240f)
            cubicTo(7.168f, 240f, 0f, 232.832f, 0f, 224f)
            cubicTo(0f, 215.168f, 7.168f, 208f, 16f, 208f)
            lineTo(48f, 208f)
            cubicTo(56.832f, 208f, 64f, 215.168f, 64f, 224f)
            close()

            moveTo(107.312f, 340.688f)
            cubicTo(113.568f, 346.944f, 113.568f, 357.056f, 107.312f, 363.312f)
            lineTo(88.24f, 382.384f)
            cubicTo(81.984f, 388.64f, 71.872f, 388.64f, 65.616f, 382.384f)
            cubicTo(59.36f, 376.128f, 59.36f, 366.016f, 65.616f, 359.76f)
            lineTo(84.688f, 340.688f)
            cubicTo(90.944f, 334.432f, 101.056f, 334.432f, 107.312f, 340.688f)
            close()

            moveTo(382.384f, 359.76f)
            cubicTo(388.64f, 366.016f, 388.64f, 376.128f, 382.384f, 382.384f)
            cubicTo(376.128f, 388.64f, 366.016f, 388.64f, 359.76f, 382.384f)
            lineTo(340.688f, 363.312f)
            cubicTo(334.432f, 357.056f, 334.432f, 346.944f, 340.688f, 340.688f)
            cubicTo(346.944f, 334.432f, 357.056f, 334.432f, 363.312f, 340.688f)
            lineTo(382.384f, 359.76f)
            close()

            moveTo(224f, 0f)
            cubicTo(232.832f, 0f, 240f, 7.168f, 240f, 16f)
            lineTo(240f, 48f)
            cubicTo(240f, 56.832f, 232.832f, 64f, 224f, 64f)
            cubicTo(215.168f, 64f, 208f, 56.832f, 208f, 48f)
            lineTo(208f, 16f)
            cubicTo(208f, 7.168f, 215.168f, 0f, 224f, 0f)
            close()

            moveTo(88.24f, 65.616f)
            lineTo(107.312f, 84.688f)
            cubicTo(113.568f, 90.944f, 113.568f, 101.056f, 107.312f, 107.312f)
            cubicTo(101.056f, 113.568f, 90.944f, 113.568f, 84.688f, 107.312f)
            lineTo(65.616f, 88.24f)
            cubicTo(59.36f, 81.984f, 59.36f, 71.872f, 65.616f, 65.616f)
            cubicTo(71.872f, 59.36f, 81.984f, 59.36f, 88.24f, 65.616f)
            close()

            moveTo(340.688f, 107.312f)
            cubicTo(334.432f, 101.056f, 334.432f, 90.944f, 340.688f, 84.688f)
            lineTo(359.76f, 65.616f)
            cubicTo(366.016f, 59.36f, 376.128f, 59.36f, 382.384f, 65.616f)
            cubicTo(388.64f, 71.872f, 388.64f, 81.984f, 382.384f, 88.24f)
            lineTo(363.312f, 107.312f)
            cubicTo(357.056f, 113.568f, 346.944f, 113.568f, 340.688f, 107.312f)
            close()

            moveTo(224f, 96f)
            cubicTo(153.424f, 96f, 96f, 153.424f, 96f, 224f)
            cubicTo(96f, 294.576f, 153.424f, 352f, 224f, 352f)
            cubicTo(294.576f, 352f, 352f, 294.576f, 352f, 224f)
            cubicTo(352f, 153.424f, 294.576f, 96f, 224f, 96f)
            close()
        }

        return Outline.Generic(
            path
                .asAndroidPath()
                .apply {
                    transform(Matrix().apply {
                        setScale(size.width / baseWidth, size.height / baseHeight)
                    })
                }
                .asComposePath()
        )
    }
}

@Preview
@Composable
fun SunPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(SunShape)
                .background(Color.Yellow)
        )
    }
}