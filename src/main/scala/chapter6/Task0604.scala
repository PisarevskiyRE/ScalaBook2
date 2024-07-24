package chapter6

object Task0604 extends App {

  class Point private(x: Int, y: Int)

  object Point{
    def apply(x: Int, y: Int)  = new Point(x,y)
  }

}
