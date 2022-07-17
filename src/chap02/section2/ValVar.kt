package chap02.section2
/*
변수 선언,초기화 시 val 과 var 의 사용.
val로 선언된 변수는 읽기전용이 되어 이후 값을 변경할 수 없다.
var로 선언된 변수는 이후에도 값을 변경할 수 있다.
변수 초기화시 자료형을 생략할 수 있다. 코틀린에서 지정되는 값을 가지고 자료형을 추론해낸다.
값을 지정하지 않는 선언만 할 때는 불가능.
 */

fun main(){
    val number = 10
    var language = "Korean"
    val secondNumber : Int = 20
    language = "English" //var로 선언했기때문에 값 수정 가능.
//    number = 30 //에러남. val로 선언된 변수일 경우 값을 수정할 수 없음.

    println("number : $number")
    println("language : $language")
    println("secondNumber : $secondNumber")

}