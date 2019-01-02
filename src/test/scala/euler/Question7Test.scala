package euler

import org.scalatest.FunSuite

class Question7Test extends FunSuite {
  test("Question7.nthPrime") {
    assert(Question7.nthPrime(6) === 13)
    assert(Question7.nthPrime(7) === 17)
    assert(Question7.nthPrime(10001) === 104743)
  }
}