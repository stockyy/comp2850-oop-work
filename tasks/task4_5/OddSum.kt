// Task 4.5: summing odd integers with a for loop
fun main() {
    print("The sum of all odd integers between 1 and...")
    val user_input = readln()
    val maximum = user_input.toInt()
    var sum: ULong = 0u  // Unsigned Long to hold larger values
    for (i in 1..maximum step 2) {
        sum = sum + i.toULong()
    }
    println(sum)
}