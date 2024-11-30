package la.devpicon.mobile.multiplatform.drawings.composables.screens

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.os.Environment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import java.io.FileOutputStream

actual fun exportPixelArt(
    gridColors: List<Color>,
    width: Int,
    height: Int
) {
    val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(bitmap)

    val cellSize = bitmap.width / width.toFloat()

    for (y in 0 until height) {
        for (x in 0 until width) {
            val color = gridColors[y * width + x].toArgb()
            val paint = Paint().apply { this.color = color }
            canvas.drawRect(
                Rect(
                    (x * cellSize).toInt(),
                    (y * cellSize).toInt(),
                    ((x + 1) * cellSize).toInt(),
                    ((y + 1) * cellSize).toInt()
                ),
                paint
            )
        }
    }

    // Save the bitmap
    val path = Environment.getExternalStorageDirectory().absolutePath + "/pixel_art.png"
    FileOutputStream(path).use { out ->
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, out)
    }
}