package com.kotlin.playground.cast

import com.kotlin.playground.classes.Course

fun checkType(type: Any) {
    when (type) {
        is Course -> println(type)
        is String -> println(type.lowercase())
        else -> println("Unknown type")
    }
}

fun castNumber(number: Any) {
    when(number) {
        number as? Double -> println("number is Double")
        number as? Int -> println("number is Int")
    }
}

fun main() {

    val course = Course(1, "Kotlin tutorial", "Someone")

    checkType(course)
    checkType("Jacek")

//    castNumber(1.0)
    castNumber(1)

    val number = 1
    val numberDouble = number.toDouble()
    println(numberDouble)
}




