/*
fun main(args: Array<String>) {
// Aby mieć na czym dziedziczyć potrzebujemy co najmniej 2 klasy

    var animal = Animal("Felix")
    var cat = Cat("Milka", "White")
    cat.name = "Milka"
    cat.print()
}

 open class Animal {
     constructor(name: String) {
         this.name = name
     }
    var name: String
     open fun print() {
         println("My name is $name")
     }
}

open class Cat: Animal {
    constructor(name: String, color: String) : super(name) {
        this.color = color
    }
    override fun print() {
        super.print()
        println("My color is $color")
    }
    var color: String
}*/
