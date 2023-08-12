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


val AddStarShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512.0105f
        val baseHeight = 511.536f

        val path = Path().apply {
            moveTo(394.6775f, 276.87f)
            cubicTo(329.9945f, 276.87f, 277.3445f, 329.499f, 277.3445f, 394.203f)
            cubicTo(277.3445f, 458.907f, 329.9955f, 511.536f, 394.6775f, 511.536f)
            cubicTo(459.3595f, 511.536f, 512.0105f, 458.907f, 512.0105f, 394.203f)
            cubicTo(512.0105f, 329.499f, 459.3595f, 276.87f, 394.6775f, 276.87f)
            close()
            moveTo(437.3435f, 404.87f)
            lineTo(405.3435f, 404.87f)
            lineTo(405.3435f, 436.87f)
            cubicTo(405.3435f, 442.758f, 400.5645f, 447.537f, 394.6765f, 447.537f)
            cubicTo(388.7885f, 447.537f, 384.0095f, 442.758f, 384.0095f, 436.87f)
            lineTo(384.0095f, 404.87f)
            lineTo(352.0095f, 404.87f)
            cubicTo(346.1215f, 404.87f, 341.3425f, 400.091f, 341.3425f, 394.203f)
            cubicTo(341.3425f, 388.315f, 346.1215f, 383.536f, 352.0095f, 383.536f)
            lineTo(384.0095f, 383.536f)
            lineTo(384.0095f, 351.536f)
            cubicTo(384.0095f, 345.648f, 388.7885f, 340.869f, 394.6765f, 340.869f)
            cubicTo(400.5645f, 340.869f, 405.3435f, 345.648f, 405.3435f, 351.536f)
            lineTo(405.3435f, 383.536f)
            lineTo(437.3435f, 383.536f)
            cubicTo(443.2315f, 383.536f, 448.0105f, 388.315f, 448.0105f, 394.203f)
            cubicTo(448.0105f, 400.091f, 443.2315f, 404.87f, 437.3435f, 404.87f)
            close()

            moveTo(394.6775f, 255.536f)
            cubicTo(400.9495f, 255.536f, 407.0935f, 256.112f, 413.1095f, 256.901f)
            cubicTo(416.5655f, 257.392f, 419.7225f, 256.218f, 422.0695f, 253.872f)
            lineTo(487.5415f, 188.4f)
            cubicTo(490.4215f, 185.541f, 491.4025f, 181.275f, 490.1015f, 177.435f)
            cubicTo(488.7785f, 173.595f, 485.4085f, 170.822f, 481.3975f, 170.288f)
            lineTo(326.9015f, 149.808f)
            lineTo(254.8795f, 5.424f)
            cubicTo(251.2955f, -1.808f, 239.3705f, -1.808f, 235.7865f, 5.424f)
            lineTo(163.7655f, 149.808f)
            lineTo(9.2695f, 170.288f)
            cubicTo(5.2585f, 170.821f, 1.8665f, 173.595f, 0.5655f, 177.435f)
            cubicTo(-0.7355f, 181.275f, 0.2455f, 185.52f, 3.1255f, 188.4f)
            lineTo(116.4265f, 301.701f)
            lineTo(85.5575f, 456.091f)
            cubicTo(84.7685f, 460.102f, 86.3045f, 464.176f, 89.5465f, 466.672f)
            cubicTo(91.4235f, 468.123f, 93.7275f, 468.869f, 96.0105f, 468.869f)
            cubicTo(97.6315f, 468.869f, 99.2745f, 468.485f, 100.7895f, 467.738f)
            lineTo(247.6485f, 394.309f)
            cubicTo(248.8855f, 394.096f, 250.0595f, 393.69f, 251.1685f, 393.05f)
            cubicTo(254.2835f, 391.279f, 256.2675f, 388.079f, 256.5235f, 384.538f)
            cubicTo(261.5145f, 312.198f, 322.2295f, 255.536f, 394.6775f, 255.536f)
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
fun AddStarShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(AddStarShape)
                .background(Color.Yellow)
        )
    }
}