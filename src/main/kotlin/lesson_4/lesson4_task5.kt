package org.example.lesson_4

const val MIN_CREW_NUMBER = 55
const val MAX_CREW_NUMBER = 70
const val MIN_SUPPLY_NUMBER = 50
const val IS_SHIP_DAMAGED = true
const val IS_WEATHER_FAVORABLE = true

fun main() {
    println("Введите данные о текущем состоянии:")

    println("Корабль повреждён: true/false")
    val isShipDamaged = readln().toBoolean()

    println("Количество членов экипажа")
    val crewNumber = readln().toInt()

    println("Количество ящиков с продовольствием")
    val supplyItemsAmount = readln().toInt()

    println("Благоприятная ли погода: true/false")
    val isWeatherFavorable = readln().toBoolean()

    val isShipReady = isShipDamaged != IS_SHIP_DAMAGED
    val isWeatherSuitable = isWeatherFavorable == IS_WEATHER_FAVORABLE
    val isCrewNumberFit = crewNumber in MIN_CREW_NUMBER..MAX_CREW_NUMBER
    val isEnoughSupply = supplyItemsAmount > MIN_SUPPLY_NUMBER
    val isCrewFull = crewNumber == 70
    val isShipPrepared = (isShipReady && isCrewNumberFit && isEnoughSupply)
            || (isCrewFull && isWeatherSuitable && isEnoughSupply)
    println("Корабль готов к отправлению: $isShipPrepared")
}