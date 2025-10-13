// Task 5.1.1: anagram checking using a function
infix fun String.isAnagramOf(str: String) = this.lowercase().toList().sorted() == str.lowercase().toList().sorted()


fun main(argv: Array<String>) {
    if (argv.size != 2) {
        println("Please enter exactly 2 words/phrases")
    }
    else {
        val firstString = argv[0]
        val secondString = argv[1]
        if (firstString isAnagramOf secondString) {
            println("'$firstString' and '$secondString' are anagrams!")
        }
        else {
            println("'$firstString' and '$secondString' are not anagrams")
        }
    }
}