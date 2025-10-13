// Task 5.4.1: string extension function
val String.tooLong: Boolean get() = this.length - 20 > 0

fun main() {
    print("Enter your String: ")
    val input = readln()
    if (input.tooLong) {
        println("Your String is too long!")
    }
    else {
        println("You're mint mate")
    }
}