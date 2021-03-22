//fun main() {
//    val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
//    val distinct = total.distinct()
//
//    println(distinct)
//}

//fun main() {
//   data class Item(val key: String, val value: Any)
//
//    val items = listOf(
//        Item("1", "Kotlin"),
//        Item("2", "is"),
//        Item("3", "Awesome"),
//        Item("3", "as"),
//        Item("3", "Programming"),
//        Item("3", "Language")
//    )
//
//    val distinctItems = items.distinctBy { it.key }
//    distinctItems.forEach {
//        println("${it.key} with value ${it.value}")
//    }
//
//}

//fun main() {
//    val text = listOf("A", "B", "CC", "EEE", "F", "GGGG")
//    val distinct = text.distinctBy { it.length }
//
//    println(distinct)
//}

/*
Chunked
 */

//fun main() {
//    val word = "QWERTYUIOP"
//    val chunked = word.chunked(5)
//
//    println(chunked)
//}

//fun main() {
//    val word = "QWERTYUIOP"
//    val chunkedTransform = word.chunked(3) {
//        it.toString().toLowerCase()
//    }
//
//    println(chunkedTransform)
//}



