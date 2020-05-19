open class Vehicle (val make: String, val model: String) { // all classes the begining are finished so we have to put open if we wan to do inheritance

    open fun accelerate(){ //I use open here when I want to change in the subclases something (override the method in the children classes)
        println("vrumm vrumm")
    }

    fun park(){
        println("parking the vehicle")
    }

    fun brake(){
        println("STOP")
    }
}
class Cars (make: String, model: String, var color: String ): Vehicle (make, model){ //here, we want to inherit from vehicles (class car is a subclass, class Vehicle is a class)
    override fun accelerate() {
        println( " We are going to Ludicrous Mode!")
    }
}

class Trucks (make: String, model: String, towingCapacity: Int) : Vehicle (make, model){

        fun tow(){
            println("Head of the mountains")
        }
}

fun main(args: Array<String>) {

    val tesla = Cars ("Tesla", "ModelS", "Red")
    tesla.accelerate()

    val Trucks= Trucks("Ford", "F-150", 10000)
}