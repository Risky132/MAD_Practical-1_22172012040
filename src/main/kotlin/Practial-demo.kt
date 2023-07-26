
class student (var no:Int)
{
    var name:String="hello"
    constructor(n:Int,s:String):this(n)
    {
        name=s
        println("secondary constructor code ")
    }
    init
    {
        println("init called")
    }
}
fun main()
{
    var s1 =student(10,"hello ")

    println(s1.no)
    println(s1.name)

}



