
fun printTable(inpNum:Int) {
    var i:Int = 1
    while(i <= 10) {
        println("$inpNum * $i = ${i*inpNum}")
        i++
    }
}

fun factorial(inpNum:Long) : Long {
    if(inpNum <= 1) return 1
    return inpNum * factorial(inpNum-1)
}

fun main() {
    printTable(15)
    var inpNum:Long = 1
    while(inpNum <= 10)
        println("factorial of $inpNum is ${factorial(inpNum++)}")
}

//Sample Ouput:

//15 * 1 = 15
//15 * 2 = 30
//15 * 3 = 45
//15 * 4 = 60
//15 * 5 = 75
//15 * 6 = 90
//15 * 7 = 105
//15 * 8 = 120
//15 * 9 = 135
//15 * 10 = 150
//factorial of 1 is 1
//factorial of 2 is 2
//factorial of 3 is 6
//factorial of 4 is 24
//factorial of 5 is 120
//factorial of 6 is 720
//factorial of 7 is 5040
//factorial of 8 is 40320
//factorial of 9 is 362880
//factorial of 10 is 3628800