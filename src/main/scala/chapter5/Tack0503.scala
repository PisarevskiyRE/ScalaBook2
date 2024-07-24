package chapter5

object Tack0503 extends App{


  class Time(private val hours: Int, private val minutes: Int){
    def before(that: Time): Boolean = {
      if ((this.hours*60 + this.minutes) < (that.hours * 60 + that.minutes)) true
      else false

    }
  }



  println(new Time(19, 31).before(new Time(19, 30)))
  println(new Time(19, 31).before(new Time(19, 31)))
  println(new Time(19, 31).before(new Time(19, 32)))

}
