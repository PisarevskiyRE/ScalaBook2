package chapter3

object Task0310 extends App {


  java.util.TimeZone.getAvailableIDs.filter(x => x.startsWith("America")).map(x => x.stripPrefix("America/")).sorted.foreach(println)



}
