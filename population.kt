fun main() {
    println("Enter the starting number of organisms:")
    var population = readLine()?.toIntOrNull() ?: 0
    if (population < 2) {
        println("Starting population must be at least 2.")
        return
    }

    println("Enter the average daily population increase as a percentage:")
    var increase = readLine()?.toDoubleOrNull() ?: 0.0
    if (increase < 0) {
        println("Average daily population increase cannot be negative.")
        return
    }

    println("Enter the number of days they will multiply:")
    var days = readLine()?.toIntOrNull() ?: 0
    if (days < 1) {
        println("Number of days they will multiply must be at least 1.")
        return
    }

    for (day in 1..days) {
        println("Day $day: Population = $population")
        population += (population * increase / 100).toInt()
    }
}
