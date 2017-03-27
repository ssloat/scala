import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

//import Card._

@RunWith(classOf[JUnitRunner])
class TestCard extends FunSuite {
  trait TestEdges {
    val dm = new Edge("DM")
    val df = new Edge("DF")
    val cm = new Edge("CM")
  }

  test("edge fit") {
    new TestEdges {
      assert(dm.fit(df))
      assert(!dm.fit(cm))
    }
  }

  test("broken") {
    assert(1 === 2)
  }
}
