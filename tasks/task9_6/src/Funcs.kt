// Task 9.6: functions for dataset variance calculation
import java.io.File


// Add variance() function here
fun variance(dataset: List<Double>): Double {
    require(dataset.count() > 1) {"Dataset must contain at least 2 values"}
    val mean = dataset.average()
    val sumSquaredDeviations = dataset.map{it - mean}.sumOf{it * it}
    return sumSquaredDeviations / (dataset.size - 1)
}

// Add readData() function here
fun readData(filename: String) = buildList {
    File(filename).forEachLine {
        add(it.toDouble())
    }
}