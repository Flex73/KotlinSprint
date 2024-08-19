package org.example.lesson_4

const val TABLES_NUMBER = 13

fun main() {
    val freeTablesTomorrow = 4
    val bookedTableToday = TABLES_NUMBER
    val bookedTablesTomorrow = TABLES_NUMBER - freeTablesTomorrow

    println("[Доступность столиков на сегодня: ${bookedTableToday < TABLES_NUMBER}]\n" +
            "[Доступность столиков на завтра: ${bookedTablesTomorrow < TABLES_NUMBER}]")
}