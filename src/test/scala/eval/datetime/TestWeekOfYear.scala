package org.codecuts.eval.datetime;

import org.scalatest.FunSuite
import org.apache.pig.data.DefaultTuple

class TestWeekOfYear extends FunSuite {
    test("Empty input") {
        val weeknum = new WeekOfYear("")
        assert(weeknum.exec(null) == null);
  
        val t = new DefaultTuple()
        assert(weeknum.exec(t) == null);
    }
}
