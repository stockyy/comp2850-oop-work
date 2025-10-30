// Task 12.4.1: main program

fun main() {
    val point = Point2(4.0, 4.0)
    val circle = Circle2(point, 2.0)
    val point2 = Point2(5.0, 3.0)
    val point3 = Point2(10.0, 6.0)
    println("Perimiter: ${circle.perimeter()}, Area: ${circle.area()}")
    println("Point in Circle: ${circle contains point2}")
    println("Point not in Circle: ${circle contains point3}")

}
