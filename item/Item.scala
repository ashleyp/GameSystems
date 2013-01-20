package item

abstract class Item(name: String, value: Float) {

  def getName()  : String = return name 
  def getValue() : Float  = return value

  def toString() : String;

}
