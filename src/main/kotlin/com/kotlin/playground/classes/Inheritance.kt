package com.kotlin.playground.classes

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
}

