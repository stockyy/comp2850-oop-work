// Task 12.5.2: class with a custom getter

import java.time.LocalDate

class Person3(_name: String, val birth: LocalDate) {
    constructor(name: String, birth: String): this(name, LocalDate.parse(birth))
    var isMarried = false
    
    var name = _name
        get() {
            return field.uppercase()
        }
}

fun main() {
    var skibidi = Person3("toilet", "2004-12-08")
    print(skibidi.name)
}