// Task 7.7.1: stats for a numeric dataset
fun readData() = buildList {
    // User Prompt & Input
    print("Enter a series of floating point values (separated by spaces): ")
    val input = readln()
    // Split up user input from a string into a list 
    val inputList = input.split(" ")

    for (item in inputList) {
        // Try to add item to buildList
        try {
            add(item.toFloat())
        }
        // If input cannot convert to Float, then ignore
        catch (e: NumberFormatException) {
            println("'$item' ignored, not a float value")
        }
    }
}

// Function to find the median value in a list
fun findMedian(inputList: List<Float>): Float {
    // Get size of list and sort it 
    val listSize = inputList.size
    val sortedList = inputList.sorted()
    // Return median value (index based off of odd/even number of items)
    if (listSize % 2 == 0) {
        val middleNumbers = sortedList[listSize/2] + sortedList[(listSize/2) -1]
        return middleNumbers/2
    }
    else {
        // using integer division so even though teh index sum would result in
        // .5, the .5 is dropped giving us just the correct middle index
        return sortedList[(listSize/2)]
    }
}

fun displayMetrics(inputList: List<Float>) {
    //Find all metrics
    val listSize = inputList.size
    val minimum = inputList.min()
    val maximum = inputList.max()
    val total = inputList.sum()
    val median = findMedian(inputList)
    val mean = inputList.average()
    
    // Print all metrics
    println("---- METRICS ----")
    println("Number of items: $listSize")
    println("Min: $minimum")
    println("Max: $maximum")
    println("Total: $total")
    println("Median: $median")
    println("Mean (4 d.p.): %.4f".format(mean))
}

fun main () {
    val inputList = readData()
    displayMetrics(inputList)
}