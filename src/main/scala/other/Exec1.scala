package other

import other.Exec1.IntList


object Exec1 extends App {

  trait IntList
  case object Nil extends IntList
  case class Cons(value: Int, tail: IntList) extends IntList



  def sum(data: IntList): Int = data match {
    case Cons(value, Cons(v, t)) => sum(Cons(value+v, t))
    case Cons(value, Cons(v, Nil)) => sum(Cons(value+v, Nil))
    case Cons(value, Nil) => value
    case Nil => 0
  }


  def sum2(data: IntList): Int = {
    def helper(data: IntList, acc: Int): Int = {
      data match {
        case Nil => acc
        case Cons(value, tail) => helper(tail, acc + value)
      }
    }
    helper(data, 0)
  }

  println(
  sum(Cons(1,Cons(2,Cons(3,Nil)))))




  def reversed(data: IntList): IntList = {

    def helper(data: IntList, acc: IntList): IntList = data match {
      case Cons(head, tail) => helper(tail, Cons(head, acc))
      case Cons(head, Nil) => Cons(head, acc)
      case _ => acc
    }

    helper(data, Nil)

  }
  println(
    reversed(Cons(1,Cons(2,Cons(3,Nil)))))





}

/*
* 1,(2,3,4,5,Nil)
*
*
* */