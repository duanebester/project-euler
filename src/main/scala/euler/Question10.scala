package euler

object Question10 extends App {
  def sumOfPrimesBelow(x:Int):BigInt = {
    (2 to x).toList.filter(Question7.isPrime).map(BigInt(_)).sum
  }
}