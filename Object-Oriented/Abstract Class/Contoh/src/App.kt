abstract class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean ) {

    fun eat() {
        println("$name sedang makan!")
    }

    fun sleep() {
        println("$name sedang tidur!")
    }

}

fun main() {
    val animal = Animal("Dicoding Animal", 2.6, 1, true)
}