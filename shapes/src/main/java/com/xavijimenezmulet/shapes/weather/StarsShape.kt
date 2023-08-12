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

val StarsShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 452.0042f
        val baseHeight = 397.9442f

        val path = Path().apply {
            moveTo(451.0451f, 170.715f)
            cubicTo(449.9726f, 167.3597f, 447.979f, 164.3732f, 445.2916f, 162.096f)
            cubicTo(442.6041f, 159.8187f, 439.3309f, 158.3423f, 435.8451f, 157.835f)
            lineTo(326.5651f, 141.835f)
            lineTo(277.6852f, 42.955f)
            cubicTo(276.1371f, 39.7979f, 273.7348f, 37.1382f, 270.7509f, 35.2781f)
            cubicTo(267.7671f, 33.4179f, 264.3213f, 32.4318f, 260.8051f, 32.4318f)
            cubicTo(257.289f, 32.4318f, 253.8433f, 33.4179f, 250.8594f, 35.2781f)
            cubicTo(247.8756f, 37.1382f, 245.4732f, 39.7979f, 243.9252f, 42.955f)
            lineTo(195.0452f, 141.995f)
            lineTo(85.7652f, 157.995f)
            cubicTo(82.3349f, 158.5533f, 79.1242f, 160.0438f, 76.4837f, 162.3034f)
            cubicTo(73.8432f, 164.563f, 71.8746f, 167.505f, 70.793f, 170.8077f)
            cubicTo(69.7113f, 174.1105f, 69.5582f, 177.647f, 70.3505f, 181.0308f)
            cubicTo(71.1427f, 184.4147f, 72.8498f, 187.5157f, 75.2851f, 189.995f)
            lineTo(154.4052f, 267.035f)
            lineTo(135.6852f, 375.835f)
            cubicTo(135.0903f, 379.304f, 135.477f, 382.8701f, 136.8015f, 386.1309f)
            cubicTo(138.126f, 389.3918f, 140.3356f, 392.2174f, 143.1809f, 394.289f)
            cubicTo(146.0262f, 396.3606f, 149.394f, 397.5956f, 152.904f, 397.8547f)
            cubicTo(156.414f, 398.1137f, 159.9265f, 397.3865f, 163.0452f, 395.755f)
            lineTo(260.8051f, 344.315f)
            lineTo(358.5651f, 395.755f)
            cubicTo(361.6796f, 397.4016f, 365.1926f, 398.144f, 368.707f, 397.8982f)
            cubicTo(372.2214f, 397.6524f, 375.5969f, 396.4281f, 378.4518f, 394.364f)
            cubicTo(381.3067f, 392.2998f, 383.5271f, 389.478f, 384.862f, 386.2177f)
            cubicTo(386.1968f, 382.9574f, 386.5928f, 379.3886f, 386.0051f, 375.915f)
            lineTo(367.2851f, 267.115f)
            lineTo(446.4051f, 190.075f)
            cubicTo(448.9053f, 187.6006f, 450.6644f, 184.477f, 451.4843f, 181.0563f)
            cubicTo(452.3041f, 177.6356f, 452.152f, 174.0539f, 451.0451f, 170.715f)
            close()

            moveTo(348.3252f, 76.395f)
            lineTo(343.6852f, 103.755f)
            cubicTo(343.3694f, 105.5516f, 343.4514f, 107.3956f, 343.9253f, 109.1572f)
            cubicTo(344.3992f, 110.9187f, 345.2535f, 112.5549f, 346.428f, 113.9506f)
            cubicTo(347.6025f, 115.3464f, 349.0688f, 116.4676f, 350.7234f, 117.2355f)
            cubicTo(352.3781f, 118.0034f, 354.181f, 118.3991f, 356.0052f, 118.395f)
            cubicTo(358.0393f, 118.3919f, 360.0427f, 117.8979f, 361.8452f, 116.955f)
            lineTo(386.0052f, 104.075f)
            lineTo(410.5652f, 116.955f)
            cubicTo(412.6314f, 118.0571f, 414.9661f, 118.5556f, 417.3023f, 118.3935f)
            cubicTo(419.6385f, 118.2315f, 421.882f, 117.4153f, 423.7763f, 116.0384f)
            cubicTo(425.6706f, 114.6615f, 427.1392f, 112.7794f, 428.0143f, 110.6073f)
            cubicTo(428.8895f, 108.4351f, 429.1358f, 106.0605f, 428.7252f, 103.755f)
            lineTo(424.0052f, 76.395f)
            lineTo(443.8452f, 57.115f)
            cubicTo(445.5335f, 55.4949f, 446.7324f, 53.4328f, 447.305f, 51.164f)
            cubicTo(447.8775f, 48.8952f, 447.8008f, 46.5112f, 447.0834f, 44.284f)
            cubicTo(446.366f, 42.0567f, 445.0369f, 40.0761f, 443.2478f, 38.568f)
            cubicTo(441.4587f, 37.0599f, 439.2817f, 36.0851f, 436.9651f, 35.755f)
            lineTo(410.0052f, 31.755f)
            lineTo(397.6052f, 6.955f)
            cubicTo(396.5632f, 4.8656f, 394.9595f, 3.1079f, 392.9741f, 1.8794f)
            cubicTo(390.9886f, 0.6508f, 388.7f, 0f, 386.3651f, 0f)
            cubicTo(384.0303f, 0f, 381.7417f, 0.6508f, 379.7563f, 1.8794f)
            cubicTo(377.7708f, 3.1079f, 376.1671f, 4.8656f, 375.1252f, 6.955f)
            lineTo(362.8852f, 31.755f)
            lineTo(335.4452f, 35.755f)
            cubicTo(333.128f, 36.0509f, 330.9451f, 37.008f, 329.1575f, 38.5119f)
            cubicTo(327.3699f, 40.0157f, 326.0533f, 42.0026f, 325.3651f, 44.235f)
            cubicTo(324.6136f, 46.4572f, 324.5079f, 48.8469f, 325.0602f, 51.1268f)
            cubicTo(325.6124f, 53.4066f, 326.8001f, 55.4831f, 328.4852f, 57.115f)
            lineTo(348.3252f, 76.395f)
            close()

            moveTo(112.5652f, 270.955f)
            lineTo(85.1252f, 266.955f)
            lineTo(72.8852f, 242.155f)
            cubicTo(71.8581f, 240.0558f, 70.2657f, 238.2847f, 68.2871f, 237.041f)
            cubicTo(66.3085f, 235.7973f, 64.0221f, 235.1303f, 61.6852f, 235.115f)
            cubicTo(59.3441f, 235.1116f, 57.0499f, 235.7709f, 55.0679f, 237.0167f)
            cubicTo(53.0859f, 238.2626f, 51.4971f, 240.044f, 50.4852f, 242.155f)
            lineTo(38.1652f, 266.955f)
            lineTo(10.7252f, 270.955f)
            cubicTo(8.4118f, 271.2944f, 6.2403f, 272.2767f, 4.4582f, 273.7902f)
            cubicTo(2.676f, 275.3036f, 1.3548f, 277.2872f, 0.6452f, 279.515f)
            cubicTo(-0.0997f, 281.7251f, -0.2019f, 284.1012f, 0.3505f, 286.3671f)
            cubicTo(0.9028f, 288.633f, 2.0869f, 290.6955f, 3.7652f, 292.315f)
            lineTo(23.6052f, 311.675f)
            lineTo(18.9652f, 338.955f)
            cubicTo(18.6112f, 341.2178f, 18.8868f, 343.5343f, 19.7616f, 345.6509f)
            cubicTo(20.6365f, 347.7675f, 22.0769f, 349.6025f, 23.9252f, 350.955f)
            cubicTo(25.806f, 352.3543f, 28.0471f, 353.188f, 30.3853f, 353.358f)
            cubicTo(32.7235f, 353.5281f, 35.0616f, 353.0275f, 37.1252f, 351.915f)
            lineTo(61.6052f, 339.035f)
            lineTo(86.1652f, 351.915f)
            cubicTo(87.9676f, 352.8579f, 89.971f, 353.3519f, 92.0052f, 353.355f)
            cubicTo(93.8293f, 353.3592f, 95.6322f, 352.9634f, 97.2869f, 352.1955f)
            cubicTo(98.9415f, 351.4276f, 100.4078f, 350.3064f, 101.5823f, 348.9106f)
            cubicTo(102.7568f, 347.5149f, 103.6111f, 345.8787f, 104.085f, 344.1172f)
            cubicTo(104.5589f, 342.3557f, 104.6409f, 340.5117f, 104.3252f, 338.715f)
            lineTo(99.6852f, 311.435f)
            lineTo(119.5252f, 292.075f)
            cubicTo(121.1168f, 290.4292f, 122.2284f, 288.3796f, 122.7396f, 286.1478f)
            cubicTo(123.2508f, 283.916f, 123.1422f, 281.5869f, 122.4256f, 279.4124f)
            cubicTo(121.709f, 277.2378f, 120.4116f, 275.3005f, 118.6737f, 273.8099f)
            cubicTo(116.9358f, 272.3193f, 114.8235f, 271.3321f, 112.5652f, 270.955f)
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
fun StarsShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(StarsShape)
                .background(Color.Yellow)
        )
    }
}