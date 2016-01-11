package agoda

import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.prop.Tables.Table
import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by pasoktummarungsri on 3/30/15.
 */
class ButterflyShapeSpec extends FlatSpec with Matchers with TableDrivenPropertyChecks {
  val expected2 = List("+       +", "+ + - + +", "+       +")
  val expected4 = List("+               +", "+ +           + +", "+ + +       + + +", "+ + + + - + + + +", "+ + +       + + +", "+ +           + +", "+               +")

  val examples =
    Table(
      ("size", "expected"),
      (2, expected2),
      (4, expected4)
    )

  forAll(examples) { (size, expected) =>
    s"ButterflyShape($size)" should "print the right shape" in {
      val shape = ButterflyShape(size)
      shape.getShape should be(expected)
      shape.printButterfly
    }
  }
}
