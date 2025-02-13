package la.devpicon.mobile.multiplatform.drawings.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
actual fun DrawingTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if(darkTheme) darkScheme else lightScheme,
        typography = Typography,
        content = content
    )
}