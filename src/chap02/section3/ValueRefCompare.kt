package chap02.section3

/*
이중 등호 ( == ) 는 스택에 저장된 값을 비교하고
삼중 등호 ( === ) 는 스택에 저장된 참조 주소를 비교한다.
 */
fun main(){
    val a :Int = 128
    val b = a
    println(a == b)
    println(a === b)

    val c : Int? = a
    val d : Int? = a
    val e : Int? = c

    println(c == d)
    println(c === d)
    println(c === e)

}