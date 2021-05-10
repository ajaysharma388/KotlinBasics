// When is similar to the switch case in programming languages like c++,Java & C etc.
fun main() {
    var seasion:Int = 3
    when(seasion) {
        1 -> println("Spring.")
        2 -> println("Summer.")
        3 -> {
            println("Fall.")
            println("Autumn.")
        }
        4 -> println("Winter.")
        else -> println("Invalid Season.")
    }
    seasion = 6
    when(seasion) {
        in 3..5 -> println("Spring.")
        in 6..8 -> println("Summer.")
        in 9..11 -> println("Fall.")
        12, 1, 2 -> println("Winter.")
        else -> println("Invalid Season.")
    }
    var month:Int = 3
    when(seasion) {
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
        else -> println("Invalid Month Entry.")
    }
    // Finding the type of Data put inside the variable.
    var data:Any = false
    when(data) {
        is Int -> println("$data is of type Int.")
        is Float -> println("$data is of type Float.")
        is Double -> println("$data is of type Double.")
        is String -> println("$data is of type String.")
        else -> println("$data is of any other data type.")
    }
}