class Structure() {

    infix fun createPyramid(rows: Int) {
        var k=0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("* ")
                ++k
            }
            println()
        }
    }
}

fun main() {
    val p = Structure()
    p createPyramid 4       // p.createPyramid(4)
}
/* 

Here, createPyramid() is an infix function that creates a pyramid structure. It is a member function of class Structure, takes only one parameter of type Int, and starts with keyword infix.

The number of rows of the pyramind depends on the argument passed to the function.

*/