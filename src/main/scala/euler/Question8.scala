package euler

import scala.annotation.tailrec

object Question8 extends App {
  def largestProdInSeries(series:List[Int], size:Int): BigInt = {
    import BigInt._
    @tailrec
    def helper(series:List[BigInt], size:Int, currentMax:BigInt):BigInt = {
      val temp:BigInt = series.slice(0, size).product
      val max = if(temp > currentMax) temp else currentMax
      if(series.length <= size) {
        if(series.product > max) {
          series.product
        } else {
          max
        }
      } else {
        helper(series.slice(1, series.length), size, max)
      }
    }
    helper(series.map(BigInt(_)), size, 0)
  }
}