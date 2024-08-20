package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val maxNumber = 9
    val firstDigit = Random.nextInt(maxNumber)
    val secondDigit = Random.nextInt(maxNumber)
    val expectedSum = firstDigit + secondDigit

    println("Сложите два числа: $firstDigit + $secondDigit")
    val userAnswer = readln().toInt()

    println(if (userAnswer == expectedSum) "Добро пожаловать!" else "Доступ запрещен.")
}