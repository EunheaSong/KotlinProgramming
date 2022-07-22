package chap02.section3

fun main() {

    number(20L)
    number(20)

    val x : Any //코틀린의 최상위 클래스.슈퍼클래스라고도 부름. 자바의 Object 와 유사하나 다른 유형이다.
    x = "Hello"
    if (x is String) {
        println(x.length)
    }

    checkArg("10")
    checkArg(10)

}
//is 의 왼쪽의 변수가 오른쪽 자료형과 형이 일치하면 true, 아니면 false 를 반환.
fun number (num: Number){
    if (num is Int){
        println(num)
    }else if (num !is Int) {
        println("Not a Int")
    }
}

fun checkArg(x:Any){
    if (x is String){
        println("x is String : $x")
    }
    if (x is Int) {
        println("x is Int : $x")
    }
}