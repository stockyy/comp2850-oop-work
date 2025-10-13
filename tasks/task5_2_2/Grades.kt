// Task 5.2.2: conversion of marks into grades, using a function
import kotlin.system.exitProcess
import grade2

fun grade2(mark: Int) = when (mark) {
    in 0..39 -> "Fail"
    in 40..69 -> "Pass"
    in 70..100 -> "Distinction"
    else -> "?"
}

fun main(argv: Array<String>) {
    if (argv.size <=0) {
        println("Please enter at least 1 grade")
        exitProcess(1)
    }
    else {
        var total_marks = 0
        for (n in 0..argv.size-1) {
            total_marks += argv[n].toInt()
        }
        val averageMark = total_marks / argv.size
        val result = grade2(averageMark)
        print("Your grade is a: $result")
    }
}