# Compose Shapes Repository

The Compose Shapes Repository is a collection of shape utilities and custom shapes designed specifically for use with Jetpack Compose. This repository aims to provide a comprehensive set of pre-defined shapes that can be easily used and customized in your Compose UI projects.

![shapes](https://github.com/xavijimenezmulet/shapes-for-jetpackcompose/assets/44567433/07c64790-da84-4958-81ec-2f65d934e683)
![shapes_!](https://github.com/xavijimenezmulet/shapes-for-jetpackcompose/assets/44567433/5b3b39cf-0a7a-4180-88e8-83caf990eba9)

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


