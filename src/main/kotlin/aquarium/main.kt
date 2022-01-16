package aquarium

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("length: ${myAquarium.length}, width: ${myAquarium.width}, height: ${myAquarium.height}")
    myAquarium.height = 300
    println("length: ${myAquarium.length}, width: ${myAquarium.width}, height: ${myAquarium.height}")
    println(myAquarium.volume)
}

fun main(args: Array<String>) {
   buildAquarium()
}