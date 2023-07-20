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


val AppleShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 18.566f
        val baseHeight = 22.773f

        val path = Path().apply {
            moveTo(13.665f, 0f)
            cubicTo(13.718f, 0f, 13.771f, 0f, 13.827f, 0f)
            cubicTo(13.957f, 1.606f, 13.344f, 2.806f, 12.599f, 3.675f)
            cubicTo(11.868f, 4.538f, 10.867f, 5.375f, 9.248f, 5.248f)
            cubicTo(9.14f, 3.665f, 9.754f, 2.554f, 10.498f, 1.687f)
            cubicTo(11.188f, 0.879f, 12.453f, 0.16f, 13.665f, 0f)
            close()

            moveTo(18.566f, 16.716f)
            cubicTo(18.566f, 16.732f, 18.566f, 16.746f, 18.566f, 16.761f)
            cubicTo(18.111f, 18.139f, 17.462f, 19.32f, 16.67f, 20.416f)
            cubicTo(15.947f, 21.411f, 15.061f, 22.75f, 13.479f, 22.75f)
            cubicTo(12.112f, 22.75f, 11.204f, 21.871f, 9.803f, 21.847f)
            cubicTo(8.321f, 21.823f, 7.506f, 22.582f, 6.151f, 22.773f)
            cubicTo(5.996f, 22.773f, 5.841f, 22.773f, 5.689f, 22.773f)
            cubicTo(4.694f, 22.629f, 3.891f, 21.841f, 3.306f, 21.131f)
            cubicTo(1.581f, 19.033f, 0.248f, 16.323f, 0f, 12.855f)
            cubicTo(0f, 12.515f, 0f, 12.176f, 0f, 11.836f)
            cubicTo(0.105f, 9.354f, 1.311f, 7.336f, 2.914f, 6.358f)
            cubicTo(3.76f, 5.838f, 4.923f, 5.395f, 6.218f, 5.593f)
            cubicTo(6.773f, 5.679f, 7.34f, 5.869f, 7.837f, 6.057f)
            cubicTo(8.308f, 6.238f, 8.897f, 6.559f, 9.455f, 6.542f)
            cubicTo(9.833f, 6.531f, 10.209f, 6.334f, 10.59f, 6.195f)
            cubicTo(11.706f, 5.792f, 12.8f, 5.33f, 14.242f, 5.547f)
            cubicTo(15.975f, 5.809f, 17.205f, 6.579f, 17.965f, 7.767f)
            cubicTo(16.499f, 8.7f, 15.34f, 10.106f, 15.538f, 12.507f)
            cubicTo(15.714f, 14.688f, 16.982f, 15.964f, 18.566f, 16.716f)
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
fun ApplePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(AppleShape)
                .background(Color.Yellow)
        )
    }
}