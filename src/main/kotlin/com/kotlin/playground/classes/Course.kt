package com.kotlin.playground.classes

data class Course(
    val id: Int,
    var name: String,
    val author: String,
    val courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
) {
}

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}


fun main() {
    val course = Course(1, "Kotlin tutorial", "Someone")
    println(course)


    val course1 = Course(1, "Kotlin tutorial", "Someone", CourseCategory.DESIGN)
    println(course1)

    println("Cheking equality: ${course == course1}")

    val course3 = course1.copy(
        id = 3,
        author = "Some other",
        courseCategory = CourseCategory.BUSINESS
    )

    println(course3)


}