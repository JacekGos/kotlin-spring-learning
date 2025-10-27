package com.kotlin.playground.basics

fun main() {

    val name: String = "Jacek";
    println(name)


    var age: Int = 31;
    age += 1;

    println(age);

    val salary : Long = 30000L;
    println(salary)

    val course = "Kotlin Spring";
    println("course : $course and  the course length is ${course.length}")

    val multiLine = "ABC \n DEF"
    println(multiLine)
    val multiLine1 = """
        ABC
        DEF
    """.trimIndent()
    println(multiLine1)

}
