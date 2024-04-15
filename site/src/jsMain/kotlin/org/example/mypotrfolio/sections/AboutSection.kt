package org.example.mypotrfolio.sections

import androidx.compose.runtime.*
import com.esaudev.models.Skill
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.coroutines.launch
import org.example.mypotrfolio.components.SectionTitle
import org.example.mypotrfolio.components.SkillBar
import org.example.mypotrfolio.models.Section
import org.example.mypotrfolio.models.Theme
import org.example.mypotrfolio.styles.AboutImageStyle
import org.example.mypotrfolio.styles.AboutTextStyle
import org.example.mypotrfolio.util.Constants
import org.example.mypotrfolio.util.ObserveViewPortEntered
import org.example.mypotrfolio.util.Res
import org.example.mypotrfolio.util.animatePercentage
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutSection() {
    Box(
        modifier = Modifier
            .id(Section.About.id)
            .maxWidth(Constants.SECTION_WIDTH.px)
            .padding(topBottom = 150.px),
        contentAlignment = Alignment.Center
    ) {
        AboutContent()
    }
}

@Composable
fun AboutContent() {
    val breakpoint = rememberBreakpoint()

    Column(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 100.percent else 90.percent
            )
            .maxWidth(1200.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SimpleGrid(
            modifier = Modifier.fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 90.percent else 100.percent
            ),
            numColumns = numColumns(base = 1, md = 2)
        ) {
            if (breakpoint >= Breakpoint.MD) {
                AboutImage()
            }
            AboutMe()
        }
    }
}

@Composable
fun AboutImage() {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = AboutImageStyle.toModifier().fillMaxWidth(80.percent),
            src = Res.Image.AboutImage,
            description = "About image"
        )
    }
}

@Composable
fun AboutMe() {
    val scope = rememberCoroutineScope()
    var viewportEntered by remember { mutableStateOf(false) }
    val animatedPercentage = remember { mutableStateListOf(0, 0, 0, 0, 0) }

    ObserveViewPortEntered(
        sectionId = Section.About.id,
        distanceFromTop = 300.0,
        onViewPortEntered = {
            viewportEntered = true
            Skill.values().forEach { skill ->
                scope.launch {
                    animatePercentage(
                        percent = skill.percentage.value.toInt(),
                        onUpdate = {
                            animatedPercentage[skill.ordinal] = it
                        }
                    )
                }
            }
        }
    )

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        SectionTitle(section = Section.About)
        P(
            attrs = AboutTextStyle.toModifier()
                .margin(topBottom = 25.px)
                .maxWidth(500.px)
                .fontFamily(Constants.FONT_FAMILY)
                .fontSize(18.px)
                .fontWeight(FontWeight.Normal)
                .fontStyle(FontStyle.Italic)
                .color(Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text("I have close to two years of experience working with multidisciplinary teams focusing on the " +
                    "development of Android applications, I have had the opportunity to work on projects for one of the" +
                    " largest multinational store corporations.\n")
        }
        Skill.values().forEach { skill ->
            SkillBar(
                name = skill.title,
                percentage = if (viewportEntered) skill.percentage else 0.percent,
                index = skill.ordinal,
                animatedPercentage = if (viewportEntered) animatedPercentage[skill.ordinal] else 0
            )
        }
    }
}