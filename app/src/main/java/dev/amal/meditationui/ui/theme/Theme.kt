package dev.amal.meditationui.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun MeditationUITheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {

    val systemUiController = rememberSystemUiController()
    if (darkTheme) {
        systemUiController.setSystemBarsColor(
            color = DeepBlue
        )
    } else {
        systemUiController.setSystemBarsColor(
            color = DeepBlue
        )
    }

    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}