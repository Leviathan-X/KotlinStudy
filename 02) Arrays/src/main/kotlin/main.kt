fun main(args: Array<String>) {
    // - Create an array variable named `firstArrayOfNumbers`
    //   with the following content: `[1, 2, 3]`
    // - Create an array variable named `secondArrayOfNumbers`
    //   with the following content: `[4, 5]`
    // - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
    //   elements than `firstArrayOfNumbers`

    val firstArrayOfNumbers = arrayListOf<Int>(1, 2, 3)
    val secondArrayOfNumbers = arrayListOf<Int>(4, 5)

    if (firstArrayOfNumbers.size < secondArrayOfNumbers.size) println("secondArrayOfNumbers is longer")
    else println("firstArrayOfNumbers is longer")

    // - Create an array variable named `numbers`
    //   with the following content: `[54, 23, 66, 12]`
    // - Print the sum of the second and the third element

    val numbers1 = arrayListOf<Int>(54, 23, 66, 12)
    println(numbers1[1] + numbers1[2])

    // - Create an array variable named `numbers`
    //   with the following content: `[4, 5, 6, 7]`
    // - Print all the elements of `numbers`

    println()
    val numbers2 = arrayListOf<Int>(4, 5, 6, 7)
    for (i in 0 until numbers2.size) println(numbers2[i])

    // - Create an array variable named `numList`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Double all the values in the array

    val numbers3 = arrayListOf<Int>(3, 4, 5, 6, 7)
    for (i in 0 until numbers3.size) numbers3[i] *= 2

    println()
    for (i in 0 until numbers3.size) println(numbers3[i])

    // - Create a two dimensional array
    //   which can contain the different shades of specified colors
    // - In `colors[0]` store the shades of green:
    //   `"lime", "forest green", "olive", "pale green", "spring green"`
    // - In `colors[1]` store the shades of red:
    //   `"orange red", "red", "tomato"`
    // - In `colors[2]` store the shades of pink:
    //   `"orchid", "violet", "pink", "hot pink"`

    val colors = arrayOf(
        arrayOf("lime", "forest green", "olive", "pale green", "spring green"),
        arrayOf("orange", "red", "tomato"),
        arrayOf("orchid", "violet", "pink", "hot pink",)
    )

    println()
    for (i in colors) {
        for (j in i) {
            print("$j, ")
        }
        println()
    }

    // - Create an array variable named `animals`
    //   with the following content: `["koal", "pand", "zebr"]`
    // - Add all elements an `"a"` at the end

    val animals = arrayOf("koal", "pand", "zebr")

    for (i in animals.indices) animals[i] += "a"

    println()
    for (i in animals) println(i)

    // - Create an array variable named `numbers`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `numbers`
    // - Print the elements of the reversed `numbers`

    val numbers4 = arrayOf(3, 4, 5, 6, 7)
    println()
    for (i in numbers4) println(i)

    for (i in 0 until (numbers4.size / 2)) {
        var temp = numbers4[i]
        numbers4[i] = numbers4[numbers4.size -i -1]
        numbers4[numbers4.size -i -1] = temp
    }

    println()
    for (i in numbers4) println(i)
}