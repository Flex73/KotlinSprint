package org.example.lesson_2

import kotlin.math.pow

const val DIVIDER = 100
const val BASE_AMOUNT_MULTIPLIER = 1

fun main() {
    val initialSum = 70_000
    val interestRate = 16.7
    val depositTerm = 20

    val rateMultiplier = interestRate / DIVIDER
    val growthFactor = BASE_AMOUNT_MULTIPLIER + rateMultiplier
    val endSum = initialSum * growthFactor.pow(depositTerm)

    println(String.format("%.3f", endSum))
}