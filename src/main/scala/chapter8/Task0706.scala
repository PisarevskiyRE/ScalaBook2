package chapter8

import scala.collection.mutable.ArrayBuffer

object Task0806 extends App {

  class Point(val x: Double, val y: Double)

  abstract class Shape{
    def centerPoint: Point
  }

  class Rectangle(val w: Int, val h: Int, val p: Point) extends Shape {
    override def centerPoint: Point = new Point(p.x+ w /2, p.y +  h/2)
  }


  class Circle(r: Int, p: Point) extends Shape{
    override def centerPoint: Point = new Point(p.x + r /2, p.y + r /2)
  }

}
