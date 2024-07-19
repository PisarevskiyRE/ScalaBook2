package chapter3

import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}



object Task11 extends App {

  val smap = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  val flavors = smap.getNativesForFlavor(DataFlavor.imageFlavor)
  for (i <- 0 until flavors.size()) yield flavors.get(i)
}