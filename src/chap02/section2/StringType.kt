package chap02.section2

fun main(){
    //문자 자료형
    val ch = 'c'
    val ch2: Char
    println("==문자 자료형 Char==")
    println(ch+1)

    val code : Int = 65
    val chFromCode : Char = code.toChar() //숫자는 toChar로 형변환 할 수 있다.
    println(chFromCode)

//    val ch4: Char = 'ab' //에러남. 2개 이상의 문자는 담을 수 없다.

    val ch3 = '\uD55C'
    println(ch3)

    //문자열 자료형
    println("==문자열 자료형 String==")

    var str1 : String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    /*
    코틀린은 힙영역에 String Pool을 가지고 있어,
    문자열을 String Pool에 저장하고 같은 문자열이 필요할 때 저장해둔 문자열을 꺼내 참조하도록 한다.
     */
    println( "str1 === str3 : ${ str1 === str3 }") //참조주소를 비교할때 === 을 사용. 문자열을 비교하려면 ==또는 equals를 사용
    println("str1 === str2 : ${str1 === str2}")
    println( "str1 == str3 : ${ str1 == str3 }")
    println("str1 == str2 : ${str1 == str2}")
    println(str1.equals(str3))
    println(str1.equals(str2))

    //$기호를 사용하여 변수를 문자열에서 바로 출력하기
    var a = 1
    val s1 = "a is $a"

    var b = 2
    val c = "${a + b}" //표현식을 사용하려면 중괄호{} 안에 표현해야한다.

    //이스케이프 문자 => 백슬래시를 붙여표현하는거 ex) \"
    // 백슬래시 \ 를 사용해서 "큰 따옴표나 $표시 같은 문자를 표현한다.
    val test = "\"hello\", I have \$15."
    println(test)
    println("I love \"Kotlin\"")

}