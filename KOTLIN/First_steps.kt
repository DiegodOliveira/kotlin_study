fun printMessage(message: String){
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "info"){
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int) = x + y

fun multiply(x: Int, y: Int) = x * y

fun main(){
    /*printMessage("Olá mundo!")
    printMessageWithPrefix("Mundo","Olá")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Hello", message = "Info")*/
    println(sum(8,2))
    println(multiply(5,6))
}
