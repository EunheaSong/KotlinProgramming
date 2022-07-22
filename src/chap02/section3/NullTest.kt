package chap02.section3

fun main() {

    var str1: String = "Hello Kotlin!"
//    str1 = null //오류발생. 코틀린은 null을 허용하지 않는다 !! null을 받으려면 표기해주어야한다.

    var str2: String? = "Hello Kotlin!" //물음표를 붙임으로 null을 허용한다고 표기.
    str2 = null  //null값을 수용.
    println("str2 : $str2")

    //String과 String? 는 서로 다른 자료형이다.
//    println("str2 : $str2 length : ${str2.length}") //오류발생. null을 허용하면 length 를 조회할 수 없다.
// 세이프 콜(?.)을 사용해서 null이 할당될 가능성이 있는 = null을 허용시킨. 변수를 검사하여 안전하게 호출시킨다.
    println("str2 : $str2 length : ${str2?.length}")

    //단정 기호 사용
//    println("str2 : $str2 length : ${str2!!.length}") //IDE에서 오류 띄워줌... 책에는 오류안난다고 되어있는데.. 왜 ..

    //조건문 사용하여 null 허용 변수 검사
    val len = if(str2 != null) str2.length else -1
    println("str2 : $str2 length : $len")

    //세이프 콜과 엘비스 연산자의 사용
    println("str2 : $str2 length : ${str2?.length ?: -1}")


}