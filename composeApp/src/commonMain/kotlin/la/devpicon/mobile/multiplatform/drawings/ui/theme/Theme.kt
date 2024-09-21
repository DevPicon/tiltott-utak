package la.devpicon.mobile.multiplatform.drawings.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.backgroundDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.backgroundDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.backgroundDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.backgroundLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.backgroundLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.backgroundLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.errorContainerDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.errorContainerDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.errorContainerDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.errorContainerLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.errorContainerLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.errorContainerLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.errorDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.errorDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.errorDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.errorLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.errorLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.errorLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inverseOnSurfaceDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inverseOnSurfaceDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inverseOnSurfaceDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inverseOnSurfaceLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inverseOnSurfaceLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inverseOnSurfaceLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inversePrimaryDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inversePrimaryDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inversePrimaryDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inversePrimaryLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inversePrimaryLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inversePrimaryLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inverseSurfaceDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inverseSurfaceDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inverseSurfaceDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inverseSurfaceLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inverseSurfaceLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.inverseSurfaceLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onBackgroundDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onBackgroundDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onBackgroundDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onBackgroundLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onBackgroundLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onBackgroundLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onErrorContainerDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onErrorContainerDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onErrorContainerDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onErrorContainerLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onErrorContainerLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onErrorContainerLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onErrorDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onErrorDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onErrorDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onErrorLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onErrorLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onErrorLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onPrimaryContainerDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onPrimaryContainerDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onPrimaryContainerDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onPrimaryContainerLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onPrimaryContainerLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onPrimaryContainerLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onPrimaryDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onPrimaryDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onPrimaryDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onPrimaryLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onPrimaryLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onPrimaryLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSecondaryContainerDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSecondaryContainerDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSecondaryContainerDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSecondaryContainerLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSecondaryContainerLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSecondaryContainerLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSecondaryDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSecondaryDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSecondaryDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSecondaryLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSecondaryLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSecondaryLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSurfaceDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSurfaceDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSurfaceDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSurfaceLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSurfaceLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSurfaceLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSurfaceVariantDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSurfaceVariantDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSurfaceVariantDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSurfaceVariantLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSurfaceVariantLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onSurfaceVariantLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onTertiaryContainerDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onTertiaryContainerDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onTertiaryContainerDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onTertiaryContainerLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onTertiaryContainerLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onTertiaryContainerLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onTertiaryDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onTertiaryDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onTertiaryDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onTertiaryLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onTertiaryLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.onTertiaryLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.outlineDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.outlineDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.outlineDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.outlineLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.outlineLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.outlineLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.outlineVariantDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.outlineVariantDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.outlineVariantDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.outlineVariantLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.outlineVariantLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.outlineVariantLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.primaryContainerDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.primaryContainerDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.primaryContainerDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.primaryContainerLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.primaryContainerLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.primaryContainerLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.primaryDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.primaryDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.primaryDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.primaryLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.primaryLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.primaryLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.scrimDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.scrimDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.scrimDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.scrimLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.scrimLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.scrimLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.secondaryContainerDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.secondaryContainerDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.secondaryContainerDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.secondaryContainerLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.secondaryContainerLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.secondaryContainerLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.secondaryDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.secondaryDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.secondaryDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.secondaryLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.secondaryLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.secondaryLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceBrightDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceBrightDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceBrightDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceBrightLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceBrightLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceBrightLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerHighDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerHighDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerHighDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerHighLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerHighLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerHighLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerHighestDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerHighestDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerHighestDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerHighestLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerHighestLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerHighestLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerLowDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerLowDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerLowDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerLowLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerLowLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerLowLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerLowestDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerLowestDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerLowestDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerLowestLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerLowestLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceContainerLowestLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceDimDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceDimDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceDimDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceDimLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceDimLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceDimLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceVariantDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceVariantDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceVariantDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceVariantLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceVariantLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.surfaceVariantLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.tertiaryContainerDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.tertiaryContainerDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.tertiaryContainerDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.tertiaryContainerLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.tertiaryContainerLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.tertiaryContainerLightMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.tertiaryDark
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.tertiaryDarkHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.tertiaryDarkMediumContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.tertiaryLight
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.tertiaryLightHighContrast
import la.devpicon.mobile.compose.multiplatform.samples.ui.theme.tertiaryLightMediumContrast

val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
expect fun DrawingTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

