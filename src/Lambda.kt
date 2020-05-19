fun main() {
    val printMessage = {message: String -> println(message)} // we create a variable and assigned a lambda expression, which have inside of it a function literal where on the left site we have the parameter and in the right side the return
        printMessage("Hello World!")
    //fun printMessage(message: String){
    //println()
    // }      ...  this is the same thing,
    val sumA = {x: Int, y: Int -> x + y} // all lambdas need to be inside curly braces
    println(sumA(5,3))

    val sumB: (Int, Int) -> Int = {x,y -> x+y} // this is another way to writting it

    fun downloadData (url: String, completion: () -> Unit){ // a method void  // We want to call this function, download some data and then update the UI with the data that we just received
        //sent a download request
        //we got back data
        //there were not network errors
        completion() // this allow us to do is have a way to knowing if the download request ave been successful
    }
    //call downloadDataFunction
    downloadData("fakeUrl.com", {
        println("The code in this block, will be only run" + "after the completion()")
    })

    fun downloadCarData (url: String , completion: (Car) -> Unit){
        //sent a download request
        //we got back car data
        val car = Car("Tesla", "Model x", "Blue")
        completion(car)
    }
    downloadCarData("fakeUrl.com"){car ->
        println(car.color)
        println(car.make)

//        downloadCarData("fakeUrl.com"){
//            println(it.color)
//            println(it.make)    se pone it cuando en completion tengo solo uno en este caso car

    }
    fun downloadTruckData(Url: String, completion: (Truck?, Boolean)-> Unit){
        //make the web request
        //we get the results back
        val webRequestSuccess = true
        if(webRequestSuccess){
            //received Truck Data
            val truck = Truck("Ford", "F-150", 10000)
            completion(truck,true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("FakeUrl.com"){truck, success ->
        if(success == true){
            // do something with our truck
            truck?.tow()
        }else {
            //handle the web request failure
            println("Something when wrong")
        }

    }
}