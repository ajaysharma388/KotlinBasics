/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main() {
    var name : String = "Ajay Sharma"
    // name = null -> Will Give compile time error as the variable name is not the nullable.
    // Adding the '?' after the type of the variable allow the varible to store null value.
    var nameNullable : String? = "Ajay Kumar Sharma"
    // nameNullable = null
    // finding the length will be diff when our variable can hold the null value.
    var length1 : Int = name.length
    var length2 : Int? = nameNullable?.length
    println("$name -> $length1,\n$nameNullable -> $length2 ")
    println("$name.lowercase(), $nameNullable?.lowercase()")
    nameNullable = null
    if(nameNullable != null){
        println(nameNullable.length)
    }
}

// Ajay Sharma -> 11,
// Ajay Kumar Sharma -> 17 
// ajay sharma, ajay kumar sharma