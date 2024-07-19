package chapter3

import scala.collection.mutable.ArrayBuffer

object Task1 extends App{

  val n = 10
  val buffer: ArrayBuffer[Int] = new ArrayBuffer[Int]()

  for (i <- (0 until n)){
    buffer += i
  }

  buffer.foreach(println)
}
