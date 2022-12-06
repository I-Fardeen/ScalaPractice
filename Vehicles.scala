import scala.io.StdIn.readLine;

object Vehicles{
    trait Vehicle{
        var engtype : String
        def showEng(): String;
    }

    trait Car extends Vehicle{
        var hpower: Int
        var mileage: Double
        def showHPower(): Int
        def showMileage(): Double;
    }

    class BugattiVeron extends Car{
        var color: String = "White"
        var maxspeed: Int = 410
        var engtype : String = "None"
        var hpower: Int = 0
        var mileage: Double = 0.0
        def carSpecsFunction() = {
                println("Enter the color for your Bugatti Veron")
                val clr = readLine()
                if setColor(clr) then
                println(s"Your cars color is changed to ${showColor()} Successfully")
                println("Displaying car stats:")
                println(s"Engine Type: ${showEng()}")
                println(s"Top Speed: ${getMaxSpeed()}")
                println(s"Horsepower: ${showHPower()}")
                println(s"Mileage: ${showMileage()}");
        }
        def showColor(): String = {
            color //autoreturn in scala
        }
        def setColor(scolor: String): Boolean ={
            color = scolor
            true
        }
        def getMaxSpeed(): Int = {
            maxspeed //autoreturn in scala
        }
        //implementing the interface methods
        override def showEng(): String = {
            engtype = "8.0-liter W16 engine"
            engtype
        }
        override def showHPower(): Int = {
            hpower = 987
            hpower
        }
        override def showMileage(): Double = {
            mileage = 4.0
            mileage
        }
    }

    class BMWi8 extends Car {
        var color: String = "White"
        var maxspeed: Int = 250
        var engtype : String = "None"
        var hpower: Int = 0
        var mileage: Double = 0.0
        def carSpecsFunction() = {
                println("Enter the color for your BMWi8")
                val clr = readLine()
                if setColor(clr) then
                println(s"Your cars color is changed to ${showColor()} Successfully")
                println("Displaying car stats:")
                println(s"Engine Type: ${showEng()}")
                println(s"Top Speed: ${getMaxSpeed()}")
                println(s"Horsepower: ${showHPower()}")
                println(s"Mileage: ${showMileage()}");
        }
        def showColor(): String = {
            color
        }
        def setColor(scolor: String): Boolean ={
            color = scolor
            true
        }
        def getMaxSpeed(): Int = {
            maxspeed
        }
        //implementing the interface methods
        override def showEng(): String = {
            engtype = "1.5L BMW TwinPower Turbo 3-cylinder engine + eDrive Electric Motor"
            engtype
        }
        override def showHPower(): Int = {
            hpower = 369
            hpower
        }
        override def showMileage(): Double = {
            mileage = 47.45
            mileage
        }
    }
    

    def main(args: Array[String]) = {
        
        //creating instances of our classes
        val mybug = new BugattiVeron();
        val mybmw = new BMWi8();
        println("Select Car Type (BugattiVeron or BMWi8?) type 1 or 2")
        var i = readLine()
        if i == "1" then 
                mybug.carSpecsFunction();
            
        else if i == "2" then
                mybmw.carSpecsFunction();
        else
                println("Please choose one of the correct options!")
    }
     
}