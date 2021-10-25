fun main() {

    var emp = Employee("zamel", "22")
    var emp3 = Employee("zamel", "22")
    var emp2 = Employee("not Zamel", "ddf334")
    emp.f()
    println(emp.hashCode().toString() + "-----" + emp3.hashCode().toString())

    var empCopy = emp.copy()


    var (name, id) = emp
    println("name is ${emp.component2()} and id is $id")
}

data class Employee(var name: String, var id: String) {
    fun f() {
        println("LLLK")
    }
}