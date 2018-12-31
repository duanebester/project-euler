package euler

object Question3 extends App {

  def canBeDivided(x:Long)(y:Long) = x % y == 0

  def maxPrimeFactor(x:Long):Long = {
    var maxPrimeFactor:Long = -1
    var n = x

    while (canBeDivided(n)(2)) {
      maxPrimeFactor = 2
      n /= 2
    }

    for (i <- 3L to Math.sqrt(n).toLong by 2L) {
      while (canBeDivided(n)(i)) {
        maxPrimeFactor = i
        n /= i
      }
    }

    if (n > 2)
      maxPrimeFactor = n

    maxPrimeFactor
  }
}
