package com.xavijimenezmulet.shapes.weather

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
 *   @since 12/8/23
 *   @email xavijimenezmulet@macaqueconsulting.com
 */


val HandStarShape: Shape = object: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val baseWidth = 511.9977f
        val baseHeight = 510.4427f

        val path = Path().apply {
            moveTo(124.672f, 279.4457f)
            cubicTo(106.389f, 262.1447f, 33.28f, 256.5338f, 11.307f, 255.2108f)
            cubicTo(8.512f, 255.2108f, 5.504f, 256.1068f, 3.371f, 258.0908f)
            cubicTo(1.216f, 260.0958f, 0f, 262.9337f, 0f, 265.8777f)
            lineTo(0f, 457.8777f)
            cubicTo(0f, 463.7657f, 4.779f, 468.5447f, 10.667f, 468.5447f)
            lineTo(74.667f, 468.5447f)
            cubicTo(79.275f, 468.5447f, 83.371f, 465.5798f, 84.822f, 461.1848f)
            cubicTo(86.379f, 456.4058f, 123.137f, 343.5958f, 127.958f, 288.1288f)
            cubicTo(128.256f, 284.8858f, 127.019f, 281.7067f, 124.672f, 279.4457f)
            close()

            moveTo(200.832f, 108.4798f)
            lineTo(271.104f, 159.5517f)
            lineTo(244.267f, 242.1548f)
            cubicTo(242.838f, 246.5498f, 244.395f, 251.3707f, 248.15f, 254.0797f)
            cubicTo(251.905f, 256.7887f, 256.939f, 256.7887f, 260.694f, 254.0797f)
            lineTo(330.945f, 203.0287f)
            lineTo(401.196f, 254.0797f)
            cubicTo(403.073f, 255.4237f, 405.271f, 256.1277f, 407.468f, 256.1277f)
            cubicTo(409.665f, 256.1277f, 411.863f, 255.4447f, 413.74f, 254.0797f)
            cubicTo(417.473f, 251.3707f, 419.052f, 246.5488f, 417.623f, 242.1548f)
            lineTo(390.786f, 159.5517f)
            lineTo(461.037f, 108.5007f)
            cubicTo(464.77f, 105.7917f, 466.349f, 100.9697f, 464.92f, 96.5757f)
            cubicTo(463.491f, 92.1817f, 459.395f, 89.1947f, 454.765f, 89.1947f)
            lineTo(367.917f, 89.1947f)
            lineTo(341.077f, 6.5917f)
            cubicTo(338.218f, -2.1972f, 323.648f, -2.1972f, 320.789f, 6.5917f)
            lineTo(293.952f, 89.1947f)
            lineTo(207.104f, 89.1947f)
            cubicTo(202.475f, 89.1947f, 198.379f, 92.1817f, 196.949f, 96.5757f)
            cubicTo(195.52f, 100.9707f, 197.077f, 105.7708f, 200.832f, 108.4798f)
            close()

            moveTo(510.869f, 410.4318f)
            cubicTo(496.341f, 381.3968f, 462.656f, 365.8667f, 431.146f, 373.7597f)
            lineTo(382.911f, 385.8127f)
            cubicTo(383.636f, 390.6977f, 383.999f, 395.8177f, 383.999f, 401.1517f)
            lineTo(383.999f, 404.5438f)
            cubicTo(383.999f, 419.2428f, 374.015f, 432.0207f, 359.743f, 435.5837f)
            lineTo(331.028f, 442.7517f)
            cubicTo(323.476f, 444.6507f, 315.647f, 445.6107f, 307.753f, 445.6107f)
            cubicTo(301.374f, 445.6107f, 295.038f, 444.9918f, 288.937f, 443.7548f)
            lineTo(196.372f, 425.2378f)
            cubicTo(190.591f, 424.0858f, 186.836f, 418.4748f, 187.988f, 412.6938f)
            cubicTo(189.161f, 406.8908f, 194.879f, 403.2007f, 200.532f, 404.3307f)
            lineTo(293.119f, 422.8477f)
            cubicTo(303.743f, 424.9807f, 315.284f, 424.7037f, 325.823f, 422.0797f)
            cubicTo(325.823f, 422.0797f, 347.37f, 416.7037f, 354.559f, 414.9117f)
            cubicTo(359.338f, 413.6957f, 362.666f, 409.4288f, 362.666f, 404.5438f)
            cubicTo(362.666f, 403.7118f, 362.666f, 401.1728f, 362.666f, 401.1728f)
            cubicTo(362.666f, 397.2688f, 362.41f, 393.6207f, 361.962f, 390.1217f)
            cubicTo(361.834f, 389.1187f, 361.599f, 388.2228f, 361.429f, 387.2418f)
            cubicTo(361.002f, 384.7668f, 360.533f, 382.3347f, 359.85f, 380.0527f)
            cubicTo(359.551f, 379.0497f, 359.189f, 378.1328f, 358.847f, 377.1728f)
            cubicTo(358.1f, 375.0608f, 357.268f, 372.9917f, 356.266f, 371.0497f)
            cubicTo(355.818f, 370.1967f, 355.327f, 369.3647f, 354.837f, 368.5327f)
            cubicTo(353.728f, 366.6337f, 352.49f, 364.8207f, 351.104f, 363.0927f)
            cubicTo(350.549f, 362.3887f, 349.973f, 361.6847f, 349.355f, 361.0237f)
            cubicTo(347.819f, 359.2957f, 346.112f, 357.6747f, 344.278f, 356.1387f)
            cubicTo(343.638f, 355.6057f, 343.019f, 355.0508f, 342.337f, 354.5178f)
            cubicTo(340.289f, 352.9608f, 338.028f, 351.5097f, 335.66f, 350.1447f)
            cubicTo(335.02f, 349.7817f, 334.423f, 349.3557f, 333.74f, 349.0137f)
            cubicTo(330.988f, 347.5417f, 328.001f, 346.2407f, 324.823f, 345.0027f)
            cubicTo(324.354f, 344.8317f, 323.948f, 344.6188f, 323.479f, 344.4268f)
            cubicTo(319.724f, 343.0398f, 315.692f, 341.8028f, 311.362f, 340.7148f)
            lineTo(158.466f, 306.7307f)
            cubicTo(155.607f, 306.1117f, 152.663f, 306.6668f, 150.231f, 308.2878f)
            cubicTo(147.799f, 309.9088f, 146.156f, 312.4478f, 145.644f, 315.3068f)
            cubicTo(137.964f, 359.0188f, 121.303f, 415.7437f, 112.065f, 445.6747f)
            cubicTo(110.358f, 451.2217f, 113.388f, 457.1098f, 118.87f, 458.9438f)
            lineTo(241.515f, 499.8398f)
            cubicTo(257.942f, 506.0478f, 270.699f, 510.4427f, 285.76f, 510.4427f)
            lineTo(285.781f, 510.4427f)
            cubicTo(307.669f, 510.4427f, 332.458f, 501.1628f, 388.373f, 478.2508f)
            lineTo(505.706f, 424.9178f)
            cubicTo(508.33f, 423.7228f, 510.378f, 421.5047f, 511.359f, 418.7737f)
            cubicTo(512.363f, 416.0427f, 512.171f, 413.0348f, 510.869f, 410.4318f)
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
fun HandStarShapePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(HandStarShape)
                .background(Color.Yellow)
        )
    }
}