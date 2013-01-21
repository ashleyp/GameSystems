package character

import item.Weapon
import item.Armor

import character.player.Inventory

trait PlayerClass { 

  val weapon: Weapon 
  val armor: Map[String, Armor]
  val base_stats: Map[String, Int]
  val startInventory: Inventory

  val hpMultiplier: Int

}
