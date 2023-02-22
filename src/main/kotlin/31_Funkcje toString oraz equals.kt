/*
fun main(args:Array<String>) {

    var p1 = Punkt(2, 5)
    println(p1)
    var p2 = Punkt(2, 5)
    println(p2.toString())
    println(p1 == p2)
    println(p1.equals(p2))
}

class Punkt(x: Int, y: Int) {
    var x = x
    var y = y

    override fun equals(other: Any?): Boolean {
        if (other is Punkt) {
            return (other.x == this.x && other.y == this.y)
        } else {
            return false
        }
    }

        override fun toString(): String {
            return "x: $x, y: $y"
        }

    }
*/
