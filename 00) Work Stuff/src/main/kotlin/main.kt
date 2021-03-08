import java.text.Normalizer

val FIRST_INDEX = 0
var last_index = 50

val firstNames = hashMapOf<String, Boolean>("Adam" to true, "Karel" to true, "Jana" to false, "Tomáš" to true,
    "Kateřina" to false, "Pavel" to true, "Diana" to false, "Lucie" to false, "David" to true, "Marie" to false)
val lastNames = listOf("Novák", "Horák", "Dvořák", "Pospíšil", "Beneš")

val REGEX_UNACCENT = "\\p{InCombiningDiacriticalMarks}+".toRegex()


fun main(args: Array<String>) {
    val generatedUser = buildName()

    println("First name: ${generatedUser[0]}")
    println("Last name: ${generatedUser[1]}")
    println("Email: ${generatedUser[2]}")
    println("Username: ${generatedUser[3]}")
}

fun buildName() :List<String> {
    val generatedFirstName = firstNames.entries.elementAt((0 until firstNames.size).random())
    val finalFirstName = generatedFirstName.key

    val generatedLastName = lastNames[(lastNames.indices).random()]
    val finalLastName: String
    if (!generatedFirstName.value) finalLastName = generatedLastName + "ová"
    else finalLastName = generatedLastName

    val finalUsername = "${finalFirstName.decapitalize().unaccent()}.${finalLastName.decapitalize().unaccent()}"
    val finalEmail = "$finalUsername@abc.com"

    return listOf<String>(finalFirstName, finalLastName, finalEmail, finalUsername)
}

fun CharSequence.unaccent(): String {
    val temp = Normalizer.normalize(this, Normalizer.Form.NFD)
    return REGEX_UNACCENT.replace(temp, "")
}