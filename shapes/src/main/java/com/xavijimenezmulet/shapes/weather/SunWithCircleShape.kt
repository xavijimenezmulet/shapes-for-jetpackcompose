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

val SunWithCircleShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512f
        val baseHeight = 511.9992f

        val path = Path().apply {
            moveTo(500.633f, 241.4532f)
            cubicTo(483.743f, 237.2202f, 467.509f, 228.8113f, 455.116f, 216.9173f)
            cubicTo(462.045f, 200.2763f, 472.621f, 186.6093f, 486.654f, 176.2093f)
            cubicTo(492.191f, 172.1073f, 494.227f, 164.7693f, 491.591f, 158.4113f)
            cubicTo(488.969f, 152.0543f, 482.436f, 148.4353f, 475.522f, 149.3143f)
            cubicTo(458.12f, 151.9653f, 440.629f, 149.9002f, 424.443f, 143.4402f)
            cubicTo(424.692f, 126.0522f, 429.497f, 109.1193f, 438.564f, 94.0163f)
            cubicTo(442.109f, 88.1133f, 441.171f, 80.5543f, 436.308f, 75.6913f)
            cubicTo(431.43f, 70.7843f, 423.871f, 69.9052f, 417.983f, 73.4352f)
            cubicTo(402.88f, 82.5022f, 385.947f, 87.3073f, 368.559f, 87.5563f)
            cubicTo(362.128f, 71.3993f, 360.092f, 53.9092f, 362.685f, 36.4772f)
            cubicTo(363.696f, 29.6652f, 359.946f, 23.0443f, 353.588f, 20.4083f)
            cubicTo(347.26f, 17.7273f, 339.892f, 19.7933f, 335.79f, 25.3453f)
            cubicTo(325.39f, 39.3783f, 311.723f, 49.9542f, 295.082f, 56.8832f)
            cubicTo(283.187f, 44.4902f, 274.779f, 26.9082f, 270.546f, 10.0192f)
            cubicTo(267.235f, -3.3398f, 244.765f, -3.3398f, 241.454f, 10.0192f)
            cubicTo(237.221f, 26.9092f, 228.812f, 44.4912f, 216.918f, 56.8832f)
            cubicTo(200.277f, 49.9542f, 186.61f, 39.3783f, 176.21f, 25.3453f)
            cubicTo(172.094f, 19.7933f, 164.74f, 17.7283f, 158.412f, 20.4083f)
            cubicTo(152.055f, 23.0453f, 148.305f, 29.6662f, 149.315f, 36.4772f)
            cubicTo(151.908f, 53.9092f, 149.872f, 71.3993f, 143.441f, 87.5563f)
            cubicTo(126.053f, 87.3073f, 109.12f, 82.5022f, 94.017f, 73.4352f)
            cubicTo(88.099f, 69.9192f, 80.54f, 70.8283f, 75.692f, 75.6913f)
            cubicTo(70.829f, 80.5543f, 69.891f, 88.1133f, 73.436f, 94.0163f)
            cubicTo(82.503f, 109.1193f, 87.308f, 126.0522f, 87.557f, 143.4402f)
            cubicTo(71.4f, 149.8852f, 53.866f, 151.9213f, 36.478f, 149.3143f)
            cubicTo(29.71f, 148.4353f, 23.031f, 152.0533f, 20.409f, 158.4113f)
            cubicTo(17.772f, 164.7683f, 19.808f, 172.1073f, 25.346f, 176.2093f)
            cubicTo(39.379f, 186.6093f, 49.955f, 200.2763f, 56.884f, 216.9173f)
            cubicTo(44.491f, 228.8123f, 28.257f, 237.2202f, 11.367f, 241.4532f)
            cubicTo(4.688f, 243.1082f, 0f, 249.1143f, 0f, 255.9993f)
            cubicTo(0f, 262.8843f, 4.688f, 268.8902f, 11.367f, 270.5452f)
            cubicTo(28.257f, 274.7782f, 44.491f, 283.1872f, 56.884f, 295.0812f)
            cubicTo(49.955f, 311.7222f, 39.379f, 325.3892f, 25.346f, 335.7892f)
            cubicTo(19.809f, 339.8912f, 17.773f, 347.2292f, 20.409f, 353.5872f)
            cubicTo(23.031f, 359.9592f, 29.711f, 363.6502f, 36.478f, 362.6842f)
            cubicTo(53.968f, 360.0912f, 71.4f, 362.1272f, 87.557f, 368.5582f)
            cubicTo(87.308f, 385.9462f, 82.503f, 402.8792f, 73.436f, 417.9822f)
            cubicTo(69.891f, 423.8852f, 70.829f, 431.4443f, 75.692f, 436.3073f)
            cubicTo(80.541f, 441.1853f, 88.085f, 442.0642f, 94.017f, 438.5632f)
            cubicTo(109.12f, 429.4962f, 126.053f, 424.6912f, 143.441f, 424.4422f)
            cubicTo(149.872f, 440.5992f, 151.908f, 458.0892f, 149.315f, 475.5212f)
            cubicTo(148.304f, 482.3332f, 152.054f, 488.9542f, 158.412f, 491.5902f)
            cubicTo(164.74f, 494.2122f, 172.094f, 492.1912f, 176.21f, 486.6532f)
            cubicTo(186.61f, 472.6202f, 200.277f, 462.0442f, 216.918f, 455.1152f)
            cubicTo(228.813f, 467.5082f, 237.221f, 483.7422f, 241.454f, 500.6322f)
            cubicTo(243.109f, 507.3112f, 249.115f, 511.9992f, 256f, 511.9992f)
            cubicTo(262.885f, 511.9992f, 268.891f, 507.3112f, 270.546f, 500.6322f)
            cubicTo(274.779f, 483.7422f, 283.188f, 467.5082f, 295.082f, 455.1152f)
            cubicTo(311.723f, 462.0442f, 325.39f, 472.6202f, 335.79f, 486.6532f)
            cubicTo(339.892f, 492.1902f, 347.26f, 494.2122f, 353.588f, 491.5902f)
            cubicTo(359.945f, 488.9532f, 363.695f, 482.3322f, 362.685f, 475.5212f)
            cubicTo(360.092f, 458.0892f, 362.128f, 440.5992f, 368.559f, 424.4422f)
            cubicTo(385.947f, 424.6912f, 402.88f, 429.4962f, 417.983f, 438.5632f)
            cubicTo(423.901f, 442.0932f, 431.46f, 441.2143f, 436.308f, 436.3073f)
            cubicTo(441.171f, 431.4443f, 442.109f, 423.8852f, 438.564f, 417.9822f)
            cubicTo(429.497f, 402.8792f, 424.692f, 385.9463f, 424.443f, 368.5443f)
            cubicTo(440.586f, 362.1133f, 458.105f, 360.0632f, 475.522f, 362.6852f)
            cubicTo(482.436f, 363.6522f, 488.969f, 359.9602f, 491.591f, 353.5882f)
            cubicTo(494.228f, 347.2312f, 492.192f, 339.8922f, 486.654f, 335.7902f)
            cubicTo(472.621f, 325.3902f, 462.045f, 311.7232f, 455.116f, 295.0822f)
            cubicTo(467.509f, 283.1872f, 483.743f, 274.7792f, 500.633f, 270.5462f)
            cubicTo(507.312f, 268.8902f, 512f, 262.8843f, 512f, 255.9993f)
            cubicTo(512f, 249.1143f, 507.312f, 243.1082f, 500.633f, 241.4532f)
            close()
            moveTo(256f, 390.9992f)
            cubicTo(181.557f, 390.9992f, 121f, 330.4423f, 121f, 255.9993f)
            cubicTo(121f, 181.5563f, 181.557f, 120.9993f, 256f, 120.9993f)
            cubicTo(330.443f, 120.9993f, 391f, 181.5563f, 391f, 255.9993f)
            cubicTo(391f, 330.4423f, 330.443f, 390.9992f, 256f, 390.9992f)
            close()

            moveTo(256f, 360.9993f)
            cubicTo(313.9899f, 360.9993f, 361f, 313.9892f, 361f, 255.9993f)
            cubicTo(361f, 198.0094f, 313.9899f, 150.9993f, 256f, 150.9993f)
            cubicTo(198.0101f, 150.9993f, 151f, 198.0094f, 151f, 255.9993f)
            cubicTo(151f, 313.9892f, 198.0101f, 360.9993f, 256f, 360.9993f)
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
fun SunWithCircleShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(SunWithCircleShape)
                .background(Color.Yellow)
        )
    }
}