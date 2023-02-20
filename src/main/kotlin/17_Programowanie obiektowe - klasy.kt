fun main(args: Array<String>) {

    var p1 = Person()
    p1.name = "Paweł"
    p1.age = 23
    println(p1.name)
    println(p1.age)
    p1.print()

    var p2 = Person()
    p2.name = "Adam"
    p2.age = 18
    p2.print()
}

    class Person {
        var name = ""
        var age = 0

        fun print() {
            println("Imię: $name, wiek: $age.")
        }

    }
