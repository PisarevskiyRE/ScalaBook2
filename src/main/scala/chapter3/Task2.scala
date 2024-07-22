package chapter3

object Task0302 extends App {


  val array = Array(1,2,3,4,5)

  for (i <- 0 until array.length - 1 ) {
    if (i % 2 > 0 ){
      val buff = array(i)
      array(i) = array(i-1)
      array(i-1) = buff
    }
  }

  array.foreach(println)

}
