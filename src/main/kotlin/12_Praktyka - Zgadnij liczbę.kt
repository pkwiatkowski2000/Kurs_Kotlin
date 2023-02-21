import kotlin.random.Random

/*
fun main (args: Array<String>) {

    for (i in 1..30) {
        println(Random.nextInt(1, 11))

        println((1.. 10).random())
    }
}*/


fun main (args: Array<String>) {

    val x = Random.nextInt(1, 11)
    var a: Int
    var i = 0

    println("Zgadnij liczbę z przedziału od 1 do 10")

    do {
        i++
        print("Podaj liczbę: ")
        a = readLine()!!.toInt()

        if (x > a) {
            println(" Niestety, wylosowana liczba jest większa od Twojej")
        }
        else if (x< a) {
            println(" Niestety, wylosowana liczba jest mniejsza od Twojej")
        }

    } while (x != a)

    println("Brawo, zgadłeś liczbę za $i razem")
}