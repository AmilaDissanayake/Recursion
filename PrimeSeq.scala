object PrimeSeq {

  def GCD(p:Int,q:Int):Int=q match{
    case 0 => p
    case x if x>p => GCD(q,p)
    case _ => GCD(q,p%q)
  }
  def prime(p:Int, q:Int=2 ):Boolean= q match {
    case x if(x==p) => true
    case x if GCD(p,x)>1 => false
    case x => prime(p,x+1)
  }

  def primeseq(n:Int):Any={
    if(prime(n)==true) println(n)
    primeseq(n-1)
  }

  def main(args: Array[String]): Unit =
    {
      primeseq(10)
    }

}
