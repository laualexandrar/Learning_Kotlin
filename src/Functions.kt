fun main() {

    fun forceChoke() {
        println(" You have failed me for the last time admiral")

    }
    forceChoke()

    fun makeAnEntrance(line: String){
        println(line)

    }
        makeAnEntrance("I find you")

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): Int {

        val goodGuys = rebels + ewoks
        return goodGuys
    }

    val rebels= calculateNumberGoodGuys(5, 7)
    println("Dark valder faced off against $rebels rebel scum")
    println("Dark valder faced off against ${calculateNumberGoodGuys(5,7)} rebel scum")

    fun vaderIsFeeling(mood: String  = "Angry"){
        println(mood)
    }

    vaderIsFeeling()
    vaderIsFeeling("Meehhh")
}