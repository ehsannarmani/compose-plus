# Activity Contract

Activity Contract functions are utility functions to launch activity contract functions with less code

### Permission Request
LaunchPermissionRequest function will launch a permission request in android in the first time of composable render.

!!! Example "Single Permission Request"
    ```kotlin linenums="1" hl_lines="2 3 4 5 6 7"
    setContent {
        LaunchPermissionRequest(
            permission = Manifest.Permission.POST_NOTIFICATIONS,
            onResult = { 
            
            }
        )
    }
    ```

!!! Example "Multiple Permission Request"
    ```kotlin linenums="1" hl_lines="2 3 4 5 6 7 8 9 10"
    setContent {
        LaunchPermissionRequest(
            permissions = listOf(
                Manifest.Permission.POST_NOTIFICATIONS,
                Manifest.Permission.READ_EXTERNAL_STORAGE
            ),
            onResult = {
    
            }
        )
    }
    ```


