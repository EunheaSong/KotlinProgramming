package chap03.section1

//기본적인 함수 선언.
fun sum(a:Int, b : Int) : Int{
    var sum = a+b
    return sum
}

//리턴값 인라인으로!
fun sum2 (a:Int, b:Int) : Int{
    return a+b
}

//코드 간략화!
fun sum3 (a:Int, b:Int) = a+b

fun main () {
    println(sum(3,2))
    println(sum2(3,2))
    println(sum3(3,2))

    val result = sum3(10,3)
    println(result)

}