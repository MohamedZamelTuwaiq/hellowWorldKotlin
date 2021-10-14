fun main() {

    println(
        {
            val currentYear = 2018
            "Welcome to SimVillage , Mayor! (copyright $currentYear)"
        }()
    )

        val d: Int
    //==========================
    val greatingFunction: () -> String = {
        val currentYear=2018
        "Welcome to SimVallage - $currentYear"

    }

    println(greatingFunction())
    //=============================

    val greatingFunctionWithPlayerName : (String) -> String = { playerName ->
        val year=2018
        "welcom $playerName - $year"
    }
    println(greatingFunctionWithPlayerName("zamel"))
}