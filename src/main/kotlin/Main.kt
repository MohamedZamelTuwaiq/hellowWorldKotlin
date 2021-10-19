import java.io.File

fun main() {

    var s = File("datat/inputs.txt").readLines().toMutableList()
    var toDoSet = listOf("drinking", "coffee", "work", "fos7a", "work", "work").toMutableSet()

    toDoSet += "work"
    // println(toDoSet)
    toDoSet.add("zamel")
    toDoSet.addAll(setOf("ss", "ssdd"))
    //  println(toDoSet)
    toDoSet.elementAt(2)
    //  println(toDoSet.elementAt(2))
    var todoSetIterator = toDoSet.iterator()
    println(toDoSet)
    var isNotZamel = true
    while (todoSetIterator.hasNext() && isNotZamel) {
        var nextValue = todoSetIterator.next()
        if (nextValue == "zamel") {
            isNotZamel = false
        }
        println("${nextValue}  next  ${todoSetIterator.hasNext()}")
    }


    var newList=listOf("drinking", "coffee", "work", "fos7a", "work", "work").distinct()
    println(newList)


}