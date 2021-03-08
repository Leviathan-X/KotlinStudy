fun main(args: Array<String>) {
    println("\nWelcome to the Average of Input program")
    var consent = true

    while (consent) {
        startAverageOfInput()
        print("\nContinue? (y/n): ")
        var consentInput = readLine()
        consent = consentInput == "y" || consentInput == "Y"
    }
}

fun startAverageOfInput() {
    print("\nHow many numbers do you want to count for their average: ")
    var totalNumsInput = readLine()!!.toInt()

    var numbers = Array(totalNumsInput) {
        print("Number ${it + 1}: ")
        readLine()!!.toInt()
    }

    var sum = 0
    for (number in numbers) sum += number
    var avg = sum.toFloat() / totalNumsInput.toFloat()

    println("The sum is $sum and the average is $avg")
}