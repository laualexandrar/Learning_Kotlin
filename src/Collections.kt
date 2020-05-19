fun main() {
    //inmutable array

    val imperials = listOf("Emperor", "Dark Vader", "Boba Fett", "Tarkin")
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.last())
    println(imperials.contains("Emperor"))
    println (imperials)

    //mutable array

    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Month Motma")
    println(rebels.size)
    rebels.add("chewbacca")
    println(rebels)
    rebels.add(0, "lando")
    println(rebels)
    println(rebels.indexOf("Luke"))

    rebels.remove("Han Solo")
    println(rebels)

    //Maps.... solo is de key and Millenium falcom is the value
    //inmutable
    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Lehia", "This ship doesn't exist"))
    println(rebelVehiclesMap.values)

    //mutable

    val rebelVehicles = hashMapOf("solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leiah", "Tntive Iv")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    rebelVehicles.isEmpty()
}

