import classes.User
import kotlin.random.Random
import kotlin.random.nextInt


fun main() {
    var s= User()

//    var studentsList= mutableListOf<Student>()
//    for (i in 0..3) {
//        studentsList.add(Student(age = i+10, name = "zamel${i}"))
//    }
//     print(studentsList)


    var st = Student(n = "Zamel")
    var stslpot=Student()
    var mn=Student("mmmm",90)
    var ss=Student(90.toString(),89)
    st.id = "CS20"
    st.age=5
    println(st.age)
    st.age=90
    println(st.age)
    println(st.listOfSujects)
    st.addNewSubject("Arabic")
    st.addNewSubject("English")
    st.addNewSubject("CS")
    println(st.listOfSujects)
    st.removeSubject("CS")
    println(st.listOfSujects)
    var st2:Student=Student()
    println(st2.id)
//    var car=Car("dodge")
//    println(car.wheelsNo)
//    car.addWheele(30)
//    car.wheelsNo=1000000
//    println(car.wheelsNo)
//    var d=Dice()
//    var roll=d.rollOver
//    println(roll)
}
class Car(var type:String)
{
   var listOfWeels= mutableListOf<Int>()
    var wheelsNo:Int= 0
    get() {return listOfWeels.size }



    fun addWheele(wheelnO:Int){

        listOfWeels.add(wheelnO)
    }
}

class Dice(){
    var rollOver:Int=0
    get() {return Random.nextInt(1..6)}
//    fun getRollOver():Int{
//        return Random.nextInt(1..6)
//    }



}


class Student() {
    var name: String=""
    constructor(n:String):this(){
        name=n
    }
    constructor(giveName:String,givenAge:Int):this(){
        name=giveName
        age=givenAge
    }
    var age: Int = 0
      get(){return field}
        set(value) {
        if (value >= 12) {
            field = value
        }else {
            println("the age couldn't be $value")
        }
    }




    var id: String = ""
    var listOfSujects = mutableListOf<String>()
    fun addNewSubject(subjectName: String) {

        listOfSujects.add(subjectName)
    }

    fun removeSubject(subjectName: String) {
        listOfSujects.remove(subjectName)
    }
}