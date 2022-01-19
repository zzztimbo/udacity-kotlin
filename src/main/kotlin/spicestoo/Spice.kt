package spicestoo

sealed class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor): SpiceColor by color {
    abstract fun prepareSpice()

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    init {
        println("spice: ${name} created with spiciness ${spiciness}")
    }
}

interface Grinder {
    fun grind()
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0XFFFF00)
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor: SpiceColor {
    override val color = Color.YELLOW
}

object GreenSpiceColor: SpiceColor {
    override val color = Color.GREEN
}

object RedSpiceColor: SpiceColor {
    override val color = Color.RED
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor): Spice(name = name, spiciness = spiciness, color = color), Grinder {
    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("i'm griding the $color curry")
    }
}


data class SpiceContainer(val spice: Spice, val label: String = "label[${spice.name.uppercase()}]") {}


fun main() {
    val curry = Curry("yellow curry", "spicy", GreenSpiceColor)
    println(curry.heat)
    curry.prepareSpice()
    println(curry.color)

    val sc = SpiceContainer(curry)
    println(sc)

    val spiceCabinet = listOf(SpiceContainer(Curry("yellow curry", "mild", color = YellowSpiceColor)), SpiceContainer(Curry("red curry", "medium", color = RedSpiceColor)), SpiceContainer(Curry("green curry", "spicy", color = GreenSpiceColor)))
    for(element in spiceCabinet) println(element.label)
    for(element in spiceCabinet) println(element.spice.color)
}