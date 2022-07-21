package chap02.section1

import example.edu.Person as User
/*
edu에도 Person 이 있고, section1에도 Person이 존재.
동일한 클래스명이 사용될 경우, as 키워드를 통해 별명을 짓고 구분지어줄 수 있다.
 */

fun main(){
//    val user1 = Person("James", 30) //section1에 Person 이 생기기전.
    val user1 = User("James", 30) //section1에 Person이 생겨서 User라는 별명을 붙여줌.
    val user2 = Person("James", "A123")

    println(user1.name)
    println(user1.age)

    println(user2.name)
    println(user2.code)
}
class Person (val name:String, val code:String)