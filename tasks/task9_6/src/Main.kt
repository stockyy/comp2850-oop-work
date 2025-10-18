// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    val result = runCatching {
        val dataset = readData(args[0])
        val variance = variance(dataset)
        val datasetSize = dataset.size
        println("Size: $datasetSize")
        println("Variance %.5f".format(variance))
    }
    if (result.isFailure) {
        println("Task Failed: ${result.exceptionOrNull()}")
        exitProcess(1)
    }
}
