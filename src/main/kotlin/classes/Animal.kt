package classes

//we use oopen to allow inhertance for class
open class Animal(var isDanger:Boolean) {
init {
    println("Animal")
}
    //we use open with var and fun to allow them to be overriden
    open var noLegs = 4
    var noOfEyes = 2


     open fun sound() {
        println("Animal has sound")
    }

   open fun eat() {
        println("Animal can eat")
    }
}
