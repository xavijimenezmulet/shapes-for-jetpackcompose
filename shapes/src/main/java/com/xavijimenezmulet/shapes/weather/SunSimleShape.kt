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


val SunSmileShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512f
        val baseHeight = 512f

        val path = Path().apply {
            moveTo(375.786f, 199.313f)
            cubicTo(374.512f, 224.123f, 357.563f, 248.267f, 333.24f, 255.182f)
            cubicTo(345.317f, 273.634f, 364.78f, 286.186f, 386.92f, 289.419f)
            cubicTo(389.651f, 278.727f, 391.106f, 267.53f, 391.106f, 256f)
            cubicTo(391.106f, 233.694f, 385.668f, 212.636f, 376.055f, 194.074f)
            lineTo(375.786f, 199.313f)
            close()

            moveTo(256f, 327.429f)
            cubicTo(283.658f, 327.429f, 308.756f, 312.506f, 322.063f, 288.78f)
            cubicTo(312.152f, 278.871f, 304.115f, 266.946f, 298.597f, 253.486f)
            cubicTo(298.418f, 253.417f, 298.237f, 253.356f, 298.058f, 253.284f)
            cubicTo(293.404f, 269.171f, 283.412f, 283.219f, 269.441f, 292.847f)
            lineTo(256f, 302.111f)
            lineTo(242.559f, 292.847f)
            cubicTo(228.587f, 283.219f, 218.596f, 269.17f, 213.942f, 253.284f)
            cubicTo(213.764f, 253.355f, 213.582f, 253.416f, 213.404f, 253.486f)
            cubicTo(207.887f, 266.946f, 199.85f, 278.871f, 189.939f, 288.78f)
            cubicTo(203.243f, 312.505f, 228.341f, 327.429f, 256f, 327.429f)
            close()

            moveTo(345.021f, 203.634f)
            cubicTo(337.948f, 197.572f, 328.633f, 195.662f, 320.035f, 198.824f)
            cubicTo(310.972f, 202.157f, 304.103f, 210.691f, 301.786f, 220.967f)
            cubicTo(308.858f, 227.029f, 318.175f, 228.938f, 326.772f, 225.776f)
            cubicTo(335.835f, 222.443f, 342.703f, 213.909f, 345.021f, 203.634f)
            close()

            moveTo(191.966f, 198.824f)
            cubicTo(183.368f, 195.662f, 174.051f, 197.573f, 166.98f, 203.633f)
            cubicTo(169.297f, 213.909f, 176.166f, 222.443f, 185.229f, 225.776f)
            cubicTo(193.827f, 228.937f, 203.144f, 227.028f, 210.215f, 220.967f)
            cubicTo(207.897f, 210.691f, 201.029f, 202.158f, 191.966f, 198.824f)
            close()

            moveTo(346.21f, 306.906f)
            cubicTo(327.191f, 338.029f, 293.26f, 357.429f, 256f, 357.429f)
            cubicTo(218.74f, 357.429f, 184.809f, 338.028f, 165.79f, 306.906f)
            cubicTo(156.544f, 311.996f, 146.508f, 315.746f, 135.959f, 317.952f)
            cubicTo(158.457f, 361.369f, 203.819f, 391.107f, 256.001f, 391.107f)
            cubicTo(308.183f, 391.107f, 353.545f, 361.368f, 376.043f, 317.952f)
            cubicTo(365.492f, 315.745f, 355.457f, 311.995f, 346.21f, 306.906f)
            close()

            moveTo(415.51f, 298.696f)
            lineTo(512f, 256f)
            lineTo(415.49f, 213.232f)
            lineTo(477.703f, 128f)
            lineTo(372.715f, 139.328f)
            lineTo(384f, 34.297f)
            lineTo(298.744f, 96.503f)
            lineTo(256f, 0f)
            lineTo(213.259f, 96.502f)
            lineTo(128f, 34.297f)
            lineTo(138.914f, 139.701f)
            lineTo(34.297f, 128f)
            lineTo(96.476f, 213.357f)
            lineTo(0f, 256f)
            lineTo(96.511f, 298.776f)
            lineTo(34.297f, 384f)
            lineTo(139.306f, 372.693f)
            lineTo(128f, 477.702f)
            lineTo(213.193f, 415.479f)
            lineTo(256f, 512f)
            lineTo(298.633f, 415.527f)
            lineTo(384f, 477.702f)
            lineTo(372.704f, 372.682f)
            lineTo(477.703f, 384f)
            lineTo(415.51f, 298.696f)
            close()
            moveTo(256f, 421.106f)
            cubicTo(164.96f, 421.106f, 90.894f, 347.04f, 90.894f, 256f)
            cubicTo(90.894f, 164.96f, 164.96f, 90.894f, 256f, 90.894f)
            cubicTo(347.04f, 90.894f, 421.106f, 164.96f, 421.106f, 256f)
            cubicTo(421.106f, 347.04f, 347.04f, 421.106f, 256f, 421.106f)
            close()

            moveTo(178.759f, 255.182f)
            cubicTo(151.589f, 247.459f, 136.359f, 220.997f, 135.945f, 194.074f)
            cubicTo(126.332f, 212.636f, 120.894f, 233.694f, 120.894f, 256f)
            cubicTo(120.894f, 267.531f, 122.349f, 278.727f, 125.08f, 289.419f)
            cubicTo(147.219f, 286.186f, 166.682f, 273.635f, 178.759f, 255.182f)
            close()

            moveTo(139.396f, 189.282f)
            cubicTo(154.609f, 169.901f, 179.899f, 162.421f, 202.322f, 170.668f)
            cubicTo(224.522f, 178.833f, 239.697f, 200.272f, 240.981f, 225.287f)
            lineTo(241.001f, 232.772f)
            cubicTo(241.001f, 245.386f, 246.537f, 257.277f, 256.001f, 265.388f)
            cubicTo(265.466f, 257.277f, 271.001f, 245.386f, 271.001f, 232.772f)
            lineTo(271.021f, 225.287f)
            cubicTo(272.305f, 200.272f, 287.48f, 178.833f, 309.68f, 170.668f)
            cubicTo(332.101f, 162.421f, 357.392f, 169.902f, 372.606f, 189.282f)
            lineTo(375.416f, 192.861f)
            cubicTo(352.711f, 150.092f, 307.706f, 120.893f, 256.002f, 120.893f)
            cubicTo(204.298f, 120.893f, 159.293f, 150.092f, 136.588f, 192.861f)
            lineTo(139.396f, 189.282f)
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
fun SunSmileShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(SunSmileShape)
                .background(Color.Yellow)
        )
    }
}