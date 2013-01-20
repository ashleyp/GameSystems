package character

import item.Weapon
import item.Armor

class Enemy(name: String, base_stats: Map[String, Int], armor: Map[String, Armor], weapon: Weapon) extends Character(name, base_stats, armor, weapon) {

  override def toString() : String = {
    "\nName: "   + name +
    "\nBase Stats: "  + base_stats +
    "\nArmor: "  + armor + 
    "\nWeapon: " + weapon
  }

}
