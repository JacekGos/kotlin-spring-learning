package com.kotlin.playground.functions

fun main() {

    printName("Jack")
}

fun printName(name: String) : Unit {
    println("name is $name")
    val result = addition(1, 2)
    println("add result $result")
    val result2 = additionExpression(1, 2)
    println("add result2 $result2")

}

fun addition(x: Int, y: Int): Int {
    return x + y
}

fun additionExpression(x: Int, y: Int) : Int =  x + y
