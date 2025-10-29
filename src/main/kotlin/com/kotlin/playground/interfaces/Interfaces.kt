package com.kotlin.playground.interfaces

import com.kotlin.playground.classes.Course

interface Repository {
    fun getAll(): Any
}

interface A {
    fun doSmth() {
        println("A doSmth")
    }
}

interface B {
    fun doSmth() {
        println("B doSmth")
    }
}

class AB : A, B {
    override fun doSmth() {
        super<A>.doSmth()
        super<B>.doSmth()
        println("AB doSmth")
    }
}

interface CourseRepository {

    val isCoursePersisted: Boolean
    fun getById(id: Int): Course
    fun save(course: Course): Int {
        println("Saving in CourseRepository")
        println("Save course: $course")
        return course.id
    }
}

class SqlCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false
        get() = field
    override fun getById(id: Int): Course {
        val course = Course(id, "Kotlin tutorial", "Someone")
        return course;
    }

    override fun getAll(): Any {
        TODO("Not yet implemented")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }
}

class NoSqlCourseRepository : CourseRepository {
    override var isCoursePersisted: Boolean = false
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
    println(repository.isCoursePersisted)
    course.name = "New name"
    println("Saving id: ${repository.save(course)}")
    println(repository.isCoursePersisted)
//
//    val noSqlRepository = NoSqlCourseRepository()
//    val course2 = noSqlRepository.getById(3)
//    println(course2)
//    course2.name = "New name for noSql"
//    println("Saving id: ${noSqlRepository.save(course2)}")

    val ab: AB = AB()
    ab.doSmth()
}