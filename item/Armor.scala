package item

class Armor(name: String, value: Int, defense: Int, stats: Map[String, Float]) extends Item(name, value) {

  override def toString() : String = { 
    "(Name: " + name  + 
    ", Value: " + value + 
    ", Defense: " + defense + 
    ", Stats: " + stats + ")"
  }

}
