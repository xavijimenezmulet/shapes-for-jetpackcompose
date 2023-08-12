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

val SnowNightShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512f
        val baseHeight = 511.6894f

        val path = Path().apply {
            moveTo(504.288f, 89.8974f)
            cubicTo(499.232f, 86.6334f, 492.768f, 86.5374f, 487.616f, 89.5774f)
            cubicTo(480.768f, 93.5774f, 472.608f, 95.6894f, 464f, 95.6894f)
            cubicTo(437.536f, 95.6894f, 416f, 74.1534f, 416f, 47.6894f)
            cubicTo(416f, 39.0814f, 418.112f, 30.9214f, 422.112f, 24.1054f)
            cubicTo(425.152f, 18.9214f, 425.024f, 12.4894f, 421.792f, 7.4014f)
            cubicTo(418.528f, 2.3454f, 412.64f, -0.5026f, 406.784f, 0.0734f)
            cubicTo(384.96f, 2.1214f, 365.792f, 11.5614f, 350.848f, 25.4174f)
            cubicTo(390.848f, 48.2654f, 422.464f, 84.7134f, 437.792f, 129.5454f)
            cubicTo(458.208f, 133.0654f, 476.768f, 141.7374f, 492.672f, 153.7374f)
            cubicTo(503.072f, 139.9774f, 509.888f, 123.2734f, 511.616f, 104.8734f)
            cubicTo(512.192f, 98.8894f, 509.344f, 93.0974f, 504.288f, 89.8974f)
            close()

            moveTo(269.312f, 361.8334f)
            lineTo(223.968f, 335.6894f)
            lineTo(269.28f, 309.5454f)
            cubicTo(276.928f, 305.1294f, 279.552f, 295.3374f, 275.136f, 287.6894f)
            cubicTo(270.688f, 280.0094f, 260.896f, 277.3854f, 253.28f, 281.8334f)
            lineTo(208f, 307.9774f)
            lineTo(208f, 255.6894f)
            cubicTo(208f, 246.8574f, 200.832f, 239.6894f, 192f, 239.6894f)
            cubicTo(183.168f, 239.6894f, 176f, 246.8574f, 176f, 255.6894f)
            lineTo(176f, 307.9774f)
            lineTo(130.72f, 281.8334f)
            cubicTo(123.072f, 277.3854f, 113.28f, 280.0094f, 108.864f, 287.6894f)
            cubicTo(104.448f, 295.3374f, 107.072f, 305.1294f, 114.72f, 309.5454f)
            lineTo(160.032f, 335.6894f)
            lineTo(114.72f, 361.8334f)
            cubicTo(107.072f, 366.2494f, 104.448f, 376.0414f, 108.864f, 383.6894f)
            cubicTo(111.84f, 388.8094f, 117.216f, 391.6894f, 122.752f, 391.6894f)
            cubicTo(125.472f, 391.6894f, 128.224f, 391.0174f, 130.752f, 389.5454f)
            lineTo(176f, 363.4014f)
            lineTo(176f, 415.6894f)
            cubicTo(176f, 424.5214f, 183.168f, 431.6894f, 192f, 431.6894f)
            cubicTo(200.832f, 431.6894f, 208f, 424.5214f, 208f, 415.6894f)
            lineTo(208f, 363.4014f)
            lineTo(253.28f, 389.5454f)
            cubicTo(255.808f, 391.0174f, 258.56f, 391.6894f, 261.28f, 391.6894f)
            cubicTo(266.816f, 391.6894f, 272.192f, 388.8094f, 275.168f, 383.6894f)
            cubicTo(279.584f, 376.0414f, 276.96f, 366.2494f, 269.312f, 361.8334f)
            close()

            moveTo(416f, 159.6894f)
            cubicTo(414.976f, 159.6894f, 413.952f, 159.6894f, 412.864f, 159.7214f)
            cubicTo(397.952f, 85.7054f, 333.088f, 31.6894f, 256f, 31.6894f)
            cubicTo(191.968f, 31.6894f, 134.496f, 69.8014f, 109.312f, 127.7214f)
            cubicTo(48.8f, 129.1614f, 0f, 178.8254f, 0f, 239.6894f)
            cubicTo(0f, 291.6254f, 35.712f, 335.0174f, 83.744f, 347.6254f)
            cubicTo(87.104f, 342.9534f, 91.296f, 338.9214f, 96.192f, 335.6894f)
            cubicTo(86.432f, 329.2574f, 79.424f, 319.5614f, 76.352f, 308.1374f)
            cubicTo(73.024f, 295.7534f, 74.72f, 282.7934f, 81.152f, 271.6894f)
            cubicTo(87.552f, 260.5534f, 97.952f, 252.5854f, 110.4f, 249.2894f)
            cubicTo(121.792f, 246.2494f, 133.632f, 247.4654f, 144.096f, 252.7134f)
            cubicTo(145.632f, 227.6254f, 166.528f, 207.6894f, 192f, 207.6894f)
            cubicTo(217.44f, 207.6894f, 238.368f, 227.6254f, 239.904f, 252.6814f)
            cubicTo(250.24f, 247.4654f, 262.112f, 246.2494f, 273.504f, 249.2574f)
            cubicTo(285.952f, 252.5214f, 296.352f, 260.4894f, 302.816f, 271.6254f)
            lineTo(302.848f, 271.6894f)
            cubicTo(309.28f, 282.7934f, 310.976f, 295.7534f, 307.648f, 308.1374f)
            cubicTo(304.576f, 319.5614f, 297.6f, 329.2254f, 287.808f, 335.6894f)
            cubicTo(293.984f, 339.7534f, 298.496f, 345.4174f, 302.176f, 351.6894f)
            lineTo(416f, 351.6894f)
            cubicTo(468.928f, 351.6894f, 512f, 308.6174f, 512f, 255.6894f)
            cubicTo(512f, 202.7614f, 468.928f, 159.6894f, 416f, 159.6894f)
            close()

            moveTo(417.568f, 457.8334f)
            lineTo(399.968f, 447.6894f)
            lineTo(417.568f, 437.5454f)
            cubicTo(425.216f, 433.1294f, 427.84f, 423.3374f, 423.392f, 415.6894f)
            cubicTo(418.976f, 408.0094f, 409.184f, 405.3854f, 401.536f, 409.8334f)
            lineTo(384f, 419.9774f)
            lineTo(384f, 399.6894f)
            cubicTo(384f, 390.8574f, 376.832f, 383.6894f, 368f, 383.6894f)
            cubicTo(359.168f, 383.6894f, 352f, 390.8574f, 352f, 399.6894f)
            lineTo(352f, 419.9774f)
            lineTo(334.432f, 409.8334f)
            cubicTo(326.816f, 405.4174f, 316.992f, 408.0414f, 312.608f, 415.6894f)
            cubicTo(308.16f, 423.3374f, 310.784f, 433.1294f, 318.464f, 437.5454f)
            lineTo(336.032f, 447.6894f)
            lineTo(318.432f, 457.8334f)
            cubicTo(310.784f, 462.2494f, 308.16f, 472.0414f, 312.608f, 479.6894f)
            cubicTo(315.552f, 484.8094f, 320.96f, 487.6894f, 326.464f, 487.6894f)
            cubicTo(329.184f, 487.6894f, 331.936f, 487.0174f, 334.464f, 485.5454f)
            lineTo(352f, 475.4014f)
            lineTo(352f, 495.6894f)
            cubicTo(352f, 504.5214f, 359.168f, 511.6894f, 368f, 511.6894f)
            cubicTo(376.832f, 511.6894f, 384f, 504.5214f, 384f, 495.6894f)
            lineTo(384f, 475.4014f)
            lineTo(401.568f, 485.5454f)
            cubicTo(404.096f, 487.0174f, 406.848f, 487.6894f, 409.568f, 487.6894f)
            cubicTo(415.072f, 487.6894f, 420.48f, 484.8094f, 423.424f, 479.6894f)
            cubicTo(427.872f, 472.0414f, 425.248f, 462.2494f, 417.568f, 457.8334f)
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
fun SnowNightShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(SnowNightShape)
                .background(Color.Yellow)
        )
    }
}