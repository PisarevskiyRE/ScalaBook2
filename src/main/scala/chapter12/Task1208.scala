package chapter12

object Task1208 extends App{

  val strs = Array("Hi", "Bar", "Quux", "Hello", "World!")
  val lens = Array(2, 3, 4, 5, 6)
  strs.corresponds(lens)((str, len) => str.length == len)

}
