/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main() {
    var ph1 :MobilePhone = MobilePhone("Android" ,"Samsung", "Galaxy A71", true, 33500.00)
    var ph2 :MobilePhone = MobilePhone("Ios13" ,"Apple", "iPhone 12Pro", true, 119650.00)
    var ph3 :MobilePhone = MobilePhone("Android" ,"Mi", "Note 10 Pro", true, 23500.00)
    var ph4 :MobilePhone = MobilePhone("Android" ,"Moto", "XPlay", true, 18600.00)

    var person1 :Person = Person("Ajay" ,"Sharma")
    var person2 :Person = Person("Megha" ,"Yadav")
    var person3 :Person = Person("Amruta" ,"Desai")
    var person4 :Person = Person("Diya" ,"Benjamin")
}

// If No argument Passed during Object Creation it will use the default values.
class Person(firstName : String = "John", lastName : String = "Doe") {
    // Init function will be called when we created the person Object.
    init {
        println("Created Person With First Name : ${firstName}, Last Name : ${lastName}.")
    }
}

class MobilePhone (OsName : String, BrandName : String, Model : String, isSmart : Boolean, Prize : Double) {
    init{
        println("**************************************************")
        if(Prize < 20000.00) {
            println("Buget Phone With Product detail's")
            println("Brand : ${BrandName}")
            println("Operating System : ${OsName}")
            println("Model : ${Model}")
            if(isSmart) {
                println("Smart Phone With Prize : ${Prize}")
            }
        } else if(Prize < 40000.00) {
            println("MidRange Phone With Product detail's")
            println("Brand : ${BrandName}")
            println("Operating System : ${OsName}")
            println("Model : ${Model}")
            if(isSmart) {
                println("Smart Phone With Prize : ${Prize}")
            }
        } else {
            println("FlagShip Phone With Product detail's")
            println("Brand : ${BrandName}")
            println("Operating System : ${OsName}")
            println("Model : ${Model}")
            if(isSmart) {
                println("Smart Phone With Prize : ${Prize}")
            }
        }
    }
}

// **************************************************
// MidRange Phone With Product detail's
// Brand : Samsung
// Operating System : Android
// Model : Galaxy A71
// Smart Phone With Prize : 33500.0
// **************************************************
// FlagShip Phone With Product detail's
// Brand : Apple
// Operating System : Ios13
// Model : iPhone 12Pro
// Smart Phone With Prize : 119650.0
// **************************************************
// MidRange Phone With Product detail's
// Brand : Mi
// Operating System : Android
// Model : Note 10 Pro
// Smart Phone With Prize : 23500.0
// **************************************************
// Buget Phone With Product detail's
// Brand : Moto
// Operating System : Android
// Model : XPlay
// Smart Phone With Prize : 18600.0
// **************************************************
// Created Person With First Name : Ajay, Last Name : Sharma.
// Created Person With First Name : Megha, Last Name : Yadav.
// Created Person With First Name : Amruta, Last Name : Desai.
// Created Person With First Name : Diya, Last Name : Benjamin.