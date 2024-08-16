package org.example.lesson_2

fun main() {
    val employeesNumber = 50
    val employeesSalary = 30000
    val traineesNumber = 30
    val traineesSalary = 20000

    val employeesSalaryExpenses = employeesNumber * employeesSalary
    println(employeesSalaryExpenses)

    val traineesSalaryExpenses = traineesNumber * traineesSalary
    val allSalaryExpenses = employeesSalaryExpenses + traineesSalaryExpenses
    println(allSalaryExpenses)

    // calculate an average salary
    val allStaffNumber = employeesNumber + traineesNumber
    println(allSalaryExpenses / allStaffNumber)
}