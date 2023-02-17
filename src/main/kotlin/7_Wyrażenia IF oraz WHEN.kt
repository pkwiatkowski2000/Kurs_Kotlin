fun main(args: Array<String>) {

    /*val res = if (x >=0) "Dodatnia" else "Ujemna"

    val res = if (x >=0) {println("tekst..."); "Dodatnia"}
    else "Ujemna"

    println(res)*/

    var x: Int = 3

    val res = when {
        x > 0 -> "Dodatnia"
        x == 0 -> "Równa 0"
        else -> "Ujemna"
    }

    println(res)

    when (x) {
        1 -> println("Jeden")
        2 -> println("Dwa")
        else -> {println("Nieznana"); println("liczba")}
    }

}
