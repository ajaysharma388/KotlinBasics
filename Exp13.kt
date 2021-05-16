interface Drivable{
    val maxSpeed: Int
    fun driveCar(): String
    fun accelrate(accelrationRate: Double, seconds: Int)
    fun applyBrakes() {
        println("Applying Brakes.")
    }
    fun displayDetails()
}

class Car(maxSpeed: Int, Brand: String, Model: String, currentAvg: Double, fuelAvailable: Double, accelarationRate: Double): Drivable {
    override val maxSpeed: Int
    var Brand: String
    var Model: String
    var Average: Double
    var canTravel: Double
    var fuelAvailable: Double
    var accelarationRate: Double
    var Speed: Double
    val fuelTankCapacity: Double = 50.0
    init{
        this.maxSpeed = maxSpeed
        this.Brand = Brand
        this.Model = Model
        this.Average = currentAvg
        this.fuelAvailable = if(fuelAvailable > this.fuelTankCapacity) this.fuelTankCapacity else fuelAvailable
        this.canTravel = this.Average * this.fuelAvailable
        this.accelarationRate = accelarationRate
        this.Speed = accelarationRate
    }

    override fun driveCar(): String {
        return "Driving the Car At Speed : ${this.Speed} Kph."
    }

    override fun accelrate(accelarationRate: Double, seconds: Int) {
        println("Speed Of the Car Before Accelaration Is : ${this.Speed} Kph.")
        this.accelarationRate = accelarationRate
        for(sec in 1..seconds) {
            this.Speed += accelarationRate
        }
        println("Speed Of the Car After Accelaration Is : ${this.Speed} Kph.")
    }
    override fun displayDetails() {
        println("***********************Car Details***************************")
        println("Brand: ${this.Brand}")
        println("Model: ${this.Model}")
        println("MaxSpeed: ${this.maxSpeed} Kph.")
        println("Average: ${this.Average}")
        println("canTravel: ${this.canTravel}")
        println("***************************END*******************************")
    }

    override fun applyBrakes() {
        println("Applying Simple Brakes at ${this.Speed} Kph.")
        this.Speed -= 15
        println("Speed After Applying Simple Brakes ${this.Speed} Kph.")
    }

    fun applyBrakes(retardrationRate: Double, seconds:Int) {
        println("Speed Before Applying Brakes ${this.Speed}")
        for(sec in 1..seconds) {
            this.Speed -= retardrationRate
        }
        if(this.Speed < 0) this.Speed = 0.0
        println("Speed After Applying Brakes ${this.Speed}")
    }
}

fun main() {
    var audiA3 = Car(maxSpeed = 270, Brand = "Audi", Model = "A3 Sports", currentAvg = 14.75, fuelAvailable = 47.0, accelarationRate = 35.0)
    audiA3.displayDetails()
    println(audiA3.driveCar())
    audiA3.accelrate(45.0, 6)
    println(audiA3.driveCar())
    audiA3.applyBrakes()
    println(audiA3.driveCar())
    audiA3.accelrate(4.65, 6)
    println(audiA3.driveCar())
    audiA3.applyBrakes(25.0, 10)
    println(audiA3.driveCar())
}

// ***********************Car Details***************************
// Brand: Audi
// Model: A3 Sports
// MaxSpeed: 270 Kph.
// Average: 14.75
// canTravel: 693.25
// ***************************END*******************************
// Driving the Car At Speed : 35.0 Kph.
// Speed Of the Car Before Accelaration Is : 35.0 Kph.
// Speed Of the Car After Accelaration Is : 305.0 Kph.
// Driving the Car At Speed : 305.0 Kph.
// Applying Simple Brakes at 305.0 Kph.
// Speed After Applying Simple Brakes 290.0 Kph.
// Driving the Car At Speed : 290.0 Kph.
// Speed Of the Car Before Accelaration Is : 290.0 Kph.
// Speed Of the Car After Accelaration Is : 317.89999999999986 Kph.
// Driving the Car At Speed : 317.89999999999986 Kph.
// Speed Before Applying Brakes 317.89999999999986
// Speed After Applying Brakes 67.89999999999986
// Driving the Car At Speed : 67.89999999999986 Kph.