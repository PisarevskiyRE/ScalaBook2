package chapter8

object Task0811 extends App {


  class Point private (private val xy: String) extends AnyVal

  object Point{
    def apply(x: Long, y: Long): Point = new Point(x.toString + " "+ y.toString)
  }
}
