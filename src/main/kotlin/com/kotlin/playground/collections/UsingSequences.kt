package com.kotlin.playground.collections

import com.kotlin.playground.dataset.Course
import com.kotlin.playground.dataset.CourseCategory
import com.kotlin.playground.dataset.courseList
import java.util.*

fun main() {

    val listUsingSequence = listOf("Jacek", "Szymon", "Dominik")
        .asSequence()
        .filter { it.length >= 6 }
        .map { it.uppercase() }
//        .toList()

    println("listUsingSequence $listUsingSequence")

    exploreFilterUsingSequence(courseList()) { course: Course ->
        course.category == CourseCategory.DEVELOPEMENT
    }

    val range = 1 .. 1000_000_000
    range
        .asSequence()
        .map { it.toDouble() }
        .take(40)
        .forEach { println("Range val: $it") }
}

fun exploreFilterUsingSequence(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {

    val developmentCourses = courseList
        .asSequence()
        .filter { predicate.invoke(it) }
        .forEach { println("Dev course: $it") }
}