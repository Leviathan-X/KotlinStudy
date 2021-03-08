fun main(args: Array<String>) {
    var consent = true

    while(consent) {
        println("\nWelcome to the BMI count program")
        bmiStart()
        print("\nContinue? (y/n): ")
        var consentInput = readLine()!!.toString()
        consent = consentInput == "y" || consentInput == "Y"
    }
}

fun bmiStart () {
    print("\nPlease enter your height in centimeters: ")
    val height = readLine()!!.toDouble() / 100
    print("Please enter your weight in kilograms: ")
    val mass = readLine()!!.toDouble()

    val bmiResult = mass / (height * height)
    val bmiResultString = "%.2f".format(bmiResult)
    println("Your result is: ${bmiResultString}")
    if(bmiResult < 18.5) println("You're too thin, eat something!")
    else if (bmiResult > 18.5 && bmiResult < 25) println("You're alright!")
    else println("You're too fat, put that burger down!")
}