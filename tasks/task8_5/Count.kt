fun String.howMany(include: (Char) -> Boolean): Int {
    var count = 0
    for (character in this) {
        if (include(character)) {
            count += 1
        }
    }
    return count
}

fun main () {
    val str1 = "para-diddyblud"
    val str2 = "0lliE t0uche3s Ch1lDr3n!"
    println("Num Vowels in '$str1': %d".format(str1.howMany {it in "aeiou"}))
    println("Num Uppercase Chars in '$str2': %d".format(str2.howMany {it.isUpperCase()}))
    println("Num Digits in '$str2': %d".format(str2.howMany {it.isDigit()}))
}