package chapter9

import java.io.PrintWriter
import scala.io.Source


object Task0901 extends App {

  val source = Source.fromFile("D:\\!Work\\Scala\\Projects\\ScalaBook2\\src\\main\\resources\\test.txt")

  val iterator = source.getLines().toArray.reverse
  val out = new PrintWriter("D:\\!Work\\Scala\\Projects\\ScalaBook2\\src\\main\\resources\\reversed.txt")

  for (i <- iterator){
    out.println(i)
  }

  out.close()
}
