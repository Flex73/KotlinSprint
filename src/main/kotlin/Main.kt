package org.example

const val SECONDS_IN_SPACE = 6480
const val SECONDS_IN_HOUR = 3600
const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_MINUTE = 60

fun main() {
    val ordersNumber = 75
    val gratitudeMessage = "Thanks for choosing us!"

    println(ordersNumber)
    println(gratitudeMessage)

    val length = 40_868_600_000L
    val age: Byte = 27
    val partOfDay = 0.075f
    val seconds: Short = 6480
    val partOfYear = 2.0547945205479453E-4
    val apogee = 327000

    println(length)
    println(age)
    println(partOfDay)
    println(seconds)
    println(partOfYear)
    println(apogee)
    val totalSeconds = SECONDS_IN_SPACE
    val hours = totalSeconds / SECONDS_IN_HOUR
    val remainingSecondsAfterHours = totalSeconds % SECONDS_IN_HOUR

    val minutesRemained = remainingSecondsAfterHours / MINUTES_IN_HOUR
    val secondsRemained = remainingSecondsAfterHours % SECONDS_IN_MINUTE

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutesRemained, secondsRemained)
    println(formattedTime)
}