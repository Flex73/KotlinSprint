package org.example.lesson_2

fun main() {
    val crystalOreNumber = 7
    val ironOreNumber = 11
    val buffPercentage = 20

    val bonusCrystalOre = (crystalOreNumber * buffPercentage) / 100
    val bonusIronOre = (ironOreNumber * buffPercentage) / 100

    println("Bonus Crystal Ore: $bonusCrystalOre")
    println("Bonus Iron Ore: $bonusIronOre")
}