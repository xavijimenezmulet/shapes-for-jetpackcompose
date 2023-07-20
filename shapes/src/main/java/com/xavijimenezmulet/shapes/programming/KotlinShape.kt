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


val KotlinShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 800f
        val baseHeight = 800f

        val path = Path().apply {
            moveTo(43.35f, 800f)
            lineTo(420.05f, 416.675f)
            lineTo(800f, 800f)
            lineTo(43.35f, 800f)
            close()
            moveTo(0f, 0f)
            lineTo(400f, 0f)
            lineTo(0f, 416.675f)
            lineTo(0f, 0f)
            close()
            moveTo(446.625f, 0f)
            lineTo(0f, 466.675f)
            lineTo(0f, 800f)
            lineTo(800f, 0f)
            lineTo(446.625f, 0f)
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
fun KotlinPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(KotlinShape)
                .background(Color.Yellow)
        )
    }
}