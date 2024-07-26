package chapter8

object Task0801 extends App {


  class BankAccount(initBalance: Double){
    private var balance = initBalance
    def currentBalance = balance
    def deposit(amount: Double) = {balance += amount; balance}
    def withdraw(amount: Double) = {balance -= amount; balance}
  }


  class CheckingAccount(initBalance: Double) extends BankAccount(initBalance){
    override def deposit(amount: Double): Double = super.deposit(amount - 1)

    override def withdraw(amount: Double): Double = super.withdraw(amount + 1)

  }

  val test = new CheckingAccount(100)

  println(test.deposit(10))



}
