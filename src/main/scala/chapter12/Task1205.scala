package chapter12

import scala.math.{abs, signum}

object Task1205 extends App{
  def largest(fun: (Int) => Int, inputs: Seq[Int]) = inputs.map(fun).max


  largest(x => 10 * x - x * x, 1 to 10)
}
