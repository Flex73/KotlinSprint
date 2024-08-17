package org.example.lesson_2

const val DIVIDER = 100

fun main() {
    val crystalOreNumber = 7
    val ironOreNumber = 11
    val buffPercentage = 20

    val bonusCrystalOre = (crystalOreNumber * buffPercentage) / DIVIDER
    val bonusIronOre = (ironOreNumber * buffPercentage) / DIVIDER

    println("Bonus Crystal Ore: $bonusCrystalOre")
    println("Bonus Iron Ore: $bonusIronOre")
}