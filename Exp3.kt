fun main() {
    var myStr:String = "Android Masterclass."
    val myFloat:Float = 13.37F
    val pi:Double = 3.14159265358979
    var myByte:Byte = 25
    var myInt:Int = 2020
    var myLong:Long = 18881234567
    var flag:Boolean = true
    var myChar:Char = 'A'
    // Arithmetic Operator Works the Same as in C/C++0
    // Comparision Operator's Work similar to C/C++ one as well.
    val personAge:Int = 15
    if(personAge >= 21) {
        print("Voila, you are adult and you may do what ever you wish but follow the rules.")
    } else if(personAge >= 18 && personAge < 21) {
        print("Since, you are not adult but elder enough to decide for yourself, \n1. You cam Vote.\n2. You can drive.")
    } else if(personAge >= 16 && personAge < 18) {
        print("Since, you are not adult but you can have driving licence and You can drive.")
    } else {
        print("Since, you are too young so. just wait for your time and enjoy your childhood.")
    }
}