fun main(args: Array<String>) {
    var sum = add(5, 10) {x -> "Suma = $x"}
    println(sum)

    sum = add(6, 7, fun(x): String {return "Add = $x"})
    println(sum)

    println(add(10, 22){x, y, z -> "$x + $y = $z"})
}

fun add(a: Int, b: Int, function: (Int) -> (String)) : String {
    return function(a + b)
}

fun add(a: Int, b: Int, function: (Int, Int, Int) -> String): String {
    return function(a, b, a + b)
}