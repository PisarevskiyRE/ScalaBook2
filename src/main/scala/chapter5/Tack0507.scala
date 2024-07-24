package chapter5

object Tack0507 extends App{


  class Person(name: String) {
    val firstName = name.split(" ")(0)
    val lastName = name.split(" ")(1)

    override def toString: String = lastName + "/"+ firstName
  }



  val p = new Person("123 321")

  println(p)

}
