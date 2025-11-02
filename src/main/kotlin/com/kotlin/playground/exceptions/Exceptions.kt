package com.kotlin.playground.exceptions

import java.lang.RuntimeException

fun main() {

    println("Name length ${nameLength("Jacek")}")
    println("Name length ${nameLength(null)}")
    returnNothing()
}

fun returnNothing() : Nothing {
    throw RuntimeException("Exception")
}

fun nameLength(name: String?): Int? {

    val result = try {
        name!!.length
    } catch (e: Exception) {
        println("Ex is $e")
        null
    }

    return result
}
