package chapter3

import scala.collection.mutable.ArrayBuffer

object Task0308 extends App {

  val a = ArrayBuffer(1,2,-3,4,5,-6,7,8,-9, 0)


  val pos = for (i <- a.indices if a(i) < 0) yield i


  for (i <- pos.tail.reverse) a.remove(i)


  a.foreach(println)




}
