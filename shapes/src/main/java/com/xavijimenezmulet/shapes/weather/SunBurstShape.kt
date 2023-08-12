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


val SunBurstShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512f
        val baseHeight = 511.998f

        val path = Path().apply {
            moveTo(256.004f, 378.93f)
            cubicTo(324.1261f, 378.93f, 379.35f, 323.7061f, 379.35f, 255.584f)
            cubicTo(379.35f, 187.4619f, 324.1261f, 132.238f, 256.004f, 132.238f)
            cubicTo(187.8819f, 132.238f, 132.658f, 187.4619f, 132.658f, 255.584f)
            cubicTo(132.658f, 323.7061f, 187.8819f, 378.93f, 256.004f, 378.93f)
            close()

            moveTo(512f, 255.998f)
            lineTo(401.012f, 205.715f)
            cubicTo(406.522f, 221.712f, 409.318f, 238.438f, 409.318f, 255.58f)
            cubicTo(409.318f, 273.079f, 406.403f, 290.142f, 400.663f, 306.44f)
            lineTo(512f, 255.998f)
            close()

            moveTo(323.285f, 117.791f)
            cubicTo(338.514f, 125.227f, 352.322f, 135.08f, 364.412f, 147.169f)
            cubicTo(376.677f, 159.434f, 386.644f, 173.464f, 394.117f, 188.956f)
            lineTo(437.019f, 74.98f)
            lineTo(323.285f, 117.791f)
            close()

            moveTo(256f, 0f)
            lineTo(205.862f, 110.665f)
            cubicTo(221.941f, 105.092f, 238.76f, 102.263f, 256f, 102.263f)
            cubicTo(273.24f, 102.263f, 290.059f, 105.092f, 306.138f, 110.664f)
            lineTo(256f, 0f)
            close()

            moveTo(102.682f, 255.581f)
            cubicTo(102.682f, 238.439f, 105.478f, 221.712f, 110.988f, 205.715f)
            lineTo(0f, 255.998f)
            lineTo(111.337f, 306.441f)
            cubicTo(105.598f, 290.143f, 102.682f, 273.08f, 102.682f, 255.581f)
            close()

            moveTo(74.981f, 74.98f)
            lineTo(117.883f, 188.956f)
            cubicTo(125.354f, 173.464f, 135.323f, 159.433f, 147.588f, 147.168f)
            cubicTo(159.678f, 135.079f, 173.485f, 125.226f, 188.715f, 117.79f)
            lineTo(74.981f, 74.98f)
            close()

            moveTo(393.938f, 322.567f)
            cubicTo(386.486f, 337.915f, 376.581f, 351.824f, 364.412f, 363.993f)
            cubicTo(352.067f, 376.338f, 337.934f, 386.356f, 322.322f, 393.844f)
            lineTo(437.019f, 437.018f)
            lineTo(393.938f, 322.567f)
            close()

            moveTo(256f, 408.899f)
            cubicTo(238.599f, 408.899f, 221.628f, 406.016f, 205.412f, 400.339f)
            lineTo(256f, 511.998f)
            lineTo(306.588f, 400.339f)
            cubicTo(290.372f, 406.016f, 273.401f, 408.899f, 256f, 408.899f)
            close()

            moveTo(147.588f, 363.993f)
            cubicTo(135.419f, 351.824f, 125.514f, 337.915f, 118.062f, 322.566f)
            lineTo(74.981f, 437.019f)
            lineTo(189.678f, 393.845f)
            cubicTo(174.066f, 386.356f, 159.933f, 376.338f, 147.588f, 363.993f)
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
fun SunBurstPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(SunBurstShape)
                .background(Color.Yellow)
        )
    }
}