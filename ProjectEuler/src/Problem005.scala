object Problem005
{
    /**
      * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
      * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
      *
      * @param args
      */
    def main(args: Array[String]): Unit =
    {
//        println(getSmallestDivisibleBad(10))
        println(getSmallestDivisibleBad(20))
    }

    def getSmallestDivisibleBad(i: Int): Int = {
        var result = 0
        val range = 2 to i
        var continue: Boolean = true
        var nextNumber = 20
        while (continue) {
            val reminders = for (i <- range) yield nextNumber % i
            if (reminders.forall(r => r == 0)) {
                result = nextNumber
                continue = false
            }
            else {
                nextNumber += 2
            }
        }
        result
    }
}