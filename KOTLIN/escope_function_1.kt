fun main(){
    fun getNullablelength(ns: String?){
        println("for \"$ns\":")
        ns?.run{
            println("\tis empty " + isEmpty())
            println("\tlength = $length")
            length
        }
    }
    getNullablelength(null)
    getNullablelength("")
    getNullablelength("some string with Kotlin")
}