package org.example.lesson1

const val SECONDS_IN_HOUR = 3600
const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_MINUTE = 60

fun main() {
    val totalSeconds = 6480
    val hours = totalSeconds / SECONDS_IN_HOUR
    val remainingSecondsAfterHours = totalSeconds % SECONDS_IN_HOUR

    val minutesRemained = remainingSecondsAfterHours / MINUTES_IN_HOUR
    val secondsRemained = remainingSecondsAfterHours % SECONDS_IN_MINUTE

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutesRemained, secondsRemained)
    println(formattedTime)
}