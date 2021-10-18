import java.io.File

fun main() {
// create list of students  min 4 students
    var listFromFile = File("data/students.txt").readText().split("\n")
    var listOfStudent= listFromFile.toMutableList()
    //  ->  var listOfStudent = mutableListOf("zo2la", "bor3y", "ellmby", "z3tot")
    // Add me , Eng Sadun as  student -> awl el list
    // Add ur self
    listOfStudent.add(0, "zamel")
    listOfStudent.add(1, "Sadun")
    //  println(listOfStudent)
    // edit from Zamel l Eng.Mohamed Zamel ,
    //  listOfStudent[0]="Eng Zamel"

    renameToEng(listOfStudent, "Sadun")
    renameToEng(listOfStudent, "zamel")


    // println(listOfStudent)
// Sadun . Eng. Hussien Sadun

    // remove ay esm fyh ENG .
    listOfStudent.removeIf { it.contains("Eng") }
    //  println(listOfStudent)
//    listOfStudent.forEachIndexed { index, student ->
//        listOfStudent[index] = "Stuudent ${listOfStudent[index]}"
//
//    }

    for (index in 0 until listOfStudent.size){
        listOfStudent[index] = "Stuudent ${listOfStudent[index]}"
    }
    println(listOfStudent)

    // 3dy 3la el list kol el student esmo Student ...
    //exmpele List  X y Z
    //new List STudent X student y stuent Z

    // read student name from the file
    println(listOfStudent)
    val (stu1,stu2,_,stu4)=listOfStudent
    println("$stu2 $stu4")
}

private fun renameToEng(listOfStudent: MutableList<String>, name: String) {
    var indexOFEng = listOfStudent.indexOf(name)
    listOfStudent[indexOFEng] =
        "Eng ${listOfStudent[indexOFEng]}"
}