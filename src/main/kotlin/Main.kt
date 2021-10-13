fun main() {
    var studentName = "zamel"

    var studentGrade = 90

    var isPass = if (studentGrade >= 80 && studentGrade < 90)
    {
        print("very good")
         true
    } else if (studentGrade >= 50) {
        println("ok")
       true
    } else {
        print("failed")
         false
    }
    println("isPassValue "+ isPass)

  var classStatus=  if (isPass) "move to next class" else "repeat ur semster"


    var isPass2 = if (studentGrade in 90 downTo 80)
    {
        print("very good")
        true
    } else if (studentGrade >= 50) {
        println("is up to 50")
        true
    } else {
        print("failed")
        false
    }

}