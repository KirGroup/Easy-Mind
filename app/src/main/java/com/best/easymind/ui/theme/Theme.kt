package com.best.easymind.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider


@Composable
fun EasyMindTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {

    val colors = if (darkTheme) {
        baseDarkPalette
    } else {
        baseLightPalette
    }

    CompositionLocalProvider(
        LocalEasyMindColors provides colors,
        LocalEasyMindTypography provides Typography,
        LocalEasyMindShapes provides Shapes,
        content = content
    )
}