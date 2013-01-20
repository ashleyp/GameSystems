package item

class Weapon(name: String, value: Float, minimum_damage: Int, maximum_damage: Int) extends Item(name, value) {

  override def toString() : String = { 
    "(Name: " + name  + 
    ", Value: " + value + 
    ", Min Damage: " + minimum_damage + 
    ", Max Damage: " + maximum_damage + ")"
  }

}
