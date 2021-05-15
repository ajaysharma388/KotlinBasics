fun main() {
    var bmw: Car = Car("BMW", "630 d MSports", 7195000.0, 275, "Carbon Black")
    println("My car is ${bmw.Company}")
    println("Model is latest ${bmw.Model}")
    println("Which is in Color ${bmw.color}")
    println("And Cost me exactly ${bmw.exShowroomCost}")
    println("Which can run at Max. Speed of ${bmw.maxSpeed} Kph.")

}

// Introduction To getter's and setter's in kotlin.

class Car(Company: String, Model: String, exShowroomCost: Double, maxSpeed: Int, color: String) {
    lateinit var Company: String
        private set
    lateinit var Model: String
        private set
    var exShowroomCost: Double = 0.0
    var maxSpeed: Int = 0
    lateinit var color: String
        private set
    init{
        this.Company = Company
        this.Model = Model
        this.exShowroomCost = exShowroomCost + 0.3*exShowroomCost
        this.maxSpeed = maxSpeed
        this.color = color
    }
}

// Sample Output
// My car is BMW
// Model is latest 630 d MSports
// Which is in Color Carbon Black
// And Cost me exactly 9353500.0
// Which can run at Max. Speed of 275 Kph.