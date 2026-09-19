package com.riyaz.rss.common.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.riyaz.rss.common.RssBrand
import com.riyaz.rss.common.components.RssSettingRow

@Composable
fun RssSlideMenu(
    userName: String?,
    userEmail: String?,
    items: List<RssMenuItem>,
    logo: Painter? = null,
    modifier: Modifier = Modifier
) {
    ModalDrawerSheet(
        modifier = modifier
            .fillMaxHeight()
            .padding(vertical = 10.dp, horizontal = 8.dp),
        drawerShape = RoundedCornerShape(28.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 18.dp, horizontal = 10.dp)
        ) {
            if (logo != null) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.Transparent)
                        .padding(horizontal = 12.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = logo,
                        contentDescription = "Razeen Secure Solution logo",
                        modifier = Modifier.size(76.dp)
                    )
                }
            }

            Text(
                text = "Welcome" + (userName?.let { ", $it" } ?: ""),
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 5.dp)
            )

            if (!userEmail.isNullOrBlank()) {
                Text(
                    text = userEmail,
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 2.dp)
                )
            }

            Text(
                text = RssBrand.SHORT_NAME,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 5.dp)
            )

            HorizontalDivider(Modifier.padding(vertical = 12.dp))

            items.forEach { item ->
                RssSettingRow(
                    icon = item.icon,
                    title = item.title,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .clickable { item.onClick() }
                        .padding(vertical = 2.dp)
                )
            }
        }
    }
}
