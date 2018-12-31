package euler

object Question4 extends App {

  def num2Arr(x:Int):List[Int] = {
    if(x < 10) List(x) else (x % 10) :: num2Arr((x - (x % 10)) / 10)
  }

  def isPalindrome(x:Int):Boolean = {
    val numberArray = num2Arr(x)
    numberArray == numberArray.reverse
  }

  def maxPalindrome(from:Int, to:Int):Option[Int] = {
    var max = -1
    for(x <- from to to) {
      for(y <- from to to) {
        val temp = x * y
        if(isPalindrome(temp) && temp > max) {
          max = temp
        }
      }
    }
    if (max > -1) Some(max) else None
  }
}