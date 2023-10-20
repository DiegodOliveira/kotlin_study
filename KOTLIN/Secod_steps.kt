import kotlin.math.log

fun main(){
    fun printAll(vararg messages: String){
        for (m in messages) println(m)
    }

    printAll("Olá", "Hello", "Hallo", "Hola", "Salut")

    fun printAllWithPrefix(vararg  messages: String, prefix: String){
        for (m in messages) println(prefix + m)
    }

    printAllWithPrefix("Olá", "Hello", "Hallo", "Hola", "Salut",
            prefix = "Greetings: ")

    fun Log(vararg entries: String){
        printAll(*entries)
    }

    Log("Olá", "Hello", "Hallo", "Hola", "Salut")
}