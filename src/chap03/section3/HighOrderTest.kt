package chap03.section3

/*
고차함수와 람다식 - 변수에 람다식 사용하기
 */
fun main (){
    var result: Int
    val multi = { x: Int, y: Int -> x * y } //일반 변수에 람다식 할당
    result = multi(10, 20) // 람다식이 할당된 변수는 함수처럼 사용가능.
    println(result)


    val add: (Int, Int) -> Int = { x, y -> x + y }
    println(add(5, 10))

    val multi2: (Int, Int) -> Int = { x : Int, y : Int->
        x + y
        x * y
    }
    println(multi2(10,10))

    //세가지가 모두 동일한 의미로 사용. 같은 값을 반환한다.
    val m1: (Int, Int) -> Int = {x: Int, y: Int -> x + y}
    val m2: (Int, Int) -> Int = {x, y -> x + y}
    val m3 = {x: Int , y: Int -> x + y}
    println("자료형 생략. 동일한 값 반환")
    println(m1(10,10))
    println(m2(10,10))
    println(m3(10,10))

}