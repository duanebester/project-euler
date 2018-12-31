package euler

import org.scalatest.FunSuite

class Question3Test extends FunSuite {
  test("Question3.canBeDivided") {
    assert(Question3.canBeDivided(16)(4) === true)
    assert(Question3.canBeDivided(16)(3) === false)
  }
  test("Question3.largestPrimeFactor") {
    assert(Question3.maxPrimeFactor(13195) === 29)
    assert(Question3.maxPrimeFactor(600851475143L) === 6857L)
  }
}
