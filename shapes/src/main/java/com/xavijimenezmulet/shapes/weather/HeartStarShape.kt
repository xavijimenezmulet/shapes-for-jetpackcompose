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


val HeartStarShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 447.6687f
        val baseHeight = 512.001f

        val path = Path().apply {
            moveTo(378.4349f, 276.831f)
            cubicTo(369.3129f, 264.372f, 369.3129f, 247.629f, 378.4349f, 235.169f)
            lineTo(444.6299f, 144.745f)
            cubicTo(448.3319f, 139.688f, 448.6719f, 133.428f, 445.5379f, 128f)
            cubicTo(442.4039f, 122.572f, 436.8119f, 119.735f, 430.5829f, 120.414f)
            lineTo(319.1749f, 132.529f)
            cubicTo(303.8259f, 134.201f, 289.3248f, 125.827f, 283.0948f, 111.698f)
            lineTo(237.8808f, 9.158f)
            cubicTo(235.3538f, 3.424f, 230.1018f, 0f, 223.8338f, 0f)
            cubicTo(217.5668f, 0f, 212.3149f, 3.424f, 209.7868f, 9.158f)
            lineTo(164.5748f, 111.698f)
            cubicTo(158.3448f, 125.826f, 143.8478f, 134.2f, 128.4948f, 132.529f)
            lineTo(17.0858f, 120.414f)
            cubicTo(10.8508f, 119.737f, 5.2648f, 122.573f, 2.1308f, 128f)
            cubicTo(-1.0032f, 133.428f, -0.6632f, 139.687f, 3.0388f, 144.745f)
            lineTo(69.2338f, 235.17f)
            cubicTo(78.3558f, 247.629f, 78.3558f, 264.372f, 69.2338f, 276.832f)
            lineTo(3.0388f, 367.256f)
            cubicTo(-0.6632f, 372.313f, -1.0022f, 378.573f, 2.1308f, 384.001f)
            cubicTo(5.2648f, 389.429f, 10.8568f, 392.265f, 17.0858f, 391.587f)
            cubicTo(17.0858f, 391.587f, 131.0859f, 379.262f, 132.3689f, 379.262f)
            cubicTo(146.2399f, 379.262f, 158.8709f, 387.371f, 164.5739f, 400.303f)
            lineTo(209.7858f, 502.843f)
            cubicTo(212.3148f, 508.578f, 217.5658f, 512.001f, 223.8328f, 512.001f)
            cubicTo(230.0998f, 512.001f, 235.3518f, 508.577f, 237.8798f, 502.843f)
            lineTo(283.0919f, 400.303f)
            cubicTo(289.3219f, 386.175f, 303.8169f, 377.801f, 319.1719f, 379.472f)
            lineTo(430.5799f, 391.587f)
            cubicTo(436.8129f, 392.265f, 442.4019f, 389.428f, 445.5349f, 384.001f)
            cubicTo(448.6689f, 378.573f, 448.3289f, 372.314f, 444.6269f, 367.256f)
            lineTo(378.4349f, 276.831f)
            close()
            moveTo(283.8939f, 267.032f)
            lineTo(233.8229f, 320.388f)
            cubicTo(231.2329f, 323.147f, 227.6178f, 324.713f, 223.8338f, 324.712f)
            cubicTo(220.0498f, 324.712f, 216.4348f, 323.147f, 213.8458f, 320.388f)
            lineTo(163.7748f, 267.032f)
            cubicTo(155.8268f, 258.563f, 150.9598f, 247.169f, 150.9588f, 234.638f)
            cubicTo(150.9588f, 208.492f, 172.3199f, 187.203f, 198.4659f, 187.288f)
            cubicTo(207.8039f, 187.318f, 216.5058f, 190.052f, 223.8288f, 194.747f)
            lineTo(223.8318f, 194.752f)
            cubicTo(231.1558f, 190.054f, 239.8589f, 187.319f, 249.1979f, 187.288f)
            cubicTo(275.3459f, 187.2f, 296.7099f, 208.49f, 296.7099f, 234.638f)
            cubicTo(296.7109f, 247.169f, 291.8419f, 258.563f, 283.8939f, 267.032f)
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
fun HeartStarShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(HeartStarShape)
                .background(Color.Yellow)
        )
    }
}