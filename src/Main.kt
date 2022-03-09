fun main(){
    var a = arrayOf("Misky","Bakhita","Sakina", "Jane")
    println(a.contentToString())
cities(arrayOf("harare","mumbai","dodoma","jakarta"))
    numbers(arrayOf(17,4,213,78,43,90,31,3,73,11,158,62))
    names(arrayOf("Chris","Chiri","Mary","Berly"))
}
fun humans(name:Array<String>){
    var a= name
    println(a)
}
fun cities(city:Array<String>) {
    city.forEach { city ->
        println(city.capitalize())
    }
}
fun numbers(number:Array<Int>){
    var sum = number[2]+number[5]
    println(sum)
    println(number.indexOf(158))
    println(number.sortedArray().contentToString())
}
fun names(allNames:Array<String>):Array<String>{
    var y= (allNames)
    println(allNames.contentToString())
    return y
}