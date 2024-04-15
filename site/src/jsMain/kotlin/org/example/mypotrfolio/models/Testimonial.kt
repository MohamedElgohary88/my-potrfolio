package org.example.mypotrfolio.models

import org.example.mypotrfolio.util.Constants.LOREM_IPSUM_SHORT
import org.example.mypotrfolio.util.Res

enum class Testimonial(
    val image: String,
    val fullName: String,
    val profession: String,
    val review: String
) {
    First(
        image = Res.Image.Avatar1,
        fullName = "Milica Ilic",
        profession = "Web Designer",
        review = LOREM_IPSUM_SHORT
    ),
    Second(
        image = Res.Image.Avatar2,
        fullName = "Stefan Jovanovic",
        profession = "Android Developer",
        review = LOREM_IPSUM_SHORT
    ),
    Third(
        image = Res.Image.Avatar3,
        fullName = "Ana Milic",
        profession = "Business Analyst",
        review = LOREM_IPSUM_SHORT
    ),
    Fourth(
        image = Res.Image.Avatar4,
        fullName = "Darko Pesic",
        profession = "Top Manager",
        review = LOREM_IPSUM_SHORT
    ),
    Fifth(
        image = Res.Image.Avatar5,
        fullName = "Milena Nesovic",
        profession = "HR Recruiter",
        review = LOREM_IPSUM_SHORT
    ),
    Sixth(
        image = Res.Image.Avatar6,
        fullName = "Aca Rodic",
        profession = "Cyber Security Analyst",
        review = LOREM_IPSUM_SHORT
    )
}