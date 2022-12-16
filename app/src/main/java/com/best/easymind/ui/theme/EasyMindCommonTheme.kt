package com.best.easymind.ui.theme

import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class EasyMindColors(
    val primaryText: Color,
    val primaryBackground: Color,
    val secondaryText: Color,
    val secondaryBackground: Color,
    val toolBarText: Color,
    val tintColor: Color,
    val errorColor: Color
)

object EasyMindTheme{
    val colors : EasyMindColors
        @Composable
        get() = LocalEasyMindColors.current

    val typography: Typography
        @Composable
        get() = Typography

    val shapes: Shapes
        @Composable
        get() = Shapes
}

val LocalEasyMindColors = staticCompositionLocalOf<EasyMindColors> {
    error("No colors provided")
}

val LocalEasyMindTypography = staticCompositionLocalOf<Typography> {
    error("No colors provided")
}

val LocalEasyMindShapes = staticCompositionLocalOf<Shapes> {
    error("No colors provided")
}