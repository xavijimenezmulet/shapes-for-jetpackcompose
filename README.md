# Compose Shapes Repository

[![Download](https://jitpack.io/v/xavijimenezmulet/shapes-for-jetpackcompose.svg)](https://jitpack.io/#xavijimenezmulet/shapes-for-jetpackcompose)
[![API](https://img.shields.io/badge/API-26%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=26)
![Build Status](https://github.com/Dhaval2404/ImagePicker/workflows/Build/badge.svg)
![PR Welcome](https://camo.githubusercontent.com/b0ad703a46e8b249ef2a969ab95b2cb361a2866ecb8fe18495a2229f5847102d/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f5052732d77656c636f6d652d627269676874677265656e2e737667)
![Language](https://img.shields.io/badge/language-Kotlin-orange.svg)
[![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)
[![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=102)](https://opensource.org/licenses/Apache-2.0)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](https://github.com/xavijimenezmulet/SnackBar/blob/main/LICENSE)

[![ko-fi](https://www.ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/xavijimenez)

The Compose Shapes Repository is a collection of shape utilities and custom shapes designed specifically for use with Jetpack Compose. This repository aims to provide a comprehensive set of pre-defined shapes that can be easily used and customized in your Compose UI projects.

<img src="https://github.com/xavijimenezmulet/shapes-for-jetpackcompose/assets/44567433/2188b026-0b50-4338-92ba-7a1d4ff74f31" width="250" height="500"/> <img src="https://github.com/xavijimenezmulet/shapes-for-jetpackcompose/assets/44567433/35984105-9bdf-48b9-9348-737eee0c19a0" width="250" height="500"/> 

## Features

- **Ready-to-use Shapes**: The repository offers a wide range of pre-defined shapes such as circles, rectangles, triangles, stars, and more. These shapes can be directly used in your Compose UI code, saving you time and effort.

- **Custom Shape Generators**: The repository includes utility functions and generators that allow you to create custom shapes with various parameters, such as radius, corner radius, angles, and more. These generators provide flexibility and enable you to create unique and visually appealing shapes.

- **Shape Extensions**: The repository provides extensions for the `Modifier` class in Compose, allowing you to apply shapes to different Compose components easily. These extensions simplify the process of applying shapes and provide a seamless integration with the Compose UI framework.

- **Documentation and Examples**: Each shape in the repository comes with detailed documentation and usage examples, making it easy for developers to understand and utilize the shapes effectively in their projects. The documentation includes information about available customization options and recommendations for best practices.

## Getting Started

To get started with the Compose Shapes Repository, simply clone the repository and import the desired shape utilities or custom shapes into your Compose project. You can then use these shapes in your Compose UI code by applying them to the appropriate components using the provided extensions.

```bash
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```

Step 2. Add the dependency:

```bash
dependencies {
	implementation "com.github.xavijimenezmulet:shapes-for-jetpackcompose:$latest_version"
}
```

Simple usage:

```kotlin
val HeartShape: Shape = object : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path().apply {
            heartPath(size = size)
            close()
        }
        return Outline.Generic(path)
    }
}
```

Now with preview:

```kotlin
@Preview
@Composable
fun HeartPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .clip(HeartShape)
                .background(Color.Yellow)
        )
    }
}
```
## Contributions

Specials thanks to:

| Contributor | Features | Github Link |
| :---         |     :---      |          :--- |
| `@afalabarce`   | TopAppBarShape     | [afalabarce](https://github.com/afalabarce)    |

| Contributor | Features | | Github Link |
| --- | --- | --- |
| `@afalabarce` | TopAppBarShape | [afalabarce](https://github.com/afalabarce)  | 

Any help to collect shapes and improve the code will be welcome.
