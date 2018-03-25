object Problem003
{
    /**
      * The prime factors of 13195 are 5, 7, 13 and 29.
      * What is the largest prime factor of the number 600851475143 ?
      * @param args
      */
    def main(args: Array[String]): Unit =
    {
//        val max = primes(60).max
//        val max = primes(13195).max
        val max = primes(BigInt.apply("600851475143")).max
        println(max)
    }

    def primes(numParam:BigInt): List[BigInt] =
    {
        var num:BigInt = numParam
        var primes:List[BigInt] = 1 :: Nil

        var lastPrime:BigInt = 1
        var counter:BigInt = 2
        while (counter <= num)
        {
            if (num % counter == 0)
            {
                primes = counter :: primes
                lastPrime = counter
                num = num / counter
            }
            else
            {
                counter = counter + 1
            }
        }
        primes
    }
}
