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


val SunHappyShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512.0002f
        val baseHeight = 511.9985f

        val path = Path().apply {
            moveTo(509.9478f, 248.4258f)
            lineTo(479.3618f, 196.1428f)
            lineTo(479.7418f, 135.5688f)
            cubicTo(479.7758f, 130.1378f, 476.8717f, 125.1117f, 472.1487f, 122.4307f)
            lineTo(419.4818f, 92.5267f)
            lineTo(389.5768f, 39.8557f)
            cubicTo(386.8948f, 35.1327f, 381.8698f, 32.2287f, 376.4388f, 32.2627f)
            lineTo(315.8618f, 32.6407f)
            lineTo(263.5738f, 2.0528f)
            cubicTo(258.8948f, -0.6842f, 253.1038f, -0.6842f, 248.4258f, 2.0528f)
            lineTo(196.1428f, 32.6387f)
            lineTo(135.5688f, 32.2587f)
            cubicTo(130.1378f, 32.2247f, 125.1127f, 35.1287f, 122.4307f, 39.8517f)
            lineTo(92.5267f, 92.5197f)
            lineTo(39.8557f, 122.4248f)
            cubicTo(35.1327f, 125.1058f, 32.2277f, 130.1318f, 32.2617f, 135.5628f)
            lineTo(32.6397f, 196.1398f)
            lineTo(2.0528f, 248.4258f)
            cubicTo(-0.6842f, 253.1048f, -0.6842f, 258.8958f, 2.0528f, 263.5738f)
            lineTo(32.6387f, 315.8568f)
            lineTo(32.2587f, 376.4308f)
            cubicTo(32.2247f, 381.8618f, 35.1287f, 386.8878f, 39.8517f, 389.5688f)
            lineTo(92.5187f, 419.4727f)
            lineTo(122.4238f, 472.1438f)
            cubicTo(125.1058f, 476.8668f, 130.1308f, 479.7708f, 135.5618f, 479.7368f)
            lineTo(196.1388f, 479.3588f)
            lineTo(248.4248f, 509.9458f)
            cubicTo(253.1038f, 512.6828f, 258.8948f, 512.6828f, 263.5728f, 509.9458f)
            lineTo(315.8557f, 479.3597f)
            lineTo(376.4297f, 479.7397f)
            cubicTo(381.8607f, 479.7737f, 386.8857f, 476.8698f, 389.5677f, 472.1468f)
            lineTo(419.4717f, 419.4798f)
            lineTo(472.1428f, 389.5748f)
            cubicTo(476.8658f, 386.8938f, 479.7708f, 381.8678f, 479.7368f, 376.4368f)
            lineTo(479.3588f, 315.8597f)
            lineTo(509.9458f, 263.5738f)
            cubicTo(512.6848f, 258.8958f, 512.6848f, 253.1048f, 509.9478f, 248.4258f)
            close()
            moveTo(255.9998f, 430.9998f)
            cubicTo(159.5048f, 430.9998f, 80.9997f, 352.4948f, 80.9997f, 255.9998f)
            cubicTo(80.9997f, 159.5048f, 159.5048f, 80.9997f, 255.9998f, 80.9997f)
            cubicTo(352.4948f, 80.9997f, 430.9998f, 159.5048f, 430.9998f, 255.9998f)
            cubicTo(430.9998f, 352.4948f, 352.4948f, 430.9998f, 255.9998f, 430.9998f)
            close()

            moveTo(400.9998f, 256.0007f)
            cubicTo(400.9998f, 176.0477f, 335.9527f, 111.0007f, 255.9997f, 111.0007f)
            cubicTo(176.0467f, 111.0007f, 110.9997f, 176.0477f, 110.9997f, 256.0007f)
            cubicTo(110.9997f, 335.9537f, 176.0467f, 401.0007f, 255.9997f, 401.0007f)
            cubicTo(335.9527f, 401.0007f, 400.9998f, 335.9537f, 400.9998f, 256.0007f)
            close()
            moveTo(213.6777f, 228.3227f)
            cubicTo(203.9297f, 218.5747f, 188.0697f, 218.5747f, 178.3227f, 228.3227f)
            cubicTo(172.4647f, 234.1807f, 162.9677f, 234.1807f, 157.1097f, 228.3227f)
            cubicTo(151.2517f, 222.4647f, 151.2517f, 212.9677f, 157.1097f, 207.1097f)
            cubicTo(178.5547f, 185.6647f, 213.4467f, 185.6647f, 234.8917f, 207.1097f)
            cubicTo(240.7497f, 212.9677f, 240.7497f, 222.4647f, 234.8917f, 228.3227f)
            cubicTo(229.0327f, 234.1807f, 219.5357f, 234.1807f, 213.6777f, 228.3227f)
            close()
            moveTo(277.1088f, 207.1097f)
            cubicTo(298.5538f, 185.6647f, 333.4457f, 185.6647f, 354.8907f, 207.1097f)
            cubicTo(360.7487f, 212.9677f, 360.7487f, 222.4647f, 354.8907f, 228.3227f)
            cubicTo(349.0327f, 234.1807f, 339.5358f, 234.1807f, 333.6778f, 228.3227f)
            cubicTo(323.9298f, 218.5747f, 308.0698f, 218.5747f, 298.3228f, 228.3227f)
            cubicTo(292.4648f, 234.1807f, 282.9677f, 234.1807f, 277.1097f, 228.3227f)
            cubicTo(271.2517f, 222.4647f, 271.2518f, 212.9667f, 277.1088f, 207.1097f)
            close()
            moveTo(255.9997f, 360.9997f)
            cubicTo(225.6727f, 360.9997f, 200.9997f, 336.3267f, 200.9997f, 305.9997f)
            cubicTo(200.9997f, 297.7157f, 207.7157f, 290.9997f, 215.9997f, 290.9997f)
            cubicTo(224.2837f, 290.9997f, 230.9997f, 297.7157f, 230.9997f, 305.9997f)
            cubicTo(230.9997f, 319.7847f, 242.2147f, 330.9997f, 255.9997f, 330.9997f)
            cubicTo(269.7847f, 330.9997f, 280.9998f, 319.7847f, 280.9998f, 305.9997f)
            cubicTo(280.9998f, 297.7157f, 287.7158f, 290.9997f, 295.9998f, 290.9997f)
            cubicTo(304.2838f, 290.9997f, 310.9998f, 297.7157f, 310.9998f, 305.9997f)
            cubicTo(310.9998f, 336.3277f, 286.3267f, 361.0007f, 255.9997f, 360.9997f)
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
fun SunHappyShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(SunHappyShape)
                .background(Color.Yellow)
        )
    }
}