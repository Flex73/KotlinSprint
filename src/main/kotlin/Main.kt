package org.example

const val SECONDS_IN_SPACE = 6480
const val SECONDS_IN_HOUR = 3600
const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_MINUTE = 60

fun main() {
    val totalSeconds = SECONDS_IN_SPACE
    val hours = totalSeconds / SECONDS_IN_HOUR
    val remainingSecondsAfterHours = totalSeconds % SECONDS_IN_HOUR

    val minutes = remainingSecondsAfterHours / MINUTES_IN_HOUR
    val seconds = remainingSecondsAfterHours % SECONDS_IN_MINUTE

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(formattedTime)
}