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


val CSharpShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 1741.7737f
        val baseHeight = 1637.33f

        val path = Path().apply {
            moveTo(818.6693f, 0.0086f)
            cubicTo(1121.522f, 0.0086f, 1385.9321f, 164.4819f, 1527.5604f, 408.9598f)
            lineTo(1526.1816f, 406.6072f)
            lineTo(1169.8488f, 611.7722f)
            cubicTo(1099.6508f, 492.9112f, 970.9574f, 412.6911f, 823.3141f, 411.0366f)
            lineTo(818.6606f, 411.0107f)
            cubicTo(593.5289f, 411.0107f, 411.0107f, 593.529f, 411.0107f, 818.6606f)
            cubicTo(410.9368f, 889.6197f, 429.475f, 959.3573f, 464.7752f, 1020.9129f)
            cubicTo(535.0421f, 1143.5827f, 667.1395f, 1226.3191f, 818.6693f, 1226.3191f)
            cubicTo(971.1383f, 1226.3191f, 1103.9853f, 1142.5314f, 1173.8903f, 1018.5517f)
            lineTo(1172.1927f, 1021.5247f)
            lineTo(1527.9828f, 1227.6376f)
            cubicTo(1387.9057f, 1470.0473f, 1127.1147f, 1634.0121f, 827.7865f, 1637.2781f)
            lineTo(818.6693f, 1637.33f)
            cubicTo(514.86f, 1637.33f, 249.7001f, 1471.8398f, 108.4251f, 1226.0692f)
            cubicTo(39.4594f, 1106.088f, 0f, 966.9933f, 0f, 818.6606f)
            cubicTo(0f, 366.5359f, 366.5186f, 0f, 818.6606f, 0f)
            lineTo(818.6693f, 0.0086f)
            close()

            moveTo(1451.4939f, 583.1362f)
            lineTo(1451.4939f, 699.2482f)
            lineTo(1567.6058f, 699.2482f)
            lineTo(1567.6058f, 583.1362f)
            lineTo(1625.6617f, 583.1362f)
            lineTo(1625.6617f, 699.2482f)
            lineTo(1741.7737f, 699.2482f)
            lineTo(1741.7737f, 757.3042f)
            lineTo(1625.6617f, 757.3042f)
            lineTo(1625.6617f, 873.4074f)
            lineTo(1741.7737f, 873.4074f)
            lineTo(1741.7737f, 931.4634f)
            lineTo(1625.6617f, 931.4634f)
            lineTo(1625.6617f, 1047.5753f)
            lineTo(1567.6058f, 1047.5753f)
            lineTo(1567.6058f, 931.4634f)
            lineTo(1451.4939f, 931.4634f)
            lineTo(1451.4939f, 1047.5753f)
            lineTo(1393.438f, 1047.5753f)
            lineTo(1393.438f, 931.4634f)
            lineTo(1277.3347f, 931.4634f)
            lineTo(1277.3347f, 873.4074f)
            lineTo(1393.438f, 873.4074f)
            lineTo(1393.438f, 757.3042f)
            lineTo(1277.3347f, 757.3042f)
            lineTo(1277.3347f, 699.2482f)
            lineTo(1393.438f, 699.2482f)
            lineTo(1393.438f, 583.1362f)
            lineTo(1451.4939f, 583.1362f)
            close()
            moveTo(1567.6058f, 757.2955f)
            lineTo(1451.4939f, 757.2955f)
            lineTo(1451.4939f, 873.4074f)
            lineTo(1567.6058f, 873.4074f)
            lineTo(1567.6058f, 757.2955f)
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
fun CSharpPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(CSharpShape)
                .background(Color.Yellow)
        )
    }
}