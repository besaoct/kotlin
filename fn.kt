import kotlin.math.pow
import power

fun main (){
    println(add(4,6))
    println(evenOdd(2))
    printMessage(5) // argument

    println(add(5.0,6.0))

    println(subs(num2=1,num1=9)) //named arguments

    var a = ::addd
    println(a(3.0,2.1))
    

    a= ::power
    println(a(3.0,2.0))

}

fun printMessage(count:Int =2){  //---parameter--// //default arg val count =2
   for(i in 1..count) println(i)
}

fun power(n1:Double, n2:Double) = n1.pow(n2)

// fun add(num1:Int, num2:Int):Int{
//     val sum = num1+num2
//     return sum
// }

fun subs(num1:Int, num2:Int) = num1-num2
fun add(num1:Int, num2:Int) = num1+num2
fun add(num1:Double, num2:Double) = num1+num2 //fn overloading
fun addd(num1:Double, num2:Double) = num1+num2 //fn overloading

// fun evenOdd(n:Int): String{
//     val res =  if(n%2==0) "Even" else "odd"
//     return res
// }

fun evenOdd(n:Int) = if(n%2==0) "Even" else "odd"


