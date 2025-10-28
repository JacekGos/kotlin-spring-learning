package com.kotlin.playground.classes

import java.lang.IllegalArgumentException

class Item() {

    var name: String = ""
        get() {
            println("name getter")
            return field
        }
    var price: Double = 0.0
        get() = field
        set(value) {
            if (value >= 0.0) {
                field = value
            } else {
                throw IllegalArgumentException("Negative price is not Allowed")
            }
        }

    constructor(name: String) : this() {
        this.name = name
    }
}

fun main() {

    val item = Item(name = "Phone")
    println("Item name is ${item.name}")
    println("Item price is ${item.price}")

    item.price = 1.0
    println("Item price after update is ${item.price}")
}