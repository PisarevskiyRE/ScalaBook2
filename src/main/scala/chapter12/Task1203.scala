package chapter12

object Task1203 extends App{

  println(
  (1 to 10).reduceLeft((x,y) => x*y)
  )
}
