object Fibonacci {

  def Fibonacci(n:Int):Int= n match{
    case 0 => 0
    case x if x==1 => 1
    case _ => Fibonacci(n-1)+Fibonacci(n-2)
  }

  def FibonacciSeq(n:Int):Unit= {
    if (n > 0) FibonacciSeq(n-1)
    println(Fibonacci(n))
  }

  def main(args: Array[String]): Unit =
    {
      println(FibonacciSeq(10))
    }

}
