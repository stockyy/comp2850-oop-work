// Task 7.3.1: list element access
fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    print("Original List: ")
    println(numbers)
    
    print("Adding a value: ")
    numbers.add(1)
    println(numbers)

    print("Adding a different collection to it: ")
    val newNumbers = listOf(9, 53, 420, 1)
    numbers.addAll(newNumbers)
    println(numbers)

    print("Removing first instance of 1: ")
    numbers.remove(1)
    println(numbers)

    print("Removing all 9s: ")
    val newNewNumbers = listOf(9)
    numbers.removeAll(newNewNumbers)
    println(numbers)

    print("Removing the item at index 3: ")
    numbers.removeAt(3)
    println(numbers)

    print("Emptying the list: ")
    numbers.clear()
    println(numbers)
    }