fun main (args: Array<String>) {

    var arr = arrayOf(5, 10, 15)

    for ((i, v) in arr.withIndex()) {
        println("$i: $v")
    }

    println("--------------------------------------------------")

    for (i in "KOTLIN") {
        println(i)
    }

    println("--------------------------------------------------")

    println("TEKST"[4])

    println("--------------------------------------------------")

    for (i in 1..10) {
        println(i)
    }

    println("--------------------------------------------------")

    for (i in 1 until 10) { // until nie wlicza w tym przypadku wartości 10
        println(i)
    }

    println("--------------------------------------------------")

    for (i in 1 downTo 10) { //downTo próbuje iterować od 10 do 1, dlatego pierwsza wartość powinna być większa od drugiej
        println(i)
    }

    println("--------------------------------------------------")

    for (i in 10 downTo 1) {
        println(i)
    }

    println("--------------------------------------------------")

    for (i in 10 downTo 1 step 3) { //step w tym przypadku pomija co drugi element
        println(i)
    }
}


