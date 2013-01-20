package item

class Potion(name: String, value: Float) extends Item(name, value) {

  override def toString() : String = { 
    return "Name: " + name  + "\nValue: " + value
  }

}
