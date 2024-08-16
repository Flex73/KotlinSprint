package org.example.lesson_2

fun main() {
    val grades = listOf(3, 4, 3, 5)
    val sum = grades.sum().toDouble()
    val mean = sum / grades.size
    val formattedMean = "%.2f".format(mean)
    println(formattedMean)
}