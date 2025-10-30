// Task 12.4.1: Circle class
import kotlin.math.PI

class Circle2(val centre: Point2, val radius: Double) {
    init {
        require(radius > 0)
    }

    fun area(): Double {
        return PI * radius * radius
    }

    fun perimeter(): Double {
        return 2 * PI * radius
    }

    infix fun contains(point: Point2): Boolean {
        if (point.x < centre.x + radius && point.x > centre.x - radius) {
            if (point.y < centre.y + radius && point.y > centre.y - radius) {
                return true
            }
            else {
                return false
            }
        }
        else {
            return false
        }
    }
}