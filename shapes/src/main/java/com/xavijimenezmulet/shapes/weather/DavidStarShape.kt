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


val DavidStarShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512.1197f
        val baseHeight = 490.24f

        val path = Path().apply {
            moveTo(320.9132f, 126.72f)
            lineTo(191.2065f, 126.72f)
            lineTo(241.3399f, 8.96f)
            cubicTo(246.4599f, -2.9867f, 265.6598f, -2.9867f, 270.7798f, 8.96f)
            lineTo(320.9132f, 126.72f)
            close()

            moveTo(119.9532f, 348.3734f)
            lineTo(222.9932f, 423.68f)
            lineTo(115.8999f, 487.8934f)
            cubicTo(110.5665f, 491.3067f, 103.5265f, 490.88f, 98.4065f, 487.2534f)
            cubicTo(93.0732f, 483.4134f, 90.7265f, 477.0133f, 92.2199f, 470.8267f)
            lineTo(105.2332f, 413.2267f)
            lineTo(119.7399f, 348.16f)
            lineTo(119.9532f, 348.3734f)
            close()

            moveTo(99.6865f, 285.44f)
            lineTo(4.9665f, 202.0267f)
            cubicTo(0.4865f, 197.76f, -1.2201f, 191.36f, 0.9132f, 185.6f)
            cubicTo(2.8332f, 179.6267f, 7.9532f, 175.36f, 14.1399f, 174.5067f)
            lineTo(139.3665f, 163.2f)
            lineTo(99.6865f, 285.44f)
            close()

            moveTo(384.6999f, 314.24f)
            cubicTo(384.6999f, 314.24f, 256.2732f, 404.48f, 256.0599f, 404.48f)
            cubicTo(255.8465f, 404.48f, 127.4199f, 314.24f, 127.4199f, 314.24f)
            lineTo(177.5532f, 158.72f)
            lineTo(334.5666f, 158.72f)
            lineTo(384.6999f, 314.24f)
            close()

            moveTo(419.8999f, 470.8267f)
            cubicTo(421.3932f, 477.0133f, 419.0465f, 483.4133f, 413.7132f, 487.2533f)
            cubicTo(410.9399f, 489.1733f, 407.7399f, 490.24f, 404.3266f, 490.24f)
            cubicTo(401.5532f, 490.24f, 398.7799f, 489.6f, 396.2199f, 487.8933f)
            lineTo(289.1266f, 423.68f)
            lineTo(392.1665f, 348.3733f)
            lineTo(392.3799f, 348.3733f)
            lineTo(409.8732f, 425.8134f)
            lineTo(419.8999f, 470.8267f)
            close()

            moveTo(507.1532f, 202.0267f)
            lineTo(410.7265f, 286.9333f)
            lineTo(370.6199f, 162.9867f)
            lineTo(497.9799f, 174.5067f)
            cubicTo(504.1666f, 175.36f, 509.2865f, 179.6267f, 511.2065f, 185.6f)
            cubicTo(513.3398f, 191.36f, 511.6332f, 197.76f, 507.1532f, 202.0267f)
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
fun DavidStarShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(DavidStarShape)
                .background(Color.Yellow)
        )
    }
}