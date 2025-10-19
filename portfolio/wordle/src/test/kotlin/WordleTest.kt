import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class WordleTest : StringSpec({
    // isValid tests
    "String should be valid" {
        isValid("hello") shouldBe true
    }
    "String with numbers should be invalid" {
        isValid("hg1gh") shouldBe false
    }
    "String with <5 chars should be invalid" {
        isValid("gh") shouldBe false
    }
    "String with >5 chars should be invalid" {
        isValid("asdfgh") shouldBe false
    }

    // evaluateGuess
    "when guess = target" {
        evaluateGuess("abcde", "abcde") shouldBe listOf(1, 1, 1, 1, 1)
    }

    "when guess != target" {
        evaluateGuess("abcda", "vwxyz") shouldBe listOf(0, 0, 0, 0, 0)
    }

    "when guess and target share 2 letters" {
        evaluateGuess("xaxbx", "papbp") shouldBe listOf(0, 1, 0, 1, 0)
    }

    "checking for partial matches" {
        evaluateGuess("abcde", "axbex") shouldBe listOf(1, 2, 0, 0, 2)
    }

    "repeated letters in guesses shouldn't return partial match if there is a match" {
        evaluateGuess("aaaaa", "abbba") shouldBe listOf(1, 0, 0, 0, 1)
    }

    // readWordList
    "Reads Words correctly" {
        readWordList("data/test-words.txt") shouldBe listOf("TESTY", "FILEY", "WORDS")
    }

    // pickRandomWord
    "Random Word should be selected and then deleted from the list" {
        val words = mutableListOf("skibi", "ollie", "phone")
        pickRandomWord(words)
        words.size shouldBe 2
    }
})
