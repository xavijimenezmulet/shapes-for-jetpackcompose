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
 *   @since 19/7/23
 *   @email xavijimenezmulet@macaqueconsulting.com
 */

val AndroidShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 427.569f
        val baseHeight = 512.0018f

        val path = Path().apply {
            moveTo(267.23f, 511.9998f)
            cubicTo(284.349f, 511.9998f, 299.278f, 497.0708f, 299.278f, 479.9518f)
            lineTo(299.278f, 405.1057f)
            lineTo(320.677f, 405.1057f)
            cubicTo(333.518f, 405.1057f, 342.076f, 396.5448f, 342.076f, 383.7068f)
            lineTo(342.076f, 169.9368f)
            lineTo(85.492f, 169.9368f)
            lineTo(85.492f, 383.7088f)
            cubicTo(85.492f, 396.5478f, 94.052f, 405.1078f, 106.891f, 405.1078f)
            lineTo(128.292f, 405.1078f)
            lineTo(128.292f, 479.9538f)
            cubicTo(128.292f, 497.0728f, 143.217f, 512.0018f, 160.34f, 512.0018f)
            cubicTo(177.457f, 512.0018f, 192.385f, 497.0728f, 192.385f, 479.9538f)
            lineTo(192.385f, 405.1078f)
            lineTo(235.184f, 405.1078f)
            lineTo(235.184f, 479.9538f)
            cubicTo(235.182f, 497.0708f, 250.111f, 511.9998f, 267.23f, 511.9998f)
            close()

            moveTo(395.524f, 383.7088f)
            cubicTo(412.643f, 383.7088f, 427.569f, 368.7818f, 427.569f, 351.6608f)
            lineTo(427.569f, 201.9707f)
            cubicTo(427.569f, 184.9417f, 412.644f, 169.9368f, 395.524f, 169.9368f)
            cubicTo(378.403f, 169.9368f, 363.476f, 184.9427f, 363.476f, 201.9707f)
            lineTo(363.476f, 351.6608f)
            cubicTo(363.476f, 368.7798f, 378.402f, 383.7088f, 395.524f, 383.7088f)
            close()

            moveTo(32.045f, 383.7088f)
            cubicTo(49.166f, 383.7088f, 64.093f, 368.7818f, 64.093f, 351.6608f)
            lineTo(64.093f, 201.9707f)
            cubicTo(64.093f, 184.9417f, 49.168f, 169.9368f, 32.045f, 169.9368f)
            cubicTo(14.926f, 169.9368f, 0f, 184.9427f, 0f, 201.9707f)
            lineTo(0f, 351.6608f)
            cubicTo(0.001f, 368.7798f, 14.926f, 383.7088f, 32.045f, 383.7088f)
            close()

            moveTo(316.395f, 3.2287f)
            cubicTo(312.117f, -1.0763f, 305.748f, -1.0763f, 301.47f, 3.2287f)
            lineTo(271.445f, 33.1557f)
            cubicTo(254.427f, 24.6337f, 235.346f, 20.3778f, 214.098f, 20.3368f)
            cubicTo(213.994f, 20.3368f, 213.891f, 20.3337f, 213.787f, 20.3337f)
            lineTo(213.784f, 20.3337f)
            cubicTo(213.676f, 20.3337f, 213.577f, 20.3368f, 213.47f, 20.3368f)
            cubicTo(192.223f, 20.3778f, 173.143f, 24.6337f, 156.126f, 33.1557f)
            lineTo(126.098f, 3.2287f)
            cubicTo(121.817f, -1.0763f, 115.451f, -1.0763f, 111.173f, 3.2287f)
            cubicTo(106.892f, 7.5097f, 106.892f, 13.8638f, 111.173f, 18.1418f)
            lineTo(138.936f, 45.9097f)
            cubicTo(129.99f, 51.8827f, 121.878f, 59.1918f, 114.824f, 67.5518f)
            cubicTo(97.936f, 87.5697f, 87.163f, 113.6228f, 85.682f, 141.8508f)
            cubicTo(85.668f, 142.1448f, 85.639f, 142.4348f, 85.626f, 142.7288f)
            cubicTo(85.535f, 144.6508f, 85.493f, 146.5828f, 85.493f, 148.5228f)
            lineTo(342.076f, 148.5228f)
            cubicTo(342.076f, 146.5838f, 342.03f, 144.6518f, 341.943f, 142.7288f)
            cubicTo(341.929f, 142.4348f, 341.9f, 142.1448f, 341.883f, 141.8508f)
            cubicTo(340.405f, 113.6228f, 329.63f, 87.5687f, 312.741f, 67.5537f)
            cubicTo(305.69f, 59.1937f, 297.575f, 51.8847f, 288.629f, 45.9117f)
            lineTo(316.395f, 18.1437f)
            cubicTo(320.677f, 13.8637f, 320.677f, 7.5107f, 316.395f, 3.2287f)
            close()
            moveTo(160.299f, 111.1598f)
            cubicTo(151.446f, 111.1598f, 144.268f, 103.9827f, 144.268f, 95.1287f)
            cubicTo(144.268f, 86.2747f, 151.445f, 79.0977f, 160.299f, 79.0977f)
            cubicTo(169.152f, 79.0977f, 176.33f, 86.2747f, 176.33f, 95.1287f)
            cubicTo(176.33f, 103.9827f, 169.152f, 111.1598f, 160.299f, 111.1598f)
            close()
            moveTo(267.269f, 111.1598f)
            cubicTo(258.416f, 111.1598f, 251.238f, 103.9827f, 251.238f, 95.1287f)
            cubicTo(251.238f, 86.2747f, 258.415f, 79.0977f, 267.269f, 79.0977f)
            cubicTo(276.122f, 79.0977f, 283.3f, 86.2747f, 283.3f, 95.1287f)
            cubicTo(283.3f, 103.9827f, 276.123f, 111.1598f, 267.269f, 111.1598f)
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
fun AndroidPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(AndroidShape)
                .background(Color.Yellow)
        )
    }
}