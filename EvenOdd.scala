object EvenOdd {

  def isEven(p:Int):Boolean= p match{
    case 0 => true
    case _ => isOdd(p-1)
  }
  def isOdd(p:Int):Boolean = !(isEven(p))

  def main(args: Array[String]): Unit =
    {
      println(isOdd(2))
      println(isEven(2))
    }

}
