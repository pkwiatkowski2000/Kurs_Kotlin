fun main(args: Array<String>) {
     /*var liczba: Int
     var Liczba: Int
*/
     // Zmiana literki na dużą powoduje to, że tworzy się druga zmienna


    var liczba: Int = 5
    println(liczba)
    println("int: " + Int.MIN_VALUE)
    println("-int: " + Int.MAX_VALUE)

    var byte: Byte
    println("byte: " + Byte.MAX_VALUE)

    var short: Short
    println("short: " + Short.MAX_VALUE)

    var long: Long
    println("long: " + Long.MAX_VALUE)

    var uInt: UInt
    println(UInt.MIN_VALUE)
    println(UInt.MAX_VALUE)

    var float: Float = 111.222f
    println(float)
    println("float: " + Float.MAX_VALUE)

    var double: Double = 5.1111235
    println(double)
    println("double: " + Double.MAX_VALUE)


    // Char przechowuje tylko jeden znak
    var char: Char = 'A'
    println(char)

    var string: String = "Tekst\n!$char"
    string = string + "BC"
    println(string)

    var bool: Boolean = true
    println(bool)
    bool = false
    println(bool)

}