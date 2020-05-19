fun main() {

    val name = "Laura"
    val isAwesome = true

    println("Is " + name + " awesome? The answer is: " + isAwesome)

    var a = 3
    var b = 4 // var is mutable, val is inmmutable

    println(a + b)

    var apodo: String
    apodo = "Pepe"

    println("his nickname is $apodo")

    var z = 3
    var w = 8
    var j = z + w

    println("The vaule of z is $z and the value of w is $w and the add of them is $j but I cant do that now ${z+w}")

    val zNumberToString = z.toString()

    println(zNumberToString)
}
