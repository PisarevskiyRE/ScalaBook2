package chapter8



object Task0807 extends App {

  class Point(val x: Int, val y: Int)

  class Square(x:Int,y:Int,size:Int) extends java.awt.Rectangle(x,y,size,size){

    def this(size: Int) = {
      this(0,0,size)
    }

    def this() = {
      this(0,0,0)
    }
  }

}
