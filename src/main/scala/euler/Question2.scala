package euler

import scala.annotation.tailrec

object Question2 extends App {
  val LIMIT = 4000000
  def isEven(x:Int):Boolean = x % 2 == 0

  def evenFibonacci:Int = {
    @tailrec
    def findNextEvenSum(first:Int, second:Int, currentEvenSum:Int): Int = {
      val next = first + second
      if(next >= LIMIT) {
        currentEvenSum
      } else {
        val nextEvenSum = if(isEven(next)) currentEvenSum + next else currentEvenSum
        findNextEvenSum(second, next, nextEvenSum)
      }
    }

    findNextEvenSum(0, 1, 0)
  }
}
