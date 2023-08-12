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


val SearchStarShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 511.9986f
        val baseHeight = 512.0002f

        val path = Path().apply {
            moveTo(293.281f, 151.895f)
            lineTo(237.833f, 145.749f)
            lineTo(219.563f, 97.04f)
            cubicTo(216.928f, 90.04f, 210.146f, 85.332f, 202.667f, 85.332f)
            cubicTo(195.188f, 85.332f, 188.407f, 90.04f, 185.771f, 97.04f)
            lineTo(167.5f, 145.749f)
            lineTo(112.021f, 151.905f)
            cubicTo(104.917f, 152.718f, 98.938f, 157.655f, 96.792f, 164.53f)
            cubicTo(94.677f, 171.426f, 96.855f, 178.895f, 102.313f, 183.551f)
            lineTo(145.782f, 220.811f)
            lineTo(133.355f, 276.686f)
            cubicTo(131.74f, 283.915f, 134.803f, 291.53f, 141.022f, 295.676f)
            cubicTo(147.189f, 299.749f, 155.522f, 299.572f, 161.47f, 295.301f)
            lineTo(202.668f, 265.874f)
            lineTo(243.856f, 295.301f)
            cubicTo(246.939f, 297.499f, 250.575f, 298.666f, 254.366f, 298.666f)
            cubicTo(257.908f, 298.666f, 261.345f, 297.635f, 264.366f, 295.645f)
            cubicTo(270.533f, 291.53f, 273.595f, 283.916f, 271.991f, 276.697f)
            lineTo(259.553f, 220.812f)
            lineTo(303f, 183.572f)
            cubicTo(308.479f, 178.895f, 310.656f, 171.426f, 308.521f, 164.489f)
            cubicTo(306.396f, 157.655f, 300.417f, 152.717f, 293.281f, 151.895f)
            close()

            moveTo(508.874f, 478.707f)
            lineTo(360.142f, 329.975f)
            cubicTo(388.352f, 295.149f, 405.333f, 250.873f, 405.333f, 202.666f)
            cubicTo(405.333f, 90.917f, 314.417f, 0f, 202.667f, 0f)
            cubicTo(90.917f, 0f, 0f, 90.917f, 0f, 202.667f)
            cubicTo(0f, 314.417f, 90.917f, 405.334f, 202.667f, 405.334f)
            cubicTo(250.873f, 405.334f, 295.149f, 388.354f, 329.976f, 360.143f)
            lineTo(478.708f, 508.875f)
            cubicTo(482.875f, 513.042f, 489.627f, 513.042f, 493.794f, 508.875f)
            lineTo(508.875f, 493.793f)
            cubicTo(513.04f, 489.626f, 513.04f, 482.874f, 508.874f, 478.707f)
            close()
            moveTo(202.667f, 362.667f)
            cubicTo(114.438f, 362.667f, 42.667f, 290.896f, 42.667f, 202.667f)
            cubicTo(42.667f, 114.438f, 114.438f, 42.667f, 202.667f, 42.667f)
            cubicTo(290.896f, 42.667f, 362.667f, 114.438f, 362.667f, 202.667f)
            cubicTo(362.667f, 290.896f, 290.896f, 362.667f, 202.667f, 362.667f)
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
fun SearchStarShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(SearchStarShape)
                .background(Color.Yellow)
        )
    }
}