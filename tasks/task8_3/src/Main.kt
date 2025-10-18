

import fetchData// Task 8.3: weather station temperature analysis program

fun main() {
    // Add code here to:
    //   - Fetch data
    //   - Find records with lowest and and highest temperatures
    //   - Compute average temperature
    //   - Display all of these statistics
    val dataset = fetchData()
    val lowest = dataset.minBy {it.second}
    val highest = dataset.maxBy {it.second}
    val average = dataset.sumOf {it.second} / dataset.count().toDouble()

    println("Lowest: $lowest\nHighest = $highest\nAverage = $average")
}