fun main() {
    println("Enter a positive nonzero integer:")
    val n = readLine()?.toIntOrNull() ?: 0
    if (n <= 0) {
        println("Invalid input. Please enter a positive nonzero integer.")
        return
    }

    var sum = 0
    for (i in 1..n) {
        sum += i
    }

    println("The sum of integers from 1 to $n is $sum.")
}
