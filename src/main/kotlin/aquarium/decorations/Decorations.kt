package aquarium.decorations


data class Decorations(val rocks: String) {}
data class Decorations2(val rocks: String, val wood: String, val diver: String) {}

fun makeDecorations() {
    val d1 = Decorations("granite")
    val d2 = Decorations("slate")
    val d3 = Decorations("slate")

    println(d1)
    println(d2)
    println(d3)

    println(d1.equals(d2))
    println(d3.equals(d2))
    val d4 = d3.copy()
    println(d3.equals(d4))

    val d5 = Decorations2("crystal", "woody", "divery")
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}


fun main() {
   makeDecorations()
}