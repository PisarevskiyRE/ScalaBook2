package chapter3

object Task3 extends App {

  val array = Array(1,2,3,4,5)


  val result = for (i <- 0 until array.length  ) yield {


    if (i == array.length-1) array(i)
    else if (i % 2 == 0) array(i+1)
    else array(i-1)

  }

  result.foreach(println)



}
