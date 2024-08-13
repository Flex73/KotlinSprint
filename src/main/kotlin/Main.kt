package org.example

fun main() {
    // task 1
    val ordersNumber = 75
    val gratitudeMessage = "Thanks for choosing us!"

    println(ordersNumber)
    println(gratitudeMessage)

    // task 2
    var employeesNumber = 2000
    //println(employeesNumber)

    employeesNumber -= 1
    println(employeesNumber)

    // task 3
    val year = 1961
    var hour = 9
    var minute = 7

    println(year)
    println(hour)
    println(minute)

    hour = 10
    minute = 55

    println("$hour:$minute")

    //task 4
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

    // task 5
    val totalSeconds = 6480
    val hours = totalSeconds / 3600
    val remainingSecondsAfterHours = totalSeconds % 3600

    val minutesRemaining = remainingSecondsAfterHours / 60
    val secondsRemaining = remainingSecondsAfterHours % 60

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutesRemaining, secondsRemaining)
    println(formattedTime)
}