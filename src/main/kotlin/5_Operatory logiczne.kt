fun main (args: Array<String>) {

     var x: Boolean
     x = 5 > 5 || 1 != 2

     println(x)

     println(true || false) // || - LUB - suma, ustępuje pierwszeństwa mnożenia
     println(false && true) // && - I - iloczyn mnożenia, pierwszeństwo w działaniu nad dodawaniem
     println(!true) // ! - NIE

     println((2 + 2) *2)
     println(true || false && false)
     println((true || false) && false)
     println((true || false) && !false)

}