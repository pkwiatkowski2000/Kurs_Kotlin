fun main (args: Array<String>) {

    var array1 = arrayOf(1, 2, 3, "4", '5')
    var array2: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    var array3 = arrayOf<Int>(1, 2, 3, 4, 5)
    var array4 = intArrayOf(1, 2, 3, 4, 5)
    var array5 = IntArray(3)
    var array6 = Array(5, {i -> (i + 1) * 2})

    println("Index 0: " + array6[0])
    println("Index 1: " + array6.get(1))

    array6[4] = 100
    array6.set(0, 22)

    // array6[5] = 200 - ERROR

    println("size: " + array6.size)



    for (n in array6.indices) {
        println(n.toString() + " : " + array6[n])
    }

}
