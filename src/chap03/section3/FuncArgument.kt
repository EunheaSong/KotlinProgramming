package chap03.section3

/*
고차함수
 */
fun main(){
    val res1 = sum(3,2) //일반적인 인자 사용
    val res2 = mul(sum(3,2),3) // 인자에 함수를 사용

    println("res1 : $res1 res2 : $res2")

    println("funcFunc : ${funcFunc()}")

}

//인자로 일반 함수 사용
fun sum(a:Int, b:Int) = a + b
fun mul(a:Int, b : Int) = a * b

//반환값에 일반 함수 사용
fun funcFunc() : Int {
    return sum(2,2)
}