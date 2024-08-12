package chapter12

object Task1206 extends App{
  def largestAt(fun: Int => Int, inputs: Seq[Int]) =
    inputs.
      map(v => (v, fun(v))).
      reduceLeft((p1, p2) => if (p1._2 > p2._2) p1 else p2)._1

  println(
    largestAt(x => 10 * x - x * x, 1 to 10)
  )
}
