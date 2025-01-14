# Animation

Animation functions are utility functions to define remembered animatables and animations with less code

### Animatable
```kotlin linenums="1"
val animatedColor by rememberAnimatable(Color.Red)
val animatedFloat by rememberAnimatable(0f)

animatedColor.animateTo(Color.Blue)
animatedFloat.animateTo(10f)
```

