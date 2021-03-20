//data class DataUser(val name : String, val age : Int)
//
//fun main(){
//   val dataUser = DataUser("nrohmen", 17)
//    val (name, age) = dataUser
//
//    println("My name is $name, I am $age yaers old")
//}

data class DataUser(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main(){
    val dataUser = DataUser("nrohmen", 23)
    dataUser.intro()
}