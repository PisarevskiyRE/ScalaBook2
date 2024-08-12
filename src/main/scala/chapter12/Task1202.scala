package chapter12

object Task1202 extends App{

  println(
    Array(1,2,3,4,5).reduceLeft((x,y) => math.max (x, y))
  )

}
