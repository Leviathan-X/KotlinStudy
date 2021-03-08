import java.lang.StringBuilder

fun main(args: Array<String>) {
    // When saving this quote a disk error has occurred. Please fix it!
    // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
    // Use pieces of the quote variable (instead of just redefining the string)!

    var quote = "\nHofstadter's Law: It you expect, even when you take into account Hofstadter's Law."

    var newQuote = StringBuilder(quote)
    val targetIndex = quote.indexOf("you expect")

    newQuote.insert(targetIndex, "always takes longer than ")

    quote = newQuote.toString()
    println(quote)
}