package org.example.lesson_4

const val MIN_CREW_NUMBER = 55
const val MAX_CREW_NUMBER = 70
const val MIN_SUPPLY_NUMBER = 50

fun main() {
    val isShipDamaged = readln().toBoolean()
    val crewNumber = readln().toInt()
    val supplyItemsAmount = readln().toInt()
    val isWeatherFavorable = readln().toBoolean()

    val isCrewNumberFit = crewNumber in MIN_CREW_NUMBER..MAX_CREW_NUMBER
    val isEnoughSupply = supplyItemsAmount > MIN_SUPPLY_NUMBER
    val isCrewFull = crewNumber == 70
    val isShipReady = (!isShipDamaged && isCrewNumberFit && isEnoughSupply)
            || (isCrewFull && isWeatherFavorable && isEnoughSupply)
    println("The ship is ready: $isShipReady")
}