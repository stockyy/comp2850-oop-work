// Task 5.1.1: anagram checking using a function
fun Anagrams1(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    else {
        val firstChars = first.lowercase().toList().sorted()
        val secondChars = second.lowercase().toList().sorted()
        return firstChars == secondChars
    }
}

fun main(argv: Array<String>) {
    if (argv.size != 2) {
        println("Please enter exactly 2 words/phrases")
    }
    else {
        val firstString = argv[0]
        val secondString = argv[1]
        if (Anagrams1(firstString, secondString) == false) {
            println("'$firstString' and '$secondString' are not anagrams")
        }
        else {
            println("'$firstString' and '$secondString' are anagrams!")
        }
    }
}