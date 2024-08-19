package org.example.lesson_4

const val CARGO_AVERAGE_CATEGORY = "Average"
const val MIN_WEIGHT_AVERAGE = 35
const val MAX_WEIGHT_AVERAGE = 100
const val MAX_VOLUME_AVERAGE = 100

fun main() {
    var cargoWeight = 42
    var cargoVolume = 120
    printMessage(cargoWeight, cargoVolume)

    cargoWeight = 20
    cargoVolume = 80
    printMessage(cargoWeight, cargoVolume)

    cargoWeight = 50
    cargoVolume = 100
    printMessage(cargoWeight, cargoVolume)
}

fun printMessage(cargoWeight: Int, cargoVolume: Int) {
    val isAverage = (cargoWeight <= MAX_WEIGHT_AVERAGE)
            && (cargoWeight > MIN_WEIGHT_AVERAGE)
            && (cargoVolume < MAX_VOLUME_AVERAGE)
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л" +
            "соответствует категории $CARGO_AVERAGE_CATEGORY: $isAverage")
}