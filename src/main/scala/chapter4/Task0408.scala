package chapter4



object Task0408 extends App {

  def minMax(values: Array[Int]): (Int, Int) = {
    var min, max: Int = 0
    for(v <- values){

      v match {
        case v1 if v1 < min => min = v1
        case v1 if v1 > max =>  max = v1
        case _ =>
      }


    }
    (min, max)
  }
  println(minMax(Array(1,2,3,4,5,6,7,0,0,-1, 99)))
}
