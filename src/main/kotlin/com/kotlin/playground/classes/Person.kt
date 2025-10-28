package com.kotlin.playground.classes

class Person(
    val name: String = "",
    val age: Int = 0
) {

    fun action() {
        println("Person walks")
    }
}

fun main() {
    val person = Person("Mariusz",22)
    person.action()
    println("Person name: ${person.name}, age: ${person.age}")
    val person1 = Person()
    println("Person1 name: ${person1.name}, age: ${person1.age}")
}