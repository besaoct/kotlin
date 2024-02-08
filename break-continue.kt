fun main(){
    // for (i in 1..10) {
    //     if (i == 5) {
    //         break
    //     }
    //     println(i)
    // }

    // Kotlin Labeled break

    // first@ for (i in 1..4) {

    //     second@ for (j in 1..2) {
    //         println("i = $i; j = $j")

    //         if (i == 2) break@second
    //     }
    // }   

     first@ for (i in 1..4) {

        second@ for (j in 1..2) {
            println("i = $i; j = $j")

            if (i == 2) break@first
        }
    }


    //continue
    println("\nContinue statement\n")
    
    //     for (i in 1..10) {
    //     if (i == 5) {
    //         continue
    //     }
    //     println(i)
    // }

    
    first@ for (i in 1..4) {

        second@ for (j in 1..2) {
            println("i = $i; j = $j")
            if (i == 2){
                println("\n")
                continue@second
            }
             println("Doesnot print anything when i=2\n")
        }
    }


}