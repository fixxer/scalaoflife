package agoda

import java.io.{PrintStream, ByteArrayOutputStream, ByteArrayInputStream}

import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by pasoktummarungsri on 3/30/15.
  */
class DiamondShapeSpec extends FlatSpec with Matchers with TableDrivenPropertyChecks {
  val expected3 = List("  +", "+ + +", "  +")
  val expected5 = List("    +", "  + + +", "+ + + + +", "  + + +", "    +")

  val examples =
    Table(
      ("size", "expected"),
      (3, expected3),
      (5, expected5)
    )

    forAll(examples) { (size, expected) =>
      s"DiamondShape($size)" should "print the right shape" in {
        val shape = DiamondShape(size)
        shape.getShape should be(expected)
        shape.printDiamond
      }
    }
}
