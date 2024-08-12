package chapter12

object Task1210 extends App{

  def unless(cond: Boolean)(block: => Unit): Unit = {
    if (!cond) block
  }

  unless (1 == 2) {
    println("Ok gelukkig")
  }
}
