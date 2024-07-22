package chapter3

object Task0304 extends App {


  val array = Array(1,-2,3,-9, 0, 2)
  val result = array.filter( _ > 0) ++: array.filter(_<=0)
  result.foreach(println)
}
