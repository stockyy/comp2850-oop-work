fun main() {
    val myAge = 29u // unsigned int
    println(myAge::class)
    val universeAge = 13_800_000_000L
    println(universeAge::class) // Long
    val status = 'M'
    println(status::class) // Char
    val name = "Sarah"
    println(name::class) // String
    val height = 1.78f
    println(height::class) // Float
    val root2 = Math.sqrt(2.0)
    println(root2::class) // Double
}