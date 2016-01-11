package agoda

/**
 * Created by fixxer on 11/01/16.
 */
trait SymmetricalShape {
  val size: Int

  def getShape: List[String] = {
    def makeHalf(i: Int, acc: List[String]): List[String] = {
      if (i > size) acc
      else makeHalf(inc(i), row(size, i) :: acc)
    }
    val halfShape = makeHalf(1, Nil)
    halfShape.drop(1).reverse ++ halfShape
  }

  def row(size: Int, i: Int): String
  def inc(i: Int): Int
}
