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
 *   @since 20/7/23
 *   @email xavijimenezmulet@macaqueconsulting.com
 */


val MoonShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 312.8119f
        val baseHeight = 311.5066f

        val path = Path().apply {
            moveTo(305.2f, 177.5066f)
            cubicTo(302f, 176.7066f, 298.8f, 177.5066f, 296f, 179.5066f)
            cubicTo(285.6f, 188.3066f, 273.6f, 195.5066f, 260.4f, 200.3066f)
            cubicTo(248f, 205.1066f, 234.4f, 207.5066f, 220f, 207.5066f)
            cubicTo(187.6f, 207.5066f, 158f, 194.3066f, 136.8f, 173.1066f)
            cubicTo(115.6f, 151.9066f, 102.4f, 122.3066f, 102.4f, 89.9066f)
            cubicTo(102.4f, 76.3066f, 104.8f, 63.1066f, 108.8f, 51.1066f)
            cubicTo(113.2f, 38.3066f, 119.6f, 26.7066f, 128f, 16.7066f)
            cubicTo(131.6f, 12.3066f, 130.8f, 5.9066f, 126.4f, 2.3066f)
            cubicTo(123.6f, 0.3066f, 120.4f, -0.4934f, 117.2f, 0.3066f)
            cubicTo(83.2f, 9.5066f, 53.6f, 29.9066f, 32.4f, 57.1066f)
            cubicTo(12f, 83.9066f, 0f, 117.1066f, 0f, 153.1066f)
            cubicTo(0f, 196.7066f, 17.6f, 236.3066f, 46.4f, 265.1066f)
            cubicTo(75.2f, 293.9066f, 114.4f, 311.5066f, 158.4f, 311.5066f)
            cubicTo(195.2f, 311.5066f, 229.2f, 298.7066f, 256.4f, 277.5066f)
            cubicTo(284f, 255.9066f, 304f, 225.1066f, 312.4f, 189.9066f)
            cubicTo(314f, 184.3066f, 310.8f, 178.7066f, 305.2f, 177.5066f)
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
fun MoonPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(MoonShape)
                .background(Color.Yellow)
        )
    }
}