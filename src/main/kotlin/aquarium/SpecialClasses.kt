package aquarium


object MobyDickWhale {
    val author = "Herman Melville"
    fun jump(): String {
        return "jump"
    }
}

enum class Color(val rgb: Int) {
    RED(0XFF000),
    GREEN(0X00FF00),
    BLUE(0X0000FF)
}

sealed class Seal

class SeaLion: Seal()
class Walrus: Seal()
class FooBarSeal: Seal()

fun matchSeal(seal: Seal): String {
    return when (seal) {
        is SeaLion -> "sea lion"
        is Walrus -> "walrus"
        is FooBarSeal -> "blarg"
    }
}

fun main() {
    val mdwJump = MobyDickWhale.jump()
    val mdwAuthor = MobyDickWhale.author
    println(mdwJump)
    println(mdwAuthor)

    println(Color.RED)
    println(Color.GREEN)
    println(Color.BLUE)

    println(matchSeal(SeaLion()))
    println(matchSeal(Walrus()))
    println(matchSeal(FooBarSeal()))
}