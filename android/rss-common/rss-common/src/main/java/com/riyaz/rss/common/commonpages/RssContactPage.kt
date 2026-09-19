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
fun RssContactPage(
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
            Text(companyInfo.website, Modifier.padding(top = 8.dp))
            Text(companyInfo.email, Modifier.padding(top = 8.dp))
            Text(companyInfo.phone, Modifier.padding(top = 8.dp))
        }
    }
}
