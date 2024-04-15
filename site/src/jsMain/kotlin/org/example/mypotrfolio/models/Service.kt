package org.example.mypotrfolio.models

import org.example.mypotrfolio.util.Res

enum class Service(
    val icon: String,
    val imageDesc: String,
    val title: String,
    val description: String
) {
    Android(
        icon = Res.Icon.android,
        imageDesc = "Android Icon",
        title = "Android Development",
        description = "General android development knowledge, android lifecycle, navigation, services, etc."
    ),
    IOS(
        icon = Res.Image.Compose,
        imageDesc = "Compose Icon",
        title = "Jetpack Compose",
        description = "I am using Jetpack Compose for all my new projects."
    ),
    Web(
        icon = Res.Icon.web,
        imageDesc = "Desktop Icon",
        title = "Web Development",
        description = "I have create projects using Kotlin multiplatform for Web and Server side"
    ),
    Design(
        icon = Res.Icon.injection,
        imageDesc = "Dependency Injection Icon",
        title = "Dependency Injection",
        description = "one year of experience using Dagger Hilt and Koin"
    ),
    Business(
        icon = Res.Icon.database,
        imageDesc = "Persistence Icon",
        title = "Persistence",
        description = "Experience using Room for data persistence layer, experience using migrations and " +
                "relational databases"
    ),
    SEO(
        icon = Res.Icon.network,
        imageDesc = "Network icon",
        title = "API & Server",
        description = "I have worked with libraries like OkHttp, Retrofit and KtorClient for API calls"
    )
}