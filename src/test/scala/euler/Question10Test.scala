package euler

import org.scalatest.FunSuite

class Question10Test extends FunSuite {
  test("Question10.sumOfPrimesBelow") {
    assert(Question10.sumOfPrimesBelow(10) === BigInt("17"))
    assert(Question10.sumOfPrimesBelow(2000000) === BigInt("142913828922"))
  }
}