package com.riyaz.rss.common.commonpages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RssAboutPage(
    companyInfo: RssCompanyInfo = RssCompanyInfo()
) {
    Column(Modifier.padding(24.dp)) {
        Text(companyInfo.companyName)
        Text(
            "Mobile and PC software development, CCTV camera installation, networking and system administration.",
            Modifier.padding(top = 12.dp)
        )
        Text("Since 2015", Modifier.padding(top = 12.dp))
    }
}
