package org.example.mypotrfolio.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import org.example.mypotrfolio.components.BackToTopButton
import org.example.mypotrfolio.components.OverflowMenu
import org.example.mypotrfolio.sections.*

@Page
@Composable
fun HomePage() {

    var menuOpened by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MainSection(onMenuClick = { menuOpened = true })
            AboutSection()
            ServiceSection()
            PortfolioSection()
            AchievementsSection()
          //  TestimonialSection()
            ExperienceSection()
            ContactSection()
            FooterSection()
        }

        BackToTopButton()

        if (menuOpened) {
            OverflowMenu(onMenuClosed = { menuOpened = false })
        }
    }
}
