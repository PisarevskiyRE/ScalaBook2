package chapter9

import scala.io.Source


object Task0903 extends App {

  Source.fromFile("D:\\!Work\\Scala\\Projects\\ScalaBook2\\src\\main\\resources\\test.txt").mkString.split("\\s+").filter(_.length > 12).foreach(println(_))

}
