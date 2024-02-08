fun main(){
    val a:Int = 1;
    println("a is $a");

    val b: Float = 0.01345678f;
    println("b is $b");   
    
    val c: Double = 1.3;
    println("c is $c");

   fun printDouble(d:Double){println("d is $d")}

//    val i =1;
   val j=2.0;
//    val k= 2.0f;

//    printDouble(i) //type mismatch
   printDouble(j)
//    printDouble(k) //type mismatch  
}