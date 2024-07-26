package chapter8

import scala.collection.mutable.ArrayBuffer

object Task0804 extends App {


  abstract class Item{
    def price: Double
    def description: String
  }


  class SimpleItem(override val price: Double, override val description: String) extends Item

  class Bundle extends Item{
    val items = ArrayBuffer[Item]()

    override def price: Double = items.map(i => i.price).sum

    override def description: String = items.mkString(",")

    def addItem(item: Item) = items += item
  }

}
