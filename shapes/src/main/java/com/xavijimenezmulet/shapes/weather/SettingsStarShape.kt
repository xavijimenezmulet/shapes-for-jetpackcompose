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


val SettingsStarShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512.0018f
        val baseHeight = 512.002f

        val path = Path().apply {
            moveTo(281.5377f, 311.698f)
            lineTo(311.7137f, 281.531f)
            cubicTo(318.6717f, 274.552f, 328.4637f, 271.104f, 338.2647f, 272.396f)
            cubicTo(341.9627f, 272.875f, 345.7227f, 271.354f, 348.0557f, 268.375f)
            cubicTo(352.8157f, 262.26f, 359.8257f, 258.115f, 367.7847f, 256.698f)
            cubicTo(369.5967f, 256.375f, 371.2947f, 255.594f, 372.7117f, 254.427f)
            lineTo(461.9797f, 180.708f)
            cubicTo(468.4797f, 175.312f, 470.9587f, 166.687f, 468.3127f, 158.77f)
            cubicTo(465.7087f, 150.791f, 458.5837f, 145.301f, 450.1887f, 144.801f)
            lineTo(306.8807f, 135.926f)
            lineTo(253.4137f, 12.302f)
            cubicTo(250.1947f, 4.823f, 242.8407f, 0f, 234.6747f, 0f)
            cubicTo(226.5087f, 0f, 219.1547f, 4.823f, 215.9357f, 12.292f)
            lineTo(162.4687f, 135.927f)
            lineTo(19.1707f, 144.802f)
            cubicTo(10.7647f, 145.302f, 3.6397f, 150.792f, 1.0567f, 158.708f)
            cubicTo(-1.6103f, 166.687f, 0.8687f, 175.312f, 7.3897f, 180.729f)
            lineTo(114.8767f, 269.489f)
            lineTo(88.0637f, 402.354f)
            cubicTo(86.4597f, 410.323f, 89.7617f, 418.458f, 96.4077f, 423.021f)
            cubicTo(99.8247f, 425.406f, 103.8657f, 426.667f, 108.0737f, 426.667f)
            cubicTo(111.8657f, 426.667f, 115.5627f, 425.625f, 118.7297f, 423.667f)
            lineTo(234.6427f, 352.979f)
            lineTo(246.3087f, 360.167f)
            cubicTo(251.2877f, 363.24f, 257.8817f, 361.677f, 260.9857f, 356.688f)
            cubicTo(263.2777f, 352.959f, 265.6937f, 350.136f, 268.3707f, 348.063f)
            cubicTo(271.3497f, 345.75f, 272.8807f, 342.042f, 272.4127f, 338.303f)
            cubicTo(271.1737f, 328.427f, 274.4957f, 318.729f, 281.5377f, 311.698f)
            close()

            moveTo(503.9267f, 362.99f)
            lineTo(483.4887f, 357.875f)
            lineTo(494.3217f, 339.812f)
            cubicTo(496.8427f, 335.614f, 496.1757f, 330.239f, 492.7177f, 326.781f)
            lineTo(462.5507f, 296.614f)
            cubicTo(459.0717f, 293.145f, 453.7067f, 292.489f, 449.5197f, 295.01f)
            lineTo(431.4567f, 305.843f)
            lineTo(426.3417f, 285.405f)
            cubicTo(425.1537f, 280.665f, 420.8937f, 277.332f, 415.9977f, 277.332f)
            lineTo(373.3307f, 277.332f)
            cubicTo(368.4347f, 277.332f, 364.1747f, 280.665f, 362.9867f, 285.405f)
            lineTo(357.8717f, 305.843f)
            lineTo(339.8087f, 295.01f)
            cubicTo(335.6007f, 292.51f, 330.2257f, 293.166f, 326.7777f, 296.614f)
            lineTo(296.6107f, 326.781f)
            cubicTo(293.1527f, 330.239f, 292.4857f, 335.614f, 295.0067f, 339.812f)
            lineTo(305.8397f, 357.875f)
            lineTo(285.4017f, 362.99f)
            cubicTo(280.6617f, 364.178f, 277.3287f, 368.438f, 277.3287f, 373.334f)
            lineTo(277.3287f, 416f)
            cubicTo(277.3287f, 420.896f, 280.6617f, 425.156f, 285.4017f, 426.344f)
            lineTo(305.8397f, 431.459f)
            lineTo(295.0067f, 449.522f)
            cubicTo(292.4857f, 453.72f, 293.1527f, 459.095f, 296.6107f, 462.553f)
            lineTo(326.7777f, 492.72f)
            cubicTo(330.2257f, 496.178f, 335.5907f, 496.814f, 339.8087f, 494.324f)
            lineTo(357.8717f, 483.491f)
            lineTo(362.9867f, 503.929f)
            cubicTo(364.1747f, 508.669f, 368.4347f, 512.002f, 373.3307f, 512.002f)
            lineTo(415.9997f, 512.002f)
            cubicTo(420.8957f, 512.002f, 425.1557f, 508.669f, 426.3437f, 503.929f)
            lineTo(431.4587f, 483.491f)
            lineTo(449.5217f, 494.324f)
            cubicTo(453.7197f, 496.824f, 459.0947f, 496.178f, 462.5527f, 492.72f)
            lineTo(492.7197f, 462.553f)
            cubicTo(496.1777f, 459.095f, 496.8447f, 453.72f, 494.3237f, 449.522f)
            lineTo(483.4907f, 431.459f)
            lineTo(503.9287f, 426.344f)
            cubicTo(508.6687f, 425.156f, 512.0018f, 420.896f, 512.0018f, 416f)
            lineTo(512.0018f, 373.333f)
            cubicTo(511.9998f, 368.438f, 508.6667f, 364.177f, 503.9267f, 362.99f)
            close()
            moveTo(394.6667f, 437.333f)
            cubicTo(371.1417f, 437.333f, 351.9997f, 418.191f, 351.9997f, 394.666f)
            cubicTo(351.9997f, 371.141f, 371.1417f, 352f, 394.6667f, 352f)
            cubicTo(418.1917f, 352f, 437.3337f, 371.142f, 437.3337f, 394.667f)
            cubicTo(437.3337f, 418.192f, 418.1917f, 437.333f, 394.6667f, 437.333f)
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
fun SettingsStarShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(SettingsStarShape)
                .background(Color.Yellow)
        )
    }
}