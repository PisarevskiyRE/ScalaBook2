package chapter5

object Tack0510 extends App{

 class Employee {

   var name = "John Q. Public"
   var salary = 0.0

   def this(initialName: String, initialSalary: Double) {
     this()
     name = initialName
     salary = initialSalary
   }
 }

}
