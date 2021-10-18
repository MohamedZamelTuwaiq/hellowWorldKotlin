fun main(){



    var x:String?= readLine()!!.capitalize()

    var title=x?:"new title"

println(title)
    x?.let {
        println(add(x,x))
    }

    // !! -- ?.let{} -- ?:
}
fun  add(x:String,y:String):String{

    return x+y
}