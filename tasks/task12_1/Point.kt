import kotlin.math.hypot

class Pointy (var x: Double, var y: Double) {
    fun distance() = hypot(x, y)
    fun distanceFrom(point: Pointy) = hypot(x - point.x, y - point.y)
}

fun main() {
    val p1 = Pointy(4.5, 7.0)

    print("Enter x coordinate: ")
    val ux = readln().toDouble()
    print("Enter y coordinate: ")
    val uy = readln().toDouble()

    val p2 = Pointy(ux, uy)
    println("Distance from origin: ${p2.distance()}")
    println("Distance from 4.5, 7.0: ${p2.distanceFrom(p1)}")
}