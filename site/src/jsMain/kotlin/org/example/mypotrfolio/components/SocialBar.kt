package org.example.mypotrfolio.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedin
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.example.mypotrfolio.styles.SocialLinkStyle
import org.jetbrains.compose.web.css.px

@Composable
fun SocialBar(row: Boolean = false) {
    if (row) {
        Row (
            modifier = Modifier
                .margin(top = 25.px)
                .padding(leftRight = 25.px)
                .minHeight(40.px)
                .borderRadius(r = 20.px)
                .backgroundColor(Colors.White),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            SocialLinks(row = true)
        }
    } else {
        Column(
            modifier = Modifier
                .margin(right = 25.px)
                .padding(topBottom = 25.px)
                .minWidth(40.px)
                .borderRadius(r = 20.px)
                .backgroundColor(Colors.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            SocialLinks()
        }
    }
}

@Composable
private fun SocialLinks(row: Boolean = false) {
    Link(
        path = "https://github.com/MohamedElgohary88",
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaGithub(
            modifier = SocialLinkStyle.toModifier().margin(
                bottom = if (row) 0.px else 40.px,
                right =if (row) 40.px else 0.px
            ),
            size = IconSize.LG
        )
    }
    Link(
        path = "https://www.linkedin.com/in/mohamed-elgohary8",
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaLinkedin(
            modifier = SocialLinkStyle.toModifier(),
            size = IconSize.LG
        )
    }
}