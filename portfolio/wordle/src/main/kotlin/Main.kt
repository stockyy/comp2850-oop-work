import kotlin.system.exitProcess

const val MAX_ATTEMPTS = 6

fun main() {
    // Retrive word list and choose a word
    val wordList = readWordList("data/words.txt")
    val target = pickRandomWord(wordList)
    // attempt loop
    println("Feedback Format: \n'?' - letter not in word\n'!' - letter in incorrect position")
    for (i in 1..MAX_ATTEMPTS) {
        val guess = obtainGuess(i)
        val matches = evaluateGuess(guess, target)
        displayGuess(guess, matches)
        // winning condition
        if (matches == listOf(1, 1, 1, 1, 1)) {
            println("You win!")
            exitProcess(0)
        }
    }
    println("You Lose! The word was '$target'")
}
