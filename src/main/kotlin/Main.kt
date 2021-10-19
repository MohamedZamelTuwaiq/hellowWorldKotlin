fun main() {
    var myMap = mutableMapOf("inst" to "zamel", "inst2" to "Sadun", "friend" to "zamel")
    myMap["class"] = "kotlin"
    myMap.putIfAbsent("class", "kkkk")

    println(myMap)

    myMap.remove("class")
    myMap.putAll(listOf("sss","dd","dddf").mapIndexed { index,item -> index.toString() to item })
    myMap.putAll(mapOf("10" to "sss","d" to "dd","44" to "dsfdsfdf"))

    println(myMap)
}