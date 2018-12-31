package euler

import scala.annotation.tailrec

object Question5 extends App {
  def evenlyDivided(x:Int)(y:Int):Boolean = x % y == 0
  def evenlyDivided(x:Int, r:Range):Boolean = {
    for (i <- r) {
      if(!evenlyDivided(x)(i)) {
        return false
      }
    }
    true
  }

  def smallestEvenDividedByRange(r:Range) = {
    @tailrec
    def helper(x:Int, range:Range):Int = {
      if(evenlyDivided(x,range)) {
        x
      } else {
        helper(x + 1, range)
      }
    }
    helper(1, r)
  }
}