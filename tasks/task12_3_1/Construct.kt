// Task 12.3.1: secondary constructors

class Point1(var x: Double, var y: Double) {
    constructor(x: Int, y: Int): this(x.toDouble(), y.toDouble())
}

fun main() {
    val p = Point1(4, 7)
    println("(${p.x}, ${p.y})")
}
