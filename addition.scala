object addition {
  def addition(n:Int):Int = n match
    {
    case 1 => 1
    case _ => n+addition(n-1)
  }

  def main(args: Array[String]): Unit =
    {
      println(addition(5))
    }
}
