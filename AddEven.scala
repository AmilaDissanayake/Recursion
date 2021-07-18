object AddEven {

  def isEven(p:Int):Boolean= p match{
    case 0 => true
    case _ => isOdd(p-1)
  }
  def isOdd(p:Int):Boolean = !(isEven(p))

  def AddEven(n:Int):Int = n match{
    case 1 => 1
    case x if (isOdd(n)==false) => AddEven(n-1)
    case x if(isOdd(n)== true) => n+AddEven(n-1)
  }


  def main(args: Array[String]): Unit =
    {
      println(AddEven(6))
    }

}
