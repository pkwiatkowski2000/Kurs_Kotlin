fun main(args: Array<String>) {
    var cat = Cat(Colors.WHITE)
    println(cat.color)
    println(cat.color == Colors.BLACK)
    for (c in Colors.values()) {
        println(c)
    }

}

class Cat(color: Colors) {
    var color: Colors = color
}

enum class Colors {
    BROWN, WHITE, BLACK
}