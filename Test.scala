object Test{
    //traits are like interfaces in Java
    trait Wallet: 
        def show(): String;
        var x : Int = 0;

    trait BankAccount:
        def show(): Double;
        var x : Double = 0;

    class CheckBal extends Wallet{
        override def show(): String ={
            var x = 1000
            //println(s"Your current balance is ${x}");
            return s"Your current balance is ${x}";

        }
    }
    class CheckAccBal extends BankAccount{
        override def show(): Double = {
            var x = 100.0
            return x;
        }
    }

    class ParentClass {
        private var ParenVar = false;
        protected var ParenProVar = false;
        def parentFunction() = {
            ParenVar = true;
        }
        def showpar(): Boolean = {
            return ParenVar;
        }
    }

    class ChildClass extends ParentClass {
        def childFunction() ={
            ParenProVar = true;
        }
        def showchild(): Boolean = {
            return ParenProVar;
    }
    }


    def main(args: Array[String]) = {
        
        // val wallet = new CheckBal();
        // val acc = new CheckAccBal();
        // println(wallet.show());
        // println(s"Your current balance is ${acc.show()}");
        val parent = new ParentClass();
        val child = new ChildClass();
        //parent.parentFunction();
        child.parentFunction();
        child.childFunction();
        println(s"Value of Parent Private  Variable = ${child.showpar()}")
        println(s"Value of Parent Protected Variable = ${child.showchild()}")

        //parent.ParenVar = false;

        // val name = "John";
        // val lname = "Doe";
        // println(s"Your name is: $name and last name is: $lname");
        // println(s"Your salary is ${3000+2000}");
        // IfElseExample(15000);
        // ForLoopExample(1);
        // whileLoopExample(0);
        // println(matchCaseExample(1));
        // println(matchCaseExample("HelloWorld"));
        // println(matchCaseExample(List(1,2,3,4)));
        // tryCatchExample();
    }

    def IfElseExample(a: Int) = {
        if a > 1000 then
        println(s"The entered number is ${a} and greater than 1000");
        else if a < 1000 then
        println(s"The entered number is ${a} and less than 1000");
        else
        println(s"What sort of number is this?");

    }

    def ForLoopExample(i: Int) = {
        for (i <- 1 to 10)  do
        println(s"The number is ${i}");
        println("For Loop Example completed");
        // var res[] = for (i <- 1 to 10) yield i;
        // for (i <- 1 to 10) do println(res[i]);
    }

    def whileLoopExample(i: Int) = {
        var x = i;
        while x <=3
        do 
         println(x)
         x = x+1;
    }

    def matchCaseExample(i: Matchable): String = {
        i match
        case x: Int => s"$x is an Int"
        case x: String => s"$x is a String"
        case x: List[?] => s"$x is a List"
        case _ => "Unknown Input";
    }

    def tryCatchExample() = {
        try {
            val a = 1/0
        }
        catch 
        case ae : ArithmeticException => {
            println("\n ------()---------");
            println("\n An error occurred");
            println(ae.getMessage);
        }
        finally println("In Finally block");
    }
    

}