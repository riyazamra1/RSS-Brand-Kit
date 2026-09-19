package com.riyaz.rss.common.navigation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
    companyLogo: Painter? = null,
    modifier: Modifier = Modifier
) {
    val shape = RoundedCornerShape(28.dp)

    ModalDrawerSheet(
        modifier = modifier
            .fillMaxHeight()
            .padding(vertical = 10.dp, horizontal = 8.dp)
            .clip(shape)
            .background(
                MaterialTheme.colorScheme.surface.copy(alpha = 0.86f),
                shape
            )
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.10f),
                shape = shape
            ),
        drawerContainerColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.86f),
        drawerContentColor = MaterialTheme.colorScheme.onSurface,
        drawerShape = shape,
        tonalElevation = 8.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(vertical = 18.dp, horizontal = 10.dp)
        ) {
            AnimatedVisibility(
                visible = logo != null,
                enter = fadeIn(tween(220)) + slideInHorizontally(
                    initialOffsetX = { -it / 5 },
                    animationSpec = tween(260)
                )
            ) {
                if (logo != null) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(20.dp))
                            .background(
                                MaterialTheme.colorScheme.onSurface.copy(alpha = 0.035f),
                                RoundedCornerShape(20.dp)
                            )
                            .padding(horizontal = 12.dp, vertical = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = logo,
                            contentDescription = "RSS app logo",
                            modifier = Modifier.size(64.dp)
                        )
                    }
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

            items.forEachIndexed { index, item ->
                AnimatedVisibility(
                    visible = true,
                    enter = fadeIn(tween(180, delayMillis = 70 * index)) +
                        slideInHorizontally(
                            initialOffsetX = { -it / 8 },
                            animationSpec = tween(220, delayMillis = 70 * index)
                        )
                ) {
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

            Spacer(Modifier.weight(1f))

            if (companyLogo != null) {
                HorizontalDivider(Modifier.padding(vertical = 10.dp))
                AnimatedVisibility(
                    visible = true,
                    enter = fadeIn(tween(260))
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = companyLogo,
                            contentDescription = "Razeen Secure Solution logo",
                            modifier = Modifier.size(46.dp)
                        )
                        Text(
                            text = RssBrand.COMPANY_NAME,
                            modifier = Modifier.padding(top = 4.dp)
                        )
                    }
                }
            }
        }
    }
}
