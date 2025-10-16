// Task 6.4.2

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class AnagramTest: StringSpec({
    "Two strings of different lengths cannot be anagrams" {
        withClue("Both Length 1") {"x".anagramOf("x") shouldBe true}
        withClue("Both Length 10") {"xxxxxxxxx".anagramOf("xxxxxxxxxx") shouldBe true}
        withClue("Different Lengths") {"xxx". anagramOf("xx") shouldBe(false)}
    }

    "An empty string is not an anagram of itself" {
        withClue("'' anagramOf ''") {"".anagramOf("") shouldBe(false)}
    }

    "A non-empty string is an anagram of itself" {
        withClue("Lowercase") {"ned".anagramOf("ned") shouldBe(true)}
        withClue("Uppercase") {"NED".anagramOf("NED") shouldBe(true)}
    }

    "Same characters but in different orders" {
        withClue("lowercase") {"abcd".anagramOf("bcda") shouldBe(true)}
        withClue("uppercase") {"ABCD".anagramOf("BCDA") shouldBe(true)}
    }

    "Lower/Uppercases don't matter" {
        withClue("Upper anagramOf Lower") {"ABC".anagramOf("abc") shouldBe(true)}
        withClue("Lower anagramOf Upper") {"abc".anagramOf("ABC") shouldBe(true)}
    }
})
