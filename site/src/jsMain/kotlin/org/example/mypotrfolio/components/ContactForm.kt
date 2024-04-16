package org.example.mypotrfolio.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import org.example.mypotrfolio.models.Theme
import org.example.mypotrfolio.styles.InputStyle
import org.example.mypotrfolio.styles.MainButtonStyle
import org.example.mypotrfolio.util.Constants
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun ContactForm(breakpoint: Breakpoint) {
    Column(modifier = Modifier.width(500.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Form(
            action = "https://formspree.io/f/xbjnpnvj",
            attrs = Modifier
                .attrsModifier {
                    attr("method","POST")
                }
                .toAttrs()
        ) {
            Label(
                attrs = Modifier
                    .classNames("form-label")
                    .fontFamily(Constants.FONT_FAMILY)
                    .fontSize(15.px)
                    .fontWeight(FontWeight.Normal)
                    .margin(bottom = 2.px)
                    .toAttrs(),
                forId = "inputName"
            ) {
                Text("Name")
            }
            Input(
                type = InputType.Text,
                attrs = InputStyle.toModifier()
                    .id("inputName")
                    .classNames("form-control")
                    .margin(bottom = 12.px)
                    .width(
                        if (breakpoint >= Breakpoint.MD) 500.px else 250.px
                    )
                    .boxShadow(0.px, 0.px, 0.px, 0.px, null)
                    .backgroundColor(Theme.LighterGray.rgb)
                    .attrsModifier {
                        attr("placeholder", "Full name")
                        attr("name", "name")
                        attr("required", "true")
                    }
                    .toAttrs()
            )
            Label(
                attrs = Modifier
                    .classNames("form-label")
                    .fontFamily(Constants.FONT_FAMILY)
                    .fontSize(15.px)
                    .fontWeight(FontWeight.Normal)
                    .margin(bottom = 2.px)
                    .toAttrs(),
                forId = "inputEmail"
            ) {
                Text("Email")
            }
            Input(
                type = InputType.Email,
                attrs = InputStyle.toModifier()
                    .id("inputEmail")
                    .classNames("form-control")
                    .margin(bottom = 10.px)
                    .width(
                        if (breakpoint >= Breakpoint.MD) 500.px else 250.px
                    )
                    .boxShadow(0.px, 0.px, 0.px, 0.px, null)
                    .backgroundColor(Theme.LighterGray.rgb)
                    .attrsModifier {
                        attr("placeholder", "Email address")
                        attr("name", "email")
                        attr("required", "true")
                    }
                    .toAttrs()
            )
            Label(
                attrs = Modifier
                    .classNames("form-label")
                    .fontFamily(Constants.FONT_FAMILY)
                    .fontSize(15.px)
                    .fontWeight(FontWeight.Normal)
                    .margin(bottom = 2.px)
                    .toAttrs(),
                forId = "inputMessage"
            ) {
                Text("Message")
            }
            TextArea(
                attrs = InputStyle.toModifier()
                    .id("inputMessage")
                    .classNames("form-control")
                    .height(150.px)
                    .margin(bottom = 20.px)
                    .width(
                        if (breakpoint >= Breakpoint.MD) 500.px else 250.px
                    )
                    .boxShadow(0.px, 0.px, 0.px, 0.px, null)
                    .backgroundColor(Theme.LighterGray.rgb)
                    .attrsModifier {
                        attr("placeholder", "Your message")
                        attr("name", "message")
                        attr("required", "true")
                    }
                    .toAttrs()
            )
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
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
                    Text("Submit")
                }
            }
        }
    }
}