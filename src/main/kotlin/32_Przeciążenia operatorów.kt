fun main(args: Array<String>) {

        var p1 = Punkt(2, 7)
        var p2 = Punkt(1, 5)
        println("P1 = $p1")
        println("P2 = $p2")
        println(p1 == p2)
        println(p1 + p2)
    }

    class Punkt(x: Int, y: Int) {
        var x = x
        var y = y

        operator fun plus(other: Punkt): Punkt {
            return Punkt(this.x + other.x, this.y + other.y)
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