fun main() {

    fun popeye() {
        println("Hi my name is popeye")
    }

    popeye()

    fun minnieMouse(greeting: String) {
        println(greeting)
    }
    minnieMouse("jojojo Mickey is right here")

    fun calculation(pepes: Int, lolos: Int): Int {
        val totalCalculation = pepes + lolos
        return totalCalculation

    }

    val pepes = calculation(4, 5)
    println("The total of people is $pepes")
    println("The total of people is ${calculation(3, 4)}")

    fun pepo(moood: String = "Happy"){

    println(moood)
}
    pepo()
}

