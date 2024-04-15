package org.example.mypotrfolio.models

import org.example.mypotrfolio.util.Res

enum class Portfolio(
    val image: String,
    val title: String,
    val description: String,
    val link: String
) {
    One(
        image = Res.Image.PortfolioHonyProject,
        title = "Honey Mart Client",
        description = "Honey Mart is a versatile platform built with Kotlin and Jetpack Compose, where various markets can easily display and sell their products. It provides a user-friendly and engaging online shopping experience.",
        link = "https://github.com/MohamedElgohary88/Honey-Mart"
    ),
    Two(
        image = Res.Image.PortfolioTodoProject,
        title = "TickTask Android App",
        description = "TickTask is an Android task management app that allows teams to collaborate and manage their tasks effectively.\n",
        link = "https://github.com/team-chocolate-cake/My-Team-TODO"
    ),
    Three(
        image = Res.Image.PortfolioWeatherProject,
        title = "Sky Cast Weather App",
        description = "Sky Cast is a multi-platform weather application that provides weather forecasts for various locations. It is built using Kotlin MultiPlatform, Ktor client, Koin for dependency injection, JetPack Compose for UI, and Kotlin coroutine for asynchronous programming.",
        link = "https://github.com/MohamedElgohary88/SkyCast"
    ),
    Four(
        image = Res.Image.PortfolioTeamixProject,
        title = "Teamix",
        description = "Teamix is a messaging and collaboration platform designed for teams and organizations to streamline communication and collaboration. With Teamix, you can create organizations, engage in discussions through channels and topics, and enjoy a range of features to enhance teamwork.",
        link = "https://github.com/MohamedElgohary88/Teamix"
    ),
    Five(
        image = Res.Image.PortfolioMovieProject,
        title = "Movies App",
        description = "The Movies App is an Android application built using Kotlin and follows the MVVM (Model-View-ViewModel) architectural pattern. It utilizes various libraries and components such as Flow, XML, Room, Retrofit, Dagger Hilt, and modularization. The app provides several features for movie enthusiasts, including user authentication, movie search, trivia game, YouTube trailer playback, movie rating, review viewing, movie filtering, watch history, favorites, and user profile.",
        link = "https://github.com/MohamedElgohary88/MovieApp"
    )
}