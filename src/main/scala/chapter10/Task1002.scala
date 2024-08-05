package chapter10
import java.awt.Point

object Task1002 extends App {


  class OrderedPoint extends java.awt.Point with scala.math.Ordered[java.awt.Point] {
    override def compare(that: Point): Int = {
      if (this.x == that.x)
        this.y.compare(that.y)
      else
        this.x.compare(that.x)
    }
  }


  val p1 = new OrderedPoint
  val p2 = new OrderedPoint

  p1.x = 1
  p1.y = 1

  p2.x = 2
  p2.y = 2


  println(List[OrderedPoint](p2,p1).sorted)


}
