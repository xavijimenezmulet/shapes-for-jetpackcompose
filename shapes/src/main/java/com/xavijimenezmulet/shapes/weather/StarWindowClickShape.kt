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


val StarWindowClickShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512.0013f
        val baseHeight = 512.001f

        val path = Path().apply {
            moveTo(508.625f, 418.886f)
            lineTo(469.333f, 382.05f)
            lineTo(469.333f, 42.667f)
            cubicTo(469.333f, 19.136f, 450.188f, 0f, 426.667f, 0f)
            lineTo(42.667f, 0f)
            cubicTo(19.146f, 0f, 0f, 19.136f, 0f, 42.667f)
            lineTo(0f, 426.667f)
            cubicTo(0f, 450.198f, 19.146f, 469.334f, 42.667f, 469.334f)
            lineTo(320f, 469.334f)
            lineTo(320f, 501.334f)
            cubicTo(320f, 505.647f, 322.594f, 509.542f, 326.583f, 511.188f)
            cubicTo(327.906f, 511.74f, 329.291f, 512.001f, 330.666f, 512.001f)
            cubicTo(333.437f, 512.001f, 336.166f, 510.918f, 338.208f, 508.876f)
            lineTo(377.75f, 469.334f)
            lineTo(382.734f, 469.334f)
            lineTo(395.791f, 495.438f)
            cubicTo(398.426f, 500.709f, 404.833f, 502.834f, 410.104f, 500.209f)
            lineTo(452.771f, 478.876f)
            cubicTo(458.042f, 476.241f, 460.177f, 469.834f, 457.542f, 464.563f)
            lineTo(454.593f, 458.663f)
            cubicTo(460.958f, 453.1f, 465.631f, 445.755f, 467.82f, 437.334f)
            lineTo(501.334f, 437.334f)
            cubicTo(505.709f, 437.334f, 509.647f, 434.657f, 511.251f, 430.594f)
            cubicTo(512.865f, 426.521f, 511.823f, 421.875f, 508.625f, 418.886f)
            close()
            moveTo(138.667f, 42.667f)
            cubicTo(144.558f, 42.667f, 149.334f, 47.442f, 149.334f, 53.334f)
            cubicTo(149.334f, 59.225f, 144.558f, 64.001f, 138.667f, 64.001f)
            cubicTo(132.776f, 64.001f, 128f, 59.224f, 128f, 53.334f)
            cubicTo(128f, 47.442f, 132.776f, 42.667f, 138.667f, 42.667f)
            close()
            moveTo(96f, 42.667f)
            cubicTo(101.891f, 42.667f, 106.667f, 47.442f, 106.667f, 53.334f)
            cubicTo(106.667f, 59.224f, 101.891f, 64f, 96f, 64f)
            cubicTo(90.109f, 64f, 85.333f, 59.224f, 85.333f, 53.333f)
            cubicTo(85.333f, 47.442f, 90.109f, 42.667f, 96f, 42.667f)
            close()
            moveTo(53.333f, 42.667f)
            cubicTo(59.224f, 42.667f, 64f, 47.442f, 64f, 53.334f)
            cubicTo(64f, 59.224f, 59.224f, 64f, 53.333f, 64f)
            cubicTo(47.442f, 64f, 42.666f, 59.224f, 42.666f, 53.333f)
            cubicTo(42.667f, 47.442f, 47.443f, 42.667f, 53.333f, 42.667f)
            close()
            moveTo(426.667f, 342.05f)
            lineTo(340.245f, 261.029f)
            cubicTo(341.469f, 257.48f, 341.681f, 253.593f, 340.521f, 249.823f)
            cubicTo(338.396f, 242.99f, 332.417f, 238.052f, 325.281f, 237.229f)
            lineTo(269.833f, 231.083f)
            lineTo(251.562f, 182.375f)
            cubicTo(248.927f, 175.375f, 242.145f, 170.667f, 234.666f, 170.667f)
            cubicTo(227.187f, 170.667f, 220.406f, 175.375f, 217.77f, 182.375f)
            lineTo(199.5f, 231.084f)
            lineTo(144.021f, 237.24f)
            cubicTo(136.917f, 238.053f, 130.938f, 242.99f, 128.792f, 249.865f)
            cubicTo(126.677f, 256.761f, 128.855f, 264.23f, 134.313f, 268.886f)
            lineTo(177.782f, 306.146f)
            lineTo(165.355f, 362.021f)
            cubicTo(163.74f, 369.25f, 166.803f, 376.865f, 173.022f, 381.011f)
            cubicTo(179.189f, 385.074f, 187.522f, 384.907f, 193.47f, 380.636f)
            lineTo(234.668f, 351.209f)
            lineTo(275.856f, 380.636f)
            cubicTo(278.939f, 382.834f, 282.575f, 384.001f, 286.366f, 384.001f)
            cubicTo(289.908f, 384.001f, 293.345f, 382.97f, 296.366f, 380.98f)
            cubicTo(302.533f, 376.865f, 305.595f, 369.251f, 303.991f, 362.032f)
            lineTo(291.553f, 306.147f)
            lineTo(320f, 281.763f)
            lineTo(320f, 426.667f)
            lineTo(42.667f, 426.667f)
            lineTo(42.667f, 106.667f)
            lineTo(426.667f, 106.667f)
            lineTo(426.667f, 342.05f)
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
fun StarWindowClickShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(StarWindowClickShape)
                .background(Color.Yellow)
        )
    }
}