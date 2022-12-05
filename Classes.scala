object Classes{
    trait Cart:
        private var total: Int;
        protected var nitems: Int = -1;
        def addItem(nitems: Int): Boolean;
        def getTotal(): Double;
    class CheckOut extends Cart{
        def this {
            nitems = 1;
        }
        override def addItem(nitems: Int): Boolean = {
            if nitems > 0 then
            nitems += 1;
            total = total + ntiems;
            true
            else
            false
        }
        override def getTotal(): Double = {
            println(s"Cart total = ${total}");
            total
        }
    }
    def main(args: [String]) = {
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