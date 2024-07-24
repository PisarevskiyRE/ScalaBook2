package chapter6

object Task0602 extends App {


  abstract class UnitConversion{
    def apply(value: Double): Double
  }

  object InchesToCentimeters extends UnitConversion {
    override def apply(value: Double): Double = value * 2.54
  }

  object gallonsToLiters extends UnitConversion {
    override def apply(value: Double): Double = value * 3.78541
  }

  object milesToKilometers extends UnitConversion {
    override def apply(value: Double): Double = value * 1.60934
  }

}
