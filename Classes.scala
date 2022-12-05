object Classes{
    trait Cart:
        var total: Int
        var nitems: Int
        def addItem(nitems: Int): Boolean
        def getTotal(): Double
    class CheckOut extends Cart{
            var total = 0;
            var nitems = 0;
            var temp=0;
        override def addItem(nitems: Int): Boolean = {
            if nitems > 0 then
            temp = nitems;
            temp = temp + 1;
            total = total + nitems
            true
        }
        override def getTotal(): Double = {
            println(s"Cart total = ${total}");
            total
        }
    }
    def main(args: Array[String]) = {
        val check = CheckOut();
        val c = check.addItem(5);
        if c then
        println("Item added successfully");
        else
        println("Some error occured");
        val t = check.getTotal();
        println(s"Your total: $t");
    }
}