package item

class Potion(name: String, value: Float) extends Item(name, value) {

  override def toString() : String = { 
    "(Name: " + name  + ", Value: " + value + ")"
  }

}
