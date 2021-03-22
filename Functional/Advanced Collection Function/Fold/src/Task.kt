fun main() {
    val numbers = listOf(1, 2, 3)
    val fold = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result: $fold")
}

//fun main() {
//    val numbers = listOf(1, 2, 3)
//    val fold = numbers.fold(10) { current, item ->
//
//        println("current $current")
//        println("item $item")
//        println()
//        current + item
//    }
//
//    println("Fold result: $fold")
//}

