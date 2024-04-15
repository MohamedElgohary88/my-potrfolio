package org.example.mypotrfolio.util

import androidx.compose.runtime.*
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.delay
import org.w3c.dom.events.EventListener

@Composable
fun ObserveViewPortEntered(
    sectionId: String,
    distanceFromTop: Double,
    onViewPortEntered: () -> Unit
) {
    var viewportEntered by remember { mutableStateOf(false) }
    val listener = remember {
        EventListener {
            val top = document.getElementById(sectionId)?.getBoundingClientRect()?.top
            if (top != null && top < distanceFromTop) {
                viewportEntered = true
            }
        }
    }

    LaunchedEffect(viewportEntered) {
        if (viewportEntered) {
            onViewPortEntered()
            window.removeEventListener(type = "scroll", callback = listener)
        } else {
            window.addEventListener(type = "scroll", callback = listener)
        }
    }
}

suspend fun animatePercentage(
    percent: Int,
    delay: Long = 10L,
    onUpdate: (Int) -> Unit
) {
    (0..percent).forEach {
        delay(delay)
        onUpdate(it)
    }
}

suspend fun animateNumbers(
    number: Int,
    delay: Long = 10L,
    onUpdate: (Int) -> Unit
) {
    (0..number).forEach {
        delay(delay)
        onUpdate(it)
    }
}