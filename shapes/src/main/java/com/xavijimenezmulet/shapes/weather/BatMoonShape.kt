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


val BatMoonShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512.0757f
        val baseHeight = 512f

        val path = Path().apply {
            moveTo(339.6267f, 486.4f)
            cubicTo(339.6267f, 493.44f, 334.9334f, 499.84f, 328.1067f, 501.76f)
            cubicTo(304.8534f, 508.5867f, 280.5333f, 512f, 256f, 512f)
            cubicTo(114.7733f, 512f, 0f, 397.2267f, 0f, 256f)
            cubicTo(0f, 197.76f, 18.9867f, 143.1467f, 55.04f, 97.92f)
            cubicTo(59.52f, 92.16f, 67.2f, 90.24f, 73.8133f, 93.2267f)
            cubicTo(75.0933f, 93.6533f, 76.5867f, 93.8667f, 78.5067f, 93.8667f)
            cubicTo(87.04f, 93.8667f, 93.8667f, 87.04f, 93.8667f, 78.5067f)
            cubicTo(93.8667f, 76.5867f, 93.6533f, 75.0933f, 93.2267f, 74.0267f)
            cubicTo(90.24f, 67.2f, 92.16f, 59.52f, 97.92f, 55.04f)
            cubicTo(143.1467f, 18.9867f, 197.76f, 0f, 256f, 0f)
            cubicTo(280.5333f, 0f, 304.8534f, 3.4133f, 328.1067f, 10.24f)
            cubicTo(334.9334f, 12.16f, 339.6267f, 18.56f, 339.6267f, 25.6f)
            cubicTo(339.6267f, 32.64f, 334.9334f, 39.04f, 328.1067f, 40.96f)
            cubicTo(311.8934f, 45.6533f, 296.32f, 52.2667f, 281.6f, 60.5867f)
            cubicTo(256.64f, 40.32f, 224.64f, 28.8f, 191.7867f, 28.8f)
            cubicTo(164.48f, 28.8f, 138.0267f, 36.6933f, 115.4133f, 51.2f)
            cubicTo(102.6133f, 59.3067f, 94.2933f, 73.3867f, 93.44f, 88.32f)
            cubicTo(92.3733f, 103.4667f, 98.56f, 118.4f, 110.5067f, 128.4267f)
            cubicTo(111.36f, 129.28f, 112.4267f, 130.1333f, 113.28f, 130.9867f)
            cubicTo(129.7067f, 147.4133f, 131.84f, 173.0133f, 118.4f, 191.5733f)
            cubicTo(109.8667f, 203.3067f, 107.0933f, 218.0267f, 110.72f, 231.8933f)
            cubicTo(114.3467f, 245.76f, 123.9467f, 257.28f, 136.96f, 263.2534f)
            cubicTo(142.2933f, 265.8134f, 146.7733f, 269.0133f, 150.6133f, 272.8533f)
            cubicTo(153.1733f, 275.4133f, 155.3067f, 278.1867f, 157.0133f, 281.1733f)
            cubicTo(155.0933f, 282.0267f, 153.1733f, 282.4533f, 151.2533f, 282.4533f)
            cubicTo(142.9333f, 282.6667f, 136.32f, 289.28f, 136.32f, 297.8134f)
            cubicTo(136.32f, 307.6267f, 145.0667f, 315.9467f, 156.3733f, 312.1067f)
            cubicTo(158.9333f, 311.2534f, 161.4933f, 311.2533f, 164.0533f, 311.68f)
            cubicTo(162.7733f, 321.92f, 158.2933f, 331.7333f, 150.6133f, 339.2f)
            cubicTo(141.6533f, 348.3733f, 136.7467f, 360.3201f, 136.7467f, 373.1201f)
            cubicTo(136.7467f, 386.1334f, 141.6533f, 398.08f, 150.6133f, 407.04f)
            cubicTo(159.7867f, 416.2133f, 171.7333f, 421.1201f, 184.7467f, 421.1201f)
            cubicTo(197.5467f, 421.1201f, 209.4933f, 416.2133f, 218.6667f, 407.04f)
            cubicTo(219.7333f, 405.9733f, 221.0133f, 404.9067f, 222.08f, 403.84f)
            cubicTo(249.8133f, 435.4134f, 286.2934f, 458.88f, 328.1067f, 471.04f)
            cubicTo(334.9334f, 472.96f, 339.6267f, 479.36f, 339.6267f, 486.4f)
            close()

            moveTo(479.4667f, 302.1867f)
            cubicTo(468.7787f, 291.4987f, 456.2987f, 283.2213f, 442.368f, 277.6107f)
            cubicTo(439.68f, 276.544f, 436.8213f, 276.2027f, 433.9413f, 276.6507f)
            cubicTo(417.0027f, 279.2107f, 399.04f, 278.1013f, 382.1227f, 273.344f)
            cubicTo(382.016f, 273.3227f, 381.9093f, 273.28f, 381.8027f, 273.2587f)
            lineTo(385.28f, 269.76f)
            cubicTo(391.872f, 263.2107f, 394.5173f, 253.9093f, 392.384f, 244.8853f)
            cubicTo(390.2507f, 235.84f, 383.7227f, 228.7147f, 374.9334f, 225.7707f)
            lineTo(353.9627f, 218.7733f)
            lineTo(346.9867f, 197.7813f)
            cubicTo(344.0427f, 188.992f, 336.9174f, 182.4853f, 327.9147f, 180.352f)
            cubicTo(318.9547f, 178.2613f, 309.6107f, 180.8427f, 302.9973f, 187.4133f)
            lineTo(299.4987f, 190.9333f)
            cubicTo(299.4774f, 190.8693f, 299.4347f, 190.784f, 299.4134f, 190.6987f)
            cubicTo(294.6134f, 173.696f, 293.4827f, 155.7547f, 296.1067f, 138.8373f)
            cubicTo(296.5547f, 136f, 296.2133f, 133.0773f, 295.1253f, 130.4107f)
            cubicTo(289.5147f, 116.48f, 281.2587f, 103.9787f, 270.5707f, 93.2907f)
            cubicTo(233.984f, 56.704f, 175.9573f, 50.304f, 132.5653f, 78.1653f)
            cubicTo(128.2987f, 80.896f, 125.5893f, 85.4827f, 125.248f, 90.56f)
            cubicTo(124.8853f, 95.5947f, 126.976f, 100.5227f, 130.8373f, 103.808f)
            cubicTo(132.608f, 105.3227f, 134.3787f, 106.8373f, 136.0213f, 108.4587f)
            cubicTo(163.6267f, 136.0853f, 167.0827f, 178.944f, 144.256f, 210.3893f)
            cubicTo(141.44f, 214.272f, 140.5013f, 219.2f, 141.7173f, 223.8293f)
            cubicTo(142.9333f, 228.4587f, 146.1333f, 232.2987f, 150.4853f, 234.3253f)
            cubicTo(159.0613f, 238.3147f, 166.784f, 243.648f, 173.3333f, 250.2187f)
            cubicTo(179.7333f, 256.64f, 185.0453f, 264.2347f, 189.0773f, 272.6827f)
            cubicTo(203.0293f, 302.6347f, 196.7147f, 338.496f, 173.3333f, 361.8987f)
            cubicTo(167.0827f, 368.1493f, 167.0827f, 378.2827f, 173.3333f, 384.5334f)
            cubicTo(179.584f, 390.784f, 189.7173f, 390.784f, 195.968f, 384.5334f)
            cubicTo(223.7013f, 356.8f, 266.688f, 353.472f, 298.4107f, 376.768f)
            cubicTo(301.696f, 379.072f, 304.7253f, 381.632f, 307.648f, 384.5334f)
            cubicTo(314.2187f, 391.104f, 319.5734f, 398.784f, 323.5414f, 407.4027f)
            cubicTo(325.5467f, 411.7547f, 329.3867f, 414.9547f, 334.0374f, 416.1707f)
            cubicTo(338.6454f, 417.408f, 343.5947f, 416.4694f, 347.4774f, 413.6107f)
            cubicTo(378.944f, 390.7627f, 421.8027f, 394.24f, 449.3867f, 421.824f)
            cubicTo(455.5094f, 427.9467f, 460.5014f, 434.88f, 464.2774f, 442.4107f)
            cubicTo(466.7734f, 447.4454f, 471.744f, 450.7947f, 477.3333f, 451.2214f)
            cubicTo(477.76f, 451.2427f, 478.1653f, 451.264f, 478.592f, 451.264f)
            cubicTo(483.7547f, 451.264f, 488.64f, 448.768f, 491.6267f, 444.5227f)
            cubicTo(522.944f, 400.4267f, 517.824f, 340.5653f, 479.4667f, 302.1867f)
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
fun BatMoonShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(BatMoonShape)
                .background(Color.Yellow)
        )
    }
}