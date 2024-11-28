package la.devpicon.mobile.multiplatform.drawings

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import drawingproject.composeapp.generated.resources.Res
import drawingproject.composeapp.generated.resources.back_button
import drawingproject.composeapp.generated.resources.compose_multiplatform
import la.devpicon.mobile.multiplatform.drawings.composables.DoughnutChart
import la.devpicon.mobile.multiplatform.drawings.composables.WorkoutPauseTimer
import la.devpicon.mobile.multiplatform.drawings.composables.screens.BasicDrawingScreen
import la.devpicon.mobile.multiplatform.drawings.composables.screens.DoughnutChartScreen
import la.devpicon.mobile.multiplatform.drawings.composables.screens.HomeScreen
import la.devpicon.mobile.multiplatform.drawings.ui.theme.DrawingTheme
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawingAppBar(
    currentScreen: Screens,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(stringResource(currentScreen.title)) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = stringResource(Res.string.back_button)
                    )
                }
            }
        }
    )
}

@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean
) {
    val navController: NavHostController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = Screens.valueOf(backStackEntry?.destination?.route ?: Screens.Home.name)

    DrawingTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {

        Scaffold(
            topBar = {
                DrawingAppBar(
                    currentScreen = currentScreen,
                    canNavigateBack = navController.previousBackStackEntry != null,
                    navigateUp = { navController.navigateUp() }
                )
            }
        ) {
            NavHost(
                navController = navController,
                startDestination = Screens.Home.name,
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(it)
            ) {
                composable(route = Screens.Home.name) {
                    HomeScreen(
                        onNavigateToBasicDrawingScreen = {
                            navController.navigate(Screens.Basic.name)
                        },
                        onNavigateToDoughnutChartScreen = {
                            navController.navigate(Screens.Doughnut.name)
                        },
                        onNavigateToWorkoutPauseScreen = {
                            navController.navigate(Screens.Workout.name)
                        }
                    )
                }
                composable(route = Screens.Basic.name) {
                    BasicDrawingScreen()
                }
                composable(route = Screens.Workout.name) {
                    WorkoutPauseTimer()
                }
                composable(route = Screens.Doughnut.name) {
                    DoughnutChartScreen()
                }
            }
        }

    }
}