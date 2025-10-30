// Task 12.8.1: example of an enum class
enum class Day {
    Monday, Tuesday, Wednesday, Thursday,
    Friday, Saturday, Sunday
}

fun main() {
    print("Enter a day: ")
    val userDay = readln()
    try { 
        val day = Day.valueOf(userDay)
        println("Output: $day")
    }
    catch (e: IllegalArgumentException) {
        println("Error: Illegal Argument")
        print("    Valid Arguments: ")
        println((Day.entries).joinToString(", ", postfix = "."))
    }
}