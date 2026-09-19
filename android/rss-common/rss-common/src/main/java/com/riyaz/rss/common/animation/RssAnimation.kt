package com.riyaz.rss.common.animation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.core.tween

/**
 * Shared lightweight motion primitives for RSS KIT.
 *
 * Use these for standard page/card entrance and exit animations so RSS
 * projects share predictable timing and motion without forcing animation
 * on business logic.
 */
object RssAnimation {
    const val FAST = 180
    const val STANDARD = 260
    const val SLOW = 360

    fun pageEnter(delayMillis: Int = 0): EnterTransition =
        fadeIn(animationSpec = tween(STANDARD, delayMillis = delayMillis)) +
            slideInVertically(
                initialOffsetY = { it / 12 },
                animationSpec = tween(STANDARD, delayMillis = delayMillis)
            )

    fun pageExit(): ExitTransition =
        fadeOut(animationSpec = tween(FAST)) +
            slideOutVertically(
                targetOffsetY = { it / 20 },
                animationSpec = tween(FAST)
            )

    fun itemEnter(delayMillis: Int = 0): EnterTransition =
        fadeIn(animationSpec = tween(FAST, delayMillis = delayMillis)) +
            slideInVertically(
                initialOffsetY = { it / 16 },
                animationSpec = tween(FAST, delayMillis = delayMillis)
            )

    fun itemExit(): ExitTransition =
        fadeOut(animationSpec = tween(FAST))
}
