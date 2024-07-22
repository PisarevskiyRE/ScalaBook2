package chapter4

object Task0401 extends App {

  val map1 = Map("a" -> 10.0,"b" -> 10.0,"c" -> 10.0)


  val map2 = for ((x,y) <- map1) yield (x,y - y * 0.1)

  map2.foreach(println)

}
