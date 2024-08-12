package chapter12

import scala.math.{abs, signum}

object Task1204 extends App{

  println(
    (1 to abs(10)).foldLeft(1)(_ * _) * signum(10)
  )
}
