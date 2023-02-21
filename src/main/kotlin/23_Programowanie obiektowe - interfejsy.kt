/*fun main(args: Array<String>) {

// W interfejsach niepotrzebne jest słówko abstract. W odróżnieniu od klas można dodać po przecinku drugi interface.

    var cat = Cat()
    println(cat.name)
    println(cat.num)
    cat.eat()
    cat.getVoice()
    cat.test()
}

open class Animal    {

}

class Cat : Animal(), AnimalInterface, SecondInterface{
    override var name: String
        get() = "Kot"
        set(value) {}

    override fun getVoice() {
        println("Meow Meow")
    }

    override fun test() {
        println("Test")
    }

}

interface AnimalInterface {
    var name: String
    val num
        get() = 100000

    fun getVoice()

    fun eat() {
        println("Omom")
    }
}

interface SecondInterface {
    fun test()
}*/
