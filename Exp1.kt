fun main() {
    // variable declared using var can be modified later on where as.
    // when you use val instead of var it does not allow you to update it.
    // because variable declared using val are immutable.
    var myName:String = "Ajay Sharma"
    myName = "Vijay Sharma"
    val Gender:String = "Male"

    print("Hello, "+myName + "And you are " + Gender)
}