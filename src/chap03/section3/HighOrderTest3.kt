package chap03.section3

fun main(){
    val out: () -> Unit = {println("Hello World!")} //Unit -> 반환값이 없을 때 사용. print같은거 쓸때 좋음!
    val out2 = { println("Hello Kotlin") }
    val out3 = "Hello Java"
    out() //변수를 함수처럼 사용가능
    out2() //변수를 함수처럼 사용가능
//    out3() -> 함수로는 사용불가
    val new = out
    new()


    test() // 함수처럼 사용가능.
    test2(out3) // 함수처럼 사용가능.
}

val test = { println("test") }
val test2 : (String) -> Unit = { a -> println(a + "WoW!")}