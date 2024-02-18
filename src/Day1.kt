/**
* Variable: In kotlin there are two types of variable "var" and "val".
* in var value can be change
* in val value can't be change.
**/

/*Assign value to string*/

fun main(){
    var name = "Prabhash"
    val birthYr = 2002
    // or we can specify variable like,
    /*
    * var name: String
    * val birthYr: Int
    */

    //if we again try to assign the value to the variable then it will show error
    /*
    * birthYr = 2001   // Error (Val cannot be reassigned)
    */

    println("Hello $name")
    println(birthYr)

    //Data Type
    /*
     * val num: Int = 5                // Int
     * val doubleNum: Double = 5.99    // Double
     * val letter: Char = 'D'          // Char
     * val bool: Boolean = true        // Boolean
     * val txt: String = "Hello"       // String
     */

    // Type Conversion
    var x: Int = 5
    var y: Long = x.toLong()
    println(y)

    //Access a string
    print(name[0])

    //if-else condition
    if(x < 10){
        println("X is less than 10.")
    } else{
        println("X is grater than 10, value of x is $x")
    }

    // we can also use if-else as
    val time = 20
    val greeting = if (time < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)

    //Instead of if-else we can use "when"
    val day = 4

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)
}

