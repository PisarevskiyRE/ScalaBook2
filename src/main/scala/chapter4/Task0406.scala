package chapter4

import scala.collection.JavaConverters.mapAsJavaMap
import java.util.Calendar._

object Task0406 extends App {


  val days = scala.collection.mutable.LinkedHashMap[String, Int]()


  val weekdays = scala.collection.mutable.LinkedHashMap(
    "Monday" -> java.util.Calendar.MONDAY,
    "Tuesday" -> java.util.Calendar.TUESDAY,
    "Wednesday" -> java.util.Calendar.WEDNESDAY,
    "Thursday" -> java.util.Calendar.THURSDAY,
    "Friday" -> java.util.Calendar.FRIDAY
  )
  for ((d, c) <- weekdays) println(s"$d -> $c")
}
