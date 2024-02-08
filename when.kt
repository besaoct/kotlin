fun main(){

    // val a= 5;
    // val r=  a in 1..5; //1 2 3 4 5
    // val u=  a in 1 until 5; //1 2 3 4 
    // println(r)
    // println(u)


    val shafin ="student"

    // when(shafin){
    //     "teacher" -> println("shafin is a teacher")
    //     "Software developer" -> println("shafin is a software developer")
    //     "student" -> println("shafin is a student")
    //     else -> println("Not found")
    // }   
    
    val result= when(shafin){
        "teacher" -> "shafin is a teacher"
        "Software developer" -> "shafin is a software developer"
        "student" -> "shafin is a student"
        else -> "Not found"
    }
    println(result)
}