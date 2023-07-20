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


val JavaShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 370.5114f
        val baseHeight = 511.9999f

        val path = Path().apply {
            moveTo(47.9924f, 304.549f)
            cubicTo(47.9924f, 290.376f, 101.7664f, 282.424f, 126.8074f, 280.492f)
            lineTo(129.2024f, 281.875f)
            cubicTo(119.5834f, 283.627f, 80.9854f, 290.433f, 80.9854f, 299.314f)
            cubicTo(80.9854f, 308.98f, 140.1844f, 315.314f, 174.5414f, 315.314f)
            cubicTo(232.8974f, 315.314f, 272.5664f, 306.481f, 283.2354f, 303.575f)
            lineTo(298.1653f, 312.257f)
            cubicTo(287.9403f, 317.265f, 244.0594f, 330.377f, 174.5414f, 330.377f)
            cubicTo(97.2884f, 330.376f, 47.9924f, 315.266f, 47.9924f, 304.549f)
            close()
            moveTo(165.7364f, 503.552f)
            cubicTo(135.1574f, 503.817f, 97.8274f, 501.289f, 66.4244f, 496.016f)
            lineTo(63.5084f, 497.682f)
            cubicTo(94.7974f, 506.856f, 138.3564f, 512.394f, 186.2144f, 511.978f)
            cubicTo(280.2054f, 511.164f, 356.4084f, 487.855f, 357.9134f, 459.804f)
            lineTo(356.8344f, 459.17f)
            cubicTo(350.5294f, 466.857f, 309.8764f, 502.293f, 165.7364f, 503.552f)
            close()
            moveTo(173.7364f, 485.489f)
            cubicTo(250.6674f, 484.817f, 336.7353f, 469.764f, 336.5173f, 444.458f)
            cubicTo(336.4703f, 439.866f, 333.4873f, 436.723f, 330.8933f, 434.83f)
            lineTo(329.6244f, 435.559f)
            cubicTo(322.5144f, 455.156f, 262.4164f, 469.641f, 173.6124f, 470.408f)
            cubicTo(116.3164f, 470.91f, 36.9424f, 457.182f, 36.8004f, 441.324f)
            cubicTo(36.6674f, 425.419f, 74.4044f, 416.681f, 74.4044f, 416.681f)
            lineTo(71.7344f, 415.157f)
            cubicTo(46.4474f, 418.641f, -0.1506f, 430.75f, 0.0004f, 448.236f)
            cubicTo(0.2204f, 473.512f, 107.3144f, 486.066f, 173.7364f, 485.489f)
            close()
            moveTo(347.0453f, 311.319f)
            cubicTo(345.4933f, 340.999f, 318.0754f, 359.479f, 290.6674f, 375.091f)
            lineTo(293.1483f, 376.53f)
            cubicTo(322.3933f, 368.294f, 374.5763f, 344.341f, 370.2593f, 307.513f)
            cubicTo(368.1103f, 289.156f, 351.3243f, 276.034f, 329.4453f, 276.034f)
            cubicTo(322.6293f, 276.034f, 316.5703f, 277.236f, 311.6563f, 278.732f)
            lineTo(311.6374f, 278.779f)
            lineTo(310.5953f, 281.392f)
            cubicTo(330.1743f, 277.558f, 348.0583f, 291.854f, 347.0453f, 311.319f)
            close()
            moveTo(121.0704f, 399.506f)
            cubicTo(112.1424f, 401.286f, 92.6874f, 405.755f, 92.6874f, 415.212f)
            cubicTo(92.6874f, 428.315f, 134.3054f, 438.36f, 174.4944f, 438.36f)
            cubicTo(229.7934f, 438.36f, 252.4484f, 424.131f, 253.4704f, 423.392f)
            lineTo(230.4743f, 410.09f)
            cubicTo(220.6944f, 412.419f, 204.2214f, 416.073f, 174.5514f, 416.073f)
            cubicTo(141.4444f, 416.073f, 119.8684f, 410.412f, 119.8684f, 404.201f)
            cubicTo(119.8684f, 402.885f, 120.6924f, 401.314f, 122.2254f, 400.178f)
            lineTo(121.0704f, 399.506f)
            close()
            moveTo(256.9164f, 355.332f)
            cubicTo(244.2014f, 358.93f, 215.5534f, 364.799f, 174.5884f, 364.799f)
            cubicTo(134.3904f, 364.799f, 101.5484f, 357.926f, 101.4434f, 349.822f)
            cubicTo(101.3674f, 344.425f, 107.8904f, 342.078f, 107.8904f, 342.078f)
            lineTo(106.7354f, 341.406f)
            cubicTo(87.4794f, 344.805f, 69.6044f, 350.069f, 69.6994f, 357.945f)
            cubicTo(69.8794f, 372.231f, 124.5244f, 382.958f, 174.5124f, 382.958f)
            cubicTo(217.0114f, 382.958f, 257.8243f, 375.829f, 276.2383f, 366.485f)
            lineTo(256.9164f, 355.332f)
            close()

            moveTo(245.9534f, 36.62f)
            cubicTo(245.9534f, 115.398f, 137.9974f, 145.541f, 137.9974f, 201.55f)
            cubicTo(137.9974f, 240.868f, 164.0704f, 265.521f, 178.4984f, 281.113f)
            lineTo(177.3244f, 281.795f)
            cubicTo(159.1094f, 270.396f, 111.1954f, 241.767f, 111.1954f, 194.478f)
            cubicTo(111.1954f, 128.084f, 235.1983f, 96.359f, 235.1983f, 20.952f)
            cubicTo(235.1983f, 11.674f, 233.8254f, 4.555f, 232.8604f, 0.72f)
            lineTo(234.1104f, 0f)
            cubicTo(238.0384f, 4.933f, 245.9534f, 17.278f, 245.9534f, 36.62f)
            close()
            moveTo(281.4564f, 106.384f)
            lineTo(280.1594f, 105.646f)
            cubicTo(256.6714f, 113.513f, 184.3404f, 142.066f, 184.3404f, 195.292f)
            cubicTo(184.3404f, 225.388f, 213.7364f, 242.07f, 213.7364f, 270.292f)
            cubicTo(213.7364f, 280.365f, 208.0464f, 289.804f, 203.4264f, 295.446f)
            lineTo(205.7454f, 296.79f)
            cubicTo(217.9864f, 288.838f, 239.6474f, 271.617f, 239.6474f, 249.388f)
            cubicTo(239.6474f, 230.558f, 213.5934f, 207.931f, 213.5934f, 183.732f)
            cubicTo(213.5944f, 145.598f, 263.8654f, 115.681f, 281.4564f, 106.384f)
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
fun JavaPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(JavaShape)
                .background(Color.Yellow)
        )
    }
}