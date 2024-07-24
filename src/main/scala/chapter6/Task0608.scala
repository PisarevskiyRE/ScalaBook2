package chapter6

object Task0608 extends App {


  object Colners extends Enumeration {
    type Colners = Value
    val Black   = Value(0x000000)
    val Red     = Value(0xff0000)
    val Green   = Value(0x00ff00)
    val Blue    = Value(0x0000ff)
    val Yellow  = Value(0xffff00)
    val Magenta = Value(0xff00ff)
    val Cyan    = Value(0x00ffff)
    val White   = Value(0xffffff)
  }

  Colners.values.foreach(c => println(f"${c.id}%06x: ${c}%s"))
}
