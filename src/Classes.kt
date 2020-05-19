class Car constructor(make: String, model: String, color:String){
    val make = make
    val model = model
    var color = color

    fun accelerate(){
        println("Vrumm Vrumm")
    }

    //the simplified way to do that is... class Car(val make: String, val model: String, var color: String){ } ....(Aqui le quitamos el constructor y ponemos los val dentro del parentesis
    fun details(){
        println("This is a $color $make $model")
    }
}

// este codigo de arriba lo podemos poner en otra pestaña, por ejemplo crear una llamada CarDemo y escribir el codigo y debajo de fun main() hacer el llamado : val car = CarDemo()

class Truck (val make: String, val model: String, val towingCapacity: Int){
    fun tow(){
        println("taking the horses to the rodeo")
    }
    fun details(){
        println("The $make $model has a towing capacity of $towingCapacity lbs")
    }
}

fun main(args: Array<String>) {

    val car = Car ("Toyota", "Avalon", "Red" ) // car is my object
        println(car.make)
        println(car.model)
        car.accelerate()
        car.details()


    val truck = Truck( "Ford", "F-150", 10000)

    truck.tow()
    truck.details()
}

//with methods we are going to do that the car do something (fun accelerate)