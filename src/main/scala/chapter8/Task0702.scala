package chapter8

object Task0802 extends App {


  class BankAccount(initBalance: Double){
    private var balance = initBalance
    def currentBalance = balance
    def deposit(amount: Double) = {balance += amount; balance}
    def withdraw(amount: Double) = {balance -= amount; balance}
  }



  class SavingAccount(initBalance: Double) extends BankAccount(initBalance){
    private var transactions: Int = 0

    def earnMonthlyInterest(percent: Double): Unit = {
      transactions = 0
      super.deposit(currentBalance * percent)
    }

    override def deposit(amount: Double) = {
      val cost = if (transactions < 3) 0 else 1
      super.deposit(amount - cost)
      transactions += 1
      currentBalance
    }
    override def withdraw(amount: Double) = {
      val cost = if (transactions < 3) 0 else 1
      super.withdraw(amount + cost)
      transactions += 1
      currentBalance
    }
    
  }


}
