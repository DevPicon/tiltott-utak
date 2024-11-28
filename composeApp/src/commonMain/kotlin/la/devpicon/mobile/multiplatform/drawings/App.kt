package la.devpicon.mobile.multiplatform.drawings

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import drawingproject.composeapp.generated.resources.Res
import drawingproject.composeapp.generated.resources.compose_multiplatform
import la.devpicon.mobile.multiplatform.drawings.composables.DoughnutChart
import la.devpicon.mobile.multiplatform.drawings.composables.WorkoutPauseTimer
import la.devpicon.mobile.multiplatform.drawings.ui.theme.DrawingTheme
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean
) {
    DrawingTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            WorkoutPauseTimer()
            DoughnutChart()
        }
    }
}