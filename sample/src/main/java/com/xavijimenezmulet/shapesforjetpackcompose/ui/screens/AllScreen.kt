package com.xavijimenezmulet.shapesforjetpackcompose.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.xavijimenezmulet.shapesforjetpackcompose.ui.common.Shapes
import java.nio.file.WatchEvent

/**
 *   @author xavierjimenez
 *   @since 20/7/23
 *   @email xavijimenezmulet@macaqueconsulting.com
 */

@Composable
fun AllScreen(
    paddingValues: PaddingValues,
    list: List<Shapes>,
    text: String
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        LazyVerticalGrid(
            modifier = Modifier
                .fillMaxSize(),
            columns = GridCells.Fixed(2)
        ) {
            items(list.size) { item ->
                Card(
                    modifier = Modifier.fillMaxWidth().padding(10.dp),
                    elevation = CardDefaults.cardElevation(8.dp),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth().background(Color(0xFF003049)),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(16.dp)
                                .size(50.dp)
                                .clip(list[item].shape)
                                .background(Color.Red),
                            contentAlignment = Alignment.Center,
                            content = {}
                        )
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.White),
                            text = list[item].title,
                            fontWeight = FontWeight.Bold,
                            fontSize = list[item].textSize.sp,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}
