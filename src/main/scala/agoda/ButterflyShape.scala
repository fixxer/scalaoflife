package agoda

/**
 *
 * Created by pasoktummarungsri on 3/30/15.
 */
case class ButterflyShape(size: Int) extends SymmetricalShape{
  override def row(size: Int, x: Int): String = {
    val spaces = (size - x) * 2
    val halfrow = ("+ " * x) + (" " * spaces)
    halfrow + (if (x == size) "-" else " ") + halfrow.reverse
  }

  override def inc(i: Int): Int = i + 1

  def printButterfly: Unit = {
    getShape.foreach(println)
  }
}
