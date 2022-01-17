package aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size: Int

    init {
        println("first init block")
    }

    constructor() : this(true, 9) {
        println("running secondary constructor")
    }

    init {
        size = if (friendly) {
            volumeNeeded
        } else {
            volumeNeeded * 2
        }
    }

    init {
        println("final init block, constructed fish of size $size")
    }
}

fun main(args: Array<String>) {
    val f = Fish(false, 100)
    println("is the fish friendly ${f.friendly} it needs volume ${f.size}")

    val f2 = Fish()
    println("is the fish friendly ${f2.friendly} it needs volume ${f2.size}")

}