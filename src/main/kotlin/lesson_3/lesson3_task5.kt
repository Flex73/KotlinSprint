package org.example.lesson_3

fun main() {
    val turnData = "D2-D4;0"
    val (cellFrom, cellTo, turnNumber) = turnData.split(";", "-")

    println(cellFrom)
    println(cellTo)
    println(turnNumber)
}