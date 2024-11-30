package la.devpicon.mobile.multiplatform.drawings.composables.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import la.devpicon.mobile.multiplatform.drawings.ui.theme.DrawingTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun PixelArtScreen(modifier: Modifier = Modifier) {
    val gridWidth = 27
    val gridHeight = 54
    val squareSize = 20.dp
    val colors = listOf(
        Color.Blue,
        Color.Cyan,
        Color.Green,
        Color.Yellow,
        Color(0xfffe9441),
        Color.Red,
        Color(0xff5c3613),
        Color.Black,
        Color.White
    )
    var selectedColor by remember { mutableStateOf(Color.Black) }
    var tapGestureOffset by remember { mutableStateOf(Offset.Zero) }
    var calculatedCellSize by remember { mutableFloatStateOf(squareSize.value) }
    val gridColors = remember {
        mutableStateListOf<Color>().apply {
            repeat(gridWidth * gridHeight) {
                add(Color.White)
            }
        }
    }

    Column(modifier = Modifier.fillMaxSize()) {
        // Color picker
        Row(
            modifier = Modifier.padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            colors.forEach { color ->
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .background(color)
                        .clickable { selectedColor = color }
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Row {
                    Text("x:${tapGestureOffset.x}")
                    Text("y:${tapGestureOffset.y}")
                }

                Row {
                    Text("column:${(tapGestureOffset.x / calculatedCellSize).toInt()}")
                    Text("row:${(tapGestureOffset.y / calculatedCellSize).toInt()}")
                }
            }
            Column(modifier = Modifier.padding(16.dp)) {
                // Export Button
                Button(
                    onClick = { exportPixelArt(gridColors, gridWidth, gridHeight) },
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    Text("Export")
                }
            }
        }

        // Pixel Art Grid
        Canvas(
            modifier = Modifier
                .size((gridWidth * squareSize.value).dp, (gridHeight * squareSize.value).dp)
                .pointerInput(Unit) {
                    detectTapGestures { offset ->
                        tapGestureOffset = offset
                        val x = (offset.x / calculatedCellSize).toInt()
                        val y = (offset.y / calculatedCellSize).toInt()
                        val index = y * gridWidth + x
                        if (index in gridColors.indices) {
                            gridColors[index] = selectedColor
                        }
                    }
                }
        ) {
            val cellSize = size.width / gridWidth
            calculatedCellSize = cellSize
            for (y in 0 until gridHeight) {
                for (x in 0 until gridWidth) {
                    val color = gridColors[y * gridWidth + x]
                    drawRect(
                        color = color,
                        topLeft = Offset(x * cellSize, y * cellSize),
                        size = Size(cellSize, cellSize),
                        style = Fill
                    )
                    drawRect(
                        color = Color.Black,
                        topLeft = Offset(x * cellSize, y * cellSize),
                        size = Size(cellSize, cellSize),
                        style = Stroke(width = 1f)
                    )
                }
            }
        }
    }
}

// Export logic
expect fun exportPixelArt(gridColors: List<Color>, width: Int, height: Int)


@Preview
@Composable
fun PixelArtScreenPreview() {
    DrawingTheme(false, false) {
        Surface {
            PixelArtScreen()
        }
    }
}