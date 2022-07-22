package chap03.section1

fun main(){
    val num1 = 10
    val num2 = 3
    val result : Int

    result = max2(num1, num2)
    println(result)

}

fun max(a:Int, b: Int) : Int{
    if (a > b){
        return a
    } else {
        return b
    }
}
//함수 요약
fun max2(a:Int, b:Int) = if (a>b) a  else b

