fun main() {
    val randomNumber = (1..100).random()
    var guess: Int? = null

    while (guess != randomNumber) {
        println("Guess a number between 1 and 100:")
        guess = readLine()?.toIntOrNull()

        if (guess == null) {
            println("Invalid input. Please enter a number.")
        } else if (guess > randomNumber) {
            println("Too high, try again.")
        } else if (guess < randomNumber) {
            println("Too low, try again.")
        }
    }

    println("YESSS You guessed the number! $randomNumber.")
}
