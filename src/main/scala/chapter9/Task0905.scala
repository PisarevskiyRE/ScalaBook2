package chapter9

import scala.io.Source


object Task0905 extends App {

  for (exp <- 0 to 20) {
    val pow = Math.pow(2.0, exp)
    val rec = 1.0 / pow
    println(s"${pow.toInt.toString.padTo(11, ' ')}$rec")
    //println(f"$pow%8.0f $rec%f");
    //println("%8.0f    %f".format(pow, rec))
  }

}
