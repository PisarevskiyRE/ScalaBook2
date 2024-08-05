package chapter10

import scala.collection.immutable.BitSet

object Task1004 extends App {



  trait Logger {
    def log(msg: String): Unit
  }

  trait CryptoLogger extends Logger {
    val key = 3
    abstract override def log(msg: String): Unit = {
      super.log(encrypt(msg))
    }
    def encrypt(msg: String): String = {
      msg.map((c: Char) => (c + key).toChar)
    }
  }

  trait ConsoleLogger extends Logger {
    override def log(msg: String): Unit = println(msg)
  }

  class ConcreteLogger extends ConsoleLogger {}
  def logger1 = new ConcreteLogger
  def logger2 = new ConcreteLogger with CryptoLogger
  def logger3 = new ConcreteLogger with CryptoLogger { override val key = -3 }
  logger1.log("Hello World!")
  logger2.log("Hello World!")
  logger3.log("Khoor#Zruog$")



}


