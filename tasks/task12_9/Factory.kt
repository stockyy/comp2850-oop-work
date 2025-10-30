// Task 12.9: class implementing the Static Factory Method pattern

import java.time.LocalDate

class Person0 private constructor(val name: String, val birth: LocalDate) {
    companion object Factory {
        private val names = mutableSetOf<String>() 

        fun create(name: String, birth: LocalDate): Person0 {
            require(name !in names) {"Name must be unique!"}
            names.add(name)
            return Person0(name, birth)
        }
    }
}

fun main() {
    val p = person0("ned", "")
}