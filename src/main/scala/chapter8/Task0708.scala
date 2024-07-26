package chapter8

object Task0808 extends App {

  class Person(val name: String) {
    override def toString = s"${getClass.getName}[name=$name]"
  }


  class SecretAgent(codename: String) extends Person(codename) {
    override val name = "secret" // Скрыть имя ...
    override val toString = "secret" // ... и имя класса
  }

}
