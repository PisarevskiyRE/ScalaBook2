package chapter8

object Task0809 extends App {


  class Creature {
    def range: Int = 10
    val env: Array[Int] = new Array[Int](range)
  }


  class Ant extends Creature {
    override val range = 2
  }
}
