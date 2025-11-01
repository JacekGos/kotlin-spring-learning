package com.kotlin.playground.collections

fun calculate(x: Int, y: Int, op: (x: Int, y: Int) -> Int): Int {
    return op(x, y)
}

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

    val calcResult = calculate(3, 3, multipleLambda)
    val calcResult2 = calculate(3, 3) { x: Int, y: Int -> x * y }
    println(calcResult)
    println(calcResult2)
}