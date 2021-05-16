data class User(var userId: String, var firstName: String, var lastName: String)

class MobilePhone(brand: String, model:String, battery:Int) {
    var Brand: String
    var Model: String
    var Battery: Int
    init {
        this.Brand = brand
        this.Model = model
        this.Battery = battery
    }
    fun chargeBattery(units: Int) {
        println("Now Charging the Battery by ${units} unit's.")
        if((units + this.Battery) > 100) {
            this.Battery = 100
        } else {
            this.Battery += units
        }
    }
    fun printData() {
        println("**********************Phone Details**********************")
        println("Brand : ${this.Brand}")
        println("Model : ${this.Model}")
        println("Battery : ${this.Battery}")
        println("**************************End****************************")
    }
}

fun main() {
    var user1:User = User(userId = "axs1229", firstName = "Ajay", lastName = "Sharma")
    println(user1)
    var user2:User = User(userId = "axs1229", firstName = "Ajay", lastName = "Sharma")
    println(user1 == user2)
    println(user1.equals(user2))

    var updatedUser = user1.copy(firstName="Vijay")
    println(updatedUser)

    println("**********************Mobile Phone Challenge**********************")
    var iphone:MobilePhone = MobilePhone(brand = "Apple", model = "IPhone 12 Pro", 56)
    iphone.printData()
    iphone.chargeBattery(34)
    iphone.printData()
}

// Sample Output
//
// User(userId=axs1229, firstName=Ajay, lastName=Sharma)
// true
// true
// User(userId=axs1229, firstName=Vijay, lastName=Sharma)
// **********************Mobile Phone Challenge**********************
// **********************Phone Details**********************
// Brand : Apple
// Model : IPhone 12 Pro
// Battery : 56
// **************************End****************************
// Now Charging the Battery by 34 unit's.
// **********************Phone Details**********************
// Brand : Apple
// Model : IPhone 12 Pro
// Battery : 90
// **************************End****************************