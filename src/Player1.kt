open class Player (val name: String, val age: String, val gender: String){

    open fun attack(){

        println("Hi")

    }
    fun defend(){

        println("Lo")

    }
    fun walk(){

        println("Po")

    }

}

class Dragon (name: String, age: String, gender: String, var color: String): Player (name, age, gender){
    override fun attack() {
        println("Esto es overriding")
    }

    fun fly (){
            println("I'm fliying!!")
        }
}
class Butterfly(name: String, age: String, gender: String, var year: Int): Player (name, age, gender){
    fun move(){
        println("Weeeeeee")
    }

}

fun main(args: Array<String>) {
    val Spyro = Dragon("Spyro the Dragon", "doce", "Male", "Red")
       Spyro.attack()
    println(Spyro.color)
    println(Spyro.age)
    println(Spyro.gender)
    println(Spyro.name)

    val mariposa = Butterfly("pepita", "eleven", "female", 2012)
    mariposa.move()
    mariposa.attack()
    println(mariposa.year)
    println(mariposa.age)
    println(mariposa.gender)
    println(mariposa.name)

}