package other

import other.Stepik.IntList

import scala.annotation.tailrec


object Stepik extends App {

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

//  println(
//  sum(Cons(1,Cons(2,Cons(3,Nil)))))




  def reversed(data: IntList): IntList = {
    @tailrec
    def helper(data: IntList, acc: IntList): IntList = data match {
      case Cons(head, tail) => helper(tail, Cons(head, acc))
      case Cons(head, Nil) => Cons(head, acc)
      case _ => acc
    }

    helper(data, Nil)

  }
//  println(
//    reversed(Cons(1,Cons(2,Cons(3,Nil)))))


  def foldRight[T](data: IntList, f: (Int, T) => T)(start: T): T = data match {
    case Nil => start
    case Cons(head, Nil) =>  f(head, start)
    case Cons(head, Cons(a, Nil)) => f(head + a, start)
    case Cons(head, Cons(a, b)) => f(head, foldRight(Cons(a, b),f)(start) )
  }


//  println(
//    foldRight(Cons(1,Cons(2,Cons(3,Nil))), (a: Int, b:Int) => b - a)(100)
//  )



  def foldLeft[T](data: IntList, f: (Int, T) => T)(start: T): T = {

    @tailrec
    def helper(data: IntList, acc: T, f: (Int, T) => T): T =
      data match {
        case Nil => acc
        case Cons(head, Nil) => helper(Nil,  f(head, acc), f)
        case Cons(head, Cons(a, Nil)) => helper(Cons(a, Nil), f(head, acc), f)
        case Cons(head, Cons(a, b)) => helper(Cons(a, b),    f(head, acc) ,    f)
      }



    helper(data, start, f)
  }

    println(
      foldLeft(Cons(1,Cons(2,Cons(3,Cons(4,Nil)))), (a: Int, b:Int) => b - a )(100)
    )
}

/*
* 1,(2,3,4,5,Nil)
*
*
* */