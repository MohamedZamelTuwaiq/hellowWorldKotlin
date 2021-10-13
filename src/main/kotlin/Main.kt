


    studentGrade = 100

   var isPass = when (studentGrade) {
       100 -> {
           println("amazing $studentGrade $studentGrade jkenioe")
           true
       }
        in 90..95 -> {
            println("exc")
            true
        }
        in 80..90 -> {
            println("Very Good")
            true
        }
        in 70..79 -> {
            println("good")
            true
        }
        in 50..69 -> {

            println("ok")
            true
        }
        else -> {
            println("failed")
            false
        }
    }
    //println(isPass)


    var firstNum =9
    var secondNum=10

    println("$firstNum $secondNum")

}