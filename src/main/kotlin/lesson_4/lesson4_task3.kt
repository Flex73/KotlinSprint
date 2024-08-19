package org.example.lesson_4

const val NOT_FAVORABLE_SEASON = "Winter"
const val FAVORABLE_HUMIDITY = 20
const val SUNNY_WEATHER = "Sunny"
const val TENT_STATE_OPEN = "Open"

fun main() {
    val weatherToday = "Sunny"
    val tentState = "Open"
    val humidity = 20
    val currentSeason = "Winter"

    val isWeatherSunny = SUNNY_WEATHER == weatherToday
    val isTentOpen = tentState == TENT_STATE_OPEN
    val isHumidityFavorable = humidity == FAVORABLE_HUMIDITY
    val isSeasonFavorable = currentSeason != NOT_FAVORABLE_SEASON
    val isConditionFavorable = isWeatherSunny
            && isTentOpen
            && isHumidityFavorable
            && isSeasonFavorable
    println("Благоприятные ли условия сейчас для роста бобовых? $isConditionFavorable")
}