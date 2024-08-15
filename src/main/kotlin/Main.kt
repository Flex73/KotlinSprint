package org.example
import java.time.LocalDateTime

fun main() {
    val ordersNumber = 75
    val gratitudeMessage = "Thanks for choosing us!"

    println(ordersNumber)
    println(gratitudeMessage)

    val firstSpaceFlightDate = LocalDateTime.of(1961, 4, 12, 9, 7)

    val year = String.format("%04d", firstSpaceFlightDate.year)
    var hour = String.format("%02d", firstSpaceFlightDate.hour)
    var minute = String.format("%02d", firstSpaceFlightDate.minute)

    println(year)
    println(hour)
    println(minute)

    hour = String.format("%02d", 10)
    minute = String.format("%02d", 55)

    println("$hour:$minute")

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
}