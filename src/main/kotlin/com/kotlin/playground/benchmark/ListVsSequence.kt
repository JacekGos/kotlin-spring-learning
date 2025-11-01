package com.kotlin.playground.benchmark

import kotlin.system.measureTimeMillis

fun main() {
    val numbers = (1..10_000_000).toList()

    // Using List (eager)
    val listTime = measureTimeMillis {
        val result = numbers
            .map { it * 2 }
            .filter { it > 1_000_000 }
            .take(10_000)
        println("List result size: ${result.size}")
    }

    // Using Sequence (lazy)
    val sequenceTime = measureTimeMillis {
        val result = numbers
            .asSequence()
            .map { it * 2 }
            .filter { it > 1_000_000 }
            .take(10_000)
            .toList()
        println("Sequence result size: ${result.size}")
    }

    println("List processing time: ${listTime} ms")
    println("Sequence processing time: ${sequenceTime} ms")
}