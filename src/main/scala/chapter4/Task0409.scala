package chapter4

object Task0409 extends App {

  def lteqgt(values: Array[Int],v: Int): (Int,Int,Int) = {

    var a,b,c: Int =0


    for (vl <- values){



      vl match {
        case a1 if (a1 < v) =>  {a += 1}
        case a2 if (a2 == v) => {b += 1}
        case a3 if (a3 > v) => {c += 1}
        case _ =>
      }

    }

    (a,b,c)
  }
}
