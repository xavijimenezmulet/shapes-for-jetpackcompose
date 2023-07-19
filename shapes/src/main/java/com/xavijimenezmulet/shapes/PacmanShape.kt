package com.xavijimenezmulet.shapes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

/**
 *   @author xavierjimenez
 *   @since 19/7/23
 *   @email xavijimenezmulet@macaqueconsulting.com
 */

val PacmanShape: GenericShape = GenericShape { size: Size, _: LayoutDirection ->
    val eyeRadius = size.width / 12f
    val eyeX = size.width * 0.5f
    val eyeY = size.height * 0.25f

    if (Progress == 360f) {
        addOval(Rect(0f, 0f, size.width, size.height))
    } else {
        moveTo(size.width / 2f, size.height / 2f)
        arcTo(Rect(0f, 0f, size.width, size.height), 30f, Progress, forceMoveTo = false)
    }

    addOval(Rect(eyeX - eyeRadius, eyeY - eyeRadius, eyeX + eyeRadius, eyeY + eyeRadius))

    close()

}

private const val Progress = 300f

@Preview
@Composable
fun PacmanPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(PacmanShape)
                .background(Color.Yellow)
        )
    }
}