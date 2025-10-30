// Task 10.5

fun printReversed5(text: String?) = println("Result: %s".format(text?.let { it.reversed().uppercase()} ?: "???"))

fun main() {
    print("Enter a string: ")
    val input = readLine()

    println("Input: $input")
    printReversed5(input)
}
