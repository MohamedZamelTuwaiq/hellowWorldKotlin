//Total Apples
const val  APPLES=65
const val DOZENS=12
fun main(args: Array<String>) {
    // Write your Code here
    val noOfDozens=APPLES/DOZENS
    val remainApples=APPLES%DOZENS

    println(noOfDozens) //4
    println(remainApples) //2
}