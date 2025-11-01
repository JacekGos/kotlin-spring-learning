package com.kotlin.playground.collections

fun main() {

    val addLambda = { x: Int -> x + x }

    val addResult = addLambda(3)
    println(addResult)

    val multipleLambda = { x: Int, y: Int ->
        val result = x * y
        println("$x * $y = $result")
        result
    }
    println(multipleLambda(2, 4))
}