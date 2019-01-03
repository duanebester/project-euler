package euler

import org.scalatest.FunSuite

class Question9Test extends FunSuite {
  test("Question9.method") {
    assert(Question9.pythagTripletsProduct(1000) === Some(31875000))
  }
}