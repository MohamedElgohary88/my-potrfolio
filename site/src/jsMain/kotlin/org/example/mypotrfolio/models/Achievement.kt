package org.example.mypotrfolio.models

import org.example.mypotrfolio.util.Res

enum class Achievement(
    val icon: String,
    val number: Int,
    val description: String
) {
    Completed(
        icon = Res.Icon.checkmark,
        number = 12,
        description = "Completed Projects"
    ),
    Active(
        icon = Res.Icon.shield,
        number = 2,
        description = "Active Projects"
    ),
    Satisfied(
        icon = Res.Icon.happy,
        number = 2,
        description = "Satisfied Clients"
    ),
    Team(
        icon = Res.Icon.user,
        number = 2,
        description = "Team Members"
    )
}