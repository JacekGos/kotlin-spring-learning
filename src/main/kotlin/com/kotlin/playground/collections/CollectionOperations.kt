package com.kotlin.playground.collections

import com.kotlin.playground.dataset.Course
import com.kotlin.playground.dataset.CourseCategory
import com.kotlin.playground.dataset.KAFKA
import com.kotlin.playground.dataset.courseList

fun main() {
    val courseList = courseList()

    val devPredicate = { course: Course ->
        course.category == CourseCategory.DEVELOPEMENT
    }

    val designPredicate = { course: Course ->
        course.category == CourseCategory.DESIGN
    }

    val list = listOf(listOf(1, 2, 3), listOf(4, 5, 6))
    val mapResult = list.map { outerList ->
        outerList.map { it.toDouble() }

    }
    println("mapResult $mapResult")

    val flatMapResult = list.flatMap { outerList ->
        outerList.map { it.toDouble() }
    }
    println("flatMapResult $flatMapResult")

//    exploreFilter(courseList, devPredicate)
//    exploreFilter(courseList, designPredicate)
//    exploreMap(courseList, devPredicate)
    val courses = exploreFlatMap(courseList, KAFKA)
    println("Courses $courses")
}

fun exploreFlatMap(courseList: MutableList<Course>, topic: String): List<String> {

    val kafkaCourses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter {
            it == topic
        }.map {
            courseName
        }
    }

    return kafkaCourses
}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {

    val courses = courseList
//        .map { it.name }
        .filter(predicate)
        .map { "${it.name} - ${it.category}" }
        .forEach { println(it) }

    println("Map courses: $courses")
}

fun exploreFilter(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {

    val developmentCourses = courseList
//        .filter { it.category == CourseCategory.DEVELOPEMENT }
//        .filter(predicate)
        .filter { predicate.invoke(it) }
        .forEach { println("Dev course: $it") }
}
