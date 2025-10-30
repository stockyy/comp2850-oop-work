// Task 12.4.2: Point class with overridden toString()

import kotlin.math.hypot

class Point3(val x: Double, val y: Double) {
    fun distance() = hypot(x, y)
    fun distanceTo(p: Point3) = hypot(x - p.x, y - p.y)

    override fun toString() = "($x, $y)"
}

fun main() {
    val point = Point3(7.0, 4.6)
    println(point)
}