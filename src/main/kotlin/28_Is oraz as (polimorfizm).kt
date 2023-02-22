/*
fun main(args: Array<String>) {

    var obj: Animal = Cat()

    if (obj !is Cat) {
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

class Dog*/

fun main(args: Array<String>) {

    var obj: Animal = Cat()

    //obj.getVoice() -> Error

    var obj2: Dog? = obj as? Dog
    println(obj2)
    obj2?.eat()

    // obj2.getVoice()
}

open class Animal {

}

class Cat : Animal() {
    fun getVoice() {
        println("Meow Meow")
    }
}

class Dog {
    fun eat() {
        println("Om om om")
    }
}
