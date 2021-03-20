fun main() {

    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "Inggris",
        "New Dehli" to "India"
    )

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    val mapKeys = capital.keys
    val mapValue = capital.values

    println(mapKeys)
    println(mapValue)

    val mutableCapital = capital.toMutableMap()

    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    println(mutableCapital)

}