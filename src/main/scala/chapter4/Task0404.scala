package chapter4

import java.io.File

object Task0404 extends App {

  val in = new java.util.Scanner(new File("D:\\!Work\\Scala\\Projects\\ScalaBook2\\src\\main\\resources\\test.txt"))

  var readText = scala.collection.immutable.SortedMap[String, Int]().withDefaultValue(0)


  while (in.hasNext()) {

    val line = in.nextLine().split(" ")

    for(word <- line){
      readText = readText + (word -> (readText(word) +1 ))
    }
  }

  readText.foreach(println)

}
