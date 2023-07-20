package com.xavijimenezmulet.shapes.food

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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

val LemonShape: RoundedCornerShape = RoundedCornerShape(
    topEndPercent = 65,
    topStartPercent = 5,
    bottomStartPercent = 65,
    bottomEndPercent = 10
)

@Preview
@Composable
fun LemonPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(LemonShape)
                .background(Color.Yellow)
        )
    }
}