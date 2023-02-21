fun main(args: Array<String>) {
// Aby mieć na czym dziedziczyć potrzebujemy co najmniej 2 klasy

    var animal = Animal()
    var cat = Cat()
    cat.name = "Milka"
    cat.print()
}

 open class Animal{
    var name = ""
     fun print() {
         println("My name is $name")
     }
}

class Cat : Animal() {
    var color = ""
}