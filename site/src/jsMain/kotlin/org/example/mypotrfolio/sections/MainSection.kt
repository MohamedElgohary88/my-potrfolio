package org.example.mypotrfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.example.mypotrfolio.components.Header
import org.example.mypotrfolio.components.SocialBar
import org.example.mypotrfolio.models.Section
import org.example.mypotrfolio.models.Theme
import org.example.mypotrfolio.styles.MainButtonStyle
import org.example.mypotrfolio.util.Constants
import org.example.mypotrfolio.util.Constants.FONT_FAMILY
import org.example.mypotrfolio.util.Res
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun MainSection(onMenuClick: () -> Unit) {
    Box(
        modifier = Modifier
            .id(Section.Home.id)
            .maxWidth(Constants.SECTION_WIDTH.px),
        contentAlignment = Alignment.TopCenter
    ) {
        MainBackground()
        MainContent(onMenuClick = onMenuClick)
    }
}

@Composable
fun MainBackground() {
    Image(
        modifier = Modifier
            .fillMaxSize()
            .objectFit(ObjectFit.Cover),
        src = Res.Image.Background,
        description = "Background image"
    )
}

@Composable
fun MainContent(onMenuClick: () -> Unit) {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = if (breakpoint > Breakpoint.MD) 300.px else 80.px),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Header(onMenuClick = onMenuClick)
        SimpleGrid(
            modifier = Modifier.fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent
            ),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            MainText(breakpoint = breakpoint, modifier = Modifier)
            MainImage()
        }
    }
}

@Composable
fun MainText(breakpoint: Breakpoint, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (breakpoint > Breakpoint.MD) {
            SocialBar()
        }
        Column {
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(if (breakpoint >= Breakpoint.LG) 44.px else 20.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Primary.rgb)
                    .toAttrs()
            ) {
                Text("Hello, I'm")
            }
            P(
                attrs = Modifier
                    .margin(top = 10.px, bottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(if (breakpoint >= Breakpoint.LG) 64.px else 40.px)
                    .fontWeight(FontWeight.Bolder)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text("Mohamed Elgohary")
            }
            P(
                attrs = Modifier
                    .minWidth(600.px)
                    .margin(top = 10.px, bottom = 5.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(20.px)
                    .fontWeight(FontWeight.Bold)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text("Software Engineer - Mobile developer")
            }
            P(
                attrs = Modifier
                    .margin(bottom = 25.px)
                    .maxWidth(400.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(15.px)
                    .fontStyle(FontStyle.Italic)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text("I'm a dedicated and enthusiastic Android developer with a strong foundation in Kotlin, proficient in Android Studio and Git. I excel at turning design concepts into functional applications, demonstrating my ability to work independently and in teams. My commitment to continuous learning and adaptability makes me a valuable asset in any development project..")
            }
            Button(
                attrs = MainButtonStyle.toModifier()
                    .height(40.px)
                    .border(width = 0.px)
                    .borderRadius(r = 5.px)
                    .backgroundColor(Theme.Primary.rgb)
                    .color(Colors.White)
                    .cursor(Cursor.Pointer)
                    .toAttrs()
            ) {
                Link(
                    modifier = Modifier
                        .color(Colors.White)
                        .textDecorationLine(TextDecorationLine.None),
                    text = "Contact me",
                    path = Section.Contact.path
                )
            }
        }
    }
}

@Composable
fun MainImage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Image(
            modifier = Modifier.fillMaxWidth(),
            src = Res.Image.HandCoding,
            description = "Main image"
        )
    }
}