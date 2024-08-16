package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val hoursDeparted = 9
    val minutesDeparted = 39
    val travelTimeInMinutes = 457

    val departTimeInMinutes = hoursDeparted * 60 + minutesDeparted
    val arrivalTimeInMinutes = travelTimeInMinutes + departTimeInMinutes

    val hoursArrival = arrivalTimeInMinutes / MINUTES_IN_HOUR
    val minutesArrival = arrivalTimeInMinutes % MINUTES_IN_HOUR
    println("$hoursArrival:$minutesArrival")
}