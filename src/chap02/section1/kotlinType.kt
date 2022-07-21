package chap02.section1

fun main() {
    val exp00 = 4321 //int로 추론.

    val exp01 = 123 //int 로 추론.
    val exp02 = 123L //long 으로 추론.
    val exp03 = 0x0F  // 16진 표기가 사용된 int 로 추론
    val exp04 = 0b00001011  // 2진 표기가 된 int 로 추론

    //기본형으로 Int형으로 추론되기 때문에 원하는 자료형이 있다면, 직접 명시해주어야한다.
    val exp05 : Byte = 123
    val exp06 : Short = 4321

    //양수만 표현할 수 있는 부호가 없는 정수자료형. 코틀린 1.3부터 도입됨.
    val uint : UInt = 153u
    val ushort : UShort = 65535u
    val ulong : ULong = 46322342uL
    val ubyte : UByte = 255u

    //언더스코어로 자릿값 구분.
    val number = 1_000_000
    val cardNumber = 1234_1234_1234_1234L

    val exp07 = 3.14 //Double형으로 추론
    val exp08 = 3.14F //Float형
    val exp09 = 3.14E-2 //왼쪽으로 소수점 2칸 이동 -> 0.0314
    val exp10 = 3.14e2 //오른쪽으로 소수점 2칸 이동 -> 314

    println(exp08)
    println(exp09)
    println(exp10)

    println("Byte min : " + Byte.MIN_VALUE + " , max : " + Byte.MAX_VALUE)
    println("Short min : " + Short.MIN_VALUE + " , max : " + Short.MAX_VALUE)
    println("Int min : " + Int.MIN_VALUE + " , max : " + Int.MAX_VALUE)
    println("Long min : " + Long.MIN_VALUE + " , max : " + Long.MAX_VALUE)
    println("Float min : " + Float.MIN_VALUE + " , max : " + Float.MAX_VALUE)
    println("Double min : " + Double.MIN_VALUE + " , max : " + Double.MAX_VALUE)
    /*
    효율적인 프로그래밍을 위해 메모리 공간을 낭비하지 않도록,
    사용될 수가 크지도 않은 것을 위해서 Int나 Long을 사용하지말고 Short형을 사용하는 등 데이터 크기에 맞는 자료형을 골라 사용하도록하자.
     */

}