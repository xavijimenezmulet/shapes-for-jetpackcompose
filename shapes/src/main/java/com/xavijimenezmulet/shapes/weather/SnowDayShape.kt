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


val SnowDayShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512f
        val baseHeight = 480f

        val path = Path().apply {
            moveTo(269.312f, 330.144f)
            lineTo(223.968f, 304f)
            lineTo(269.28f, 277.856f)
            cubicTo(276.928f, 273.44f, 279.552f, 263.648f, 275.136f, 256f)
            cubicTo(270.688f, 248.32f, 260.896f, 245.696f, 253.28f, 250.144f)
            lineTo(208f, 276.288f)
            lineTo(208f, 224f)
            cubicTo(208f, 215.168f, 200.832f, 208f, 192f, 208f)
            cubicTo(183.168f, 208f, 176f, 215.168f, 176f, 224f)
            lineTo(176f, 276.288f)
            lineTo(130.72f, 250.144f)
            cubicTo(123.072f, 245.696f, 113.28f, 248.32f, 108.864f, 256f)
            cubicTo(104.448f, 263.648f, 107.072f, 273.44f, 114.72f, 277.856f)
            lineTo(160.032f, 304f)
            lineTo(114.72f, 330.144f)
            cubicTo(107.072f, 334.56f, 104.448f, 344.352f, 108.864f, 352f)
            cubicTo(111.84f, 357.12f, 117.216f, 360f, 122.752f, 360f)
            cubicTo(125.472f, 360f, 128.224f, 359.328f, 130.752f, 357.856f)
            lineTo(176f, 331.712f)
            lineTo(176f, 384f)
            cubicTo(176f, 392.832f, 183.168f, 400f, 192f, 400f)
            cubicTo(200.832f, 400f, 208f, 392.832f, 208f, 384f)
            lineTo(208f, 331.712f)
            lineTo(253.28f, 357.856f)
            cubicTo(255.808f, 359.328f, 258.56f, 360f, 261.28f, 360f)
            cubicTo(266.816f, 360f, 272.192f, 357.12f, 275.168f, 352f)
            cubicTo(279.584f, 344.352f, 276.96f, 334.56f, 269.312f, 330.144f)
            close()

            moveTo(416f, 128f)
            cubicTo(414.976f, 128f, 413.952f, 128f, 412.864f, 128.032f)
            cubicTo(397.952f, 54.016f, 333.088f, 0f, 256f, 0f)
            cubicTo(191.968f, 0f, 134.496f, 38.112f, 109.312f, 96.032f)
            cubicTo(48.8f, 97.472f, 0f, 147.136f, 0f, 208f)
            cubicTo(0f, 259.936f, 35.712f, 303.328f, 83.744f, 315.936f)
            cubicTo(87.104f, 311.264f, 91.296f, 307.232f, 96.192f, 304f)
            cubicTo(86.432f, 297.568f, 79.424f, 287.872f, 76.352f, 276.448f)
            cubicTo(73.024f, 264.064f, 74.72f, 251.104f, 81.152f, 240f)
            cubicTo(87.552f, 228.864f, 97.952f, 220.896f, 110.4f, 217.6f)
            cubicTo(121.792f, 214.56f, 133.632f, 215.776f, 144.096f, 221.024f)
            cubicTo(145.632f, 195.936f, 166.528f, 176f, 192f, 176f)
            cubicTo(217.44f, 176f, 238.368f, 195.936f, 239.904f, 220.992f)
            cubicTo(250.24f, 215.776f, 262.112f, 214.56f, 273.504f, 217.568f)
            cubicTo(285.952f, 220.832f, 296.352f, 228.8f, 302.816f, 239.936f)
            lineTo(302.848f, 240f)
            cubicTo(309.28f, 251.104f, 310.976f, 264.064f, 307.648f, 276.448f)
            cubicTo(304.576f, 287.872f, 297.6f, 297.536f, 287.808f, 304f)
            cubicTo(293.984f, 308.064f, 298.496f, 313.728f, 302.176f, 320f)
            lineTo(416f, 320f)
            cubicTo(468.928f, 320f, 512f, 276.928f, 512f, 224f)
            cubicTo(512f, 171.072f, 468.928f, 128f, 416f, 128f)
            close()

            moveTo(417.568f, 426.144f)
            lineTo(399.968f, 416f)
            lineTo(417.568f, 405.856f)
            cubicTo(425.216f, 401.44f, 427.84f, 391.648f, 423.392f, 384f)
            cubicTo(418.976f, 376.32f, 409.184f, 373.696f, 401.536f, 378.144f)
            lineTo(384f, 388.288f)
            lineTo(384f, 368f)
            cubicTo(384f, 359.168f, 376.832f, 352f, 368f, 352f)
            cubicTo(359.168f, 352f, 352f, 359.168f, 352f, 368f)
            lineTo(352f, 388.288f)
            lineTo(334.432f, 378.144f)
            cubicTo(326.816f, 373.728f, 316.992f, 376.352f, 312.608f, 384f)
            cubicTo(308.16f, 391.648f, 310.784f, 401.44f, 318.464f, 405.856f)
            lineTo(336.032f, 416f)
            lineTo(318.432f, 426.144f)
            cubicTo(310.784f, 430.56f, 308.16f, 440.352f, 312.608f, 448f)
            cubicTo(315.552f, 453.12f, 320.96f, 456f, 326.464f, 456f)
            cubicTo(329.184f, 456f, 331.936f, 455.328f, 334.464f, 453.856f)
            lineTo(352f, 443.712f)
            lineTo(352f, 464f)
            cubicTo(352f, 472.832f, 359.168f, 480f, 368f, 480f)
            cubicTo(376.832f, 480f, 384f, 472.832f, 384f, 464f)
            lineTo(384f, 443.712f)
            lineTo(401.568f, 453.856f)
            cubicTo(404.096f, 455.328f, 406.848f, 456f, 409.568f, 456f)
            cubicTo(415.072f, 456f, 420.48f, 453.12f, 423.424f, 448f)
            cubicTo(427.872f, 440.352f, 425.248f, 430.56f, 417.568f, 426.144f)
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
fun SnowDayShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(SnowDayShape)
                .background(Color.Yellow)
        )
    }
}