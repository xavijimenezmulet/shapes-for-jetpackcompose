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

val GradleShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 799.613f
        val baseHeight = 587.9363f

        val path = Path().apply {
            moveTo(755.8732f, 37.9362f)
            cubicTo(705.8732f, -12.0638f, 629.1732f, -12.0638f, 579.1732f, 34.5362f)
            cubicTo(575.9482f, 37.9362f, 575.9482f, 41.1612f, 575.9482f, 44.5612f)
            cubicTo(575.9482f, 47.9612f, 575.9482f, 51.1862f, 579.1732f, 54.5862f)
            lineTo(595.8482f, 71.2612f)
            cubicTo(599.2482f, 74.4862f, 605.8732f, 74.4862f, 612.5232f, 71.2612f)
            cubicTo(625.9482f, 61.2362f, 639.2232f, 57.8362f, 655.8982f, 57.8362f)
            cubicTo(695.8732f, 57.8362f, 729.1982f, 91.1612f, 729.1982f, 131.3112f)
            cubicTo(729.1982f, 151.2112f, 722.5732f, 167.8862f, 709.2982f, 181.3112f)
            cubicTo(609.2982f, 281.3112f, 472.5732f, 1.2112f, 169.3232f, 144.5862f)
            cubicTo(149.2482f, 154.6112f, 139.2232f, 177.9112f, 149.2482f, 197.9862f)
            lineTo(149.2482f, 201.2112f)
            lineTo(199.2482f, 291.1862f)
            cubicTo(209.2732f, 311.2612f, 235.9732f, 317.8862f, 255.8732f, 307.8612f)
            lineTo(279.1732f, 294.5862f)
            cubicTo(305.8732f, 277.9112f, 329.1732f, 261.2612f, 352.6482f, 241.1862f)
            cubicTo(355.8732f, 237.9612f, 365.9232f, 237.9612f, 369.3232f, 241.1862f)
            cubicTo(375.9482f, 244.5862f, 375.9482f, 251.2112f, 372.5482f, 257.8612f)
            lineTo(369.3232f, 261.2612f)
            cubicTo(345.8482f, 281.3362f, 319.3232f, 301.2362f, 292.6232f, 317.8862f)
            lineTo(269.3232f, 327.9112f)
            cubicTo(259.2982f, 334.5362f, 249.2482f, 337.9362f, 235.9982f, 337.9362f)
            cubicTo(212.5232f, 337.9362f, 189.2232f, 324.5112f, 179.1982f, 304.6112f)
            lineTo(129.1982f, 217.8862f)
            cubicTo(35.9982f, 284.5612f, -24.0268f, 414.6613f, 9.2982f, 577.9113f)
            cubicTo(9.2982f, 584.5363f, 15.9232f, 587.9363f, 22.5732f, 587.9363f)
            lineTo(79.1982f, 587.9363f)
            cubicTo(85.9982f, 587.9363f, 89.2232f, 584.5363f, 92.6232f, 577.9113f)
            cubicTo(99.2482f, 531.3113f, 139.2232f, 501.2112f, 185.9982f, 507.8362f)
            cubicTo(222.5732f, 511.2362f, 252.6732f, 541.1613f, 255.8982f, 577.9113f)
            cubicTo(255.8982f, 584.5363f, 262.5232f, 587.9363f, 269.3232f, 587.9363f)
            lineTo(322.5482f, 587.9363f)
            cubicTo(329.1732f, 587.9363f, 332.5732f, 584.5363f, 335.9732f, 577.9113f)
            cubicTo(342.5982f, 531.3113f, 382.5732f, 501.2112f, 429.1732f, 507.8362f)
            cubicTo(465.8982f, 511.2362f, 495.8482f, 541.1613f, 499.2482f, 577.9113f)
            cubicTo(499.2482f, 584.5363f, 505.8732f, 587.9363f, 512.5232f, 587.9363f)
            lineTo(565.9232f, 587.9363f)
            cubicTo(572.5482f, 587.9363f, 579.1982f, 581.3112f, 579.1982f, 574.5112f)
            cubicTo(579.1982f, 497.9862f, 602.6732f, 411.2362f, 659.2982f, 367.8862f)
            cubicTo(855.8981f, 214.6612f, 802.6732f, 84.5612f, 755.8982f, 37.9612f)
            lineTo(755.8732f, 37.9362f)
            close()
            moveTo(549.2482f, 267.8612f)
            lineTo(509.2731f, 247.9612f)
            cubicTo(509.2731f, 234.5362f, 519.2982f, 224.4862f, 532.5732f, 224.4862f)
            cubicTo(545.8482f, 224.4862f, 555.8732f, 234.5112f, 555.8732f, 247.9612f)
            cubicTo(559.2732f, 257.8362f, 555.8732f, 264.6362f, 549.2482f, 267.8612f)
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
fun GradlePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(GradleShape)
                .background(Color.Yellow)
        )
    }
}