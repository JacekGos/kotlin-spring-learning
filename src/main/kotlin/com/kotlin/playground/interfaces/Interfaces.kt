package com.kotlin.playground.interfaces

import com.kotlin.playground.classes.Course

interface Repository {
    fun getAll() : Any
}

interface CourseRepository {

    fun getById(id: Int) : Course
    fun save(course: Course) : Int {
        println("Saving in CourseRepository")
        println("Save course: $course")
        return course.id
    }
}

class SqlCourseRepository : CourseRepository, Repository {

    override fun getById(id: Int): Course {
        val course = Course(id, "Kotlin tutorial", "Someone")
        return course;
    }

    override fun getAll(): Any {
        TODO("Not yet implemented")
    }


}

class NoSqlCourseRepository : CourseRepository {

    override fun getById(id: Int): Course {
        return Course(id, "Nosql course", "Ja")
    }

    override fun save(course: Course): Int {
        println("Saving in NoSqlCourseRepository")
        return super.save(course)
    }
}


fun main() {
    val repository = SqlCourseRepository()
    val course = repository.getById(2)
    println(course)
    course.name = "New name"
    println("Saving id: ${repository.save(course)}")

    val noSqlRepository = NoSqlCourseRepository()
    val course2 = noSqlRepository.getById(3)
    println(course2)
    course2.name = "New name for noSql"
    println("Saving id: ${noSqlRepository.save(course2)}")


}