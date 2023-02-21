fun main(args: Array<String>) {

    var obj: Any = Cat()
    obj

    if (obj is Cat) {
        println("Prawda")
    }
    else {
        println("Fałsz")
    }
}

open class Animal {

}

class Cat: Animal() {
    fun getVoice() {
        println("Meow Meow")
    }
}

class Dog