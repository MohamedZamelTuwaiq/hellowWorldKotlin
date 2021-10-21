package classes

fun main() {
    var u = User()
    //not vailed exmaple
//    u.email= "--- bla   bla   bla"
   u.setEmail("--- bla   bla   bla")

    println(   u.getEmail())
    // valid exmple
//    u.email = "++++bla@bla.bla"
//    println(u.email)
//u.email


}

   class User {
  private var email: String = ""

       fun setEmail(value:String) {
            if (value.contains("@") && value.contains(".")) {
                email = value
            }

        }
      fun getEmail():String {
            return if (email.contains("@") && email.isNotEmpty()) {
                email
            } else " $name get Not Valid Email"
        }

       private var name:String="dddd"
}