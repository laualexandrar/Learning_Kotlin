fun main() {
    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Month Motma")

    val rebelVehicles = hashMapOf("solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")

    for (rebel in rebels){
        println( "Name: $rebel")
    }

    for((key, value) in rebelVehicles){
        println("$key gets around in their $value")
    }

    var x = 10

    while (x > 0){
        println(x)
        x--
    }

    var y = 0

    while (y <= 10){
        println(y)
        y++
    }
}