package character

import item.Weapon
import item.Armor

trait PlayerClass { 

  val weapon: Weapon 
  val armor: Map[String, Armor]
  val base_stats: Map[String, Int]

}
