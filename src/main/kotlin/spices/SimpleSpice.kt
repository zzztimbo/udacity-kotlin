package spices

class SimpleSpice {
    val name = "curry"
    val spiciness = "mild"
    val heat: Int
      get() { return 5 }
}

fun main(args: Array<String>) {
   val ss = SimpleSpice()
   println("${ss.name} is ${ss.spiciness}")
}