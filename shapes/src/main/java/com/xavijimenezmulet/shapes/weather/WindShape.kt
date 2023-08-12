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

val WindShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 512.008f
        val baseHeight = 494.933f

        val path = Path().apply {
            moveTo(426.675f, 324.266f)
            lineTo(369.561f, 324.266f)
            cubicTo(388.693f, 309.478f, 401.075f, 286.472f, 401.075f, 260.59f)
            cubicTo(401.075f, 246.373f, 397.926f, 233.258f, 392.362f, 221.866f)
            lineTo(452.275f, 221.866f)
            cubicTo(485.214f, 221.866f, 512.008f, 195.063f, 512.008f, 162.133f)
            cubicTo(512.008f, 129.203f, 485.213f, 102.4f, 452.275f, 102.4f)
            cubicTo(419.336f, 102.4f, 392.542f, 129.203f, 392.542f, 162.133f)
            cubicTo(392.542f, 166.852f, 396.365f, 170.666f, 401.075f, 170.666f)
            cubicTo(405.785f, 170.666f, 409.608f, 166.852f, 409.608f, 162.133f)
            cubicTo(409.608f, 138.607f, 428.748f, 119.466f, 452.275f, 119.466f)
            cubicTo(475.801f, 119.466f, 494.942f, 138.606f, 494.942f, 162.133f)
            cubicTo(494.942f, 185.659f, 475.802f, 204.8f, 452.275f, 204.8f)
            lineTo(384.008f, 204.8f)
            cubicTo(383.155f, 204.8f, 382.378f, 205.056f, 381.593f, 205.286f)
            cubicTo(369.373f, 190.976f, 352.196f, 181.606f, 332.339f, 179.601f)
            cubicTo(327.808f, 139.844f, 290.517f, 107.648f, 246.886f, 107.648f)
            cubicTo(236.851f, 107.648f, 227.865f, 107.648f, 218.188f, 111.232f)
            cubicTo(205.038f, 85.188f, 175.214f, 68.267f, 140.953f, 68.267f)
            cubicTo(96.093f, 68.267f, 59.596f, 104.482f, 59.596f, 149.009f)
            cubicTo(59.596f, 152.619f, 59.861f, 156.288f, 60.39f, 159.983f)
            cubicTo(24.474f, 173.858f, 0f, 208.793f, 0f, 247.466f)
            cubicTo(0f, 299.221f, 42.436f, 341.333f, 94.601f, 341.333f)
            lineTo(426.667f, 341.333f)
            cubicTo(464.308f, 341.333f, 494.934f, 371.959f, 494.934f, 409.6f)
            cubicTo(494.934f, 447.241f, 464.308f, 477.867f, 426.667f, 477.867f)
            cubicTo(389.026f, 477.867f, 358.4f, 447.24f, 358.4f, 409.6f)
            cubicTo(358.4f, 404.881f, 354.577f, 401.067f, 349.867f, 401.067f)
            cubicTo(345.157f, 401.067f, 341.334f, 404.881f, 341.334f, 409.6f)
            cubicTo(341.334f, 456.653f, 379.615f, 494.933f, 426.667f, 494.933f)
            cubicTo(473.719f, 494.933f, 512f, 456.652f, 512f, 409.6f)
            cubicTo(512f, 362.548f, 473.728f, 324.266f, 426.675f, 324.266f)
            close()

            moveTo(247.475f, 366.933f)
            lineTo(68.275f, 366.933f)
            cubicTo(63.565f, 366.933f, 59.742f, 370.747f, 59.742f, 375.466f)
            cubicTo(59.742f, 380.185f, 63.565f, 383.999f, 68.275f, 383.999f)
            lineTo(247.475f, 383.999f)
            cubicTo(271.001f, 383.999f, 290.142f, 403.139f, 290.142f, 426.666f)
            cubicTo(290.142f, 450.193f, 271.002f, 469.333f, 247.475f, 469.333f)
            cubicTo(223.949f, 469.333f, 204.808f, 450.193f, 204.808f, 426.666f)
            cubicTo(204.808f, 421.947f, 200.985f, 418.133f, 196.275f, 418.133f)
            cubicTo(191.565f, 418.133f, 187.742f, 421.947f, 187.742f, 426.666f)
            cubicTo(187.742f, 459.596f, 214.537f, 486.399f, 247.475f, 486.399f)
            cubicTo(280.413f, 486.399f, 307.208f, 459.596f, 307.208f, 426.666f)
            cubicTo(307.209f, 393.736f, 280.414f, 366.933f, 247.475f, 366.933f)
            close()

            moveTo(34.142f, 366.933f)
            lineTo(8.542f, 366.933f)
            cubicTo(3.832f, 366.933f, 0.009f, 370.747f, 0.009f, 375.466f)
            cubicTo(0.009f, 380.185f, 3.832f, 383.999f, 8.542f, 383.999f)
            lineTo(34.142f, 383.999f)
            cubicTo(38.852f, 383.999f, 42.675f, 380.185f, 42.675f, 375.466f)
            cubicTo(42.675f, 370.747f, 38.852f, 366.933f, 34.142f, 366.933f)
            close()

            moveTo(503.475f, 256f)
            lineTo(494.942f, 256f)
            cubicTo(490.232f, 256f, 486.409f, 259.814f, 486.409f, 264.533f)
            cubicTo(486.409f, 269.252f, 490.232f, 273.066f, 494.942f, 273.066f)
            lineTo(503.475f, 273.066f)
            cubicTo(508.185f, 273.066f, 512.008f, 269.252f, 512.008f, 264.533f)
            cubicTo(512.008f, 259.814f, 508.186f, 256f, 503.475f, 256f)
            close()

            moveTo(460.809f, 256f)
            lineTo(426.676f, 256f)
            cubicTo(421.966f, 256f, 418.143f, 259.814f, 418.143f, 264.533f)
            cubicTo(418.143f, 269.252f, 421.966f, 273.066f, 426.676f, 273.066f)
            lineTo(460.809f, 273.066f)
            cubicTo(465.519f, 273.066f, 469.342f, 269.252f, 469.342f, 264.533f)
            cubicTo(469.342f, 259.814f, 465.519f, 256f, 460.809f, 256f)
            close()

            moveTo(358.409f, 0f)
            lineTo(256.009f, 0f)
            cubicTo(251.299f, 0f, 247.476f, 3.814f, 247.476f, 8.533f)
            cubicTo(247.476f, 13.252f, 251.299f, 17.066f, 256.009f, 17.066f)
            lineTo(358.409f, 17.066f)
            cubicTo(363.119f, 17.066f, 366.942f, 13.252f, 366.942f, 8.533f)
            cubicTo(366.942f, 3.814f, 363.119f, 0f, 358.409f, 0f)
            close()

            moveTo(418.142f, 0f)
            lineTo(392.542f, 0f)
            cubicTo(387.832f, 0f, 384.009f, 3.814f, 384.009f, 8.533f)
            cubicTo(384.009f, 13.252f, 387.832f, 17.066f, 392.542f, 17.066f)
            lineTo(418.142f, 17.066f)
            cubicTo(422.852f, 17.066f, 426.675f, 13.252f, 426.675f, 8.533f)
            cubicTo(426.675f, 3.814f, 422.852f, 0f, 418.142f, 0f)
            close()

            moveTo(384.009f, 42.666f)
            lineTo(281.609f, 42.666f)
            cubicTo(276.899f, 42.666f, 273.076f, 46.48f, 273.076f, 51.199f)
            cubicTo(273.076f, 55.918f, 276.899f, 59.732f, 281.609f, 59.732f)
            lineTo(384.009f, 59.732f)
            cubicTo(388.719f, 59.732f, 392.542f, 55.918f, 392.542f, 51.199f)
            cubicTo(392.542f, 46.48f, 388.719f, 42.666f, 384.009f, 42.666f)
            close()

            moveTo(247.475f, 42.666f)
            lineTo(221.875f, 42.666f)
            cubicTo(217.165f, 42.666f, 213.342f, 46.48f, 213.342f, 51.199f)
            cubicTo(213.342f, 55.918f, 217.165f, 59.732f, 221.875f, 59.732f)
            lineTo(247.475f, 59.732f)
            cubicTo(252.185f, 59.732f, 256.008f, 55.918f, 256.008f, 51.199f)
            cubicTo(256.008f, 46.48f, 252.186f, 42.666f, 247.475f, 42.666f)
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
fun WindShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(WindShape)
                .background(Color.Yellow)
        )
    }
}