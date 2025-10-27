package com.kotlin.playground.basics

fun main() {

//    for (i in 1..10) {
//        println("i in $i")
//
//        if (i == 3)
//            break
//    }

    listOf(1, 2, 3, 4, 5).forEach {
        println("forEach it: $it")
        if (it == 3) return@forEach
//        if (it == 3) return@each
    }

    label()



    println("End")
}

fun label() {
    loop@ for (i in 1..10) {
        println("i in $i - label")

//        if (i == 3) break@loop
        innerLoop@ for (j in 1..5) {
            println("   j in $j - label")
            if (j == 2) continue@loop
        }
    }
}
