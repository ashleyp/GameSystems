package character

import item.Weapon
import item.Armor

class Player(name: String, base_stats: Map[String, Int], armor: Map[String, Armor], weapon: Weapon) extends Character(name, base_stats, armor, weapon) {

  override def toString() : String = "todo"

}
