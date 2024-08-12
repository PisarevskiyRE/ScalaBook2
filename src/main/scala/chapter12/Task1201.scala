package chapter12

object Task1201 extends App{


  def values(fun: (Int) => Int, low: Int, high: Int): Array[(Int, Int)] = {
    (low to high).map( x => (x, fun(x))).toArray
  }


  values(x => x * x, -5, 5).foreach(println)


}
