package agoda

/**
 *
 * Created by pasoktummarungsri on 3/30/15.
 */
case class DiamondShape(size: Int) extends SymmetricalShape {
  override def row(size: Int, i: Int): String = {
    val spaces = (size - i) / 2
    ("  " * spaces) + ("+ " * i).trim
  }

  override def inc(i: Int): Int = i + 2

  def printDiamond: Unit = {
    getShape.foreach(println)
  }
}
