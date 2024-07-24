package chapter5

object Tack0502 extends App{

  class BankAccount{

    private var _balance: Int = 0

    def balance = _balance

    def deposit(value: Int) =  { _balance += value}
    def withdraw(value: Int) = { _balance -= value}

  }

  val ba = new BankAccount()

  ba.deposit(10)

  ba.withdraw(100)
  println( ba.balance )
}
