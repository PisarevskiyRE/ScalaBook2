package chapter3


import scala.collection.mutable.ArrayBuffer

object Task9 extends App {

  /*Улучшите решение из предыдущего упражнения. Соберите ин-
дексы элементов, подлежащих перемещению и позиции, ку-
да они должны быть помещены. Переместите их и укоротите
буфер. Не копируйте элементов, находящихся перед первым
нежелательным элементом.*/


  val a = ArrayBuffer(1,2,-3,4,5,-6,7,8,-9, 0)


  val posNeg = (for (i <- a.indices if a(i) < 0) yield i).head

  val posPos: Seq[Int] = (for (i <- a.indices if a(i) >= 0) yield i)

  var result = (posPos :+ posNeg).sortWith(_ < _)

  println("-"*25)

  result.foreach(println)

  println("-"*50)



  for (j <- result.indices) a(j) = a(result(j))


  a.trimEnd(a.length - result.length)
  a.foreach(println)


}
