import kotlin.math.ln1p


fun main() {
//sort 3 unique numbers using if
    val n1 = 4.0
    val n2 = 1.0
    val n3 = 0.5

    val smallest = getSmallest(n1, n2, n3)
    val mid = getEasyMid(n1, n2, n3)
    val biggest = getBiggest(n1, n2, n3)
    println("$smallest $mid $biggest")

}