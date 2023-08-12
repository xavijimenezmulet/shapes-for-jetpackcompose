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

val MoonStarSmileShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 492.3116f
        val baseHeight = 511.9998f

        val path = Path().apply {
            moveTo(449.4774f, 374.0841f)
            cubicTo(406.0187f, 396.1384f, 357.1893f, 397.1003f, 315.4316f, 381.0038f)
            cubicTo(299.3021f, 405.7331f, 271.3729f, 422.0026f, 239.9939f, 422.0026f)
            cubicTo(211.0148f, 422.0026f, 183.6457f, 407.923f, 166.7562f, 384.3238f)
            cubicTo(161.9364f, 377.594f, 163.4963f, 368.2242f, 170.2261f, 363.4044f)
            cubicTo(176.9659f, 358.5845f, 186.3356f, 360.1345f, 191.1555f, 366.8743f)
            cubicTo(202.4151f, 382.6038f, 220.6745f, 392.0035f, 239.9939f, 392.0035f)
            cubicTo(259.6733f, 392.0035f, 277.3228f, 382.4038f, 288.3024f, 367.5443f)
            cubicTo(267.2131f, 354.4847f, 249.1036f, 336.6052f, 235.4941f, 314.8459f)
            lineTo(288.6324f, 301.5563f)
            cubicTo(300.862f, 298.4964f, 304.0719f, 282.5769f, 293.9922f, 275.0072f)
            cubicTo(258.3234f, 248.258f, 240.7239f, 203.5994f, 248.0637f, 158.4708f)
            cubicTo(255.0534f, 115.4321f, 283.0326f, 81.8232f, 322.9014f, 68.5536f)
            cubicTo(338.5909f, 63.3338f, 355.0004f, 60.5238f, 371.6798f, 60.1939f)
            cubicTo(386.9344f, 59.8789f, 392.0232f, 39.5235f, 378.6796f, 32.0847f)
            cubicTo(327.9812f, 3.9056f, 270.503f, -5.9841f, 212.4448f, 3.4956f)
            cubicTo(101.6083f, 21.5951f, 14.291f, 116.0221f, 1.6914f, 227.2887f)
            cubicTo(-15.7911f, 381.5318f, 104.5822f, 511.9998f, 254.9935f, 511.9998f)
            cubicTo(341.5708f, 511.9998f, 421.5182f, 468.4911f, 468.8468f, 395.6234f)
            cubicTo(477.1625f, 382.7988f, 463.105f, 367.1683f, 449.4774f, 374.0841f)
            close()
            moveTo(149.9967f, 227.0087f)
            cubicTo(149.9967f, 218.7389f, 143.2669f, 212.0091f, 134.9972f, 212.0091f)
            cubicTo(126.7275f, 212.0091f, 119.9977f, 218.7389f, 119.9977f, 227.0087f)
            cubicTo(119.9977f, 235.2884f, 113.2779f, 242.0082f, 104.9981f, 242.0082f)
            cubicTo(96.7084f, 242.0082f, 89.9986f, 235.2884f, 89.9986f, 227.0087f)
            cubicTo(89.9986f, 202.1994f, 110.188f, 182.0101f, 134.9972f, 182.0101f)
            cubicTo(159.8064f, 182.0101f, 179.9958f, 202.1994f, 179.9958f, 227.0087f)
            cubicTo(179.9958f, 235.2884f, 173.276f, 242.0082f, 164.9963f, 242.0082f)
            cubicTo(156.7065f, 242.0082f, 149.9967f, 235.2884f, 149.9967f, 227.0087f)
            close()

            moveTo(443.1676f, 255.9957f)
            lineTo(405.9857f, 236.7014f)
            lineTo(368.8039f, 255.9957f)
            cubicTo(357.8603f, 261.6756f, 345.0737f, 252.4039f, 347.0986f, 240.2233f)
            lineTo(353.9664f, 198.9065f)
            lineTo(324.1383f, 169.5235f)
            cubicTo(315.3536f, 160.8697f, 320.2204f, 145.8442f, 332.4311f, 144.0052f)
            lineTo(373.8568f, 137.7684f)
            lineTo(392.5672f, 100.3106f)
            cubicTo(398.079f, 89.277f, 413.8815f, 89.256f, 419.4043f, 100.3106f)
            lineTo(438.1147f, 137.7684f)
            lineTo(479.5405f, 144.0052f)
            cubicTo(491.7381f, 145.8422f, 496.6269f, 160.8607f, 487.8332f, 169.5235f)
            lineTo(458.0052f, 198.9065f)
            lineTo(464.8729f, 240.2233f)
            cubicTo(466.9069f, 252.4589f, 454.0613f, 261.6496f, 443.1676f, 255.9957f)
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
fun MoonStarSmileShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(MoonStarSmileShape)
                .background(Color.Yellow)
        )
    }
}