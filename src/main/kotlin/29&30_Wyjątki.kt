/*import java.lang.Exception
import kotlin.Exception*/

/*
import java.lang.ClassCastException

fun main(args: Array<String>) {

    try {
    var x = 3 / 0
    var num: Int = "ABC".toInt()
    var cat = Cat()
    var dog = cat as Dog
} catch (ex: ClassCastException){
    println("Wystąpił błąd: " + ex.toString())
} catch (ex: NumberFormatException) {
    println("Zły format danych")
} catch(ex: Exception) {
    println("Inny błąd " + ex.toString())
} finally {
    println("Finalna instrukcja kodu")
}
    println("Dalej...")
}

class Cat {

}

class Dog {
*/

// println("--------------------------------------------------")

fun main(args: Array<String>) {
    try {
        println(silnia(-1))
    } catch (ex: ExceptionSilnia) {
        println("Coś poszło nie tak... " + ex)
    }
}

fun silnia(n: Int) : Int {
    if (n < 0) {
        throw ExceptionSilnia("Nastąpił błąd!")
    }
    if (n == 0)
        return 1
    else
        return n * silnia(n - 1)
}

class ExceptionSilnia(mess: String) : Exception(mess) {

}

