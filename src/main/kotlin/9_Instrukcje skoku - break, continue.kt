fun main(args: Array<String>) {

    var i = 0

    while (i < 10 || true) {
        if (i >=10)
            break // przerywa działanie
        println("i: $i")
        i++
    }

    println("--------------------------------------------------")

    var j = 0

    while (j < 20) {
        j++
        if(j % 2 == 1) {
            continue // przechodzi do kolejnego kroku pętli od miejsca continue
        }
        println("j: $j")
        }


    }