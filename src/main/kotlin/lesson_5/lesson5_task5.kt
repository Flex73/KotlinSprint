package org.example.lesson_5

import kotlin.random.Random

const val TURNS_NUMBER = 3
const val MIN_NUMBER = 0
const val NUMBER_UNTIL = 43

fun main() {
    val winningNumbers = List(TURNS_NUMBER) { Random.nextInt(MIN_NUMBER, NUMBER_UNTIL) }.toSet()

    val userNumbers = mutableListOf<Int>()

    repeat(TURNS_NUMBER) {
        val userNumber = readln().toInt()

        if (userNumber in MIN_NUMBER..MAX_NUMBER) {
            userNumbers.add(userNumber)
        }
    }

    val matchingNumbers = userNumbers.intersect(winningNumbers)
    val matchCount = matchingNumbers.size

    when (matchCount) {
        3 -> println("Поздравляем! Вы угадали все три числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получили крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз.")
        else -> println("К сожалению, вы не угадали ни одного числа.")
    }

    println("Выигрышные числа были: ${winningNumbers.joinToString(", ")}")
}