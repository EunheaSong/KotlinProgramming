package chap03.section3

/*
고차함수와 람다식 - 매개변수에 람다식을 이용한 고차함수
*/
fun main(){
    var result: Int
    result = highOrder({x, y ->  x + y}, 10, 20)
    println(result)
}

//sum이라는 람다식이 result의 x,y-> x+y 라는 람다식을 받는 것이고 , a, b 를 받아서 리턴에 있는 sum 이라는 람다식을 수행하여 리턴한다.
fun highOrder(sum : (Int, Int) -> Int , a: Int, b:Int): Int{
    return sum(a,b)
}