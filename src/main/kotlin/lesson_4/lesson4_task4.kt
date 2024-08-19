package org.example.lesson_4

fun main() {
    val trainingDayNumber = 5

    for (day in 1..trainingDayNumber) {
        println("День $day")
        val isEvenDay = day % 2 == 0

        printExercisesInfo(
            handsExercise = !isEvenDay,
            legsExercise = isEvenDay,
            backExercise = isEvenDay,
            pressExercise = !isEvenDay
        )
    }
}

fun printExercisesInfo(handsExercise: Boolean, legsExercise: Boolean, backExercise: Boolean, pressExercise: Boolean) {
    println("Упражнения для рук: $handsExercise\n" +
            "Упражнения для ног: $legsExercise\n" +
            "Упражнения для спины: $backExercise\n" +
            "Упражнения для пресса: $pressExercise")
}