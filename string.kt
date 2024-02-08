fun main() {

//     val text = """
//     |Tell me and I forget.
//     |Teach me and I remember.
//     |Involve me and I learn.
//     |(Benjamin Franklin)
//     """.trimMargin()
// By default, a pipe symbol | is used as margin prefix, but you can choose another character and pass it as a parameter, like trimMargin(">").


    val text = """
    #Tell me and I forget.
    #Teach me and I remember.
    #Involve me and I learn.
    #(Benjamin Franklin)
     """.trimMargin("#")

    println(text)
}