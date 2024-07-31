package chapter9

import scala.io.Source


object Task0907 extends App {

  val page = Source.fromURL("http://www.visitgreece.gr/en/nature/forests").mkString
  for (m <- """<img[^>]+src="([^"]*)"""".r.findAllMatchIn(page)) {
    println(m.group(1))
  }
}
