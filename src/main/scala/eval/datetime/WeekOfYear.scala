/*
 * Apache Pig eval function to map date strings to week numbers
 */
package org.codecuts.eval.datetime;

import java.text.SimpleDateFormat
import org.apache.pig.EvalFunc
import org.apache.pig.data.Tuple
import java.util.{Calendar, GregorianCalendar}

class WeekOfYear(val format: String) extends EvalFunc[Integer] {
    val df = new SimpleDateFormat(format)
    val cal = new GregorianCalendar()

    def exec(tuple: Tuple): Integer = {
        if (tuple == null || tuple.size == 0) {
            return null 
        }
        val date = df.parse(tuple.get(0).asInstanceOf[String])
        cal.setTime(date)
        return cal.get(Calendar.WEEK_OF_YEAR)
    }
}

