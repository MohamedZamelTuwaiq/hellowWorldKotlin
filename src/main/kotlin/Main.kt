import kotlin.math.ln1p

//let user  use easy mid or mid

fun sort3Numbers(
    firstNo: Double, secondNumber: Double,
    thiredNumber: Double, easyMid: Boolean = true
) {
    val smallest = getSmallest(firstNo, secondNumber, thiredNumber)
    val mid = if (easyMid) {
        getEasyMid(firstNo, secondNumber, thiredNumber)
    } else {
        getMid(firstNo, secondNumber, thiredNumber)
    }
    val biggest = getBiggest(firstNo, secondNumber, thiredNumber)
    println("$smallest $mid $biggest")
}

fun main() {
//sort 3 unique numbers using if
    val n1 = 4.0
    val n2 = 1.0
    val n3 = 0.5
    val isUseEasyMid = false
    sort3Numbers(n1, n2, n3, isUseEasyMid)
    sort3Numbers(n3, n1, n2)
    sort3Numbers(
        easyMid = isUseEasyMid, thiredNumber = n3,
        secondNumber = n2, firstNo = n1
    )

 var isDenied=   canAccess(1,"Zamel",true)
    println(isDenied)
    canAccess(2,"Ahmed",false)

}

// write function to generate access based on isMangerOrNot ( EmpID, EmpName)

fun canAccess(empID: Int, empName: String, isManger: Boolean): Boolean {
  return  if (isManger) {
        println("Emp with id$empID and name$empName could access the building ")
         true
    } else {
        println("Emp with id$empID and name$empName couldn't  access the building ")
         false
    }

}