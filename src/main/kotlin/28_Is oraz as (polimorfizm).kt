fun main(args: Array<String>) {

    var obj = Cat()

    if (obj is Any) {
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