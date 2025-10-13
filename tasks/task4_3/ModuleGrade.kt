import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(argv: Array<String>) {
    // Input Validation
    if (argv.size != 3) {
        println("Invalid number of marks, please enter exact 3 module marks.")
        exitProcess(1)
    }
    // Calculations
    val total_marks = argv[0].toFloat() + argv[1].toFloat() + argv[2].toFloat()
    val average_grade = total_marks / 3
    val rounded_grade = average_grade.roundToInt()
    println("Average Grade (rounded): $rounded_grade") 

    // Switch Statement
    when (rounded_grade) {
        in 0..39 -> println("Fail")
        in 40..69 -> println("Pass")
        in 70..100 -> println("Distinction")
    }
}

