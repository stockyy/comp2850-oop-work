// Task 12.3.3: Person class, with a secondary constructor
import java.time.LocalDate

class Person2(var name: String, val birth: LocalDate) {
    constructor(name: String, birth: String): this(name, LocalDate.parse(birth))
    var isMarried = false

    init {
        require(name.isNotBlank()) {"Name Cannot be Blank"}
    }
}

fun main () {
    print("name: ")
    val name = readln()
    val date = LocalDate.of(1997, 8, 23)
    var persona = Person2(name, "2004-12-08")
    println("${persona.name} ${persona.birth} ${persona.isMarried}")
}