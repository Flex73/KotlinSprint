package org.example.lesson_2

fun main() {
    val initialSum = 70_000
    val interestRate = 16.7
    val depositTerm = 20
    var endSum = initialSum.toDouble()

    for (i in 1..depositTerm) {
        endSum += (interestRate / 100) * endSum
    }

    println(String.format("%.3f", endSum))
}