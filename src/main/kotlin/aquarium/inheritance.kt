package aquarium

fun delegate() {
    val pleco = Plecostomus(GoldColor)
    println("fish has color ${pleco.color}")
    pleco.eat()
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor: FishColor {
    override val color: String
        get() = "gold"
}

object GreenColor: FishColor { override val color: String = "green" }
object RedColor: FishColor { override val color: String = "red" }

class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println("eating $food")
    }
}

fun main() {
    delegate()
}

