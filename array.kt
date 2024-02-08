// Create arrays:
// To create arrays in Kotlin, you can use:
// functions, such as arrayOf(), arrayOfNulls() or emptyArray().
// the Array constructor.

fun main(){

val simpleArray = arrayOf(1, 2, 3)
println(simpleArray.joinToString())

// Creates an array with values [null, null, null]
// val nullArray: Array<Int?> = arrayOfNulls(3)
val nullArray = arrayOfNulls<Int>(3)
println(nullArray.joinToString())
// null, null, null

// var exampleArray = emptyArray<String>()
var exampleArray: Array<String> = emptyArray()
println(exampleArray.joinToString())


simpleArray[1]=101;
println(simpleArray[1])

val initArray = Array<Int>(4) { i -> i*i }
// println(initArray.joinToString())
initArray.forEach { println(it) }


val twoDArray = Array(3) { Array<Int>(2) { 0 } }
println(twoDArray.contentDeepToString())


}