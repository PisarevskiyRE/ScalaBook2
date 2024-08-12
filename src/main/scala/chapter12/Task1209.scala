package chapter12

object Task1209 extends App{

  val strs = Array("Hi", "Bar", "Quux", "Hello", "World!")
  val lens = Array(2, 3, 4, 5, 6)

  def corres[A,B](a: Seq[A], b: Seq[B], fun: (A, B) => Boolean) =
    (a zip b).forall(p => fun(p._1, p._2))
  //was: (a zip b).map(p => fun(p._1, p._2)).reduce(_ && _)

  corres[String,Int](strs, lens, (str, len) => str.length == len)

}
