// Task 5.1.2: die rolling simulation
import kotlin.random.Random

fun rollDie(sides: Int = 6) {
    // input validation
    if (sides in setOf(4, 6, 8, 10, 12, 14, 16, 18, 20)) {
        println("Rolling a d$sides...")
        // Random roll
        val roll = Random.nextInt(1, sides+1)
        println("You rolled a $roll!")
    }
    else {
        println("Error: Cannot have a $sides sided die!")
    }
}

fun readInt(prompt: String): Int {
    print("$prompt")
    val input = readln()
    val intVar = input.toInt()
    return intVar  
}

fun main() {
    val prompt = "How many sides would you like your die to have (enter 0 for default)?"
    val sides = readInt(prompt)
    if (sides != 0) {
        rollDie(sides)
    }
    else{
        rollDie()
    }
}