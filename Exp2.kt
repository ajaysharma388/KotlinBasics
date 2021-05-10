
fun main() {
    // DataTypes and Numbers.
    // Byte takes 8 bits in memory.
    var myByte:Byte = 12;
    // Short takes 16 bits in memory.
    var myShot:Short = 125;
    // Int takes 32 bits in memory.
    var myInt:Int = 54789;
    // Long takes 64 bits in memory.
    var myLong:Long = 144132164646
    // Float takes 32 bits in the memory.
    var myFloat:Float = 13.37F
    // Double takes 64 bits in the memory.
    var myDouble:Double = 13.374546494416

    // Boolean stores the logical values.
    var flag:Boolean = false
    flag = true
    // Character type
    var charVariable:Char = 'A'
    var charVariable_2:Char = 'B'
    // Strings. which is collection of letters.
    var myStr:String = "My name is Ajay Sharma."
    var firstChar:Char = myStr[0]
    var lastChar:Char = myStr[myStr.length-1]
    print(firstChar + ", " + lastChar + " => " + myStr)
}