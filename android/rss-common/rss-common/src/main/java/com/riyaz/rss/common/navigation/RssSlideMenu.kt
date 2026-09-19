package com.riyaz.rss.common.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.riyaz.rss.common.RssBrand
import com.riyaz.rss.common.components.RssSettingRow

@Composable
fun RssSlideMenu(
    userName: String?,
    userEmail: String?,
    items: List<RssMenuItem>,
    modifier: Modifier = Modifier
) {
    ModalDrawerSheet(modifier = modifier.fillMaxHeight()) {
        Column(Modifier.fillMaxWidth().padding(vertical = 20.dp)) {
            Text(
                text = "Welcome" + (userName?.let { ", " + it } ?: ""),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 4.dp)
            )
            if (!userEmail.isNullOrBlank()) {
                Text(
                    text = userEmail,
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 2.dp)
                )
            }
            Text(
                text = RssBrand.SHORT_NAME,
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 4.dp)
            )
            HorizontalDivider(Modifier.padding(vertical = 12.dp))
            items.forEach { item ->
                RssSettingRow(
                    icon = item.icon,
                    title = item.title,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}
