fun main(args: Array<String>) {
    println(User.num)
    var u1 = User("Json")
    println(User.num)
    var u2 = User("Alan")
    println(User.num)
    var u3 = User("Tommy")
    println(User.num)
    User.numberOfUsers()

}

//Zmienna statyczna to taka zmienna, dla wywołania której nie potrzebujemy żadnego obiektu danej instancji

class User {
    constructor(name: String) {
        this.name = name
        num++
    }
    var name: String
    companion object {
        var num = 0
        fun numberOfUsers() {
            println("Users: $num")
        }
    }
}