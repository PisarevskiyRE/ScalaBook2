package chapter5

object Tack0508 extends App{

  class Car(val product: String,
            val name: String,
            val year: Int,
            var number: String){

    def this(p: String, n: String) = {
      this(p, n, -1, "")
    }

    def this(p: String, n: String, y: Int) = {
      this(p, n, y, "")
    }

    def this(p: String, n: String, n1: String) = {
      this(p, n, -1, n1)
    }


  }

}
