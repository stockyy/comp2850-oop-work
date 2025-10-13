// Task 5.3.2: dice rolling simulation
import kotlin.random.Random

fun rollDice(sides: Int = 6, throws: Int = 1) {
    var total = 0
    for (n in 1..throws) {
        var roll = Random.nextInt(1, sides+1)
        println("You rolled a $roll!")
        total += roll
    }
    println("Your total was $total!")
}

fun readInt1(prompt: String): Int {
    print(prompt)
    val input = readln()
    return input.toInt()
}

fun main() {
    var prompt = "How many sides would you like your die to have (enter 0 for default)? "
    val sides = readInt1(prompt)
    prompt = "How many dice would you like to throw? "
    val throws = readInt1(prompt)
    if (sides == 0 && throws == 0) {
        rollDice()
    }
    else if (sides == 0) {
        rollDice(throws=throws)
    }
    else if (throws == 0) {
        rollDice(sides=sides)
    }
    else {
        rollDice(throws=throws, sides=sides)
    }
}