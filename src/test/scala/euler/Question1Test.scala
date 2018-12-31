package euler

import org.scalatest.FunSuite

class Question1Test extends FunSuite {
  test("Question1.multiplesOf3And5 Recursive") {
    assert(Question1.multiplesOf3Or5Rec(10) === 23)
    assert(Question1.multiplesOf3Or5Rec(1000) === 233168)
  }

  test("Question1.multiplesOf3And5 Functional") {
    assert(Question1.multiplesOf3Or5Fun(10) === 23)
    assert(Question1.multiplesOf3Or5Fun(1000) === 233168)
  }
}
