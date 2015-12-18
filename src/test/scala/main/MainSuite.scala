package main

import org.scalatest.{FlatSpec, Matchers}
import main.Main.top

/**
  * Created by kasonchan on 12/18/15.
  */
class MainSuite extends FlatSpec with Matchers {

  "Test" should "pass" in {
    top
  }

}
