package com.kotlin.playground.basics

fun main() {

    var name = "Jack"
    name = "Domino"

    val result: String = if (name.length == 4) {
        println("OK")
        name
    } else {
        println("NOK")
        name
    }

    println("result $result")

    val position = 1
    val posResult = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NONE"
    }

    println("posResult $posResult")
}