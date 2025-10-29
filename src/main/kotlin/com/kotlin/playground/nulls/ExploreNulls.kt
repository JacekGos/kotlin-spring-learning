package com.kotlin.playground.nulls

data class Movie(
    val id: Int?,
    val name: String
) {}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = null)
}

fun main() {

    var nameNullable: String? = null
    println("Value is: ${nameNullable?.length}")
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
    println(savedMovie.id!!)
    println(savedMovie)
}