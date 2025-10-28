package com.kotlin.playground.classes

open class User(
    val name: String
) {
    fun login() {
        println("Inside user: ${this.name} Login")
    }
}

class Student(name: String) : User(name)
class Instructor(name: String) : User(name)

fun main() {

    val student = Student("Student")
    println("name is ${student.name}")
    student.login();
    val instructor = Instructor("Instructor")
    println("name is ${instructor.name}")
    instructor.login();
}

