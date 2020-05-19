fun main() {

    var name: String = "Laura R"
    // name = null you can't do this

    //this is how we can do the variable nullable: the String? is the one which says the variable can be nullable
    var nullableName : String? = "Do I really exist?"
    //nullableName = null //I can assign the variable as null because I already defined the String? (si no tengo el String? no puedo definir una variable como nula)

//    //Null Check
      var length = 0
//    if(nullableName != null) { // la variable es diferente a null?
//        length = nullableName.length
//    } else { // si la variable es igual a null imprimir -1
//        length = -1
//    }
//    println(length)


    val l  = if (nullableName != null) length = nullableName.length else length = -1

    println(length)


    //Second Method Safe Call Operator ?

    println(nullableName?.length) // here we print out lenght if its not null, but if its null we are gonna give it the value instead

    //Third method is elvis operator

    val len = nullableName?.length ?: -1
    val noName = nullableName ?: "No one Knows me..." // en este caso nullableName esta asignado a null entonces ejecuta la frase
    println(noName)

    //to introduce null pointer exceptions to de app you can use !! operator, this will return a nano value of a variable if it exist, but if doesn't you are going to get a non-pointer exception and your app is going to crash

    println(nullableName!!.length)
}