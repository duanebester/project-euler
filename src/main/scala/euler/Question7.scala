package euler

import scala.annotation.tailrec

object Question7 extends App {

  def isPrime(x:Int):Boolean = Question3.maxPrimeFactor(x) == x || x == 1

  def nthPrime(n:Int):Int = {
    @tailrec
    def helper(x:Int, n:Int, max:Int):Int = {
      val prime = isPrime(x)
      if(prime && n == max) {
        x
      }
      else {
        helper(x + 1, if(isPrime(x)) n + 1 else n, max)
      }
    }
    helper(2,1,n)
  }
}