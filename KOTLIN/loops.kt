/*fun main(){
    val cakes = listOf("carrot", "chocolate", "cheese")

    for (cake in cakes){
        println("Yummy, it's a $cake cake")
    }
}*/

/*fun eatACake() = println("Eat a cake!")
fun bakeACake() = println("Bake a cake!")

fun main(args: Array<String>){
    var cakesEaten = 0
    var cakesBaked = 0

    while(cakesEaten < 5){
        eatACake()
        cakesEaten++
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}*/

/*class Animal(val name: String)

class Zoo(val animals: List<Animal>){

    operator fun iterator(): Iterator<Animal>{
        return animals.iterator();
    }
}

fun main(){
    val zoo = Zoo(listOf(Animal("Zebra"), Animal("Lion")))

    for(animals in zoo){
        println("Caution, it's a ${animals.name}")
    }
}*/

/*fun main(){
    for(i in 0..3){
        print(i)
    }
    print(" ")

    for(i in 0 until 3){
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2){
        print(i)
    }
    print(" ")

    for(i in 3 downTo 0){
        print(i)
    }
    print("")

}*/

fun main(){
    /*for(c in 'a'..'d'){
        print(c)
    }
    print(" ")

    for(c in 'a'..'z'){
        print(c)
    }*/

    val x = 2
    if(x in 1..5){
        println("x is in the range")
    }else{
        println("x is in another range")
    }
}