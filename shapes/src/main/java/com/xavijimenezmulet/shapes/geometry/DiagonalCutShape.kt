package com.xavijimenezmulet.shapes.geometry

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 *   @author xavierjimenez
 *   @since 6/7/23
 *   @email xavijimenezmulet@macaqueconsulting.com
 */

val DiagonalStartCutShape: CutCornerShape = CutCornerShape(
    topStartPercent = 50,
    bottomEndPercent = 50
)

val DiagonalEndCutShape: CutCornerShape = CutCornerShape(
    topEndPercent = 50,
    bottomStartPercent = 50
)

@Preview
@Composable
fun DiagonalStartCutPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(DiagonalStartCutShape)
                .background(Color.Yellow)
        )
    }
}

@Preview
@Composable
fun DiagonalEndCutPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(DiagonalEndCutShape)
                .background(Color.Yellow)
        )
    }
}