package org.example.lesson_3

fun main() {
    var turnFrom = "E2"
    var turnTo = "E4"
    var turnNumber = 1
    println("[$turnFrom-$turnTo;$turnNumber]")

    turnFrom = "D2"
    turnTo = "D3"
    turnNumber++
    println("[$turnFrom-$turnTo;$turnNumber]")
}