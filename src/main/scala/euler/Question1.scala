package euler

import scala.annotation.tailrec

object Question1 extends App {
  def isMultipleOf3Or5(x:Int):Boolean = x % 3 == 0 || x % 5 == 0

  def multiplesOf3Or5Rec(input:Int):Int = {
    @tailrec
    def findSum(current:Int, max:Int, sum:Int):Int = {
      if(current >= max) {
        sum
      } else {
        val newSum = if (isMultipleOf3Or5(current)) sum + current else sum
        findSum(current + 1, max, newSum)
      }
    }

    findSum(1, input, 0)
  }

  def multiplesOf3Or5Fun(input:Int) = {
    List.range(0, input).filter(isMultipleOf3Or5).sum
  }
}
