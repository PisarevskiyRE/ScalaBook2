package chapter4

import scala.collection.JavaConverters._

object Task0407 extends App {

  val props: scala.collection.Map[String, String] = System.getProperties().asScala

  val maxKeyLength = props.keySet.map(_.length).max

  for ((k,v) <- props) {
    val pk = k.padTo(maxKeyLength, ' ')
    println(s"$pk | $v")
  }

}
