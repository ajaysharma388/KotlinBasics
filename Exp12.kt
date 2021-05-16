open class Person(firstName: String, lastName: String, Age: Int) {
    var firstName: String
    var lastName: String
    var Age: Int
    init {
        this.firstName = firstName
        this.lastName = lastName
        this.Age = Age
    }
    public open fun displayDetails() {
        println("***************Person Details***************")
        println("Name : ${this.firstName} ${this.lastName}")
        println("Age : ${this.Age}")
        println("********************END*********************")
    }
}

class Student(firstName: String, lastName: String, Age: Int, Email: String, RollNo: Int) : Person(firstName, lastName, Age) {
    private lateinit var Email: String
    private var RollNo: Int
    init {
        this.Email = Email
        this.RollNo = RollNo
    }

    override fun displayDetails() {
        println("***************Student Details***************")
        println("Roll Number : ${this.RollNo}")
        println("Name : ${this.firstName} ${this.lastName}")
        println("EmailId : ${this.Email}")
        println("Age : ${this.Age}")
        println("********************END*********************")
    }
}

fun main() {
    var student1: Student = Student("Ajay", "Sharma", 23, "ajaysm2201@gmail.com", 1422410002)
    student1.displayDetails()
}

// Sample Output When Overided the displayDetails Method.
// ***************Student Details***************
// Roll Number : 1422410002
// Name : Ajay Sharma
// EmailId : ajaysm2201@gmail.com
// Age : 23
// ********************END*********************
//
// Sample Output When not Overided the displayDetails Method.
// ***************Person Details***************
// Name : Ajay Sharma
// Age : 23
// ********************END*********************