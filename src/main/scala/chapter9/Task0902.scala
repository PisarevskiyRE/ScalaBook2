package chapter9

import java.io.PrintWriter
import scala.io.Source


object Task0902 extends App {

  val source = Source.fromFile("D:\\!Work\\Scala\\Projects\\ScalaBook2\\src\\main\\resources\\test.txt")
  val iterator = source.getLines()


  for (i <- iterator){
    val parts = i.split("\t").map(s => s.padTo(s.length + 4 - s.length % 4, ' '))
    println(parts.mkString)
  }

}
