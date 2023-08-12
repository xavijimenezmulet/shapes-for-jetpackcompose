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

val StarTapShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 511.9951f
        val baseHeight = 469.334f

        val path = Path().apply {
            moveTo(511.333f, 47.333f)
            cubicTo(509.604f, 41.698f, 504.687f, 37.645f, 498.875f, 37.01f)
            lineTo(470.958f, 33.916f)
            lineTo(461.812f, 9.541f)
            cubicTo(457.479f, -1.876f, 438.52f, -1.907f, 434.187f, 9.572f)
            lineTo(425.041f, 33.916f)
            lineTo(397.166f, 37.01f)
            cubicTo(391.312f, 37.645f, 386.395f, 41.698f, 384.645f, 47.354f)
            cubicTo(382.916f, 53f, 384.708f, 59.114f, 389.166f, 62.896f)
            lineTo(411.145f, 81.75f)
            lineTo(404.874f, 109.99f)
            cubicTo(403.52f, 115.928f, 406.041f, 122.178f, 411.207f, 125.594f)
            cubicTo(416.124f, 128.834f, 422.936f, 128.729f, 427.874f, 125.25f)
            lineTo(448f, 110.865f)
            lineTo(468.188f, 125.292f)
            cubicTo(470.688f, 127.063f, 473.646f, 128f, 476.709f, 128f)
            cubicTo(479.584f, 128f, 482.397f, 127.167f, 484.876f, 125.552f)
            cubicTo(489.98f, 122.177f, 492.439f, 116.114f, 491.147f, 110.021f)
            lineTo(484.855f, 81.75f)
            lineTo(506.813f, 62.927f)
            cubicTo(511.292f, 59.115f, 513.083f, 53f, 511.333f, 47.333f)
            close()

            moveTo(449f, 251.875f)
            lineTo(370.937f, 200.844f)
            cubicTo(356.604f, 191.469f, 338.812f, 188.344f, 319.999f, 194.99f)
            lineTo(319.999f, 124.171f)
            cubicTo(345.132f, 115.237f, 362.666f, 91.284f, 362.666f, 64f)
            cubicTo(362.666f, 28.708f, 333.958f, 0f, 298.666f, 0f)
            lineTo(64f, 0f)
            cubicTo(28.708f, 0f, 0f, 28.708f, 0f, 64f)
            cubicTo(0f, 99.292f, 28.708f, 128f, 64f, 128f)
            lineTo(234.667f, 128f)
            lineTo(234.667f, 328.417f)
            lineTo(173.438f, 298.396f)
            cubicTo(168.084f, 295.781f, 162.125f, 294.396f, 156.167f, 294.396f)
            cubicTo(134.75f, 294.396f, 117.334f, 311.573f, 117.334f, 332.677f)
            lineTo(117.334f, 339.198f)
            cubicTo(117.334f, 342.188f, 118.584f, 345.042f, 120.792f, 347.063f)
            lineTo(221.23f, 438.99f)
            cubicTo(242.605f, 458.563f, 270.48f, 469.334f, 299.688f, 469.334f)
            lineTo(380.355f, 469.334f)
            cubicTo(429.418f, 469.334f, 469.334f, 430.094f, 469.334f, 381.865f)
            lineTo(469.334f, 289.198f)
            cubicTo(469.333f, 274.135f, 461.729f, 260.187f, 449f, 251.875f)
            close()
            moveTo(277.333f, 64f)
            lineTo(277.333f, 21.333f)
            lineTo(298.666f, 21.333f)
            cubicTo(322.187f, 21.333f, 341.333f, 40.468f, 341.333f, 64f)
            cubicTo(341.333f, 79.714f, 332.597f, 93.747f, 319.441f, 101.145f)
            cubicTo(316.699f, 80.241f, 298.964f, 64f, 277.333f, 64f)
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
fun StarTapShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(StarTapShape)
                .background(Color.Yellow)
        )
    }
}