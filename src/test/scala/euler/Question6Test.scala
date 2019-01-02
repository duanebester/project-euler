package euler

import org.scalatest.FunSuite

class Question6Test extends FunSuite {
  test("Question6.sumOfSquares") {
    assert(Question6.sumOfSquares(1 to 10) === 385)
  }
  test("Question6.squareOfSums") {
    assert(Question6.squareOfSums(1 to 10) === 3025)
  }
  test("Question6.sumSquareDiff") {
    assert(Question6.sumSquareDiff(1 to 10) === 2640)
    assert(Question6.sumSquareDiff(1 to 100) === 25164150)
  }
}