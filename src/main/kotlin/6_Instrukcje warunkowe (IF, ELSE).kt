fun main(args: Array<String>) {

    print("Podaj liczbę:")
    var x = readLine()!!.toInt()

    if (x > 0){
        println("X większe od 0")
    }
    else if (x < 0){
        println("X jest mniejsze od 0")
    }
    else {
        println(" X równe 0")
    }

}
