package chapter9

import scala.io.Source


object Task0906 extends App {

  val fn6 = "D:\\!Work\\Scala\\Projects\\ScalaBook2\\src\\main\\resources\\test2.txt"
  val src = Source.fromFile(fn6).mkString
  for (str <- """"[^"]*"""".r.findAllIn(src)) {
    println(str)
  }
}
