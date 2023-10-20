sealed class Mammal(val name: String)

class Cat(val catName: String, val job: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal : Mammal) : String {
    when (mammal) {
        is Human -> return "Hello ${mammal.name}; You're working as ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}; You're working as ${mammal.job}"
    }
}

fun main(){
    println(greetMammal(Cat("Puss","Household pet")))
    println(greetMammal(Human("Dieguito", "Programmer")))
}