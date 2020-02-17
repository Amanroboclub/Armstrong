fun main(args: Array<String>){
    var myString:String = "hello world"  //string
    var x:Int = 10
    var name:String
    name ="Aman"
    println(myString)
    println(x)
    var RockObj = Rock()
    RockObj.sum(RockObj.toyata)

    display(name)
}
class Rock{
    var toyata = "Hello World"
    fun sum(toyata: String) {

        print(toyata)
    }
}
fun display(name:String){
    print(name)
}