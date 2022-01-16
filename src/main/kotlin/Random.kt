import java.util.Random

val rollDice: (Int) -> Int = { sides ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}

fun gamePlay(diceFn: (Int) -> Int, sides: Int): Int {
    return diceFn(sides)
}

fun main (args: Array<String>) {
    println(gamePlay(rollDice, 33))
}