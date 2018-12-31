package euler

import org.scalatest.FunSuite

class Question5Test extends FunSuite {
  test("Question5.evenlyDivided") {
    assert(Question5.evenlyDivided(2520, 1 to 10) === true)
    assert(Question5.smallestEvenDividedByRange(1 to 10) === 2520)
    assert(Question5.smallestEvenDividedByRange(1 to 20) === 232792560)
  }
}