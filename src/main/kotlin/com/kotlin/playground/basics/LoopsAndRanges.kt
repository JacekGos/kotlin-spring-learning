package com.kotlin.playground.basics

fun main() {

    val range = 1..10
    for (i in range) {
        println("i: $i")
    }

    val reversedRange = 10 downTo 1
    for (j in reversedRange) {
        println("j: $j")
    }

    for (j in reversedRange step 2) {
        println("j2: $j")
    }

    exploreWhile()
    exploreDoWhile()

}

fun exploreDoWhile() {
    var x = 1;
    do {
        println("do while loop var: $x")
        x++;
    } while (x < 5)

}

fun exploreWhile() {

    var x = 1
    while (x < 5) {
        println("while loop var: $x")
        x++
    }
}
