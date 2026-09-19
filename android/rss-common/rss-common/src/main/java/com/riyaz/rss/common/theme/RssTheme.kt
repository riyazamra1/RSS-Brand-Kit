package com.riyaz.rss.common.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val RssGold = Color(0xFFC9A227)

private val LightColors = lightColorScheme(primary = RssGold)
private val DarkColors = darkColorScheme(primary = RssGold)

@Composable
fun RssTheme(
    darkTheme: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content
    )
}
