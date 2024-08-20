package org.example.lesson_4

const val NOT_FAVORABLE_SEASON = "Winter"
const val FAVORABLE_HUMIDITY = 20
const val IS_SUNNY_WEATHER = true
const val IS_TENT_STATE_OPEN = true

fun main() {
    val isWeatherSunny = true
    val isTentOpen = true
    val humidity = 20
    val currentSeason = "Winter"

    val isWeatherFavorable = IS_SUNNY_WEATHER == isWeatherSunny
    val isOpen = isTentOpen == IS_TENT_STATE_OPEN
    val isHumidityFavorable = humidity == FAVORABLE_HUMIDITY
    val isSeasonFavorable = currentSeason != NOT_FAVORABLE_SEASON
    val isConditionFavorable = isWeatherFavorable
            && isOpen
            && isHumidityFavorable
            && isSeasonFavorable
    println("Благоприятные ли условия сейчас для роста бобовых? $isConditionFavorable")
}