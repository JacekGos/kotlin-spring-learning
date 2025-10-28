package com.kotlin.playground.functions

import java.time.LocalDate

fun main() {

    printName("Jack")
    printPersonDetails("Jacek", dob = LocalDate.parse("2025-10-26"))
}

fun printPersonDetails(name: String, email: String = "dupsko", dob: LocalDate = LocalDate.now()) {
    println("name: $name, email: $email, dob: $dob")
}

fun printName(name: String): Unit {
    println("name is $name")
    val result = addition(1, 2)
    println("add result $result")
    val result2 = additionExpression(1, 2)
    println("add result2 $result2")

}

fun addition(x: Int, y: Int): Int {
    return x + y
}

fun additionExpression(x: Int, y: Int): Int = x + y


