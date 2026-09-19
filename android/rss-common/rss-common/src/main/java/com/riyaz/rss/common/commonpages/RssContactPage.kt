package com.riyaz.rss.common.commonpages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RssContactPage(
    companyInfo: RssCompanyInfo = RssCompanyInfo()
) {
    Column(Modifier.padding(24.dp)) {
        Text(companyInfo.companyName)
        Text(companyInfo.website, Modifier.padding(top = 8.dp))
        Text(companyInfo.email, Modifier.padding(top = 8.dp))
        Text(companyInfo.phone, Modifier.padding(top = 8.dp))
    }
}
