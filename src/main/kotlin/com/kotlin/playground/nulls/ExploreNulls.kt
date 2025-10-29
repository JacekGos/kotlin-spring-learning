package com.kotlin.playground.nulls

data class Movie(
    val id: Int?,
    val name: String
) {}

fun printName(name: String){
    println("name is $name")
}

fun printName1(name: String?){
    println("name1 is $name")
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = null)
}

fun main() {

    var nameNullable: String? = null
    println("Value is: ${nameNullable?.length}")
//    printName(nameNullable!!)
    nameNullable?.run {
        printName(this)
    }


    printName1(nameNullable)

    nameNullable = "Jacek"
    val length = nameNullable?.length?.toLong() ?: 0;
    println("length $length")

//    if (nameNullable != null) {
//        println("Value is: ${nameNullable.length}")
//    }

    nameNullable = "DUPSKO"
    println("Value is: $nameNullable")

    var name: String = "Jacek"

    val movie = Movie(null, "Nazwa")
    println(movie)
    val savedMovie: Movie = saveMovie(movie)
//    println(savedMovie.id!!)
    println(savedMovie)
}