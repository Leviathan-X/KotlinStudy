fun main(args: Array<String>) {
    println("\nWelcome to the Animals and Legs program\n")
    var consent = true
    while (consent) {
        animalsAndLegsStart()
        print("\nContinue? (y/n): ")
        var consentInput = readLine()
        consent = consentInput == "y" || consentInput == "Y"
    }
}

fun animalsAndLegsStart() {
    print("How many chickens does the farmer have: ")
    var chickens = readLine()!!.toInt()
    print("How many pigs does the farmer have: ")
    var pigs = readLine()!!.toInt()

    var chickLegs = chickens * 2
    var pigLegs = pigs * 4
    var total = chickLegs + pigLegs
    println("\nThe chicks have $chickLegs legs in total, pigs have $pigLegs legs in total" +
            "\nThere is a total of $total legs on the whole farm.")
}