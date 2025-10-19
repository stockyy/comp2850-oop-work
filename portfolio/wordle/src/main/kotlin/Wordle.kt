// Implement the six required functions here
import java.io.File
import kotlin.system.exitProcess

const val WORD_LENGTH = 5

// Checks if a word is of correct length
fun isValid(word: String): Boolean {
    var lettersOnly = true
    // make sure all chars are letters
    for (char in word) {
        if (!char.isLetter()) {
            lettersOnly = false
        }
    }
    // return true if word is of correct size & only contains letters
    return word.length == WORD_LENGTH && lettersOnly
}

// Reads all data in from a word list and returns a list of strings
fun readWordList(filename: String): MutableList<String> {
    val result = runCatching {
        // Read words into a list
        // Using useLines so file contents don't need to be stored in memory
        File(filename).useLines { it.toMutableList() }
    }
    // if successful: return the list
    // if unsuccessful, use lambda expression to print error message
    return result.getOrElse { exception ->
        println("Could not open '$filename': ${exception.message}")
        exitProcess(1)
    }
}

fun pickRandomWord(words: MutableList<String>): String {
    val numWords = words.size
    val randomIndex = (0..(numWords - 1)).random()
    val chosenWord = words[randomIndex]
    words.remove(words[randomIndex])
    return chosenWord
}

fun obtainGuess(attempt: Int): String {
    // Input Loop
    while (true) {
        // Prompt + get input
        print("Attempt $attempt: ")
        val guess = readln()
        // Check if guess is valid
        if (isValid(guess)) {
            return guess
        }
        else {
            println("Invalid guess! Please enter a word with exactly 5 letters.")
            continue
        }
    }
}

fun evaluateGuess(guess: String, target: String): List<Int> {
    // Initialise variables
    var result = mutableListOf(0, 0, 0, 0, 0) // result list
    var targetChars = target.toMutableList()
    // Remove letter from target chars if there is a match
    for (i in 0..WORD_LENGTH - 1) {
        if (guess[i] == target[i]) {
            result[i] = 1
            targetChars.remove(guess[i])
        }
    }
    // Check for partial matches
    for (i in 0..WORD_LENGTH - 1) {
        if (guess[i] in targetChars) {
            result[i] = 2
        }
    }

    return result
}

fun displayGuess(guess: String, matches: List<Int>) {
    // initialise counter/index
    var i = 0
    // Iterate through letters and print letter if its a match, '?' otherwise
    for (char in guess) {
        if (matches[i] == 1) {
            print(guess[i].uppercase())
        }
        else if (matches[i] == 2) {
            print("!")
        }
        else {
            print("?")
        }
        i += 1
    }
    print("\n")
}
