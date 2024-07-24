package chapter6

object Task0606 extends App {


  object Enum extends Enumeration {
    val Clubs     = Value("\u2667") // black
    val Diamonds  = Value("\u2662") // red
    val Hearts    = Value("\u2661") // red
    val Spades    = Value("\u2664") // black

    def isRed(value: Value) = value == Diamonds || value == Hearts
  }


  Enum.values.foreach(println)
}
