package classes
// make the sub class defualt constructor match the super class defualt constructor
class Cat(danger:Boolean):Animal(danger) {
var catName= "I am cat"
    override var noLegs: Int =3

    override fun sound(){
        super.sound()
        println("Cat has nono")


    }
    override fun eat(){
        print("hhhh")
    }

    override fun toString(): String {
        return "cat Name $catName"
    }
}