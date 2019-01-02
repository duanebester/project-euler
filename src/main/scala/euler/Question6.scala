package euler

object Question6 extends App {
  def sumOfSquares(r:Range) = {
    r.map(i => i * i).sum
  }

  def squareOfSums(r:Range) = {
    val s = r.sum
    s * s
  }

  def sumSquareDiff(r:Range) = {
    squareOfSums(r) - sumOfSquares(r)
  }
}