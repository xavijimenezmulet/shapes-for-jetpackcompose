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


val TimeSleepShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512.003f
        val baseHeight = 448.2105f

        val path = Path().apply {
            moveTo(391.4322f, 322.9662f)
            cubicTo(320.9424f, 325.7218f, 255.2681f, 289.4981f, 220.0382f, 228.4762f)
            cubicTo(184.8074f, 167.4564f, 186.2882f, 92.4772f, 223.9038f, 32.8002f)
            cubicTo(226.8724f, 28.0907f, 226.9884f, 22.1244f, 224.2047f, 17.303f)
            cubicTo(221.4211f, 12.4815f, 216.2047f, 9.6119f, 210.6343f, 9.8148f)
            cubicTo(175.3475f, 11.1857f, 140.4476f, 21.2915f, 109.7062f, 39.0394f)
            cubicTo(58.9941f, 68.319f, 22.7194f, 115.5925f, 7.5641f, 172.1538f)
            cubicTo(-7.5911f, 228.7152f, 0.186f, 287.7933f, 29.4646f, 338.5043f)
            cubicTo(58.7421f, 389.2154f, 106.0166f, 425.4911f, 162.578f, 440.6464f)
            cubicTo(181.4647f, 445.7078f, 200.6305f, 448.2105f, 219.6733f, 448.2105f)
            cubicTo(257.6588f, 448.2105f, 295.1504f, 438.2477f, 328.9295f, 418.7459f)
            cubicTo(359.6709f, 400.998f, 385.8728f, 375.8259f, 404.7026f, 345.9514f)
            cubicTo(407.6713f, 341.242f, 407.7872f, 335.2757f, 405.0036f, 330.4543f)
            cubicTo(402.2199f, 325.6338f, 396.9885f, 322.7562f, 391.4322f, 322.9662f)
            close()

            moveTo(469.2701f, 131.6876f)
            cubicTo(469.2701f, 123.4045f, 475.9853f, 116.6893f, 484.2683f, 116.6893f)
            lineTo(512f, 116.6893f)
            cubicTo(509.1483f, 91.5033f, 499.2135f, 68.436f, 484.2323f, 49.5352f)
            lineTo(464.5886f, 69.1779f)
            cubicTo(461.6599f, 72.1066f, 457.8213f, 73.5714f, 453.9838f, 73.5714f)
            cubicTo(450.1462f, 73.5714f, 446.3067f, 72.1076f, 443.3791f, 69.1779f)
            cubicTo(437.5217f, 63.3206f, 437.5217f, 53.8247f, 443.3791f, 47.9674f)
            lineTo(463.0757f, 28.2707f)
            cubicTo(444.197f, 13.1415f, 421.1057f, 3.0686f, 395.8676f, 0.114f)
            lineTo(395.8676f, 28.2877f)
            cubicTo(395.8676f, 36.5707f, 389.1524f, 43.2859f, 380.8694f, 43.2859f)
            cubicTo(372.5864f, 43.2859f, 365.8712f, 36.5707f, 365.8712f, 28.2877f)
            lineTo(365.8712f, 0f)
            cubicTo(340.4901f, 2.7757f, 317.2428f, 12.7445f, 298.2171f, 27.8247f)
            lineTo(318.3607f, 47.9674f)
            cubicTo(324.217f, 53.8237f, 324.218f, 63.3206f, 318.3607f, 69.1779f)
            cubicTo(315.4321f, 72.1066f, 311.5935f, 73.5714f, 307.756f, 73.5714f)
            cubicTo(303.9184f, 73.5714f, 300.0789f, 72.1076f, 297.1512f, 69.1779f)
            lineTo(276.9546f, 48.9813f)
            cubicTo(261.7263f, 67.985f, 251.6195f, 91.2553f, 248.7409f, 116.6893f)
            lineTo(277.4715f, 116.6893f)
            cubicTo(285.7545f, 116.6893f, 292.4698f, 123.4045f, 292.4698f, 131.6876f)
            cubicTo(292.4698f, 139.9706f, 285.7545f, 146.6858f, 277.4715f, 146.6858f)
            lineTo(248.7409f, 146.6858f)
            cubicTo(251.6205f, 172.1188f, 261.7263f, 195.3901f, 276.9546f, 214.3939f)
            lineTo(297.1512f, 194.1973f)
            cubicTo(303.0075f, 188.3399f, 312.5044f, 188.3399f, 318.3617f, 194.1973f)
            cubicTo(324.218f, 200.0536f, 324.219f, 209.5504f, 318.3617f, 215.4078f)
            lineTo(298.2191f, 235.5504f)
            cubicTo(317.2448f, 250.6306f, 340.4931f, 260.5995f, 365.8731f, 263.3752f)
            lineTo(365.8731f, 235.0865f)
            cubicTo(365.8731f, 226.8034f, 372.5883f, 220.0882f, 380.8714f, 220.0882f)
            cubicTo(389.1544f, 220.0882f, 395.8696f, 226.8034f, 395.8696f, 235.0865f)
            lineTo(395.8696f, 263.2602f)
            cubicTo(421.1076f, 260.3055f, 444.1989f, 250.2327f, 463.0777f, 235.1035f)
            lineTo(443.3811f, 215.4068f)
            cubicTo(437.5238f, 209.5494f, 437.5238f, 200.0536f, 443.3811f, 194.1962f)
            cubicTo(449.2374f, 188.3389f, 458.7343f, 188.3389f, 464.5916f, 194.1962f)
            lineTo(484.2353f, 213.8389f)
            cubicTo(499.2165f, 194.9382f, 509.1513f, 171.8709f, 512.003f, 146.6848f)
            lineTo(484.2713f, 146.6848f)
            cubicTo(475.9852f, 146.6858f, 469.2701f, 139.9706f, 469.2701f, 131.6876f)
            close()
            moveTo(395.3677f, 131.6876f)
            cubicTo(395.3677f, 135.4541f, 393.9509f, 139.0827f, 391.3982f, 141.8514f)
            lineTo(367.9009f, 167.3484f)
            cubicTo(364.9443f, 170.556f, 360.9117f, 172.1828f, 356.8682f, 172.1828f)
            cubicTo(353.2336f, 172.1828f, 349.592f, 170.871f, 346.7084f, 168.2133f)
            cubicTo(340.6171f, 162.6f, 340.2302f, 153.1111f, 345.8435f, 147.0208f)
            lineTo(365.3712f, 125.8303f)
            lineTo(365.3712f, 83.6942f)
            cubicTo(365.3712f, 75.4112f, 372.0864f, 68.6959f, 380.3694f, 68.6959f)
            cubicTo(388.6525f, 68.6959f, 395.3677f, 75.4112f, 395.3677f, 83.6942f)
            lineTo(395.3677f, 131.6876f)
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
fun TimeSleepShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(TimeSleepShape)
                .background(Color.Yellow)
        )
    }
}