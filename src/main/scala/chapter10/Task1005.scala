package chapter10

import java.awt.Point
import java.beans.{PropertyChangeEvent, PropertyChangeListener}

import scala.collection.mutable.{HashMap, MultiMap, Set}

object Task1005 extends App {

  trait PropertyChangeTemplate {
    private val KEY_ALL = "%ALL%"
    private val map = new HashMap[String,Set[PropertyChangeListener]] with MultiMap[String,PropertyChangeListener]

    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = {
      map.addBinding(KEY_ALL, listener)
    }

    def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit = {
      map.addBinding(propertyName, listener)
    }

    def firePropertyChange(propertyName: String, oldValue: Any, newValue: Any): Unit = {
      if (oldValue != newValue)
        firePropertyChange(new PropertyChangeEvent(this, propertyName, oldValue, newValue))
    }

    def firePropertyChange(event: PropertyChangeEvent): Unit = {
      val key = event.getPropertyName
      map.get(key) match {
        case None =>
        case Some(listeners) => listeners.foreach(_.propertyChange(event))
      }
    }
  }
  val observablePoint = new Point(3,4) with PropertyChangeTemplate {
    override def setLocation(x: Int, y: Int): Unit = {
      val oldX = this.x
      val oldY = this.y
      super.setLocation(x, y)
      firePropertyChange("x", oldX, this.x)
      firePropertyChange("y", oldY, this.y)
    }
  }
  observablePoint.addPropertyChangeListener("x", new PropertyChangeListener {
    override def propertyChange(evt: PropertyChangeEvent) = println(evt)
  })
  observablePoint.setLocation(4, 5)


}
