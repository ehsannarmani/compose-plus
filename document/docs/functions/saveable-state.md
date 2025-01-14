# Saveable State

Saveable State functions are utility functions to define remembered saveable states with less code

### Normal State
```kotlin linenums="1"
val ourState by rememberSaveableState("it's our state")
val ourState by rememberSaveableState("username: $name",key = name)
```

### List State
```kotlin linenums="1"
val ourState by rememberSaveableListState("value1","value2","value3")
val ourState by rememberSaveableListState("value1","value2",name,keys = listOf(name))

val ourState by rememberSaveableListState(items = listOf("value1","value2","value3"))
val ourState by rememberSaveableListState(items = listOf("value1","value2",name), name /* vararg keys... */)
```

### Map State
```kotlin linenums="1"
val ourState by rememberSaveableMapState(
    1 to 2,
    20 to 10,
    ...
)
val ourState by rememberSaveableMapState(
    "ehsan" to grade1,
    "ali" to grade2,
    keys = listOf(grade1,grade2)
)
```

### Primitive Type States
```kotlin linenums="1"
val isEnabled by rememberSaveableBoolState()
val name by rememberSaveableStringState("ehsan")
val grade by rememberSaveableIntState(1)
val progress by rememberSaveableFloatState(0.5f)
val price by rememberSaveableDoubleState(2.5)
val bytes by rememberSaveableLongState(1024)
```