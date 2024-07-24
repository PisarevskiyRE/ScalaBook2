package chapter5

object Tack0501 extends App{


  class Counter {

    private var value = 0
    def increment() {

      if (value != Int.MaxValue) value += 1

    }
    def current = value

  }


  val c = new Counter()

  c.increment()

  println(c.current)


}
