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


val CompassRoseShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512f
        val baseHeight = 512f

        val path = Path().apply {
            moveTo(422.17f, 89.831f)
            cubicTo(389.655f, 57.317f, 349.286f, 35.519f, 305.346f, 26.177f)
            lineTo(312.232f, 58.843f)
            cubicTo(380.143f, 78.239f, 433.761f, 131.857f, 453.158f, 199.769f)
            lineTo(485.824f, 206.655f)
            cubicTo(476.482f, 162.715f, 454.685f, 122.345f, 422.17f, 89.831f)
            close()

            moveTo(89.83f, 89.83f)
            cubicTo(57.316f, 122.344f, 35.518f, 162.714f, 26.176f, 206.654f)
            lineTo(58.842f, 199.768f)
            cubicTo(78.239f, 131.857f, 131.857f, 78.239f, 199.768f, 58.842f)
            lineTo(206.654f, 26.176f)
            cubicTo(162.713f, 35.519f, 122.344f, 57.316f, 89.83f, 89.83f)
            close()

            moveTo(453.158f, 312.232f)
            cubicTo(433.761f, 380.143f, 380.143f, 433.761f, 312.232f, 453.158f)
            lineTo(305.346f, 485.824f)
            cubicTo(349.287f, 476.481f, 389.656f, 454.684f, 422.17f, 422.17f)
            cubicTo(454.684f, 389.656f, 476.482f, 349.286f, 485.824f, 305.346f)
            lineTo(453.158f, 312.232f)
            close()

            moveTo(199.768f, 453.157f)
            cubicTo(131.857f, 433.761f, 78.239f, 380.143f, 58.842f, 312.231f)
            lineTo(26.176f, 305.345f)
            cubicTo(35.518f, 349.285f, 57.315f, 389.655f, 89.83f, 422.169f)
            cubicTo(122.345f, 454.683f, 162.714f, 476.481f, 206.654f, 485.823f)
            lineTo(199.768f, 453.157f)
            close()

            moveTo(256f, 276f)
            cubicTo(267.0457f, 276f, 276f, 267.0457f, 276f, 256f)
            cubicTo(276f, 244.9543f, 267.0457f, 236f, 256f, 236f)
            cubicTo(244.9543f, 236f, 236f, 244.9543f, 236f, 256f)
            cubicTo(236f, 267.0457f, 244.9543f, 276f, 256f, 276f)
            close()

            moveTo(512f, 242.832f)
            lineTo(343.907f, 207.396f)
            lineTo(396.312f, 115.688f)
            lineTo(304.604f, 168.092f)
            lineTo(269.168f, 0f)
            lineTo(242.832f, 0f)
            lineTo(207.396f, 168.093f)
            lineTo(115.688f, 115.689f)
            lineTo(168.093f, 207.397f)
            lineTo(0f, 242.832f)
            lineTo(0f, 269.168f)
            lineTo(168.093f, 304.604f)
            lineTo(115.688f, 396.312f)
            lineTo(207.396f, 343.908f)
            lineTo(242.832f, 512f)
            lineTo(269.168f, 512f)
            lineTo(304.604f, 343.907f)
            lineTo(396.312f, 396.311f)
            lineTo(343.907f, 304.603f)
            lineTo(512f, 269.168f)
            lineTo(512f, 242.832f)
            close()
            moveTo(256f, 311f)
            cubicTo(225.673f, 311f, 201f, 286.327f, 201f, 256f)
            cubicTo(201f, 225.673f, 225.673f, 201f, 256f, 201f)
            cubicTo(286.327f, 201f, 311f, 225.673f, 311f, 256f)
            cubicTo(311f, 286.327f, 286.327f, 311f, 256f, 311f)
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
fun CompassRoseShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(CompassRoseShape)
                .background(Color.Yellow)
        )
    }
}