package la.devpicon.mobile.multiplatform.drawings

import drawingproject.composeapp.generated.resources.Res
import drawingproject.composeapp.generated.resources.label_basic_sample
import drawingproject.composeapp.generated.resources.label_possesion_doughnut_chart
import drawingproject.composeapp.generated.resources.label_workout_timer
import drawingproject.composeapp.generated.resources.label_home
import org.jetbrains.compose.resources.StringResource

enum class Screens(
    val router: String,
    val title: StringResource
) {
    Doughnut(router = "doughnut", title = Res.string.label_possesion_doughnut_chart),
    Workout("workout", Res.string.label_workout_timer),
    Basic("basic", Res.string.label_basic_sample),
    Home("home", Res.string.label_home),
}