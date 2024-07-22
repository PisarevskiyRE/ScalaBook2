package chapter3

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting._

object Task0306 extends App {


  val array1 = Array(1,22,3,4,5,6)
  val array2 = ArrayBuffer(1,2,33,4,5,6)
  quickSort(array1)
  println(
      array1.reverse.mkString(",")
  )


  println(
    array2.sortWith(_ > _).mkString(",")
  )
}
