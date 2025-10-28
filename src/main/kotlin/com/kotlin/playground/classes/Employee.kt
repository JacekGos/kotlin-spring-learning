package com.kotlin.playground.classes

data class Employee(
    val id: Int,
    val name: String
) {
}

fun main() {
    val employee = Employee(1, "John")
    println(employee)

    val employee2 = Employee(1, "John")
    println(employee == employee2)

    val employee3 = employee2.copy(
        id = 2
    )
    println(employee3)
}