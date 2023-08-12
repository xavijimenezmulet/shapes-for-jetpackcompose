package com.xavijimenezmulet.shapesforjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.xavijimenezmulet.shapes.conversation.BubbleShape
import com.xavijimenezmulet.shapes.food.LemonShape
import com.xavijimenezmulet.shapes.games.PacmanShape
import com.xavijimenezmulet.shapes.geometry.CircularShape
import com.xavijimenezmulet.shapes.love.HeartShape
import com.xavijimenezmulet.shapes.programming.AndroidShape
import com.xavijimenezmulet.shapes.topbar.AppBarShape
import com.xavijimenezmulet.shapes.weather.MoonShape
import com.xavijimenezmulet.shapes.weather.StarShape
import com.xavijimenezmulet.shapesforjetpackcompose.ui.common.getListByIndex
import com.xavijimenezmulet.shapesforjetpackcompose.ui.screens.AllScreen
import com.xavijimenezmulet.shapesforjetpackcompose.ui.theme.ShapesForJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShapesForJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Grid()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Grid() {
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(AppBarShape),
                title = {
                    Text(
                        text = "TopBar Shape",
                        fontWeight = FontWeight.Bold,
                        fontSize = 17.sp,
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xFF003049))
            )
        }
    ) { paddingValues ->
        var index = 0
        var text = ""
        NavHost(navController = navController, startDestination = "home") {
            composable("home") {
                OptionsGrid(paddingValues) { i, title ->
                    navController.navigate("All")
                    text = title
                    index = i
                }
            }
            composable("All") {
                AllScreen(
                    paddingValues = paddingValues,
                    getListByIndex(index),
                    text
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GridPreview() {
    ShapesForJetpackComposeTheme {
        Grid()
    }
}

sealed class Option(val text: String, val image: Shape) {
    object All : Option("All", StarShape(5))
    object Geometry : Option("Geometry", CircularShape)
    object Programming : Option("Programming", AndroidShape)
    object Weather : Option("Weather", MoonShape)
    object Food : Option("Food", LemonShape)
    object Conversation : Option("Conversation", BubbleShape)
    object Love : Option("Love", HeartShape)
    object Games : Option("Games", PacmanShape(60f))
}

private val optionItems = listOf(
    Option.All,
    Option.Geometry,
    Option.Programming,
    Option.Weather,
    Option.Food,
    Option.Conversation,
    Option.Love,
    Option.Games,
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OptionsGrid(
    paddingValues: PaddingValues,
    cardClick: (Int, String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Shapes",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        LazyVerticalGrid(
            columns = GridCells.Adaptive(128.dp),
            content = {
                items(optionItems.size) { index ->
                    val option = optionItems[index]
                    Card(
                        modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(8.dp),
                        colors = CardDefaults.cardColors(containerColor = Color(0xFF003049)),
                        onClick = {
                            cardClick(index, option.text)
                        }
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(40.dp)
                                    .clip(option.image)
                                    .background(Color.Red)
                            )
                            Text(
                                modifier = Modifier.padding(5.dp),
                                text = option.text,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                color = Color.White,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        )
    }
}

