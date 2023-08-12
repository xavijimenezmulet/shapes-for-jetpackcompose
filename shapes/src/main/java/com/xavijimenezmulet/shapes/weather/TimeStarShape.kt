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


val TimeStarShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 394.7587f
        val baseHeight = 418.9137f

        val path = Path().apply {
            moveTo(340.1446f, 124.3916f)
            cubicTo(338.5156f, 118.4816f, 333.4396f, 114.1667f, 327.3446f, 113.5117f)
            lineTo(233.9046f, 99.2187f)
            cubicTo(230.7046f, 99.0737f, 227.8406f, 97.1916f, 226.4376f, 94.3116f)
            lineTo(183.7706f, 8.9786f)
            cubicTo(181.3596f, 3.2876f, 175.6506f, -0.2914f, 169.4776f, 0.0186f)
            cubicTo(163.5256f, -0.0904f, 158.0766f, 3.3466f, 155.6106f, 8.7656f)
            lineTo(112.9436f, 94.0986f)
            cubicTo(111.6156f, 96.8516f, 108.9466f, 98.7126f, 105.9036f, 99.0056f)
            lineTo(11.8236f, 113.2987f)
            cubicTo(6.3976f, 114.7277f, 2.1596f, 118.9656f, 0.7306f, 124.3916f)
            cubicTo(-1.0284f, 130.0926f, 0.4416f, 136.2986f, 4.5706f, 140.6046f)
            lineTo(72.6236f, 206.9516f)
            cubicTo(74.7346f, 209.2566f, 75.6776f, 212.3986f, 75.1836f, 215.4846f)
            lineTo(59.1836f, 308.7116f)
            cubicTo(58.0276f, 314.7426f, 60.3316f, 320.9136f, 65.1566f, 324.7116f)
            cubicTo(70.5086f, 327.4826f, 76.8716f, 327.4826f, 82.2236f, 324.7116f)
            lineTo(141.3166f, 295.0586f)
            cubicTo(144.3616f, 251.3686f, 168.0546f, 211.7486f, 205.1036f, 188.3916f)
            lineTo(207.0236f, 187.3246f)
            cubicTo(210.0106f, 186.0446f, 213.2106f, 184.1247f, 217.0506f, 182.2047f)
            lineTo(220.4636f, 180.2847f)
            cubicTo(223.1786f, 178.9527f, 226.0436f, 177.9507f, 228.9966f, 177.2977f)
            lineTo(234.3296f, 175.1646f)
            lineTo(241.5826f, 172.6046f)
            lineTo(248.1956f, 170.8976f)
            lineTo(255.0226f, 169.4046f)
            cubicTo(257.2946f, 169.2276f, 259.5776f, 169.2276f, 261.8496f, 169.4046f)
            lineTo(277.2096f, 169.4046f)
            cubicTo(286.8666f, 169.3966f, 296.5056f, 170.2526f, 306.0096f, 171.9646f)
            lineTo(336.3026f, 141.4576f)
            cubicTo(340.8566f, 137.0346f, 342.3626f, 130.3386f, 340.1446f, 124.3916f)
            close()

            moveTo(307.2906f, 189.2446f)
            lineTo(306.0106f, 190.5246f)
            cubicTo(301.5966f, 189.2536f, 297.1076f, 188.2556f, 292.5706f, 187.5376f)
            cubicTo(288.4496f, 187.3016f, 284.3186f, 187.3016f, 280.1976f, 187.5376f)
            lineTo(278.9176f, 187.5376f)
            cubicTo(275.0806f, 187.3186f, 271.2346f, 187.3186f, 267.3976f, 187.5376f)
            lineTo(260.7846f, 187.5376f)
            lineTo(253.7446f, 188.8176f)
            lineTo(247.3446f, 190.7377f)
            lineTo(242.0116f, 192.4447f)
            lineTo(235.8246f, 194.7917f)
            cubicTo(233.9366f, 194.9297f, 232.1086f, 195.5146f, 230.4916f, 196.4986f)
            lineTo(225.3716f, 199.2717f)
            lineTo(218.9716f, 203.1116f)
            cubicTo(217.6486f, 203.5796f, 216.3646f, 204.1496f, 215.1316f, 204.8186f)
            cubicTo(212.7846f, 206.5256f, 210.2246f, 208.4456f, 208.0916f, 210.3656f)
            lineTo(205.5316f, 212.2856f)
            cubicTo(185.3246f, 227.6286f, 170.7706f, 249.2336f, 164.1446f, 273.7256f)
            cubicTo(162.9716f, 277.9346f, 162.0456f, 282.2086f, 161.3716f, 286.5256f)
            cubicTo(161.3716f, 290.3656f, 161.3716f, 295.2726f, 161.3716f, 299.1126f)
            cubicTo(161.3716f, 299.1126f, 161.3716f, 301.2456f, 161.3716f, 302.3126f)
            cubicTo(161.4226f, 366.7606f, 213.7096f, 418.9646f, 278.1576f, 418.9136f)
            cubicTo(342.6056f, 418.8626f, 394.8096f, 366.5756f, 394.7586f, 302.1276f)
            cubicTo(394.7156f, 248.9696f, 358.7536f, 202.5586f, 307.2906f, 189.2446f)
            close()
            moveTo(277.4246f, 393.8316f)
            lineTo(276.9976f, 393.8316f)
            cubicTo(253.7836f, 393.8956f, 231.4516f, 384.9466f, 214.7046f, 368.8716f)
            lineTo(228.1446f, 354.5786f)
            cubicTo(241.1936f, 367.4796f, 258.8626f, 374.6246f, 277.2116f, 374.4186f)
            cubicTo(316.3276f, 374.4026f, 348.0246f, 342.6786f, 348.0086f, 303.5626f)
            cubicTo(347.9926f, 264.4696f, 316.3046f, 232.7817f, 277.2116f, 232.7657f)
            cubicTo(258.2796f, 232.6877f, 240.1486f, 240.4026f, 227.0786f, 254.0986f)
            cubicTo(218.1116f, 262.8216f, 211.8206f, 273.9236f, 208.9456f, 286.0986f)
            lineTo(218.3326f, 295.9116f)
            lineTo(187.1856f, 326.6316f)
            lineTo(187.1856f, 303.5916f)
            cubicTo(187.3036f, 253.8716f, 227.7056f, 213.6607f, 277.4256f, 213.7787f)
            cubicTo(327.1456f, 213.8967f, 367.3566f, 254.2986f, 367.2386f, 304.0186f)
            cubicTo(367.1196f, 353.5726f, 326.9776f, 393.7146f, 277.4246f, 393.8316f)
            close()
            moveTo(290.4376f, 303.5916f)
            lineTo(290.2246f, 303.5916f)
            cubicTo(290.1146f, 310.8856f, 284.2896f, 316.8046f, 276.9976f, 317.0316f)
            cubicTo(271.4616f, 317.1076f, 266.5266f, 313.5576f, 264.8376f, 308.2846f)
            cubicTo(263.2046f, 311.3806f, 260.0166f, 313.3416f, 256.5176f, 313.4046f)
            lineTo(240.3046f, 313.4046f)
            cubicTo(234.9436f, 314.2016f, 229.9516f, 310.5016f, 229.1546f, 305.1406f)
            cubicTo(228.3576f, 299.7796f, 232.0576f, 294.7876f, 237.4186f, 293.9906f)
            cubicTo(238.3756f, 293.8486f, 239.3476f, 293.8486f, 240.3046f, 293.9906f)
            lineTo(256.5176f, 293.9906f)
            cubicTo(260.0166f, 294.0536f, 263.2046f, 296.0146f, 264.8376f, 299.1106f)
            cubicTo(265.1636f, 297.6316f, 265.8196f, 296.2456f, 266.7576f, 295.0576f)
            lineTo(266.7576f, 250.2576f)
            cubicTo(267.5546f, 244.8966f, 272.5466f, 241.1967f, 277.9076f, 241.9937f)
            cubicTo(282.1806f, 242.6287f, 285.5356f, 245.9836f, 286.1716f, 250.2576f)
            lineTo(286.1716f, 295.0576f)
            cubicTo(288.5576f, 297.3086f, 290.0696f, 300.3316f, 290.4376f, 303.5916f)
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
fun TimeStarShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(TimeStarShape)
                .background(Color.Yellow)
        )
    }
}