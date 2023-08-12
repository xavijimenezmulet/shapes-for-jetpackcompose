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

val CloudAndMoonShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 511.998f
        val baseHeight = 361.6463f

        val path = Path().apply {
            moveTo(76.2514f, 361.6463f)
            lineTo(347.1445f, 361.6463f)
            cubicTo(388.6343f, 361.6463f, 422.3926f, 327.888f, 422.3926f, 286.3982f)
            cubicTo(422.3926f, 249.6119f, 395.8651f, 218.9097f, 360.9299f, 212.4143f)
            cubicTo(355.1248f, 181.9178f, 330.7866f, 157.713f, 300.1877f, 152.0985f)
            cubicTo(283.6833f, 149.0705f, 264.2683f, 152.275f, 249.1163f, 161.2256f)
            cubicTo(229.3491f, 135.9763f, 199.0292f, 120.8534f, 166.5491f, 120.8534f)
            cubicTo(113.1109f, 120.8534f, 68.8299f, 160.8584f, 62.0837f, 212.4886f)
            cubicTo(27.3401f, 219.1305f, 0f, 249.7444f, 0f, 286.3982f)
            cubicTo(0f, 327.887f, 34.7616f, 361.6463f, 76.2514f, 361.6463f)
            close()

            moveTo(482.5911f, 150.9517f)
            cubicTo(418.6894f, 150.9517f, 372.1068f, 84.634f, 401.1115f, 22.4711f)
            lineTo(411.605f, 0f)
            lineTo(386.8263f, 1.0725f)
            cubicTo(322.3799f, 3.8507f, 271.8964f, 56.4651f, 271.8964f, 120.8524f)
            cubicTo(271.8964f, 121.2507f, 272.0248f, 121.63f, 272.0288f, 122.0263f)
            cubicTo(277.1889f, 121.2708f, 282.4101f, 120.8815f, 287.6223f, 120.8815f)
            cubicTo(293.7806f, 120.8815f, 299.8205f, 121.4253f, 305.6256f, 122.4979f)
            cubicTo(341.824f, 129.1408f, 371.865f, 154.5375f, 385.0916f, 188.0901f)
            cubicTo(407.1845f, 196.6102f, 425.2028f, 212.4023f, 437.1181f, 232.1444f)
            cubicTo(464.6549f, 220.8752f, 487.8905f, 199.7195f, 501.0198f, 171.8064f)
            lineTo(511.998f, 144.9549f)
            lineTo(482.5911f, 150.9517f)
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
fun CloudAndMoonShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(CloudAndMoonShape)
                .background(Color.Yellow)
        )
    }
}