object Problem001
{
    def main(args: Array[String]): Unit =
    {
        val sum = (1 until 1000).filter(a => a % 3 == 0 || a % 5 == 0).sum
        println(sum)
    }
}
