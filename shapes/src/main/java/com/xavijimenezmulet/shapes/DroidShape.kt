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
import androidx.compose.ui.geometry.RoundRect
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

//TODO: Pending implement mouth and eyes

val DroidShape: GenericShape = GenericShape { size: Size, _: LayoutDirection ->
    val headRadius = size.width * 0.3f
    val bodyHeight = size.height * 0.4f
    val bodyWidth = size.width * 0.5f
    val armWidth = size.width * 0.2f
    val armHeight = size.height * 0.2f
    val legWidth = size.width * 0.3f
    val legHeight = size.height * 0.3f
    val eyeRadius = size.width * 0.05f
    val eyeOffsetX = size.width * 0.15f
    val eyeOffsetY = size.height * 0.1f
    val mouthWidth = size.width * 0.2f
    val mouthHeight = size.height * 0.05f

    // Dibujar la cabeza
    addOval(Rect(
        size.width / 2f - headRadius,
        0f,
        size.width / 2f + headRadius,
        headRadius * 2f
    ))

    // Dibujar los ojos
    addOval(Rect(
        size.width / 2f - eyeOffsetX - eyeRadius,
        eyeOffsetY,
        size.width / 2f - eyeOffsetX + eyeRadius,
        eyeOffsetY + eyeRadius * 2f
    ))
    addOval(Rect(
        size.width / 2f + eyeOffsetX - eyeRadius,
        eyeOffsetY,
        size.width / 2f + eyeOffsetX + eyeRadius,
        eyeOffsetY + eyeRadius * 2f
    ))

    // Dibujar la boca
    addRect(Rect(
        size.width / 2f - mouthWidth / 2f,
        headRadius * 2f - mouthHeight * 2f,
        size.width / 2f + mouthWidth / 2f,
        headRadius * 2f - mouthHeight
    ))

    // Dibujar el cuerpo
    addRoundRect(
        RoundRect(
            size.width / 2f - bodyWidth / 2f,
            headRadius * 2f,
            size.width / 2f + bodyWidth / 2f,
            headRadius * 2f + bodyHeight,
            bodyWidth / 2f,
            bodyWidth / 2f
        )
    )

    // Dibujar los brazos
    addRoundRect(
        RoundRect(
            size.width / 2f - bodyWidth / 2f - armWidth,
            headRadius * 2f + bodyHeight * 0.4f,
            size.width / 2f - bodyWidth / 2f,
            headRadius * 2f + bodyHeight * 0.4f + armHeight,
            armWidth / 2f,
            armWidth / 2f
        )
    )
    addRoundRect(
        RoundRect(
            size.width / 2f + bodyWidth / 2f,
            headRadius * 2f + bodyHeight * 0.4f,
            size.width / 2f + bodyWidth / 2f + armWidth,
            headRadius * 2f + bodyHeight * 0.4f + armHeight,
            armWidth / 2f,
            armWidth / 2f
        )
    )

    // Dibujar las piernas
    addRoundRect(
        RoundRect(
            size.width / 2f - legWidth / 2f,
            headRadius * 2f + bodyHeight,
            size.width / 2f - legWidth / 2f + legWidth,
            headRadius * 2f + bodyHeight + legHeight,
            legWidth / 2f,
            legWidth / 2f
        )
    )
    addRoundRect(
        RoundRect(
            size.width / 2f - legWidth / 2f,
            headRadius * 2f + bodyHeight + legHeight,
            size.width / 2f - legWidth / 2f + legWidth,
            headRadius * 2f + bodyHeight + legHeight * 2f,
            legWidth / 2f,
            legWidth / 2f
        )
    )
    addRoundRect(
        RoundRect(
            size.width / 2f - legWidth / 2f,
            headRadius * 2f + bodyHeight,
            size.width / 2f - legWidth / 2f + legWidth,
            headRadius * 2f + bodyHeight + legHeight,
            legWidth / 2f,
            legWidth / 2f
        )
    )
    addRoundRect(
        RoundRect(
            size.width / 2f - legWidth / 2f,
            headRadius * 2f + bodyHeight + legHeight,
            size.width / 2f - legWidth / 2f + legWidth,
            headRadius * 2f + bodyHeight + legHeight * 2f,
            legWidth / 2f,
            legWidth / 2f
        )
    )
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
                .clip(DroidShape)
                .background(Color.Yellow)
        )
    }
}