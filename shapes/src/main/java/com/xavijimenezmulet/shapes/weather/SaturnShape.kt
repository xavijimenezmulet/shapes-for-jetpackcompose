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


val SaturnShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512.0397f
        val baseHeight = 341.3333f

        val path = Path().apply {
            moveTo(423.8436f, 135.7013f)
            cubicTo(407.5663f, 58.304f, 338.489f, 0f, 255.9716f, 0f)
            cubicTo(202.9796f, 0f, 154.1903f, 24.576f, 122.3823f, 64.256f)
            cubicTo(51.5983f, 63.104f, 10.7663f, 77.76f, 1.6996f, 108.2027f)
            cubicTo(-0.7111f, 116.2027f, -1.7564f, 128.9387f, 6.9689f, 144.128f)
            cubicTo(19.9823f, 166.8053f, 50.7876f, 187.8827f, 88.5903f, 206.0587f)
            cubicTo(104.9956f, 283.968f, 174.8196f, 341.3333f, 256.0143f, 341.3333f)
            cubicTo(308.6649f, 341.3333f, 356.7716f, 317.9733f, 389.2623f, 277.3333f)
            cubicTo(392.0996f, 277.3973f, 395.001f, 277.5254f, 397.817f, 277.5254f)
            cubicTo(453.7956f, 277.5254f, 500.4943f, 266.368f, 510.2436f, 233.1947f)
            cubicTo(519.993f, 201.2373f, 489.8916f, 167.616f, 423.8436f, 135.7013f)
            close()
            moveTo(252.1956f, 294.1867f)
            lineTo(255.8223f, 298.6667f)
            cubicTo(206.3503f, 298.5814f, 162.745f, 270.1013f, 141.433f, 228.2027f)
            cubicTo(171.705f, 239.296f, 203.1929f, 248.5973f, 232.0143f, 255.5307f)
            cubicTo(233.1663f, 255.808f, 234.4676f, 256.0853f, 235.641f, 256.3627f)
            cubicTo(237.7316f, 270.208f, 243.385f, 283.3067f, 252.1956f, 294.1867f)
            close()
            moveTo(241.977f, 214.016f)
            cubicTo(190.3076f, 201.5787f, 149.4756f, 187.0507f, 118.5423f, 173.0773f)
            cubicTo(116.7076f, 171.9467f, 114.8516f, 170.88f, 112.7396f, 170.3467f)
            cubicTo(65.6783f, 148.3307f, 43.2783f, 128.2133f, 42.4249f, 120.768f)
            cubicTo(44.1103f, 117.9307f, 58.4889f, 109.4187f, 97.5076f, 107.2853f)
            cubicTo(96.7823f, 109.1413f, 95.7583f, 110.8267f, 95.0756f, 112.7253f)
            cubicTo(91.1076f, 123.8187f, 96.8889f, 136.0213f, 108.0036f, 139.9893f)
            cubicTo(119.0543f, 143.936f, 131.2996f, 138.176f, 135.2676f, 127.0613f)
            cubicTo(144.8463f, 100.1813f, 163.2356f, 78.2507f, 186.361f, 63.3813f)
            cubicTo(189.881f, 69.696f, 191.9716f, 76.736f, 191.9716f, 84.0533f)
            lineTo(191.9716f, 96.64f)
            cubicTo(191.9716f, 109.0133f, 183.5449f, 119.488f, 171.4703f, 122.0907f)
            cubicTo(159.9503f, 124.5867f, 152.6329f, 135.936f, 155.1076f, 147.4347f)
            cubicTo(157.2836f, 157.44f, 166.1156f, 164.2667f, 175.9503f, 164.2667f)
            cubicTo(177.4436f, 164.2667f, 178.9583f, 164.1173f, 180.473f, 163.7973f)
            cubicTo(211.8543f, 157.0133f, 234.6383f, 128.768f, 234.6383f, 96.64f)
            lineTo(234.6383f, 84.0533f)
            cubicTo(234.6383f, 70.9333f, 231.3743f, 58.24f, 225.7209f, 46.6347f)
            cubicTo(235.5129f, 44.2667f, 245.5823f, 42.6667f, 255.9716f, 42.6667f)
            cubicTo(263.3956f, 42.6667f, 270.6063f, 43.4347f, 277.689f, 44.6293f)
            cubicTo(277.433f, 63.5733f, 281.977f, 82.5173f, 291.9396f, 99.072f)
            cubicTo(302.7556f, 117.184f, 321.7636f, 128f, 342.7983f, 128f)
            cubicTo(345.2516f, 128f, 347.449f, 127.7867f, 350.3076f, 127.4667f)
            lineTo(375.9503f, 124.3093f)
            cubicTo(381.049f, 137.2587f, 384.0143f, 151.2107f, 384.5903f, 165.8027f)
            cubicTo(369.5716f, 164.8213f, 354.7449f, 171.6693f, 346.6169f, 184.32f)
            cubicTo(340.2596f, 194.2187f, 342.5849f, 207.744f, 352.4836f, 214.1013f)
            cubicTo(362.4036f, 220.48f, 375.0543f, 217.92f, 381.4116f, 208f)
            lineTo(392.9316f, 214.8267f)
            cubicTo(396.3449f, 216.8533f, 400.0783f, 217.8133f, 403.7903f, 217.8133f)
            cubicTo(411.0863f, 217.8133f, 418.1903f, 214.08f, 422.1583f, 207.36f)
            cubicTo(425.209f, 202.2187f, 425.8063f, 196.3307f, 424.3769f, 190.976f)
            cubicTo(425.3156f, 189.1627f, 425.8703f, 187.1147f, 426.2756f, 185.024f)
            cubicTo(459.9609f, 204.224f, 469.0489f, 218.112f, 469.4969f, 220.6293f)
            cubicTo(460.9209f, 234.9227f, 372.857f, 245.5253f, 241.977f, 214.016f)
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
fun SaturnShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(SaturnShape)
                .background(Color.Yellow)
        )
    }
}