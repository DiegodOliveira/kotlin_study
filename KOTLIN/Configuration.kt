class Configuration (var host: String, var port: Int)

fun main(){
    val configuration = Configuration(host = "127.0.0.1", port = 9000)
    //This
    with(configuration){
        println("$host:$port")
    }
    //Instead of this
    println("${configuration.host}:${configuration.port}")
}