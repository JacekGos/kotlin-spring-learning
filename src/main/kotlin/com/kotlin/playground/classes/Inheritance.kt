package com.kotlin.playground.classes

import com.kotlin.playground.interfaces.CourseRepository
import com.kotlin.playground.interfaces.SqlCourseRepository

open class User(
    val name: String
) {
    open var isLoggedIn: Boolean = false
        get() {
            println("Getter isLoggedIn inside User")
            return field
        }

    open fun login() {
        println("Inside user: ${this.name} Login")
    }

    private fun secret() {
        println("Inside user: ${this.name} secret")
    }

    open protected fun logout() {
        println("Inside user: ${this.name} logout")
    }

}

class Student(name: String) : User(name) {
    override var isLoggedIn: Boolean = false
        get() {
            println("Getter isLoggedIn inside Student")
            return field
        }

    companion object {

        const val noOfEnrolledCourses = 10
        fun country() = "PL"
    }

    override fun login() {
        println("Inside Student Login")
        super.login()
    }

    public override fun logout() {
        println("Inside Student Logout")
        super.logout()
    }
}

class Instructor(name: String) : User(name) {
    override fun login() {
        println("Inside Instructor Login")
        super.login()
    }
}

fun main() {

    val student = Student("Student")
    println("name is ${student.name}")
    student.login();
    student.isLoggedIn = true;
    println("Student isLoggedIn ${student.isLoggedIn}")

    println("Student country ${Student.country()}")
    println("Student noOfEnrolledCourses ${Student.noOfEnrolledCourses}")

    val instructor = Instructor("Instructor")
    println("name is ${instructor.name}")
    println("Instructor isLoggedIn ${instructor.isLoggedIn}")
    instructor.login();

    val student2: Student = Student("JAAA")
    student2.logout()
}

