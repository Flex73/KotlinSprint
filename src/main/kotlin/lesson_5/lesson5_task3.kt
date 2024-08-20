package org.example.lesson_5

import kotlin.random.Random

const val MAX_NUMBER = 42

fun main() {
    val firstWinningNumber = Random.nextInt(MAX_NUMBER)
    val secondWinningNumber = Random.nextInt(MAX_NUMBER)

    println("Введите первое число:")
    val firstUserNumber = readln().toInt()

    println("Введите второе число:")
    val secondUserNumber = readln().toInt()

    val isFirstNumberMatch = (firstUserNumber == firstWinningNumber || firstUserNumber == secondWinningNumber)
    val isSecondNumberMatch = (secondUserNumber == firstWinningNumber || secondUserNumber == secondWinningNumber)

    when {
        isFirstNumberMatch && isSecondNumberMatch -> {
            println("Поздравляем! Вы выиграли главный приз!")
        }
        isFirstNumberMatch || isSecondNumberMatch -> {
            println("Вы выиграли утешительный приз!")
        }
        else -> {
            println("Неудача!")
        }
    }
}