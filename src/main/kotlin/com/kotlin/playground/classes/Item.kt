package com.kotlin.playground.classes

class Item() {

    var name: String = ""

    constructor(name: String) : this() {
        this.name = name
    }
}

fun main() {

    val item = Item(name = "Phone")
    println("Item name is ${item.name}")
}