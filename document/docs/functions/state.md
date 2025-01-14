# State

State functions are utility functions to define remembered states with less code

### Normal State
```kotlin linenums="1"
val ourState by rememberState("it's our state")
val ourState by rememberState("username: $name",key = name)
```

### List State
```kotlin linenums="1"
val ourState by rememberListState("value1","value2","value3")
val ourState by rememberListState("value1","value2",name,keys = listOf(name))

val ourState by rememberListState(items = listOf("value1","value2","value3"))
val ourState by rememberListState(items = listOf("value1","value2",name), name /* vararg keys... */)
```

### Map State
```kotlin linenums="1"
val ourState by rememberMapState(
    1 to 2,
    20 to 10,
    ...
)
val ourState by rememberMapState(
    "ehsan" to grade1,
    "ali" to grade2,
    keys = listOf(grade1,grade2)
)
```

### Primitive Type States
```kotlin linenums="1"
val isEnabled by rememberBoolState()
val name by rememberStringState("ehsan")
val grade by rememberIntState(1)
val progress by rememberFloatState(0.5f)
val price by rememberDoubleState(2.5)
val bytes by rememberLongState(1024)
```

