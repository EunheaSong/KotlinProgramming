package chap03.section3
/*
    값에 의한 호출로 람다식 사용하기
 */
fun main(){
//    값에 의한 호출로 람다식 사용하기
    val result = callByValue(lambda())
    println(result)

    //이름에 의한 람다식 호출
    val result2 = callByName(otherLmbda)
    println(result2)
}

fun callByValue( b: Boolean) : Boolean{
    println("callByValue function")
    return b
}
val lambda: () -> Boolean = {
    println("lambda function")
    true
}

fun callByName(b : () -> Boolean) : Boolean{
    println("callByName function")
    return b()
}
val otherLmbda : () -> Boolean = {
    println("otherLambda function")
    true
}