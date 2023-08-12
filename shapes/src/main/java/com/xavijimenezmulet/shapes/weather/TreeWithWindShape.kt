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


val TreeWithWindShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512f
        val baseHeight = 512f

        val path = Path().apply {
            moveTo(466.769f, 407.138f)
            cubicTo(466.769f, 398.6511f, 463.3976f, 390.5118f, 457.3964f, 384.5106f)
            cubicTo(451.3953f, 378.5094f, 443.2559f, 375.138f, 434.769f, 375.138f)
            cubicTo(426.2821f, 375.138f, 418.1427f, 378.5094f, 412.1416f, 384.5106f)
            cubicTo(406.1404f, 390.5118f, 402.769f, 398.6511f, 402.769f, 407.138f)
            lineTo(418.769f, 407.138f)
            cubicTo(418.769f, 403.9735f, 419.7074f, 400.8801f, 421.4655f, 398.2489f)
            cubicTo(423.2236f, 395.6177f, 425.7224f, 393.5669f, 428.6461f, 392.3559f)
            cubicTo(431.5697f, 391.1449f, 434.7867f, 390.8281f, 437.8904f, 391.4454f)
            cubicTo(440.9941f, 392.0628f, 443.8451f, 393.5866f, 446.0827f, 395.8243f)
            cubicTo(448.3203f, 398.0619f, 449.8442f, 400.9128f, 450.4616f, 404.0165f)
            cubicTo(451.0789f, 407.1202f, 450.7621f, 410.3373f, 449.5511f, 413.2609f)
            cubicTo(448.3401f, 416.1845f, 446.2893f, 418.6834f, 443.6581f, 420.4415f)
            cubicTo(441.0269f, 422.1996f, 437.9335f, 423.138f, 434.769f, 423.138f)
            lineTo(200f, 423.114f)
            lineTo(200f, 439.114f)
            lineTo(434.77f, 439.137f)
            cubicTo(443.2536f, 439.1272f, 451.387f, 435.7528f, 457.3859f, 429.7539f)
            cubicTo(463.3847f, 423.7551f, 466.7592f, 415.6217f, 466.769f, 407.138f)
            close()

            moveTo(432f, 248f)
            cubicTo(422.006f, 248f, 396.06f, 260.923f, 388.346f, 264.883f)
            cubicTo(387.0371f, 265.5549f, 385.9389f, 266.5747f, 385.1721f, 267.8304f)
            cubicTo(384.4053f, 269.086f, 383.9995f, 270.5287f, 383.9995f, 272f)
            cubicTo(383.9995f, 273.4713f, 384.4053f, 274.914f, 385.1721f, 276.1696f)
            cubicTo(385.9389f, 277.4253f, 387.0371f, 278.4451f, 388.346f, 279.117f)
            cubicTo(396.06f, 283.077f, 422.006f, 296f, 432f, 296f)
            cubicTo(437.841f, 296f, 446.847f, 293.866f, 454.411f, 290.69f)
            cubicTo(466.082f, 285.789f, 472f, 279.5f, 472f, 272f)
            cubicTo(472f, 264.5f, 466.082f, 258.211f, 454.411f, 253.31f)
            cubicTo(446.847f, 250.134f, 437.841f, 248f, 432f, 248f)
            close()

            moveTo(354.287f, 344.384f)
            cubicTo(346.032f, 347.038f, 318.548f, 356.248f, 311.481f, 363.314f)
            cubicTo(307.351f, 367.444f, 302.491f, 375.321f, 299.389f, 382.914f)
            cubicTo(294.602f, 394.633f, 294.864f, 403.264f, 300.167f, 408.567f)
            cubicTo(302.956f, 411.355f, 306.667f, 412.75f, 311.257f, 412.75f)
            cubicTo(315.3997f, 412.75f, 320.254f, 411.615f, 325.82f, 409.345f)
            cubicTo(333.415f, 406.245f, 341.292f, 401.383f, 345.42f, 397.253f)
            cubicTo(352.487f, 390.187f, 361.696f, 362.702f, 364.35f, 354.446f)
            cubicTo(364.8002f, 353.0454f, 364.8554f, 351.5479f, 364.5097f, 350.1179f)
            cubicTo(364.1639f, 348.688f, 363.4306f, 347.3811f, 362.3903f, 346.3409f)
            cubicTo(361.35f, 345.3007f, 360.043f, 344.5675f, 358.6131f, 344.2219f)
            cubicTo(357.1831f, 343.8763f, 355.6855f, 343.9317f, 354.285f, 344.382f)
            lineTo(354.287f, 344.384f)
            close()

            moveTo(447.431f, 208.568f)
            cubicTo(450.22f, 211.356f, 453.931f, 212.751f, 458.521f, 212.751f)
            cubicTo(462.6643f, 212.751f, 467.5187f, 211.616f, 473.084f, 209.346f)
            cubicTo(480.684f, 206.246f, 488.557f, 201.384f, 492.684f, 197.254f)
            cubicTo(499.751f, 190.188f, 508.96f, 162.703f, 511.614f, 154.447f)
            cubicTo(512.0642f, 153.0464f, 512.1194f, 151.5489f, 511.7737f, 150.1189f)
            cubicTo(511.4279f, 148.689f, 510.6946f, 147.3821f, 509.6543f, 146.3419f)
            cubicTo(508.614f, 145.3017f, 507.307f, 144.5685f, 505.8771f, 144.2229f)
            cubicTo(504.4471f, 143.8773f, 502.9495f, 143.9327f, 501.549f, 144.383f)
            cubicTo(493.294f, 147.037f, 465.81f, 156.247f, 458.743f, 163.313f)
            cubicTo(452.158f, 169.9f, 435.751f, 196.888f, 447.431f, 208.568f)
            close()

            moveTo(216f, 480f)
            lineTo(296f, 480f)
            lineTo(296f, 496f)
            lineTo(216f, 496f)
            lineTo(216f, 480f)
            close()

            moveTo(0f, 455f)
            lineTo(80f, 455f)
            lineTo(80f, 471f)
            lineTo(0f, 471f)
            lineTo(0f, 455f)
            close()

            moveTo(280f, 400f)
            lineTo(280f, 384f)
            lineTo(176f, 384f)
            lineTo(176f, 369.451f)
            cubicTo(179.6062f, 369.8742f, 183.234f, 370.0876f, 186.865f, 370.09f)
            cubicTo(212.041f, 370.09f, 237.056f, 359.917f, 260.206f, 340.074f)
            cubicTo(273.644f, 328.5161f, 285.3187f, 315.0542f, 294.859f, 300.116f)
            cubicTo(295.7774f, 298.5864f, 296.1581f, 296.7938f, 295.9406f, 295.023f)
            cubicTo(295.7232f, 293.2522f, 294.9201f, 291.6049f, 293.659f, 290.343f)
            lineTo(283.45f, 280.136f)
            cubicTo(328.416f, 274.368f, 371.573f, 231.741f, 373.657f, 229.657f)
            cubicTo(374.8446f, 228.4699f, 375.6285f, 226.9391f, 375.8978f, 225.2816f)
            cubicTo(376.167f, 223.6242f, 375.9078f, 221.924f, 375.157f, 220.422f)
            cubicTo(370.831f, 211.771f, 362.689f, 203.362f, 355.372f, 196.944f)
            cubicTo(389.783f, 189.668f, 416.035f, 173.965f, 433.572f, 150.123f)
            cubicTo(466.438f, 105.439f, 456.313f, 48.91f, 455.866f, 46.523f)
            cubicTo(455.623f, 45.2234f, 455.0616f, 44.0043f, 454.2322f, 42.9747f)
            cubicTo(453.4028f, 41.9451f, 452.3311f, 41.1371f, 451.113f, 40.623f)
            cubicTo(401.128f, 19.537f, 347.548f, 33.879f, 322.646f, 42.97f)
            cubicTo(325.833f, 18.798f, 319.961f, 6.022f, 319.159f, 4.416f)
            cubicTo(318.4934f, 3.0878f, 317.4712f, 1.9711f, 316.2067f, 1.1912f)
            cubicTo(314.9423f, 0.4112f, 313.4856f, -0.0012f, 312f, 0f)
            cubicTo(274.183f, 0f, 236.146f, 14.438f, 202f, 41.753f)
            cubicTo(192.7544f, 49.1614f, 184.0644f, 57.2377f, 176f, 65.917f)
            lineTo(176f, 32f)
            cubicTo(176f, 29.8783f, 175.1572f, 27.8434f, 173.6569f, 26.3431f)
            cubicTo(172.1566f, 24.8429f, 170.1217f, 24f, 168f, 24f)
            cubicTo(123.4818f, 24.124f, 80.8223f, 41.8638f, 49.3431f, 73.3431f)
            cubicTo(17.8638f, 104.8223f, 0.124f, 147.4818f, 0f, 192f)
            cubicTo(0f, 264.64f, 34.464f, 304.3f, 63.376f, 324.778f)
            cubicTo(80.4789f, 336.8172f, 99.6843f, 345.5486f, 120f, 350.521f)
            lineTo(120f, 384f)
            lineTo(48f, 384f)
            lineTo(48f, 400f)
            lineTo(120f, 400f)
            lineTo(120f, 512f)
            lineTo(136f, 512f)
            lineTo(136f, 296f)
            cubicTo(136f, 242.366f, 151.276f, 203.353f, 151.428f, 202.971f)
            cubicTo(151.886f, 201.8259f, 152.0731f, 200.5903f, 151.9745f, 199.3609f)
            cubicTo(151.876f, 198.1315f, 151.4946f, 196.9416f, 150.86f, 195.884f)
            lineTo(103.041f, 116.184f)
            lineTo(120f, 107f)
            lineTo(174.656f, 188.438f)
            cubicTo(174.968f, 187.971f, 206.302f, 141.414f, 252.437f, 110.657f)
            cubicTo(253.5954f, 109.885f, 254.5322f, 108.824f, 255.155f, 107.579f)
            lineTo(287.155f, 43.579f)
            lineTo(296f, 48f)
            lineTo(280f, 102f)
            lineTo(341f, 80f)
            lineTo(348.636f, 96.66f)
            cubicTo(304.351f, 109.702f, 266.894f, 128.089f, 237.308f, 151.334f)
            cubicTo(213.208f, 170.268f, 194.249f, 192.434f, 180.951f, 217.218f)
            cubicTo(158.921f, 258.272f, 159.833f, 292.574f, 160f, 296.2f)
            lineTo(160f, 512f)
            lineTo(176f, 512f)
            lineTo(176f, 400f)
            lineTo(280f, 400f)
            close()
            moveTo(269.542f, 224.813f)
            cubicTo(266.823f, 223.944f, 259.26f, 218.041f, 251.132f, 210.947f)
            cubicTo(261.821f, 209.491f, 271.383f, 208.718f, 274.132f, 209.484f)
            cubicTo(280.462f, 211.384f, 291.49f, 219.456f, 294.179f, 223.842f)
            cubicTo(289.516f, 226.025f, 275.866f, 226.708f, 269.542f, 224.813f)
            close()

            moveTo(400f, 475f)
            lineTo(512f, 475f)
            lineTo(512f, 491f)
            lineTo(400f, 491f)
            lineTo(400f, 475f)
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
fun TreeWithWindShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(TreeWithWindShape)
                .background(Color.Yellow)
        )
    }
}