// Task 3.1: command line arguments
import kotlin.system.exitProcess

fun main(argv: Array<String>) {
    /* if (argv.size != 2) {
        println("Error: Exactly 2 command line arguments are needed")
        exitProcess(1)
    } */
    println("argv[0]: ${argv[0]}")
    println("argv[1]: ${argv[1]}")
}




