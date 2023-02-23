import kotlin.math.sqrt

fun main(args: Array<String>) {

    var p1 = Punkt(2, 7)
    var p2 = Punkt(-7, -2)
    println("P1 = $p1")
    println("P2 = $p2")
    println(p1 == p2)
    println(p1 + p2)
    println(p1 + 5)
    println(p1 + "5")
    println(p1 * p2)
    println(p1 * 3)
    println(p1 * "ABC")
    println(p1.odległość())
    println(p2.odległość())
    println(p1 == p2)
}


    class Punkt(x: Int, y: Int) {
        var x = x
        var y = y

        fun odległość(): Double {
            return sqrt(x.toDouble() * x.toDouble() + y.toDouble() * y.toDouble())
        }

        open operator fun plus(other: Any): Punkt? {
            if (other is Punkt)
                return Punkt(this.x + other.x, this.y + other.y)
            else if (other is Int)
                return Punkt(this.x + other, this.y + other)
            else
                return null
        }

        operator fun times(other: Any): Punkt? {
            if (other is Punkt)
                return Punkt(this.x * other.x, this.y * other.y)
            else if (other is Int)
                return Punkt(this.x * other, this.y * other)
            else
                return null
        }

        operator fun compareTo(other: Punkt): Int {
            if (this.odległość() < other.odległość())
                return -1
                else if (this.odległość() > other.odległość())
                    return 1
                else
                    return 0

    }

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