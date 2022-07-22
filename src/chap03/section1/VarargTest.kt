package chap03.section1

fun main(){
    normalVarargs(1,2,3,4)
    normalVarargs(5,6,7,8,9,10)

    student("김태연", "이보람", "한지민", "박은빈")
}

fun normalVarargs(vararg counts: Int){
    for (num in counts) {
        print("$num ")
    }
    print("\n")
}

fun student(vararg students:String){
    var num = 1
    for (student in students){
        print("$num. $student ")
        num++
    }
}