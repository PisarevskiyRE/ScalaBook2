package chapter5

object Tack0504 extends App{


  class Time(private val hours: Int, private val minutes: Int){

    private val allMinites = hours * 60 + minutes


    def before(that: Time): Boolean = {
      if ((this.allMinites) < (that.allMinites)) true
      else false

    }
  }



  println(new Time(19, 31).before(new Time(19, 30)))
  println(new Time(19, 31).before(new Time(19, 31)))
  println(new Time(19, 31).before(new Time(19, 32)))

}
