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


val MoonWithStarShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 511.2165f
        val baseHeight = 511.999f

        val path = Path().apply {
            moveTo(328.9865f, 216.158f)
            lineTo(398.6455f, 181.705f)
            lineTo(468.5315f, 215.7f)
            lineTo(457.2885f, 138.802f)
            lineTo(511.2165f, 82.842f)
            lineTo(434.6085f, 69.771f)
            lineTo(398.0525f, 1.191f)
            lineTo(361.9475f, 70.01f)
            lineTo(285.4285f, 83.585f)
            lineTo(339.7215f, 139.189f)
            lineTo(328.9865f, 216.158f)
            close()

            moveTo(345.7815f, 361.537f)
            cubicTo(237.4235f, 361.537f, 149.5825f, 273.696f, 149.5825f, 165.338f)
            cubicTo(149.5825f, 95.888f, 185.6675f, 34.867f, 240.1105f, 0f)
            lineTo(205.5375f, 6.798f)
            cubicTo(85.1925f, 30.461f, -1.2425f, 136.78f, 0.0135f, 259.599f)
            cubicTo(0.7105f, 327.71f, 27.8905f, 391.474f, 76.5455f, 439.144f)
            cubicTo(124.5625f, 486.188f, 187.8205f, 511.999f, 254.9375f, 511.999f)
            cubicTo(255.8295f, 511.999f, 256.7255f, 511.995f, 257.6195f, 511.985f)
            cubicTo(318.0555f, 511.367f, 376.4445f, 489.243f, 422.0325f, 449.689f)
            cubicTo(467.0915f, 410.593f, 497.1565f, 356.806f, 506.6895f, 298.237f)
            lineTo(511.1205f, 271.009f)
            cubicTo(476.2525f, 325.452f, 415.2315f, 361.537f, 345.7815f, 361.537f)
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
fun MoonWithStarShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(MoonWithStarShape)
                .background(Color.Yellow)
        )
    }
}