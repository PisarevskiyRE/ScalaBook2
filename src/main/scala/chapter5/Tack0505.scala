package chapter5

import scala.beans.BeanProperty

object Tack0505 extends App{


  class Student(@BeanProperty var name: String, @BeanProperty var id: Long ) {
    override def toString = s"Student[$id:$name]"
  }

  val larry = new Student( "Larry", 1)
  larry.setName(larry.getName() + " Laffer")
  larry.id = larry.id + 1
  println( larry)


}
