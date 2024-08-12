package chapter12

object Task1207 extends App{


  val pairs: Seq[(Int, Int)] = (1 to 10) zip (11 to 20)


  def adjustToPair(fun: (Int, Int) => Int) =
    (pair: (Int, Int)) => fun(pair._1, pair._2)

  pairs.map(adjustToPair(_ + _))

}
