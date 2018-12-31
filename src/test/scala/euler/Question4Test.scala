package euler

import org.scalatest.FunSuite

class Question4Test extends FunSuite {
  test("Question4.num2Arr") {
    assert(Question4.num2Arr(487) === List(4, 8, 7).reverse)
    assert(Question4.isPalindrome(487) === false)
    assert(Question4.isPalindrome(487789) === false)
    assert(Question4.isPalindrome(123321) === true)
    assert(Question4.isPalindrome(1234321) === true)
    assert(Question4.maxPalindrome(10, 99) === Some(9009))
    assert(Question4.maxPalindrome(100, 999) === Some(906609))
  }
}