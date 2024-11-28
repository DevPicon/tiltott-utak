package la.devpicon.mobile.multiplatform.drawings.composables.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import drawingproject.composeapp.generated.resources.Res
import drawingproject.composeapp.generated.resources.label_basic_sample
import drawingproject.composeapp.generated.resources.label_possesion_doughnut_chart
import drawingproject.composeapp.generated.resources.label_workout_timer
import la.devpicon.mobile.multiplatform.drawings.ui.theme.DrawingTheme
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onNavigateToDoughnutChartScreen: () -> Unit,
    onNavigateToWorkoutPauseScreen: () -> Unit,
    onNavigateToBasicDrawingScreen: () -> Unit,
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val buttonModifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 48.dp)

        Button(
            onClick = onNavigateToBasicDrawingScreen,
            modifier = buttonModifier
        ) {
            Text(stringResource(Res.string.label_basic_sample))
        }

        Button(
            onClick = onNavigateToDoughnutChartScreen,
            modifier = buttonModifier
        ) {
            Text(stringResource(Res.string.label_possesion_doughnut_chart))
        }

        Button(
            onClick = onNavigateToWorkoutPauseScreen,
            modifier = buttonModifier
        ) {
            Text(stringResource(Res.string.label_workout_timer))
        }

        Button(
            onClick = {},
            modifier = buttonModifier
        ) {
            Text("Linea de comparación")
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    DrawingTheme(
        darkTheme = true,
        dynamicColor = false
    ) {
        Surface {
            HomeScreen(
                onNavigateToDoughnutChartScreen = {},
                onNavigateToWorkoutPauseScreen = {},
                onNavigateToBasicDrawingScreen = {},
            )
        }
    }
}