import java.io.File
fun main (){
    var toDoList = mutableListOf("Wake Up","Shower","coffee","work")
    //get item
  //  println(toDoList)
   // println(toDoList.getOrElse(9) { index -> "the $index is not found" })
   //  var item:String?=toDoList.getOrNull(9)
    // println(toDoList.indexOf("Zamel"))
    //
   // println("${toDoList.first()} - ${toDoList.last()}  size is ${toDoList.size}")
   //var isFound=toDoList.contains("lkdmnfko")
   // println(isFound)
   // println(toDoList.containsAll(listOf("work","coffee","Zamel")))
   //Add
    toDoList.add("break")
 //  println(toDoList)

    toDoList.addAll(2,listOf("lesson","work","pray"))
   // println(toDoList)

   // toDoList.removeAll(listOf("work","pray"))

   // println(toDoList)
   // toDoList.removeAt(3)
   // toDoList.removeIf { word-> word.contains("o") }
   // println(toDoList)
        // toDoList[1]="shower"
    println(toDoList)
//    for ( index in 0 until toDoList.size ){
//        println("$index - ${toDoList[index]}")
//    }

//toDoList.forEachIndexed { index, item->
//    if (index%2==0){
//        println("$index- $item")
//    }
//     }

    var fileTodoList=File("data/inputs.text").readText().split("/n")

println(fileTodoList)
}