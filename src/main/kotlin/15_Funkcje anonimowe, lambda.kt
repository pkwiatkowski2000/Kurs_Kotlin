fun main (args: Array<String>) {
    var hello = { println("Hello"); println("World")}
    hello()

    var add: (Int, Int) -> Int = {a, b -> a + b}
    println(add(2, 5))

    var add2 = fun(a: Int, b: Int): Int { return a + b}
    println(add2(2, 5))

    var sub = {a: Int, b: Int -> a - b}
    println(sub(10, 7))

    println("--------------------------------------------------")

    var arr = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    var function = {a: Int -> println(a * a)}
    arr.forEach(){function(it)}

    println("--------------------------------------------------")

    arr.forEach{item: Int -> println(item * item)}

    println("--------------------------------------------------")

    arr.filter(fun(item) = item % 2 == 0).forEach { println(it * it)}
}