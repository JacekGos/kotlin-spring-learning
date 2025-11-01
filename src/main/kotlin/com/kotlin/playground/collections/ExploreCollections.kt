package com.kotlin.playground.collections

fun main() {

    val names = listOf("Alex", "Ben", "Chloe")
    println("Names: $names")

    val namesMutable = mutableListOf("Alex", "Ben", "Chloe")
    namesMutable.add("Jack")
    println("Names mutable  : $namesMutable")

    val list = mutableListOf<String>()

    val set = setOf("Alex", "Ben", "Chloe")
    println("Set $set")

    val map = mapOf(1 to "Jacek", 2 to "Szymon", 3 to "Dominik")
    println("Map $map")

}