
# **Compose Plus**

![Kotlin](https://img.shields.io/badge/Kotlin-2.1.0-orange)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![Kotlin Multiplatform](https://img.shields.io/badge/Kotlin-Multiplatform-blue)](https://kotlinlang.org/docs/reference/multiplatform.html)

![Platform](https://img.shields.io/badge/Android-3aab58)
![Platform](https://img.shields.io/badge/Desktop-097cd5)
![Platform](https://img.shields.io/badge/IOS-d32408)
![Platform](https://img.shields.io/badge/WasmJS-f7e025)

**Enhance Your Jetpack Compose Experience**

**Compose Plus** is an open-source multi-platform library designed to simplify Jetpack Compose development. It provides reusable components, utility functions, and extensions that streamline common tasks, making app development more efficient and easier.


## **Getting Started**

### **Add Library to Your Project**
[![Maven Central](https://img.shields.io/maven-central/v/ir.ehsannarmani.compose-plus/extensions?logo=kotlin&logoColor=%2325c2a0&label=Latest%20Version&color=%2325c2a0&cacheSeconds=0)](https://img.shields.io/maven-central/v/ir.ehsannarmani.compose-plus/extensions?logo=kotlin&logoColor=%2325c2a0&label=Latest%20Version&color=%2325c2a0&cacheSeconds=0)

```kotlin
implementation ("ir.ehsannarmani.compose-plus:extensions:latest_version")
implementation ("ir.ehsannarmani.compose-plus:functions:latest_version")
implementation ("ir.ehsannarmani.compose-plus:components:latest_version")
```

## **Project Structure**

**Compose Plus** is organized into three main sections:

### 1. Functions • [Documentation](https://nothing.com)
A variety of utility functions designed to simplify common operations in Jetpack Compose, such as using states and etc.


Some examples:
```kotlin
    /* ------------ States ------------ */
    val enabled by rememberBoolState()
    val age by rememberIntState(20)
    val user by rememberState(User(...))
    val points by rememberListState(20,19,17,10)
    /* ------------ States ------------ */

    /* ------------ Remembers ------------ */
    val filter = rememebrFilter(points){
        it > 20
    }
    val map = rememberMap(points){
        it + 5
    }
    /* ------------ Remembers ------------ */
```

### 2. Extensions • [Documentation](https://nothing.com)
Extensions that simplify and streamline the use of existing Jetpack Compose features, providing convenient and efficient ways to utilize current functionality, like extension functions for Modifier.

Some examples:
```kotlin
    /* ------------ Modifier Extensions ------------ */
    Modifier.ifThen(isEnabled){
        circleShape()
        background(Color.Red)
    }
    Modifier.infiniteRotation() , Modifier.infiniteColorChange(listOf(Color.Red,Color.Blue)) , ...
    Modifier.circleShape()      , Modifier.roundedShape(8.dp) , Modifier.smallRounded() , ...
    Modifier.centerAligned()    , Modifier.startAligned() , ...
    /* ------------ Modifier Extensions ------------ */

    /* ------------ Animations ------------ */
    val animatedProgress by progress.animate()
    val animatedColor by color.animate() 
    /* ------------ Animations ------------ */
```

### 3. Components • [Documentation](https://nothing.com)
A collection of pre-built UI components that make using commonly used Compose components easier and more efficient, while providing simpler integration.

Some examples:
```kotlin
    /* ------------ Spacers ------------ */
    Row {
        Component1()
        SmallSpacer()
        Component2()
    }
    /* ------------ Spacers ------------ */

    /* ------------ Direction ------------ */
    Ltr {
        Component1()
    }
    Rtl {
        Component2()
    }
    /* ------------ Direction ------------ */
```


## **Contributing**

We encourage contributions to **Compose Plus**! Your help in fixing bugs, adding new features, and improving documentation is invaluable.

### **Note**:
Please ensure that any contributions:
- Align with the goal of simplifying and enhancing existing features of Jetpack Compose.

---

## **License**

This project is licensed under the MIT License – see the [LICENSE](https://github.com/ehsannarmani/compose-plus/blob/master/LICENSE) file for more details.
