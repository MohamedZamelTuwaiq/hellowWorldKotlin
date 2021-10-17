import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    println(
        {
            val currentYear = 2018
            "Welcome to SimVillage , Mayor! (copyright $currentYear)"
        }()
    )

    val d: Int
    //==========================
    val greatingFunction = {
        val currentYear = 2018
        "Welcome to SimVallage - $currentYear"

    }

    println(greatingFunction())
    //=============================

    val greatingFunctionWithPlayerName: (String) -> String = { playerName ->
        val year = 2018
        "welcom $playerName - $year"
    }
    println(greatingFunctionWithPlayerName("zamel"))


    ///////
    // input -> integers
    // output -> bool
    val isUrgent: (Int) -> Boolean = { age ->
        age >= 65
    }
    var result = isUrgent(90)

    val isUrgentS = { age: Int, name: String ->
        if (age >= 65)
            "$name is urgent"
        else
            "$name is Not urgent"
    }

    println(isUrgentS(90, "zamel"))

    //================================


    var checkSLetterFun: (Char) -> Boolean = { char ->
        char == 'h' && char == 'd'
    }
    println(checkSLetterFun('4'))

    var count = "zame  dhwebhghdbw h dh dh dh k".count {
        it == 's'
    }
    println(count)


    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }

    val hhhhfun = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "refghbj to SimVillage, $playerName! (copyright $currentYear)"
    }
    val oooofunb =

    println(greetingFunction)
    println(greetingFunction("xc", 20))
    println(runSimulation("zamel", greetingFunction))
    println("---------------------------------------------")
//    println(runSimulation("za     mel", ::x))
    println("---------------------------------------------")

    runSimulation("zamel"){ playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to dfghvbj, $playerName! (copyright $currentYear)"
    }


    var runSim=runSimulation("iluhiousgiwerfhiueruihjh",greetingFunction)
    println(runSim("sss"))
}

inline fun runSimulation(playerName: String, zamelFunction: (String, Int) -> String): (String)->String {
    var buildingNo = Random.nextInt(1..3)
   return { name->
       println(name)
       " $buildingNo zamel ${buildingNo+1}"
   }






}


fun  x (zz:String): String{
    return "gfchvjbknm"
}