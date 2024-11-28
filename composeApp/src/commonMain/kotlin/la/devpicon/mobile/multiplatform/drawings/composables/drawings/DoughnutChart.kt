package la.devpicon.mobile.multiplatform.drawings.composables

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import drawingproject.composeapp.generated.resources.Res
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import drawingproject.composeapp.generated.resources.logo_barcelona
import drawingproject.composeapp.generated.resources.logo_boca
import org.jetbrains.compose.resources.imageResource

private const val TOTAL_ANGLE = 360f

@Composable
fun DoughnutChart(
    modifier: Modifier = Modifier,
    chartSize: Dp = 350.dp,
    percentageA: Float = 0.5f,
    percentageB: Float = 0.5f,
    chartColorA: Color = Color.Red,
    chartColorB: Color = Color.Blue,
    strokeWidth: Dp = 50.dp
) {

    val animationProgress = remember {
        Animatable(initialValue = 0f)
    }

    LaunchedEffect(key1 = Unit) {
        animationProgress.animateTo(
            targetValue = 1f,
            animationSpec = tween(
                durationMillis = 1000
            )
        )
    }

    val initialAngle = 270f
    val sweepAngleA: Float =
        TOTAL_ANGLE.times(percentageA.times(animationProgress.value)).times(-1) // Counter clockwise
    val sweepAngleB: Float = TOTAL_ANGLE.times(percentageB.times(animationProgress.value)) // clockwise

    val percentageValueA = percentageA.times(100.times(animationProgress.value)).toInt()
    val percentageValueB = percentageB.times(100.times(animationProgress.value)).toInt()

    val percentageTextA = "$percentageValueA%"
    val percentageTextB = "$percentageValueB%"

    val textMeasurer = rememberTextMeasurer()

    val teamLogoA = imageResource(Res.drawable.logo_boca)
    val teamLogoB = imageResource(Res.drawable.logo_barcelona)
    val imageSize = 70.dp

    Canvas(
        modifier = modifier
            .size(chartSize)
    ) {
        drawArcs(strokeWidth, chartColorA, initialAngle, sweepAngleA, chartColorB, sweepAngleB)
        drawTexts(chartColorA, textMeasurer, percentageTextB, percentageTextA, animationProgress.value)
        drawImages(teamLogoA, imageSize, teamLogoB, animationProgress.value)
    }
}

private fun DrawScope.drawImages(
    teamLogoA: ImageBitmap,
    imageSize: Dp,
    teamLogoB: ImageBitmap,
    alpha: Float
) {
    drawImage(
        image = teamLogoA,
        dstSize = IntSize(
            width = imageSize.roundToPx(),
            height = imageSize.roundToPx()
        ),
        dstOffset = IntOffset(
            x = (size.width.div(2).minus(imageSize.roundToPx().times(1.2))).toInt(),
            y = (size.width.div(2).minus(imageSize.roundToPx().div(2))).toInt()
        ),
        alpha = alpha
    )

    drawImage(
        image = teamLogoB,
        dstSize = IntSize(
            width = imageSize.roundToPx(),
            height = imageSize.roundToPx()
        ),
        dstOffset = IntOffset(
            x = ((size.width / 2) + (imageSize.roundToPx() * 0.2)).toInt(),
            y = ((size.width / 2) - (imageSize.roundToPx() / 2)).toInt()
        ),
        alpha = alpha
    )
}

private fun DrawScope.drawTexts(
    chartColorA: Color,
    textMeasurer: TextMeasurer,
    percentageTextB: String,
    percentageTextA: String,
    alpha: Float
) {
    // text style
    val textStyle = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        color = chartColorA.copy(alpha = alpha)
    )
    // top-left (offset)
    val topLeftA = Offset(
        x = 0f,
        y = 0f
    )

    val textLayoutResult = textMeasurer.measure(
        text = percentageTextB,
        style = textStyle
    )

    val topLeftB = Offset(
        x = size.width - textLayoutResult.size.width,
        y = 0f
    )
    // draw text
    drawText(
        text = percentageTextA,
        textMeasurer = textMeasurer,
        topLeft = topLeftA,
        style = textStyle
    )
    drawText(
        text = percentageTextB,
        textMeasurer = textMeasurer,
        topLeft = topLeftB,
        style = textStyle
    )
}

private fun DrawScope.drawArcs(
    strokeWidth: Dp,
    chartColorA: Color,
    initialAngle: Float,
    sweepAngleA: Float,
    chartColorB: Color,
    sweepAngleB: Float
) {
    // arc style
    val arcStyle = Stroke(
        width = strokeWidth.toPx()
    )
    // top left position (offset)
    val topLeft = Offset(
        x = 0f + strokeWidth.toPx() / 2,
        y = 0f + strokeWidth.toPx() / 2
    )
    // arc size
    val arcSize = Size(
        width = size.width - strokeWidth.toPx(),
        height = size.height - strokeWidth.toPx()
    )
    // draw arc
    drawArc(
        color = chartColorA,
        startAngle = initialAngle,
        sweepAngle = sweepAngleA,
        useCenter = false,
        topLeft = topLeft,
        size = arcSize,
        style = arcStyle
    )
    drawArc(
        color = chartColorB,
        startAngle = initialAngle,
        sweepAngle = sweepAngleB,
        useCenter = false,
        topLeft = topLeft,
        size = arcSize,
        style = arcStyle
    )
}
