package com.xavijimenezmulet.shapes.programming

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


val CPlusPlusShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 366.5115f
        val baseHeight = 303.3205f

        val path = Path().apply {
            moveTo(151.6602f, 303.3205f)
            cubicTo(68.0346f, 303.3205f, 0f, 235.2859f, 0f, 151.6602f)
            cubicTo(0f, 68.0346f, 68.0346f, 0f, 151.6602f, 0f)
            cubicTo(205.6211f, 0f, 255.9475f, 29.0387f, 282.9969f, 75.7826f)
            lineTo(217.3626f, 113.7634f)
            cubicTo(203.8249f, 90.3665f, 178.6477f, 75.8306f, 151.6613f, 75.8306f)
            cubicTo(109.8479f, 75.8306f, 75.8306f, 109.8469f, 75.8306f, 151.6602f)
            cubicTo(75.8306f, 193.4726f, 109.847f, 227.4899f, 151.6613f, 227.4899f)
            cubicTo(178.6507f, 227.4899f, 203.8279f, 212.954f, 217.3676f, 189.5531f)
            lineTo(283.0019f, 227.5319f)
            cubicTo(255.9515f, 274.2808f, 205.6241f, 303.3205f, 151.6602f, 303.3205f)
            close()

            moveTo(303.3205f, 143.2342f)
            lineTo(286.4684f, 143.2342f)
            lineTo(286.4684f, 126.3841f)
            lineTo(269.6192f, 126.3841f)
            lineTo(269.6192f, 143.2342f)
            lineTo(252.7671f, 143.2342f)
            lineTo(252.7671f, 160.0853f)
            lineTo(269.6192f, 160.0853f)
            lineTo(269.6192f, 176.9375f)
            lineTo(286.4684f, 176.9375f)
            lineTo(286.4684f, 160.0853f)
            lineTo(303.3205f, 160.0853f)
            lineTo(303.3205f, 143.2342f)
            close()
            moveTo(366.5115f, 143.2342f)
            lineTo(349.6594f, 143.2342f)
            lineTo(349.6594f, 126.3841f)
            lineTo(332.8103f, 126.3841f)
            lineTo(332.8103f, 143.2342f)
            lineTo(315.9581f, 143.2342f)
            lineTo(315.9581f, 160.0853f)
            lineTo(332.8103f, 160.0853f)
            lineTo(332.8103f, 176.9375f)
            lineTo(349.6594f, 176.9375f)
            lineTo(349.6594f, 160.0853f)
            lineTo(366.5115f, 160.0853f)
            lineTo(366.5115f, 143.2342f)
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
fun CPlusPlusPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(CPlusPlusShape)
                .background(Color.Yellow)
        )
    }
}