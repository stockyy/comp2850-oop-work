// Task 12.4.1: Point class

import kotlin.math.hypot

class Point2(val x: Double, val y: Double) {
    fun distance() = hypot(x, y)
    fun distanceTo(p: Point2) = hypot(x - p.x, y - p.y)
}
