package com.riyaz.rss.common.commonpages

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RssAboutPage(
    companyInfo: RssCompanyInfo = RssCompanyInfo()
) {
    AnimatedVisibility(
        visible = true,
        enter = fadeIn(tween(260)) + slideInVertically(
            initialOffsetY = { it / 14 },
            animationSpec = tween(260)
        )
    ) {
        Column(Modifier.padding(24.dp)) {
            Text(companyInfo.companyName, style = MaterialTheme.typography.headlineSmall)
            Text(
                "Mobile and PC software development, CCTV camera installation, networking and system administration.",
                Modifier.padding(top = 12.dp)
            )
            Text("Since 2015", Modifier.padding(top = 12.dp))
        }
    }
}
