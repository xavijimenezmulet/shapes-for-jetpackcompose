package com.xavijimenezmulet.shapesforjetpackcompose.ui.common

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Shape
import com.xavijimenezmulet.shapes.geometry.*
import com.xavijimenezmulet.shapes.conversation.*
import com.xavijimenezmulet.shapes.programming.*
import com.xavijimenezmulet.shapes.weather.*
import com.xavijimenezmulet.shapes.games.*
import com.xavijimenezmulet.shapes.love.*
import com.xavijimenezmulet.shapes.food.*
import kotlin.reflect.full.isSubclassOf

open class Shapes(val shape: Shape, val title: String, val textSize: Int = 15) {

    companion object {
        inline fun <reified T : Shapes> valueOf(value: Shape): T? {
            return T::class.nestedClasses
                .filter { clazz -> clazz.isSubclassOf(T::class) }
                .map { clazz -> clazz.objectInstance }
                .filterIsInstance<T>()
                .associateBy { it.shape }[value]
        }

        inline fun <reified T : Shapes> values(): List<T> =
            T::class.nestedClasses
                .filter { clazz -> clazz.isSubclassOf(T::class) }
                .map { clazz -> clazz.objectInstance }
                .filterIsInstance<T>()
    }
}

@Stable
sealed class ConversationShapes(shape: Shape, title: String, textSize: Int = 15) :
    Shapes(shape, title, textSize) {

    object Bubble : ConversationShapes(shape = BubbleShape, "Bubble")

    companion object {
        fun valueOf(value: ConversationShapes): Shapes? = valueOf(value as Shape)
        fun values(): List<ConversationShapes> = Shapes.values()
    }
}

@Stable
sealed class FoodShapes(shape: Shape, title: String, textSize: Int = 15) :
    Shapes(shape, title, textSize) {

    object Lemon : FoodShapes(shape = LemonShape, "Lemon")

    companion object {
        fun valueOf(value: FoodShapes): Shapes? = valueOf(value as Shape)
        fun values(): List<FoodShapes> = Shapes.values()
    }
}

@Stable
sealed class GamesShapes(shape: Shape, title: String, textSize: Int = 15) :
    Shapes(shape, title, textSize) {

    object Pacman : GamesShapes(shape = PacmanShape(60f), "Pacman")

    companion object {
        fun valueOf(value: GamesShapes): Shapes? = valueOf(value as Shape)
        fun values(): List<GamesShapes> = Shapes.values()
    }
}

@Stable
sealed class GeometryShapes(shape: Shape, title: String, textSize: Int = 15) :
    Shapes(shape, title, textSize) {

    object Diamond : GeometryShapes(shape = DiamondShape, "Diamond")
    object Square : GeometryShapes(shape = SquareShape, "Square")
    object Circle : GeometryShapes(shape = CircularShape, "Circle")
    object Triangle : GeometryShapes(shape = TriangleShape, "Triangle")
    object Polygon : GeometryShapes(shape = PolygonShape, "Polygon")
    object Parallelogram : GeometryShapes(shape = ParallelogramShape(70f), "Parallelogram")
    object Ticket : GeometryShapes(shape = TicketShape(24f), "Ticket")
    object CutSquare : GeometryShapes(shape = CutSquareShape, "Cut Square")
    object DiagonalStartCut : GeometryShapes(shape = DiagonalStartCutShape, "Diagonal Start")
    object SemiCircle : GeometryShapes(shape = SemicircleShape, "Semi Circle")
    object Octagon : GeometryShapes(shape = OctagonShape, "Octagon")

    companion object {
        fun valueOf(value: GeometryShapes): Shapes? = valueOf(value as Shape)
        fun values(): List<GeometryShapes> = Shapes.values()
    }
}

@Stable
sealed class LoveShapes(shape: Shape, title: String, textSize: Int = 15) :
    Shapes(shape, title, textSize) {

    object Heart : LoveShapes(shape = HeartShape, "Heart")

    companion object {
        fun valueOf(value: LoveShapes): Shapes? = valueOf(value as Shape)
        fun values(): List<LoveShapes> = Shapes.values()
    }
}

@Stable
sealed class ProgrammingShapes(shape: Shape, title: String, textSize: Int = 15) :
    Shapes(shape, title, textSize) {

    object Android : ProgrammingShapes(shape = AndroidShape, "Android")
    object Apple : ProgrammingShapes(shape = AppleShape, "Apple")
    object Java : ProgrammingShapes(shape = JavaShape, "Java")
    object Kotlin : ProgrammingShapes(shape = KotlinShape, "Kotlin")
    object CPlusPlus : ProgrammingShapes(shape = CPlusPlusShape, "C++")
    object CSharp : ProgrammingShapes(shape = CSharpShape, "C#")
    object CNormal : ProgrammingShapes(shape = CShape, "C")
    object Gradle : ProgrammingShapes(shape = GradleShape, "Gradle")

    companion object {
        fun valueOf(value: ProgrammingShapes): Shapes? = valueOf(value as Shape)
        fun values(): List<ProgrammingShapes> = Shapes.values()
    }
}

@Stable
sealed class WeatherShapes(shape: Shape, title: String, textSize: Int = 15) :
    Shapes(shape, title, textSize) {

    object Star : WeatherShapes(shape = StarShape(5), "Star")
    object Moon : WeatherShapes(shape = MoonShape, "Moon")

    companion object {
        fun valueOf(value: WeatherShapes): Shapes? = valueOf(value as Shape)
        fun values(): List<WeatherShapes> = Shapes.values()
    }
}

fun getAllLists() : List<Shapes> {
    val list = arrayListOf<Shapes>()
    list.addAll(GeometryShapes.values())
    list.addAll(ProgrammingShapes.values())
    list.addAll(WeatherShapes.values())
    list.addAll(FoodShapes.values())
    list.addAll(ConversationShapes.values())
    list.addAll(LoveShapes.values())
    list.addAll(GamesShapes.values())
    return list
}

fun getListByIndex(index: Int) : List<Shapes> = when(index) {
    0 -> getAllLists()
    1 -> GeometryShapes.values()
    2 -> ProgrammingShapes.values()
    3 -> WeatherShapes.values()
    4 -> FoodShapes.values()
    5 -> ConversationShapes.values()
    6 -> LoveShapes.values()
    7 -> GamesShapes.values()
    else -> getAllLists()
}