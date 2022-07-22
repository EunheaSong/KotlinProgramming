package chap02.section3

fun main (){
    //컴파일러에서 자동으로 형변환을 해주는 스마트 캐스트 !
    //스마트 캐스트가 작용하는 대표적인 자료형인 "Number"
    var test : Number = 12.2 //12.2 라는 실수로 인해 float 형으로 스마트 캐스트.
    println("$test")

    //Int 형으로 스마트 캐스트.
    test = 12
    println("$test")

    //Long 형으로 스마트 캐스트.
    test = 120L
    println("$test")

    //Float 형으로 스마트 캐스트.
    test += 12.0f
    println("$test")


}