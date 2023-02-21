// PROGRAMOWANIE OBIEKTOWE - KLASY

/*fun main(args: Array<String>) {

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

println("--------------------------------------------------")*/

// PROGRAMOWANIE OBIEKTOWE - KONSTRUKTOR

/*fun main(args: Array<String>) {

    var p1 = Person("Sebastian", 26)
    p1. print()
}

class Person (n: String, a: Int){
    var name = n
    var age = a

    fun print() {
        println("Imię: $name, wiek: $age")
    }*/

/*fun main(args: Array<String>) {

    var p1 = Person("Sebastian", 26)
    p1.print()
    var p2 = Person("Adam")
    p2.print()

}

    class Person {
        fun print() {
            println("Imię: $name, wiek: $age")
        }

        constructor(n: String, a: Int) {
            name = n
            age = a
        }

        constructor(n: String) {
            name = n
        }

        var name: String
        var age: Int = 0
    }*/

/*fun main(args: Array<String>) {
    var p1 = Person("Sebastian", 26)
    p1.print()
    var p2 = Person("Adam")
    p2.print()
}

class Person {
    fun print() {
        println("Imię: $name, wiek: $age")
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    constructor(name: String) {
        this.name = name
    }

    var name: String
    var age: Int = 0
}

println("--------------------------------------------------")*/

// PROGRAMOWANIE OBIEKTOWE - HERMETYZACJA (get i set)

fun main(args: Array<String>) {

    var p1 = Person("Sebastian", 26)
    p1.age = 50
    p1.name = "Adam"
    p1.print()
    println(p1.age)
    println(p1.name)

}

class Person {
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
    var name: String
        get() = field.uppercase()
    var age: Int
    get() = field // PROSTSZY ZAPIS
    // get() { return field } WIĘCEJ INSTRUKCJI KODU
    set(value) {
        if (value < 0)
            field = 0
        else
            field = value
    }





    fun print() {
        println("Imię: $name, wiek: $age")
    }
}



