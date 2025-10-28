package com.kotlin.playground.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String
) {

}


fun main() {
    val course = Course(1, "Kotlin tutorial", "Someone")

//    println(course)

    val course1 = Course(1, "Kotlin tutorial", "Someone")

    println("Cheking equality: ${course == course1}")

    val course3 = course1.copy(
        id = 3,
        author = "Some other"
    )

    println(course3)


}