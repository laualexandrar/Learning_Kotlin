fun main() {
    val a = 2
    val b = 3

    if (a == b) {
        println("A does in fact equal B")
    }

    if (a != b) {

        println("A does not equal B")
    }

    val accountBalance = 100
    val price = 50

    if (accountBalance >= price) {
        println("you can buy this")
    } else {
        println(" Sorry you broke")
    }

    val degrees = 20

    if(degrees >= 70){
        println("This is a nice weather")
    } else if (degrees < 70 && degrees >= 50){
        println("Grab a sweater")
    } else {
        println("it's cold")
    }

    val isHungry = false
    val isBored = true

    if(isHungry == true || isBored == true) { // true value is implicit, is the same say:  if(isHungry || isBored)
        println( "Let's get pizza")
    }

    if (isHungry == true && isBored == true){
        println("You are bored")
    }

    val x = 1

    when (x){
        1 -> println("x == 1")
        2 -> println("x == 2")
        3 -> println("x == 3")
        else -> println("x is not equal to 1, 2 or 3")

    }

    // This is a default argument -> https://kotlinlang.org/docs/reference/functions.html#parameters
    fun vaderIsFeeling(mood: String = "Angry") {

        if (mood == "Angry"){
            println("run for the hills, vader is $mood")
        } else {
            println("whatever you do, don't make him angry")
        }
    }
    vaderIsFeeling()
}