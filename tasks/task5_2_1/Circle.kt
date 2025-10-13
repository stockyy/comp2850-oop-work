// Task 5.2.1: geometric properties of circles
import kotlin.math.PI
import readDouble

fun circleArea(radius: Double) = PI * radius * radius

fun circleCircum(radius: Double) = 2 * PI * radius

fun readDouble(prompt: String): Double {
    print(prompt)
    val input = readln()
    return input.toDouble()
}

fun main() {
    val radius = readDouble("What is the radius of your circle? ")
    println("Area of Circle: %.4f".format(circleArea(radius)))
    println("Circumference of Circle: %.4f".format(circleCircum(radius)))
}