fun main() {
    val str: String  = " May the force be with you"
    println(str)

    val rawCrawl = """ |A long time ago, 
    |in a galaxy
    |far, far away...
    |BUMMM BUMMM BUMM """ .trimMargin() //.trimMargin() nos ayuda a que todo quede en marguen pero toca en cada inicio adicionarle |
    println(rawCrawl) // los tres """ nos sirven para que el texto quede como queda al compilar

//    for (char in str){
//        println(char)
//    } este codigo me sirve para ponerme cada letra en una linea diferente

    // para poner un comentario completo selecciono todo y le pongo command /

    val contentEquals = str.contentEquals(" May the force be with you")
    println(contentEquals)

    val contains = str.contains("force", true)
    println(contains)

    val uppercase = str.toUpperCase()
    val lower = str.toLowerCase()

    println(uppercase)
    println(lower)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence  = str.subSequence(5, 14)
    println(subsequence)

    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27

    println("$luke has a $lightSaberColor lightSaber and drives a $vehicle and has $age years old." )
    println("lukes full name $luke has ${luke.length}  characters") // que hago porque me cuenta el espacio tambien? ... puedo hacer lo mismo con {luke.toUpperCase}
}