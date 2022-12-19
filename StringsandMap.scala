object arith {
    def newFunc(str : String): String = {
        str.reverse
    }

    def main(args : Array[String]) = {
        var str = "I love coding in Scala"
        println("Before reversing the string")
        println(s"String: ${str}")
        println("After reversing the string")
        var res = newFunc(str)
        println(s"String: ${res}")
        var days = Map(
            1 -> "Sun",
            2 -> "Mon",
            3 -> "Tue",
            4 -> "Wed",
            5 -> "Thu",
            6 -> "Fri",
            7 -> "Sat")
        for (keys,values) <- days do { println(s"Number : ${keys}, Day : ${values}") }
    }

}