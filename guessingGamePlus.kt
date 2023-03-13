fun main() {
    val randomNumber = (1..100).random()
    var guess: Int? = null
    var guessCount = 0

    while (guess != randomNumber) {
        println("Guess a number between 1 and 100:")
        guess = readLine()?.toIntOrNull()

        if (guess == null) {
            println("Invalid input. Please enter a number.")
        } else {
            guessCount++
            if (guess > randomNumber) {
                println("Too high, try again.")
            } else if (guess < randomNumber) {
                println("Too low, try again.")
            }
        }
    }

    println("You're the goat you guessed the number $randomNumber in $guessCount guesses.")
}
