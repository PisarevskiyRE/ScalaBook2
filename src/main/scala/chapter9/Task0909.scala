package chapter9

import java.nio.file.{Files, Paths}
import scala.io.Source


object Task0909 extends App {

  val dirName = "~/scala/IdeaProjects/first"
  val entries = Files.walk(Paths.get(dirName))
  try {
    val count = entries.filter(_.endsWith(".class")).count()
    println(s"count=$count")
  } finally {
    entries.close()
  }
}
