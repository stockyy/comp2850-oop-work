// Task 12.5.4: class with a computed property

import java.time.LocalDate
import java.time.temporal.ChronoUnit.YEARS

class Persona1(var name: String, val birth: LocalDate) {
    constructor(name: String, birth: String): this(name, LocalDate.parse(birth))
    var isMarried = false

    val age get() = YEARS.between(birth, LocalDate.now()).toInt()
}

fun main() {
    val person = Persona1("Ned", "2004-12-08")
    println("Age of ${person.name}: ${person.age}") 
}