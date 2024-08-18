package org.example.lesson_4

fun main() {
    var handsExercise = true
    var legsExercise = false
    var backExercise = false
    var pressExercise = true
    val trainingDayNumber = 5

    for (day in 1..trainingDayNumber) {
        println("День $day")
        printExercisesInfo(handsExercise, legsExercise, backExercise, pressExercise)

        handsExercise = !handsExercise
        legsExercise = !legsExercise
        backExercise = !backExercise
        pressExercise = !pressExercise
    }
}

fun printExercisesInfo(handsExercise: Boolean, legsExercise: Boolean, backExercise: Boolean, pressExercise: Boolean) {
    println("Упражнения для рук: $handsExercise\n" +
            "Упражнения для ног: $legsExercise\n" +
            "Упражнения для спины: $backExercise\n" +
            "Упражнения для пресса: $pressExercise")
}