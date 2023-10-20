/*fun main(){
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)
    println(authors===writers)
}*/

fun main(){
    fun max(a: Int, b: Int) = if(a > b) a else b

    println(max(99, -42))
}