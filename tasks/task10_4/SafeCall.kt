// Task 10.4

fun printReversed(text: String?) = println("Result: %s".format(text?.let { it.reversed().uppercase()}))

fun main() {
    print("Enter a string: ")
    val input = readLine()

    println("Input: $input")
    printReversed(input)
}
