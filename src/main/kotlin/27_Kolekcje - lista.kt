fun main(args: Array<String>) {

//    var array = listOf(1, 5, 8, 9)

    var list = mutableListOf(1, 5, 8, 9)
    println("Size: " + list.size)
    list.add(20)
    list.add(0, 11)
    println("Size: " + list.size)
    list.remove(5)
    list.removeAt(0)
    list.removeLast()
    list.clear()
    println("Size: " + list.size)

    for (i in list) {
        println(i)
    }

}