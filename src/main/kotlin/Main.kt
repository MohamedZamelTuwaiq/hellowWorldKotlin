import java.sql.Struct

fun main(){

  var statment:  String="zamel@zamel.zamel"

 // println(isEmail(statment)) // normal calling method for commented method
 println(statment.isEmail()) // calling for Ext.Function
//check if the extended function will work or the member function
  println(statment.plus(5))

}
// retrun -> true or False
//input string->  isEmail or not
/*fun isEmail(email:String):Boolean{
  return email.contains('@')
          && email.contains('.')
}*/


fun String.isEmail():Boolean{
  return this.contains('@')
          && this.contains('.')
}
