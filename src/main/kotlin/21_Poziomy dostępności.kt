fun main(args: Array<String>) {
    var obj = A()
}

 open class A {
    public var publicVar = 0 // Zmienna jest dostępna wszędzie
    internal var internalVar = 1 // Zmienna jest dostępna jeżeli jest w tym samym module
    protected var protectedVar = 2 // Zmienna jest prywatna, ale jest otwarta i dostępna w hierarchii dziedziczenia
    private var privateVar = 3 // Zmienna jest widoczna w zakresie własnej klasy, w której została zadeklarowana

    fun test() {
        print(privateVar)
    }
}

class B : A() {

}