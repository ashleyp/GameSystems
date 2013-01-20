package character

import item.Weapon
import item.Armor

abstract class Character(name: String, base_stats: Map[String, Int], armor: Map[String, Armor], weapon: Weapon) {

  def toString() : String

}
