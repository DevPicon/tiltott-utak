package la.devpicon.mobile.multiplatform.drawings.composables.screens

import androidx.compose.ui.graphics.Color
import kotlinx.cinterop.ExperimentalForeignApi

import kotlinx.cinterop.memScoped
import kotlinx.cinterop.useContents
import platform.CoreGraphics.*
import platform.Foundation.*
import platform.UIKit.*

@OptIn(ExperimentalForeignApi::class)
actual fun exportPixelArt(gridColors: List<Color>, width: Int, height: Int) {
    // Define the size of the image
    val imageSize = platform.CoreGraphics.CGSizeMake(width = width.toDouble(), height = height.toDouble())
    val scale = UIScreen.mainScreen.scale // Use the screen's scale for high-quality output

    // Start image context
    UIGraphicsBeginImageContextWithOptions(imageSize, false, scale)
    val context = UIGraphicsGetCurrentContext() ?: return

    var cellWidth: Double = Double.MIN_VALUE
    var cellHeight: Double = Double.MIN_VALUE

    imageSize.useContents {
        cellWidth = this.width / width
        cellHeight = this.height / height
    }

    // Draw the grid
    for (y in 0 until height) {
        for (x in 0 until width) {
            val color = gridColors[y * width + x]
            memScoped {
                val uiColor = UIColor.colorWithRed(
                    red = color.red.toDouble(),
                    green = color.green.toDouble(),
                    blue = color.blue.toDouble(),
                    alpha = color.alpha.toDouble()
                )
                uiColor.setFill() // Set the fill color
                val rect = CGRectMake(
                    x = x * cellWidth,
                    y = y * cellHeight,
                    width = cellWidth,
                    height = cellHeight
                )
                CGContextFillRect(context, rect)
            }
        }
    }

    // Get the resulting image
    val image = UIGraphicsGetImageFromCurrentImageContext()
    UIGraphicsEndImageContext()

    // Save the image to the Photos album
    if (image != null) {
        UIImageWriteToSavedPhotosAlbum(image, null, null, null)
    }
}
