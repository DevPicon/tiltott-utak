package la.devpicon.mobile.multiplatform.drawings.composables.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import la.devpicon.mobile.multiplatform.drawings.composables.WorkoutPauseTimer
import la.devpicon.mobile.multiplatform.drawings.ui.theme.DrawingTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun WorkoutTimerScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        WorkoutPauseTimer()
    }
}

@Preview
@Composable
private fun WorkoutPauseTimerScreenPreview() {
    DrawingTheme(
        darkTheme = false,
        dynamicColor = true
    ) {
        Surface() {
            WorkoutTimerScreen()
        }
    }
}