package chap03.section1

fun main(){
    var preson1 = pepole("이보람", "대한민국")
    var preson2 = pepole2("이보람")
    var preson3 = pepole2("레아 세이두", "프랑스")

    val name = "홍길동"
    val email = "hong@example.kr"

    add(name)
    add(name, email)
    add("둘리", "dool@example.kr")
    defaultArgs()
    defaultArgs(200)
    defaultArgs(200,500)
}

//함수 기본값 지정해주기.
//일반적인 함수선언 pepl
fun pepole (name:String , country:String) {
    println("이름 : $name , 국적 : $country")
}

//기본값 정해주기.
//country에 기본값으로 대한민국을 지정.
fun pepole2 (name:String, country:String = "대한민국"){
    println("이름 : $name , 국적 : $country")
}

fun add(name:String, email:String = "default"){
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x : Int = 100, y : Int = 200){
    println(x + y)
}
