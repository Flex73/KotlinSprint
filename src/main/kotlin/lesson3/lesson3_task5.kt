package org.example.lesson3

fun main() {
    val turnData = "D2-D4;0"

    val turnDataParts = turnData.split(";")
    val (cellFrom, cellTo) = turnDataParts[0].split("-")
    val turnNumber = turnDataParts[1]

    println(cellFrom)
    println(cellTo)
    println(turnNumber)
}