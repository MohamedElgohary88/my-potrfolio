package org.example.mypotrfolio.models

enum class Experience(
    val number: String,
    val jobPosition: String,
    val description: String,
    val company: String,
    val from: String,
    val to: String
) {
    First(
        number = "01",
        jobPosition = "Software Engineer, Android",
        description = "Working for the most important clients both in the local and international markets like (HMS) " +
                "supporting applications with a high number of users using Kotlin, Compose, Ktor, Koin and more. \n" +
                "I was responsible for developing new features for the Android platform and maintaining existing ones.",
        company = "Freelance",
        from = "Oct 2023",
        to = "NOW",
    ),
    Second(
        number = "02",
        jobPosition = "Android Developer",
        description = "During my eight-month experience at The Chance, I honed my skills in Kotlin, OOP, Git, Design Patterns, Compose, Android SDK, and advanced Android concepts. I excelled in design patterns and architectural paradigms such as MVC, MVP, MVVM, and Clean Architecture.\n"
                + "I successfully led three projects, showcasing my strong leadership and project management abilities. This experience enabled me to collaborate efficiently and drive projects to completion.\n"
                + "Equipped with comprehensive Android expertise and leadership experience, I'm prepared to contribute to innovative projects, delivering scalable software solutions for real-world application",
        company = "The Chance",
        from = "Jan 2023",
        to = "Sep 2023",
    )
}