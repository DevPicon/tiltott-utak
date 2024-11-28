package la.devpicon.mobile.multiplatform.drawings.composables.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import la.devpicon.mobile.multiplatform.drawings.composables.DoughnutChart
import la.devpicon.mobile.multiplatform.drawings.ui.theme.DrawingTheme
import org.jetbrains.compose.ui.tooling.preview.Preview
import kotlin.math.roundToInt

@Composable
fun DoughnutChartScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {

        var sliderPosition by remember { mutableFloatStateOf(0.5f) }

        Row(
            modifier = modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Team A: ${(sliderPosition.times(100)).roundToInt()}%")
            Text("Team B: ${((1f.minus(sliderPosition)).times(100).roundToInt())}%")
        }

        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            valueRange = 0f..1f,
            steps = 100

        )

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.TopCenter
        ) {
            DoughnutChart(
                percentageA = sliderPosition,
                percentageB = (1f - sliderPosition)
            )
        }
    }
}

@Preview
@Composable
private fun DoughnutChartScreenPreview() {
    DrawingTheme(
        darkTheme = false,
        dynamicColor = true
    ) {
        Surface() {
            DoughnutChartScreen()
        }
    }
}