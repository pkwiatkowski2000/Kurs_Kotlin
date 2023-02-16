import kotlin.math.pow

fun main(args: Array<String>) {

    var a = 5
    var b = 2
    var sum = a + b
    println(sum)
    println(a - b)
    println(a * b)
    println(a.toFloat() / b.toFloat())
    println(a % b) // a / b = 2     2 * 2 = 4       5 - 4 = 1

    sum += 1 //8
    sum -= 2 //6
    sum *= 3 //18
    sum /= 2 //9
    sum %= 5 //4
    println(sum)

    var i = 1
    i += 1 //2
    i++ //3 postinkrementacja-powiększanie się pewnej wartości o 1; ++ po prawej stronie
    println(++i) //preinkrementacja-powiększanie się pewnej wartości o 1, ale robi się to przed wyświetleniem w konsoli; ++ po lewej stronie
    println(i++)

    println(--i) //predekrementacja-zmniejszenie się pewnej wartości o 1, ale robi się to przed wyświetleniem w konsoli; -- po lewej stronie
    println(i--) // postdekrementacja-zmniejszenie się pewnej wartości o 1; -- po prawej stronie

    println( (2.0).pow(3) )
    println(kotlin.math.sqrt(81f))
}