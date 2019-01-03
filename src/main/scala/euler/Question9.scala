package euler

object Question9 extends App {
  def pythagTripletsProduct(input:Int):Option[Int] = {

    val squares = (1 to input)
      .toList
      .map(i => i * i)
      .zipWithIndex

    for((a2, i) <- squares) {
      for((b2, j) <- squares.slice(i, squares.length)) {
        for((c2, _) <- squares.slice(j, squares.length)) {
          if(a2 + b2 == c2) {
            val a = Math.sqrt(a2).toInt
            val b = Math.sqrt(b2).toInt
            val c = Math.sqrt(c2).toInt
            if(a + b + c == input) {
              return Some(a * b * c)
            }
          }
        }
      }
    }

    None
  }

}