package org.example.lesson_4

const val NOT_FAVORABLE_SEASON = "Winter"
const val FAVORABLE_HUMIDITY = 20

fun main() {
    val isWeatherSunny = true
    val isTentOpen = true
    val humidity = 20
    val currentSeason = "Winter"

    val isHumidityFavorable = humidity == FAVORABLE_HUMIDITY
    val isConditionFavorable = isWeatherSunny
            && isTentOpen
            && isHumidityFavorable
            && currentSeason != NOT_FAVORABLE_SEASON
    println("Благоприятные ли условия сейчас для роста бобовых? $isConditionFavorable")
}