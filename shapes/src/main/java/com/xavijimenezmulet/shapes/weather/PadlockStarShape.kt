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


val PadlockStarShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512.0071f
        val baseHeight = 511.993f

        val path = Path().apply {
            moveTo(440.1494f, 509.2267f)
            lineTo(373.3333f, 463.7654f)
            lineTo(306.5173f, 509.2267f)
            cubicTo(301.0133f, 512.9387f, 293.8027f, 512.9174f, 288.3413f, 509.0987f)
            cubicTo(282.9013f, 505.3014f, 280.3627f, 498.496f, 282.0053f, 492.0747f)
            lineTo(302.8054f, 409.9413f)
            lineTo(240.256f, 356.544f)
            cubicTo(235.2853f, 352.2987f, 233.408f, 345.4507f, 235.4774f, 339.264f)
            cubicTo(237.568f, 333.0773f, 243.2214f, 328.768f, 249.728f, 328.4054f)
            lineTo(329.408f, 323.904f)
            lineTo(358.2934f, 245.184f)
            cubicTo(360.6187f, 238.848f, 366.6347f, 234.6667f, 373.3333f, 234.6667f)
            cubicTo(380.032f, 234.6667f, 386.048f, 238.848f, 388.352f, 245.1627f)
            lineTo(417.2374f, 323.8827f)
            lineTo(496.9173f, 328.384f)
            cubicTo(503.4453f, 328.768f, 509.0774f, 333.056f, 511.168f, 339.2427f)
            cubicTo(513.2587f, 345.4507f, 511.36f, 352.2773f, 506.3893f, 356.5227f)
            lineTo(443.84f, 409.92f)
            lineTo(464.64f, 492.0534f)
            cubicTo(466.2827f, 498.496f, 463.744f, 505.28f, 458.304f, 509.0774f)
            cubicTo(452.928f, 512.8747f, 445.7174f, 513.0027f, 440.1494f, 509.2267f)
            close()

            moveTo(282.6667f, 218.6667f)
            cubicTo(273.8347f, 218.6667f, 266.6667f, 211.4987f, 266.6667f, 202.6667f)
            lineTo(266.6667f, 106.6667f)
            cubicTo(266.6667f, 65.4933f, 233.1733f, 32f, 192f, 32f)
            cubicTo(150.8267f, 32f, 117.3333f, 65.4933f, 117.3333f, 106.6667f)
            lineTo(117.3333f, 202.6667f)
            cubicTo(117.3333f, 211.4987f, 110.1653f, 218.6667f, 101.3333f, 218.6667f)
            cubicTo(92.5013f, 218.6667f, 85.3333f, 211.4987f, 85.3333f, 202.6667f)
            lineTo(85.3333f, 106.6667f)
            cubicTo(85.3333f, 47.8507f, 133.184f, 0f, 192f, 0f)
            cubicTo(250.816f, 0f, 298.6667f, 47.8507f, 298.6667f, 106.6667f)
            lineTo(298.6667f, 202.6667f)
            cubicTo(298.6667f, 211.4987f, 291.4987f, 218.6667f, 282.6667f, 218.6667f)
            close()

            moveTo(336.64f, 205.0133f)
            cubicTo(328.5333f, 211.4133f, 321.92f, 220.16f, 318.2933f, 230.4f)
            lineTo(299.0934f, 282.88f)
            lineTo(247.2533f, 285.8667f)
            cubicTo(223.36f, 287.1467f, 202.88f, 302.72f, 194.9867f, 325.76f)
            cubicTo(187.3067f, 348.5867f, 194.3467f, 373.3333f, 212.48f, 388.9067f)
            lineTo(254.9333f, 425.1733f)
            lineTo(244.2667f, 467.4134f)
            cubicTo(226.9867f, 468.6934f, 209.4933f, 469.3333f, 192f, 469.3333f)
            cubicTo(141.0133f, 469.3333f, 89.1733f, 463.7867f, 46.5067f, 456.1067f)
            cubicTo(19.4133f, 450.7733f, 0f, 427.0933f, 0f, 400f)
            lineTo(0f, 261.3333f)
            cubicTo(0f, 234.24f, 19.4133f, 210.56f, 46.2933f, 205.2267f)
            cubicTo(94.2933f, 196.48f, 148.6933f, 192f, 191.36f, 192f)
            cubicTo(197.3333f, 192f, 203.3067f, 192f, 208.8533f, 192.2133f)
            lineTo(209.4933f, 192.2133f)
            cubicTo(247.4667f, 193.0667f, 292.6933f, 197.12f, 336.64f, 205.0133f)
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
fun PadlockStarShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(PadlockStarShape)
                .background(Color.Yellow)
        )
    }
}