/*fun main(args: Array<String>) {

    hello("Paweł")
    hello("Adam")

    add(5,10)
    add(5,10, 100)

    println()
    println("KOTLIN")
    println(2 + 2)
}

fun hello(name: String) {

    println("Hello $name!")

}


fun add(a: Int, b: Int) {
    println("Suma 2args = ${a + b}")
}

fun add(a: Int, b: Int, c: Int) {
    println("Suma 3args = ${a + b + c}")
}*/

fun main(args: Array<String>) {
    var x = add(10, 5)
    println(x * x)
    println (add(1, -11))
}

fun add(a: Int, b: Int) : Int {
    var x = a + b
    return x

    return a + b
    println("Kolejne instrukcje kodu")
}