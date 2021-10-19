fun main() {
var orignalStatment="I go to \"school\" by bus"
    println(orignalStatment)
//    var indexOfApostrophe=stat.indexOf(' ')
//    println(indexOfApostrophe)
    var statAsList=orignalStatment.split(" ")

    println(statAsList)
    println("${statAsList.get(1)}  length is ${statAsList.get(1).length}")
//    var theSubString=stat.substring(0 until indexOfApostrophe)
//    println(theSubString)

  var newStat=orignalStatment.replace('o','p')
    println(newStat)

}


