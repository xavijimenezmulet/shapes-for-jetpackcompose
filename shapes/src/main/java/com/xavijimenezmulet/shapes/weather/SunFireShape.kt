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


val SunFireShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512f
        val baseHeight = 512f

        val path = Path().apply {
            moveTo(91f, 256f)
            cubicTo(91f, 346.981f, 165.019f, 421f, 256f, 421f)
            cubicTo(346.981f, 421f, 421f, 346.981f, 421f, 256f)
            cubicTo(421f, 165.019f, 346.981f, 91f, 256f, 91f)
            cubicTo(165.019f, 91f, 91f, 165.019f, 91f, 256f)
            close()

            moveTo(421.28f, 358.98f)
            cubicTo(405.339f, 384.47f, 383.727f, 405.967f, 358.153f, 421.785f)
            lineTo(362.07f, 425.702f)
            cubicTo(373.745f, 437.377f, 373.774f, 456.347f, 362.143f, 468.051f)
            lineTo(362.07f, 468.139f)
            lineTo(383.281f, 489.35f)
            lineTo(415.097f, 457.519f)
            cubicTo(429.262f, 443.369f, 437.07f, 424.531f, 437.07f, 404.492f)
            cubicTo(437.069f, 387.744f, 431.34f, 372.014f, 421.28f, 358.98f)
            close()

            moveTo(445.803f, 211.992f)
            cubicTo(449.09f, 226.161f, 451f, 240.848f, 451f, 256f)
            cubicTo(451f, 271.509f, 448.988f, 286.527f, 445.549f, 301f)
            lineTo(451f, 301f)
            cubicTo(467.538f, 301f, 481f, 314.462f, 481f, 331f)
            lineTo(512f, 331f)
            lineTo(512f, 286f)
            cubicTo(512f, 248.004f, 482.494f, 216.854f, 445.803f, 211.992f)
            close()

            moveTo(468.051f, 149.857f)
            lineTo(468.139f, 149.93f)
            lineTo(489.35f, 128.719f)
            lineTo(457.519f, 96.903f)
            cubicTo(431.553f, 70.909f, 387.968f, 69.064f, 359.065f, 90.771f)
            cubicTo(384.518f, 106.709f, 405.984f, 128.3f, 421.786f, 153.847f)
            lineTo(425.703f, 149.93f)
            cubicTo(437.377f, 138.256f, 456.376f, 138.241f, 468.051f, 149.857f)
            close()

            moveTo(301f, 66.451f)
            lineTo(301f, 61f)
            cubicTo(301f, 44.462f, 314.462f, 31f, 331f, 31f)
            lineTo(331f, 0f)
            lineTo(286f, 0f)
            cubicTo(248.004f, 0f, 216.854f, 29.506f, 211.992f, 66.197f)
            cubicTo(226.161f, 62.91f, 240.848f, 61f, 256f, 61f)
            cubicTo(271.509f, 61f, 286.527f, 63.012f, 301f, 66.451f)
            close()

            moveTo(153.847f, 90.214f)
            lineTo(149.93f, 86.297f)
            cubicTo(138.255f, 74.622f, 138.226f, 55.652f, 149.857f, 43.948f)
            lineTo(149.93f, 43.86f)
            lineTo(128.72f, 22.65f)
            lineTo(96.903f, 54.481f)
            cubicTo(69.983f, 81.372f, 68.057f, 123.541f, 90.736f, 152.992f)
            cubicTo(106.676f, 127.513f, 128.282f, 106.027f, 153.847f, 90.214f)
            close()

            moveTo(66.197f, 300.008f)
            cubicTo(62.91f, 285.839f, 61f, 271.152f, 61f, 256f)
            cubicTo(61f, 240.491f, 63.012f, 225.473f, 66.451f, 211f)
            lineTo(61f, 211f)
            cubicTo(44.462f, 211f, 30f, 197.538f, 30f, 181f)
            lineTo(0f, 181f)
            lineTo(0f, 226f)
            cubicTo(0f, 263.996f, 29.506f, 295.146f, 66.197f, 300.008f)
            close()

            moveTo(152.992f, 421.264f)
            cubicTo(127.513f, 405.325f, 106.027f, 383.718f, 90.214f, 358.153f)
            lineTo(86.297f, 362.07f)
            cubicTo(74.622f, 373.759f, 55.623f, 373.745f, 43.948f, 362.143f)
            lineTo(43.86f, 362.07f)
            lineTo(22.65f, 383.28f)
            lineTo(54.481f, 415.096f)
            cubicTo(81.372f, 442.017f, 123.542f, 443.943f, 152.992f, 421.264f)
            close()

            moveTo(300.008f, 445.803f)
            cubicTo(285.839f, 449.09f, 271.152f, 451f, 256f, 451f)
            cubicTo(240.491f, 451f, 225.473f, 448.988f, 211f, 445.549f)
            lineTo(211f, 451f)
            cubicTo(211f, 467.538f, 197.538f, 481f, 181f, 481f)
            lineTo(181f, 512f)
            lineTo(226f, 512f)
            cubicTo(263.996f, 512f, 295.146f, 482.494f, 300.008f, 445.803f)
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
fun SunFireShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(SunFireShape)
                .background(Color.Yellow)
        )
    }
}