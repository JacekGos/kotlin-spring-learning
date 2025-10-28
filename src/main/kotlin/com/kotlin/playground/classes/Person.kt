package com.kotlin.playground.classes

class Person(
    val name: String = "",
    val age: Int = 0
) {
    var email: String = ""

    constructor(name: String, age: Int, email: String) : this(name, age) {
        println("creating person $name")
        this.email = email
    }

//    constructor(email: String) : this() {
//        this.email = email
//    }

    fun action() {
        println("Person walks")
    }
}

fun main() {
    val person = Person("Mariusz", 22)
    person.action()
    println("Person name: ${person.name}, age: ${person.age}, email: ${person.email}")
    val person1 = Person()
    println("Person1 name: ${person1.name}, age: ${person1.age}, email: ${person1.email}")

    val person2 = Person(name = "AAAA", age = 30, email = "test@email")
    println("Person2 name: ${person2.name}, age: ${person2.age}, email: ${person2.email}")

    val person3 = Person(name = "JACEK", age = 20, email = "test@email")
    println("Person3 name: ${person3.name}, age: ${person3.age}, email: ${person3.email}")
}