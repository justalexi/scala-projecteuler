object Problem004
{

    /**
      * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
      * Find the largest palindrome made from the product of two 3-digit numbers.
      *
      * @param args
      */
    def main(args: Array[String]): Unit =
    {
//        val sourceRange = 10 to 99
        val sourceRange = 100 to 999
        val max = getPalindromes(sourceRange).max
        println(max)
    }

    def getPalindromes(range: Range): IndexedSeq[Int] = {
        val result = getProducts(range).filter(r => r.toString == r.toString.reverse)
//        println(result)
        result
    }

    def getProducts(range: Range): IndexedSeq[Int] = {
        val result = for (r1 <- range; r2 <- range) yield r1 * r2
//        println(result)
        result
    }
}