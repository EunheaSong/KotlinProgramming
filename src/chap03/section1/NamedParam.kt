package chap03.section1

/*
매개변수에 기본값을 지정해주게 되면, 순서에 따라 적용이 되기 때문에 의도하지 않은 순서로 진행이 될 수도 있다.
그럴 경우, 매개변수 이름과 함께 함수를 호출해서 의도한 대로 적용시킬 수 있다.
 */
fun main(){
    namedParam(x = 200, z = 100)
    namedParam(z = 500) //그냥 500을 입력했다면 x가 500이 되었을것.
}

fun namedParam (x : Int = 100 , y :Int = 200, z:Int) {
    println(x + y + z)
}