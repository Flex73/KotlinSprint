package org.example.lesson_5

import java.time.LocalDate

const val MIN_ADULT_AGE = 18

fun main() {
    println("Введите год рождения:")
    val birthYear = readln().toInt()
    val currentYear = LocalDate.now().year
    val userAge = currentYear - birthYear

    val message = if (userAge >= MIN_ADULT_AGE) "Показать экран со скрытым контентом"
    else if (userAge == 16 || userAge == 17) "Показать экран с ограниченным контентом"
    else "Вернуться на главный экран"

    println(message)
}