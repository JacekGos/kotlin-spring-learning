package com.kotlin.playground.collections

import com.kotlin.playground.dataset.Course
import com.kotlin.playground.dataset.CourseCategory
import com.kotlin.playground.dataset.courseList

fun main() {
    val courseList = courseList()

    val devPredicate = {course: Course ->
        course.category == CourseCategory.DEVELOPEMENT
    }

    val designPredicate = {course: Course ->
        course.category == CourseCategory.DESIGN
    }

//    exploreFilter(courseList, devPredicate)
    exploreFilter(courseList, designPredicate)
}

fun exploreFilter(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {

    val developmentCourses = courseList
//        .filter { it.category == CourseCategory.DEVELOPEMENT }
//        .filter(predicate)
        .filter{ predicate.invoke(it)}
        .forEach { println("Dev course: $it") }
}
