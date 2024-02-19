import kotlin.time.times

/**
* about function
**/

/* *
* function syntax:>
* fun functionName(Input): output{
*   code
* }
* */

fun main(){
    println(square(2))

    println("simple interest : ${simpleInterest(100, 20)}")

    // difference between char and string
    var char = 'c' // char is enclosed in single quotes ' '
    var string = "India" // string is enclosed in double quotes " "

    // Three terms related to variable: declaration, assignment, initialization
    var i: Int // deceleration
    i = 5 //assignment
    var j = 10 // initialization

    //operation on string
    println("Hello".uppercase())
    println("NEW".lowercase())

    //relational operation
    println(5 == 5)
    println(4 <= 2)

    //logical operation
    println(true && false)
    println(true || true)

    // repeat
    var a = 0
    repeat(3){
        println(message = "number $a")
        a++
    }
}

fun square(x: Int): Int {
    return x * x;
}

//or can be written as:
/*
 fun square(x: Int) = x * x
*/
// this is called one line function

fun simpleInterest(p: Int, r: Int = 7, t: Int = 2) = (p * r* t)/100f




