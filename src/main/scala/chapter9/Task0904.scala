package chapter9

import scala.io.Source


object Task0904 extends App {

  val fn4 = "D:\\!Work\\Scala\\Projects\\ScalaBook2\\src\\main\\resources\\test2.txt"
  val doubles = Source.fromFile(fn4).mkString.split("\\s+").map(_.toDouble)
  println(doubles.sum)
  println(doubles.sum / doubles.length)
  println(doubles.max)
  println(doubles.min)

}
