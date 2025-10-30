// Task 12.3.2: Person class, with a secondary constructor
import java.time.LocalDate

class Person1(var name: String, val birth: LocalDate) {
    constructor(name: String, birth: String): this(name, LocalDate.parse(birth))
    var isMarried = false
}

fun main () {
    val date = LocalDate.of(1997, 8, 23)
    var persona = Person1("Joker", "2004-12-08")
    println("${persona.name} ${persona.birth} ${persona.isMarried}")
}